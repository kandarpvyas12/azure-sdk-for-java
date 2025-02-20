// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.resourcemanager.security.fluent.models.AlertInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of Alert. */
public interface Alert {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the version property: Schema version.
     *
     * @return the version value.
     */
    String version();

    /**
     * Gets the alertType property: Unique identifier for the detection logic (all alert instances from the same
     * detection logic will have the same alertType).
     *
     * @return the alertType value.
     */
    String alertType();

    /**
     * Gets the systemAlertId property: Unique identifier for the alert.
     *
     * @return the systemAlertId value.
     */
    String systemAlertId();

    /**
     * Gets the productComponentName property: The name of Azure Security Center pricing tier which powering this alert.
     * Learn more: https://docs.microsoft.com/en-us/azure/security-center/security-center-pricing.
     *
     * @return the productComponentName value.
     */
    String productComponentName();

    /**
     * Gets the alertDisplayName property: The display name of the alert.
     *
     * @return the alertDisplayName value.
     */
    String alertDisplayName();

    /**
     * Gets the description property: Description of the suspicious activity that was detected.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the severity property: The risk level of the threat that was detected. Learn more:
     * https://docs.microsoft.com/en-us/azure/security-center/security-center-alerts-overview#how-are-alerts-classified.
     *
     * @return the severity value.
     */
    AlertSeverity severity();

    /**
     * Gets the intent property: The kill chain related intent behind the alert. For list of supported values, and
     * explanations of Azure Security Center's supported kill chain intents.
     *
     * @return the intent value.
     */
    Intent intent();

    /**
     * Gets the startTimeUtc property: The UTC time of the first event or activity included in the alert in ISO8601
     * format.
     *
     * @return the startTimeUtc value.
     */
    OffsetDateTime startTimeUtc();

    /**
     * Gets the endTimeUtc property: The UTC time of the last event or activity included in the alert in ISO8601 format.
     *
     * @return the endTimeUtc value.
     */
    OffsetDateTime endTimeUtc();

    /**
     * Gets the resourceIdentifiers property: The resource identifiers that can be used to direct the alert to the right
     * product exposure group (tenant, workspace, subscription etc.). There can be multiple identifiers of different
     * type per alert.
     *
     * @return the resourceIdentifiers value.
     */
    List<ResourceIdentifier> resourceIdentifiers();

    /**
     * Gets the remediationSteps property: Manual action items to take to remediate the alert.
     *
     * @return the remediationSteps value.
     */
    List<String> remediationSteps();

    /**
     * Gets the vendorName property: The name of the vendor that raises the alert.
     *
     * @return the vendorName value.
     */
    String vendorName();

    /**
     * Gets the status property: The life cycle status of the alert.
     *
     * @return the status value.
     */
    AlertStatus status();

    /**
     * Gets the extendedLinks property: Links related to the alert.
     *
     * @return the extendedLinks value.
     */
    List<Map<String, String>> extendedLinks();

    /**
     * Gets the alertUri property: A direct link to the alert page in Azure Portal.
     *
     * @return the alertUri value.
     */
    String alertUri();

    /**
     * Gets the timeGeneratedUtc property: The UTC time the alert was generated in ISO8601 format.
     *
     * @return the timeGeneratedUtc value.
     */
    OffsetDateTime timeGeneratedUtc();

    /**
     * Gets the productName property: The name of the product which published this alert (Azure Security Center, Azure
     * ATP, Microsoft Defender ATP, O365 ATP, MCAS, and so on).
     *
     * @return the productName value.
     */
    String productName();

    /**
     * Gets the processingEndTimeUtc property: The UTC processing end time of the alert in ISO8601 format.
     *
     * @return the processingEndTimeUtc value.
     */
    OffsetDateTime processingEndTimeUtc();

    /**
     * Gets the entities property: A list of entities related to the alert.
     *
     * @return the entities value.
     */
    List<AlertEntity> entities();

    /**
     * Gets the isIncident property: This field determines whether the alert is an incident (a compound grouping of
     * several alerts) or a single alert.
     *
     * @return the isIncident value.
     */
    Boolean isIncident();

    /**
     * Gets the correlationKey property: Key for corelating related alerts. Alerts with the same correlation key
     * considered to be related.
     *
     * @return the correlationKey value.
     */
    String correlationKey();

    /**
     * Gets the extendedProperties property: Custom properties for the alert.
     *
     * @return the extendedProperties value.
     */
    Map<String, String> extendedProperties();

    /**
     * Gets the compromisedEntity property: The display name of the resource most related to this alert.
     *
     * @return the compromisedEntity value.
     */
    String compromisedEntity();

    /**
     * Gets the techniques property: kill chain related techniques behind the alert.
     *
     * @return the techniques value.
     */
    List<String> techniques();

    /**
     * Gets the subTechniques property: Kill chain related sub-techniques behind the alert.
     *
     * @return the subTechniques value.
     */
    List<String> subTechniques();

    /**
     * Gets the supportingEvidence property: Changing set of properties depending on the supportingEvidence type.
     *
     * @return the supportingEvidence value.
     */
    AlertPropertiesSupportingEvidence supportingEvidence();

    /**
     * Gets the inner com.azure.resourcemanager.security.fluent.models.AlertInner object.
     *
     * @return the inner object.
     */
    AlertInner innerModel();
}
