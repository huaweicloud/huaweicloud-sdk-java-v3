package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 导入血缘请求体。
 */
public class TableConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private String schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table")

    private String table;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_exist")

    private Boolean isExist;

    public TableConfig withDatabase(String database) {
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

    public TableConfig withSchema(String schema) {
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

    public TableConfig withTable(String table) {
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

    public TableConfig withIsExist(Boolean isExist) {
        this.isExist = isExist;
        return this;
    }

    /**
     * 是否存在。
     * @return isExist
     */
    public Boolean getIsExist() {
        return isExist;
    }

    public void setIsExist(Boolean isExist) {
        this.isExist = isExist;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TableConfig that = (TableConfig) obj;
        return Objects.equals(this.database, that.database) && Objects.equals(this.schema, that.schema)
            && Objects.equals(this.table, that.table) && Objects.equals(this.isExist, that.isExist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(database, schema, table, isExist);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableConfig {\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    table: ").append(toIndentedString(table)).append("\n");
        sb.append("    isExist: ").append(toIndentedString(isExist)).append("\n");
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
