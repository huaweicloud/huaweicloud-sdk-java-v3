package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 获取指定分区指定列的列统计信息
 */
public class GetPartitionColumnStatisticsInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregate_statics")

    private Boolean aggregateStatics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_names")

    private List<String> columnNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_values_list")

    private List<List<String>> partitionValuesList = null;

    public GetPartitionColumnStatisticsInput withAggregateStatics(Boolean aggregateStatics) {
        this.aggregateStatics = aggregateStatics;
        return this;
    }

    /**
     * 是否聚合返回统计信息
     * @return aggregateStatics
     */
    public Boolean getAggregateStatics() {
        return aggregateStatics;
    }

    public void setAggregateStatics(Boolean aggregateStatics) {
        this.aggregateStatics = aggregateStatics;
    }

    public GetPartitionColumnStatisticsInput withColumnNames(List<String> columnNames) {
        this.columnNames = columnNames;
        return this;
    }

    public GetPartitionColumnStatisticsInput addColumnNamesItem(String columnNamesItem) {
        if (this.columnNames == null) {
            this.columnNames = new ArrayList<>();
        }
        this.columnNames.add(columnNamesItem);
        return this;
    }

    public GetPartitionColumnStatisticsInput withColumnNames(Consumer<List<String>> columnNamesSetter) {
        if (this.columnNames == null) {
            this.columnNames = new ArrayList<>();
        }
        columnNamesSetter.accept(this.columnNames);
        return this;
    }

    /**
     * 统计信息的列名
     * @return columnNames
     */
    public List<String> getColumnNames() {
        return columnNames;
    }

    public void setColumnNames(List<String> columnNames) {
        this.columnNames = columnNames;
    }

    public GetPartitionColumnStatisticsInput withPartitionValuesList(List<List<String>> partitionValuesList) {
        this.partitionValuesList = partitionValuesList;
        return this;
    }

    public GetPartitionColumnStatisticsInput addPartitionValuesListItem(List<String> partitionValuesListItem) {
        if (this.partitionValuesList == null) {
            this.partitionValuesList = new ArrayList<>();
        }
        this.partitionValuesList.add(partitionValuesListItem);
        return this;
    }

    public GetPartitionColumnStatisticsInput withPartitionValuesList(
        Consumer<List<List<String>>> partitionValuesListSetter) {
        if (this.partitionValuesList == null) {
            this.partitionValuesList = new ArrayList<>();
        }
        partitionValuesListSetter.accept(this.partitionValuesList);
        return this;
    }

    /**
     * 需要统计的分区值列表
     * @return partitionValuesList
     */
    public List<List<String>> getPartitionValuesList() {
        return partitionValuesList;
    }

    public void setPartitionValuesList(List<List<String>> partitionValuesList) {
        this.partitionValuesList = partitionValuesList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetPartitionColumnStatisticsInput getPartitionColumnStatisticsInput = (GetPartitionColumnStatisticsInput) o;
        return Objects.equals(this.aggregateStatics, getPartitionColumnStatisticsInput.aggregateStatics)
            && Objects.equals(this.columnNames, getPartitionColumnStatisticsInput.columnNames)
            && Objects.equals(this.partitionValuesList, getPartitionColumnStatisticsInput.partitionValuesList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aggregateStatics, columnNames, partitionValuesList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPartitionColumnStatisticsInput {\n");
        sb.append("    aggregateStatics: ").append(toIndentedString(aggregateStatics)).append("\n");
        sb.append("    columnNames: ").append(toIndentedString(columnNames)).append("\n");
        sb.append("    partitionValuesList: ").append(toIndentedString(partitionValuesList)).append("\n");
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
