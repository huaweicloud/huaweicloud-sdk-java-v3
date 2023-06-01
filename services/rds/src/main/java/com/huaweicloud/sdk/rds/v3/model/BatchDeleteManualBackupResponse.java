package com.huaweicloud.sdk.rds.v3.model;

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
public class BatchDeleteManualBackupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_results")

    private List<DeleteBackupResult> deleteResults = null;

    public BatchDeleteManualBackupResponse withDeleteResults(List<DeleteBackupResult> deleteResults) {
        this.deleteResults = deleteResults;
        return this;
    }

    public BatchDeleteManualBackupResponse addDeleteResultsItem(DeleteBackupResult deleteResultsItem) {
        if (this.deleteResults == null) {
            this.deleteResults = new ArrayList<>();
        }
        this.deleteResults.add(deleteResultsItem);
        return this;
    }

    public BatchDeleteManualBackupResponse withDeleteResults(Consumer<List<DeleteBackupResult>> deleteResultsSetter) {
        if (this.deleteResults == null) {
            this.deleteResults = new ArrayList<>();
        }
        deleteResultsSetter.accept(this.deleteResults);
        return this;
    }

    /**
     * 备份删除结果
     * @return deleteResults
     */
    public List<DeleteBackupResult> getDeleteResults() {
        return deleteResults;
    }

    public void setDeleteResults(List<DeleteBackupResult> deleteResults) {
        this.deleteResults = deleteResults;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchDeleteManualBackupResponse batchDeleteManualBackupResponse = (BatchDeleteManualBackupResponse) o;
        return Objects.equals(this.deleteResults, batchDeleteManualBackupResponse.deleteResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleteResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteManualBackupResponse {\n");
        sb.append("    deleteResults: ").append(toIndentedString(deleteResults)).append("\n");
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
