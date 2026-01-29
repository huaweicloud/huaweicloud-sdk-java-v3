package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 插件执行函数版本详细信息
 */
public class ComponentActionVersionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_version_name")

    private String actionVersionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_version_number")

    private String actionVersionNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_version_desc")

    private String actionVersionDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_input")

    private String actionInput;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_output")

    private String actionOutput;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_code")

    private String actionCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_status")

    private String actionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_enable")

    private String actionEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "debug_result")

    private String debugResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "debug_output")

    private String debugOutput;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "debug_log")

    private String debugLog;

    public ComponentActionVersionInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 插件执行函数版本id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ComponentActionVersionInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ComponentActionVersionInfo withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 创建者名称
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public ComponentActionVersionInfo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ComponentActionVersionInfo withActionVersionName(String actionVersionName) {
        this.actionVersionName = actionVersionName;
        return this;
    }

    /**
     * 用户自定义执行函数版本别名
     * @return actionVersionName
     */
    public String getActionVersionName() {
        return actionVersionName;
    }

    public void setActionVersionName(String actionVersionName) {
        this.actionVersionName = actionVersionName;
    }

    public ComponentActionVersionInfo withActionVersionNumber(String actionVersionNumber) {
        this.actionVersionNumber = actionVersionNumber;
        return this;
    }

    /**
     * 内部生成的执行函数版本号，只会递增
     * @return actionVersionNumber
     */
    public String getActionVersionNumber() {
        return actionVersionNumber;
    }

    public void setActionVersionNumber(String actionVersionNumber) {
        this.actionVersionNumber = actionVersionNumber;
    }

    public ComponentActionVersionInfo withActionVersionDesc(String actionVersionDesc) {
        this.actionVersionDesc = actionVersionDesc;
        return this;
    }

    /**
     * 版本描述
     * @return actionVersionDesc
     */
    public String getActionVersionDesc() {
        return actionVersionDesc;
    }

    public void setActionVersionDesc(String actionVersionDesc) {
        this.actionVersionDesc = actionVersionDesc;
    }

    public ComponentActionVersionInfo withActionInput(String actionInput) {
        this.actionInput = actionInput;
        return this;
    }

    /**
     * 执行函数版本输入参数列表
     * @return actionInput
     */
    public String getActionInput() {
        return actionInput;
    }

    public void setActionInput(String actionInput) {
        this.actionInput = actionInput;
    }

    public ComponentActionVersionInfo withActionOutput(String actionOutput) {
        this.actionOutput = actionOutput;
        return this;
    }

    /**
     * 执行函数版本输出参数列表
     * @return actionOutput
     */
    public String getActionOutput() {
        return actionOutput;
    }

    public void setActionOutput(String actionOutput) {
        this.actionOutput = actionOutput;
    }

    public ComponentActionVersionInfo withActionCode(String actionCode) {
        this.actionCode = actionCode;
        return this;
    }

    /**
     * 执行函数代码
     * @return actionCode
     */
    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    public ComponentActionVersionInfo withActionStatus(String actionStatus) {
        this.actionStatus = actionStatus;
        return this;
    }

    /**
     * 版本审核状态
     * @return actionStatus
     */
    public String getActionStatus() {
        return actionStatus;
    }

    public void setActionStatus(String actionStatus) {
        this.actionStatus = actionStatus;
    }

    public ComponentActionVersionInfo withActionEnable(String actionEnable) {
        this.actionEnable = actionEnable;
        return this;
    }

    /**
     * 启用/禁用状态
     * @return actionEnable
     */
    public String getActionEnable() {
        return actionEnable;
    }

    public void setActionEnable(String actionEnable) {
        this.actionEnable = actionEnable;
    }

    public ComponentActionVersionInfo withDebugResult(String debugResult) {
        this.debugResult = debugResult;
        return this;
    }

    /**
     * 调试结果
     * @return debugResult
     */
    public String getDebugResult() {
        return debugResult;
    }

    public void setDebugResult(String debugResult) {
        this.debugResult = debugResult;
    }

    public ComponentActionVersionInfo withDebugOutput(String debugOutput) {
        this.debugOutput = debugOutput;
        return this;
    }

    /**
     * 调试输出
     * @return debugOutput
     */
    public String getDebugOutput() {
        return debugOutput;
    }

    public void setDebugOutput(String debugOutput) {
        this.debugOutput = debugOutput;
    }

    public ComponentActionVersionInfo withDebugLog(String debugLog) {
        this.debugLog = debugLog;
        return this;
    }

    /**
     * 调试日志
     * @return debugLog
     */
    public String getDebugLog() {
        return debugLog;
    }

    public void setDebugLog(String debugLog) {
        this.debugLog = debugLog;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComponentActionVersionInfo that = (ComponentActionVersionInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.creatorName, that.creatorName) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.actionVersionName, that.actionVersionName)
            && Objects.equals(this.actionVersionNumber, that.actionVersionNumber)
            && Objects.equals(this.actionVersionDesc, that.actionVersionDesc)
            && Objects.equals(this.actionInput, that.actionInput)
            && Objects.equals(this.actionOutput, that.actionOutput) && Objects.equals(this.actionCode, that.actionCode)
            && Objects.equals(this.actionStatus, that.actionStatus)
            && Objects.equals(this.actionEnable, that.actionEnable)
            && Objects.equals(this.debugResult, that.debugResult) && Objects.equals(this.debugOutput, that.debugOutput)
            && Objects.equals(this.debugLog, that.debugLog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            createTime,
            creatorName,
            updateTime,
            actionVersionName,
            actionVersionNumber,
            actionVersionDesc,
            actionInput,
            actionOutput,
            actionCode,
            actionStatus,
            actionEnable,
            debugResult,
            debugOutput,
            debugLog);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentActionVersionInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    actionVersionName: ").append(toIndentedString(actionVersionName)).append("\n");
        sb.append("    actionVersionNumber: ").append(toIndentedString(actionVersionNumber)).append("\n");
        sb.append("    actionVersionDesc: ").append(toIndentedString(actionVersionDesc)).append("\n");
        sb.append("    actionInput: ").append(toIndentedString(actionInput)).append("\n");
        sb.append("    actionOutput: ").append(toIndentedString(actionOutput)).append("\n");
        sb.append("    actionCode: ").append(toIndentedString(actionCode)).append("\n");
        sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
        sb.append("    actionEnable: ").append(toIndentedString(actionEnable)).append("\n");
        sb.append("    debugResult: ").append(toIndentedString(debugResult)).append("\n");
        sb.append("    debugOutput: ").append(toIndentedString(debugOutput)).append("\n");
        sb.append("    debugLog: ").append(toIndentedString(debugLog)).append("\n");
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
