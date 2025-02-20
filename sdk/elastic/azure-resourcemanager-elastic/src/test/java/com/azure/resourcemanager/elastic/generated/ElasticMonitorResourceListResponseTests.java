// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elastic.fluent.models.ElasticMonitorResourceInner;
import com.azure.resourcemanager.elastic.models.ElasticMonitorResourceListResponse;
import com.azure.resourcemanager.elastic.models.IdentityProperties;
import com.azure.resourcemanager.elastic.models.ManagedIdentityTypes;
import com.azure.resourcemanager.elastic.models.MonitorProperties;
import com.azure.resourcemanager.elastic.models.MonitoringStatus;
import com.azure.resourcemanager.elastic.models.ProvisioningState;
import com.azure.resourcemanager.elastic.models.ResourceSku;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ElasticMonitorResourceListResponseTests {
    @Test
    public void testDeserialize() {
        ElasticMonitorResourceListResponse model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"sku\":{\"name\":\"yrtih\"},\"properties\":{\"provisioningState\":\"Succeeded\",\"monitoringStatus\":\"Enabled\",\"version\":\"gnwzsymglzufc\",\"liftrResourceCategory\":\"Unknown\",\"liftrResourcePreference\":1760407196},\"identity\":{\"principalId\":\"ihanuf\",\"tenantId\":\"cbjy\",\"type\":\"SystemAssigned\"},\"location\":\"th\",\"tags\":{\"npqxuh\":\"abifpikxwczbys\"},\"id\":\"vyq\",\"name\":\"iwbybrkxvdumjg\",\"type\":\"tfwvukxgaudc\"},{\"sku\":{\"name\":\"nhsjcnyej\"},\"properties\":{\"provisioningState\":\"Canceled\",\"monitoringStatus\":\"Disabled\",\"version\":\"czwlokjyem\",\"liftrResourceCategory\":\"Unknown\",\"liftrResourcePreference\":1373520670},\"identity\":{\"principalId\":\"oxzjnchgejspod\",\"tenantId\":\"ilzyd\",\"type\":\"SystemAssigned\"},\"location\":\"wyahuxinpmqnja\",\"tags\":{\"prozvcputegjvwmf\":\"xj\",\"pjhulsuuvmkj\":\"atscmd\",\"iodjp\":\"zkrwfn\",\"ryo\":\"lwejdpv\"},\"id\":\"psoacctazakljl\",\"name\":\"hbcryffdfdosyge\",\"type\":\"paojakhmsbzjh\"}],\"nextLink\":\"zevdphlx\"}")
                .toObject(ElasticMonitorResourceListResponse.class);
        Assertions.assertEquals("th", model.value().get(0).location());
        Assertions.assertEquals("abifpikxwczbys", model.value().get(0).tags().get("npqxuh"));
        Assertions.assertEquals("yrtih", model.value().get(0).sku().name());
        Assertions.assertEquals(ProvisioningState.SUCCEEDED, model.value().get(0).properties().provisioningState());
        Assertions.assertEquals(MonitoringStatus.ENABLED, model.value().get(0).properties().monitoringStatus());
        Assertions.assertEquals("gnwzsymglzufc", model.value().get(0).properties().version());
        Assertions.assertEquals(ManagedIdentityTypes.SYSTEM_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("zevdphlx", model.nextLink());
    }

    @Test
    public void testSerialize() {
        ElasticMonitorResourceListResponse model =
            new ElasticMonitorResourceListResponse()
                .withValue(
                    Arrays
                        .asList(
                            new ElasticMonitorResourceInner()
                                .withLocation("th")
                                .withTags(mapOf("npqxuh", "abifpikxwczbys"))
                                .withSku(new ResourceSku().withName("yrtih"))
                                .withProperties(
                                    new MonitorProperties()
                                        .withProvisioningState(ProvisioningState.SUCCEEDED)
                                        .withMonitoringStatus(MonitoringStatus.ENABLED)
                                        .withVersion("gnwzsymglzufc"))
                                .withIdentity(new IdentityProperties().withType(ManagedIdentityTypes.SYSTEM_ASSIGNED)),
                            new ElasticMonitorResourceInner()
                                .withLocation("wyahuxinpmqnja")
                                .withTags(
                                    mapOf(
                                        "prozvcputegjvwmf",
                                        "xj",
                                        "pjhulsuuvmkj",
                                        "atscmd",
                                        "iodjp",
                                        "zkrwfn",
                                        "ryo",
                                        "lwejdpv"))
                                .withSku(new ResourceSku().withName("nhsjcnyej"))
                                .withProperties(
                                    new MonitorProperties()
                                        .withProvisioningState(ProvisioningState.CANCELED)
                                        .withMonitoringStatus(MonitoringStatus.DISABLED)
                                        .withVersion("czwlokjyem"))
                                .withIdentity(new IdentityProperties().withType(ManagedIdentityTypes.SYSTEM_ASSIGNED))))
                .withNextLink("zevdphlx");
        model = BinaryData.fromObject(model).toObject(ElasticMonitorResourceListResponse.class);
        Assertions.assertEquals("th", model.value().get(0).location());
        Assertions.assertEquals("abifpikxwczbys", model.value().get(0).tags().get("npqxuh"));
        Assertions.assertEquals("yrtih", model.value().get(0).sku().name());
        Assertions.assertEquals(ProvisioningState.SUCCEEDED, model.value().get(0).properties().provisioningState());
        Assertions.assertEquals(MonitoringStatus.ENABLED, model.value().get(0).properties().monitoringStatus());
        Assertions.assertEquals("gnwzsymglzufc", model.value().get(0).properties().version());
        Assertions.assertEquals(ManagedIdentityTypes.SYSTEM_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("zevdphlx", model.nextLink());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
