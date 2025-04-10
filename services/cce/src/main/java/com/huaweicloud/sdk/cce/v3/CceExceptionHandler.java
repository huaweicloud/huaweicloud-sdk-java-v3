package com.huaweicloud.sdk.cce.v3;

import com.fasterxml.jackson.core.type.TypeReference;
import com.huaweicloud.sdk.core.exception.ExceptionHandler;
import com.huaweicloud.sdk.core.exception.SdkErrorMessage;
import com.huaweicloud.sdk.core.exception.ServiceResponseException;
import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.http.HttpResponse;
import com.huaweicloud.sdk.core.utils.JsonUtils;

import java.util.Map;
import java.util.Objects;

public class CceExceptionHandler implements ExceptionHandler {
    @Override
    public void handleException(HttpRequest httpRequest, HttpResponse httpResponse) throws ServiceResponseException {

        if (httpResponse.getStatusCode() < 400) {
            return;
        }

        SdkErrorMessage errorMessage = new SdkErrorMessage(httpResponse.getStatusCode());
        errorMessage.setRequestId(httpResponse.getHeader("X-Request-Id"));
        Map<String, ?> map = JsonUtils.toObject(httpResponse.getBodyAsString(), new TypeReference<Map<String, ?>>() {
        });
        if (Objects.isNull(map)) {
            errorMessage.setErrorCode(String.valueOf(httpResponse.getStatusCode()));
            errorMessage.setErrorMsg(httpRequest.getBodyAsString());
            throw new ServiceResponseException(httpResponse.getStatusCode(), errorMessage);
        }

        // error_code
        Object errCode = map.get("error_code");
        if (errCode == null || errCode.toString().isEmpty()) {
            errCode = map.get("errorCode");
        }
        if (errCode != null) {
            errorMessage.setErrorCode(errCode.toString());
        }

        // error_message
        Object errMsg = map.get("error_msg");
        if (errMsg == null || errMsg.toString().isEmpty()) {
            errMsg = map.get("errorMessage");
        }
        if (errMsg != null) {
            errorMessage.setErrorMsg(errMsg.toString());
        }
        Object message = map.get("message");
        if (message != null && !message.toString().isEmpty()) {
            if (errorMessage.getErrorMsg().isEmpty()) {
                errorMessage.setErrorMsg(message.toString());
            } else {
                errorMessage.setErrorMsg(errorMessage.getErrorMsg() + ", " + message);
            }
        }

        // encoded_authorization_message
        Object authMsg = map.get("encoded_authorization_message");
        if (authMsg != null && !authMsg.toString().isEmpty()) {
            errorMessage.setEncodedAuthorizationMessage(authMsg.toString());
        }
        throw new ServiceResponseException(httpResponse.getStatusCode(), errorMessage);
    }
}