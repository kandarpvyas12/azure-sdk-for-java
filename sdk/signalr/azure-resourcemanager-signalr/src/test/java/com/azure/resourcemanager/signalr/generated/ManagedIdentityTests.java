// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.models.ManagedIdentity;
import com.azure.resourcemanager.signalr.models.ManagedIdentityType;
import com.azure.resourcemanager.signalr.models.UserAssignedIdentityProperty;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ManagedIdentityTests {
    @Test
    public void testDeserialize() {
        ManagedIdentity model =
            BinaryData
                .fromString(
                    "{\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"bhsfxob\":{\"principalId\":\"cqaqtdoqmcbx\",\"clientId\":\"vxysl\"},\"shqjohxcrsbf\":{\"principalId\":\"tkblmpewww\",\"clientId\":\"krvrns\"},\"ybsrfbjfdtwss\":{\"principalId\":\"asrru\",\"clientId\":\"bhsqfsubcgjbirxb\"}},\"principalId\":\"ftpvjzbexil\",\"tenantId\":\"nfqqnvwp\"}")
                .toObject(ManagedIdentity.class);
        Assertions.assertEquals(ManagedIdentityType.USER_ASSIGNED, model.type());
    }

    @Test
    public void testSerialize() {
        ManagedIdentity model =
            new ManagedIdentity()
                .withType(ManagedIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(
                    mapOf(
                        "bhsfxob",
                        new UserAssignedIdentityProperty(),
                        "shqjohxcrsbf",
                        new UserAssignedIdentityProperty(),
                        "ybsrfbjfdtwss",
                        new UserAssignedIdentityProperty()));
        model = BinaryData.fromObject(model).toObject(ManagedIdentity.class);
        Assertions.assertEquals(ManagedIdentityType.USER_ASSIGNED, model.type());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
