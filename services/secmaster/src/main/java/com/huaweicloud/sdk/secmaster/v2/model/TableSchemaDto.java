package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 表结构数据传输对象
 */
public class TableSchemaDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "columns")

    private List<IsapTableColumnDto> columns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_key_list")

    private List<String> primaryKeyList = null;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_setting")

    private List<IsapTableColumnDisplaySettingDto> displaySetting = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_tree_root")

    private IsapTableColumnTreeNodeTableColumnDto columnTreeRoot;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_key")

    private List<String> primaryKey = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_key")

    private String partitionKey;

    public TableSchemaDto withColumns(List<IsapTableColumnDto> columns) {
        this.columns = columns;
        return this;
    }

    public TableSchemaDto addColumnsItem(IsapTableColumnDto columnsItem) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        this.columns.add(columnsItem);
        return this;
    }

    public TableSchemaDto withColumns(Consumer<List<IsapTableColumnDto>> columnsSetter) {
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
    public List<IsapTableColumnDto> getColumns() {
        return columns;
    }

    public void setColumns(List<IsapTableColumnDto> columns) {
        this.columns = columns;
    }

    public TableSchemaDto withPrimaryKeyList(List<String> primaryKeyList) {
        this.primaryKeyList = primaryKeyList;
        return this;
    }

    public TableSchemaDto addPrimaryKeyListItem(String primaryKeyListItem) {
        if (this.primaryKeyList == null) {
            this.primaryKeyList = new ArrayList<>();
        }
        this.primaryKeyList.add(primaryKeyListItem);
        return this;
    }

    public TableSchemaDto withPrimaryKeyList(Consumer<List<String>> primaryKeyListSetter) {
        if (this.primaryKeyList == null) {
            this.primaryKeyList = new ArrayList<>();
        }
        primaryKeyListSetter.accept(this.primaryKeyList);
        return this;
    }

    /**
     * 表主键列表
     * @return primaryKeyList
     */
    public List<String> getPrimaryKeyList() {
        return primaryKeyList;
    }

    public void setPrimaryKeyList(List<String> primaryKeyList) {
        this.primaryKeyList = primaryKeyList;
    }

    public TableSchemaDto withPartition(List<String> partition) {
        this.partition = partition;
        return this;
    }

    public TableSchemaDto addPartitionItem(String partitionItem) {
        if (this.partition == null) {
            this.partition = new ArrayList<>();
        }
        this.partition.add(partitionItem);
        return this;
    }

    public TableSchemaDto withPartition(Consumer<List<String>> partitionSetter) {
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

    public TableSchemaDto withWatermarkColumn(String watermarkColumn) {
        this.watermarkColumn = watermarkColumn;
        return this;
    }

    /**
     * 表水位列
     * @return watermarkColumn
     */
    public String getWatermarkColumn() {
        return watermarkColumn;
    }

    public void setWatermarkColumn(String watermarkColumn) {
        this.watermarkColumn = watermarkColumn;
    }

    public TableSchemaDto withWatermarkInterval(Float watermarkInterval) {
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

    public TableSchemaDto withTimeFilter(String timeFilter) {
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

    public TableSchemaDto withDisplaySetting(List<IsapTableColumnDisplaySettingDto> displaySetting) {
        this.displaySetting = displaySetting;
        return this;
    }

    public TableSchemaDto addDisplaySettingItem(IsapTableColumnDisplaySettingDto displaySettingItem) {
        if (this.displaySetting == null) {
            this.displaySetting = new ArrayList<>();
        }
        this.displaySetting.add(displaySettingItem);
        return this;
    }

    public TableSchemaDto withDisplaySetting(Consumer<List<IsapTableColumnDisplaySettingDto>> displaySettingSetter) {
        if (this.displaySetting == null) {
            this.displaySetting = new ArrayList<>();
        }
        displaySettingSetter.accept(this.displaySetting);
        return this;
    }

    /**
     * 展示设置列表
     * @return displaySetting
     */
    public List<IsapTableColumnDisplaySettingDto> getDisplaySetting() {
        return displaySetting;
    }

    public void setDisplaySetting(List<IsapTableColumnDisplaySettingDto> displaySetting) {
        this.displaySetting = displaySetting;
    }

    public TableSchemaDto withColumnTreeRoot(IsapTableColumnTreeNodeTableColumnDto columnTreeRoot) {
        this.columnTreeRoot = columnTreeRoot;
        return this;
    }

    public TableSchemaDto withColumnTreeRoot(Consumer<IsapTableColumnTreeNodeTableColumnDto> columnTreeRootSetter) {
        if (this.columnTreeRoot == null) {
            this.columnTreeRoot = new IsapTableColumnTreeNodeTableColumnDto();
            columnTreeRootSetter.accept(this.columnTreeRoot);
        }

        return this;
    }

    /**
     * Get columnTreeRoot
     * @return columnTreeRoot
     */
    public IsapTableColumnTreeNodeTableColumnDto getColumnTreeRoot() {
        return columnTreeRoot;
    }

    public void setColumnTreeRoot(IsapTableColumnTreeNodeTableColumnDto columnTreeRoot) {
        this.columnTreeRoot = columnTreeRoot;
    }

    public TableSchemaDto withPrimaryKey(List<String> primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    public TableSchemaDto addPrimaryKeyItem(String primaryKeyItem) {
        if (this.primaryKey == null) {
            this.primaryKey = new ArrayList<>();
        }
        this.primaryKey.add(primaryKeyItem);
        return this;
    }

    public TableSchemaDto withPrimaryKey(Consumer<List<String>> primaryKeySetter) {
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

    public TableSchemaDto withPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }

    /**
     * 分区键
     * @return partitionKey
     */
    public String getPartitionKey() {
        return partitionKey;
    }

    public void setPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TableSchemaDto that = (TableSchemaDto) obj;
        return Objects.equals(this.columns, that.columns) && Objects.equals(this.primaryKeyList, that.primaryKeyList)
            && Objects.equals(this.partition, that.partition)
            && Objects.equals(this.watermarkColumn, that.watermarkColumn)
            && Objects.equals(this.watermarkInterval, that.watermarkInterval)
            && Objects.equals(this.timeFilter, that.timeFilter)
            && Objects.equals(this.displaySetting, that.displaySetting)
            && Objects.equals(this.columnTreeRoot, that.columnTreeRoot)
            && Objects.equals(this.primaryKey, that.primaryKey) && Objects.equals(this.partitionKey, that.partitionKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columns,
            primaryKeyList,
            partition,
            watermarkColumn,
            watermarkInterval,
            timeFilter,
            displaySetting,
            columnTreeRoot,
            primaryKey,
            partitionKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableSchemaDto {\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    primaryKeyList: ").append(toIndentedString(primaryKeyList)).append("\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
        sb.append("    watermarkColumn: ").append(toIndentedString(watermarkColumn)).append("\n");
        sb.append("    watermarkInterval: ").append(toIndentedString(watermarkInterval)).append("\n");
        sb.append("    timeFilter: ").append(toIndentedString(timeFilter)).append("\n");
        sb.append("    displaySetting: ").append(toIndentedString(displaySetting)).append("\n");
        sb.append("    columnTreeRoot: ").append(toIndentedString(columnTreeRoot)).append("\n");
        sb.append("    primaryKey: ").append(toIndentedString(primaryKey)).append("\n");
        sb.append("    partitionKey: ").append(toIndentedString(partitionKey)).append("\n");
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
