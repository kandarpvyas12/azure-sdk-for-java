// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.resourcemanager.netapp.models.ApplicationType;
import com.azure.resourcemanager.netapp.models.ServiceLevel;
import com.azure.resourcemanager.netapp.models.VolumeGroupMetadata;
import com.azure.resourcemanager.netapp.models.VolumeGroupVolumeProperties;
import java.util.Arrays;

/** Samples for VolumeGroups Create. */
public final class VolumeGroupsCreateSamples {
    /*
     * x-ms-original-file: specification/netapp/resource-manager/Microsoft.NetApp/stable/2022-05-01/examples/VolumeGroups_Create.json
     */
    /**
     * Sample code: VolumeGroups_Create.
     *
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void volumeGroupsCreate(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager
            .volumeGroups()
            .define("group1")
            .withExistingNetAppAccount("myRG", "account1")
            .withRegion("westus")
            .withGroupMetadata(
                new VolumeGroupMetadata()
                    .withGroupDescription("Volume group")
                    .withApplicationType(ApplicationType.SAP_HANA)
                    .withApplicationIdentifier("DEV")
                    .withDeploymentSpecId("fb04dbeb-005d-2703-197e-6208dfadb5d9"))
            .withVolumes(
                Arrays
                    .asList(
                        new VolumeGroupVolumeProperties()
                            .withName("testVol1")
                            .withCreationToken("testVol1")
                            .withServiceLevel(ServiceLevel.PREMIUM)
                            .withUsageThreshold(107374182400L)
                            .withSubnetId(
                                "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRP/providers/Microsoft.Network/virtualNetworks/testvnet3/subnets/testsubnet3")
                            .withThroughputMibps(10.0F)
                            .withCapacityPoolResourceId(
                                "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1")
                            .withProximityPlacementGroup(
                                "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/cys_sjain_fcp_rg/providers/Microsoft.Compute/proximityPlacementGroups/svlqa_sjain_multivolume_ppg")
                            .withVolumeSpecName("data"),
                        new VolumeGroupVolumeProperties()
                            .withName("testVol2")
                            .withCreationToken("testVol2")
                            .withServiceLevel(ServiceLevel.PREMIUM)
                            .withUsageThreshold(107374182400L)
                            .withSubnetId(
                                "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRP/providers/Microsoft.Network/virtualNetworks/testvnet3/subnets/testsubnet3")
                            .withThroughputMibps(10.0F)
                            .withCapacityPoolResourceId(
                                "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1")
                            .withProximityPlacementGroup(
                                "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/cys_sjain_fcp_rg/providers/Microsoft.Compute/proximityPlacementGroups/svlqa_sjain_multivolume_ppg")
                            .withVolumeSpecName("log"),
                        new VolumeGroupVolumeProperties()
                            .withName("testVol3")
                            .withCreationToken("testVol3")
                            .withServiceLevel(ServiceLevel.PREMIUM)
                            .withUsageThreshold(107374182400L)
                            .withSubnetId(
                                "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRP/providers/Microsoft.Network/virtualNetworks/testvnet3/subnets/testsubnet3")
                            .withThroughputMibps(10.0F)
                            .withCapacityPoolResourceId(
                                "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1")
                            .withProximityPlacementGroup(
                                "/subscriptions/d633cc2e-722b-4ae1-b636-bbd9e4c60ed9/resourceGroups/cys_sjain_fcp_rg/providers/Microsoft.Compute/proximityPlacementGroups/svlqa_sjain_multivolume_ppg")
                            .withVolumeSpecName("shared")))
            .create();
    }
}
