package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建流程版本的请求信息
 */
public class CreateAopWorkflowVersionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskconfig")

    private String taskconfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private String input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private String output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskflow")

    private String taskflow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskflow_type")

    private String taskflowType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aop_type")

    private String aopType;

    public CreateAopWorkflowVersionInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**: 流程名称 **约束限制**: 不涉及         **取值范围**: 不涉及 **默认值**:  不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateAopWorkflowVersionInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**: 流程的描述 **约束限制**: 不涉及         **取值范围**: 不涉及 **默认值**:  不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateAopWorkflowVersionInfo withTaskconfig(String taskconfig) {
        this.taskconfig = taskconfig;
        return this;
    }

    /**
     * **参数解释**: 流程拓扑图的参数配置 **约束限制**: 不涉及         **取值范围**: 不涉及 **默认值**:  不涉及
     * @return taskconfig
     */
    public String getTaskconfig() {
        return taskconfig;
    }

    public void setTaskconfig(String taskconfig) {
        this.taskconfig = taskconfig;
    }

    public CreateAopWorkflowVersionInfo withInput(String input) {
        this.input = input;
        return this;
    }

    /**
     * **参数解释**: 流程的输入 **约束限制**: 不涉及         **取值范围**: 不涉及 **默认值**:  不涉及
     * @return input
     */
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public CreateAopWorkflowVersionInfo withOutput(String output) {
        this.output = output;
        return this;
    }

    /**
     * **参数解释**: 流程的输出 **约束限制**: 不涉及         **取值范围**: 不涉及 **默认值**:  不涉及
     * @return output
     */
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public CreateAopWorkflowVersionInfo withTaskflow(String taskflow) {
        this.taskflow = taskflow;
        return this;
    }

    /**
     * **参数解释**: 流程的拓扑图的BASE64编码 **约束限制**: 不涉及         **取值范围**: 不涉及 **默认值**:  不涉及
     * @return taskflow
     */
    public String getTaskflow() {
        return taskflow;
    }

    public void setTaskflow(String taskflow) {
        this.taskflow = taskflow;
    }

    public CreateAopWorkflowVersionInfo withTaskflowType(String taskflowType) {
        this.taskflowType = taskflowType;
        return this;
    }

    /**
     * **参数解释**: 流程的类型 **约束限制**: 不涉及         **取值范围**: - JSON  **默认值**:  不涉及
     * @return taskflowType
     */
    public String getTaskflowType() {
        return taskflowType;
    }

    public void setTaskflowType(String taskflowType) {
        this.taskflowType = taskflowType;
    }

    public CreateAopWorkflowVersionInfo withAopType(String aopType) {
        this.aopType = aopType;
        return this;
    }

    /**
     * **参数解释**: 流程的类型 - NORMAL 通用 - SURVEY 调查 - HEMOSTASIS 止血 - EASE 缓解  **约束限制**: 不涉及         **取值范围**: - NORMAL - SURVEY - HEMOSTASIS - EASE  **默认值**:  不涉及
     * @return aopType
     */
    public String getAopType() {
        return aopType;
    }

    public void setAopType(String aopType) {
        this.aopType = aopType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAopWorkflowVersionInfo that = (CreateAopWorkflowVersionInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.taskconfig, that.taskconfig) && Objects.equals(this.input, that.input)
            && Objects.equals(this.output, that.output) && Objects.equals(this.taskflow, that.taskflow)
            && Objects.equals(this.taskflowType, that.taskflowType) && Objects.equals(this.aopType, that.aopType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, taskconfig, input, output, taskflow, taskflowType, aopType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAopWorkflowVersionInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    taskconfig: ").append(toIndentedString(taskconfig)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    taskflow: ").append(toIndentedString(taskflow)).append("\n");
        sb.append("    taskflowType: ").append(toIndentedString(taskflowType)).append("\n");
        sb.append("    aopType: ").append(toIndentedString(aopType)).append("\n");
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
