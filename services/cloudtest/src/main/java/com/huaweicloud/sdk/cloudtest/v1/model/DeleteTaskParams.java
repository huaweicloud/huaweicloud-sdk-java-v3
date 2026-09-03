package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteTaskParams
 */
public class DeleteTaskParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "planId")

    private String planId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskIds")

    private List<String> taskIds = null;

    public DeleteTaskParams withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * 测试计划id
     * @return planId
     */
    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public DeleteTaskParams withTaskIds(List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }

    public DeleteTaskParams addTaskIdsItem(String taskIdsItem) {
        if (this.taskIds == null) {
            this.taskIds = new ArrayList<>();
        }
        this.taskIds.add(taskIdsItem);
        return this;
    }

    public DeleteTaskParams withTaskIds(Consumer<List<String>> taskIdsSetter) {
        if (this.taskIds == null) {
            this.taskIds = new ArrayList<>();
        }
        taskIdsSetter.accept(this.taskIds);
        return this;
    }

    /**
     * 任务id列表信息
     * @return taskIds
     */
    public List<String> getTaskIds() {
        return taskIds;
    }

    public void setTaskIds(List<String> taskIds) {
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
        DeleteTaskParams that = (DeleteTaskParams) obj;
        return Objects.equals(this.planId, that.planId) && Objects.equals(this.taskIds, that.taskIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planId, taskIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteTaskParams {\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
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
