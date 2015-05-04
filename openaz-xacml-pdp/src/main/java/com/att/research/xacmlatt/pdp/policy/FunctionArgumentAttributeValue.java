/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */

/*
 *                        AT&T - PROPRIETARY
 *          THIS FILE CONTAINS PROPRIETARY INFORMATION OF
 *        AT&T AND IS NOT TO BE DISCLOSED OR USED EXCEPT IN
 *             ACCORDANCE WITH APPLICABLE AGREEMENTS.
 *
 *          Copyright (c) 2013 AT&T Knowledge Ventures
 *              Unpublished and Not for Publication
 *                     All Rights Reserved
 */
package com.att.research.xacmlatt.pdp.policy;

import com.att.research.xacml.api.AttributeValue;
import com.att.research.xacml.api.Status;
import com.att.research.xacml.std.StdStatus;

/**
 * FunctionArgumentAttributeValue implements {@link FunctionArgument} for a single
 * {@link com.att.research.xacml.api.AttributeValue}
 *
 */
public class FunctionArgumentAttributeValue implements FunctionArgument {
    private AttributeValue<?> attributeValue;

    /**
     * Creates a new <code>FunctionArgumentAttributeValue</code> from the given <code>AttributeValue</code>.
     *
     * @param attributeValueIn the <code>AttributeValue</code> for the new <code>FunctionArgumentAttributeValue</code>.
     */
    public FunctionArgumentAttributeValue(AttributeValue<?> attributeValueIn) {
        this.attributeValue	= attributeValueIn;
    }

    @Override
    public Status getStatus() {
        return StdStatus.STATUS_OK;
    }

    @Override
    public boolean isOk() {
        return true;
    }

    @Override
    public boolean isBag() {
        return false;
    }

    @Override
    public AttributeValue<?> getValue() {
        return this.attributeValue;
    }

    @Override
    public Bag getBag() {
        return null;
    }
}
