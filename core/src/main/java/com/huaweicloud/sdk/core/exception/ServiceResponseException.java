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

import com.huaweicloud.sdk.core.Constants.StatusCode;
import com.huaweicloud.sdk.core.utils.StringUtils;

import java.util.List;
import java.util.Objects;

/**
 * Base Exception for HTTP Errors during Rest Operations
 *
 * @author HuaweiCloud_SDK
 */
public class ServiceResponseException extends SdkException {
    private static final long serialVersionUID = 3963239618582355630L;

    private final int httpStatusCode;

    private final SdkErrorMessage sdkErrorMessage;

    public ServiceResponseException(int httpStatusCode, SdkErrorMessage sdkErrorMessage) {
        super(Objects.nonNull(sdkErrorMessage) ? sdkErrorMessage.getErrorMsg() : "ServiceResponseException");
        this.httpStatusCode = httpStatusCode;
        this.sdkErrorMessage = Objects.nonNull(sdkErrorMessage) ? sdkErrorMessage : new SdkErrorMessage();
    }

    public ServiceResponseException(int httpStatusCode, String errorCode, String errorMsg, String requestId) {
        super(errorMsg);
        this.httpStatusCode = httpStatusCode;
        this.sdkErrorMessage = new SdkErrorMessage()
                .withErrorCode(errorCode)
                .withErrorMsg(errorMsg)
                .withRequestId(requestId);

    }

    /**
     * Maps an Exception based on the underlying status code
     *
     * @param httpStatusCode  the Http Status Code
     * @param sdkErrorMessage the SdkErrorMessage
     * @return the response exception
     */
    public static ServiceResponseException mapException(int httpStatusCode, SdkErrorMessage sdkErrorMessage) {
        if (Objects.isNull(sdkErrorMessage)) {
            sdkErrorMessage = new SdkErrorMessage();
        }

        if (httpStatusCode >= StatusCode.CLIENT_ERROR && httpStatusCode < StatusCode.SERVER_ERROR) {
            return new ClientRequestException(httpStatusCode, sdkErrorMessage);
        }
        if (httpStatusCode >= StatusCode.SERVER_ERROR && httpStatusCode < StatusCode.SERVER_ERROR_UPPER_LIMIT) {
            return new ServerResponseException(httpStatusCode, sdkErrorMessage);
        }
        return new ServiceResponseException(httpStatusCode, sdkErrorMessage);
    }

    /**
     * @deprecated use {@link #mapException(int httpStatusCode, SdkErrorMessage sdkErrorMessage)} instead
     * Convert an Exception based on the underlying status code
     *
     * @return the response exception
     */
    @Deprecated
    public static ServiceResponseException mapException(int httpStatusCode, String errorCode, String errorMsg,
                                                        String requestId) {
        if (httpStatusCode >= StatusCode.CLIENT_ERROR && httpStatusCode < StatusCode.SERVER_ERROR) {
            return new ClientRequestException(httpStatusCode, errorCode, errorMsg, requestId);
        }
        if (httpStatusCode >= StatusCode.SERVER_ERROR && httpStatusCode < StatusCode.SERVER_ERROR_UPPER_LIMIT) {
            return new ServerResponseException(httpStatusCode, errorCode, errorMsg, requestId);
        }

        return new ServiceResponseException(httpStatusCode, errorCode, errorMsg, requestId);
    }

    /**
     * @return return the raw status code
     */
    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public String getErrorMsg() {
        return sdkErrorMessage.getErrorMsg();
    }

    public String getErrorCode() {
        return sdkErrorMessage.getErrorCode();
    }

    public String getRequestId() {
        return sdkErrorMessage.getRequestId();
    }

    public String getEncodedAuthorizationMessage() {
        return sdkErrorMessage.getEncodedAuthorizationMessage();
    }

    public List<SdkErrorMessage> getDetails() {
        return sdkErrorMessage.getDetails();
    }

    @Override
    public String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName()).append(" {\n");
        sb.append("    httpStatusCode: ").append(toIndentedString(httpStatusCode)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(getErrorCode())).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(getErrorMsg())).append("\n");
        sb.append("    requestId: ").append(toIndentedString(getRequestId())).append("\n");
        if (!StringUtils.isEmpty(getEncodedAuthorizationMessage())) {
            sb.append("    encodedAuthorizationMessage: ").append(toIndentedString(getEncodedAuthorizationMessage())).append("\n");
        }
        if (Objects.nonNull(getDetails())) {
            sb.append("    details: ").append("[").append("\n");
            for (SdkErrorMessage detail : getDetails()) {
                sb.append("        {").append("\n");
                sb.append("             errorCode: ").append(toIndentedString(detail.getErrorCode())).append("\n");
                sb.append("             errorMsg: ").append(toIndentedString(detail.getErrorMsg())).append("\n");
                sb.append("        }").append("\n");
            }
            sb.append("    ]").append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
