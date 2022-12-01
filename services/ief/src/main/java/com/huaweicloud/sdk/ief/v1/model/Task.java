package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 任务项详情
 */
public class Task {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private Integer createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_id")

    private String targetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension_info")

    private List<Extension> extensionInfo = null;

    public Task withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务项ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public Task withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务项名称
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Task withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务项状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Task withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 任务项失败的原因
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Task withCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间戳
     * @return createdAt
     */
    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Task withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * 批量处理对象ID
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public Task withExtensionInfo(List<Extension> extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }

    public Task addExtensionInfoItem(Extension extensionInfoItem) {
        if (this.extensionInfo == null) {
            this.extensionInfo = new ArrayList<>();
        }
        this.extensionInfo.add(extensionInfoItem);
        return this;
    }

    public Task withExtensionInfo(Consumer<List<Extension>> extensionInfoSetter) {
        if (this.extensionInfo == null) {
            this.extensionInfo = new ArrayList<>();
        }
        extensionInfoSetter.accept(this.extensionInfo);
        return this;
    }

    /**
     * 批量处理对象基本信息
     * @return extensionInfo
     */
    public List<Extension> getExtensionInfo() {
        return extensionInfo;
    }

    public void setExtensionInfo(List<Extension> extensionInfo) {
        this.extensionInfo = extensionInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Task task = (Task) o;
        return Objects.equals(this.taskId, task.taskId) && Objects.equals(this.taskName, task.taskName)
            && Objects.equals(this.status, task.status) && Objects.equals(this.reason, task.reason)
            && Objects.equals(this.createdAt, task.createdAt) && Objects.equals(this.targetId, task.targetId)
            && Objects.equals(this.extensionInfo, task.extensionInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, taskName, status, reason, createdAt, targetId, extensionInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Task {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
        sb.append("    extensionInfo: ").append(toIndentedString(extensionInfo)).append("\n");
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
