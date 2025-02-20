// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.applicationinsights.fluent.models.MyWorkbookInner;
import com.azure.resourcemanager.applicationinsights.models.CategoryType;
import java.util.List;

/** An instance of this class provides access to all the operations defined in MyWorkbooksClient. */
public interface MyWorkbooksClient {
    /**
     * Get all private workbooks defined within a specified resource group and category.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param category Category of workbook to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.ErrorDefinitionException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private workbooks defined within a specified resource group and category as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MyWorkbookInner> listByResourceGroup(String resourceGroupName, CategoryType category);

    /**
     * Get all private workbooks defined within a specified resource group and category.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param category Category of workbook to return.
     * @param tags Tags presents on each workbook returned.
     * @param sourceId Azure Resource Id that will fetch all linked workbooks.
     * @param canFetchContent Flag indicating whether or not to return the full content for each applicable workbook. If
     *     false, only return summary content for workbooks.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.ErrorDefinitionException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private workbooks defined within a specified resource group and category as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MyWorkbookInner> listByResourceGroup(
        String resourceGroupName,
        CategoryType category,
        List<String> tags,
        String sourceId,
        Boolean canFetchContent,
        Context context);

    /**
     * Get all private workbooks defined within a specified subscription and category.
     *
     * @param category Category of workbook to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.ErrorDefinitionException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private workbooks defined within a specified subscription and category as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MyWorkbookInner> list(CategoryType category);

    /**
     * Get all private workbooks defined within a specified subscription and category.
     *
     * @param category Category of workbook to return.
     * @param tags Tags presents on each workbook returned.
     * @param canFetchContent Flag indicating whether or not to return the full content for each applicable workbook. If
     *     false, only return summary content for workbooks.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.ErrorDefinitionException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private workbooks defined within a specified subscription and category as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MyWorkbookInner> list(
        CategoryType category, List<String> tags, Boolean canFetchContent, Context context);

    /**
     * Get a single private workbook by its resourceName.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.ErrorDefinitionException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single private workbook by its resourceName.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MyWorkbookInner getByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Get a single private workbook by its resourceName.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.ErrorDefinitionException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single private workbook by its resourceName along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MyWorkbookInner> getByResourceGroupWithResponse(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Delete a private workbook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.ErrorDefinitionException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String resourceName);

    /**
     * Delete a private workbook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.ErrorDefinitionException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String resourceName, Context context);

    /**
     * Create a new private workbook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param workbookProperties Properties that need to be specified to create a new private workbook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.ErrorDefinitionException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights private workbook definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MyWorkbookInner createOrUpdate(String resourceGroupName, String resourceName, MyWorkbookInner workbookProperties);

    /**
     * Create a new private workbook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param workbookProperties Properties that need to be specified to create a new private workbook.
     * @param sourceId Azure Resource Id that will fetch all linked workbooks.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.ErrorDefinitionException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights private workbook definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MyWorkbookInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String resourceName,
        MyWorkbookInner workbookProperties,
        String sourceId,
        Context context);

    /**
     * Updates a private workbook that has already been added.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param workbookProperties Properties that need to be specified to create a new private workbook.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.ErrorDefinitionException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights private workbook definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MyWorkbookInner update(String resourceGroupName, String resourceName, MyWorkbookInner workbookProperties);

    /**
     * Updates a private workbook that has already been added.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param workbookProperties Properties that need to be specified to create a new private workbook.
     * @param sourceId Azure Resource Id that will fetch all linked workbooks.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.ErrorDefinitionException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights private workbook definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MyWorkbookInner> updateWithResponse(
        String resourceGroupName,
        String resourceName,
        MyWorkbookInner workbookProperties,
        String sourceId,
        Context context);
}
