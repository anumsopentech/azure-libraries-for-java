/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;

import java.util.UUID;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The service objectives capability.
 */
public class ServiceLevelObjectiveCapability {
    /**
     * The unique ID of the service objective.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private UUID id;

    /**
     * The service objective name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The list of supported maximum database sizes for this service objective.
     */
    @JsonProperty(value = "supportedMaxSizes", access = JsonProperty.Access.WRITE_ONLY)
    private List<MaxSizeCapability> supportedMaxSizes;

    /**
     * The performance level of the service objective capability.
     */
    @JsonProperty(value = "performanceLevel", access = JsonProperty.Access.WRITE_ONLY)
    private PerformanceLevelCapability performanceLevel;

    /**
     * The included (free) max size for this service level objective.
     */
    @JsonProperty(value = "includedMaxSize", access = JsonProperty.Access.WRITE_ONLY)
    private MaxSizeCapability includedMaxSize;

    /**
     * The status of the capability. Possible values include: 'Visible',
     * 'Available', 'Default', 'Disabled'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private CapabilityStatus status;

    /**
     * The reason for the capability not being available.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public UUID id() {
        return this.id;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the supportedMaxSizes value.
     *
     * @return the supportedMaxSizes value
     */
    public List<MaxSizeCapability> supportedMaxSizes() {
        return this.supportedMaxSizes;
    }

    /**
     * Get the performanceLevel value.
     *
     * @return the performanceLevel value
     */
    public PerformanceLevelCapability performanceLevel() {
        return this.performanceLevel;
    }

    /**
     * Get the includedMaxSize value.
     *
     * @return the includedMaxSize value
     */
    public MaxSizeCapability includedMaxSize() {
        return this.includedMaxSize;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public CapabilityStatus status() {
        return this.status;
    }

    /**
     * Get the reason value.
     *
     * @return the reason value
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason value.
     *
     * @param reason the reason value to set
     * @return the ServiceLevelObjectiveCapability object itself.
     */
    public ServiceLevelObjectiveCapability withReason(String reason) {
        this.reason = reason;
        return this;
    }

}
