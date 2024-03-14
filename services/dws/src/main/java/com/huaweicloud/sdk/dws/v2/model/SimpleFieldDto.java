package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SimpleFieldDto
 */
public class SimpleFieldDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_type")

    private String columnType;

    public SimpleFieldDto withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * 指标表对应字段名称。
     * @return columnName
     */
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public SimpleFieldDto withColumnType(String columnType) {
        this.columnType = columnType;
        return this;
    }

    /**
     * 指标表对应字段类型。
     * @return columnType
     */
    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SimpleFieldDto that = (SimpleFieldDto) obj;
        return Objects.equals(this.columnName, that.columnName) && Objects.equals(this.columnType, that.columnType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnName, columnType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimpleFieldDto {\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
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
