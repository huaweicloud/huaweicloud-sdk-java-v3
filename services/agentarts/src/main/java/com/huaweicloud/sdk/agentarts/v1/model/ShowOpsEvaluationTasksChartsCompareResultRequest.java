package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowOpsEvaluationTasksChartsCompareResultRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_ids")

    private String taskIds;

    public ShowOpsEvaluationTasksChartsCompareResultRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释：** 基线评估任务的唯一标识符（ID）。 **约束限制：** 字符长度在0到100之间。 **取值范围：** 长度为0到100个字符的字符串。 **默认取值：** 不涉及。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ShowOpsEvaluationTasksChartsCompareResultRequest withTaskIds(String taskIds) {
        this.taskIds = taskIds;
        return this;
    }

    /**
     * **参数解释：** 基线评估任务的唯一标识符列表，多个任务间用逗号相隔。 **约束限制：** 字符串类型，最大长度1000字符。 **取值范围：** 字符串长度不超过1000。 **默认取值：** 不涉及。
     * @return taskIds
     */
    public String getTaskIds() {
        return taskIds;
    }

    public void setTaskIds(String taskIds) {
        this.taskIds = taskIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpsEvaluationTasksChartsCompareResultRequest that = (ShowOpsEvaluationTasksChartsCompareResultRequest) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskIds, that.taskIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, taskIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsEvaluationTasksChartsCompareResultRequest {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskIds: ").append(toIndentedString(taskIds)).append("\n");
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
