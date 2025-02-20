// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ConnectionError model. */
@Fluent
public final class ConnectionError {
    /*
     * The kind of connection error that occurred.
     */
    @JsonProperty(value = "connectionState")
    private ConnectionState connectionState;

    /*
     * The IP of host that originated the failed connection.
     */
    @JsonProperty(value = "iPFrom")
    private String iPFrom;

    /*
     * The IP that the connection attempted to reach.
     */
    @JsonProperty(value = "iPTo")
    private String iPTo;

    /*
     * The TCP port the connection was attempted on.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /*
     * Detailed error message about the failed connection.
     */
    @JsonProperty(value = "exception")
    private String exception;

    /**
     * Get the connectionState property: The kind of connection error that occurred.
     *
     * @return the connectionState value.
     */
    public ConnectionState connectionState() {
        return this.connectionState;
    }

    /**
     * Set the connectionState property: The kind of connection error that occurred.
     *
     * @param connectionState the connectionState value to set.
     * @return the ConnectionError object itself.
     */
    public ConnectionError withConnectionState(ConnectionState connectionState) {
        this.connectionState = connectionState;
        return this;
    }

    /**
     * Get the iPFrom property: The IP of host that originated the failed connection.
     *
     * @return the iPFrom value.
     */
    public String iPFrom() {
        return this.iPFrom;
    }

    /**
     * Set the iPFrom property: The IP of host that originated the failed connection.
     *
     * @param iPFrom the iPFrom value to set.
     * @return the ConnectionError object itself.
     */
    public ConnectionError withIPFrom(String iPFrom) {
        this.iPFrom = iPFrom;
        return this;
    }

    /**
     * Get the iPTo property: The IP that the connection attempted to reach.
     *
     * @return the iPTo value.
     */
    public String iPTo() {
        return this.iPTo;
    }

    /**
     * Set the iPTo property: The IP that the connection attempted to reach.
     *
     * @param iPTo the iPTo value to set.
     * @return the ConnectionError object itself.
     */
    public ConnectionError withIPTo(String iPTo) {
        this.iPTo = iPTo;
        return this;
    }

    /**
     * Get the port property: The TCP port the connection was attempted on.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: The TCP port the connection was attempted on.
     *
     * @param port the port value to set.
     * @return the ConnectionError object itself.
     */
    public ConnectionError withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the exception property: Detailed error message about the failed connection.
     *
     * @return the exception value.
     */
    public String exception() {
        return this.exception;
    }

    /**
     * Set the exception property: Detailed error message about the failed connection.
     *
     * @param exception the exception value to set.
     * @return the ConnectionError object itself.
     */
    public ConnectionError withException(String exception) {
        this.exception = exception;
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
