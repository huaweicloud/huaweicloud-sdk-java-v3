package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：结果数据的列结构信息，包含列名和列类型。
 */
public class SparkSqlSchemaItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_type")

    private String columnType;

    public SparkSqlSchemaItem withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * **参数解释**：列名，用于标识结果数据中的列名称。 **取值范围**：长度为1~128个字符，例如：col1。
     * @return columnName
     */
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public SparkSqlSchemaItem withColumnType(String columnType) {
        this.columnType = columnType;
        return this;
    }

    /**
     * **参数解释**：列类型，用于标识结果数据中的列数据类型。 **取值范围**：支持的数据类型，例如：STRING、INT等。
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
        SparkSqlSchemaItem that = (SparkSqlSchemaItem) obj;
        return Objects.equals(this.columnName, that.columnName) && Objects.equals(this.columnType, that.columnType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnName, columnType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SparkSqlSchemaItem {\n");
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
