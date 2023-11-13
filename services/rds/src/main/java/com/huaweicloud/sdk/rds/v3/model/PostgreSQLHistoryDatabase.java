package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PostgreSQL查询可恢复表的数据库信息
 */
public class PostgreSQLHistoryDatabase {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_tables")

    private Integer totalTables;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schemas")

    private List<PostgreSQLHistorySchema> schemas = null;

    public PostgreSQLHistoryDatabase withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据库名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PostgreSQLHistoryDatabase withTotalTables(Integer totalTables) {
        this.totalTables = totalTables;
        return this;
    }

    /**
     * 可恢复表的数量
     * @return totalTables
     */
    public Integer getTotalTables() {
        return totalTables;
    }

    public void setTotalTables(Integer totalTables) {
        this.totalTables = totalTables;
    }

    public PostgreSQLHistoryDatabase withSchemas(List<PostgreSQLHistorySchema> schemas) {
        this.schemas = schemas;
        return this;
    }

    public PostgreSQLHistoryDatabase addSchemasItem(PostgreSQLHistorySchema schemasItem) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        this.schemas.add(schemasItem);
        return this;
    }

    public PostgreSQLHistoryDatabase withSchemas(Consumer<List<PostgreSQLHistorySchema>> schemasSetter) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        schemasSetter.accept(this.schemas);
        return this;
    }

    /**
     * 模式信息
     * @return schemas
     */
    public List<PostgreSQLHistorySchema> getSchemas() {
        return schemas;
    }

    public void setSchemas(List<PostgreSQLHistorySchema> schemas) {
        this.schemas = schemas;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PostgreSQLHistoryDatabase that = (PostgreSQLHistoryDatabase) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.totalTables, that.totalTables)
            && Objects.equals(this.schemas, that.schemas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, totalTables, schemas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostgreSQLHistoryDatabase {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    totalTables: ").append(toIndentedString(totalTables)).append("\n");
        sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
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
