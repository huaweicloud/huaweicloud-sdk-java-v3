package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowOpsEvaluationTasksCompareResultRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_ids")

    private String taskIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ShowOpsEvaluationTasksCompareResultRequest withTaskId(String taskId) {
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

    public ShowOpsEvaluationTasksCompareResultRequest withTaskIds(String taskIds) {
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

    public ShowOpsEvaluationTasksCompareResultRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 分页查询的起始偏移量。用于指定从满足条件的第几条记录开始返回，常与 limit参数配合实现分页功能。 **约束限制：** 必须为整数，且大小在0到10,000之间。 **取值范围：** 0-10000。 **默认取值：** 0。 
     * minimum: 0
     * maximum: 10000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowOpsEvaluationTasksCompareResultRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 单次查询返回的最大记录数量。用于控制分页查询时每页显示的数据条数。 **约束限制：** 必须为整数，且大小在1到100之间。 **取值范围：** 1-100。 **默认取值：** 10。 
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpsEvaluationTasksCompareResultRequest that = (ShowOpsEvaluationTasksCompareResultRequest) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskIds, that.taskIds)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, taskIds, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsEvaluationTasksCompareResultRequest {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskIds: ").append(toIndentedString(taskIds)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
