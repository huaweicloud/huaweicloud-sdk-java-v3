package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchShowPartitionColumnStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "found_partition_number")

    private Integer foundPartitionNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_statistics")

    private Map<String, List<ColumnStatisticsObj>> columnStatistics = null;

    public BatchShowPartitionColumnStatisticsResponse withFoundPartitionNumber(Integer foundPartitionNumber) {
        this.foundPartitionNumber = foundPartitionNumber;
        return this;
    }

    /**
     * 分区统计信息的数量
     * @return foundPartitionNumber
     */
    public Integer getFoundPartitionNumber() {
        return foundPartitionNumber;
    }

    public void setFoundPartitionNumber(Integer foundPartitionNumber) {
        this.foundPartitionNumber = foundPartitionNumber;
    }

    public BatchShowPartitionColumnStatisticsResponse withColumnStatistics(
        Map<String, List<ColumnStatisticsObj>> columnStatistics) {
        this.columnStatistics = columnStatistics;
        return this;
    }

    public BatchShowPartitionColumnStatisticsResponse putColumnStatisticsItem(String key,
        List<ColumnStatisticsObj> columnStatisticsItem) {
        if (this.columnStatistics == null) {
            this.columnStatistics = new HashMap<>();
        }
        this.columnStatistics.put(key, columnStatisticsItem);
        return this;
    }

    public BatchShowPartitionColumnStatisticsResponse withColumnStatistics(
        Consumer<Map<String, List<ColumnStatisticsObj>>> columnStatisticsSetter) {
        if (this.columnStatistics == null) {
            this.columnStatistics = new HashMap<>();
        }
        columnStatisticsSetter.accept(this.columnStatistics);
        return this;
    }

    /**
     * 分区统计信息的列表
     * @return columnStatistics
     */
    public Map<String, List<ColumnStatisticsObj>> getColumnStatistics() {
        return columnStatistics;
    }

    public void setColumnStatistics(Map<String, List<ColumnStatisticsObj>> columnStatistics) {
        this.columnStatistics = columnStatistics;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchShowPartitionColumnStatisticsResponse batchShowPartitionColumnStatisticsResponse =
            (BatchShowPartitionColumnStatisticsResponse) o;
        return Objects.equals(this.foundPartitionNumber,
            batchShowPartitionColumnStatisticsResponse.foundPartitionNumber)
            && Objects.equals(this.columnStatistics, batchShowPartitionColumnStatisticsResponse.columnStatistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foundPartitionNumber, columnStatistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchShowPartitionColumnStatisticsResponse {\n");
        sb.append("    foundPartitionNumber: ").append(toIndentedString(foundPartitionNumber)).append("\n");
        sb.append("    columnStatistics: ").append(toIndentedString(columnStatistics)).append("\n");
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
