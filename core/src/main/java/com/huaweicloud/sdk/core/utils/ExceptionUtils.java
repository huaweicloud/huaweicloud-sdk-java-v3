/*
 * Copyright 2020 Huawei Technologies Co.,Ltd.
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

import java.util.Map;
import java.util.Objects;

import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.exception.SdkErrorMessage;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.http.HttpResponse;

public class ExceptionUtils {

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
            .withErrorCode(
                errResult.containsKey(Constants.ERROR_CODE) ? errResult.get(Constants.ERROR_CODE).toString()
                    : errResult.containsKey(Constants.CODE) ? errResult.get(Constants.CODE).toString() : null)
            .withErrorMsg(
                errResult.containsKey(Constants.ERROR_MSG) ? errResult.get(Constants.ERROR_MSG).toString()
                    : errResult.containsKey(Constants.MESSAGE) ? errResult.get(Constants.MESSAGE).toString()
                    : null)
            .withRequestId(
                errResult.containsKey(Constants.REQUEST_ID) ? errResult.get(Constants.REQUEST_ID).toString()
                    : null);
    }

    private static void processErrorMessageFromNestedMap(SdkErrorMessage sdkErrorMessage, Map errResult) {
        if (!(Objects.isNull(sdkErrorMessage.getErrorCode()) || Objects.isNull(sdkErrorMessage.getErrorMsg()))) {
            return;
        }

        errResult.forEach((key, value) -> {
            if (value instanceof Map) {
                Map valueMap = ((Map) value);
                if (Objects.isNull(sdkErrorMessage.getErrorCode())
                    && valueMap.containsKey(Constants.CODE)) {
                    sdkErrorMessage.setErrorCode(valueMap.get(Constants.CODE).toString());
                }
                if (Objects.isNull(sdkErrorMessage.getErrorMsg())
                    && valueMap.containsKey(Constants.MESSAGE)) {
                    sdkErrorMessage.setErrorMsg(valueMap.get(Constants.MESSAGE).toString());
                }
            }
        });
    }

}
