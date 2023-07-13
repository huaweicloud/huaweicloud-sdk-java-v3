package com.huaweicloud.sdk.core.internal.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.function.Consumer;

public class CreateTemporaryAccessKeyInEcsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credential")

    private Credential credential;

    public CreateTemporaryAccessKeyInEcsResponse withCredential(Credential credential) {
        this.credential = credential;
        return this;
    }

    public CreateTemporaryAccessKeyInEcsResponse withCredential(Consumer<Credential> credentialSetter) {
        if (this.credential == null) {
            this.credential = new Credential();
            credentialSetter.accept(this.credential);
        }

        return this;
    }

    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }
}
