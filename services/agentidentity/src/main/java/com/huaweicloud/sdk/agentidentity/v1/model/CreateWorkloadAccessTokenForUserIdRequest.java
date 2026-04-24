package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateWorkloadAccessTokenForUserIdRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateWorkloadAccessTokenForUserIdRequestBody body;

    public CreateWorkloadAccessTokenForUserIdRequest withBody(CreateWorkloadAccessTokenForUserIdRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateWorkloadAccessTokenForUserIdRequest withBody(
        Consumer<CreateWorkloadAccessTokenForUserIdRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateWorkloadAccessTokenForUserIdRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateWorkloadAccessTokenForUserIdRequestBody getBody() {
        return body;
    }

    public void setBody(CreateWorkloadAccessTokenForUserIdRequestBody body) {
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
        CreateWorkloadAccessTokenForUserIdRequest that = (CreateWorkloadAccessTokenForUserIdRequest) obj;
        return Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWorkloadAccessTokenForUserIdRequest {\n");
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
