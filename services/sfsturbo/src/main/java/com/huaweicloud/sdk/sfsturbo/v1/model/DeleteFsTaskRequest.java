package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteFsTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_id")

    private String shareId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature")

    private String feature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    public DeleteFsTaskRequest withShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }

    /**
     * 文件系统id
     * @return shareId
     */
    public String getShareId() {
        return shareId;
    }

    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    public DeleteFsTaskRequest withFeature(String feature) {
        this.feature = feature;
        return this;
    }

    /**
     * 任务类型。例，DU任务取值为dir-usage
     * @return feature
     */
    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public DeleteFsTaskRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteFsTaskRequest that = (DeleteFsTaskRequest) obj;
        return Objects.equals(this.shareId, that.shareId) && Objects.equals(this.feature, that.feature)
            && Objects.equals(this.taskId, that.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shareId, feature, taskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteFsTaskRequest {\n");
        sb.append("    shareId: ").append(toIndentedString(shareId)).append("\n");
        sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
