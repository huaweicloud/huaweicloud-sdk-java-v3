package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 任务参数配置历史修改响应体
 */
public class ListJobHistoryParameter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_value")

    private String oldValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_value")

    private String newValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_update_success")

    private Boolean isUpdateSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_applied")

    private Boolean isApplied;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_time")

    private String applyTime;

    public ListJobHistoryParameter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListJobHistoryParameter withOldValue(String oldValue) {
        this.oldValue = oldValue;
        return this;
    }

    /**
     * 旧参数值。
     * @return oldValue
     */
    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public ListJobHistoryParameter withNewValue(String newValue) {
        this.newValue = newValue;
        return this;
    }

    /**
     * 新参数值。
     * @return newValue
     */
    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public ListJobHistoryParameter withIsUpdateSuccess(Boolean isUpdateSuccess) {
        this.isUpdateSuccess = isUpdateSuccess;
        return this;
    }

    /**
     * 更新结果。true：成功，false：失败
     * @return isUpdateSuccess
     */
    public Boolean getIsUpdateSuccess() {
        return isUpdateSuccess;
    }

    public void setIsUpdateSuccess(Boolean isUpdateSuccess) {
        this.isUpdateSuccess = isUpdateSuccess;
    }

    public ListJobHistoryParameter withIsApplied(Boolean isApplied) {
        this.isApplied = isApplied;
        return this;
    }

    /**
     * 是否已应用。true：已应用，false：未应用
     * @return isApplied
     */
    public Boolean getIsApplied() {
        return isApplied;
    }

    public void setIsApplied(Boolean isApplied) {
        this.isApplied = isApplied;
    }

    public ListJobHistoryParameter withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 参数修改时间。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ListJobHistoryParameter withApplyTime(String applyTime) {
        this.applyTime = applyTime;
        return this;
    }

    /**
     * 参数应用时间。
     * @return applyTime
     */
    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListJobHistoryParameter that = (ListJobHistoryParameter) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.oldValue, that.oldValue)
            && Objects.equals(this.newValue, that.newValue)
            && Objects.equals(this.isUpdateSuccess, that.isUpdateSuccess)
            && Objects.equals(this.isApplied, that.isApplied) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.applyTime, that.applyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, oldValue, newValue, isUpdateSuccess, isApplied, updateTime, applyTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJobHistoryParameter {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
        sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
        sb.append("    isUpdateSuccess: ").append(toIndentedString(isUpdateSuccess)).append("\n");
        sb.append("    isApplied: ").append(toIndentedString(isApplied)).append("\n");
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
