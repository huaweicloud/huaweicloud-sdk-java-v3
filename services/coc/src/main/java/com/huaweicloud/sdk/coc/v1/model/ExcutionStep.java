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
 * ExcutionStep
 */
public class ExcutionStep {

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

    private List<ExcutionStepInputs> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outputs")

    private List<ExcutionStepInputs> outputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private Map<String, String> properties = null;

    public ExcutionStep withExecutionStepId(String executionStepId) {
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

    public ExcutionStep withAction(String action) {
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

    public ExcutionStep withStartTime(Long startTime) {
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

    public ExcutionStep withEndTime(Long endTime) {
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

    public ExcutionStep withMessage(String message) {
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

    public ExcutionStep withName(String name) {
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

    public ExcutionStep withStatus(String status) {
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

    public ExcutionStep withInputs(List<ExcutionStepInputs> inputs) {
        this.inputs = inputs;
        return this;
    }

    public ExcutionStep addInputsItem(ExcutionStepInputs inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public ExcutionStep withInputs(Consumer<List<ExcutionStepInputs>> inputsSetter) {
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
    public List<ExcutionStepInputs> getInputs() {
        return inputs;
    }

    public void setInputs(List<ExcutionStepInputs> inputs) {
        this.inputs = inputs;
    }

    public ExcutionStep withOutputs(List<ExcutionStepInputs> outputs) {
        this.outputs = outputs;
        return this;
    }

    public ExcutionStep addOutputsItem(ExcutionStepInputs outputsItem) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        this.outputs.add(outputsItem);
        return this;
    }

    public ExcutionStep withOutputs(Consumer<List<ExcutionStepInputs>> outputsSetter) {
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
    public List<ExcutionStepInputs> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<ExcutionStepInputs> outputs) {
        this.outputs = outputs;
    }

    public ExcutionStep withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    public ExcutionStep putPropertiesItem(String key, String propertiesItem) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        this.properties.put(key, propertiesItem);
        return this;
    }

    public ExcutionStep withProperties(Consumer<Map<String, String>> propertiesSetter) {
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
        ExcutionStep that = (ExcutionStep) obj;
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
        sb.append("class ExcutionStep {\n");
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
