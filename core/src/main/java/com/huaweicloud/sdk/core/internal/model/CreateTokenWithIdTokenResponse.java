package com.huaweicloud.sdk.core.internal.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.function.Consumer;

public class CreateTokenWithIdTokenResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    private ScopedTokenInfo token;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Subject-Token")

    private String subjectToken;

    public CreateTokenWithIdTokenResponse withToken(ScopedTokenInfo token) {
        this.token = token;
        return this;
    }

    public CreateTokenWithIdTokenResponse withToken(Consumer<ScopedTokenInfo> tokenSetter) {
        if (this.token == null) {
            this.token = new ScopedTokenInfo();
            tokenSetter.accept(this.token);
        }

        return this;
    }

    public ScopedTokenInfo getToken() {
        return token;
    }

    public void setToken(ScopedTokenInfo token) {
        this.token = token;
    }

    public CreateTokenWithIdTokenResponse withSubjectToken(String subjectToken) {
        this.subjectToken = subjectToken;
        return this;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Subject-Token")
    public String getSubjectToken() {
        return subjectToken;
    }

    public void setSubjectToken(String subjectToken) {
        this.subjectToken = subjectToken;
    }
}
