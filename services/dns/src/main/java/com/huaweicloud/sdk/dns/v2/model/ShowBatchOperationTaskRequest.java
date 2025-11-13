package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowBatchOperationTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_item_limit")

    private Integer errorItemLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_item_offset")

    private Integer errorItemOffset;

    public ShowBatchOperationTaskRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释：** 批量操作任务的ID。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ShowBatchOperationTaskRequest withErrorItemLimit(Integer errorItemLimit) {
        this.errorItemLimit = errorItemLimit;
        return this;
    }

    /**
     * **参数解释：** 分页查询时配置每页返回的失败条目个数。 **约束限制：** 不涉及。 **取值范围：** 0~500。 **默认取值：** 500
     * minimum: 0
     * maximum: 500
     * @return errorItemLimit
     */
    public Integer getErrorItemLimit() {
        return errorItemLimit;
    }

    public void setErrorItemLimit(Integer errorItemLimit) {
        this.errorItemLimit = errorItemLimit;
    }

    public ShowBatchOperationTaskRequest withErrorItemOffset(Integer errorItemOffset) {
        this.errorItemOffset = errorItemOffset;
        return this;
    }

    /**
     * **参数解释：** 分页查询起始偏移量，表示从偏移量的下一个失败条目开始查询。 **约束限制：** 不涉及。 **取值范围：** 0~2147483647。 **默认取值：** 0
     * minimum: 0
     * maximum: 2147483647
     * @return errorItemOffset
     */
    public Integer getErrorItemOffset() {
        return errorItemOffset;
    }

    public void setErrorItemOffset(Integer errorItemOffset) {
        this.errorItemOffset = errorItemOffset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBatchOperationTaskRequest that = (ShowBatchOperationTaskRequest) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.errorItemLimit, that.errorItemLimit)
            && Objects.equals(this.errorItemOffset, that.errorItemOffset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, errorItemLimit, errorItemOffset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBatchOperationTaskRequest {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    errorItemLimit: ").append(toIndentedString(errorItemLimit)).append("\n");
        sb.append("    errorItemOffset: ").append(toIndentedString(errorItemOffset)).append("\n");
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
