package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建表的请求body体。
 */
public class CreateTableReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_location")

    private String dataLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "columns")

    private List<CreateTableReqColumn> columns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_path")

    private String dataPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with_column_header")

    private Boolean withColumnHeader;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delimiter")

    private String delimiter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quote_char")

    private String quoteChar;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "escape_char")

    private String escapeChar;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_format")

    private String dateFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp_format")

    private String timestampFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "select_statement")

    private String selectStatement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TmsTagEntity> tags = null;

    public CreateTableReq withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 新增表名称。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public CreateTableReq withDataLocation(String dataLocation) {
        this.dataLocation = dataLocation;
        return this;
    }

    /**
     * 数据存储的地方，分VIEW视图，OBS表和DLI表。
     * @return dataLocation
     */
    public String getDataLocation() {
        return dataLocation;
    }

    public void setDataLocation(String dataLocation) {
        this.dataLocation = dataLocation;
    }

    public CreateTableReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 新增表的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateTableReq withColumns(List<CreateTableReqColumn> columns) {
        this.columns = columns;
        return this;
    }

    public CreateTableReq addColumnsItem(CreateTableReqColumn columnsItem) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        this.columns.add(columnsItem);
        return this;
    }

    public CreateTableReq withColumns(Consumer<List<CreateTableReqColumn>> columnsSetter) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        columnsSetter.accept(this.columns);
        return this;
    }

    /**
     * OBS表和DLI表必选参数。新增表的列。
     * @return columns
     */
    public List<CreateTableReqColumn> getColumns() {
        return columns;
    }

    public void setColumns(List<CreateTableReqColumn> columns) {
        this.columns = columns;
    }

    public CreateTableReq withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * OBS表必选参数。新增OBS表数据的类型，目前支持：Parquet、ORC、CSV、JSON、Carbon和Avro格式。
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public CreateTableReq withDataPath(String dataPath) {
        this.dataPath = dataPath;
        return this;
    }

    /**
     * OBS表必选参数。新增OBS表数据的存储路径，必须是OBS上的路径，以s3a开头。
     * @return dataPath
     */
    public String getDataPath() {
        return dataPath;
    }

    public void setDataPath(String dataPath) {
        this.dataPath = dataPath;
    }

    public CreateTableReq withWithColumnHeader(Boolean withColumnHeader) {
        this.withColumnHeader = withColumnHeader;
        return this;
    }

    /**
     * OBS表非必选参数。OBS表数据是否包含表头。只有CSV类型数据具有该属性。
     * @return withColumnHeader
     */
    public Boolean getWithColumnHeader() {
        return withColumnHeader;
    }

    public void setWithColumnHeader(Boolean withColumnHeader) {
        this.withColumnHeader = withColumnHeader;
    }

    public CreateTableReq withDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    /**
     * OBS表非必选参数。用户自定义数据分隔符。只有CSV类型数据具有该属性。
     * @return delimiter
     */
    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public CreateTableReq withQuoteChar(String quoteChar) {
        this.quoteChar = quoteChar;
        return this;
    }

    /**
     * OBS表非必选参数。用户自定义引用字符，默认为双引号（即“\\\"”）。只有CSV类型数据具有该属性。
     * @return quoteChar
     */
    public String getQuoteChar() {
        return quoteChar;
    }

    public void setQuoteChar(String quoteChar) {
        this.quoteChar = quoteChar;
    }

    public CreateTableReq withEscapeChar(String escapeChar) {
        this.escapeChar = escapeChar;
        return this;
    }

    /**
     * OBS表非必选参数。用户自定义转义字符，默认为反斜杠（即\"\\\\\"）。只有CSV类型数据具有该属性。
     * @return escapeChar
     */
    public String getEscapeChar() {
        return escapeChar;
    }

    public void setEscapeChar(String escapeChar) {
        this.escapeChar = escapeChar;
    }

    public CreateTableReq withDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }

    /**
     * OBS表非必选参数。用户自定义日期类型，默认格式为“yyyy-MM-dd”。只有CSV和JSON类型数据具有该属性。
     * @return dateFormat
     */
    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public CreateTableReq withTimestampFormat(String timestampFormat) {
        this.timestampFormat = timestampFormat;
        return this;
    }

    /**
     * OBS表非必选参数。用户自定义时间类型。默认格式为“yyyy-MM-dd HH:mm:ss”。只有CSV和JSON类型数据具有该属性。
     * @return timestampFormat
     */
    public String getTimestampFormat() {
        return timestampFormat;
    }

    public void setTimestampFormat(String timestampFormat) {
        this.timestampFormat = timestampFormat;
    }

    public CreateTableReq withSelectStatement(String selectStatement) {
        this.selectStatement = selectStatement;
        return this;
    }

    /**
     * VIEW视图必选参数，创建视图时的数据选择语句。语句中涉及表需要使用“表=库名.表名”的格式
     * @return selectStatement
     */
    public String getSelectStatement() {
        return selectStatement;
    }

    public void setSelectStatement(String selectStatement) {
        this.selectStatement = selectStatement;
    }

    public CreateTableReq withTags(List<TmsTagEntity> tags) {
        this.tags = tags;
        return this;
    }

    public CreateTableReq addTagsItem(TmsTagEntity tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateTableReq withTags(Consumer<List<TmsTagEntity>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签
     * @return tags
     */
    public List<TmsTagEntity> getTags() {
        return tags;
    }

    public void setTags(List<TmsTagEntity> tags) {
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
        CreateTableReq createTableReq = (CreateTableReq) o;
        return Objects.equals(this.tableName, createTableReq.tableName)
            && Objects.equals(this.dataLocation, createTableReq.dataLocation)
            && Objects.equals(this.description, createTableReq.description)
            && Objects.equals(this.columns, createTableReq.columns)
            && Objects.equals(this.dataType, createTableReq.dataType)
            && Objects.equals(this.dataPath, createTableReq.dataPath)
            && Objects.equals(this.withColumnHeader, createTableReq.withColumnHeader)
            && Objects.equals(this.delimiter, createTableReq.delimiter)
            && Objects.equals(this.quoteChar, createTableReq.quoteChar)
            && Objects.equals(this.escapeChar, createTableReq.escapeChar)
            && Objects.equals(this.dateFormat, createTableReq.dateFormat)
            && Objects.equals(this.timestampFormat, createTableReq.timestampFormat)
            && Objects.equals(this.selectStatement, createTableReq.selectStatement)
            && Objects.equals(this.tags, createTableReq.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName,
            dataLocation,
            description,
            columns,
            dataType,
            dataPath,
            withColumnHeader,
            delimiter,
            quoteChar,
            escapeChar,
            dateFormat,
            timestampFormat,
            selectStatement,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTableReq {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    dataLocation: ").append(toIndentedString(dataLocation)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    dataPath: ").append(toIndentedString(dataPath)).append("\n");
        sb.append("    withColumnHeader: ").append(toIndentedString(withColumnHeader)).append("\n");
        sb.append("    delimiter: ").append(toIndentedString(delimiter)).append("\n");
        sb.append("    quoteChar: ").append(toIndentedString(quoteChar)).append("\n");
        sb.append("    escapeChar: ").append(toIndentedString(escapeChar)).append("\n");
        sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
        sb.append("    timestampFormat: ").append(toIndentedString(timestampFormat)).append("\n");
        sb.append("    selectStatement: ").append(toIndentedString(selectStatement)).append("\n");
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
