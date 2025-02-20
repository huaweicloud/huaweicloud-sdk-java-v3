package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ActionParamsRepairInfoObjects
 */
public class ActionParamsRepairInfoObjects {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private String schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table")

    private String table;

    public ActionParamsRepairInfoObjects withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * 数据库名称。
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public ActionParamsRepairInfoObjects withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * schema名称。
     * @return schema
     */
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public ActionParamsRepairInfoObjects withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * 表名称。
     * @return table
     */
    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActionParamsRepairInfoObjects that = (ActionParamsRepairInfoObjects) obj;
        return Objects.equals(this.database, that.database) && Objects.equals(this.schema, that.schema)
            && Objects.equals(this.table, that.table);
    }

    @Override
    public int hashCode() {
        return Objects.hash(database, schema, table);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionParamsRepairInfoObjects {\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    table: ").append(toIndentedString(table)).append("\n");
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
