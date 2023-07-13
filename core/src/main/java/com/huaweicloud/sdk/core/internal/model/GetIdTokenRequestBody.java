package com.huaweicloud.sdk.core.internal.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.function.Consumer;

public class GetIdTokenRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth")

    private GetIdTokenAuthParams auth;

    public GetIdTokenRequestBody withAuth(GetIdTokenAuthParams auth) {
        this.auth = auth;
        return this;
    }

    public GetIdTokenRequestBody withAuth(Consumer<GetIdTokenAuthParams> authSetter) {
        if (this.auth == null) {
            this.auth = new GetIdTokenAuthParams();
            authSetter.accept(this.auth);
        }

        return this;
    }

    public GetIdTokenAuthParams getAuth() {
        return auth;
    }

    public void setAuth(GetIdTokenAuthParams auth) {
        this.auth = auth;
    }
}
