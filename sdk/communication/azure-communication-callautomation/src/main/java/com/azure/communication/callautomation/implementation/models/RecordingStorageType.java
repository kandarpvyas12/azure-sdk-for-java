// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RecordingStorageType. */
public final class RecordingStorageType extends ExpandableStringEnum<RecordingStorageType> {
    /** Static value acs for RecordingStorageType. */
    public static final RecordingStorageType ACS = fromString("acs");

    /** Static value azureBlob for RecordingStorageType. */
    public static final RecordingStorageType AZURE_BLOB = fromString("azureBlob");

    /**
     * Creates or finds a RecordingStorageType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RecordingStorageType.
     */
    @JsonCreator
    public static RecordingStorageType fromString(String name) {
        return fromString(name, RecordingStorageType.class);
    }

    /** @return known RecordingStorageType values. */
    public static Collection<RecordingStorageType> values() {
        return values(RecordingStorageType.class);
    }
}
