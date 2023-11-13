package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 恢复模式信息
 */
public class PostgreSQLRestoreSchema {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private String schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tables")

    private List<PostgreSQLRestoreTable> tables = null;

    public PostgreSQLRestoreSchema withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * 模式信息
     * @return schema
     */
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public PostgreSQLRestoreSchema withTables(List<PostgreSQLRestoreTable> tables) {
        this.tables = tables;
        return this;
    }

    public PostgreSQLRestoreSchema addTablesItem(PostgreSQLRestoreTable tablesItem) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        this.tables.add(tablesItem);
        return this;
    }

    public PostgreSQLRestoreSchema withTables(Consumer<List<PostgreSQLRestoreTable>> tablesSetter) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        tablesSetter.accept(this.tables);
        return this;
    }

    /**
     * 表信息
     * @return tables
     */
    public List<PostgreSQLRestoreTable> getTables() {
        return tables;
    }

    public void setTables(List<PostgreSQLRestoreTable> tables) {
        this.tables = tables;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PostgreSQLRestoreSchema that = (PostgreSQLRestoreSchema) obj;
        return Objects.equals(this.schema, that.schema) && Objects.equals(this.tables, that.tables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schema, tables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostgreSQLRestoreSchema {\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
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
