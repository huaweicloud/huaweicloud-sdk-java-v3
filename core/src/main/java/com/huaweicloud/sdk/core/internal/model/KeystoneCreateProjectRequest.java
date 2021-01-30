package com.huaweicloud.sdk.core.internal.model;


import java.util.function.Consumer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class KeystoneCreateProjectRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")
    private KeystoneCreateProjectRequestBody body = null;

    public KeystoneCreateProjectRequest withBody(KeystoneCreateProjectRequestBody body) {
        this.body = body;
        return this;
    }

    public KeystoneCreateProjectRequest withBody(Consumer<KeystoneCreateProjectRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new KeystoneCreateProjectRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public KeystoneCreateProjectRequestBody getBody() {
        return body;
    }

    public void setBody(KeystoneCreateProjectRequestBody body) {
        this.body = body;
    }

}

