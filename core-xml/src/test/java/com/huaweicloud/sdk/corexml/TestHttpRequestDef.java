/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2023-2023. All rights reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.huaweicloud.sdk.corexml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.huaweicloud.sdk.core.SdkRequest;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

public class TestHttpRequestDef {
    public static class TestXmlRequest implements SdkRequest {
        private TestXmlRequestBody body;

        public TestXmlRequestBody getBody() {
            return body;
        }

        public void setBody(TestXmlRequestBody body) {
            this.body = body;
        }
    }

    @JacksonXmlRootElement(localName = "Body")
    public static class TestXmlRequestBody extends SdkXmlBody<TestXmlRequestBody> {
        private Obj obj;

        public Obj getObj() {
            return obj;
        }

        public void setObj(Obj obj) {
            this.obj = obj;
        }
    }

    public static class Obj {
        private String str;

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }
    }

    @JacksonXmlRootElement(localName = "Response")
    public static class TestXmlResponse extends SdkXmlResponse<TestXmlResponse> {
        private Integer id;

        private String name;

        private Boolean success;

        private List<String> list;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Boolean getSuccess() {
            return success;
        }

        public void setSuccess(Boolean success) {
            this.success = success;
        }

        public List<String> getList() {
            return list;
        }

        public void setList(List<String> list) {
            this.list = list;
        }
    }

    public static HttpRequestDef<TestXmlRequest, TestXmlResponse> buildTestXmlRequestDef() {
        HttpRequestDef.Builder<TestXmlRequest, TestXmlResponse> builder = HttpRequestDef
                .builder(HttpMethod.POST, TestXmlRequest.class, TestXmlResponse.class)
                .withName("TestXmlRequest")
                .withUri("/test-xml")
                .withContentType("application/xml");

        // request
        builder.withRequestField("body", LocationType.Body, FieldExistence.NON_NULL_NON_EMPTY,
                TestXmlRequestBody.class, f -> f.withMarshaller(TestXmlRequest::getBody, TestXmlRequest::setBody));

        return builder.build();
    }
}
