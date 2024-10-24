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

import com.huaweicloud.sdk.core.exception.DefaultExceptionHandler;
import com.huaweicloud.sdk.core.exception.ExceptionHandler;
import com.huaweicloud.sdk.core.exception.SdkErrorMessage;
import com.huaweicloud.sdk.core.exception.ServiceResponseException;
import com.huaweicloud.sdk.core.http.HttpResponse;
import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestExceptionHandler {
    private static final ExceptionHandler EXCEPTION_HANDLER = new DefaultExceptionHandler();
    @Test
    public void testHandleException1() {
        String errorMessage = "{\"error_code\":\"XXX.0001\"," +
                "\"error_msg\":\"Some errors occurred.\"," +
                "\"encoded_authorization_message\":\"Egpjbi1ub*****GoxMzgrcA==\"}";
        HttpResponse response = new ErrorResponse(errorMessage);
        try {
            EXCEPTION_HANDLER.handleException(null, response);
            Assert.fail("expect ServiceResponseException");
        } catch (ServiceResponseException e) {
            Assert.assertEquals(400, e.getHttpStatusCode());
            Assert.assertEquals("Egpjbi1ub*****GoxMzgrcA==", e.getEncodedAuthorizationMessage());
            Assert.assertEquals("XXX.0001", e.getErrorCode());
            Assert.assertEquals("Some errors occurred.", e.getErrorMsg());
            Assert.assertEquals("97e2***11df", e.getRequestId());
            Assert.assertNotNull(e.toString());
        }
    }

    @Test
    public void testHandleException2() {
        String errorMessage = "{\"error\":" +
                "{\"code\":\"XXX.0001\"," +
                "\"message\":\"Some errors occurred.\"," +
                "\"encoded_authorization_message\":\"Egpjbi1ub*****GoxMzgrcA==\"}}";
        HttpResponse response = new ErrorResponse(errorMessage);
        try {
            EXCEPTION_HANDLER.handleException(null, response);
            Assert.fail("expect ServiceResponseException");
        } catch (ServiceResponseException e) {
            Assert.assertEquals(400, e.getHttpStatusCode());
            Assert.assertEquals("Egpjbi1ub*****GoxMzgrcA==", e.getEncodedAuthorizationMessage());
            Assert.assertEquals("XXX.0001", e.getErrorCode());
            Assert.assertEquals("Some errors occurred.", e.getErrorMsg());
            Assert.assertEquals("97e2***11df", e.getRequestId());
            Assert.assertNotNull(e.toString());
        }
    }

    @Test
    public void testHandleException3() {
        String errorMessage = "{\"error\":" +
                "{\"code\":\"XXX.0001\"," +
                "\"message\":\"Some errors occurred.\"}," +
                "\"error_code\":\"XXX.0001\"," +
                "\"error_msg\":\"Some errors occurred.\"," +
                "\"encoded_authorization_message\":\"Egpjbi1ub*****GoxMzgrcA==\"}";
        HttpResponse response = new ErrorResponse(errorMessage);
        try {
            EXCEPTION_HANDLER.handleException(null, response);
            Assert.fail("expect ServiceResponseException");
        } catch (ServiceResponseException e) {
            Assert.assertEquals(400, e.getHttpStatusCode());
            Assert.assertEquals("Egpjbi1ub*****GoxMzgrcA==", e.getEncodedAuthorizationMessage());
            Assert.assertEquals("XXX.0001", e.getErrorCode());
            Assert.assertEquals("Some errors occurred.", e.getErrorMsg());
            Assert.assertEquals("97e2***11df", e.getRequestId());
            Assert.assertNotNull(e.toString());
        }
    }

    @Test
    public void testHandleException4() {
        String errorMessage = "{\"invalid_key\":\"invalid_value\"}";
        HttpResponse response = new ErrorResponse(errorMessage);
        try {
            EXCEPTION_HANDLER.handleException(null, response);
            Assert.fail("expect ServiceResponseException");
        } catch (ServiceResponseException e) {
            Assert.assertEquals(400, e.getHttpStatusCode());
            Assert.assertNull(e.getEncodedAuthorizationMessage());
            Assert.assertEquals("{\"invalid_key\":\"invalid_value\"}", e.getErrorMsg());
            Assert.assertEquals("97e2***11df", e.getRequestId());
            Assert.assertNotNull(e.toString());
        }
    }

    @Test
    public void testHandleException5() {
        String errorMessage = "invalid json data";
        HttpResponse response = new ErrorResponse(errorMessage);
        try {
            EXCEPTION_HANDLER.handleException(null, response);
            Assert.fail("expect ServiceResponseException");
        } catch (ServiceResponseException e) {
            Assert.assertEquals(400, e.getHttpStatusCode());
            Assert.assertNull(e.getEncodedAuthorizationMessage());
            Assert.assertEquals("invalid json data", e.getErrorMsg());
            Assert.assertEquals("97e2***11df", e.getRequestId());
            Assert.assertNotNull(e.toString());
        }
    }

    @Test
    public void testHandleException6() {
        String errorMessage = "{\"error_code\":\"XXX.0001\"," +
                "\"error_msg\":\"Some errors occurred.\"," +
                "\"encoded_authorization_message\":null}";
        HttpResponse response = new ErrorResponse(errorMessage);
        try {
            EXCEPTION_HANDLER.handleException(null, response);
            Assert.fail("expect ServiceResponseException");
        } catch (ServiceResponseException e) {
            Assert.assertNull(e.getEncodedAuthorizationMessage());
            Assert.assertEquals(400, e.getHttpStatusCode());
            Assert.assertEquals("XXX.0001", e.getErrorCode());
            Assert.assertEquals("Some errors occurred.", e.getErrorMsg());
            Assert.assertEquals("97e2***11df", e.getRequestId());
            Assert.assertNotNull(e.toString());
        }
    }

    @Test
    public void testHandleException7() {
        String errorMessage = "{\"error\":{\"code\":\"C.XXXX\",\"message\":\"C failed\"," +
                "\"encoded_authorization_message\":\"xxxxx\"," +
                "\"details\":[{\"code\":\"C.XXXX\"," +
                "\"message\":\"You do not have permission to perform action xxx on resource xxx.\"}]}}";
        HttpResponse response = new ErrorResponse(errorMessage);
        try {
            EXCEPTION_HANDLER.handleException(null, response);
            Assert.fail("expect ServiceResponseException");
        } catch (ServiceResponseException e) {
            Assert.assertEquals("C.XXXX", e.getErrorCode());
            Assert.assertEquals("C failed", e.getErrorMsg());
            Assert.assertEquals("xxxxx", e.getEncodedAuthorizationMessage());
            SdkErrorMessage firstDetail = e.getDetails().get(0);
            Assert.assertEquals("C.XXXX", firstDetail.getErrorCode());
            Assert.assertEquals("You do not have permission to perform action xxx on resource xxx.",
                    firstDetail.getErrorMsg());
            Assert.assertNotNull(e.toString());
        }
    }

    @Test
    public void testHandleException8() {
        String errorMessage = "{\"error_code\":\"C.XXXX\",\"error_msg\":\"C failed\"," +
                "\"encoded_authorization_message\":\"xxxxx\"," +
                "\"details\":[{\"error_code\":\"C.XXXX\"," +
                "\"error_msg\":\"You do not have permission to perform action xxx on resource xxx.\"}]}";
        HttpResponse response = new ErrorResponse(errorMessage);
        try {
            EXCEPTION_HANDLER.handleException(null, response);
            Assert.fail("expect ServiceResponseException");
        } catch (ServiceResponseException e) {
            Assert.assertEquals("C.XXXX", e.getErrorCode());
            Assert.assertEquals("C failed", e.getErrorMsg());
            Assert.assertEquals("xxxxx", e.getEncodedAuthorizationMessage());
            SdkErrorMessage firstDetail = e.getDetails().get(0);
            Assert.assertEquals("C.XXXX", firstDetail.getErrorCode());
            Assert.assertEquals("You do not have permission to perform action xxx on resource xxx.",
                    firstDetail.getErrorMsg());
            Assert.assertNotNull(e.toString());
        }
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
