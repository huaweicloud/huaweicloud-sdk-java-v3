package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateTableRequestBody
 */
public class CreateTableRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    @JacksonXmlProperty(localName = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    @JacksonXmlProperty(localName = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_alias")

    @JacksonXmlProperty(localName = "table_alias")

    private String tableAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "columns")

    @JacksonXmlProperty(localName = "columns")

    private List<Column> columns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    @JacksonXmlProperty(localName = "data_type")

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_source")

    @JacksonXmlProperty(localName = "data_source")

    private String dataSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_store_id")

    @JacksonXmlProperty(localName = "data_store_id")

    private String dataStoreId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with_column_header")

    @JacksonXmlProperty(localName = "with_column_header")

    private Boolean withColumnHeader;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delimiter")

    @JacksonXmlProperty(localName = "delimiter")

    private String delimiter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quote_char")

    @JacksonXmlProperty(localName = "quote_char")

    private String quoteChar;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "escape_char")

    @JacksonXmlProperty(localName = "escape_char")

    private String escapeChar;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_format")

    @JacksonXmlProperty(localName = "date_format")

    private String dateFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp_format")

    @JacksonXmlProperty(localName = "timestamp_format")

    private String timestampFormat;

    public CreateTableRequestBody withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 标签。只能包含数字、英文字母、中文字符、下划线、中划线、逗号以及斜杠。长度为0~128。
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public CreateTableRequestBody withTableName(String tableName) {
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

    public CreateTableRequestBody withTableAlias(String tableAlias) {
        this.tableAlias = tableAlias;
        return this;
    }

    /**
     * 新增表别名。只能包含数字、英文字母、中文字符、下划线以及中划线。长度为0~32。
     * @return tableAlias
     */
    public String getTableAlias() {
        return tableAlias;
    }

    public void setTableAlias(String tableAlias) {
        this.tableAlias = tableAlias;
    }

    public CreateTableRequestBody withDescription(String description) {
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

    public CreateTableRequestBody withColumns(List<Column> columns) {
        this.columns = columns;
        return this;
    }

    public CreateTableRequestBody addColumnsItem(Column columnsItem) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        this.columns.add(columnsItem);
        return this;
    }

    public CreateTableRequestBody withColumns(Consumer<List<Column>> columnsSetter) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        columnsSetter.accept(this.columns);
        return this;
    }

    /**
     * 新增表的描述信息。
     * @return columns
     */
    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public CreateTableRequestBody withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 新增表的数据类型，目前支持：Parquet、CSV格式。
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public CreateTableRequestBody withDataSource(String dataSource) {
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

    public CreateTableRequestBody withDataStoreId(String dataStoreId) {
        this.dataStoreId = dataStoreId;
        return this;
    }

    /**
     * 仅当数据来源为pipeline时使用。数据的Data Store ID.
     * @return dataStoreId
     */
    public String getDataStoreId() {
        return dataStoreId;
    }

    public void setDataStoreId(String dataStoreId) {
        this.dataStoreId = dataStoreId;
    }

    public CreateTableRequestBody withWithColumnHeader(Boolean withColumnHeader) {
        this.withColumnHeader = withColumnHeader;
        return this;
    }

    /**
     * 表数据是否包含表头。只有CSV类型数据具有该属性。
     * @return withColumnHeader
     */
    public Boolean getWithColumnHeader() {
        return withColumnHeader;
    }

    public void setWithColumnHeader(Boolean withColumnHeader) {
        this.withColumnHeader = withColumnHeader;
    }

    public CreateTableRequestBody withDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    /**
     * 用户自定义数据分隔符。只有CSV类型数据具有该属性。
     * @return delimiter
     */
    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public CreateTableRequestBody withQuoteChar(String quoteChar) {
        this.quoteChar = quoteChar;
        return this;
    }

    /**
     * 用户自定义引用字符，默认为双引号（即“\"”）。只有CSV类型数据具有该属性。
     * @return quoteChar
     */
    public String getQuoteChar() {
        return quoteChar;
    }

    public void setQuoteChar(String quoteChar) {
        this.quoteChar = quoteChar;
    }

    public CreateTableRequestBody withEscapeChar(String escapeChar) {
        this.escapeChar = escapeChar;
        return this;
    }

    /**
     * 用户自定义转义字符，默认为反斜杠（即\\）。只有CSV类型数据具有该属性。
     * @return escapeChar
     */
    public String getEscapeChar() {
        return escapeChar;
    }

    public void setEscapeChar(String escapeChar) {
        this.escapeChar = escapeChar;
    }

    public CreateTableRequestBody withDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }

    /**
     * 用户自定义日期类型，默认格式为“yyyy-MM-dd”。日期格式字符定义详见表3。只有CSV和JSON类型数据具有该属性。
     * @return dateFormat
     */
    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public CreateTableRequestBody withTimestampFormat(String timestampFormat) {
        this.timestampFormat = timestampFormat;
        return this;
    }

    /**
     * 用户自定义时间类型。默认格式为“yyyy-MM-dd HH:mm:ss”。时间戳格式字符定义详见表3。只有CSV和JSON类型数据具有该属性。
     * @return timestampFormat
     */
    public String getTimestampFormat() {
        return timestampFormat;
    }

    public void setTimestampFormat(String timestampFormat) {
        this.timestampFormat = timestampFormat;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTableRequestBody createTableRequestBody = (CreateTableRequestBody) o;
        return Objects.equals(this.tags, createTableRequestBody.tags)
            && Objects.equals(this.tableName, createTableRequestBody.tableName)
            && Objects.equals(this.tableAlias, createTableRequestBody.tableAlias)
            && Objects.equals(this.description, createTableRequestBody.description)
            && Objects.equals(this.columns, createTableRequestBody.columns)
            && Objects.equals(this.dataType, createTableRequestBody.dataType)
            && Objects.equals(this.dataSource, createTableRequestBody.dataSource)
            && Objects.equals(this.dataStoreId, createTableRequestBody.dataStoreId)
            && Objects.equals(this.withColumnHeader, createTableRequestBody.withColumnHeader)
            && Objects.equals(this.delimiter, createTableRequestBody.delimiter)
            && Objects.equals(this.quoteChar, createTableRequestBody.quoteChar)
            && Objects.equals(this.escapeChar, createTableRequestBody.escapeChar)
            && Objects.equals(this.dateFormat, createTableRequestBody.dateFormat)
            && Objects.equals(this.timestampFormat, createTableRequestBody.timestampFormat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags,
            tableName,
            tableAlias,
            description,
            columns,
            dataType,
            dataSource,
            dataStoreId,
            withColumnHeader,
            delimiter,
            quoteChar,
            escapeChar,
            dateFormat,
            timestampFormat);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTableRequestBody {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    tableAlias: ").append(toIndentedString(tableAlias)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
        sb.append("    dataStoreId: ").append(toIndentedString(dataStoreId)).append("\n");
        sb.append("    withColumnHeader: ").append(toIndentedString(withColumnHeader)).append("\n");
        sb.append("    delimiter: ").append(toIndentedString(delimiter)).append("\n");
        sb.append("    quoteChar: ").append(toIndentedString(quoteChar)).append("\n");
        sb.append("    escapeChar: ").append(toIndentedString(escapeChar)).append("\n");
        sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
        sb.append("    timestampFormat: ").append(toIndentedString(timestampFormat)).append("\n");
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
