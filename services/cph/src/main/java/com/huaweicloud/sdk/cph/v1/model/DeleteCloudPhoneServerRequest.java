package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DeleteCloudPhoneServerRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DeleteCloudPhoneServerRequestBody body;

    public DeleteCloudPhoneServerRequest withBody(DeleteCloudPhoneServerRequestBody body) {
        this.body = body;
        return this;
    }

    public DeleteCloudPhoneServerRequest withBody(Consumer<DeleteCloudPhoneServerRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new DeleteCloudPhoneServerRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DeleteCloudPhoneServerRequestBody getBody() {
        return body;
    }

    public void setBody(DeleteCloudPhoneServerRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteCloudPhoneServerRequest that = (DeleteCloudPhoneServerRequest) obj;
        return Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteCloudPhoneServerRequest {\n");
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
