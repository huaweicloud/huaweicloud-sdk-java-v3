package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 导出查询结果
 */
public class ExportSqlJobResultRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_path")

    private String dataPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compress")

    private String compress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    /**
     * 导出模式，目前支持“ErrorIfExists”，“Overwrite”，不指定“export_mode”则默认为“ErrorIfExists”。  “ErrorIfExists”：存在即报错。指定的导出目录必须不存在，如果指定目录已经存在，系统将返回错误信息，无法执行导出操作。 “Overwrite”：覆盖。在指定目录下新建文件，会删除已有文件。
     */
    public static final class ExportModeEnum {

        /**
         * Enum ERRORIFEXISTS for value: "ErrorIfExists"
         */
        public static final ExportModeEnum ERRORIFEXISTS = new ExportModeEnum("ErrorIfExists");

        /**
         * Enum OVERWRITE for value: "Overwrite"
         */
        public static final ExportModeEnum OVERWRITE = new ExportModeEnum("Overwrite");

        private static final Map<String, ExportModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ExportModeEnum> createStaticFields() {
            Map<String, ExportModeEnum> map = new HashMap<>();
            map.put("ErrorIfExists", ERRORIFEXISTS);
            map.put("Overwrite", OVERWRITE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ExportModeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ExportModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ExportModeEnum(value));
        }

        public static ExportModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ExportModeEnum) {
                return this.value.equals(((ExportModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_mode")

    private ExportModeEnum exportMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with_column_header")

    private Boolean withColumnHeader;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_num")

    private Integer limitNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encoding_type")

    private String encodingType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quote_char")

    private String quoteChar;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "escape_char")

    private String escapeChar;

    public ExportSqlJobResultRequestBody withDataPath(String dataPath) {
        this.dataPath = dataPath;
        return this;
    }

    /**
     * ExportResult
     * @return dataPath
     */
    public String getDataPath() {
        return dataPath;
    }

    public void setDataPath(String dataPath) {
        this.dataPath = dataPath;
    }

    public ExportSqlJobResultRequestBody withCompress(String compress) {
        this.compress = compress;
        return this;
    }

    /**
     * 导出数据的压缩格式，目前支持gzip，bzip2和deflate压缩方式； 默认值为none，表示不压缩。
     * @return compress
     */
    public String getCompress() {
        return compress;
    }

    public void setCompress(String compress) {
        this.compress = compress;
    }

    public ExportSqlJobResultRequestBody withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 导出数据的存储格式，暂时只支持csv格式。
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public ExportSqlJobResultRequestBody withQueueName(String queueName) {
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

    public ExportSqlJobResultRequestBody withExportMode(ExportModeEnum exportMode) {
        this.exportMode = exportMode;
        return this;
    }

    /**
     * 导出模式，目前支持“ErrorIfExists”，“Overwrite”，不指定“export_mode”则默认为“ErrorIfExists”。  “ErrorIfExists”：存在即报错。指定的导出目录必须不存在，如果指定目录已经存在，系统将返回错误信息，无法执行导出操作。 “Overwrite”：覆盖。在指定目录下新建文件，会删除已有文件。
     * @return exportMode
     */
    public ExportModeEnum getExportMode() {
        return exportMode;
    }

    public void setExportMode(ExportModeEnum exportMode) {
        this.exportMode = exportMode;
    }

    public ExportSqlJobResultRequestBody withWithColumnHeader(Boolean withColumnHeader) {
        this.withColumnHeader = withColumnHeader;
        return this;
    }

    /**
     * 导出csv格式数据时，是否导出列名。  设置为“true”，表示导出列名。 设置为“false”，表示不导出列名。 若为空，默认为“false”。
     * @return withColumnHeader
     */
    public Boolean getWithColumnHeader() {
        return withColumnHeader;
    }

    public void setWithColumnHeader(Boolean withColumnHeader) {
        this.withColumnHeader = withColumnHeader;
    }

    public ExportSqlJobResultRequestBody withLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
        return this;
    }

    /**
     * 导出数据条数，默认为0表示全部
     * @return limitNum
     */
    public Integer getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }

    public ExportSqlJobResultRequestBody withEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }

    /**
     * 导出数据的编码格式。支持\"utf-8\"，\"gb2312\"，\"gbk\"三种，如果不填写默认为\"utf-8\"。
     * @return encodingType
     */
    public String getEncodingType() {
        return encodingType;
    }

    public void setEncodingType(String encodingType) {
        this.encodingType = encodingType;
    }

    public ExportSqlJobResultRequestBody withQuoteChar(String quoteChar) {
        this.quoteChar = quoteChar;
        return this;
    }

    /**
     * 用户自定义引用字符
     * @return quoteChar
     */
    public String getQuoteChar() {
        return quoteChar;
    }

    public void setQuoteChar(String quoteChar) {
        this.quoteChar = quoteChar;
    }

    public ExportSqlJobResultRequestBody withEscapeChar(String escapeChar) {
        this.escapeChar = escapeChar;
        return this;
    }

    /**
     * 用户自定义转义字符
     * @return escapeChar
     */
    public String getEscapeChar() {
        return escapeChar;
    }

    public void setEscapeChar(String escapeChar) {
        this.escapeChar = escapeChar;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportSqlJobResultRequestBody that = (ExportSqlJobResultRequestBody) obj;
        return Objects.equals(this.dataPath, that.dataPath) && Objects.equals(this.compress, that.compress)
            && Objects.equals(this.dataType, that.dataType) && Objects.equals(this.queueName, that.queueName)
            && Objects.equals(this.exportMode, that.exportMode)
            && Objects.equals(this.withColumnHeader, that.withColumnHeader)
            && Objects.equals(this.limitNum, that.limitNum) && Objects.equals(this.encodingType, that.encodingType)
            && Objects.equals(this.quoteChar, that.quoteChar) && Objects.equals(this.escapeChar, that.escapeChar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataPath,
            compress,
            dataType,
            queueName,
            exportMode,
            withColumnHeader,
            limitNum,
            encodingType,
            quoteChar,
            escapeChar);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportSqlJobResultRequestBody {\n");
        sb.append("    dataPath: ").append(toIndentedString(dataPath)).append("\n");
        sb.append("    compress: ").append(toIndentedString(compress)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    exportMode: ").append(toIndentedString(exportMode)).append("\n");
        sb.append("    withColumnHeader: ").append(toIndentedString(withColumnHeader)).append("\n");
        sb.append("    limitNum: ").append(toIndentedString(limitNum)).append("\n");
        sb.append("    encodingType: ").append(toIndentedString(encodingType)).append("\n");
        sb.append("    quoteChar: ").append(toIndentedString(quoteChar)).append("\n");
        sb.append("    escapeChar: ").append(toIndentedString(escapeChar)).append("\n");
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
