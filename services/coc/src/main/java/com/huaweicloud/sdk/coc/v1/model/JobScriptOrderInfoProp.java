package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 基本信息
 */
public class JobScriptOrderInfoProp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_uuid")

    private String scriptUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_name")

    private String scriptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_version_uuid")

    private Long scriptVersionUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_version_name")

    private String scriptVersionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_execute_batch_index")

    private Integer currentExecuteBatchIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_param")

    private ScriptExecuteParam executeParam;

    public JobScriptOrderInfoProp withScriptUuid(String scriptUuid) {
        this.scriptUuid = scriptUuid;
        return this;
    }

    /**
     * 脚本uuid
     * @return scriptUuid
     */
    public String getScriptUuid() {
        return scriptUuid;
    }

    public void setScriptUuid(String scriptUuid) {
        this.scriptUuid = scriptUuid;
    }

    public JobScriptOrderInfoProp withScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }

    /**
     * 脚本名称
     * @return scriptName
     */
    public String getScriptName() {
        return scriptName;
    }

    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }

    public JobScriptOrderInfoProp withScriptVersionUuid(Long scriptVersionUuid) {
        this.scriptVersionUuid = scriptVersionUuid;
        return this;
    }

    /**
     * 脚本版本uuid
     * @return scriptVersionUuid
     */
    public Long getScriptVersionUuid() {
        return scriptVersionUuid;
    }

    public void setScriptVersionUuid(Long scriptVersionUuid) {
        this.scriptVersionUuid = scriptVersionUuid;
    }

    public JobScriptOrderInfoProp withScriptVersionName(String scriptVersionName) {
        this.scriptVersionName = scriptVersionName;
        return this;
    }

    /**
     * 脚本版本名
     * @return scriptVersionName
     */
    public String getScriptVersionName() {
        return scriptVersionName;
    }

    public void setScriptVersionName(String scriptVersionName) {
        this.scriptVersionName = scriptVersionName;
    }

    public JobScriptOrderInfoProp withCurrentExecuteBatchIndex(Integer currentExecuteBatchIndex) {
        this.currentExecuteBatchIndex = currentExecuteBatchIndex;
        return this;
    }

    /**
     * 当前执行批次index
     * @return currentExecuteBatchIndex
     */
    public Integer getCurrentExecuteBatchIndex() {
        return currentExecuteBatchIndex;
    }

    public void setCurrentExecuteBatchIndex(Integer currentExecuteBatchIndex) {
        this.currentExecuteBatchIndex = currentExecuteBatchIndex;
    }

    public JobScriptOrderInfoProp withExecuteParam(ScriptExecuteParam executeParam) {
        this.executeParam = executeParam;
        return this;
    }

    public JobScriptOrderInfoProp withExecuteParam(Consumer<ScriptExecuteParam> executeParamSetter) {
        if (this.executeParam == null) {
            this.executeParam = new ScriptExecuteParam();
            executeParamSetter.accept(this.executeParam);
        }

        return this;
    }

    /**
     * Get executeParam
     * @return executeParam
     */
    public ScriptExecuteParam getExecuteParam() {
        return executeParam;
    }

    public void setExecuteParam(ScriptExecuteParam executeParam) {
        this.executeParam = executeParam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobScriptOrderInfoProp that = (JobScriptOrderInfoProp) obj;
        return Objects.equals(this.scriptUuid, that.scriptUuid) && Objects.equals(this.scriptName, that.scriptName)
            && Objects.equals(this.scriptVersionUuid, that.scriptVersionUuid)
            && Objects.equals(this.scriptVersionName, that.scriptVersionName)
            && Objects.equals(this.currentExecuteBatchIndex, that.currentExecuteBatchIndex)
            && Objects.equals(this.executeParam, that.executeParam);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(scriptUuid, scriptName, scriptVersionUuid, scriptVersionName, currentExecuteBatchIndex, executeParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobScriptOrderInfoProp {\n");
        sb.append("    scriptUuid: ").append(toIndentedString(scriptUuid)).append("\n");
        sb.append("    scriptName: ").append(toIndentedString(scriptName)).append("\n");
        sb.append("    scriptVersionUuid: ").append(toIndentedString(scriptVersionUuid)).append("\n");
        sb.append("    scriptVersionName: ").append(toIndentedString(scriptVersionName)).append("\n");
        sb.append("    currentExecuteBatchIndex: ").append(toIndentedString(currentExecuteBatchIndex)).append("\n");
        sb.append("    executeParam: ").append(toIndentedString(executeParam)).append("\n");
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
