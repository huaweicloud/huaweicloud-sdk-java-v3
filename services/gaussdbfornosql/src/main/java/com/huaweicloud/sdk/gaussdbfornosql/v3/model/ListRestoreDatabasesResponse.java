package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

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
public class ListRestoreDatabasesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_names")

    private List<String> databaseNames = null;

    public ListRestoreDatabasesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总记录数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListRestoreDatabasesResponse withDatabaseNames(List<String> databaseNames) {
        this.databaseNames = databaseNames;
        return this;
    }

    public ListRestoreDatabasesResponse addDatabaseNamesItem(String databaseNamesItem) {
        if (this.databaseNames == null) {
            this.databaseNames = new ArrayList<>();
        }
        this.databaseNames.add(databaseNamesItem);
        return this;
    }

    public ListRestoreDatabasesResponse withDatabaseNames(Consumer<List<String>> databaseNamesSetter) {
        if (this.databaseNames == null) {
            this.databaseNames = new ArrayList<>();
        }
        databaseNamesSetter.accept(this.databaseNames);
        return this;
    }

    /**
     * 数据库名称列表。
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
        ListRestoreDatabasesResponse that = (ListRestoreDatabasesResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.databaseNames, that.databaseNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, databaseNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRestoreDatabasesResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
