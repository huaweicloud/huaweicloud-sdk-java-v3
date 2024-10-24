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

import com.huaweicloud.sdk.core.SdkResponse;

import java.util.List;

/**
 * @author HuaweiCloud_SDK
 */
public class SdkErrorMessage extends SdkResponse {
    private String errorMsg;

    private String errorCode;

    private String requestId;

    private String encodedAuthorizationMessage;

    private List<SdkErrorMessage> details;

    /**
     * Default constructor of class SdkErrorMessage
     */
    public SdkErrorMessage() {

    }

    /**
     * Constructor with one parameter httpStatusCode
     *
     * @param httpStatusCode status code from response
     */
    public SdkErrorMessage(int httpStatusCode) {
        super(httpStatusCode);
    }

    /**
     * Constructor with full error type
     *
     * @param errorCode error code from response
     * @param errorMsg  error message from response
     * @param requestId requestId from response
     */
    public SdkErrorMessage(String errorCode, String errorMsg, String requestId) {
        this.errorMsg = errorMsg;
        this.errorCode = errorCode;
        this.requestId = requestId;
    }

    /**
     * Constructor with two parameter
     *
     * @param errorCode error code from response
     * @param errorMsg  error message from response
     */
    public SdkErrorMessage(String errorCode, String errorMsg) {
        this.errorMsg = errorMsg;
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public SdkErrorMessage withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public SdkErrorMessage withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public SdkErrorMessage withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getEncodedAuthorizationMessage() {
        return encodedAuthorizationMessage;
    }

    public void setEncodedAuthorizationMessage(String encodedAuthorizationMessage) {
        this.encodedAuthorizationMessage = encodedAuthorizationMessage;
    }

    public SdkErrorMessage withEncodedAuthorizationMessage(String encodedAuthorizationMessage) {
        this.encodedAuthorizationMessage = encodedAuthorizationMessage;
        return this;
    }

    public List<SdkErrorMessage> getDetails() {
        return details;
    }

    public void setDetails(List<SdkErrorMessage> details) {
        this.details = details;
    }

    public SdkErrorMessage withDetails(List<SdkErrorMessage> details) {
        this.details = details;
        return this;
    }
}
