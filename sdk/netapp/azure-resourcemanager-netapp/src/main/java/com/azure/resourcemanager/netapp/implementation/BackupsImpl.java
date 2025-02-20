// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.netapp.fluent.BackupsClient;
import com.azure.resourcemanager.netapp.fluent.models.BackupInner;
import com.azure.resourcemanager.netapp.fluent.models.BackupStatusInner;
import com.azure.resourcemanager.netapp.fluent.models.RestoreStatusInner;
import com.azure.resourcemanager.netapp.models.Backup;
import com.azure.resourcemanager.netapp.models.BackupStatus;
import com.azure.resourcemanager.netapp.models.Backups;
import com.azure.resourcemanager.netapp.models.RestoreStatus;

public final class BackupsImpl implements Backups {
    private static final ClientLogger LOGGER = new ClientLogger(BackupsImpl.class);

    private final BackupsClient innerClient;

    private final com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager;

    public BackupsImpl(BackupsClient innerClient, com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public BackupStatus getStatus(String resourceGroupName, String accountName, String poolName, String volumeName) {
        BackupStatusInner inner = this.serviceClient().getStatus(resourceGroupName, accountName, poolName, volumeName);
        if (inner != null) {
            return new BackupStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<BackupStatus> getStatusWithResponse(
        String resourceGroupName, String accountName, String poolName, String volumeName, Context context) {
        Response<BackupStatusInner> inner =
            this.serviceClient().getStatusWithResponse(resourceGroupName, accountName, poolName, volumeName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BackupStatusImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RestoreStatus getVolumeRestoreStatus(
        String resourceGroupName, String accountName, String poolName, String volumeName) {
        RestoreStatusInner inner =
            this.serviceClient().getVolumeRestoreStatus(resourceGroupName, accountName, poolName, volumeName);
        if (inner != null) {
            return new RestoreStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RestoreStatus> getVolumeRestoreStatusWithResponse(
        String resourceGroupName, String accountName, String poolName, String volumeName, Context context) {
        Response<RestoreStatusInner> inner =
            this
                .serviceClient()
                .getVolumeRestoreStatusWithResponse(resourceGroupName, accountName, poolName, volumeName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RestoreStatusImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<Backup> list(
        String resourceGroupName, String accountName, String poolName, String volumeName) {
        PagedIterable<BackupInner> inner =
            this.serviceClient().list(resourceGroupName, accountName, poolName, volumeName);
        return Utils.mapPage(inner, inner1 -> new BackupImpl(inner1, this.manager()));
    }

    public PagedIterable<Backup> list(
        String resourceGroupName, String accountName, String poolName, String volumeName, Context context) {
        PagedIterable<BackupInner> inner =
            this.serviceClient().list(resourceGroupName, accountName, poolName, volumeName, context);
        return Utils.mapPage(inner, inner1 -> new BackupImpl(inner1, this.manager()));
    }

    public Backup get(
        String resourceGroupName, String accountName, String poolName, String volumeName, String backupName) {
        BackupInner inner = this.serviceClient().get(resourceGroupName, accountName, poolName, volumeName, backupName);
        if (inner != null) {
            return new BackupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Backup> getWithResponse(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String backupName,
        Context context) {
        Response<BackupInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, accountName, poolName, volumeName, backupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BackupImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(
        String resourceGroupName, String accountName, String poolName, String volumeName, String backupName) {
        this.serviceClient().delete(resourceGroupName, accountName, poolName, volumeName, backupName);
    }

    public void delete(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String backupName,
        Context context) {
        this.serviceClient().delete(resourceGroupName, accountName, poolName, volumeName, backupName, context);
    }

    public Backup getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String poolName = Utils.getValueFromIdByName(id, "capacityPools");
        if (poolName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'capacityPools'.", id)));
        }
        String volumeName = Utils.getValueFromIdByName(id, "volumes");
        if (volumeName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'volumes'.", id)));
        }
        String backupName = Utils.getValueFromIdByName(id, "backups");
        if (backupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'backups'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, accountName, poolName, volumeName, backupName, Context.NONE)
            .getValue();
    }

    public Response<Backup> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String poolName = Utils.getValueFromIdByName(id, "capacityPools");
        if (poolName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'capacityPools'.", id)));
        }
        String volumeName = Utils.getValueFromIdByName(id, "volumes");
        if (volumeName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'volumes'.", id)));
        }
        String backupName = Utils.getValueFromIdByName(id, "backups");
        if (backupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'backups'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, poolName, volumeName, backupName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String poolName = Utils.getValueFromIdByName(id, "capacityPools");
        if (poolName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'capacityPools'.", id)));
        }
        String volumeName = Utils.getValueFromIdByName(id, "volumes");
        if (volumeName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'volumes'.", id)));
        }
        String backupName = Utils.getValueFromIdByName(id, "backups");
        if (backupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'backups'.", id)));
        }
        this.delete(resourceGroupName, accountName, poolName, volumeName, backupName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String poolName = Utils.getValueFromIdByName(id, "capacityPools");
        if (poolName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'capacityPools'.", id)));
        }
        String volumeName = Utils.getValueFromIdByName(id, "volumes");
        if (volumeName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'volumes'.", id)));
        }
        String backupName = Utils.getValueFromIdByName(id, "backups");
        if (backupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'backups'.", id)));
        }
        this.delete(resourceGroupName, accountName, poolName, volumeName, backupName, context);
    }

    private BackupsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.netapp.NetAppFilesManager manager() {
        return this.serviceManager;
    }

    public BackupImpl define(String name) {
        return new BackupImpl(name, this.manager());
    }
}
