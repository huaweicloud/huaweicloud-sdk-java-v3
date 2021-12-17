package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** MultiTaskColumnInfo */
public class MultiTaskColumnInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_name")

    private String fieldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_type")

    private String fieldType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_length")

    private String fieldLength;

    public MultiTaskColumnInfo withFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /** 字段名
     * 
     * @return fieldName */
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public MultiTaskColumnInfo withFieldType(String fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /** 字段类型
     * 
     * @return fieldType */
    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public MultiTaskColumnInfo withFieldLength(String fieldLength) {
        this.fieldLength = fieldLength;
        return this;
    }

    /** 字段长度
     * 
     * @return fieldLength */
    public String getFieldLength() {
        return fieldLength;
    }

    public void setFieldLength(String fieldLength) {
        this.fieldLength = fieldLength;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MultiTaskColumnInfo multiTaskColumnInfo = (MultiTaskColumnInfo) o;
        return Objects.equals(this.fieldName, multiTaskColumnInfo.fieldName)
            && Objects.equals(this.fieldType, multiTaskColumnInfo.fieldType)
            && Objects.equals(this.fieldLength, multiTaskColumnInfo.fieldLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldName, fieldType, fieldLength);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiTaskColumnInfo {\n");
        sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
        sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
        sb.append("    fieldLength: ").append(toIndentedString(fieldLength)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
