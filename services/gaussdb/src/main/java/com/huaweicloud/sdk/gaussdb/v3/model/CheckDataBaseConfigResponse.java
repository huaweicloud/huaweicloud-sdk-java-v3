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
public class CheckDataBaseConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_database_name")

    private String sourceDatabaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_config_check_results")

    private List<DbConfigCheckResult> sourceDbConfigCheckResults = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_database_name")

    private String targetDatabaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_db_config_check_results")

    private List<DbConfigCheckResult> targetDbConfigCheckResults = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    public CheckDataBaseConfigResponse withSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
        return this;
    }

    /**
     * TaurusDB数据库名称。
     * @return sourceDatabaseName
     */
    public String getSourceDatabaseName() {
        return sourceDatabaseName;
    }

    public void setSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
    }

    public CheckDataBaseConfigResponse withSourceDbConfigCheckResults(
        List<DbConfigCheckResult> sourceDbConfigCheckResults) {
        this.sourceDbConfigCheckResults = sourceDbConfigCheckResults;
        return this;
    }

    public CheckDataBaseConfigResponse addSourceDbConfigCheckResultsItem(
        DbConfigCheckResult sourceDbConfigCheckResultsItem) {
        if (this.sourceDbConfigCheckResults == null) {
            this.sourceDbConfigCheckResults = new ArrayList<>();
        }
        this.sourceDbConfigCheckResults.add(sourceDbConfigCheckResultsItem);
        return this;
    }

    public CheckDataBaseConfigResponse withSourceDbConfigCheckResults(
        Consumer<List<DbConfigCheckResult>> sourceDbConfigCheckResultsSetter) {
        if (this.sourceDbConfigCheckResults == null) {
            this.sourceDbConfigCheckResults = new ArrayList<>();
        }
        sourceDbConfigCheckResultsSetter.accept(this.sourceDbConfigCheckResults);
        return this;
    }

    /**
     * TaurusDB数据库配置检查结果。
     * @return sourceDbConfigCheckResults
     */
    public List<DbConfigCheckResult> getSourceDbConfigCheckResults() {
        return sourceDbConfigCheckResults;
    }

    public void setSourceDbConfigCheckResults(List<DbConfigCheckResult> sourceDbConfigCheckResults) {
        this.sourceDbConfigCheckResults = sourceDbConfigCheckResults;
    }

    public CheckDataBaseConfigResponse withTargetDatabaseName(String targetDatabaseName) {
        this.targetDatabaseName = targetDatabaseName;
        return this;
    }

    /**
     * 目标数据库名称。
     * @return targetDatabaseName
     */
    public String getTargetDatabaseName() {
        return targetDatabaseName;
    }

    public void setTargetDatabaseName(String targetDatabaseName) {
        this.targetDatabaseName = targetDatabaseName;
    }

    public CheckDataBaseConfigResponse withTargetDbConfigCheckResults(
        List<DbConfigCheckResult> targetDbConfigCheckResults) {
        this.targetDbConfigCheckResults = targetDbConfigCheckResults;
        return this;
    }

    public CheckDataBaseConfigResponse addTargetDbConfigCheckResultsItem(
        DbConfigCheckResult targetDbConfigCheckResultsItem) {
        if (this.targetDbConfigCheckResults == null) {
            this.targetDbConfigCheckResults = new ArrayList<>();
        }
        this.targetDbConfigCheckResults.add(targetDbConfigCheckResultsItem);
        return this;
    }

    public CheckDataBaseConfigResponse withTargetDbConfigCheckResults(
        Consumer<List<DbConfigCheckResult>> targetDbConfigCheckResultsSetter) {
        if (this.targetDbConfigCheckResults == null) {
            this.targetDbConfigCheckResults = new ArrayList<>();
        }
        targetDbConfigCheckResultsSetter.accept(this.targetDbConfigCheckResults);
        return this;
    }

    /**
     * 目标数据库配置检查结果。
     * @return targetDbConfigCheckResults
     */
    public List<DbConfigCheckResult> getTargetDbConfigCheckResults() {
        return targetDbConfigCheckResults;
    }

    public void setTargetDbConfigCheckResults(List<DbConfigCheckResult> targetDbConfigCheckResults) {
        this.targetDbConfigCheckResults = targetDbConfigCheckResults;
    }

    public CheckDataBaseConfigResponse withTaskName(String taskName) {
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
        CheckDataBaseConfigResponse that = (CheckDataBaseConfigResponse) obj;
        return Objects.equals(this.sourceDatabaseName, that.sourceDatabaseName)
            && Objects.equals(this.sourceDbConfigCheckResults, that.sourceDbConfigCheckResults)
            && Objects.equals(this.targetDatabaseName, that.targetDatabaseName)
            && Objects.equals(this.targetDbConfigCheckResults, that.targetDbConfigCheckResults)
            && Objects.equals(this.taskName, that.taskName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceDatabaseName,
            sourceDbConfigCheckResults,
            targetDatabaseName,
            targetDbConfigCheckResults,
            taskName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckDataBaseConfigResponse {\n");
        sb.append("    sourceDatabaseName: ").append(toIndentedString(sourceDatabaseName)).append("\n");
        sb.append("    sourceDbConfigCheckResults: ").append(toIndentedString(sourceDbConfigCheckResults)).append("\n");
        sb.append("    targetDatabaseName: ").append(toIndentedString(targetDatabaseName)).append("\n");
        sb.append("    targetDbConfigCheckResults: ").append(toIndentedString(targetDbConfigCheckResults)).append("\n");
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
