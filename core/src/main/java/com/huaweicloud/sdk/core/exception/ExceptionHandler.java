package com.huaweicloud.sdk.core.exception;

import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.http.HttpResponse;

public interface ExceptionHandler {
    void handleException(HttpRequest httpRequest, HttpResponse httpResponse) throws ServiceResponseException;
}
