// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.ScriptProperties;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ScriptPropertiesTests {
    @Test
    public void testDeserialize() {
        ScriptProperties model =
            BinaryData
                .fromString(
                    "{\"scriptUrl\":\"blylpstdbh\",\"scriptUrlSasToken\":\"srzdzucerscdn\",\"scriptContent\":\"evfiwjmygt\",\"forceUpdateTag\":\"slswtm\",\"continueOnErrors\":true,\"provisioningState\":\"Deleting\"}")
                .toObject(ScriptProperties.class);
        Assertions.assertEquals("blylpstdbh", model.scriptUrl());
        Assertions.assertEquals("srzdzucerscdn", model.scriptUrlSasToken());
        Assertions.assertEquals("evfiwjmygt", model.scriptContent());
        Assertions.assertEquals("slswtm", model.forceUpdateTag());
        Assertions.assertEquals(true, model.continueOnErrors());
    }

    @Test
    public void testSerialize() {
        ScriptProperties model =
            new ScriptProperties()
                .withScriptUrl("blylpstdbh")
                .withScriptUrlSasToken("srzdzucerscdn")
                .withScriptContent("evfiwjmygt")
                .withForceUpdateTag("slswtm")
                .withContinueOnErrors(true);
        model = BinaryData.fromObject(model).toObject(ScriptProperties.class);
        Assertions.assertEquals("blylpstdbh", model.scriptUrl());
        Assertions.assertEquals("srzdzucerscdn", model.scriptUrlSasToken());
        Assertions.assertEquals("evfiwjmygt", model.scriptContent());
        Assertions.assertEquals("slswtm", model.forceUpdateTag());
        Assertions.assertEquals(true, model.continueOnErrors());
    }
}
