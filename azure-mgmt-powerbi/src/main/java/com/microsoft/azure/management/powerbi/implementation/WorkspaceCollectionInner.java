/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.powerbi.implementation;

import java.util.Map;
import com.microsoft.azure.management.powerbi.AzureSku;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The WorkspaceCollectionInner model.
 */
public class WorkspaceCollectionInner {
    /**
     * Resource id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Workspace collection name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Resource type.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Azure location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * The tags property.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * The sku property.
     */
    @JsonProperty(value = "sku")
    private AzureSku sku;

    /**
     * Properties.
     */
    @JsonProperty(value = "properties")
    private Object properties;

    /**
     * Creates an instance of WorkspaceCollectionInner class.
     */
    public WorkspaceCollectionInner() {
        sku = new AzureSku();
    }

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the WorkspaceCollectionInner object itself.
     */
    public WorkspaceCollectionInner withId(String id) {
        this.id = id;
        return this;
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
     * Set the name value.
     *
     * @param name the name value to set
     * @return the WorkspaceCollectionInner object itself.
     */
    public WorkspaceCollectionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the WorkspaceCollectionInner object itself.
     */
    public WorkspaceCollectionInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the location value.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location value.
     *
     * @param location the location value to set
     * @return the WorkspaceCollectionInner object itself.
     */
    public WorkspaceCollectionInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the WorkspaceCollectionInner object itself.
     */
    public WorkspaceCollectionInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public AzureSku sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the WorkspaceCollectionInner object itself.
     */
    public WorkspaceCollectionInner withSku(AzureSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the WorkspaceCollectionInner object itself.
     */
    public WorkspaceCollectionInner withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

}
