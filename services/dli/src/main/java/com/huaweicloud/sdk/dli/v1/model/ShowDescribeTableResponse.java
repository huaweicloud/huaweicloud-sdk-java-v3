package com.huaweicloud.sdk.dli.v1.model;

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
public class ShowDescribeTableResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_count")

    private Integer columnCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "columns")

    private List<CreateTableReqColumn> columns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_type")

    private String tableType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_location")

    private String dataLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_properties")

    private List<Object> storageProperties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_comment")

    private String tableComment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_table_sql")

    private String createTableSql;

    public ShowDescribeTableResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 执行请求是否成功。“true”表示请求执行成功。
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ShowDescribeTableResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 系统提示信息，执行成功时，信息可能为空。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowDescribeTableResponse withColumnCount(Integer columnCount) {
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

    public ShowDescribeTableResponse withColumns(List<CreateTableReqColumn> columns) {
        this.columns = columns;
        return this;
    }

    public ShowDescribeTableResponse addColumnsItem(CreateTableReqColumn columnsItem) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        this.columns.add(columnsItem);
        return this;
    }

    public ShowDescribeTableResponse withColumns(Consumer<List<CreateTableReqColumn>> columnsSetter) {
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
    public List<CreateTableReqColumn> getColumns() {
        return columns;
    }

    public void setColumns(List<CreateTableReqColumn> columns) {
        this.columns = columns;
    }

    public ShowDescribeTableResponse withTableType(String tableType) {
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

    public ShowDescribeTableResponse withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 数据类型，包括“csv”，“parquet”，“orc”，“json”，“carbon”和“avro”。
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public ShowDescribeTableResponse withDataLocation(String dataLocation) {
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

    public ShowDescribeTableResponse withStorageProperties(List<Object> storageProperties) {
        this.storageProperties = storageProperties;
        return this;
    }

    public ShowDescribeTableResponse addStoragePropertiesItem(Object storagePropertiesItem) {
        if (this.storageProperties == null) {
            this.storageProperties = new ArrayList<>();
        }
        this.storageProperties.add(storagePropertiesItem);
        return this;
    }

    public ShowDescribeTableResponse withStorageProperties(Consumer<List<Object>> storagePropertiesSetter) {
        if (this.storageProperties == null) {
            this.storageProperties = new ArrayList<>();
        }
        storagePropertiesSetter.accept(this.storageProperties);
        return this;
    }

    /**
     * 存储属性，以“key/value”的格式出现，包含delimiter，escape，quote，header，dateformat，timestampformat参数。
     * @return storageProperties
     */
    public List<Object> getStorageProperties() {
        return storageProperties;
    }

    public void setStorageProperties(List<Object> storageProperties) {
        this.storageProperties = storageProperties;
    }

    public ShowDescribeTableResponse withTableComment(String tableComment) {
        this.tableComment = tableComment;
        return this;
    }

    /**
     * 表的注释。
     * @return tableComment
     */
    public String getTableComment() {
        return tableComment;
    }

    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }

    public ShowDescribeTableResponse withCreateTableSql(String createTableSql) {
        this.createTableSql = createTableSql;
        return this;
    }

    /**
     * 建表的语句
     * @return createTableSql
     */
    public String getCreateTableSql() {
        return createTableSql;
    }

    public void setCreateTableSql(String createTableSql) {
        this.createTableSql = createTableSql;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDescribeTableResponse that = (ShowDescribeTableResponse) obj;
        return Objects.equals(this.isSuccess, that.isSuccess) && Objects.equals(this.message, that.message)
            && Objects.equals(this.columnCount, that.columnCount) && Objects.equals(this.columns, that.columns)
            && Objects.equals(this.tableType, that.tableType) && Objects.equals(this.dataType, that.dataType)
            && Objects.equals(this.dataLocation, that.dataLocation)
            && Objects.equals(this.storageProperties, that.storageProperties)
            && Objects.equals(this.tableComment, that.tableComment)
            && Objects.equals(this.createTableSql, that.createTableSql);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess,
            message,
            columnCount,
            columns,
            tableType,
            dataType,
            dataLocation,
            storageProperties,
            tableComment,
            createTableSql);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDescribeTableResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    columnCount: ").append(toIndentedString(columnCount)).append("\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    tableType: ").append(toIndentedString(tableType)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    dataLocation: ").append(toIndentedString(dataLocation)).append("\n");
        sb.append("    storageProperties: ").append(toIndentedString(storageProperties)).append("\n");
        sb.append("    tableComment: ").append(toIndentedString(tableComment)).append("\n");
        sb.append("    createTableSql: ").append(toIndentedString(createTableSql)).append("\n");
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
