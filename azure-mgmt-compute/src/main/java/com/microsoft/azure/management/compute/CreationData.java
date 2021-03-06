/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data used when creating a disk.
 */
public class CreationData {
    /**
     * This enumerates the possible sources of a disk's creation. Possible
     * values include: 'Empty', 'Attach', 'FromImage', 'Import', 'Copy',
     * 'Restore'.
     */
    @JsonProperty(value = "createOption", required = true)
    private DiskCreateOption createOption;

    /**
     * If createOption is Import, the Azure Resource Manager identifier of the
     * storage account containing the blob to import as a disk. Required only
     * if the blob is in a different subscription.
     */
    @JsonProperty(value = "storageAccountId")
    private String storageAccountId;

    /**
     * Disk source information.
     */
    @JsonProperty(value = "imageReference")
    private ImageDiskReference imageReference;

    /**
     * If createOption is Import, this is the URI of a blob to be imported into
     * a managed disk.
     */
    @JsonProperty(value = "sourceUri")
    private String sourceUri;

    /**
     * If createOption is Copy, this is the ARM id of the source snapshot or
     * disk.
     */
    @JsonProperty(value = "sourceResourceId")
    private String sourceResourceId;

    /**
     * Get the createOption value.
     *
     * @return the createOption value
     */
    public DiskCreateOption createOption() {
        return this.createOption;
    }

    /**
     * Set the createOption value.
     *
     * @param createOption the createOption value to set
     * @return the CreationData object itself.
     */
    public CreationData withCreateOption(DiskCreateOption createOption) {
        this.createOption = createOption;
        return this;
    }

    /**
     * Get the storageAccountId value.
     *
     * @return the storageAccountId value
     */
    public String storageAccountId() {
        return this.storageAccountId;
    }

    /**
     * Set the storageAccountId value.
     *
     * @param storageAccountId the storageAccountId value to set
     * @return the CreationData object itself.
     */
    public CreationData withStorageAccountId(String storageAccountId) {
        this.storageAccountId = storageAccountId;
        return this;
    }

    /**
     * Get the imageReference value.
     *
     * @return the imageReference value
     */
    public ImageDiskReference imageReference() {
        return this.imageReference;
    }

    /**
     * Set the imageReference value.
     *
     * @param imageReference the imageReference value to set
     * @return the CreationData object itself.
     */
    public CreationData withImageReference(ImageDiskReference imageReference) {
        this.imageReference = imageReference;
        return this;
    }

    /**
     * Get the sourceUri value.
     *
     * @return the sourceUri value
     */
    public String sourceUri() {
        return this.sourceUri;
    }

    /**
     * Set the sourceUri value.
     *
     * @param sourceUri the sourceUri value to set
     * @return the CreationData object itself.
     */
    public CreationData withSourceUri(String sourceUri) {
        this.sourceUri = sourceUri;
        return this;
    }

    /**
     * Get the sourceResourceId value.
     *
     * @return the sourceResourceId value
     */
    public String sourceResourceId() {
        return this.sourceResourceId;
    }

    /**
     * Set the sourceResourceId value.
     *
     * @param sourceResourceId the sourceResourceId value to set
     * @return the CreationData object itself.
     */
    public CreationData withSourceResourceId(String sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
        return this;
    }

}
