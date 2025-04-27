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
public class ShowRestoreAvailableTablesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_tables")

    private Integer totalTables;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private List<RestoreDatabaseInfos> databases = null;

    public ShowRestoreAvailableTablesResponse withTotalTables(Integer totalTables) {
        this.totalTables = totalTables;
        return this;
    }

    /**
     * **参数解释**:  实例总表数。  **取值范围**：  不涉及。
     * @return totalTables
     */
    public Integer getTotalTables() {
        return totalTables;
    }

    public void setTotalTables(Integer totalTables) {
        this.totalTables = totalTables;
    }

    public ShowRestoreAvailableTablesResponse withDatabases(List<RestoreDatabaseInfos> databases) {
        this.databases = databases;
        return this;
    }

    public ShowRestoreAvailableTablesResponse addDatabasesItem(RestoreDatabaseInfos databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public ShowRestoreAvailableTablesResponse withDatabases(Consumer<List<RestoreDatabaseInfos>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * **参数解释**：  数据库信息。
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
        ShowRestoreAvailableTablesResponse that = (ShowRestoreAvailableTablesResponse) obj;
        return Objects.equals(this.totalTables, that.totalTables) && Objects.equals(this.databases, that.databases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalTables, databases);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRestoreAvailableTablesResponse {\n");
        sb.append("    totalTables: ").append(toIndentedString(totalTables)).append("\n");
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
