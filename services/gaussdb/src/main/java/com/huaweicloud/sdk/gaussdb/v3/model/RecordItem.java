package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：  单个无锁变更任务信息。  **取值范围**：  不涉及。
 */
public class RecordItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_content")

    private List<OnlineDDLTaskContentItem> taskContent = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private Long createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ended_at")

    private Long endedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private String taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alter_stage")

    private Integer alterStage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "percentage")

    private Float percentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_reason")

    private String errorReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temp_table_name")

    private String tempTableName;

    public RecordItem withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释**：  无锁变更任务记录标识。  **取值范围**：  不涉及。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public RecordItem withTaskContent(List<OnlineDDLTaskContentItem> taskContent) {
        this.taskContent = taskContent;
        return this;
    }

    public RecordItem addTaskContentItem(OnlineDDLTaskContentItem taskContentItem) {
        if (this.taskContent == null) {
            this.taskContent = new ArrayList<>();
        }
        this.taskContent.add(taskContentItem);
        return this;
    }

    public RecordItem withTaskContent(Consumer<List<OnlineDDLTaskContentItem>> taskContentSetter) {
        if (this.taskContent == null) {
            this.taskContent = new ArrayList<>();
        }
        taskContentSetter.accept(this.taskContent);
        return this;
    }

    /**
     * **参数解释**：  无锁变更任务详细内容。
     * @return taskContent
     */
    public List<OnlineDDLTaskContentItem> getTaskContent() {
        return taskContent;
    }

    public void setTaskContent(List<OnlineDDLTaskContentItem> taskContent) {
        this.taskContent = taskContent;
    }

    public RecordItem withCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释**：  无锁变更任务创建时间，13位毫秒时间戳。  **取值范围**： 不涉及。
     * @return createdAt
     */
    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public RecordItem withEndedAt(Long endedAt) {
        this.endedAt = endedAt;
        return this;
    }

    /**
     * **参数解释**：  无锁变更任务结束时间，13位毫秒时间戳。  **取值范围**： 不涉及。
     * @return endedAt
     */
    public Long getEndedAt() {
        return endedAt;
    }

    public void setEndedAt(Long endedAt) {
        this.endedAt = endedAt;
    }

    public RecordItem withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * **参数解释**：  无锁变更任务执行状态。  **取值范围**：   - checking：表示正在执行预检查步骤。   - check successful： 表示预检查步骤执行成功。   - check failed： 表示预检查步骤执行失败。   - altering： 表示正在任务正在执行变更步骤。   - alter successful： 表示变更步骤执行成功。   - alter failed： 表示变更步骤执行失败。   - stopping：表示正在执行停止任务步骤。   - stop successful： 表示执行停止步骤成功。   - stop failed： 表示执行停止步骤失败。   - cleaning： 表示正在执行清理临时表步骤。   - clean successful： 表示清理临时表步骤执行成功。   - clean failed： 表示清理临时表步骤执行失败。
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public RecordItem withAlterStage(Integer alterStage) {
        this.alterStage = alterStage;
        return this;
    }

    /**
     * **参数解释**：  表示数据库内核层面无锁变更任务运行阶段。  **取值范围**：   - 0：表示无锁变更任务未开始。  - 1：表示无锁变更任务已完成资源初始化。  - 2：表示无锁变更任务正在运行。  - 3：表示无锁变更任务已完成。
     * @return alterStage
     */
    public Integer getAlterStage() {
        return alterStage;
    }

    public void setAlterStage(Integer alterStage) {
        this.alterStage = alterStage;
    }

    public RecordItem withPercentage(Float percentage) {
        this.percentage = percentage;
        return this;
    }

    /**
     * **参数解释**：  无锁变更任务百分比进度，1位小数精度。  **取值范围**：  0.0-100.0。
     * minimum: 0
     * maximum: 1E+2
     * @return percentage
     */
    public Float getPercentage() {
        return percentage;
    }

    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }

    public RecordItem withErrorReason(String errorReason) {
        this.errorReason = errorReason;
        return this;
    }

    /**
     * **参数解释**：  无锁变更任务失败原因，任务执行失败时有返回值。  **取值范围**： 不涉及。
     * @return errorReason
     */
    public String getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }

    public RecordItem withTempTableName(String tempTableName) {
        this.tempTableName = tempTableName;
        return this;
    }

    /**
     * **参数解释**：  无锁变更任务临时表名称，关闭临时表自动清理时有返回值。  **取值范围**： 不涉及。
     * @return tempTableName
     */
    public String getTempTableName() {
        return tempTableName;
    }

    public void setTempTableName(String tempTableName) {
        this.tempTableName = tempTableName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecordItem that = (RecordItem) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskContent, that.taskContent)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.endedAt, that.endedAt)
            && Objects.equals(this.taskStatus, that.taskStatus) && Objects.equals(this.alterStage, that.alterStage)
            && Objects.equals(this.percentage, that.percentage) && Objects.equals(this.errorReason, that.errorReason)
            && Objects.equals(this.tempTableName, that.tempTableName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            taskContent,
            createdAt,
            endedAt,
            taskStatus,
            alterStage,
            percentage,
            errorReason,
            tempTableName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecordItem {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskContent: ").append(toIndentedString(taskContent)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    endedAt: ").append(toIndentedString(endedAt)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    alterStage: ").append(toIndentedString(alterStage)).append("\n");
        sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
        sb.append("    errorReason: ").append(toIndentedString(errorReason)).append("\n");
        sb.append("    tempTableName: ").append(toIndentedString(tempTableName)).append("\n");
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
