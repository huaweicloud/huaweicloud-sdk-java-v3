package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * table input when grant policy
 */
public class TableInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "columns")

    private ColumnInfo columns;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public TableInfo withColumns(ColumnInfo columns) {
        this.columns = columns;
        return this;
    }

    public TableInfo withColumns(Consumer<ColumnInfo> columnsSetter) {
        if (this.columns == null) {
            this.columns = new ColumnInfo();
            columnsSetter.accept(this.columns);
        }

        return this;
    }

    /**
     * Get columns
     * @return columns
     */
    public ColumnInfo getColumns() {
        return columns;
    }

    public void setColumns(ColumnInfo columns) {
        this.columns = columns;
    }

    public TableInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * table name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TableInfo that = (TableInfo) obj;
        return Objects.equals(this.columns, that.columns) && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columns, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableInfo {\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
