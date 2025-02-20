// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.digitaltwins.models.GroupIdInformationProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class GroupIdInformationPropertiesTests {
    @Test
    public void testDeserialize() {
        GroupIdInformationProperties model =
            BinaryData
                .fromString(
                    "{\"groupId\":\"yvshxmz\",\"requiredMembers\":[\"zoggigrxwburvjxx\",\"nspydptkoenkoukn\",\"udwtiukbl\"],\"requiredZoneNames\":[\"kpoc\",\"pazyxoegukg\",\"npiucgygevqznty\",\"mrbpizcdrqj\"]}")
                .toObject(GroupIdInformationProperties.class);
        Assertions.assertEquals("yvshxmz", model.groupId());
        Assertions.assertEquals("zoggigrxwburvjxx", model.requiredMembers().get(0));
        Assertions.assertEquals("kpoc", model.requiredZoneNames().get(0));
    }

    @Test
    public void testSerialize() {
        GroupIdInformationProperties model =
            new GroupIdInformationProperties()
                .withGroupId("yvshxmz")
                .withRequiredMembers(Arrays.asList("zoggigrxwburvjxx", "nspydptkoenkoukn", "udwtiukbl"))
                .withRequiredZoneNames(Arrays.asList("kpoc", "pazyxoegukg", "npiucgygevqznty", "mrbpizcdrqj"));
        model = BinaryData.fromObject(model).toObject(GroupIdInformationProperties.class);
        Assertions.assertEquals("yvshxmz", model.groupId());
        Assertions.assertEquals("zoggigrxwburvjxx", model.requiredMembers().get(0));
        Assertions.assertEquals("kpoc", model.requiredZoneNames().get(0));
    }
}
