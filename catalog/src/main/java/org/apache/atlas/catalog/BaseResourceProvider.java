/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.atlas.catalog;

import org.apache.atlas.catalog.exception.InvalidPayloadException;
import org.apache.atlas.catalog.exception.ResourceNotFoundException;
import org.apache.atlas.catalog.query.QueryFactory;

/**
 * Base class for resource providers.
 */
public abstract class BaseResourceProvider implements ResourceProvider {
    protected AtlasTypeSystem typeSystem;
    protected QueryFactory queryFactory = new QueryFactory();

    protected BaseResourceProvider(AtlasTypeSystem typeSystem) {
        this.typeSystem = typeSystem;
    }

    protected void setQueryFactory(QueryFactory factory) {
        queryFactory = factory;
    }

    @Override
    public void deleteResourceById(Request request) throws ResourceNotFoundException, InvalidPayloadException {
        throw new InvalidPayloadException("Delete is not supported for this resource type");
    }
}
