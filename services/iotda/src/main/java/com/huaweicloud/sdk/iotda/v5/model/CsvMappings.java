package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** csv文件格式转换列表 */
public class CsvMappings {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "json_key")

    private String jsonKey;

    public CsvMappings withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /** **参数说明**：OBS文件中的列名
     * 
     * @return columnName */
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public CsvMappings withJsonKey(String jsonKey) {
        this.jsonKey = jsonKey;
        return this;
    }

    /** **参数说明**：流转数据的属性名
     * 
     * @return jsonKey */
    public String getJsonKey() {
        return jsonKey;
    }

    public void setJsonKey(String jsonKey) {
        this.jsonKey = jsonKey;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CsvMappings csvMappings = (CsvMappings) o;
        return Objects.equals(this.columnName, csvMappings.columnName)
            && Objects.equals(this.jsonKey, csvMappings.jsonKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnName, jsonKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CsvMappings {\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    jsonKey: ").append(toIndentedString(jsonKey)).append("\n");
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
