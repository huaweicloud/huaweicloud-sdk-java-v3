package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询所有表响应参数的表的信息。 说明： 若URI中的过滤条件“with-detail&#x3D;false”，则tables相关参数中只返回“data_location”，“table_name”，“table_type”三个参数。
 */
public class Table {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_location")

    private String dataLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_access_time")

    private Long lastAccessTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private String location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_size")

    private Long tableSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_type")

    private String tableType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_columns")

    private List<String> partitionColumns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page-size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current-page")

    private Integer currentPage;

    public Table withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表创建时间。是单位为“毫秒”的时间戳。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Table withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 所列OBS表数据的类型，目前支持：parquet、ORC、CSV、JSON、Carbon、Avro格式。只有OBS表有该参数，其他表没有该参数。
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Table withDataLocation(String dataLocation) {
        this.dataLocation = dataLocation;
        return this;
    }

    /**
     * 数据存储位置，分为MANAGED，EXTERNAL和VIEW，其中EXTERNAL包括OBS表、CLoudTable表。
     * @return dataLocation
     */
    public String getDataLocation() {
        return dataLocation;
    }

    public void setDataLocation(String dataLocation) {
        this.dataLocation = dataLocation;
    }

    public Table withLastAccessTime(Long lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
        return this;
    }

    /**
     * 最近更新时间。是单位为“毫秒”的时间戳。
     * @return lastAccessTime
     */
    public Long getLastAccessTime() {
        return lastAccessTime;
    }

    public void setLastAccessTime(Long lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    public Table withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * OBS表上的存储路径。
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Table withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 表创建者。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Table withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名称。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Table withTableSize(Long tableSize) {
        this.tableSize = tableSize;
        return this;
    }

    /**
     * DLI表的大小。非DLI表该参数值为0。
     * @return tableSize
     */
    public Long getTableSize() {
        return tableSize;
    }

    public void setTableSize(Long tableSize) {
        this.tableSize = tableSize;
    }

    public Table withTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }

    /**
     * 表类型： OBS表为EXTERNAL DLI表为MANAGED View为VIEW
     * @return tableType
     */
    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    public Table withPartitionColumns(List<String> partitionColumns) {
        this.partitionColumns = partitionColumns;
        return this;
    }

    public Table addPartitionColumnsItem(String partitionColumnsItem) {
        if (this.partitionColumns == null) {
            this.partitionColumns = new ArrayList<>();
        }
        this.partitionColumns.add(partitionColumnsItem);
        return this;
    }

    public Table withPartitionColumns(Consumer<List<String>> partitionColumnsSetter) {
        if (this.partitionColumns == null) {
            this.partitionColumns = new ArrayList<>();
        }
        partitionColumnsSetter.accept(this.partitionColumns);
        return this;
    }

    /**
     * 分区字段。只有OBS分区表有该参数，其他表没有该参数。
     * @return partitionColumns
     */
    public List<String> getPartitionColumns() {
        return partitionColumns;
    }

    public void setPartitionColumns(List<String> partitionColumns) {
        this.partitionColumns = partitionColumns;
    }

    public Table withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 分页大小，最小为1，最大为100。
     * minimum: 1
     * maximum: 100
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Table withCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }

    /**
     * 当前页码，最小为1。
     * minimum: 1
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Table that = (Table) obj;
        return Objects.equals(this.createTime, that.createTime) && Objects.equals(this.dataType, that.dataType)
            && Objects.equals(this.dataLocation, that.dataLocation)
            && Objects.equals(this.lastAccessTime, that.lastAccessTime) && Objects.equals(this.location, that.location)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.tableSize, that.tableSize) && Objects.equals(this.tableType, that.tableType)
            && Objects.equals(this.partitionColumns, that.partitionColumns)
            && Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.currentPage, that.currentPage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime,
            dataType,
            dataLocation,
            lastAccessTime,
            location,
            owner,
            tableName,
            tableSize,
            tableType,
            partitionColumns,
            pageSize,
            currentPage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Table {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    dataLocation: ").append(toIndentedString(dataLocation)).append("\n");
        sb.append("    lastAccessTime: ").append(toIndentedString(lastAccessTime)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    tableSize: ").append(toIndentedString(tableSize)).append("\n");
        sb.append("    tableType: ").append(toIndentedString(tableType)).append("\n");
        sb.append("    partitionColumns: ").append(toIndentedString(partitionColumns)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
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
