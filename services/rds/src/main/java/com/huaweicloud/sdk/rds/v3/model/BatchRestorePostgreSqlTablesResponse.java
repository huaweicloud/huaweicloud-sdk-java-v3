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
public class BatchRestorePostgreSqlTablesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_result")

    private List<RestoreResult> restoreResult = null;

    public BatchRestorePostgreSqlTablesResponse withRestoreResult(List<RestoreResult> restoreResult) {
        this.restoreResult = restoreResult;
        return this;
    }

    public BatchRestorePostgreSqlTablesResponse addRestoreResultItem(RestoreResult restoreResultItem) {
        if (this.restoreResult == null) {
            this.restoreResult = new ArrayList<>();
        }
        this.restoreResult.add(restoreResultItem);
        return this;
    }

    public BatchRestorePostgreSqlTablesResponse withRestoreResult(Consumer<List<RestoreResult>> restoreResultSetter) {
        if (this.restoreResult == null) {
            this.restoreResult = new ArrayList<>();
        }
        restoreResultSetter.accept(this.restoreResult);
        return this;
    }

    /**
     * 表信息
     * @return restoreResult
     */
    public List<RestoreResult> getRestoreResult() {
        return restoreResult;
    }

    public void setRestoreResult(List<RestoreResult> restoreResult) {
        this.restoreResult = restoreResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchRestorePostgreSqlTablesResponse that = (BatchRestorePostgreSqlTablesResponse) obj;
        return Objects.equals(this.restoreResult, that.restoreResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restoreResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRestorePostgreSqlTablesResponse {\n");
        sb.append("    restoreResult: ").append(toIndentedString(restoreResult)).append("\n");
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
