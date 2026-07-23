package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * **参数解释：** 单个导入任务的详细执行状态。 **取值范围：** 不涉及。 
 */
public class OpsImportTaskOutput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private String progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_count")

    private String successCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private String totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_detail")

    private String errorDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    public OpsImportTaskOutput withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释：** 导入任务的唯一标识符。 **取值范围：** 符合通用唯一识别码(UUID)标准的字符串。 
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public OpsImportTaskOutput withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 导入任务的当前运行状态。 **取值范围：** - PENDING: 等待中 - RUNNING: 运行中 - SUCCESS: 成功 - FAILED: 失败 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public OpsImportTaskOutput withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * **参数解释：** 任务执行的百分比进度。 **取值范围：** 0%到100%。 
     * @return progress
     */
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public OpsImportTaskOutput withSuccessCount(String successCount) {
        this.successCount = successCount;
        return this;
    }

    /**
     * **参数解释：** 导入成功的条目数量。 **取值范围：** 大于等于0的整数字符串。 
     * @return successCount
     */
    public String getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(String successCount) {
        this.successCount = successCount;
    }

    public OpsImportTaskOutput withTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释：** 本次导入任务涉及的总数据条目数量。 **取值范围：** 0-100的整数字符串。 
     * @return totalCount
     */
    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public OpsImportTaskOutput withErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }

    /**
     * **参数解释：** 当任务状态为 FAILED 时，记录的详细错误信息或异常堆栈。 **取值范围：** 任意描述性字符串。 
     * @return errorDetail
     */
    public String getErrorDetail() {
        return errorDetail;
    }

    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }

    public OpsImportTaskOutput withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 导入任务的发起时间。 **取值范围：** UTC时间格式字符串。 
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsImportTaskOutput that = (OpsImportTaskOutput) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.progress, that.progress) && Objects.equals(this.successCount, that.successCount)
            && Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.errorDetail, that.errorDetail)
            && Objects.equals(this.createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, status, progress, successCount, totalCount, errorDetail, createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsImportTaskOutput {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    errorDetail: ").append(toIndentedString(errorDetail)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
