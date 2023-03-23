/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
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

package com.huaweicloud.sdk.core.utils;

import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.exception.CallTimeoutException;
import com.huaweicloud.sdk.core.exception.ConnectionTimeoutException;
import com.huaweicloud.sdk.core.exception.SdkErrorMessage;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.http.HttpResponse;

import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/**
 * @author HuaweiCloud_SDK
 */
public final class ExceptionUtils {
    private static final String CONNECT_TIMEOUT_MSG = "connect timed out";

    /**
     * The utility class should hide the public constructor
     */
    private ExceptionUtils() {

    }

    /**
     * resolve the exception message from http response
     *
     * @param httpResponse HttpResponse
     * @return the SdkErrorMessage
     */
    public static SdkErrorMessage extractErrorMessage(HttpResponse httpResponse) {
        String strBody = httpResponse.getBodyAsString();
        SdkErrorMessage sdkErrorMessage = new SdkErrorMessage(httpResponse.getStatusCode());
        if (Objects.isNull(strBody)) {
            return sdkErrorMessage;
        }
        try {
            Map<?, ?> errResult = JsonUtils.toObject(strBody, Map.class);

            if (Objects.isNull(errResult)) {
                return sdkErrorMessage;
            }
            processErrorMessage(sdkErrorMessage, errResult);
            if (Objects.isNull(sdkErrorMessage.getErrorMsg())) {
                sdkErrorMessage.setErrorMsg(strBody);
            }
        } catch (SdkException e) {
            sdkErrorMessage.setErrorMsg(httpResponse.getBodyAsString());
        }

        if (Objects.isNull(sdkErrorMessage.getRequestId()) && Objects.nonNull(
                httpResponse.getHeader(Constants.X_REQUEST_ID))) {
            sdkErrorMessage.setRequestId(httpResponse.getHeader(Constants.X_REQUEST_ID));
        }

        return sdkErrorMessage;
    }

    private static void processErrorMessage(SdkErrorMessage sdkErrorMessage, Map<?, ?> errResult) {
        if (errResult.containsKey(Constants.ENCODED_AUTHORIZATION_MESSAGE)) {
            sdkErrorMessage.setEncodedAuthorizationMessage(
                    (String) errResult.get(Constants.ENCODED_AUTHORIZATION_MESSAGE));
        }

        if (errResult.containsKey(Constants.ERROR_CODE) && errResult.containsKey(Constants.ERROR_MSG)) {
            sdkErrorMessage.setErrorCode((String) errResult.get(Constants.ERROR_CODE));
            sdkErrorMessage.setErrorMsg((String) errResult.get(Constants.ERROR_MSG));
            return;
        }

        if (errResult.containsKey(Constants.CODE) && errResult.containsKey(Constants.MESSAGE)) {
            sdkErrorMessage.setErrorCode((String) errResult.get(Constants.CODE));
            sdkErrorMessage.setErrorMsg((String) errResult.get(Constants.MESSAGE));
            return;
        }

        for (Object value : errResult.values()) {
            if (value instanceof Map<?, ?>) {
                processErrorMessage(sdkErrorMessage, (Map<?, ?>) value);
            }
        }
    }

    public static void mapSocketTimeoutException(String originMsg, Throwable cause) {
        // distinguish connection timeout and other timeout, ConnectionTimeoutException should be retried
        if (cause.getMessage().toLowerCase(Locale.ROOT).contains(CONNECT_TIMEOUT_MSG)) {
            throw new ConnectionTimeoutException(cause);
        }
        // if idempotent of the interfaces has been realized, CallTimeoutException could be retried
        throw new CallTimeoutException(originMsg, cause);
    }
}
