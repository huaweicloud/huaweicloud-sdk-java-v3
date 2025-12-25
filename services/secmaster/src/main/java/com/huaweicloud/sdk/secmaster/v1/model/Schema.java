package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 格式
 */
public class Schema {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "columns")

    private List<SchemaColumns> columns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition")

    private List<String> partition = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_key")

    private List<String> primaryKey = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_filter")

    private String timeFilter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "watermark_column")

    private String watermarkColumn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "watermark_interval")

    private BigDecimal watermarkInterval;

    public Schema withColumns(List<SchemaColumns> columns) {
        this.columns = columns;
        return this;
    }

    public Schema addColumnsItem(SchemaColumns columnsItem) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        this.columns.add(columnsItem);
        return this;
    }

    public Schema withColumns(Consumer<List<SchemaColumns>> columnsSetter) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        columnsSetter.accept(this.columns);
        return this;
    }

    /**
     * 列
     * @return columns
     */
    public List<SchemaColumns> getColumns() {
        return columns;
    }

    public void setColumns(List<SchemaColumns> columns) {
        this.columns = columns;
    }

    public Schema withPartition(List<String> partition) {
        this.partition = partition;
        return this;
    }

    public Schema addPartitionItem(String partitionItem) {
        if (this.partition == null) {
            this.partition = new ArrayList<>();
        }
        this.partition.add(partitionItem);
        return this;
    }

    public Schema withPartition(Consumer<List<String>> partitionSetter) {
        if (this.partition == null) {
            this.partition = new ArrayList<>();
        }
        partitionSetter.accept(this.partition);
        return this;
    }

    /**
     * 分区
     * @return partition
     */
    public List<String> getPartition() {
        return partition;
    }

    public void setPartition(List<String> partition) {
        this.partition = partition;
    }

    public Schema withPrimaryKey(List<String> primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    public Schema addPrimaryKeyItem(String primaryKeyItem) {
        if (this.primaryKey == null) {
            this.primaryKey = new ArrayList<>();
        }
        this.primaryKey.add(primaryKeyItem);
        return this;
    }

    public Schema withPrimaryKey(Consumer<List<String>> primaryKeySetter) {
        if (this.primaryKey == null) {
            this.primaryKey = new ArrayList<>();
        }
        primaryKeySetter.accept(this.primaryKey);
        return this;
    }

    /**
     * 主键
     * @return primaryKey
     */
    public List<String> getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(List<String> primaryKey) {
        this.primaryKey = primaryKey;
    }

    public Schema withTimeFilter(String timeFilter) {
        this.timeFilter = timeFilter;
        return this;
    }

    /**
     * 时间过滤列
     * @return timeFilter
     */
    public String getTimeFilter() {
        return timeFilter;
    }

    public void setTimeFilter(String timeFilter) {
        this.timeFilter = timeFilter;
    }

    public Schema withWatermarkColumn(String watermarkColumn) {
        this.watermarkColumn = watermarkColumn;
        return this;
    }

    /**
     * 水印列
     * @return watermarkColumn
     */
    public String getWatermarkColumn() {
        return watermarkColumn;
    }

    public void setWatermarkColumn(String watermarkColumn) {
        this.watermarkColumn = watermarkColumn;
    }

    public Schema withWatermarkInterval(BigDecimal watermarkInterval) {
        this.watermarkInterval = watermarkInterval;
        return this;
    }

    /**
     * 水印间隔
     * @return watermarkInterval
     */
    public BigDecimal getWatermarkInterval() {
        return watermarkInterval;
    }

    public void setWatermarkInterval(BigDecimal watermarkInterval) {
        this.watermarkInterval = watermarkInterval;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Schema that = (Schema) obj;
        return Objects.equals(this.columns, that.columns) && Objects.equals(this.partition, that.partition)
            && Objects.equals(this.primaryKey, that.primaryKey) && Objects.equals(this.timeFilter, that.timeFilter)
            && Objects.equals(this.watermarkColumn, that.watermarkColumn)
            && Objects.equals(this.watermarkInterval, that.watermarkInterval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columns, partition, primaryKey, timeFilter, watermarkColumn, watermarkInterval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Schema {\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
        sb.append("    primaryKey: ").append(toIndentedString(primaryKey)).append("\n");
        sb.append("    timeFilter: ").append(toIndentedString(timeFilter)).append("\n");
        sb.append("    watermarkColumn: ").append(toIndentedString(watermarkColumn)).append("\n");
        sb.append("    watermarkInterval: ").append(toIndentedString(watermarkInterval)).append("\n");
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
