package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class DeleteTestCaseCommentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private ResultValueStringForOk result;

    public DeleteTestCaseCommentResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 对外时：success|error;
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DeleteTestCaseCommentResponse withResult(ResultValueStringForOk result) {
        this.result = result;
        return this;
    }

    public DeleteTestCaseCommentResponse withResult(Consumer<ResultValueStringForOk> resultSetter) {
        if (this.result == null) {
            this.result = new ResultValueStringForOk();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public ResultValueStringForOk getResult() {
        return result;
    }

    public void setResult(ResultValueStringForOk result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteTestCaseCommentResponse that = (DeleteTestCaseCommentResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteTestCaseCommentResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
