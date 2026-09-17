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
public class BatchUpdateIpdIssuesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<IssueBatchOperateEntitiesResult> result = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public BatchUpdateIpdIssuesResponse withResult(List<IssueBatchOperateEntitiesResult> result) {
        this.result = result;
        return this;
    }

    public BatchUpdateIpdIssuesResponse addResultItem(IssueBatchOperateEntitiesResult resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public BatchUpdateIpdIssuesResponse withResult(Consumer<List<IssueBatchOperateEntitiesResult>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * **参数解释**： 批量编辑的结果。
     * @return result
     */
    public List<IssueBatchOperateEntitiesResult> getResult() {
        return result;
    }

    public void setResult(List<IssueBatchOperateEntitiesResult> result) {
        this.result = result;
    }

    public BatchUpdateIpdIssuesResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 返回状态。 **取值范围**： - success：响应成功 - error：响应失败
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BatchUpdateIpdIssuesResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释**： 操作失败原因。 **取值范围**： 不涉及
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
        BatchUpdateIpdIssuesResponse that = (BatchUpdateIpdIssuesResponse) obj;
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
        sb.append("class BatchUpdateIpdIssuesResponse {\n");
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
