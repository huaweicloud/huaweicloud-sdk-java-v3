package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class CheckDeployStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_id")

    private String recordId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_state")

    private Boolean stepState;

    public CheckDeployStatusRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * task_id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public CheckDeployStatusRequest withRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    /**
     * record_id
     * @return recordId
     */
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public CheckDeployStatusRequest withStepState(Boolean stepState) {
        this.stepState = stepState;
        return this;
    }

    /**
     * 是否返回部署任务各步骤的状态， true返回， false不返回
     * @return stepState
     */
    public Boolean getStepState() {
        return stepState;
    }

    public void setStepState(Boolean stepState) {
        this.stepState = stepState;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckDeployStatusRequest that = (CheckDeployStatusRequest) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.recordId, that.recordId)
            && Objects.equals(this.stepState, that.stepState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, recordId, stepState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckDeployStatusRequest {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
        sb.append("    stepState: ").append(toIndentedString(stepState)).append("\n");
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
