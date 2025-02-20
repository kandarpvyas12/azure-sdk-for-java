// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.containers.containerregistry.implementation.authentication;

import com.azure.containers.containerregistry.implementation.models.AcrAccessToken;
import com.azure.containers.containerregistry.implementation.models.AcrErrorsException;
import com.azure.containers.containerregistry.implementation.models.AcrRefreshToken;
import com.azure.containers.containerregistry.implementation.models.PostContentSchemaGrantType;
import com.azure.containers.containerregistry.implementation.models.TokenGrantType;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.FormParam;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.serializer.SerializerAdapter;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Authentications. */
public final class AuthenticationsImpl {
    /** The proxy service used to perform REST calls. */
    private final AuthenticationsService service;

    /** Registry login URL. */
    private final String url;

    /**
     * Gets Registry login URL.
     *
     * @return the url value.
     */
    public String getUrl() {
        return this.url;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * Initializes an instance of AccessTokensImpl.
     *
     * @param url the service endpoint.
     * @param httpPipeline the pipeline to use to make the call.
     * @param serializerAdapter the serializer adapter for the rest client.
     *
     */
    public AuthenticationsImpl(String url, String apiVersion, HttpPipeline httpPipeline, SerializerAdapter serializerAdapter) {
        this.service =
            RestProxy.create(AuthenticationsService.class, httpPipeline, serializerAdapter);
        this.url = url;
        this.apiVersion = apiVersion;
    }

    /**
     * The interface defining all the services for AzureContainerRegistryAuthentications to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{url}")
    @ServiceInterface(name = "AzureContainerRegist")
    public interface AuthenticationsService {
        // @Multipart not supported by RestProxy
        @Post("/oauth2/exchange")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(AcrErrorsException.class)
        Mono<Response<AcrRefreshToken>> exchangeAadAccessTokenForAcrRefreshToken(
            @HostParam("url") String url,
            @QueryParam("api-version") String apiVersion,
            @FormParam("grant_type") PostContentSchemaGrantType grantType,
            @FormParam("service") String service,
            @FormParam("tenant") String tenant,
            @FormParam("refresh_token") String refreshToken,
            @FormParam("access_token") String accessToken,
            @HeaderParam("Accept") String accept,
            Context context);

        // @Multipart not supported by RestProxy
        @Post("/oauth2/token")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(AcrErrorsException.class)
        Mono<Response<AcrAccessToken>> exchangeAcrRefreshTokenForAcrAccessToken(
            @HostParam("url") String url,
            @QueryParam("api-version") String apiVersion,
            @FormParam("service") String service,
            @FormParam("scope") String scope,
            @FormParam("refresh_token") String refreshToken,
            @FormParam("grant_type") TokenGrantType grantType,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Exchange AAD tokens for an ACR refresh Token.
     *
     * @param grantType Can take a value of access_token_refresh_token, or access_token, or refresh_token.
     * @param serviceParam Indicates the name of your Azure container registry.
     * @param tenant AAD tenant associated to the AAD credentials.
     * @param refreshToken AAD refresh token, mandatory when grant_type is access_token_refresh_token or refresh_token.
     * @param accessToken AAD access token, mandatory when grant_type is access_token_refresh_token or access_token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AcrErrorsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AcrRefreshToken>> exchangeAadAccessTokenForAcrRefreshTokenWithResponseAsync(
        PostContentSchemaGrantType grantType,
        String serviceParam,
        String tenant,
        String refreshToken,
        String accessToken,
        Context context) {
        final String accept = "application/json";
        return service.exchangeAadAccessTokenForAcrRefreshToken(
            this.getUrl(),
            this.getApiVersion(),
            grantType,
            serviceParam,
            tenant,
            refreshToken,
            accessToken,
            accept,
            context);
    }

    /**
     * Exchange ACR Refresh token for an ACR Access Token.
     *
     * @param serviceParam Indicates the name of your Azure container registry.
     * @param scope Which is expected to be a valid scope, and can be specified more than once for multiple scope
     *     requests. You obtained this from the Www-Authenticate response header from the challenge.
     * @param refreshToken Must be a valid ACR refresh token.
     * @param grantType Grant type is expected to be refresh_token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AcrErrorsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AcrAccessToken>> exchangeAcrRefreshTokenForAcrAccessTokenWithResponseAsync(
        String serviceParam, String scope, String refreshToken, TokenGrantType grantType, Context context) {
        final String accept = "application/json";
        return service.exchangeAcrRefreshTokenForAcrAccessToken(
            this.getUrl(),
            this.getApiVersion(),
            serviceParam,
            scope,
            refreshToken,
            grantType,
            accept,
            context);
    }
}
