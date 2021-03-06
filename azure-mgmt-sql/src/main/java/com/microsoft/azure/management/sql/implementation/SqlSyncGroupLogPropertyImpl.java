/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.sql.implementation;

import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.resources.fluentcore.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.SqlSyncGroupLogProperty;
import com.microsoft.azure.management.sql.SyncGroupLogType;
import org.joda.time.DateTime;

/**
 * Implementation for SqlSyncGroupLogProperty.
 */
@LangDefinition
public class SqlSyncGroupLogPropertyImpl
    extends WrapperImpl <SyncGroupLogPropertiesInner>
    implements SqlSyncGroupLogProperty {
    protected SqlSyncGroupLogPropertyImpl(SyncGroupLogPropertiesInner innerObject) {
        super(innerObject);
    }

    @Override
    public DateTime timestamp() {
        return this.inner().timestamp();
    }

    @Override
    public SyncGroupLogType type() {
        return this.inner().type();
    }

    @Override
    public String source() {
        return this.inner().source();
    }

    @Override
    public String details() {
        return this.inner().details();
    }

    @Override
    public String tracingId() {
        return this.inner().tracingId().toString();
    }

    @Override
    public String operationStatus() {
        return this.inner().operationStatus();
    }
}
