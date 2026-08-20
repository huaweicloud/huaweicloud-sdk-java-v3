package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchBaselineIpdIssuesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<BatchBaselineIssueResponseResult> result = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public BatchBaselineIpdIssuesResponse withResult(List<BatchBaselineIssueResponseResult> result) {
        this.result = result;
        return this;
    }

    public BatchBaselineIpdIssuesResponse addResultItem(BatchBaselineIssueResponseResult resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public BatchBaselineIpdIssuesResponse withResult(Consumer<List<BatchBaselineIssueResponseResult>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * 批量基线工作项的结果列表。
     * @return result
     */
    public List<BatchBaselineIssueResponseResult> getResult() {
        return result;
    }

    public void setResult(List<BatchBaselineIssueResponseResult> result) {
        this.result = result;
    }

    public BatchBaselineIpdIssuesResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 返回状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BatchBaselineIpdIssuesResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 操作失败原因。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchBaselineIpdIssuesResponse that = (BatchBaselineIpdIssuesResponse) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.status, that.status)
            && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, status, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchBaselineIpdIssuesResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
