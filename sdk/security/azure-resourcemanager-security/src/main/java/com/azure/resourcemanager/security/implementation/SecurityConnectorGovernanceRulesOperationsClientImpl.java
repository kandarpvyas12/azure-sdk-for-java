// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.security.fluent.SecurityConnectorGovernanceRulesOperationsClient;
import com.azure.resourcemanager.security.fluent.models.GovernanceRuleInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * SecurityConnectorGovernanceRulesOperationsClient.
 */
public final class SecurityConnectorGovernanceRulesOperationsClientImpl
    implements SecurityConnectorGovernanceRulesOperationsClient {
    /** The proxy service used to perform REST calls. */
    private final SecurityConnectorGovernanceRulesOperationsService service;

    /** The service client containing this operation class. */
    private final SecurityCenterImpl client;

    /**
     * Initializes an instance of SecurityConnectorGovernanceRulesOperationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SecurityConnectorGovernanceRulesOperationsClientImpl(SecurityCenterImpl client) {
        this.service =
            RestProxy
                .create(
                    SecurityConnectorGovernanceRulesOperationsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SecurityCenterSecurityConnectorGovernanceRulesOperations to be used
     * by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SecurityCenterSecuri")
    public interface SecurityConnectorGovernanceRulesOperationsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security"
                + "/securityConnectors/{securityConnectorName}/providers/Microsoft.Security/governanceRules/{ruleId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<GovernanceRuleInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("securityConnectorName") String securityConnectorName,
            @PathParam("ruleId") String ruleId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security"
                + "/securityConnectors/{securityConnectorName}/providers/Microsoft.Security/governanceRules/{ruleId}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<GovernanceRuleInner>> createOrUpdate(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("securityConnectorName") String securityConnectorName,
            @PathParam("ruleId") String ruleId,
            @BodyParam("application/json") GovernanceRuleInner governanceRule,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Delete(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security"
                + "/securityConnectors/{securityConnectorName}/providers/Microsoft.Security/governanceRules/{ruleId}")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> delete(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("securityConnectorName") String securityConnectorName,
            @PathParam("ruleId") String ruleId,
            Context context);
    }

    /**
     * Get a specific governanceRule for the requested scope by ruleId.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific governanceRule for the requested scope by ruleId along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<GovernanceRuleInner>> getWithResponseAsync(
        String resourceGroupName, String securityConnectorName, String ruleId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (securityConnectorName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter securityConnectorName is required and cannot be null."));
        }
        if (ruleId == null) {
            return Mono.error(new IllegalArgumentException("Parameter ruleId is required and cannot be null."));
        }
        final String apiVersion = "2022-01-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            securityConnectorName,
                            ruleId,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get a specific governanceRule for the requested scope by ruleId.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific governanceRule for the requested scope by ruleId along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<GovernanceRuleInner>> getWithResponseAsync(
        String resourceGroupName, String securityConnectorName, String ruleId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (securityConnectorName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter securityConnectorName is required and cannot be null."));
        }
        if (ruleId == null) {
            return Mono.error(new IllegalArgumentException("Parameter ruleId is required and cannot be null."));
        }
        final String apiVersion = "2022-01-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                resourceGroupName,
                securityConnectorName,
                ruleId,
                accept,
                context);
    }

    /**
     * Get a specific governanceRule for the requested scope by ruleId.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific governanceRule for the requested scope by ruleId on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<GovernanceRuleInner> getAsync(String resourceGroupName, String securityConnectorName, String ruleId) {
        return getWithResponseAsync(resourceGroupName, securityConnectorName, ruleId)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get a specific governanceRule for the requested scope by ruleId.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific governanceRule for the requested scope by ruleId along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<GovernanceRuleInner> getWithResponse(
        String resourceGroupName, String securityConnectorName, String ruleId, Context context) {
        return getWithResponseAsync(resourceGroupName, securityConnectorName, ruleId, context).block();
    }

    /**
     * Get a specific governanceRule for the requested scope by ruleId.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific governanceRule for the requested scope by ruleId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GovernanceRuleInner get(String resourceGroupName, String securityConnectorName, String ruleId) {
        return getWithResponse(resourceGroupName, securityConnectorName, ruleId, Context.NONE).getValue();
    }

    /**
     * Creates or update a security GovernanceRule on the given security connector.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param governanceRule GovernanceRule over a subscription scope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security GovernanceRule over a given scope along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<GovernanceRuleInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String securityConnectorName, String ruleId, GovernanceRuleInner governanceRule) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (securityConnectorName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter securityConnectorName is required and cannot be null."));
        }
        if (ruleId == null) {
            return Mono.error(new IllegalArgumentException("Parameter ruleId is required and cannot be null."));
        }
        if (governanceRule == null) {
            return Mono.error(new IllegalArgumentException("Parameter governanceRule is required and cannot be null."));
        } else {
            governanceRule.validate();
        }
        final String apiVersion = "2022-01-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .createOrUpdate(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            securityConnectorName,
                            ruleId,
                            governanceRule,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Creates or update a security GovernanceRule on the given security connector.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param governanceRule GovernanceRule over a subscription scope.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security GovernanceRule over a given scope along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<GovernanceRuleInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String securityConnectorName,
        String ruleId,
        GovernanceRuleInner governanceRule,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (securityConnectorName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter securityConnectorName is required and cannot be null."));
        }
        if (ruleId == null) {
            return Mono.error(new IllegalArgumentException("Parameter ruleId is required and cannot be null."));
        }
        if (governanceRule == null) {
            return Mono.error(new IllegalArgumentException("Parameter governanceRule is required and cannot be null."));
        } else {
            governanceRule.validate();
        }
        final String apiVersion = "2022-01-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .createOrUpdate(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                resourceGroupName,
                securityConnectorName,
                ruleId,
                governanceRule,
                accept,
                context);
    }

    /**
     * Creates or update a security GovernanceRule on the given security connector.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param governanceRule GovernanceRule over a subscription scope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security GovernanceRule over a given scope on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<GovernanceRuleInner> createOrUpdateAsync(
        String resourceGroupName, String securityConnectorName, String ruleId, GovernanceRuleInner governanceRule) {
        return createOrUpdateWithResponseAsync(resourceGroupName, securityConnectorName, ruleId, governanceRule)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Creates or update a security GovernanceRule on the given security connector.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param governanceRule GovernanceRule over a subscription scope.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security GovernanceRule over a given scope along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<GovernanceRuleInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String securityConnectorName,
        String ruleId,
        GovernanceRuleInner governanceRule,
        Context context) {
        return createOrUpdateWithResponseAsync(
                resourceGroupName, securityConnectorName, ruleId, governanceRule, context)
            .block();
    }

    /**
     * Creates or update a security GovernanceRule on the given security connector.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param governanceRule GovernanceRule over a subscription scope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security GovernanceRule over a given scope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GovernanceRuleInner createOrUpdate(
        String resourceGroupName, String securityConnectorName, String ruleId, GovernanceRuleInner governanceRule) {
        return createOrUpdateWithResponse(
                resourceGroupName, securityConnectorName, ruleId, governanceRule, Context.NONE)
            .getValue();
    }

    /**
     * Delete a GovernanceRule over a given scope.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName, String securityConnectorName, String ruleId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (securityConnectorName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter securityConnectorName is required and cannot be null."));
        }
        if (ruleId == null) {
            return Mono.error(new IllegalArgumentException("Parameter ruleId is required and cannot be null."));
        }
        final String apiVersion = "2022-01-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .delete(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            securityConnectorName,
                            ruleId,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Delete a GovernanceRule over a given scope.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName, String securityConnectorName, String ruleId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (securityConnectorName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter securityConnectorName is required and cannot be null."));
        }
        if (ruleId == null) {
            return Mono.error(new IllegalArgumentException("Parameter ruleId is required and cannot be null."));
        }
        final String apiVersion = "2022-01-01-preview";
        context = this.client.mergeContext(context);
        return service
            .delete(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                resourceGroupName,
                securityConnectorName,
                ruleId,
                context);
    }

    /**
     * Delete a GovernanceRule over a given scope.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> deleteAsync(String resourceGroupName, String securityConnectorName, String ruleId) {
        return deleteWithResponseAsync(resourceGroupName, securityConnectorName, ruleId)
            .flatMap(ignored -> Mono.empty());
    }

    /**
     * Delete a GovernanceRule over a given scope.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(
        String resourceGroupName, String securityConnectorName, String ruleId, Context context) {
        return deleteWithResponseAsync(resourceGroupName, securityConnectorName, ruleId, context).block();
    }

    /**
     * Delete a GovernanceRule over a given scope.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String securityConnectorName, String ruleId) {
        deleteWithResponse(resourceGroupName, securityConnectorName, ruleId, Context.NONE);
    }
}
