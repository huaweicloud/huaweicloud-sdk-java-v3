package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateDatakeyWithoutPlaintextRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateDatakeyRequestBody body;

    public CreateDatakeyWithoutPlaintextRequest withBody(CreateDatakeyRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateDatakeyWithoutPlaintextRequest withBody(Consumer<CreateDatakeyRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateDatakeyRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateDatakeyRequestBody getBody() {
        return body;
    }

    public void setBody(CreateDatakeyRequestBody body) {
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
        CreateDatakeyWithoutPlaintextRequest createDatakeyWithoutPlaintextRequest =
            (CreateDatakeyWithoutPlaintextRequest) o;
        return Objects.equals(this.body, createDatakeyWithoutPlaintextRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDatakeyWithoutPlaintextRequest {\n");
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
