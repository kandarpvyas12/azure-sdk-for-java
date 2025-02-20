// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.keyvault.certificates;

import com.azure.data.appconfiguration.ConfigurationClientBuilder;
import com.azure.security.keyvault.certificates.CertificateAsyncClient;
import com.azure.security.keyvault.certificates.CertificateClient;
import com.azure.security.keyvault.certificates.CertificateClientBuilder;
import com.azure.security.keyvault.certificates.CertificateServiceVersion;
import com.azure.spring.cloud.autoconfigure.AbstractAzureServiceConfigurationTests;
import com.azure.spring.cloud.autoconfigure.TestBuilderCustomizer;
import com.azure.spring.cloud.autoconfigure.context.AzureGlobalPropertiesAutoConfiguration;
import com.azure.spring.cloud.autoconfigure.implementation.keyvault.certificates.properties.AzureKeyVaultCertificateProperties;
import com.azure.spring.cloud.service.implementation.keyvault.certificates.CertificateClientBuilderFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.FilteredClassLoader;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AzureKeyVaultCertificateAutoConfigurationTests extends AbstractAzureServiceConfigurationTests<
    CertificateClientBuilderFactory, AzureKeyVaultCertificateProperties> {
    private static final String ENDPOINT = "https:/%s.vault.azure.net/";

    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner()
        .withConfiguration(AutoConfigurations.of(AzureKeyVaultCertificateAutoConfiguration.class,
            AzureGlobalPropertiesAutoConfiguration.class));

    @Override
    protected ApplicationContextRunner getMinimalContextRunner() {
        return this.contextRunner
            .withPropertyValues(
                "spring.cloud.azure.keyvault.certificate.endpoint=" + String.format(ENDPOINT, "mykv")
            );
    }

    @Override
    protected String getPropertyPrefix() {
        return AzureKeyVaultCertificateProperties.PREFIX;
    }

    @Override
    protected Class<CertificateClientBuilderFactory> getBuilderFactoryType() {
        return CertificateClientBuilderFactory.class;
    }

    @Override
    protected Class<AzureKeyVaultCertificateProperties> getConfigurationPropertiesType() {
        return AzureKeyVaultCertificateProperties.class;
    }

    @ParameterizedTest
    @ValueSource(strings = { "spring.cloud.azure.keyvault.certificate.endpoint", "spring.cloud.azure.keyvault.endpoint" })
    void withoutCertificateClientBuilderShouldNotConfigure(String endpointProperty) {
        this.contextRunner
            .withClassLoader(new FilteredClassLoader(CertificateClientBuilder.class))
            .withPropertyValues(endpointProperty + "=" + String.format(ENDPOINT, "mykv"))
            .run(context -> assertThat(context).doesNotHaveBean(AzureKeyVaultCertificateAutoConfiguration.class));
    }

    @ParameterizedTest
    @ValueSource(strings = { "spring.cloud.azure.keyvault.certificate.endpoint", "spring.cloud.azure.keyvault.endpoint" })
    void disableKeyVaultCertificateShouldNotConfigure(String endpointProperty) {
        this.contextRunner
            .withPropertyValues(
                "spring.cloud.azure.keyvault.certificate.enabled=false",
                endpointProperty + "=" + String.format(ENDPOINT, "mykv")
            )
            .run(context -> assertThat(context).doesNotHaveBean(AzureKeyVaultCertificateAutoConfiguration.class));
    }

    @ParameterizedTest
    @ValueSource(strings = { "spring.cloud.azure.keyvault.certificate.endpoint", "spring.cloud.azure.keyvault.endpoint" })
    void disableKeyVaultShouldNotConfigure(String endpointProperty) {
        this.contextRunner
            .withPropertyValues(
                "spring.cloud.azure.keyvault.enabled=false",
                endpointProperty + "=" + String.format(ENDPOINT, "mykv")
            )
            .run(context -> assertThat(context).doesNotHaveBean(AzureKeyVaultCertificateAutoConfiguration.class));
    }

    @Test
    void withoutVaultEndpointShouldNotConfigure() {
        this.contextRunner
            .run(context -> assertThat(context).doesNotHaveBean(AzureKeyVaultCertificateAutoConfiguration.class));
    }

    @ParameterizedTest
    @ValueSource(strings = { "spring.cloud.azure.keyvault.certificate.endpoint", "spring.cloud.azure.keyvault.endpoint" })
    void withVaultEndpointShouldConfigure(String endpointProperty) {
        this.contextRunner
            .withPropertyValues(endpointProperty + "=" + String.format(ENDPOINT, "mykv"))
            .run(context -> {
                assertThat(context).hasSingleBean(AzureKeyVaultCertificateAutoConfiguration.class);
                assertThat(context).hasSingleBean(AzureKeyVaultCertificateProperties.class);
                assertThat(context).hasSingleBean(CertificateClient.class);
                assertThat(context).hasSingleBean(CertificateAsyncClient.class);
                assertThat(context).hasSingleBean(CertificateClientBuilder.class);
                assertThat(context).hasSingleBean(CertificateClientBuilderFactory.class);
            });
    }

    @ParameterizedTest
    @ValueSource(strings = { "spring.cloud.azure.keyvault.certificate.endpoint", "spring.cloud.azure.keyvault.endpoint" })
    void customizerShouldBeCalled(String endpointProperty) {
        CertificateBuilderCustomizer customizer = new CertificateBuilderCustomizer();
        this.contextRunner
            .withPropertyValues(endpointProperty + "=" + String.format(ENDPOINT, "mykv"))
            .withBean("customizer1", CertificateBuilderCustomizer.class, () -> customizer)
            .withBean("customizer2", CertificateBuilderCustomizer.class, () -> customizer)
            .run(context -> assertThat(customizer.getCustomizedTimes()).isEqualTo(2));
    }

    @ParameterizedTest
    @ValueSource(strings = { "spring.cloud.azure.keyvault.certificate.endpoint", "spring.cloud.azure.keyvault.endpoint" })
    void otherCustomizerShouldNotBeCalled(String endpointProperty) {
        CertificateBuilderCustomizer customizer = new CertificateBuilderCustomizer();
        OtherBuilderCustomizer otherBuilderCustomizer = new OtherBuilderCustomizer();
        this.contextRunner
            .withPropertyValues(endpointProperty + "=" + String.format(ENDPOINT, "mykv"))
            .withBean("customizer1", CertificateBuilderCustomizer.class, () -> customizer)
            .withBean("customizer2", CertificateBuilderCustomizer.class, () -> customizer)
            .withBean("customizer3", OtherBuilderCustomizer.class, () -> otherBuilderCustomizer)
            .run(context -> {
                assertThat(customizer.getCustomizedTimes()).isEqualTo(2);
                assertThat(otherBuilderCustomizer.getCustomizedTimes()).isEqualTo(0);
            });
    }

    @Test
    void configurationPropertiesShouldBind() {
        String endpoint = String.format(ENDPOINT, "mykv");
        this.contextRunner
            .withPropertyValues(
                "spring.cloud.azure.keyvault.certificate.endpoint=" + endpoint,
                "spring.cloud.azure.keyvault.certificate.service-version=V7_2"
            )
            .run(context -> {
                assertThat(context).hasSingleBean(AzureKeyVaultCertificateProperties.class);
                AzureKeyVaultCertificateProperties properties = context.getBean(AzureKeyVaultCertificateProperties.class);
                assertEquals(endpoint, properties.getEndpoint());
                assertEquals(CertificateServiceVersion.V7_2, properties.getServiceVersion());
            });
    }

    private static class CertificateBuilderCustomizer extends TestBuilderCustomizer<CertificateClientBuilder> {

    }

    private static class OtherBuilderCustomizer extends TestBuilderCustomizer<ConfigurationClientBuilder> {

    }

}
