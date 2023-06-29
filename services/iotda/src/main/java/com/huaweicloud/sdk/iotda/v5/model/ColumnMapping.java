package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据库的列和流转数据的对应关系。
 */
public class ColumnMapping {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "json_key")

    private String jsonKey;

    public ColumnMapping withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * **参数说明**：数据库的列名
     * @return columnName
     */
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public ColumnMapping withJsonKey(String jsonKey) {
        this.jsonKey = jsonKey;
        return this;
    }

    /**
     * **参数说明**：流转数据的属性名
     * @return jsonKey
     */
    public String getJsonKey() {
        return jsonKey;
    }

    public void setJsonKey(String jsonKey) {
        this.jsonKey = jsonKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColumnMapping that = (ColumnMapping) obj;
        return Objects.equals(this.columnName, that.columnName) && Objects.equals(this.jsonKey, that.jsonKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnName, jsonKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ColumnMapping {\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    jsonKey: ").append(toIndentedString(jsonKey)).append("\n");
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
