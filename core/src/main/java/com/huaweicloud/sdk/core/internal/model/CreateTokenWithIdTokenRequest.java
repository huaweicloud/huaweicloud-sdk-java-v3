package com.huaweicloud.sdk.core.internal.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.function.Consumer;

public class CreateTokenWithIdTokenRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Idp-Id")

    private String idpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private GetIdTokenRequestBody body;

    public CreateTokenWithIdTokenRequest withIdpId(String idpId) {
        this.idpId = idpId;
        return this;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Idp-Id")
    public String getIdpId() {
        return idpId;
    }

    public void setIdpId(String idpId) {
        this.idpId = idpId;
    }

    public CreateTokenWithIdTokenRequest withBody(GetIdTokenRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateTokenWithIdTokenRequest withBody(Consumer<GetIdTokenRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new GetIdTokenRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public GetIdTokenRequestBody getBody() {
        return body;
    }

    public void setBody(GetIdTokenRequestBody body) {
        this.body = body;
    }
}
