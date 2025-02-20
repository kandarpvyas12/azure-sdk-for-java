// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Import RDB files into a target database Parameters for a Redis Enterprise import operation. */
@Fluent
public final class ImportClusterParameters {
    /*
     * SAS URIs for the target blobs to import from
     */
    @JsonProperty(value = "sasUris", required = true)
    private List<String> sasUris;

    /**
     * Get the sasUris property: SAS URIs for the target blobs to import from.
     *
     * @return the sasUris value.
     */
    public List<String> sasUris() {
        return this.sasUris;
    }

    /**
     * Set the sasUris property: SAS URIs for the target blobs to import from.
     *
     * @param sasUris the sasUris value to set.
     * @return the ImportClusterParameters object itself.
     */
    public ImportClusterParameters withSasUris(List<String> sasUris) {
        this.sasUris = sasUris;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sasUris() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sasUris in model ImportClusterParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ImportClusterParameters.class);
}
