package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 导入数据
 */
public class ImportTableRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_path")

    private String dataPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

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
    @JsonProperty(value = "bad_records_path")

    private String badRecordsPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp_format")

    private String timestampFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overwrite")

    private Boolean overwrite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_spec")

    private String partitionSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conf")

    private List<String> conf = null;

    public ImportTableRequestBody withDataPath(String dataPath) {
        this.dataPath = dataPath;
        return this;
    }

    /**
     * 导入的数据路径（当前仅支持导入OBS上的数据，且OBS路径须以s3a开头）。
     * @return dataPath
     */
    public String getDataPath() {
        return dataPath;
    }

    public void setDataPath(String dataPath) {
        this.dataPath = dataPath;
    }

    public ImportTableRequestBody withDataType(String dataType) {
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

    public ImportTableRequestBody withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 导入表所属的数据库名称。
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public ImportTableRequestBody withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 导入表的名称。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ImportTableRequestBody withWithColumnHeader(Boolean withColumnHeader) {
        this.withColumnHeader = withColumnHeader;
        return this;
    }

    /**
     * 导入数据中的第一行数据是否包括列名，即表头。默认为“false”，表示不包括列名。导入CSV类型数据时可指定。
     * @return withColumnHeader
     */
    public Boolean getWithColumnHeader() {
        return withColumnHeader;
    }

    public void setWithColumnHeader(Boolean withColumnHeader) {
        this.withColumnHeader = withColumnHeader;
    }

    public ImportTableRequestBody withDelimiter(String delimiter) {
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

    public ImportTableRequestBody withQuoteChar(String quoteChar) {
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

    public ImportTableRequestBody withEscapeChar(String escapeChar) {
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

    public ImportTableRequestBody withDateFormat(String dateFormat) {
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

    public ImportTableRequestBody withBadRecordsPath(String badRecordsPath) {
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

    public ImportTableRequestBody withTimestampFormat(String timestampFormat) {
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

    public ImportTableRequestBody withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 指定执行该任务的队列。若不指定队列，将采用default队列执行操作。
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public ImportTableRequestBody withOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }

    /**
     * 是否覆盖之前的数据
     * @return overwrite
     */
    public Boolean getOverwrite() {
        return overwrite;
    }

    public void setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
    }

    public ImportTableRequestBody withPartitionSpec(String partitionSpec) {
        this.partitionSpec = partitionSpec;
        return this;
    }

    /**
     * 表示需要导入到哪个分区
     * @return partitionSpec
     */
    public String getPartitionSpec() {
        return partitionSpec;
    }

    public void setPartitionSpec(String partitionSpec) {
        this.partitionSpec = partitionSpec;
    }

    public ImportTableRequestBody withConf(List<String> conf) {
        this.conf = conf;
        return this;
    }

    public ImportTableRequestBody addConfItem(String confItem) {
        if (this.conf == null) {
            this.conf = new ArrayList<>();
        }
        this.conf.add(confItem);
        return this;
    }

    public ImportTableRequestBody withConf(Consumer<List<String>> confSetter) {
        if (this.conf == null) {
            this.conf = new ArrayList<>();
        }
        confSetter.accept(this.conf);
        return this;
    }

    /**
     * 用于定义此配置项的参数
     * @return conf
     */
    public List<String> getConf() {
        return conf;
    }

    public void setConf(List<String> conf) {
        this.conf = conf;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImportTableRequestBody importTableRequestBody = (ImportTableRequestBody) o;
        return Objects.equals(this.dataPath, importTableRequestBody.dataPath)
            && Objects.equals(this.dataType, importTableRequestBody.dataType)
            && Objects.equals(this.databaseName, importTableRequestBody.databaseName)
            && Objects.equals(this.tableName, importTableRequestBody.tableName)
            && Objects.equals(this.withColumnHeader, importTableRequestBody.withColumnHeader)
            && Objects.equals(this.delimiter, importTableRequestBody.delimiter)
            && Objects.equals(this.quoteChar, importTableRequestBody.quoteChar)
            && Objects.equals(this.escapeChar, importTableRequestBody.escapeChar)
            && Objects.equals(this.dateFormat, importTableRequestBody.dateFormat)
            && Objects.equals(this.badRecordsPath, importTableRequestBody.badRecordsPath)
            && Objects.equals(this.timestampFormat, importTableRequestBody.timestampFormat)
            && Objects.equals(this.queueName, importTableRequestBody.queueName)
            && Objects.equals(this.overwrite, importTableRequestBody.overwrite)
            && Objects.equals(this.partitionSpec, importTableRequestBody.partitionSpec)
            && Objects.equals(this.conf, importTableRequestBody.conf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataPath,
            dataType,
            databaseName,
            tableName,
            withColumnHeader,
            delimiter,
            quoteChar,
            escapeChar,
            dateFormat,
            badRecordsPath,
            timestampFormat,
            queueName,
            overwrite,
            partitionSpec,
            conf);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportTableRequestBody {\n");
        sb.append("    dataPath: ").append(toIndentedString(dataPath)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    withColumnHeader: ").append(toIndentedString(withColumnHeader)).append("\n");
        sb.append("    delimiter: ").append(toIndentedString(delimiter)).append("\n");
        sb.append("    quoteChar: ").append(toIndentedString(quoteChar)).append("\n");
        sb.append("    escapeChar: ").append(toIndentedString(escapeChar)).append("\n");
        sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
        sb.append("    badRecordsPath: ").append(toIndentedString(badRecordsPath)).append("\n");
        sb.append("    timestampFormat: ").append(toIndentedString(timestampFormat)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    overwrite: ").append(toIndentedString(overwrite)).append("\n");
        sb.append("    partitionSpec: ").append(toIndentedString(partitionSpec)).append("\n");
        sb.append("    conf: ").append(toIndentedString(conf)).append("\n");
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
