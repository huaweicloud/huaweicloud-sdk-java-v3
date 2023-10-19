package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ParamGroupHistoryResponse
 */
public class ParamGroupHistoryResponse {

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
    @JsonProperty(value = "is_applied")

    private Boolean isApplied;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applied")

    private String applied;

    public ParamGroupHistoryResponse withParameterName(String parameterName) {
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

    public ParamGroupHistoryResponse withOldValue(String oldValue) {
        this.oldValue = oldValue;
        return this;
    }

    /**
     * 修改前参数值。
     * @return oldValue
     */
    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public ParamGroupHistoryResponse withNewValue(String newValue) {
        this.newValue = newValue;
        return this;
    }

    /**
     * 修改后参数值。
     * @return newValue
     */
    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public ParamGroupHistoryResponse withUpdateResult(String updateResult) {
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

    public ParamGroupHistoryResponse withIsApplied(Boolean isApplied) {
        this.isApplied = isApplied;
        return this;
    }

    /**
     * 是否应用。 - true：是。 - false：否。
     * @return isApplied
     */
    public Boolean getIsApplied() {
        return isApplied;
    }

    public void setIsApplied(Boolean isApplied) {
        this.isApplied = isApplied;
    }

    public ParamGroupHistoryResponse withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 修改时间。格式为“yyyy-mm-ddThh:mm:ssZ”。其中，T指某个时间的开始；Z指时区偏移量，例如偏移1个小时显示为+0100。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public ParamGroupHistoryResponse withApplied(String applied) {
        this.applied = applied;
        return this;
    }

    /**
     * 应用时间。格式为“yyyy-mm-ddThh:mm:ssZ”。其中，T指某个时间的开始；Z指时区偏移量，例如偏移1个小时显示为+0100。
     * @return applied
     */
    public String getApplied() {
        return applied;
    }

    public void setApplied(String applied) {
        this.applied = applied;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ParamGroupHistoryResponse that = (ParamGroupHistoryResponse) obj;
        return Objects.equals(this.parameterName, that.parameterName) && Objects.equals(this.oldValue, that.oldValue)
            && Objects.equals(this.newValue, that.newValue) && Objects.equals(this.updateResult, that.updateResult)
            && Objects.equals(this.isApplied, that.isApplied) && Objects.equals(this.updated, that.updated)
            && Objects.equals(this.applied, that.applied);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameterName, oldValue, newValue, updateResult, isApplied, updated, applied);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParamGroupHistoryResponse {\n");
        sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
        sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
        sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
        sb.append("    updateResult: ").append(toIndentedString(updateResult)).append("\n");
        sb.append("    isApplied: ").append(toIndentedString(isApplied)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    applied: ").append(toIndentedString(applied)).append("\n");
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
