package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchUpdateTaskStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_suit_id")

    private Integer testSuitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchUpdateTaskStatusRequestBody body;

    public BatchUpdateTaskStatusRequest withTestSuitId(Integer testSuitId) {
        this.testSuitId = testSuitId;
        return this;
    }

    /**
     * 工程id
     * minimum: 0
     * maximum: 2147483647
     * @return testSuitId
     */
    public Integer getTestSuitId() {
        return testSuitId;
    }

    public void setTestSuitId(Integer testSuitId) {
        this.testSuitId = testSuitId;
    }

    public BatchUpdateTaskStatusRequest withBody(BatchUpdateTaskStatusRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchUpdateTaskStatusRequest withBody(Consumer<BatchUpdateTaskStatusRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchUpdateTaskStatusRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchUpdateTaskStatusRequestBody getBody() {
        return body;
    }

    public void setBody(BatchUpdateTaskStatusRequestBody body) {
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
        BatchUpdateTaskStatusRequest that = (BatchUpdateTaskStatusRequest) obj;
        return Objects.equals(this.testSuitId, that.testSuitId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testSuitId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateTaskStatusRequest {\n");
        sb.append("    testSuitId: ").append(toIndentedString(testSuitId)).append("\n");
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
