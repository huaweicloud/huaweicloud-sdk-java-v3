package com.huaweicloud.sdk.eip.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreatePrePaidPublicipRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreatePrePaidPublicipRequestBody body;

    public CreatePrePaidPublicipRequest withBody(CreatePrePaidPublicipRequestBody body) {
        this.body = body;
        return this;
    }

    public CreatePrePaidPublicipRequest withBody(Consumer<CreatePrePaidPublicipRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreatePrePaidPublicipRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreatePrePaidPublicipRequestBody getBody() {
        return body;
    }

    public void setBody(CreatePrePaidPublicipRequestBody body) {
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
        CreatePrePaidPublicipRequest createPrePaidPublicipRequest = (CreatePrePaidPublicipRequest) o;
        return Objects.equals(this.body, createPrePaidPublicipRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePrePaidPublicipRequest {\n");
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
