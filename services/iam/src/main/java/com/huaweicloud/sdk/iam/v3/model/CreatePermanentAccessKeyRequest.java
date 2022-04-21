package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreatePermanentAccessKeyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreatePermanentAccessKeyRequestBody body;

    public CreatePermanentAccessKeyRequest withBody(CreatePermanentAccessKeyRequestBody body) {
        this.body = body;
        return this;
    }

    public CreatePermanentAccessKeyRequest withBody(Consumer<CreatePermanentAccessKeyRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreatePermanentAccessKeyRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreatePermanentAccessKeyRequestBody getBody() {
        return body;
    }

    public void setBody(CreatePermanentAccessKeyRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePermanentAccessKeyRequest createPermanentAccessKeyRequest = (CreatePermanentAccessKeyRequest) o;
        return Objects.equals(this.body, createPermanentAccessKeyRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePermanentAccessKeyRequest {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
