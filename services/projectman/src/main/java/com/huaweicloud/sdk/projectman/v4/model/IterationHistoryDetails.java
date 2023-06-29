package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 操作详情
 */
public class IterationHistoryDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_field_name")

    private String operateFieldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_value")

    private String newValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_value")

    private String oldValue;

    public IterationHistoryDetails withOperateFieldName(String operateFieldName) {
        this.operateFieldName = operateFieldName;
        return this;
    }

    /**
     * 变更的字段
     * @return operateFieldName
     */
    public String getOperateFieldName() {
        return operateFieldName;
    }

    public void setOperateFieldName(String operateFieldName) {
        this.operateFieldName = operateFieldName;
    }

    public IterationHistoryDetails withNewValue(String newValue) {
        this.newValue = newValue;
        return this;
    }

    /**
     * 操作后的值
     * @return newValue
     */
    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public IterationHistoryDetails withOldValue(String oldValue) {
        this.oldValue = oldValue;
        return this;
    }

    /**
     * 操作前的值
     * @return oldValue
     */
    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IterationHistoryDetails that = (IterationHistoryDetails) obj;
        return Objects.equals(this.operateFieldName, that.operateFieldName)
            && Objects.equals(this.newValue, that.newValue) && Objects.equals(this.oldValue, that.oldValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operateFieldName, newValue, oldValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IterationHistoryDetails {\n");
        sb.append("    operateFieldName: ").append(toIndentedString(operateFieldName)).append("\n");
        sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
        sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
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
