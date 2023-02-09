package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * MergeTableColumnStatisticInput
 */
public class MergeTableColumnStatisticInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge")

    private Boolean merge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_column_statistics")

    private TableColumnStatistics tableColumnStatistics;

    public MergeTableColumnStatisticInput withMerge(Boolean merge) {
        this.merge = merge;
        return this;
    }

    /**
     * 是否是对统计信息的合并操作
     * @return merge
     */
    public Boolean getMerge() {
        return merge;
    }

    public void setMerge(Boolean merge) {
        this.merge = merge;
    }

    public MergeTableColumnStatisticInput withTableColumnStatistics(TableColumnStatistics tableColumnStatistics) {
        this.tableColumnStatistics = tableColumnStatistics;
        return this;
    }

    public MergeTableColumnStatisticInput withTableColumnStatistics(
        Consumer<TableColumnStatistics> tableColumnStatisticsSetter) {
        if (this.tableColumnStatistics == null) {
            this.tableColumnStatistics = new TableColumnStatistics();
            tableColumnStatisticsSetter.accept(this.tableColumnStatistics);
        }

        return this;
    }

    /**
     * Get tableColumnStatistics
     * @return tableColumnStatistics
     */
    public TableColumnStatistics getTableColumnStatistics() {
        return tableColumnStatistics;
    }

    public void setTableColumnStatistics(TableColumnStatistics tableColumnStatistics) {
        this.tableColumnStatistics = tableColumnStatistics;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MergeTableColumnStatisticInput mergeTableColumnStatisticInput = (MergeTableColumnStatisticInput) o;
        return Objects.equals(this.merge, mergeTableColumnStatisticInput.merge)
            && Objects.equals(this.tableColumnStatistics, mergeTableColumnStatisticInput.tableColumnStatistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(merge, tableColumnStatistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeTableColumnStatisticInput {\n");
        sb.append("    merge: ").append(toIndentedString(merge)).append("\n");
        sb.append("    tableColumnStatistics: ").append(toIndentedString(tableColumnStatistics)).append("\n");
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
