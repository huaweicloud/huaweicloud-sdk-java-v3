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

package com.huaweicloud.sdk.core;

import com.huaweicloud.sdk.core.exception.SdkErrorMessage;
import com.huaweicloud.sdk.core.http.HttpResponse;
import com.huaweicloud.sdk.core.utils.ExceptionUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestExtractErrorMessage {
    @Test
    public void testExtractErrorMessage1() {
        String errorMessage = "{\"error_code\":\"XXX.0001\"," +
                "\"error_msg\":\"Some errors occurred.\"," +
                "\"encoded_authorization_message\":\"Egpjbi1ub*****GoxMzgrcA==\"}";
        HttpResponse response = new ErrorResponse(errorMessage);
        SdkErrorMessage sdkErrorMessage = ExceptionUtils.extractErrorMessage(response);
        Assert.assertEquals(400, sdkErrorMessage.getHttpStatusCode());
        Assert.assertEquals("Egpjbi1ub*****GoxMzgrcA==", sdkErrorMessage.getEncodedAuthorizationMessage());
        Assert.assertEquals("XXX.0001", sdkErrorMessage.getErrorCode());
        Assert.assertEquals("Some errors occurred.", sdkErrorMessage.getErrorMsg());
        Assert.assertEquals("97e2***11df", sdkErrorMessage.getRequestId());
    }

    @Test
    public void testExtractErrorMessage2() {
        String errorMessage = "{\"error\":" +
                "{\"code\":\"XXX.0001\"," +
                "\"message\":\"Some errors occurred.\"," +
                "\"encoded_authorization_message\":\"Egpjbi1ub*****GoxMzgrcA==\"}}";
        HttpResponse response = new ErrorResponse(errorMessage);
        SdkErrorMessage sdkErrorMessage = ExceptionUtils.extractErrorMessage(response);
        Assert.assertEquals(400, sdkErrorMessage.getHttpStatusCode());
        Assert.assertEquals("Egpjbi1ub*****GoxMzgrcA==", sdkErrorMessage.getEncodedAuthorizationMessage());
        Assert.assertEquals("XXX.0001", sdkErrorMessage.getErrorCode());
        Assert.assertEquals("Some errors occurred.", sdkErrorMessage.getErrorMsg());
        Assert.assertEquals("97e2***11df", sdkErrorMessage.getRequestId());
    }

    @Test
    public void testExtractErrorMessage3() {
        String errorMessage = "{\"error\":" +
                "{\"code\":\"XXX.0001\"," +
                "\"message\":\"Some errors occurred.\"}," +
                "\"error_code\":\"XXX.0001\"," +
                "\"error_msg\":\"Some errors occurred.\"," +
                "\"encoded_authorization_message\":\"Egpjbi1ub*****GoxMzgrcA==\"}";
        HttpResponse response = new ErrorResponse(errorMessage);
        SdkErrorMessage sdkErrorMessage = ExceptionUtils.extractErrorMessage(response);
        Assert.assertEquals(400, sdkErrorMessage.getHttpStatusCode());
        Assert.assertEquals("Egpjbi1ub*****GoxMzgrcA==", sdkErrorMessage.getEncodedAuthorizationMessage());
        Assert.assertEquals("XXX.0001", sdkErrorMessage.getErrorCode());
        Assert.assertEquals("Some errors occurred.", sdkErrorMessage.getErrorMsg());
        Assert.assertEquals("97e2***11df", sdkErrorMessage.getRequestId());
    }

    @Test
    public void testExtractErrorMessage4() {
        String errorMessage = "{\"invalid_key\":\"invalid_value\"}";
        HttpResponse response = new ErrorResponse(errorMessage);
        SdkErrorMessage sdkErrorMessage = ExceptionUtils.extractErrorMessage(response);
        Assert.assertEquals(400, sdkErrorMessage.getHttpStatusCode());
        Assert.assertNull(sdkErrorMessage.getEncodedAuthorizationMessage());
        Assert.assertNull(sdkErrorMessage.getErrorCode());
        Assert.assertEquals("{\"invalid_key\":\"invalid_value\"}", sdkErrorMessage.getErrorMsg());
        Assert.assertEquals("97e2***11df", sdkErrorMessage.getRequestId());

    }

    @Test
    public void testExtractErrorMessage5() {
        String errorMessage = "invalid json data";
        HttpResponse response = new ErrorResponse(errorMessage);
        SdkErrorMessage sdkErrorMessage = ExceptionUtils.extractErrorMessage(response);
        Assert.assertEquals(400, sdkErrorMessage.getHttpStatusCode());
        Assert.assertNull(sdkErrorMessage.getEncodedAuthorizationMessage());
        Assert.assertNull(sdkErrorMessage.getErrorCode());
        Assert.assertEquals("invalid json data", sdkErrorMessage.getErrorMsg());
        Assert.assertEquals("97e2***11df", sdkErrorMessage.getRequestId());
    }

    static class ErrorResponse implements HttpResponse {

        private final Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = -8502319196156740305L;

            {
                put(Constants.X_REQUEST_ID, "97e2***11df");
            }
        };

        private final String bodyAsString;

        public ErrorResponse(String bodyAsString) {
            this.bodyAsString = bodyAsString;
        }

        @Override
        public int getStatusCode() {
            return 400;
        }

        @Override
        public String getContentType() {
            return null;
        }

        @Override
        public long getContentLength() {
            return 0;
        }

        @Override
        public Map<String, List<String>> getHeaders() {
            return null;
        }

        @Override
        public String getBodyAsString() {
            return bodyAsString;
        }

        @Override
        public byte[] getBodyAsBytes() {
            return new byte[0];
        }

        @Override
        public InputStream getBody() {
            return null;
        }

        @Override
        public String getHeader(String name) {
            return headers.get(name);
        }
    }
}
