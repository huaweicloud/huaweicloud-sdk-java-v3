package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class ShowTableMetaInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_meta_infos")

    private List<TableMetaInfo> tableMetaInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_names")

    private List<String> tableNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_names")

    private List<String> databaseNames = null;

    public ShowTableMetaInfoResponse withTableMetaInfos(List<TableMetaInfo> tableMetaInfos) {
        this.tableMetaInfos = tableMetaInfos;
        return this;
    }

    public ShowTableMetaInfoResponse addTableMetaInfosItem(TableMetaInfo tableMetaInfosItem) {
        if (this.tableMetaInfos == null) {
            this.tableMetaInfos = new ArrayList<>();
        }
        this.tableMetaInfos.add(tableMetaInfosItem);
        return this;
    }

    public ShowTableMetaInfoResponse withTableMetaInfos(Consumer<List<TableMetaInfo>> tableMetaInfosSetter) {
        if (this.tableMetaInfos == null) {
            this.tableMetaInfos = new ArrayList<>();
        }
        tableMetaInfosSetter.accept(this.tableMetaInfos);
        return this;
    }

    /**
     * 要版本升级的批量实例。
     * @return tableMetaInfos
     */
    public List<TableMetaInfo> getTableMetaInfos() {
        return tableMetaInfos;
    }

    public void setTableMetaInfos(List<TableMetaInfo> tableMetaInfos) {
        this.tableMetaInfos = tableMetaInfos;
    }

    public ShowTableMetaInfoResponse withTableNames(List<String> tableNames) {
        this.tableNames = tableNames;
        return this;
    }

    public ShowTableMetaInfoResponse addTableNamesItem(String tableNamesItem) {
        if (this.tableNames == null) {
            this.tableNames = new ArrayList<>();
        }
        this.tableNames.add(tableNamesItem);
        return this;
    }

    public ShowTableMetaInfoResponse withTableNames(Consumer<List<String>> tableNamesSetter) {
        if (this.tableNames == null) {
            this.tableNames = new ArrayList<>();
        }
        tableNamesSetter.accept(this.tableNames);
        return this;
    }

    /**
     * 数据表名称
     * @return tableNames
     */
    public List<String> getTableNames() {
        return tableNames;
    }

    public void setTableNames(List<String> tableNames) {
        this.tableNames = tableNames;
    }

    public ShowTableMetaInfoResponse withDatabaseNames(List<String> databaseNames) {
        this.databaseNames = databaseNames;
        return this;
    }

    public ShowTableMetaInfoResponse addDatabaseNamesItem(String databaseNamesItem) {
        if (this.databaseNames == null) {
            this.databaseNames = new ArrayList<>();
        }
        this.databaseNames.add(databaseNamesItem);
        return this;
    }

    public ShowTableMetaInfoResponse withDatabaseNames(Consumer<List<String>> databaseNamesSetter) {
        if (this.databaseNames == null) {
            this.databaseNames = new ArrayList<>();
        }
        databaseNamesSetter.accept(this.databaseNames);
        return this;
    }

    /**
     * 数据库名称
     * @return databaseNames
     */
    public List<String> getDatabaseNames() {
        return databaseNames;
    }

    public void setDatabaseNames(List<String> databaseNames) {
        this.databaseNames = databaseNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTableMetaInfoResponse that = (ShowTableMetaInfoResponse) obj;
        return Objects.equals(this.tableMetaInfos, that.tableMetaInfos)
            && Objects.equals(this.tableNames, that.tableNames)
            && Objects.equals(this.databaseNames, that.databaseNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableMetaInfos, tableNames, databaseNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTableMetaInfoResponse {\n");
        sb.append("    tableMetaInfos: ").append(toIndentedString(tableMetaInfos)).append("\n");
        sb.append("    tableNames: ").append(toIndentedString(tableNames)).append("\n");
        sb.append("    databaseNames: ").append(toIndentedString(databaseNames)).append("\n");
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
