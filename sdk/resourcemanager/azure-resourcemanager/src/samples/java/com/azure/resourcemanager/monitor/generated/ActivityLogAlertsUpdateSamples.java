// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.models.AlertRulePatchObject;
import java.util.HashMap;
import java.util.Map;

/** Samples for ActivityLogAlerts Update. */
public final class ActivityLogAlertsUpdateSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/stable/2020-10-01/examples/ActivityLogAlertRule_Update.json
     */
    /**
     * Sample code: Patch an Activity Log Alert rule.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void patchAnActivityLogAlertRule(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .diagnosticSettings()
            .manager()
            .serviceClient()
            .getActivityLogAlerts()
            .updateWithResponse(
                "MyResourceGroup",
                "SampleActivityLogAlertRule",
                new AlertRulePatchObject().withTags(mapOf("key1", "value1", "key2", "value2")).withEnabled(false),
                Context.NONE);
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
