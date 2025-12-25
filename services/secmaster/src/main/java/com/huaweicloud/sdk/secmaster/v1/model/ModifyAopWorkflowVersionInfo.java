package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改流程版本的请求对象
 */
public class ModifyAopWorkflowVersionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskconfig")

    private String taskconfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskflow")

    private String taskflow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskflow_type")

    private String taskflowType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aop_type")

    private String aopType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private String input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private String output;

    public ModifyAopWorkflowVersionInfo withName(String name) {
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

    public ModifyAopWorkflowVersionInfo withDescription(String description) {
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

    public ModifyAopWorkflowVersionInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: 更新流程的动作 - pending_submit 更新流程基础信息 - pending_approval 提交审核 - not_activated 取消激活 - activated 激活流程  **约束限制**: 不涉及         **取值范围**: - pending_submit - pending_approval - not_activated - activated  **默认值**:  pending_submit
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ModifyAopWorkflowVersionInfo withTaskconfig(String taskconfig) {
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

    public ModifyAopWorkflowVersionInfo withTaskflow(String taskflow) {
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

    public ModifyAopWorkflowVersionInfo withTaskflowType(String taskflowType) {
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

    public ModifyAopWorkflowVersionInfo withAopType(String aopType) {
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

    public ModifyAopWorkflowVersionInfo withInput(String input) {
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

    public ModifyAopWorkflowVersionInfo withOutput(String output) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyAopWorkflowVersionInfo that = (ModifyAopWorkflowVersionInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.status, that.status) && Objects.equals(this.taskconfig, that.taskconfig)
            && Objects.equals(this.taskflow, that.taskflow) && Objects.equals(this.taskflowType, that.taskflowType)
            && Objects.equals(this.aopType, that.aopType) && Objects.equals(this.input, that.input)
            && Objects.equals(this.output, that.output);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, status, taskconfig, taskflow, taskflowType, aopType, input, output);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyAopWorkflowVersionInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    taskconfig: ").append(toIndentedString(taskconfig)).append("\n");
        sb.append("    taskflow: ").append(toIndentedString(taskflow)).append("\n");
        sb.append("    taskflowType: ").append(toIndentedString(taskflowType)).append("\n");
        sb.append("    aopType: ").append(toIndentedString(aopType)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
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
