package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 恢复库信息
 */
public class PostgreSQLRestoreDatabase {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schemas")

    private List<PostgreSQLRestoreSchema> schemas = null;

    public PostgreSQLRestoreDatabase withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * 数据库名
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public PostgreSQLRestoreDatabase withSchemas(List<PostgreSQLRestoreSchema> schemas) {
        this.schemas = schemas;
        return this;
    }

    public PostgreSQLRestoreDatabase addSchemasItem(PostgreSQLRestoreSchema schemasItem) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        this.schemas.add(schemasItem);
        return this;
    }

    public PostgreSQLRestoreDatabase withSchemas(Consumer<List<PostgreSQLRestoreSchema>> schemasSetter) {
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
    public List<PostgreSQLRestoreSchema> getSchemas() {
        return schemas;
    }

    public void setSchemas(List<PostgreSQLRestoreSchema> schemas) {
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
        PostgreSQLRestoreDatabase that = (PostgreSQLRestoreDatabase) obj;
        return Objects.equals(this.database, that.database) && Objects.equals(this.schemas, that.schemas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(database, schemas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostgreSQLRestoreDatabase {\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
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
