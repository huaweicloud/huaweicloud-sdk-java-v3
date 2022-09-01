package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ImportDataRequestBody
 */
public class ImportDataRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_path")

    @JacksonXmlProperty(localName = "data_path")

    private String dataPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    @JacksonXmlProperty(localName = "data_type")

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_id")

    @JacksonXmlProperty(localName = "table_id")

    private String tableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with_column_header")

    @JacksonXmlProperty(localName = "with_column_header")

    private String withColumnHeader;

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
    @JsonProperty(value = "bad_records_path")

    @JacksonXmlProperty(localName = "bad_records_path")

    private String badRecordsPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp_format")

    @JacksonXmlProperty(localName = "timestamp_format")

    private String timestampFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computing_resource_id")

    @JacksonXmlProperty(localName = "computing_resource_id")

    private String computingResourceId;

    public ImportDataRequestBody withDataPath(String dataPath) {
        this.dataPath = dataPath;
        return this;
    }

    /**
     * 导入的数据路径（当前仅支持导入OBS上的数据，且OBS路径须以s3a开头）。必须先把该OBS桶添加到离线数据源。
     * @return dataPath
     */
    public String getDataPath() {
        return dataPath;
    }

    public void setDataPath(String dataPath) {
        this.dataPath = dataPath;
    }

    public ImportDataRequestBody withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 导入的数据类型（当前支持csv、parquet、orc、json、avro数据类型）。
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public ImportDataRequestBody withTableId(String tableId) {
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

    public ImportDataRequestBody withWithColumnHeader(String withColumnHeader) {
        this.withColumnHeader = withColumnHeader;
        return this;
    }

    /**
     * 导入数据中的第一行数据是否包括列名，即表头。默认为“false”，表示不包括列名。导入CSV类型数据时可指定。
     * @return withColumnHeader
     */
    public String getWithColumnHeader() {
        return withColumnHeader;
    }

    public void setWithColumnHeader(String withColumnHeader) {
        this.withColumnHeader = withColumnHeader;
    }

    public ImportDataRequestBody withDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    /**
     * 用户自定义数据分隔符，默认为逗号。导入CSV类型数据时可指定。
     * @return delimiter
     */
    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public ImportDataRequestBody withQuoteChar(String quoteChar) {
        this.quoteChar = quoteChar;
        return this;
    }

    /**
     * 用户自定义引用字符，默认为双引号。导入CSV类型数据时可指定。
     * @return quoteChar
     */
    public String getQuoteChar() {
        return quoteChar;
    }

    public void setQuoteChar(String quoteChar) {
        this.quoteChar = quoteChar;
    }

    public ImportDataRequestBody withEscapeChar(String escapeChar) {
        this.escapeChar = escapeChar;
        return this;
    }

    /**
     * 用户自定义转义字符，默认为反斜杠。导入CSV类型数据时可指定。
     * @return escapeChar
     */
    public String getEscapeChar() {
        return escapeChar;
    }

    public void setEscapeChar(String escapeChar) {
        this.escapeChar = escapeChar;
    }

    public ImportDataRequestBody withDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }

    /**
     * 指定特定的日期格式，默认为“yyyy-MM-dd”。日期格式字符定义详见表3。导入CSV及JSON类型数据时可指定。
     * @return dateFormat
     */
    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public ImportDataRequestBody withBadRecordsPath(String badRecordsPath) {
        this.badRecordsPath = badRecordsPath;
        return this;
    }

    /**
     * 作业执行过程中的bad records存储目录。设置该配置项后，bad records不会导入到目标表。
     * @return badRecordsPath
     */
    public String getBadRecordsPath() {
        return badRecordsPath;
    }

    public void setBadRecordsPath(String badRecordsPath) {
        this.badRecordsPath = badRecordsPath;
    }

    public ImportDataRequestBody withTimestampFormat(String timestampFormat) {
        this.timestampFormat = timestampFormat;
        return this;
    }

    /**
     * 指定特定的时间格式，默认为“yyyy-MM-dd HH:mm:ss”。时间格式字符定义详见表3。导入CSV及JSON类型数据时可指定。
     * @return timestampFormat
     */
    public String getTimestampFormat() {
        return timestampFormat;
    }

    public void setTimestampFormat(String timestampFormat) {
        this.timestampFormat = timestampFormat;
    }

    public ImportDataRequestBody withComputingResourceId(String computingResourceId) {
        this.computingResourceId = computingResourceId;
        return this;
    }

    /**
     * 计算资源ID。
     * @return computingResourceId
     */
    public String getComputingResourceId() {
        return computingResourceId;
    }

    public void setComputingResourceId(String computingResourceId) {
        this.computingResourceId = computingResourceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImportDataRequestBody importDataRequestBody = (ImportDataRequestBody) o;
        return Objects.equals(this.dataPath, importDataRequestBody.dataPath)
            && Objects.equals(this.dataType, importDataRequestBody.dataType)
            && Objects.equals(this.tableId, importDataRequestBody.tableId)
            && Objects.equals(this.withColumnHeader, importDataRequestBody.withColumnHeader)
            && Objects.equals(this.delimiter, importDataRequestBody.delimiter)
            && Objects.equals(this.quoteChar, importDataRequestBody.quoteChar)
            && Objects.equals(this.escapeChar, importDataRequestBody.escapeChar)
            && Objects.equals(this.dateFormat, importDataRequestBody.dateFormat)
            && Objects.equals(this.badRecordsPath, importDataRequestBody.badRecordsPath)
            && Objects.equals(this.timestampFormat, importDataRequestBody.timestampFormat)
            && Objects.equals(this.computingResourceId, importDataRequestBody.computingResourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataPath,
            dataType,
            tableId,
            withColumnHeader,
            delimiter,
            quoteChar,
            escapeChar,
            dateFormat,
            badRecordsPath,
            timestampFormat,
            computingResourceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportDataRequestBody {\n");
        sb.append("    dataPath: ").append(toIndentedString(dataPath)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
        sb.append("    withColumnHeader: ").append(toIndentedString(withColumnHeader)).append("\n");
        sb.append("    delimiter: ").append(toIndentedString(delimiter)).append("\n");
        sb.append("    quoteChar: ").append(toIndentedString(quoteChar)).append("\n");
        sb.append("    escapeChar: ").append(toIndentedString(escapeChar)).append("\n");
        sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
        sb.append("    badRecordsPath: ").append(toIndentedString(badRecordsPath)).append("\n");
        sb.append("    timestampFormat: ").append(toIndentedString(timestampFormat)).append("\n");
        sb.append("    computingResourceId: ").append(toIndentedString(computingResourceId)).append("\n");
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
