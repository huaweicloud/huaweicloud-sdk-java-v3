package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OBS通用配置
 */
public class OBSCommonConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_map")

    private Object columnMap;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delimiter")

    private String delimiter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quote")

    private String quote;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "escape")

    private String escape;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "header")

    private Boolean header;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_format")

    private String dateFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp_format")

    private String timestampFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "null_value")

    private String nullValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    private String comment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parse_mode")

    private String parseMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "join_table")

    private String joinTable;

    public OBSCommonConfig withColumnMap(Object columnMap) {
        this.columnMap = columnMap;
        return this;
    }

    /**
     * Map<String, String>结构
     * @return columnMap
     */
    public Object getColumnMap() {
        return columnMap;
    }

    public void setColumnMap(Object columnMap) {
        this.columnMap = columnMap;
    }

    public OBSCommonConfig withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public OBSCommonConfig withDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    /**
     * 分隔符
     * @return delimiter
     */
    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public OBSCommonConfig withQuote(String quote) {
        this.quote = quote;
        return this;
    }

    /**
     * 引用
     * @return quote
     */
    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public OBSCommonConfig withEscape(String escape) {
        this.escape = escape;
        return this;
    }

    /**
     * 规避
     * @return escape
     */
    public String getEscape() {
        return escape;
    }

    public void setEscape(String escape) {
        this.escape = escape;
    }

    public OBSCommonConfig withHeader(Boolean header) {
        this.header = header;
        return this;
    }

    /**
     * 是否是标头
     * @return header
     */
    public Boolean getHeader() {
        return header;
    }

    public void setHeader(Boolean header) {
        this.header = header;
    }

    public OBSCommonConfig withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 数据类型
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public OBSCommonConfig withDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }

    /**
     * 数据格式
     * @return dateFormat
     */
    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public OBSCommonConfig withTimestampFormat(String timestampFormat) {
        this.timestampFormat = timestampFormat;
        return this;
    }

    /**
     * 时间格式
     * @return timestampFormat
     */
    public String getTimestampFormat() {
        return timestampFormat;
    }

    public void setTimestampFormat(String timestampFormat) {
        this.timestampFormat = timestampFormat;
    }

    public OBSCommonConfig withNullValue(String nullValue) {
        this.nullValue = nullValue;
        return this;
    }

    /**
     * 为空时默认值
     * @return nullValue
     */
    public String getNullValue() {
        return nullValue;
    }

    public void setNullValue(String nullValue) {
        this.nullValue = nullValue;
    }

    public OBSCommonConfig withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * 注解
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public OBSCommonConfig withParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    /**
     * 解析模式
     * @return parseMode
     */
    public String getParseMode() {
        return parseMode;
    }

    public void setParseMode(String parseMode) {
        this.parseMode = parseMode;
    }

    public OBSCommonConfig withJoinTable(String joinTable) {
        this.joinTable = joinTable;
        return this;
    }

    /**
     * 联表
     * @return joinTable
     */
    public String getJoinTable() {
        return joinTable;
    }

    public void setJoinTable(String joinTable) {
        this.joinTable = joinTable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OBSCommonConfig that = (OBSCommonConfig) obj;
        return Objects.equals(this.columnMap, that.columnMap) && Objects.equals(this.path, that.path)
            && Objects.equals(this.delimiter, that.delimiter) && Objects.equals(this.quote, that.quote)
            && Objects.equals(this.escape, that.escape) && Objects.equals(this.header, that.header)
            && Objects.equals(this.dataType, that.dataType) && Objects.equals(this.dateFormat, that.dateFormat)
            && Objects.equals(this.timestampFormat, that.timestampFormat)
            && Objects.equals(this.nullValue, that.nullValue) && Objects.equals(this.comment, that.comment)
            && Objects.equals(this.parseMode, that.parseMode) && Objects.equals(this.joinTable, that.joinTable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnMap,
            path,
            delimiter,
            quote,
            escape,
            header,
            dataType,
            dateFormat,
            timestampFormat,
            nullValue,
            comment,
            parseMode,
            joinTable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBSCommonConfig {\n");
        sb.append("    columnMap: ").append(toIndentedString(columnMap)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    delimiter: ").append(toIndentedString(delimiter)).append("\n");
        sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
        sb.append("    escape: ").append(toIndentedString(escape)).append("\n");
        sb.append("    header: ").append(toIndentedString(header)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
        sb.append("    timestampFormat: ").append(toIndentedString(timestampFormat)).append("\n");
        sb.append("    nullValue: ").append(toIndentedString(nullValue)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    parseMode: ").append(toIndentedString(parseMode)).append("\n");
        sb.append("    joinTable: ").append(toIndentedString(joinTable)).append("\n");
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
