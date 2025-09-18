package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExecutionStep
 */
public class ExecutionStep {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_step_id")

    private String executionStepId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private List<ExecutionStepInputs> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outputs")

    private List<ExecutionStepInputs> outputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private Map<String, String> properties = null;

    public ExecutionStep withExecutionStepId(String executionStepId) {
        this.executionStepId = executionStepId;
        return this;
    }

    /**
     * 工单步骤id
     * @return executionStepId
     */
    public String getExecutionStepId() {
        return executionStepId;
    }

    public void setExecutionStepId(String executionStepId) {
        this.executionStepId = executionStepId;
    }

    public ExecutionStep withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 原子能力action
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ExecutionStep withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 工单步骤开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ExecutionStep withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 工单步骤结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ExecutionStep withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 工单步骤执行信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ExecutionStep withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 工单步骤名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExecutionStep withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 工单步骤执行状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ExecutionStep withInputs(List<ExecutionStepInputs> inputs) {
        this.inputs = inputs;
        return this;
    }

    public ExecutionStep addInputsItem(ExecutionStepInputs inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public ExecutionStep withInputs(Consumer<List<ExecutionStepInputs>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * 步骤输入参数
     * @return inputs
     */
    public List<ExecutionStepInputs> getInputs() {
        return inputs;
    }

    public void setInputs(List<ExecutionStepInputs> inputs) {
        this.inputs = inputs;
    }

    public ExecutionStep withOutputs(List<ExecutionStepInputs> outputs) {
        this.outputs = outputs;
        return this;
    }

    public ExecutionStep addOutputsItem(ExecutionStepInputs outputsItem) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        this.outputs.add(outputsItem);
        return this;
    }

    public ExecutionStep withOutputs(Consumer<List<ExecutionStepInputs>> outputsSetter) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        outputsSetter.accept(this.outputs);
        return this;
    }

    /**
     * 步骤输出参数
     * @return outputs
     */
    public List<ExecutionStepInputs> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<ExecutionStepInputs> outputs) {
        this.outputs = outputs;
    }

    public ExecutionStep withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    public ExecutionStep putPropertiesItem(String key, String propertiesItem) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        this.properties.put(key, propertiesItem);
        return this;
    }

    public ExecutionStep withProperties(Consumer<Map<String, String>> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /**
     * 工单步骤附加属性，map形式存储，如展示内网ip，则为{\"fixed_ip\": \"192.168.1.228\"}
     * @return properties
     */
    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecutionStep that = (ExecutionStep) obj;
        return Objects.equals(this.executionStepId, that.executionStepId) && Objects.equals(this.action, that.action)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.message, that.message) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.inputs, that.inputs)
            && Objects.equals(this.outputs, that.outputs) && Objects.equals(this.properties, that.properties);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(executionStepId, action, startTime, endTime, message, name, status, inputs, outputs, properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecutionStep {\n");
        sb.append("    executionStepId: ").append(toIndentedString(executionStepId)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
