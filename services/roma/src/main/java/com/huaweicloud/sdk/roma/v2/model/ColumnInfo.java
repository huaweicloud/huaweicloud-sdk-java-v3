package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 表字段详情
 */
public class ColumnInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_name")

    private String fieldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_type")

    private String fieldType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_length")

    private String fieldLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "null_able")

    private String nullAble;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_partition")

    private Boolean isPartition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary")

    private String primary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unique")

    private String unique;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "decimal_digits")

    private String decimalDigits;

    public ColumnInfo withFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * 字段名称
     * @return fieldName
     */
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public ColumnInfo withFieldType(String fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     * 字段类型
     * @return fieldType
     */
    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public ColumnInfo withFieldLength(String fieldLength) {
        this.fieldLength = fieldLength;
        return this;
    }

    /**
     * 字段长度
     * @return fieldLength
     */
    public String getFieldLength() {
        return fieldLength;
    }

    public void setFieldLength(String fieldLength) {
        this.fieldLength = fieldLength;
    }

    public ColumnInfo withNullAble(String nullAble) {
        this.nullAble = nullAble;
        return this;
    }

    /**
     * 是否允许为空
     * @return nullAble
     */
    public String getNullAble() {
        return nullAble;
    }

    public void setNullAble(String nullAble) {
        this.nullAble = nullAble;
    }

    public ColumnInfo withIsPartition(Boolean isPartition) {
        this.isPartition = isPartition;
        return this;
    }

    /**
     * 是否是分区字段
     * @return isPartition
     */
    public Boolean getIsPartition() {
        return isPartition;
    }

    public void setIsPartition(Boolean isPartition) {
        this.isPartition = isPartition;
    }

    public ColumnInfo withPrimary(String primary) {
        this.primary = primary;
        return this;
    }

    /**
     * 是否是主键字段
     * @return primary
     */
    public String getPrimary() {
        return primary;
    }

    public void setPrimary(String primary) {
        this.primary = primary;
    }

    public ColumnInfo withUnique(String unique) {
        this.unique = unique;
        return this;
    }

    /**
     * 是否是唯一键字段
     * @return unique
     */
    public String getUnique() {
        return unique;
    }

    public void setUnique(String unique) {
        this.unique = unique;
    }

    public ColumnInfo withDecimalDigits(String decimalDigits) {
        this.decimalDigits = decimalDigits;
        return this;
    }

    /**
     * 小数部分位数，非数字类型返回null
     * @return decimalDigits
     */
    public String getDecimalDigits() {
        return decimalDigits;
    }

    public void setDecimalDigits(String decimalDigits) {
        this.decimalDigits = decimalDigits;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColumnInfo that = (ColumnInfo) obj;
        return Objects.equals(this.fieldName, that.fieldName) && Objects.equals(this.fieldType, that.fieldType)
            && Objects.equals(this.fieldLength, that.fieldLength) && Objects.equals(this.nullAble, that.nullAble)
            && Objects.equals(this.isPartition, that.isPartition) && Objects.equals(this.primary, that.primary)
            && Objects.equals(this.unique, that.unique) && Objects.equals(this.decimalDigits, that.decimalDigits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldName, fieldType, fieldLength, nullAble, isPartition, primary, unique, decimalDigits);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ColumnInfo {\n");
        sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
        sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
        sb.append("    fieldLength: ").append(toIndentedString(fieldLength)).append("\n");
        sb.append("    nullAble: ").append(toIndentedString(nullAble)).append("\n");
        sb.append("    isPartition: ").append(toIndentedString(isPartition)).append("\n");
        sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
        sb.append("    unique: ").append(toIndentedString(unique)).append("\n");
        sb.append("    decimalDigits: ").append(toIndentedString(decimalDigits)).append("\n");
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
