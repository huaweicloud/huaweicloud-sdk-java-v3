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
public class ModifyDataSyncResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_database_name")

    private String sourceDatabaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_database_name")

    private String targetDatabaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_config_check_results")

    private List<DbConfigCheckResult> sourceDbConfigCheckResults = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tbl_config_check_results")

    private List<TableConfigCheckResult> tblConfigCheckResults = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    public ModifyDataSyncResponse withSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
        return this;
    }

    /**
     * **参数解释**：  TaurusDB数据库名。  **取值范围**：  长度限制3~1024位，仅支持英文大小写字母、数字以及下划线。
     * @return sourceDatabaseName
     */
    public String getSourceDatabaseName() {
        return sourceDatabaseName;
    }

    public void setSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
    }

    public ModifyDataSyncResponse withTargetDatabaseName(String targetDatabaseName) {
        this.targetDatabaseName = targetDatabaseName;
        return this;
    }

    /**
     * **参数解释**：  目标数据库名。  **取值范围**：  长度限制3~1024位，仅支持英文大小写字母、数字以及下划线。
     * @return targetDatabaseName
     */
    public String getTargetDatabaseName() {
        return targetDatabaseName;
    }

    public void setTargetDatabaseName(String targetDatabaseName) {
        this.targetDatabaseName = targetDatabaseName;
    }

    public ModifyDataSyncResponse withSourceDbConfigCheckResults(List<DbConfigCheckResult> sourceDbConfigCheckResults) {
        this.sourceDbConfigCheckResults = sourceDbConfigCheckResults;
        return this;
    }

    public ModifyDataSyncResponse addSourceDbConfigCheckResultsItem(
        DbConfigCheckResult sourceDbConfigCheckResultsItem) {
        if (this.sourceDbConfigCheckResults == null) {
            this.sourceDbConfigCheckResults = new ArrayList<>();
        }
        this.sourceDbConfigCheckResults.add(sourceDbConfigCheckResultsItem);
        return this;
    }

    public ModifyDataSyncResponse withSourceDbConfigCheckResults(
        Consumer<List<DbConfigCheckResult>> sourceDbConfigCheckResultsSetter) {
        if (this.sourceDbConfigCheckResults == null) {
            this.sourceDbConfigCheckResults = new ArrayList<>();
        }
        sourceDbConfigCheckResultsSetter.accept(this.sourceDbConfigCheckResults);
        return this;
    }

    /**
     * **参数解释**：  TaurusDB数据库配置检查结果。  **取值范围**：  不涉及。
     * @return sourceDbConfigCheckResults
     */
    public List<DbConfigCheckResult> getSourceDbConfigCheckResults() {
        return sourceDbConfigCheckResults;
    }

    public void setSourceDbConfigCheckResults(List<DbConfigCheckResult> sourceDbConfigCheckResults) {
        this.sourceDbConfigCheckResults = sourceDbConfigCheckResults;
    }

    public ModifyDataSyncResponse withTblConfigCheckResults(List<TableConfigCheckResult> tblConfigCheckResults) {
        this.tblConfigCheckResults = tblConfigCheckResults;
        return this;
    }

    public ModifyDataSyncResponse addTblConfigCheckResultsItem(TableConfigCheckResult tblConfigCheckResultsItem) {
        if (this.tblConfigCheckResults == null) {
            this.tblConfigCheckResults = new ArrayList<>();
        }
        this.tblConfigCheckResults.add(tblConfigCheckResultsItem);
        return this;
    }

    public ModifyDataSyncResponse withTblConfigCheckResults(
        Consumer<List<TableConfigCheckResult>> tblConfigCheckResultsSetter) {
        if (this.tblConfigCheckResults == null) {
            this.tblConfigCheckResults = new ArrayList<>();
        }
        tblConfigCheckResultsSetter.accept(this.tblConfigCheckResults);
        return this;
    }

    /**
     * **参数解释**：  表配置检查结果。  **取值范围**：  不涉及。
     * @return tblConfigCheckResults
     */
    public List<TableConfigCheckResult> getTblConfigCheckResults() {
        return tblConfigCheckResults;
    }

    public void setTblConfigCheckResults(List<TableConfigCheckResult> tblConfigCheckResults) {
        this.tblConfigCheckResults = tblConfigCheckResults;
    }

    public ModifyDataSyncResponse withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * **参数解释**：  同步任务名称。  **取值范围**：  长度限制3~128位，仅支持英文大小写字母、数字以及下划线。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ModifyDataSyncResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**：  修改同步配置工作流ID。  **取值范围**：  不涉及。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyDataSyncResponse that = (ModifyDataSyncResponse) obj;
        return Objects.equals(this.sourceDatabaseName, that.sourceDatabaseName)
            && Objects.equals(this.targetDatabaseName, that.targetDatabaseName)
            && Objects.equals(this.sourceDbConfigCheckResults, that.sourceDbConfigCheckResults)
            && Objects.equals(this.tblConfigCheckResults, that.tblConfigCheckResults)
            && Objects.equals(this.taskName, that.taskName) && Objects.equals(this.jobId, that.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceDatabaseName,
            targetDatabaseName,
            sourceDbConfigCheckResults,
            tblConfigCheckResults,
            taskName,
            jobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyDataSyncResponse {\n");
        sb.append("    sourceDatabaseName: ").append(toIndentedString(sourceDatabaseName)).append("\n");
        sb.append("    targetDatabaseName: ").append(toIndentedString(targetDatabaseName)).append("\n");
        sb.append("    sourceDbConfigCheckResults: ").append(toIndentedString(sourceDbConfigCheckResults)).append("\n");
        sb.append("    tblConfigCheckResults: ").append(toIndentedString(tblConfigCheckResults)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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
