package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ParamGroupHistoryResult
 */
public class ParamGroupHistoryResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameter_name")

    private String parameterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_value")

    private String oldValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_value")

    private String newValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_result")

    private String updateResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applied")

    private Boolean applied;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_time")

    private String applyTime;

    public ParamGroupHistoryResult withParameterName(String parameterName) {
        this.parameterName = parameterName;
        return this;
    }

    /**
     * 参数名称
     * @return parameterName
     */
    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public ParamGroupHistoryResult withOldValue(String oldValue) {
        this.oldValue = oldValue;
        return this;
    }

    /**
     * 旧值
     * @return oldValue
     */
    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public ParamGroupHistoryResult withNewValue(String newValue) {
        this.newValue = newValue;
        return this;
    }

    /**
     * 新值
     * @return newValue
     */
    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public ParamGroupHistoryResult withUpdateResult(String updateResult) {
        this.updateResult = updateResult;
        return this;
    }

    /**
     * 更新结果 成功：SUCCESS 失败： FAILED
     * @return updateResult
     */
    public String getUpdateResult() {
        return updateResult;
    }

    public void setUpdateResult(String updateResult) {
        this.updateResult = updateResult;
    }

    public ParamGroupHistoryResult withApplied(Boolean applied) {
        this.applied = applied;
        return this;
    }

    /**
     * 是否已应用 true：已应用 false：未应用
     * @return applied
     */
    public Boolean getApplied() {
        return applied;
    }

    public void setApplied(Boolean applied) {
        this.applied = applied;
    }

    public ParamGroupHistoryResult withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 修改时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ParamGroupHistoryResult withApplyTime(String applyTime) {
        this.applyTime = applyTime;
        return this;
    }

    /**
     * 应用时间
     * @return applyTime
     */
    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParamGroupHistoryResult paramGroupHistoryResult = (ParamGroupHistoryResult) o;
        return Objects.equals(this.parameterName, paramGroupHistoryResult.parameterName)
            && Objects.equals(this.oldValue, paramGroupHistoryResult.oldValue)
            && Objects.equals(this.newValue, paramGroupHistoryResult.newValue)
            && Objects.equals(this.updateResult, paramGroupHistoryResult.updateResult)
            && Objects.equals(this.applied, paramGroupHistoryResult.applied)
            && Objects.equals(this.updateTime, paramGroupHistoryResult.updateTime)
            && Objects.equals(this.applyTime, paramGroupHistoryResult.applyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameterName, oldValue, newValue, updateResult, applied, updateTime, applyTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParamGroupHistoryResult {\n");
        sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
        sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
        sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
        sb.append("    updateResult: ").append(toIndentedString(updateResult)).append("\n");
        sb.append("    applied: ").append(toIndentedString(applied)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    applyTime: ").append(toIndentedString(applyTime)).append("\n");
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
