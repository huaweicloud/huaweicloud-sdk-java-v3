package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询所有表响应参数的表的信息。 说明：  若URI中的过滤条件“with-detail&#x3D;false”，则tables相关参数中只返回“data_location”，“table_name”，“table_type”三个参数。
 */
public class ListTablesRespTable {

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

    private Integer lastAccessTime;

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

    private Integer tableSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_type")

    private String tableType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_columns")

    private String partitionColumns;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page-size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current-page")

    private Integer currentPage;

    public ListTablesRespTable withCreateTime(Long createTime) {
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

    public ListTablesRespTable withDataType(String dataType) {
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

    public ListTablesRespTable withDataLocation(String dataLocation) {
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

    public ListTablesRespTable withLastAccessTime(Integer lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
        return this;
    }

    /**
     * 最近更新时间。是单位为“毫秒”的时间戳。
     * @return lastAccessTime
     */
    public Integer getLastAccessTime() {
        return lastAccessTime;
    }

    public void setLastAccessTime(Integer lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    public ListTablesRespTable withLocation(String location) {
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

    public ListTablesRespTable withOwner(String owner) {
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

    public ListTablesRespTable withTableName(String tableName) {
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

    public ListTablesRespTable withTableSize(Integer tableSize) {
        this.tableSize = tableSize;
        return this;
    }

    /**
     * DLI表的大小。非DLI表该参数值为0。
     * @return tableSize
     */
    public Integer getTableSize() {
        return tableSize;
    }

    public void setTableSize(Integer tableSize) {
        this.tableSize = tableSize;
    }

    public ListTablesRespTable withTableType(String tableType) {
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

    public ListTablesRespTable withPartitionColumns(String partitionColumns) {
        this.partitionColumns = partitionColumns;
        return this;
    }

    /**
     * 分区字段。只有OBS分区表有该参数，其他表没有该参数。
     * @return partitionColumns
     */
    public String getPartitionColumns() {
        return partitionColumns;
    }

    public void setPartitionColumns(String partitionColumns) {
        this.partitionColumns = partitionColumns;
    }

    public ListTablesRespTable withPageSize(Integer pageSize) {
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

    public ListTablesRespTable withCurrentPage(Integer currentPage) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTablesRespTable listTablesRespTable = (ListTablesRespTable) o;
        return Objects.equals(this.createTime, listTablesRespTable.createTime)
            && Objects.equals(this.dataType, listTablesRespTable.dataType)
            && Objects.equals(this.dataLocation, listTablesRespTable.dataLocation)
            && Objects.equals(this.lastAccessTime, listTablesRespTable.lastAccessTime)
            && Objects.equals(this.location, listTablesRespTable.location)
            && Objects.equals(this.owner, listTablesRespTable.owner)
            && Objects.equals(this.tableName, listTablesRespTable.tableName)
            && Objects.equals(this.tableSize, listTablesRespTable.tableSize)
            && Objects.equals(this.tableType, listTablesRespTable.tableType)
            && Objects.equals(this.partitionColumns, listTablesRespTable.partitionColumns)
            && Objects.equals(this.pageSize, listTablesRespTable.pageSize)
            && Objects.equals(this.currentPage, listTablesRespTable.currentPage);
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
        sb.append("class ListTablesRespTable {\n");
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
