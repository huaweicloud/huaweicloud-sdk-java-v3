package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchUpdateScrumIssuesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private BatchUpdateResponseResult result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public BatchUpdateScrumIssuesResponse withResult(BatchUpdateResponseResult result) {
        this.result = result;
        return this;
    }

    public BatchUpdateScrumIssuesResponse withResult(Consumer<BatchUpdateResponseResult> resultSetter) {
        if (this.result == null) {
            this.result = new BatchUpdateResponseResult();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public BatchUpdateResponseResult getResult() {
        return result;
    }

    public void setResult(BatchUpdateResponseResult result) {
        this.result = result;
    }

    public BatchUpdateScrumIssuesResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 返回状态。 **取值范围：** success：返回成功。 error：返回失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateScrumIssuesResponse that = (BatchUpdateScrumIssuesResponse) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateScrumIssuesResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
