// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Specifies the ephemeral disk option for operating system disk. */
public final class DiffDiskOptions extends ExpandableStringEnum<DiffDiskOptions> {
    /** Static value Local for DiffDiskOptions. */
    public static final DiffDiskOptions LOCAL = fromString("Local");

    /**
     * Creates or finds a DiffDiskOptions from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DiffDiskOptions.
     */
    @JsonCreator
    public static DiffDiskOptions fromString(String name) {
        return fromString(name, DiffDiskOptions.class);
    }

    /**
     * Gets known DiffDiskOptions values.
     *
     * @return known DiffDiskOptions values.
     */
    public static Collection<DiffDiskOptions> values() {
        return values(DiffDiskOptions.class);
    }
}
