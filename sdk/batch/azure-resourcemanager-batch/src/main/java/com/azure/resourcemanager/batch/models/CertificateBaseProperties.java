// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Base certificate properties. */
@Fluent
public class CertificateBaseProperties {
    /*
     * The algorithm of the certificate thumbprint.
     *
     * This must match the first portion of the certificate name. Currently required to be 'SHA1'.
     */
    @JsonProperty(value = "thumbprintAlgorithm")
    private String thumbprintAlgorithm;

    /*
     * The thumbprint of the certificate.
     *
     * This must match the thumbprint from the name.
     */
    @JsonProperty(value = "thumbprint")
    private String thumbprint;

    /*
     * The format of the certificate - either Pfx or Cer. If omitted, the default is Pfx.
     */
    @JsonProperty(value = "format")
    private CertificateFormat format;

    /** Creates an instance of CertificateBaseProperties class. */
    public CertificateBaseProperties() {
    }

    /**
     * Get the thumbprintAlgorithm property: The algorithm of the certificate thumbprint.
     *
     * <p>This must match the first portion of the certificate name. Currently required to be 'SHA1'.
     *
     * @return the thumbprintAlgorithm value.
     */
    public String thumbprintAlgorithm() {
        return this.thumbprintAlgorithm;
    }

    /**
     * Set the thumbprintAlgorithm property: The algorithm of the certificate thumbprint.
     *
     * <p>This must match the first portion of the certificate name. Currently required to be 'SHA1'.
     *
     * @param thumbprintAlgorithm the thumbprintAlgorithm value to set.
     * @return the CertificateBaseProperties object itself.
     */
    public CertificateBaseProperties withThumbprintAlgorithm(String thumbprintAlgorithm) {
        this.thumbprintAlgorithm = thumbprintAlgorithm;
        return this;
    }

    /**
     * Get the thumbprint property: The thumbprint of the certificate.
     *
     * <p>This must match the thumbprint from the name.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint property: The thumbprint of the certificate.
     *
     * <p>This must match the thumbprint from the name.
     *
     * @param thumbprint the thumbprint value to set.
     * @return the CertificateBaseProperties object itself.
     */
    public CertificateBaseProperties withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the format property: The format of the certificate - either Pfx or Cer. If omitted, the default is Pfx.
     *
     * @return the format value.
     */
    public CertificateFormat format() {
        return this.format;
    }

    /**
     * Set the format property: The format of the certificate - either Pfx or Cer. If omitted, the default is Pfx.
     *
     * @param format the format value to set.
     * @return the CertificateBaseProperties object itself.
     */
    public CertificateBaseProperties withFormat(CertificateFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
