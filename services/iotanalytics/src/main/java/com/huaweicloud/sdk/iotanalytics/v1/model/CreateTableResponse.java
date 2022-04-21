package com.huaweicloud.sdk.iotanalytics.v1.model;

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
public class CreateTableResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_id")

    private String tableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_alias")

    private String tableAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_time")

    private String modifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_location")

    private String dataLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_source")

    private String dataSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_type")

    private String tableType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_columns")

    private List<String> partitionColumns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_store_id")

    private String dataStoreId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    public CreateTableResponse withTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }

    /**
     * 表ID。
     * @return tableId
     */
    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public CreateTableResponse withTableName(String tableName) {
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

    public CreateTableResponse withTableAlias(String tableAlias) {
        this.tableAlias = tableAlias;
        return this;
    }

    /**
     * 表别名。
     * @return tableAlias
     */
    public String getTableAlias() {
        return tableAlias;
    }

    public void setTableAlias(String tableAlias) {
        this.tableAlias = tableAlias;
    }

    public CreateTableResponse withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 表创建时间。
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public CreateTableResponse withModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    /**
     * 表更新时间。
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public CreateTableResponse withDataLocation(String dataLocation) {
        this.dataLocation = dataLocation;
        return this;
    }

    /**
     * 数据存储位置，分为IoTA和VIEW
     * @return dataLocation
     */
    public String getDataLocation() {
        return dataLocation;
    }

    public void setDataLocation(String dataLocation) {
        this.dataLocation = dataLocation;
    }

    public CreateTableResponse withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 数据类型，包括“csv”，“parquet”。
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public CreateTableResponse withDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    /**
     * 数据来源。来源类型有：pipeline, default. 默认为default.
     * @return dataSource
     */
    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public CreateTableResponse withTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }

    /**
     * 表类型:IoTA表为MANAGED, View为VIEW
     * @return tableType
     */
    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    public CreateTableResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 表的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateTableResponse withPartitionColumns(List<String> partitionColumns) {
        this.partitionColumns = partitionColumns;
        return this;
    }

    public CreateTableResponse addPartitionColumnsItem(String partitionColumnsItem) {
        if (this.partitionColumns == null) {
            this.partitionColumns = new ArrayList<>();
        }
        this.partitionColumns.add(partitionColumnsItem);
        return this;
    }

    public CreateTableResponse withPartitionColumns(Consumer<List<String>> partitionColumnsSetter) {
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

    public CreateTableResponse withDataStoreId(String dataStoreId) {
        this.dataStoreId = dataStoreId;
        return this;
    }

    /**
     * 仅当数据来源为pipeline时返回。Data Store ID.
     * @return dataStoreId
     */
    public String getDataStoreId() {
        return dataStoreId;
    }

    public void setDataStoreId(String dataStoreId) {
        this.dataStoreId = dataStoreId;
    }

    public CreateTableResponse withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 标签。
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTableResponse createTableResponse = (CreateTableResponse) o;
        return Objects.equals(this.tableId, createTableResponse.tableId)
            && Objects.equals(this.tableName, createTableResponse.tableName)
            && Objects.equals(this.tableAlias, createTableResponse.tableAlias)
            && Objects.equals(this.createdTime, createTableResponse.createdTime)
            && Objects.equals(this.modifiedTime, createTableResponse.modifiedTime)
            && Objects.equals(this.dataLocation, createTableResponse.dataLocation)
            && Objects.equals(this.dataType, createTableResponse.dataType)
            && Objects.equals(this.dataSource, createTableResponse.dataSource)
            && Objects.equals(this.tableType, createTableResponse.tableType)
            && Objects.equals(this.description, createTableResponse.description)
            && Objects.equals(this.partitionColumns, createTableResponse.partitionColumns)
            && Objects.equals(this.dataStoreId, createTableResponse.dataStoreId)
            && Objects.equals(this.tags, createTableResponse.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableId,
            tableName,
            tableAlias,
            createdTime,
            modifiedTime,
            dataLocation,
            dataType,
            dataSource,
            tableType,
            description,
            partitionColumns,
            dataStoreId,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTableResponse {\n");
        sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    tableAlias: ").append(toIndentedString(tableAlias)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
        sb.append("    dataLocation: ").append(toIndentedString(dataLocation)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
        sb.append("    tableType: ").append(toIndentedString(tableType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    partitionColumns: ").append(toIndentedString(partitionColumns)).append("\n");
        sb.append("    dataStoreId: ").append(toIndentedString(dataStoreId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
