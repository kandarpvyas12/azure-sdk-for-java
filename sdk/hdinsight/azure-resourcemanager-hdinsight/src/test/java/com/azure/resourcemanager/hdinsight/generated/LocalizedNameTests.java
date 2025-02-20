// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.models.LocalizedName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class LocalizedNameTests {
    @Test
    public void testDeserialize() {
        LocalizedName model =
            BinaryData
                .fromString("{\"value\":\"n\",\"localizedValue\":\"xqugjhkycubedd\"}")
                .toObject(LocalizedName.class);
        Assertions.assertEquals("n", model.value());
        Assertions.assertEquals("xqugjhkycubedd", model.localizedValue());
    }

    @Test
    public void testSerialize() {
        LocalizedName model = new LocalizedName().withValue("n").withLocalizedValue("xqugjhkycubedd");
        model = BinaryData.fromObject(model).toObject(LocalizedName.class);
        Assertions.assertEquals("n", model.value());
        Assertions.assertEquals("xqugjhkycubedd", model.localizedValue());
    }
}
