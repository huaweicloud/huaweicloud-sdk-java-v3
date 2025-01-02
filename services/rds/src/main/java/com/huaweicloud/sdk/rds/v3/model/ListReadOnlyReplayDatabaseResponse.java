package com.huaweicloud.sdk.rds.v3.model;

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
public class ListReadOnlyReplayDatabaseResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_limit")

    private Integer databaseLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_tables")

    private Integer totalTables;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_limit")

    private Integer tableLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private List<DelayRestoreDatabase> databases = null;

    public ListReadOnlyReplayDatabaseResponse withDatabaseLimit(Integer databaseLimit) {
        this.databaseLimit = databaseLimit;
        return this;
    }

    /**
     * 每次返回的库上限数量
     * @return databaseLimit
     */
    public Integer getDatabaseLimit() {
        return databaseLimit;
    }

    public void setDatabaseLimit(Integer databaseLimit) {
        this.databaseLimit = databaseLimit;
    }

    public ListReadOnlyReplayDatabaseResponse withTotalTables(Integer totalTables) {
        this.totalTables = totalTables;
        return this;
    }

    /**
     * 返回的总表数量
     * @return totalTables
     */
    public Integer getTotalTables() {
        return totalTables;
    }

    public void setTotalTables(Integer totalTables) {
        this.totalTables = totalTables;
    }

    public ListReadOnlyReplayDatabaseResponse withTableLimit(Integer tableLimit) {
        this.tableLimit = tableLimit;
        return this;
    }

    /**
     * 每次返回的表上限数量
     * @return tableLimit
     */
    public Integer getTableLimit() {
        return tableLimit;
    }

    public void setTableLimit(Integer tableLimit) {
        this.tableLimit = tableLimit;
    }

    public ListReadOnlyReplayDatabaseResponse withDatabases(List<DelayRestoreDatabase> databases) {
        this.databases = databases;
        return this;
    }

    public ListReadOnlyReplayDatabaseResponse addDatabasesItem(DelayRestoreDatabase databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public ListReadOnlyReplayDatabaseResponse withDatabases(Consumer<List<DelayRestoreDatabase>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 可恢复到主实例的数据库列表
     * @return databases
     */
    public List<DelayRestoreDatabase> getDatabases() {
        return databases;
    }

    public void setDatabases(List<DelayRestoreDatabase> databases) {
        this.databases = databases;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListReadOnlyReplayDatabaseResponse that = (ListReadOnlyReplayDatabaseResponse) obj;
        return Objects.equals(this.databaseLimit, that.databaseLimit)
            && Objects.equals(this.totalTables, that.totalTables) && Objects.equals(this.tableLimit, that.tableLimit)
            && Objects.equals(this.databases, that.databases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseLimit, totalTables, tableLimit, databases);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListReadOnlyReplayDatabaseResponse {\n");
        sb.append("    databaseLimit: ").append(toIndentedString(databaseLimit)).append("\n");
        sb.append("    totalTables: ").append(toIndentedString(totalTables)).append("\n");
        sb.append("    tableLimit: ").append(toIndentedString(tableLimit)).append("\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
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
