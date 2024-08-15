package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 脚本执行相关参数
 */
public class ScriptExecuteParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceful")

    private Boolean resourceful;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_rate")

    private Double successRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_user")

    private String executeUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_params")

    private List<ScriptExecuteInputParam> scriptParams = null;

    public ScriptExecuteParam withResourceful(Boolean resourceful) {
        this.resourceful = resourceful;
        return this;
    }

    /**
     * 是否资源受限，true表示不受限，false表示受限
     * @return resourceful
     */
    public Boolean getResourceful() {
        return resourceful;
    }

    public void setResourceful(Boolean resourceful) {
        this.resourceful = resourceful;
    }

    public ScriptExecuteParam withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 超时时间，单位：秒，取值范围待定，5 < timeout < 1800
     * minimum: 5
     * maximum: 1800
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public ScriptExecuteParam withSuccessRate(Double successRate) {
        this.successRate = successRate;
        return this;
    }

    /**
     * 成功率，支持小数点后一位
     * minimum: 1
     * maximum: 1E+2
     * @return successRate
     */
    public Double getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(Double successRate) {
        this.successRate = successRate;
    }

    public ScriptExecuteParam withExecuteUser(String executeUser) {
        this.executeUser = executeUser;
        return this;
    }

    /**
     * 脚本执行用户，如：root
     * @return executeUser
     */
    public String getExecuteUser() {
        return executeUser;
    }

    public void setExecuteUser(String executeUser) {
        this.executeUser = executeUser;
    }

    public ScriptExecuteParam withScriptParams(List<ScriptExecuteInputParam> scriptParams) {
        this.scriptParams = scriptParams;
        return this;
    }

    public ScriptExecuteParam addScriptParamsItem(ScriptExecuteInputParam scriptParamsItem) {
        if (this.scriptParams == null) {
            this.scriptParams = new ArrayList<>();
        }
        this.scriptParams.add(scriptParamsItem);
        return this;
    }

    public ScriptExecuteParam withScriptParams(Consumer<List<ScriptExecuteInputParam>> scriptParamsSetter) {
        if (this.scriptParams == null) {
            this.scriptParams = new ArrayList<>();
        }
        scriptParamsSetter.accept(this.scriptParams);
        return this;
    }

    /**
     * 脚本入参列表
     * @return scriptParams
     */
    public List<ScriptExecuteInputParam> getScriptParams() {
        return scriptParams;
    }

    public void setScriptParams(List<ScriptExecuteInputParam> scriptParams) {
        this.scriptParams = scriptParams;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScriptExecuteParam that = (ScriptExecuteParam) obj;
        return Objects.equals(this.resourceful, that.resourceful) && Objects.equals(this.timeout, that.timeout)
            && Objects.equals(this.successRate, that.successRate) && Objects.equals(this.executeUser, that.executeUser)
            && Objects.equals(this.scriptParams, that.scriptParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceful, timeout, successRate, executeUser, scriptParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScriptExecuteParam {\n");
        sb.append("    resourceful: ").append(toIndentedString(resourceful)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    successRate: ").append(toIndentedString(successRate)).append("\n");
        sb.append("    executeUser: ").append(toIndentedString(executeUser)).append("\n");
        sb.append("    scriptParams: ").append(toIndentedString(scriptParams)).append("\n");
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
