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

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

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
        if (strBody == null) {
            return sdkErrorMessage;
        }
        try {
            Map<?, ?> errResult = JsonUtils.toObject(strBody, Map.class);

            if (errResult == null) {
                return sdkErrorMessage;
            }
            processErrorMessage(sdkErrorMessage, errResult);
            if (sdkErrorMessage.getErrorMsg() == null) {
                sdkErrorMessage.setErrorMsg(strBody);
            }
        } catch (SdkException e) {
            sdkErrorMessage.setErrorMsg(httpResponse.getBodyAsString());
        }

        if (sdkErrorMessage.getRequestId() == null) {
            sdkErrorMessage.setRequestId(httpResponse.getHeader(Constants.X_REQUEST_ID));
        }

        return sdkErrorMessage;
    }

    private static List<SdkErrorMessage> extractDetails(Object details) {
        if (!(details instanceof List)) {
            return null;
        }

        ArrayList<SdkErrorMessage> errors = new ArrayList<>();
        for (Object detail : ((List<?>) details)) {
            if (!(detail instanceof Map)) {
                continue;
            }
            SdkErrorMessage error = new SdkErrorMessage();
            processErrorMessage(error, (Map<?, ?>) detail);
            errors.add(error);
        }
        return errors;
    }

    private static void processErrorMessage(SdkErrorMessage sdkErrorMessage, Map<?, ?> errResult) {
        Object encodedAuthMsg = errResult.get(Constants.ENCODED_AUTHORIZATION_MESSAGE);
        if (encodedAuthMsg != null) {
            sdkErrorMessage.setEncodedAuthorizationMessage(encodedAuthMsg.toString());
        }

        Object details = errResult.get(Constants.DETAILS);
        if (details != null) {
            sdkErrorMessage.setDetails(extractDetails(details));
        }

        if (errResult.containsKey(Constants.ERROR_CODE) && errResult.containsKey(Constants.ERROR_MSG)) {
            sdkErrorMessage.setErrorCode(errResult.get(Constants.ERROR_CODE).toString());
            sdkErrorMessage.setErrorMsg(errResult.get(Constants.ERROR_MSG).toString());
            return;
        }

        if (errResult.containsKey(Constants.CODE) && errResult.containsKey(Constants.MESSAGE)) {
            sdkErrorMessage.setErrorCode(errResult.get(Constants.CODE).toString());
            sdkErrorMessage.setErrorMsg(errResult.get(Constants.MESSAGE).toString());
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
        if (cause.getMessage().toLowerCase(Locale.US).contains(CONNECT_TIMEOUT_MSG)) {
            throw new ConnectionTimeoutException(cause);
        }
        // if idempotent of the interfaces has been realized, CallTimeoutException could be retried
        throw new CallTimeoutException(originMsg, cause);
    }
}
