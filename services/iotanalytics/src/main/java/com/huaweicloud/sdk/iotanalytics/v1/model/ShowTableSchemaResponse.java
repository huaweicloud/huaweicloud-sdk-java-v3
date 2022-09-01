package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTableSchemaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_id")

    @JacksonXmlProperty(localName = "table_id")

    private String tableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    @JacksonXmlProperty(localName = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_alias")

    @JacksonXmlProperty(localName = "table_alias")

    private String tableAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    @JacksonXmlProperty(localName = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_count")

    @JacksonXmlProperty(localName = "column_count")

    private Integer columnCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "columns")

    @JacksonXmlProperty(localName = "columns")

    private List<Column> columns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_type")

    @JacksonXmlProperty(localName = "table_type")

    private String tableType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    @JacksonXmlProperty(localName = "data_type")

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_location")

    @JacksonXmlProperty(localName = "data_location")

    private String dataLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_properties")

    @JacksonXmlProperty(localName = "storage_properties")

    private List<KeyValue> storageProperties = null;

    public ShowTableSchemaResponse withTableId(String tableId) {
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

    public ShowTableSchemaResponse withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ShowTableSchemaResponse withTableAlias(String tableAlias) {
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

    public ShowTableSchemaResponse withTags(String tags) {
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

    public ShowTableSchemaResponse withColumnCount(Integer columnCount) {
        this.columnCount = columnCount;
        return this;
    }

    /**
     * 表的总列数。
     * @return columnCount
     */
    public Integer getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(Integer columnCount) {
        this.columnCount = columnCount;
    }

    public ShowTableSchemaResponse withColumns(List<Column> columns) {
        this.columns = columns;
        return this;
    }

    public ShowTableSchemaResponse addColumnsItem(Column columnsItem) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        this.columns.add(columnsItem);
        return this;
    }

    public ShowTableSchemaResponse withColumns(Consumer<List<Column>> columnsSetter) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        columnsSetter.accept(this.columns);
        return this;
    }

    /**
     * 表的列信息，包含列名称、类型和描述信息。
     * @return columns
     */
    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public ShowTableSchemaResponse withTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }

    /**
     * 表类型，包括“MANAGED”，“EXTERNAL”和“VIEW”。
     * @return tableType
     */
    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    public ShowTableSchemaResponse withDataType(String dataType) {
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

    public ShowTableSchemaResponse withDataLocation(String dataLocation) {
        this.dataLocation = dataLocation;
        return this;
    }

    /**
     * 数据存储的路径，以“s3a”开头。
     * @return dataLocation
     */
    public String getDataLocation() {
        return dataLocation;
    }

    public void setDataLocation(String dataLocation) {
        this.dataLocation = dataLocation;
    }

    public ShowTableSchemaResponse withStorageProperties(List<KeyValue> storageProperties) {
        this.storageProperties = storageProperties;
        return this;
    }

    public ShowTableSchemaResponse addStoragePropertiesItem(KeyValue storagePropertiesItem) {
        if (this.storageProperties == null) {
            this.storageProperties = new ArrayList<>();
        }
        this.storageProperties.add(storagePropertiesItem);
        return this;
    }

    public ShowTableSchemaResponse withStorageProperties(Consumer<List<KeyValue>> storagePropertiesSetter) {
        if (this.storageProperties == null) {
            this.storageProperties = new ArrayList<>();
        }
        storagePropertiesSetter.accept(this.storageProperties);
        return this;
    }

    /**
     * Get storageProperties
     * @return storageProperties
     */
    public List<KeyValue> getStorageProperties() {
        return storageProperties;
    }

    public void setStorageProperties(List<KeyValue> storageProperties) {
        this.storageProperties = storageProperties;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTableSchemaResponse showTableSchemaResponse = (ShowTableSchemaResponse) o;
        return Objects.equals(this.tableId, showTableSchemaResponse.tableId)
            && Objects.equals(this.tableName, showTableSchemaResponse.tableName)
            && Objects.equals(this.tableAlias, showTableSchemaResponse.tableAlias)
            && Objects.equals(this.tags, showTableSchemaResponse.tags)
            && Objects.equals(this.columnCount, showTableSchemaResponse.columnCount)
            && Objects.equals(this.columns, showTableSchemaResponse.columns)
            && Objects.equals(this.tableType, showTableSchemaResponse.tableType)
            && Objects.equals(this.dataType, showTableSchemaResponse.dataType)
            && Objects.equals(this.dataLocation, showTableSchemaResponse.dataLocation)
            && Objects.equals(this.storageProperties, showTableSchemaResponse.storageProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableId,
            tableName,
            tableAlias,
            tags,
            columnCount,
            columns,
            tableType,
            dataType,
            dataLocation,
            storageProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTableSchemaResponse {\n");
        sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    tableAlias: ").append(toIndentedString(tableAlias)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    columnCount: ").append(toIndentedString(columnCount)).append("\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    tableType: ").append(toIndentedString(tableType)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    dataLocation: ").append(toIndentedString(dataLocation)).append("\n");
        sb.append("    storageProperties: ").append(toIndentedString(storageProperties)).append("\n");
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
