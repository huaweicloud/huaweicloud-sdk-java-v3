package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 工作流待办事项。
 */
public class WorkflowTodo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_id")

    private String workflowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_name")

    private String workflowName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_id")

    private String executionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_name")

    private String stepName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_title")

    private String stepTitle;

    /**
     * 状态。
     */
    public static final class StatusEnum {

        /**
         * Enum WAIT_INPUTS for value: "wait_inputs"
         */
        public static final StatusEnum WAIT_INPUTS = new StatusEnum("wait_inputs");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("wait_inputs", WAIT_INPUTS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    public WorkflowTodo withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 时间。
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public WorkflowTodo withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 运行时长。
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public WorkflowTodo withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    /**
     * Workflow工作流ID。
     * @return workflowId
     */
    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    public WorkflowTodo withWorkflowName(String workflowName) {
        this.workflowName = workflowName;
        return this;
    }

    /**
     * 工作流名称。填写1-64位，仅包含英文、数字、下划线（_）和中划线（-），并且以英文开头的名称。
     * @return workflowName
     */
    public String getWorkflowName() {
        return workflowName;
    }

    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    public WorkflowTodo withExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * 工作流执行ID。
     * @return executionId
     */
    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public WorkflowTodo withStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }

    /**
     * 节点名称。
     * @return stepName
     */
    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    public WorkflowTodo withStepTitle(String stepTitle) {
        this.stepTitle = stepTitle;
        return this;
    }

    /**
     * 节点的Title。
     * @return stepTitle
     */
    public String getStepTitle() {
        return stepTitle;
    }

    public void setStepTitle(String stepTitle) {
        this.stepTitle = stepTitle;
    }

    public WorkflowTodo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 状态。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkflowTodo that = (WorkflowTodo) obj;
        return Objects.equals(this.time, that.time) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.workflowId, that.workflowId) && Objects.equals(this.workflowName, that.workflowName)
            && Objects.equals(this.executionId, that.executionId) && Objects.equals(this.stepName, that.stepName)
            && Objects.equals(this.stepTitle, that.stepTitle) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, duration, workflowId, workflowName, executionId, stepName, stepTitle, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowTodo {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
        sb.append("    workflowName: ").append(toIndentedString(workflowName)).append("\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    stepName: ").append(toIndentedString(stepName)).append("\n");
        sb.append("    stepTitle: ").append(toIndentedString(stepTitle)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
