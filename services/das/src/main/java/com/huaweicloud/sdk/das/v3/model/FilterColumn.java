package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 筛选条件
 */
public class FilterColumn {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_value")

    private String columnValue;

    public FilterColumn withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * 筛选条件字段名
     * @return columnName
     */
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public FilterColumn withColumnValue(String columnValue) {
        this.columnValue = columnValue;
        return this;
    }

    /**
     * 筛选条件值
     * @return columnValue
     */
    public String getColumnValue() {
        return columnValue;
    }

    public void setColumnValue(String columnValue) {
        this.columnValue = columnValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FilterColumn that = (FilterColumn) obj;
        return Objects.equals(this.columnName, that.columnName) && Objects.equals(this.columnValue, that.columnValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnName, columnValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FilterColumn {\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    columnValue: ").append(toIndentedString(columnValue)).append("\n");
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
