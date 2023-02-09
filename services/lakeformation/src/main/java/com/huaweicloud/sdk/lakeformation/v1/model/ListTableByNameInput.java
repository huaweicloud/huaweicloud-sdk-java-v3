package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 表列表
 */
public class ListTableByNameInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_names")

    private List<String> tableNames = null;

    public ListTableByNameInput withTableNames(List<String> tableNames) {
        this.tableNames = tableNames;
        return this;
    }

    public ListTableByNameInput addTableNamesItem(String tableNamesItem) {
        if (this.tableNames == null) {
            this.tableNames = new ArrayList<>();
        }
        this.tableNames.add(tableNamesItem);
        return this;
    }

    public ListTableByNameInput withTableNames(Consumer<List<String>> tableNamesSetter) {
        if (this.tableNames == null) {
            this.tableNames = new ArrayList<>();
        }
        tableNamesSetter.accept(this.tableNames);
        return this;
    }

    /**
     * 被查询表的名字列表
     * @return tableNames
     */
    public List<String> getTableNames() {
        return tableNames;
    }

    public void setTableNames(List<String> tableNames) {
        this.tableNames = tableNames;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTableByNameInput listTableByNameInput = (ListTableByNameInput) o;
        return Objects.equals(this.tableNames, listTableByNameInput.tableNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTableByNameInput {\n");
        sb.append("    tableNames: ").append(toIndentedString(tableNames)).append("\n");
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
