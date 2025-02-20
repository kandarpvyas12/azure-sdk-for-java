// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.loganalytics.fluent.models.TableInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list tables operation response. */
@Fluent
public final class TablesListResult {
    /*
     * A list of data tables.
     */
    @JsonProperty(value = "value")
    private List<TableInner> value;

    /**
     * Get the value property: A list of data tables.
     *
     * @return the value value.
     */
    public List<TableInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of data tables.
     *
     * @param value the value value to set.
     * @return the TablesListResult object itself.
     */
    public TablesListResult withValue(List<TableInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
