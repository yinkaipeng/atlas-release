/*
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
package org.apache.atlas.omag.admin.server.properties;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.atlas.omag.configuration.properties.OMAGServerConfig;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.PUBLIC_ONLY;


/**
 * OMAGServerConfigResponse is the response structure used on the OMAG REST API calls that returns a
 * Connection object as a response.
 */
@JsonAutoDetect(getterVisibility=PUBLIC_ONLY, setterVisibility=PUBLIC_ONLY, fieldVisibility=NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class OMAGServerConfigResponse extends OMAGAPIResponse
{
    private OMAGServerConfig serverConfig = null;

    /**
     * Default constructor
     */
    public OMAGServerConfigResponse()
    {
    }


    /**
     * Return the OMAGServerConfig object.
     *
     * @return OMAGServerConfig object
     */
    public OMAGServerConfig getOMAGServerConfig()
    {
        return serverConfig;
    }

    /**
     * Set up the OMAGServerConfig object.
     *
     * @param serverConfig - OMAGServerConfig object
     */
    public void setOMAGServerConfig(OMAGServerConfig serverConfig)
    {
        this.serverConfig = serverConfig;
    }

    @Override
    public String toString()
    {
        return "OMAGServerConfigResponse{" +
                "serverConfig=" + serverConfig +
                ", relatedHTTPCode=" + relatedHTTPCode +
                ", exceptionClassName='" + exceptionClassName + '\'' +
                ", exceptionErrorMessage='" + exceptionErrorMessage + '\'' +
                ", exceptionSystemAction='" + exceptionSystemAction + '\'' +
                ", exceptionUserAction='" + exceptionUserAction + '\'' +
                '}';
    }
}
