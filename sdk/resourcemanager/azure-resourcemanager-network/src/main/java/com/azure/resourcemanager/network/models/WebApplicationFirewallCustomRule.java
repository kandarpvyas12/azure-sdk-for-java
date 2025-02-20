// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines contents of a web application rule. */
@Fluent
public final class WebApplicationFirewallCustomRule {
    /*
     * The name of the resource that is unique within a policy. This name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Priority of the rule. Rules with a lower value will be evaluated before rules with a higher value.
     */
    @JsonProperty(value = "priority", required = true)
    private int priority;

    /*
     * The rule type.
     */
    @JsonProperty(value = "ruleType", required = true)
    private WebApplicationFirewallRuleType ruleType;

    /*
     * List of match conditions.
     */
    @JsonProperty(value = "matchConditions", required = true)
    private List<MatchCondition> matchConditions;

    /*
     * Type of Actions.
     */
    @JsonProperty(value = "action", required = true)
    private WebApplicationFirewallAction action;

    /** Creates an instance of WebApplicationFirewallCustomRule class. */
    public WebApplicationFirewallCustomRule() {
    }

    /**
     * Get the name property: The name of the resource that is unique within a policy. This name can be used to access
     * the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a policy. This name can be used to access
     * the resource.
     *
     * @param name the name value to set.
     * @return the WebApplicationFirewallCustomRule object itself.
     */
    public WebApplicationFirewallCustomRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the priority property: Priority of the rule. Rules with a lower value will be evaluated before rules with a
     * higher value.
     *
     * @return the priority value.
     */
    public int priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Priority of the rule. Rules with a lower value will be evaluated before rules with a
     * higher value.
     *
     * @param priority the priority value to set.
     * @return the WebApplicationFirewallCustomRule object itself.
     */
    public WebApplicationFirewallCustomRule withPriority(int priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the ruleType property: The rule type.
     *
     * @return the ruleType value.
     */
    public WebApplicationFirewallRuleType ruleType() {
        return this.ruleType;
    }

    /**
     * Set the ruleType property: The rule type.
     *
     * @param ruleType the ruleType value to set.
     * @return the WebApplicationFirewallCustomRule object itself.
     */
    public WebApplicationFirewallCustomRule withRuleType(WebApplicationFirewallRuleType ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * Get the matchConditions property: List of match conditions.
     *
     * @return the matchConditions value.
     */
    public List<MatchCondition> matchConditions() {
        return this.matchConditions;
    }

    /**
     * Set the matchConditions property: List of match conditions.
     *
     * @param matchConditions the matchConditions value to set.
     * @return the WebApplicationFirewallCustomRule object itself.
     */
    public WebApplicationFirewallCustomRule withMatchConditions(List<MatchCondition> matchConditions) {
        this.matchConditions = matchConditions;
        return this;
    }

    /**
     * Get the action property: Type of Actions.
     *
     * @return the action value.
     */
    public WebApplicationFirewallAction action() {
        return this.action;
    }

    /**
     * Set the action property: Type of Actions.
     *
     * @param action the action value to set.
     * @return the WebApplicationFirewallCustomRule object itself.
     */
    public WebApplicationFirewallCustomRule withAction(WebApplicationFirewallAction action) {
        this.action = action;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ruleType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property ruleType in model WebApplicationFirewallCustomRule"));
        }
        if (matchConditions() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property matchConditions in model WebApplicationFirewallCustomRule"));
        } else {
            matchConditions().forEach(e -> e.validate());
        }
        if (action() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property action in model WebApplicationFirewallCustomRule"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WebApplicationFirewallCustomRule.class);
}
