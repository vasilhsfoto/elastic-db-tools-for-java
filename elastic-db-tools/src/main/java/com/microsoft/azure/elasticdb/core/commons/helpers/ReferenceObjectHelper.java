package com.microsoft.azure.elasticdb.core.commons.helpers;

/*
 * Elastic database tools for Azure SQL Database.
 * 
 * Copyright(c) Microsoft Corporation All rights reserved.
 * 
 * This program is made available under the terms of the MIT License. See the LICENSE file in the project root for more information.
 */

public class ReferenceObjectHelper<T> {

    public T outValue;
    public T argValue;

    public ReferenceObjectHelper(T referenceValue) {
        outValue = referenceValue;
    }
}
