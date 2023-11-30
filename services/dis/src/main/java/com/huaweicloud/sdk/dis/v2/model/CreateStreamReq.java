package com.huaweicloud.sdk.dis.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateStreamReq
 */
public class CreateStreamReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    private String streamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_count")

    private Integer partitionCount;

    /**
     * 通道类型。  - COMMON：普通通道，表示1MB带宽。 - ADVANCED：高级通道，表示5MB带宽。
     */
    public static final class StreamTypeEnum {

        /**
         * Enum COMMON for value: "COMMON"
         */
        public static final StreamTypeEnum COMMON = new StreamTypeEnum("COMMON");

        /**
         * Enum ADVANCED for value: "ADVANCED"
         */
        public static final StreamTypeEnum ADVANCED = new StreamTypeEnum("ADVANCED");

        private static final Map<String, StreamTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StreamTypeEnum> createStaticFields() {
            Map<String, StreamTypeEnum> map = new HashMap<>();
            map.put("COMMON", COMMON);
            map.put("ADVANCED", ADVANCED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StreamTypeEnum(String value) {
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
        public static StreamTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StreamTypeEnum(value));
        }

        public static StreamTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StreamTypeEnum) {
                return this.value.equals(((StreamTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_type")

    private StreamTypeEnum streamType;

    /**
     * 源数据类型。  - BLOB：存储在数据库管理系统中的一组二进制数据。 - JSON：一种开放的文件格式，以易读的文字为基础，用来传输由属性值或者序列性的值组成的数据对象。 - CSV：纯文本形式存储的表格数据，分隔符默认采用逗号。  缺省值：BLOB。
     */
    public static final class DataTypeEnum {

        /**
         * Enum BLOB for value: "BLOB"
         */
        public static final DataTypeEnum BLOB = new DataTypeEnum("BLOB");

        /**
         * Enum JSON for value: "JSON"
         */
        public static final DataTypeEnum JSON = new DataTypeEnum("JSON");

        /**
         * Enum CSV for value: "CSV"
         */
        public static final DataTypeEnum CSV = new DataTypeEnum("CSV");

        private static final Map<String, DataTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DataTypeEnum> createStaticFields() {
            Map<String, DataTypeEnum> map = new HashMap<>();
            map.put("BLOB", BLOB);
            map.put("JSON", JSON);
            map.put("CSV", CSV);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DataTypeEnum(String value) {
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
        public static DataTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DataTypeEnum(value));
        }

        public static DataTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DataTypeEnum) {
                return this.value.equals(((DataTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private DataTypeEnum dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_duration")

    private Integer dataDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_scale_enabled")

    private Boolean autoScaleEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_scale_min_partition_count")

    private Long autoScaleMinPartitionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_scale_max_partition_count")

    private Integer autoScaleMaxPartitionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_schema")

    private String dataSchema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "csv_properties")

    private CSVProperties csvProperties;

    /**
     * 数据的压缩类型，目前支持：  - snappy  - gzip  - zip  默认不压缩。
     */
    public static final class CompressionFormatEnum {

        /**
         * Enum SNAPPY for value: "snappy"
         */
        public static final CompressionFormatEnum SNAPPY = new CompressionFormatEnum("snappy");

        /**
         * Enum GZIP for value: "gzip"
         */
        public static final CompressionFormatEnum GZIP = new CompressionFormatEnum("gzip");

        /**
         * Enum ZIP for value: "zip"
         */
        public static final CompressionFormatEnum ZIP = new CompressionFormatEnum("zip");

        private static final Map<String, CompressionFormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CompressionFormatEnum> createStaticFields() {
            Map<String, CompressionFormatEnum> map = new HashMap<>();
            map.put("snappy", SNAPPY);
            map.put("gzip", GZIP);
            map.put("zip", ZIP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CompressionFormatEnum(String value) {
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
        public static CompressionFormatEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CompressionFormatEnum(value));
        }

        public static CompressionFormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CompressionFormatEnum) {
                return this.value.equals(((CompressionFormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compression_format")

    private CompressionFormatEnum compressionFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<SysTag> sysTags = null;

    public CreateStreamReq withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * 通道名称。  通道名称由字母、数字、下划线和中划线组成，长度为1～64字符。
     * @return streamName
     */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public CreateStreamReq withPartitionCount(Integer partitionCount) {
        this.partitionCount = partitionCount;
        return this;
    }

    /**
     * 分区数量。  分区是DIS数据通道的基本吞吐量单位。
     * @return partitionCount
     */
    public Integer getPartitionCount() {
        return partitionCount;
    }

    public void setPartitionCount(Integer partitionCount) {
        this.partitionCount = partitionCount;
    }

    public CreateStreamReq withStreamType(StreamTypeEnum streamType) {
        this.streamType = streamType;
        return this;
    }

    /**
     * 通道类型。  - COMMON：普通通道，表示1MB带宽。 - ADVANCED：高级通道，表示5MB带宽。
     * @return streamType
     */
    public StreamTypeEnum getStreamType() {
        return streamType;
    }

    public void setStreamType(StreamTypeEnum streamType) {
        this.streamType = streamType;
    }

    public CreateStreamReq withDataType(DataTypeEnum dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 源数据类型。  - BLOB：存储在数据库管理系统中的一组二进制数据。 - JSON：一种开放的文件格式，以易读的文字为基础，用来传输由属性值或者序列性的值组成的数据对象。 - CSV：纯文本形式存储的表格数据，分隔符默认采用逗号。  缺省值：BLOB。
     * @return dataType
     */
    public DataTypeEnum getDataType() {
        return dataType;
    }

    public void setDataType(DataTypeEnum dataType) {
        this.dataType = dataType;
    }

    public CreateStreamReq withDataDuration(Integer dataDuration) {
        this.dataDuration = dataDuration;
        return this;
    }

    /**
     * 数据保留时长。  取值范围：24~72。  单位：小时。  空表示使用缺省值。
     * @return dataDuration
     */
    public Integer getDataDuration() {
        return dataDuration;
    }

    public void setDataDuration(Integer dataDuration) {
        this.dataDuration = dataDuration;
    }

    public CreateStreamReq withAutoScaleEnabled(Boolean autoScaleEnabled) {
        this.autoScaleEnabled = autoScaleEnabled;
        return this;
    }

    /**
     * 是否开启自动扩缩容。  - true：开启自动扩缩容。 - false：关闭自动扩缩容。  默认不开启。
     * @return autoScaleEnabled
     */
    public Boolean getAutoScaleEnabled() {
        return autoScaleEnabled;
    }

    public void setAutoScaleEnabled(Boolean autoScaleEnabled) {
        this.autoScaleEnabled = autoScaleEnabled;
    }

    public CreateStreamReq withAutoScaleMinPartitionCount(Long autoScaleMinPartitionCount) {
        this.autoScaleMinPartitionCount = autoScaleMinPartitionCount;
        return this;
    }

    /**
     * 当自动扩缩容启用时，自动缩容的最小分片数。
     * minimum: 1
     * @return autoScaleMinPartitionCount
     */
    public Long getAutoScaleMinPartitionCount() {
        return autoScaleMinPartitionCount;
    }

    public void setAutoScaleMinPartitionCount(Long autoScaleMinPartitionCount) {
        this.autoScaleMinPartitionCount = autoScaleMinPartitionCount;
    }

    public CreateStreamReq withAutoScaleMaxPartitionCount(Integer autoScaleMaxPartitionCount) {
        this.autoScaleMaxPartitionCount = autoScaleMaxPartitionCount;
        return this;
    }

    /**
     * 当自动扩缩容启用时，自动扩容的最大分片数。
     * @return autoScaleMaxPartitionCount
     */
    public Integer getAutoScaleMaxPartitionCount() {
        return autoScaleMaxPartitionCount;
    }

    public void setAutoScaleMaxPartitionCount(Integer autoScaleMaxPartitionCount) {
        this.autoScaleMaxPartitionCount = autoScaleMaxPartitionCount;
    }

    public CreateStreamReq withDataSchema(String dataSchema) {
        this.dataSchema = dataSchema;
        return this;
    }

    /**
     * 用于描述用户JSON、CSV格式的源数据结构，采用Avro Schema的语法描述。
     * @return dataSchema
     */
    public String getDataSchema() {
        return dataSchema;
    }

    public void setDataSchema(String dataSchema) {
        this.dataSchema = dataSchema;
    }

    public CreateStreamReq withCsvProperties(CSVProperties csvProperties) {
        this.csvProperties = csvProperties;
        return this;
    }

    public CreateStreamReq withCsvProperties(Consumer<CSVProperties> csvPropertiesSetter) {
        if (this.csvProperties == null) {
            this.csvProperties = new CSVProperties();
            csvPropertiesSetter.accept(this.csvProperties);
        }

        return this;
    }

    /**
     * Get csvProperties
     * @return csvProperties
     */
    public CSVProperties getCsvProperties() {
        return csvProperties;
    }

    public void setCsvProperties(CSVProperties csvProperties) {
        this.csvProperties = csvProperties;
    }

    public CreateStreamReq withCompressionFormat(CompressionFormatEnum compressionFormat) {
        this.compressionFormat = compressionFormat;
        return this;
    }

    /**
     * 数据的压缩类型，目前支持：  - snappy  - gzip  - zip  默认不压缩。
     * @return compressionFormat
     */
    public CompressionFormatEnum getCompressionFormat() {
        return compressionFormat;
    }

    public void setCompressionFormat(CompressionFormatEnum compressionFormat) {
        this.compressionFormat = compressionFormat;
    }

    public CreateStreamReq withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateStreamReq addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateStreamReq withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 通道标签列表。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public CreateStreamReq withSysTags(List<SysTag> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public CreateStreamReq addSysTagsItem(SysTag sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public CreateStreamReq withSysTags(Consumer<List<SysTag>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 通道企业项目列表。
     * @return sysTags
     */
    public List<SysTag> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<SysTag> sysTags) {
        this.sysTags = sysTags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateStreamReq that = (CreateStreamReq) obj;
        return Objects.equals(this.streamName, that.streamName)
            && Objects.equals(this.partitionCount, that.partitionCount)
            && Objects.equals(this.streamType, that.streamType) && Objects.equals(this.dataType, that.dataType)
            && Objects.equals(this.dataDuration, that.dataDuration)
            && Objects.equals(this.autoScaleEnabled, that.autoScaleEnabled)
            && Objects.equals(this.autoScaleMinPartitionCount, that.autoScaleMinPartitionCount)
            && Objects.equals(this.autoScaleMaxPartitionCount, that.autoScaleMaxPartitionCount)
            && Objects.equals(this.dataSchema, that.dataSchema)
            && Objects.equals(this.csvProperties, that.csvProperties)
            && Objects.equals(this.compressionFormat, that.compressionFormat) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.sysTags, that.sysTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streamName,
            partitionCount,
            streamType,
            dataType,
            dataDuration,
            autoScaleEnabled,
            autoScaleMinPartitionCount,
            autoScaleMaxPartitionCount,
            dataSchema,
            csvProperties,
            compressionFormat,
            tags,
            sysTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateStreamReq {\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    partitionCount: ").append(toIndentedString(partitionCount)).append("\n");
        sb.append("    streamType: ").append(toIndentedString(streamType)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    dataDuration: ").append(toIndentedString(dataDuration)).append("\n");
        sb.append("    autoScaleEnabled: ").append(toIndentedString(autoScaleEnabled)).append("\n");
        sb.append("    autoScaleMinPartitionCount: ").append(toIndentedString(autoScaleMinPartitionCount)).append("\n");
        sb.append("    autoScaleMaxPartitionCount: ").append(toIndentedString(autoScaleMaxPartitionCount)).append("\n");
        sb.append("    dataSchema: ").append(toIndentedString(dataSchema)).append("\n");
        sb.append("    csvProperties: ").append(toIndentedString(csvProperties)).append("\n");
        sb.append("    compressionFormat: ").append(toIndentedString(compressionFormat)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
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
