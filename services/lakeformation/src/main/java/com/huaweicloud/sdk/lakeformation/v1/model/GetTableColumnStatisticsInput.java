package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 获取表列统计信息输入参数
 */
public class GetTableColumnStatisticsInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_names")

    private List<String> columnNames = null;

    public GetTableColumnStatisticsInput withColumnNames(List<String> columnNames) {
        this.columnNames = columnNames;
        return this;
    }

    public GetTableColumnStatisticsInput addColumnNamesItem(String columnNamesItem) {
        if (this.columnNames == null) {
            this.columnNames = new ArrayList<>();
        }
        this.columnNames.add(columnNamesItem);
        return this;
    }

    public GetTableColumnStatisticsInput withColumnNames(Consumer<List<String>> columnNamesSetter) {
        if (this.columnNames == null) {
            this.columnNames = new ArrayList<>();
        }
        columnNamesSetter.accept(this.columnNames);
        return this;
    }

    /**
     * 列名
     * @return columnNames
     */
    public List<String> getColumnNames() {
        return columnNames;
    }

    public void setColumnNames(List<String> columnNames) {
        this.columnNames = columnNames;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetTableColumnStatisticsInput getTableColumnStatisticsInput = (GetTableColumnStatisticsInput) o;
        return Objects.equals(this.columnNames, getTableColumnStatisticsInput.columnNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetTableColumnStatisticsInput {\n");
        sb.append("    columnNames: ").append(toIndentedString(columnNames)).append("\n");
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
