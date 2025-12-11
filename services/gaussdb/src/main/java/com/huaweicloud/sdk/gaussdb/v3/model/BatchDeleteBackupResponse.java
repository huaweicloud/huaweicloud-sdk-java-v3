package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class BatchDeleteBackupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_results")

    private List<DeleteBackupResult> failedResults = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_count")

    private Integer successCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_count")

    private Integer failedCount;

    public BatchDeleteBackupResponse withFailedResults(List<DeleteBackupResult> failedResults) {
        this.failedResults = failedResults;
        return this;
    }

    public BatchDeleteBackupResponse addFailedResultsItem(DeleteBackupResult failedResultsItem) {
        if (this.failedResults == null) {
            this.failedResults = new ArrayList<>();
        }
        this.failedResults.add(failedResultsItem);
        return this;
    }

    public BatchDeleteBackupResponse withFailedResults(Consumer<List<DeleteBackupResult>> failedResultsSetter) {
        if (this.failedResults == null) {
            this.failedResults = new ArrayList<>();
        }
        failedResultsSetter.accept(this.failedResults);
        return this;
    }

    /**
     * **参数解释**：  备份删除异常信息。  **取值范围**：  当所有备份删除成功，该值是空。
     * @return failedResults
     */
    public List<DeleteBackupResult> getFailedResults() {
        return failedResults;
    }

    public void setFailedResults(List<DeleteBackupResult> failedResults) {
        this.failedResults = failedResults;
    }

    public BatchDeleteBackupResponse withSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    /**
     * **参数解释**：  删除成功的数量。  **取值范围**：  0-50。
     * @return successCount
     */
    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public BatchDeleteBackupResponse withFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }

    /**
     * **参数解释**：  删除失败的数量。  **取值范围**：  0-50。
     * @return failedCount
     */
    public Integer getFailedCount() {
        return failedCount;
    }

    public void setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteBackupResponse that = (BatchDeleteBackupResponse) obj;
        return Objects.equals(this.failedResults, that.failedResults)
            && Objects.equals(this.successCount, that.successCount)
            && Objects.equals(this.failedCount, that.failedCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(failedResults, successCount, failedCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteBackupResponse {\n");
        sb.append("    failedResults: ").append(toIndentedString(failedResults)).append("\n");
        sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
        sb.append("    failedCount: ").append(toIndentedString(failedCount)).append("\n");
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
