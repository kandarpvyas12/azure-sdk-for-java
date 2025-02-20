// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.formrecognizer.documentanalysis.administration.models;

import com.azure.ai.formrecognizer.documentanalysis.implementation.util.ResourceDetailsHelper;
import com.azure.core.annotation.Immutable;

/**
 * The ResourceDetails model.
 */
@Immutable
public final class ResourceDetails {

    /*
     * The current count of built document analysis models.
     */
    private int customDocumentModelCount;

    /*
     * Max number of models that can be built for this account.
     */
    private int customDocumentModelLimit;

    /**
     * Get the current count of built document analysis models
     *
     * @return the count value.
     */
    public int getCustomDocumentModelCount() {
        return this.customDocumentModelCount;
    }

    /**
     * Get the max number of models that can be built for this account.
     *
     * @return the limit value.
     */
    public int getCustomDocumentModelLimit() {
        return this.customDocumentModelLimit;
    }

    private void setCustomDocumentModelCount(int customDocumentModelCount) {
        this.customDocumentModelCount = customDocumentModelCount;
    }

    private void setCustomDocumentModelLimit(int customDocumentModelLimit) {
        this.customDocumentModelLimit = customDocumentModelLimit;
    }

    static {
        ResourceDetailsHelper.setAccessor(new ResourceDetailsHelper.ResourceDetailsAccessor() {
            @Override
            public void setDocumentModelCount(
                ResourceDetails resourceDetails, int documentModelCount) {
                resourceDetails.setCustomDocumentModelCount(documentModelCount);
            }

            @Override
            public void setDocumentModelLimit(
                ResourceDetails resourceDetails, int documentModelLimit) {
                resourceDetails.setCustomDocumentModelLimit(documentModelLimit);
            }
        });
    }
}
