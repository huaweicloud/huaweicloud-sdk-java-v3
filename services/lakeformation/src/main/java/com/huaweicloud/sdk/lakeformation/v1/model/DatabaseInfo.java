package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * database input when grant policy
 */
public class DatabaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tables")

    private List<TableInfo> tables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "functions")

    private List<FunctionInfo> functions = null;

    public DatabaseInfo withName(String name) {
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

    public DatabaseInfo withTables(List<TableInfo> tables) {
        this.tables = tables;
        return this;
    }

    public DatabaseInfo addTablesItem(TableInfo tablesItem) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        this.tables.add(tablesItem);
        return this;
    }

    public DatabaseInfo withTables(Consumer<List<TableInfo>> tablesSetter) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        tablesSetter.accept(this.tables);
        return this;
    }

    /**
     * 子表信息
     * @return tables
     */
    public List<TableInfo> getTables() {
        return tables;
    }

    public void setTables(List<TableInfo> tables) {
        this.tables = tables;
    }

    public DatabaseInfo withFunctions(List<FunctionInfo> functions) {
        this.functions = functions;
        return this;
    }

    public DatabaseInfo addFunctionsItem(FunctionInfo functionsItem) {
        if (this.functions == null) {
            this.functions = new ArrayList<>();
        }
        this.functions.add(functionsItem);
        return this;
    }

    public DatabaseInfo withFunctions(Consumer<List<FunctionInfo>> functionsSetter) {
        if (this.functions == null) {
            this.functions = new ArrayList<>();
        }
        functionsSetter.accept(this.functions);
        return this;
    }

    /**
     * 子方法信息
     * @return functions
     */
    public List<FunctionInfo> getFunctions() {
        return functions;
    }

    public void setFunctions(List<FunctionInfo> functions) {
        this.functions = functions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DatabaseInfo databaseInfo = (DatabaseInfo) o;
        return Objects.equals(this.name, databaseInfo.name) && Objects.equals(this.tables, databaseInfo.tables)
            && Objects.equals(this.functions, databaseInfo.functions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tables, functions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
        sb.append("    functions: ").append(toIndentedString(functions)).append("\n");
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
