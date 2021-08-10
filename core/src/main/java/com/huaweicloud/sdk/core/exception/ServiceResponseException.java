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

package com.huaweicloud.sdk.core.exception;

import static com.huaweicloud.sdk.core.Constants.StatusCode.CLIENT_ERROR;
import static com.huaweicloud.sdk.core.Constants.StatusCode.SERVER_ERROR;
import static com.huaweicloud.sdk.core.Constants.StatusCode.SERVER_ERROR_UPPER_LIMIT;

import java.util.Objects;

/** Base Exception for HTTP Errors during Rest Operations
 *
 * @author HuaweiCloud_SDK */
public class ServiceResponseException extends SdkException {

    private final int httpStatusCode;

    private String errorMsg;

    private String errorCode;

    private String requestId;

    public ServiceResponseException(int httpStatusCode, SdkErrorMessage sdkErrorMessage) {
        super(Objects.nonNull(sdkErrorMessage) ? sdkErrorMessage.getErrorMsg() : "ServiceResponseException");
        this.httpStatusCode = httpStatusCode;
        if (Objects.nonNull(sdkErrorMessage)) {
            this.errorCode = sdkErrorMessage.getErrorCode();
            this.errorMsg = sdkErrorMessage.getErrorMsg();
            this.requestId = sdkErrorMessage.getRequestId();
        }
    }

    public ServiceResponseException(int httpStatusCode, String errorCode, String errorMsg, String requestId) {
        super(errorMsg);
        this.httpStatusCode = httpStatusCode;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.requestId = requestId;
    }

    /** Maps an Exception based on the underlying status code
     *
     * @param httpStatusCode the Http Status Code
     * @param sdkErrorMessage the SdkErrorMessage
     * @return the response exception */
    public static ServiceResponseException mapException(int httpStatusCode, SdkErrorMessage sdkErrorMessage) {
        if (Objects.isNull(sdkErrorMessage)) {
            return mapException(httpStatusCode, null, null, null);
        }
        return mapException(httpStatusCode,
            sdkErrorMessage.getErrorCode(),
            sdkErrorMessage.getErrorMsg(),
            sdkErrorMessage.getRequestId());
    }

    /** Convert an Exception based on the underlying status code
     *
     * @return the response exception */
    public static ServiceResponseException mapException(int httpStatusCode, String errorCode, String errorMsg,
        String requestId) {
        if (httpStatusCode >= CLIENT_ERROR && httpStatusCode < SERVER_ERROR) {
            return new ClientRequestException(httpStatusCode, errorCode, errorMsg, requestId);
        }
        if (httpStatusCode >= SERVER_ERROR && httpStatusCode < SERVER_ERROR_UPPER_LIMIT) {
            return new ServerResponseException(httpStatusCode, errorCode, errorMsg, requestId);
        }

        return new ServiceResponseException(httpStatusCode, errorCode, errorMsg, requestId);
    }

    /** @return return the raw status code */
    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getRequestId() {
        return requestId;
    }

    @Override
    public String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName()).append(" {\n");
        sb.append("    httpStatusCode: ").append(toIndentedString(httpStatusCode)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
