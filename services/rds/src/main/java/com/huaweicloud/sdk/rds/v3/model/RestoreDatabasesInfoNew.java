package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RestoreDatabasesInfoNew
 */
public class RestoreDatabasesInfoNew {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tables")

    private List<RestoreTableInfoNew> tables = null;

    public RestoreDatabasesInfoNew withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * 库名
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public RestoreDatabasesInfoNew withTables(List<RestoreTableInfoNew> tables) {
        this.tables = tables;
        return this;
    }

    public RestoreDatabasesInfoNew addTablesItem(RestoreTableInfoNew tablesItem) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        this.tables.add(tablesItem);
        return this;
    }

    public RestoreDatabasesInfoNew withTables(Consumer<List<RestoreTableInfoNew>> tablesSetter) {
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
    public List<RestoreTableInfoNew> getTables() {
        return tables;
    }

    public void setTables(List<RestoreTableInfoNew> tables) {
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
        RestoreDatabasesInfoNew that = (RestoreDatabasesInfoNew) obj;
        return Objects.equals(this.database, that.database) && Objects.equals(this.tables, that.tables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(database, tables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreDatabasesInfoNew {\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
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
