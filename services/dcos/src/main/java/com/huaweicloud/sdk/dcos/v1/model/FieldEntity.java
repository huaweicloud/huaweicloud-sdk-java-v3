package com.huaweicloud.sdk.dcos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 字段实体
 */
public class FieldEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_code")

    private String fieldCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_value")

    private Object fieldValue;

    public FieldEntity withFieldCode(String fieldCode) {
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

    public FieldEntity withFieldValue(Object fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }

    /**
     * 字段值
     * @return fieldValue
     */
    public Object getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(Object fieldValue) {
        this.fieldValue = fieldValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FieldEntity that = (FieldEntity) obj;
        return Objects.equals(this.fieldCode, that.fieldCode) && Objects.equals(this.fieldValue, that.fieldValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldCode, fieldValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FieldEntity {\n");
        sb.append("    fieldCode: ").append(toIndentedString(fieldCode)).append("\n");
        sb.append("    fieldValue: ").append(toIndentedString(fieldValue)).append("\n");
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
