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
public class ListDatabaseSchemaTablesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_tables")

    private List<DatabaseForListTableResult> databaseTables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListDatabaseSchemaTablesResponse withDatabaseTables(List<DatabaseForListTableResult> databaseTables) {
        this.databaseTables = databaseTables;
        return this;
    }

    public ListDatabaseSchemaTablesResponse addDatabaseTablesItem(DatabaseForListTableResult databaseTablesItem) {
        if (this.databaseTables == null) {
            this.databaseTables = new ArrayList<>();
        }
        this.databaseTables.add(databaseTablesItem);
        return this;
    }

    public ListDatabaseSchemaTablesResponse withDatabaseTables(
        Consumer<List<DatabaseForListTableResult>> databaseTablesSetter) {
        if (this.databaseTables == null) {
            this.databaseTables = new ArrayList<>();
        }
        databaseTablesSetter.accept(this.databaseTables);
        return this;
    }

    /**
     * **参数解释**： 列表中每个元素表示一个数据库表。
     * @return databaseTables
     */
    public List<DatabaseForListTableResult> getDatabaseTables() {
        return databaseTables;
    }

    public void setDatabaseTables(List<DatabaseForListTableResult> databaseTables) {
        this.databaseTables = databaseTables;
    }

    public ListDatabaseSchemaTablesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**： 数据库表总数。 **取值范围**： 不涉及。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDatabaseSchemaTablesResponse that = (ListDatabaseSchemaTablesResponse) obj;
        return Objects.equals(this.databaseTables, that.databaseTables)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseTables, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDatabaseSchemaTablesResponse {\n");
        sb.append("    databaseTables: ").append(toIndentedString(databaseTables)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
