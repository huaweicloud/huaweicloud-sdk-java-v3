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
public class CheckTableConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_database_name")

    private String sourceDatabaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_database_name")

    private String targetDatabaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tbl_config_check_results")

    private List<TableConfigCheckResult> tblConfigCheckResults = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    public CheckTableConfigResponse withSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
        return this;
    }

    /**
     * GaussDB(for MySQL)数据库名。
     * @return sourceDatabaseName
     */
    public String getSourceDatabaseName() {
        return sourceDatabaseName;
    }

    public void setSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
    }

    public CheckTableConfigResponse withTargetDatabaseName(String targetDatabaseName) {
        this.targetDatabaseName = targetDatabaseName;
        return this;
    }

    /**
     * 目标数据库名。
     * @return targetDatabaseName
     */
    public String getTargetDatabaseName() {
        return targetDatabaseName;
    }

    public void setTargetDatabaseName(String targetDatabaseName) {
        this.targetDatabaseName = targetDatabaseName;
    }

    public CheckTableConfigResponse withTblConfigCheckResults(List<TableConfigCheckResult> tblConfigCheckResults) {
        this.tblConfigCheckResults = tblConfigCheckResults;
        return this;
    }

    public CheckTableConfigResponse addTblConfigCheckResultsItem(TableConfigCheckResult tblConfigCheckResultsItem) {
        if (this.tblConfigCheckResults == null) {
            this.tblConfigCheckResults = new ArrayList<>();
        }
        this.tblConfigCheckResults.add(tblConfigCheckResultsItem);
        return this;
    }

    public CheckTableConfigResponse withTblConfigCheckResults(
        Consumer<List<TableConfigCheckResult>> tblConfigCheckResultsSetter) {
        if (this.tblConfigCheckResults == null) {
            this.tblConfigCheckResults = new ArrayList<>();
        }
        tblConfigCheckResultsSetter.accept(this.tblConfigCheckResults);
        return this;
    }

    /**
     * 表配置检查结果。
     * @return tblConfigCheckResults
     */
    public List<TableConfigCheckResult> getTblConfigCheckResults() {
        return tblConfigCheckResults;
    }

    public void setTblConfigCheckResults(List<TableConfigCheckResult> tblConfigCheckResults) {
        this.tblConfigCheckResults = tblConfigCheckResults;
    }

    public CheckTableConfigResponse withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 同步任务名称。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckTableConfigResponse that = (CheckTableConfigResponse) obj;
        return Objects.equals(this.sourceDatabaseName, that.sourceDatabaseName)
            && Objects.equals(this.targetDatabaseName, that.targetDatabaseName)
            && Objects.equals(this.tblConfigCheckResults, that.tblConfigCheckResults)
            && Objects.equals(this.taskName, that.taskName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceDatabaseName, targetDatabaseName, tblConfigCheckResults, taskName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckTableConfigResponse {\n");
        sb.append("    sourceDatabaseName: ").append(toIndentedString(sourceDatabaseName)).append("\n");
        sb.append("    targetDatabaseName: ").append(toIndentedString(targetDatabaseName)).append("\n");
        sb.append("    tblConfigCheckResults: ").append(toIndentedString(tblConfigCheckResults)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
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
