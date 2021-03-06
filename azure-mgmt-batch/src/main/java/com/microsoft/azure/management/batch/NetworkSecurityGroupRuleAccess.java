/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for NetworkSecurityGroupRuleAccess.
 */
public enum NetworkSecurityGroupRuleAccess {
    /** Enum value Allow. */
    ALLOW("Allow"),

    /** Enum value Deny. */
    DENY("Deny");

    /** The actual serialized value for a NetworkSecurityGroupRuleAccess instance. */
    private String value;

    NetworkSecurityGroupRuleAccess(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a NetworkSecurityGroupRuleAccess instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed NetworkSecurityGroupRuleAccess object, or null if unable to parse.
     */
    @JsonCreator
    public static NetworkSecurityGroupRuleAccess fromString(String value) {
        NetworkSecurityGroupRuleAccess[] items = NetworkSecurityGroupRuleAccess.values();
        for (NetworkSecurityGroupRuleAccess item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
