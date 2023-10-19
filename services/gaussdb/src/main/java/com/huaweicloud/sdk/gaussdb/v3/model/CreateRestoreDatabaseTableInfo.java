package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateRestoreDatabaseTableInfo
 */
public class CreateRestoreDatabaseTableInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tables")

    private List<CreateRestoreTableInfo> tables = null;

    public CreateRestoreDatabaseTableInfo withDatabase(String database) {
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

    public CreateRestoreDatabaseTableInfo withTables(List<CreateRestoreTableInfo> tables) {
        this.tables = tables;
        return this;
    }

    public CreateRestoreDatabaseTableInfo addTablesItem(CreateRestoreTableInfo tablesItem) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        this.tables.add(tablesItem);
        return this;
    }

    public CreateRestoreDatabaseTableInfo withTables(Consumer<List<CreateRestoreTableInfo>> tablesSetter) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        tablesSetter.accept(this.tables);
        return this;
    }

    /**
     * 表信息。
     * @return tables
     */
    public List<CreateRestoreTableInfo> getTables() {
        return tables;
    }

    public void setTables(List<CreateRestoreTableInfo> tables) {
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
        CreateRestoreDatabaseTableInfo that = (CreateRestoreDatabaseTableInfo) obj;
        return Objects.equals(this.database, that.database) && Objects.equals(this.tables, that.tables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(database, tables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRestoreDatabaseTableInfo {\n");
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
