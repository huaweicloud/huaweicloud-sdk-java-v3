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

/** @author HuaweiCloud_SDK */
public final class ExceptionUtils {

    private static final String CONNECT_TIMEOUT_MSG = "connect timed out";

    /** The utility class should hide the public constructor */
    private ExceptionUtils() {

    }

    /** resolve the exception message from http response
     *
     * @param httpResponse HttpResponse
     * @return the SdkErrorMessage */
    public static SdkErrorMessage extractErrorMessage(HttpResponse httpResponse) {
        String strBody = httpResponse.getBodyAsString();
        SdkErrorMessage sdkErrorMessage = new SdkErrorMessage(httpResponse.getStatusCode());
        if (Objects.isNull(strBody)) {
            return sdkErrorMessage;
        }
        try {
            Map errResult = JsonUtils.toObject(strBody, Map.class);

            if (Objects.isNull(errResult)) {
                return sdkErrorMessage;
            }
            processErrorMessageFromMap(sdkErrorMessage, errResult);
            processErrorMessageFromNestedMap(sdkErrorMessage, errResult);
            if (Objects.isNull(sdkErrorMessage.getErrorMsg())) {
                sdkErrorMessage.setErrorMsg(strBody);
            }

            if (Objects.isNull(sdkErrorMessage.getRequestId())
                && Objects.nonNull(httpResponse.getHeader(Constants.X_REQUEST_ID))) {
                sdkErrorMessage.setRequestId(httpResponse.getHeader(Constants.X_REQUEST_ID));
            }
        } catch (SdkException e) {
            sdkErrorMessage.setErrorMsg(httpResponse.getBodyAsString());
        }

        return sdkErrorMessage;
    }

    private static void processErrorMessageFromMap(SdkErrorMessage sdkErrorMessage, Map errResult) {
        sdkErrorMessage
            .withErrorCode(errResult.containsKey(Constants.ERROR_CODE) ? errResult.get(Constants.ERROR_CODE).toString()
                : errResult.containsKey(Constants.CODE) ? errResult.get(Constants.CODE).toString() : null)
            .withErrorMsg(errResult.containsKey(Constants.ERROR_MSG) ? errResult.get(Constants.ERROR_MSG).toString()
                : errResult.containsKey(Constants.MESSAGE) ? errResult.get(Constants.MESSAGE).toString() : null)
            .withRequestId(
                errResult.containsKey(Constants.REQUEST_ID) ? errResult.get(Constants.REQUEST_ID).toString() : null);
    }

    private static void processErrorMessageFromNestedMap(SdkErrorMessage sdkErrorMessage, Map errResult) {
        if (!(Objects.isNull(sdkErrorMessage.getErrorCode()) || Objects.isNull(sdkErrorMessage.getErrorMsg()))) {
            return;
        }

        errResult.forEach((key, value) -> {
            if (value instanceof Map) {
                Map valueMap = (Map) value;
                if (Objects.isNull(sdkErrorMessage.getErrorCode()) && valueMap.containsKey(Constants.CODE)) {
                    sdkErrorMessage.setErrorCode(valueMap.get(Constants.CODE).toString());
                }
                if (Objects.isNull(sdkErrorMessage.getErrorMsg()) && valueMap.containsKey(Constants.MESSAGE)) {
                    sdkErrorMessage.setErrorMsg(valueMap.get(Constants.MESSAGE).toString());
                }
                if (Objects.isNull(sdkErrorMessage.getErrorCode()) && valueMap.containsKey(Constants.ERROR_CODE)) {
                    sdkErrorMessage.setErrorCode(valueMap.get(Constants.ERROR_CODE).toString());
                }
                if (Objects.isNull(sdkErrorMessage.getErrorMsg()) && valueMap.containsKey(Constants.ERROR_MSG)) {
                    sdkErrorMessage.setErrorMsg(valueMap.get(Constants.ERROR_MSG).toString());
                }
            }
        });
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
