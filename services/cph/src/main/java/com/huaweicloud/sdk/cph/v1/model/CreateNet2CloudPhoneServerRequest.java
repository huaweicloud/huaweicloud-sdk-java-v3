package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateNet2CloudPhoneServerRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateNet2CloudPhoneServerRequestBody body;

    public CreateNet2CloudPhoneServerRequest withBody(CreateNet2CloudPhoneServerRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateNet2CloudPhoneServerRequest withBody(Consumer<CreateNet2CloudPhoneServerRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateNet2CloudPhoneServerRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateNet2CloudPhoneServerRequestBody getBody() {
        return body;
    }

    public void setBody(CreateNet2CloudPhoneServerRequestBody body) {
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
        CreateNet2CloudPhoneServerRequest createNet2CloudPhoneServerRequest = (CreateNet2CloudPhoneServerRequest) o;
        return Objects.equals(this.body, createNet2CloudPhoneServerRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNet2CloudPhoneServerRequest {\n");
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
