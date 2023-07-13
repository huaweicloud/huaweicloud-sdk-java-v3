package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteGroupScheduledTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_group_id")

    private String scalingGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_task_id")

    private String scheduledTaskId;

    public DeleteGroupScheduledTaskRequest withScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }

    /**
     * 伸缩组ID
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return scalingGroupId;
    }

    public void setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
    }

    public DeleteGroupScheduledTaskRequest withScheduledTaskId(String scheduledTaskId) {
        this.scheduledTaskId = scheduledTaskId;
        return this;
    }

    /**
     * 计划任务ID
     * @return scheduledTaskId
     */
    public String getScheduledTaskId() {
        return scheduledTaskId;
    }

    public void setScheduledTaskId(String scheduledTaskId) {
        this.scheduledTaskId = scheduledTaskId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteGroupScheduledTaskRequest that = (DeleteGroupScheduledTaskRequest) obj;
        return Objects.equals(this.scalingGroupId, that.scalingGroupId)
            && Objects.equals(this.scheduledTaskId, that.scheduledTaskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scalingGroupId, scheduledTaskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteGroupScheduledTaskRequest {\n");
        sb.append("    scalingGroupId: ").append(toIndentedString(scalingGroupId)).append("\n");
        sb.append("    scheduledTaskId: ").append(toIndentedString(scheduledTaskId)).append("\n");
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
