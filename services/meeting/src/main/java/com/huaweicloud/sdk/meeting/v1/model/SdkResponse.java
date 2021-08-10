package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/** 功能描述
 *
 * @since 2020-06-11 */

public class SdkResponse {

    @JsonIgnore
    private int httpStatusCode;

    public SdkResponse() {
    }

    public SdkResponse(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }
}
