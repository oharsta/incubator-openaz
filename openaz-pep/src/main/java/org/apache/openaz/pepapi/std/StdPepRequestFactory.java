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

package org.apache.openaz.pepapi.std;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.openaz.pepapi.MapperRegistry;
import org.apache.openaz.pepapi.PepConfig;
import org.apache.openaz.pepapi.PepRequest;
import org.apache.openaz.pepapi.PepRequestFactory;

import java.util.List;


final class StdPepRequestFactory implements PepRequestFactory {

    private static final Log logger = LogFactory.getLog(StdPepRequestFactory.class);

    private final PepConfig pepConfig;

    private final MapperRegistry mapperRegistry;

    /**
     *
     * @param pepConfig
     */
    StdPepRequestFactory(PepConfig pepConfig, MapperRegistry mapperRegistry) {
        this.pepConfig = pepConfig;
        this.mapperRegistry = mapperRegistry;
    }

    @Override
    public PepRequest newPepRequest(Object[] objects) {
        return StdPepRequest.newInstance(pepConfig, mapperRegistry, objects);
    }

    @Override
    public PepRequest newBulkPepRequest(List<?> associations, Object[] objects) {
        return MultiRequest.newInstance(pepConfig, mapperRegistry, associations, objects);
    }

}
