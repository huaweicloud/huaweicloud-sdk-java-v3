package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateBatchJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "USER_ID")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateBatchJobReq body;

    public CreateBatchJobRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get userId
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public CreateBatchJobRequest withBody(CreateBatchJobReq body) {
        this.body = body;
        return this;
    }

    public CreateBatchJobRequest withBody(Consumer<CreateBatchJobReq> bodySetter) {
        if (this.body == null) {
            this.body = new CreateBatchJobReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateBatchJobReq getBody() {
        return body;
    }

    public void setBody(CreateBatchJobReq body) {
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
        CreateBatchJobRequest createBatchJobRequest = (CreateBatchJobRequest) o;
        return Objects.equals(this.userId, createBatchJobRequest.userId)
            && Objects.equals(this.body, createBatchJobRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBatchJobRequest {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
