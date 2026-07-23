package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteOpsEvaluationTaskCustomLabelsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_id")

    private String labelId;

    public DeleteOpsEvaluationTaskCustomLabelsRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释：** 用于标识评估任务的唯一ID。该参数在路径中指定，确保操作作用于正确的任务实例。 **约束限制：** 字符串长度为0-100。 **取值范围：** 0-100字符。 **默认取值：** 不涉及。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public DeleteOpsEvaluationTaskCustomLabelsRequest withLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }

    /**
     * **参数解释：** 与评估任务关联的特定标签ID。用于在任务范围内精确筛选或定位某类标签数据。 **约束限制：** 字符串长度为0到100个字符。 **取值范围：** 0-100字符。 **默认取值：** 不涉及。
     * @return labelId
     */
    public String getLabelId() {
        return labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteOpsEvaluationTaskCustomLabelsRequest that = (DeleteOpsEvaluationTaskCustomLabelsRequest) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.labelId, that.labelId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, labelId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteOpsEvaluationTaskCustomLabelsRequest {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
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
