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
public class ListRestoreTablesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_names")

    private List<String> tableNames = null;

    public ListRestoreTablesResponse withTotalCount(Integer totalCount) {
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

    public ListRestoreTablesResponse withTableNames(List<String> tableNames) {
        this.tableNames = tableNames;
        return this;
    }

    public ListRestoreTablesResponse addTableNamesItem(String tableNamesItem) {
        if (this.tableNames == null) {
            this.tableNames = new ArrayList<>();
        }
        this.tableNames.add(tableNamesItem);
        return this;
    }

    public ListRestoreTablesResponse withTableNames(Consumer<List<String>> tableNamesSetter) {
        if (this.tableNames == null) {
            this.tableNames = new ArrayList<>();
        }
        tableNamesSetter.accept(this.tableNames);
        return this;
    }

    /**
     * 数据表名称列表。
     * @return tableNames
     */
    public List<String> getTableNames() {
        return tableNames;
    }

    public void setTableNames(List<String> tableNames) {
        this.tableNames = tableNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRestoreTablesResponse that = (ListRestoreTablesResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.tableNames, that.tableNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, tableNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRestoreTablesResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    tableNames: ").append(toIndentedString(tableNames)).append("\n");
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
