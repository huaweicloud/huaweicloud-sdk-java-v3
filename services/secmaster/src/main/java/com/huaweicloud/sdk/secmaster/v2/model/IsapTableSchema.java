package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 表架构
 */
public class IsapTableSchema {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "columns")

    private List<IsapTableColumn> columns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_key")

    private List<String> primaryKey = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition")

    private List<String> partition = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "watermark_column")

    private String watermarkColumn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "watermark_interval")

    private Float watermarkInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_filter")

    private String timeFilter;

    public IsapTableSchema withColumns(List<IsapTableColumn> columns) {
        this.columns = columns;
        return this;
    }

    public IsapTableSchema addColumnsItem(IsapTableColumn columnsItem) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        this.columns.add(columnsItem);
        return this;
    }

    public IsapTableSchema withColumns(Consumer<List<IsapTableColumn>> columnsSetter) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        columnsSetter.accept(this.columns);
        return this;
    }

    /**
     * 表格列列表
     * @return columns
     */
    public List<IsapTableColumn> getColumns() {
        return columns;
    }

    public void setColumns(List<IsapTableColumn> columns) {
        this.columns = columns;
    }

    public IsapTableSchema withPrimaryKey(List<String> primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    public IsapTableSchema addPrimaryKeyItem(String primaryKeyItem) {
        if (this.primaryKey == null) {
            this.primaryKey = new ArrayList<>();
        }
        this.primaryKey.add(primaryKeyItem);
        return this;
    }

    public IsapTableSchema withPrimaryKey(Consumer<List<String>> primaryKeySetter) {
        if (this.primaryKey == null) {
            this.primaryKey = new ArrayList<>();
        }
        primaryKeySetter.accept(this.primaryKey);
        return this;
    }

    /**
     * 表主键列表
     * @return primaryKey
     */
    public List<String> getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(List<String> primaryKey) {
        this.primaryKey = primaryKey;
    }

    public IsapTableSchema withPartition(List<String> partition) {
        this.partition = partition;
        return this;
    }

    public IsapTableSchema addPartitionItem(String partitionItem) {
        if (this.partition == null) {
            this.partition = new ArrayList<>();
        }
        this.partition.add(partitionItem);
        return this;
    }

    public IsapTableSchema withPartition(Consumer<List<String>> partitionSetter) {
        if (this.partition == null) {
            this.partition = new ArrayList<>();
        }
        partitionSetter.accept(this.partition);
        return this;
    }

    /**
     * 表分区列表
     * @return partition
     */
    public List<String> getPartition() {
        return partition;
    }

    public void setPartition(List<String> partition) {
        this.partition = partition;
    }

    public IsapTableSchema withWatermarkColumn(String watermarkColumn) {
        this.watermarkColumn = watermarkColumn;
        return this;
    }

    /**
     * 表水位列元素
     * @return watermarkColumn
     */
    public String getWatermarkColumn() {
        return watermarkColumn;
    }

    public void setWatermarkColumn(String watermarkColumn) {
        this.watermarkColumn = watermarkColumn;
    }

    public IsapTableSchema withWatermarkInterval(Float watermarkInterval) {
        this.watermarkInterval = watermarkInterval;
        return this;
    }

    /**
     * 表水位延迟间隔
     * minimum: 0
     * maximum: 6E+1
     * @return watermarkInterval
     */
    public Float getWatermarkInterval() {
        return watermarkInterval;
    }

    public void setWatermarkInterval(Float watermarkInterval) {
        this.watermarkInterval = watermarkInterval;
    }

    public IsapTableSchema withTimeFilter(String timeFilter) {
        this.timeFilter = timeFilter;
        return this;
    }

    /**
     * 表时间过滤列
     * @return timeFilter
     */
    public String getTimeFilter() {
        return timeFilter;
    }

    public void setTimeFilter(String timeFilter) {
        this.timeFilter = timeFilter;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IsapTableSchema that = (IsapTableSchema) obj;
        return Objects.equals(this.columns, that.columns) && Objects.equals(this.primaryKey, that.primaryKey)
            && Objects.equals(this.partition, that.partition)
            && Objects.equals(this.watermarkColumn, that.watermarkColumn)
            && Objects.equals(this.watermarkInterval, that.watermarkInterval)
            && Objects.equals(this.timeFilter, that.timeFilter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columns, primaryKey, partition, watermarkColumn, watermarkInterval, timeFilter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IsapTableSchema {\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    primaryKey: ").append(toIndentedString(primaryKey)).append("\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
        sb.append("    watermarkColumn: ").append(toIndentedString(watermarkColumn)).append("\n");
        sb.append("    watermarkInterval: ").append(toIndentedString(watermarkInterval)).append("\n");
        sb.append("    timeFilter: ").append(toIndentedString(timeFilter)).append("\n");
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
