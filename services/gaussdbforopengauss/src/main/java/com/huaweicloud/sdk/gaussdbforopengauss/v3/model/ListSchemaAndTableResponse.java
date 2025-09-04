package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSchemaAndTableResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_tables")

    private List<DatabaseSchemaTableResult> databaseTables = null;

    public ListSchemaAndTableResponse withDatabaseTables(List<DatabaseSchemaTableResult> databaseTables) {
        this.databaseTables = databaseTables;
        return this;
    }

    public ListSchemaAndTableResponse addDatabaseTablesItem(DatabaseSchemaTableResult databaseTablesItem) {
        if (this.databaseTables == null) {
            this.databaseTables = new ArrayList<>();
        }
        this.databaseTables.add(databaseTablesItem);
        return this;
    }

    public ListSchemaAndTableResponse withDatabaseTables(
        Consumer<List<DatabaseSchemaTableResult>> databaseTablesSetter) {
        if (this.databaseTables == null) {
            this.databaseTables = new ArrayList<>();
        }
        databaseTablesSetter.accept(this.databaseTables);
        return this;
    }

    /**
     * 数据库表信息列表
     * @return databaseTables
     */
    public List<DatabaseSchemaTableResult> getDatabaseTables() {
        return databaseTables;
    }

    public void setDatabaseTables(List<DatabaseSchemaTableResult> databaseTables) {
        this.databaseTables = databaseTables;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSchemaAndTableResponse that = (ListSchemaAndTableResponse) obj;
        return Objects.equals(this.databaseTables, that.databaseTables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseTables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSchemaAndTableResponse {\n");
        sb.append("    databaseTables: ").append(toIndentedString(databaseTables)).append("\n");
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
