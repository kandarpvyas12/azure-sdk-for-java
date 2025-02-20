// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.monitor.ingestion;

import com.azure.core.util.serializer.ObjectSerializer;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.monitor.ingestion.models.UploadLogsOptions;
import com.azure.monitor.ingestion.models.UploadLogsResult;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

public class CustomSerializerSample {
    /**
     * Main method to run the sample.
     * @param args ignore args.
     */
    public static void main(String[] args) {
        LogsIngestionClient client = new LogsIngestionClientBuilder()
            .endpoint("<data-collection-endpoint>")
            .credential(new DefaultAzureCredentialBuilder().build())
            .buildClient();

        List<Object> dataList = getLogs();

        ObjectSerializer customSerializer = new CustomLogSerializer();

        UploadLogsOptions options = new UploadLogsOptions()
            .setObjectSerializer(customSerializer);

        UploadLogsResult result = client.upload("<data-collection-rule-id>",
            "<stream-name>",
            dataList,
            options);
        System.out.println(result.getStatus());
    }

    private static List<Object> getLogs() {
        List<Object> logs = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            CustomLogData e = new CustomLogData()
                .setTime(OffsetDateTime.now())
                .setExtendedColumn("extend column data" + i)
                .setAdditionalContext("more logs context");
            logs.add(e);
        }
        return logs;
    }
}
