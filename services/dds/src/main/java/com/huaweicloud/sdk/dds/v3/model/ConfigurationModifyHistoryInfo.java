package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ConfigurationModifyHistoryInfo
 */
public class ConfigurationModifyHistoryInfo {

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
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applied_at")

    private String appliedAt;

    public ConfigurationModifyHistoryInfo withParameterName(String parameterName) {
        this.parameterName = parameterName;
        return this;
    }

    /**
     * 参数名称。
     * @return parameterName
     */
    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public ConfigurationModifyHistoryInfo withOldValue(String oldValue) {
        this.oldValue = oldValue;
        return this;
    }

    /**
     * 修改前的值。
     * @return oldValue
     */
    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public ConfigurationModifyHistoryInfo withNewValue(String newValue) {
        this.newValue = newValue;
        return this;
    }

    /**
     * 修改后的值。
     * @return newValue
     */
    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public ConfigurationModifyHistoryInfo withUpdateResult(String updateResult) {
        this.updateResult = updateResult;
        return this;
    }

    /**
     * 更新结果。
     * @return updateResult
     */
    public String getUpdateResult() {
        return updateResult;
    }

    public void setUpdateResult(String updateResult) {
        this.updateResult = updateResult;
    }

    public ConfigurationModifyHistoryInfo withApplied(Boolean applied) {
        this.applied = applied;
        return this;
    }

    /**
     * 是否被应用。 - true: 已被应用。 - false: 未被应用。
     * @return applied
     */
    public Boolean getApplied() {
        return applied;
    }

    public void setApplied(Boolean applied) {
        this.applied = applied;
    }

    public ConfigurationModifyHistoryInfo withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 修改时间，格式为\"yyyy-MM-ddTHH:mm:ssZ\"。其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ConfigurationModifyHistoryInfo withAppliedAt(String appliedAt) {
        this.appliedAt = appliedAt;
        return this;
    }

    /**
     * 应用时间，格式为\"yyyy-MM-ddTHH:mm:ssZ\"。其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return appliedAt
     */
    public String getAppliedAt() {
        return appliedAt;
    }

    public void setAppliedAt(String appliedAt) {
        this.appliedAt = appliedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigurationModifyHistoryInfo that = (ConfigurationModifyHistoryInfo) obj;
        return Objects.equals(this.parameterName, that.parameterName) && Objects.equals(this.oldValue, that.oldValue)
            && Objects.equals(this.newValue, that.newValue) && Objects.equals(this.updateResult, that.updateResult)
            && Objects.equals(this.applied, that.applied) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.appliedAt, that.appliedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameterName, oldValue, newValue, updateResult, applied, updatedAt, appliedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationModifyHistoryInfo {\n");
        sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
        sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
        sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
        sb.append("    updateResult: ").append(toIndentedString(updateResult)).append("\n");
        sb.append("    applied: ").append(toIndentedString(applied)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    appliedAt: ").append(toIndentedString(appliedAt)).append("\n");
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
