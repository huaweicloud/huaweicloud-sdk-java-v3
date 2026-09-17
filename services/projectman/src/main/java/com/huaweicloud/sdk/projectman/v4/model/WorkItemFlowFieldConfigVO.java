package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作项字段配置
 */
public class WorkItemFlowFieldConfigVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_code")

    private String fieldCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_type")

    private String valueType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_operation")

    private String fieldOperation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_value")

    private WorkItemFlowFieldValueVO fieldValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "required")

    private Boolean required;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_range")

    private WorkItemFlowFieldRangeVO fieldRange;

    public WorkItemFlowFieldConfigVO withFieldCode(String fieldCode) {
        this.fieldCode = fieldCode;
        return this;
    }

    /**
     * 字段编码
     * @return fieldCode
     */
    public String getFieldCode() {
        return fieldCode;
    }

    public void setFieldCode(String fieldCode) {
        this.fieldCode = fieldCode;
    }

    public WorkItemFlowFieldConfigVO withValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    /**
     * 字段值类型
     * @return valueType
     */
    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public WorkItemFlowFieldConfigVO withFieldOperation(String fieldOperation) {
        this.fieldOperation = fieldOperation;
        return this;
    }

    /**
     * 字段操作类型
     * @return fieldOperation
     */
    public String getFieldOperation() {
        return fieldOperation;
    }

    public void setFieldOperation(String fieldOperation) {
        this.fieldOperation = fieldOperation;
    }

    public WorkItemFlowFieldConfigVO withFieldValue(WorkItemFlowFieldValueVO fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }

    public WorkItemFlowFieldConfigVO withFieldValue(Consumer<WorkItemFlowFieldValueVO> fieldValueSetter) {
        if (this.fieldValue == null) {
            this.fieldValue = new WorkItemFlowFieldValueVO();
            fieldValueSetter.accept(this.fieldValue);
        }

        return this;
    }

    /**
     * Get fieldValue
     * @return fieldValue
     */
    public WorkItemFlowFieldValueVO getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(WorkItemFlowFieldValueVO fieldValue) {
        this.fieldValue = fieldValue;
    }

    public WorkItemFlowFieldConfigVO withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * 是否必填
     * @return required
     */
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public WorkItemFlowFieldConfigVO withFieldRange(WorkItemFlowFieldRangeVO fieldRange) {
        this.fieldRange = fieldRange;
        return this;
    }

    public WorkItemFlowFieldConfigVO withFieldRange(Consumer<WorkItemFlowFieldRangeVO> fieldRangeSetter) {
        if (this.fieldRange == null) {
            this.fieldRange = new WorkItemFlowFieldRangeVO();
            fieldRangeSetter.accept(this.fieldRange);
        }

        return this;
    }

    /**
     * Get fieldRange
     * @return fieldRange
     */
    public WorkItemFlowFieldRangeVO getFieldRange() {
        return fieldRange;
    }

    public void setFieldRange(WorkItemFlowFieldRangeVO fieldRange) {
        this.fieldRange = fieldRange;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkItemFlowFieldConfigVO that = (WorkItemFlowFieldConfigVO) obj;
        return Objects.equals(this.fieldCode, that.fieldCode) && Objects.equals(this.valueType, that.valueType)
            && Objects.equals(this.fieldOperation, that.fieldOperation)
            && Objects.equals(this.fieldValue, that.fieldValue) && Objects.equals(this.required, that.required)
            && Objects.equals(this.fieldRange, that.fieldRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldCode, valueType, fieldOperation, fieldValue, required, fieldRange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkItemFlowFieldConfigVO {\n");
        sb.append("    fieldCode: ").append(toIndentedString(fieldCode)).append("\n");
        sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
        sb.append("    fieldOperation: ").append(toIndentedString(fieldOperation)).append("\n");
        sb.append("    fieldValue: ").append(toIndentedString(fieldValue)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    fieldRange: ").append(toIndentedString(fieldRange)).append("\n");
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
