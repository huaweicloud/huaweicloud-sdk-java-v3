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
public class ShowRestoreTablesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_databases")

    private Integer totalDatabases;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private List<RestoreDatabaseInfos> databases = null;

    public ShowRestoreTablesResponse withTotalDatabases(Integer totalDatabases) {
        this.totalDatabases = totalDatabases;
        return this;
    }

    /**
     * 数据库总数。
     * @return totalDatabases
     */
    public Integer getTotalDatabases() {
        return totalDatabases;
    }

    public void setTotalDatabases(Integer totalDatabases) {
        this.totalDatabases = totalDatabases;
    }

    public ShowRestoreTablesResponse withDatabases(List<RestoreDatabaseInfos> databases) {
        this.databases = databases;
        return this;
    }

    public ShowRestoreTablesResponse addDatabasesItem(RestoreDatabaseInfos databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public ShowRestoreTablesResponse withDatabases(Consumer<List<RestoreDatabaseInfos>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 数据库信息。
     * @return databases
     */
    public List<RestoreDatabaseInfos> getDatabases() {
        return databases;
    }

    public void setDatabases(List<RestoreDatabaseInfos> databases) {
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
        ShowRestoreTablesResponse that = (ShowRestoreTablesResponse) obj;
        return Objects.equals(this.totalDatabases, that.totalDatabases)
            && Objects.equals(this.databases, that.databases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalDatabases, databases);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRestoreTablesResponse {\n");
        sb.append("    totalDatabases: ").append(toIndentedString(totalDatabases)).append("\n");
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
