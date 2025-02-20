// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.kusto.models.SkuLocationInfoItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Kusto SKU description of given resource type. */
@Immutable
public final class SkuDescriptionInner {
    /*
     * The resource type
     */
    @JsonProperty(value = "resourceType", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceType;

    /*
     * The name of the SKU
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The tier of the SKU
     */
    @JsonProperty(value = "tier", access = JsonProperty.Access.WRITE_ONLY)
    private String tier;

    /*
     * The set of locations that the SKU is available
     */
    @JsonProperty(value = "locations", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> locations;

    /*
     * Locations and zones
     */
    @JsonProperty(value = "locationInfo", access = JsonProperty.Access.WRITE_ONLY)
    private List<SkuLocationInfoItem> locationInfo;

    /*
     * The restrictions because of which SKU cannot be used
     */
    @JsonProperty(value = "restrictions", access = JsonProperty.Access.WRITE_ONLY)
    private List<Object> restrictions;

    /**
     * Get the resourceType property: The resource type.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Get the name property: The name of the SKU.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the tier property: The tier of the SKU.
     *
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Get the locations property: The set of locations that the SKU is available.
     *
     * @return the locations value.
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Get the locationInfo property: Locations and zones.
     *
     * @return the locationInfo value.
     */
    public List<SkuLocationInfoItem> locationInfo() {
        return this.locationInfo;
    }

    /**
     * Get the restrictions property: The restrictions because of which SKU cannot be used.
     *
     * @return the restrictions value.
     */
    public List<Object> restrictions() {
        return this.restrictions;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (locationInfo() != null) {
            locationInfo().forEach(e -> e.validate());
        }
    }
}
