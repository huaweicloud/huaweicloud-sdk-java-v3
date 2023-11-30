package com.huaweicloud.sdk.dis.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowStreamResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    private String streamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified_time")

    private Long lastModifiedTime;

    /**
     * 通道的当前状态。  - CREATING：创建中 - RUNNING：运行中 - TERMINATING：删除中 - TERMINATED：已删除
     */
    public static final class StatusEnum {

        /**
         * Enum CREATING for value: "CREATING"
         */
        public static final StatusEnum CREATING = new StatusEnum("CREATING");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StatusEnum RUNNING = new StatusEnum("RUNNING");

        /**
         * Enum TERMINATING for value: "TERMINATING"
         */
        public static final StatusEnum TERMINATING = new StatusEnum("TERMINATING");

        /**
         * Enum FROZEN for value: "FROZEN"
         */
        public static final StatusEnum FROZEN = new StatusEnum("FROZEN");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATING", CREATING);
            map.put("RUNNING", RUNNING);
            map.put("TERMINATING", TERMINATING);
            map.put("FROZEN", FROZEN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partitions")

    private List<PartitionResult> partitions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_more_partitions")

    private Boolean hasMorePartitions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_period")

    private Integer retentionPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_id")

    private String streamId;

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
    @JsonProperty(value = "data_schema")

    private String dataSchema;

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
    @JsonProperty(value = "csv_properties")

    private CSVProperties csvProperties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "writable_partition_count")

    private Integer writablePartitionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readable_partition_count")

    private Integer readablePartitionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_partition_counts")

    private List<UpdatePartitionCount> updatePartitionCounts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<SysTag> sysTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_scale_enabled")

    private Boolean autoScaleEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_scale_min_partition_count")

    private Integer autoScaleMinPartitionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_scale_max_partition_count")

    private Integer autoScaleMaxPartitionCount;

    public ShowStreamResponse withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * 通道名称。
     * @return streamName
     */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public ShowStreamResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 通道创建的时间，13位时间戳。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowStreamResponse withLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * 通道最近一次修改的时间，13位时间戳。
     * @return lastModifiedTime
     */
    public Long getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public ShowStreamResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 通道的当前状态。  - CREATING：创建中 - RUNNING：运行中 - TERMINATING：删除中 - TERMINATED：已删除
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowStreamResponse withStreamType(StreamTypeEnum streamType) {
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

    public ShowStreamResponse withPartitions(List<PartitionResult> partitions) {
        this.partitions = partitions;
        return this;
    }

    public ShowStreamResponse addPartitionsItem(PartitionResult partitionsItem) {
        if (this.partitions == null) {
            this.partitions = new ArrayList<>();
        }
        this.partitions.add(partitionsItem);
        return this;
    }

    public ShowStreamResponse withPartitions(Consumer<List<PartitionResult>> partitionsSetter) {
        if (this.partitions == null) {
            this.partitions = new ArrayList<>();
        }
        partitionsSetter.accept(this.partitions);
        return this;
    }

    /**
     * 通道的分区列表。
     * @return partitions
     */
    public List<PartitionResult> getPartitions() {
        return partitions;
    }

    public void setPartitions(List<PartitionResult> partitions) {
        this.partitions = partitions;
    }

    public ShowStreamResponse withHasMorePartitions(Boolean hasMorePartitions) {
        this.hasMorePartitions = hasMorePartitions;
        return this;
    }

    /**
     * 是否还有更多满足请求条件的分区。  - 是：true。 - 否：false。
     * @return hasMorePartitions
     */
    public Boolean getHasMorePartitions() {
        return hasMorePartitions;
    }

    public void setHasMorePartitions(Boolean hasMorePartitions) {
        this.hasMorePartitions = hasMorePartitions;
    }

    public ShowStreamResponse withRetentionPeriod(Integer retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
        return this;
    }

    /**
     * 数据保留时长，单位是小时。
     * @return retentionPeriod
     */
    public Integer getRetentionPeriod() {
        return retentionPeriod;
    }

    public void setRetentionPeriod(Integer retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    public ShowStreamResponse withStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }

    /**
     * 通道唯一标示符。
     * @return streamId
     */
    public String getStreamId() {
        return streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    public ShowStreamResponse withDataType(DataTypeEnum dataType) {
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

    public ShowStreamResponse withDataSchema(String dataSchema) {
        this.dataSchema = dataSchema;
        return this;
    }

    /**
     * 用于描述用户JSON、CSV格式的源数据结构，采用Avro Schema的语法描述。Avro介绍您也可以点击[这里](http://avro.apache.org/docs/current/#schemas)查看。
     * @return dataSchema
     */
    public String getDataSchema() {
        return dataSchema;
    }

    public void setDataSchema(String dataSchema) {
        this.dataSchema = dataSchema;
    }

    public ShowStreamResponse withCompressionFormat(CompressionFormatEnum compressionFormat) {
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

    public ShowStreamResponse withCsvProperties(CSVProperties csvProperties) {
        this.csvProperties = csvProperties;
        return this;
    }

    public ShowStreamResponse withCsvProperties(Consumer<CSVProperties> csvPropertiesSetter) {
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

    public ShowStreamResponse withWritablePartitionCount(Integer writablePartitionCount) {
        this.writablePartitionCount = writablePartitionCount;
        return this;
    }

    /**
     * 可写分区总数量（只包含ACTIVE状态的分区）。
     * @return writablePartitionCount
     */
    public Integer getWritablePartitionCount() {
        return writablePartitionCount;
    }

    public void setWritablePartitionCount(Integer writablePartitionCount) {
        this.writablePartitionCount = writablePartitionCount;
    }

    public ShowStreamResponse withReadablePartitionCount(Integer readablePartitionCount) {
        this.readablePartitionCount = readablePartitionCount;
        return this;
    }

    /**
     * 可读分区总数量（包含ACTIVE与DELETED状态的分区）。
     * @return readablePartitionCount
     */
    public Integer getReadablePartitionCount() {
        return readablePartitionCount;
    }

    public void setReadablePartitionCount(Integer readablePartitionCount) {
        this.readablePartitionCount = readablePartitionCount;
    }

    public ShowStreamResponse withUpdatePartitionCounts(List<UpdatePartitionCount> updatePartitionCounts) {
        this.updatePartitionCounts = updatePartitionCounts;
        return this;
    }

    public ShowStreamResponse addUpdatePartitionCountsItem(UpdatePartitionCount updatePartitionCountsItem) {
        if (this.updatePartitionCounts == null) {
            this.updatePartitionCounts = new ArrayList<>();
        }
        this.updatePartitionCounts.add(updatePartitionCountsItem);
        return this;
    }

    public ShowStreamResponse withUpdatePartitionCounts(
        Consumer<List<UpdatePartitionCount>> updatePartitionCountsSetter) {
        if (this.updatePartitionCounts == null) {
            this.updatePartitionCounts = new ArrayList<>();
        }
        updatePartitionCountsSetter.accept(this.updatePartitionCounts);
        return this;
    }

    /**
     * 扩缩容操作记录列表。
     * @return updatePartitionCounts
     */
    public List<UpdatePartitionCount> getUpdatePartitionCounts() {
        return updatePartitionCounts;
    }

    public void setUpdatePartitionCounts(List<UpdatePartitionCount> updatePartitionCounts) {
        this.updatePartitionCounts = updatePartitionCounts;
    }

    public ShowStreamResponse withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public ShowStreamResponse addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowStreamResponse withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 通道的标签列表。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public ShowStreamResponse withSysTags(List<SysTag> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public ShowStreamResponse addSysTagsItem(SysTag sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public ShowStreamResponse withSysTags(Consumer<List<SysTag>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 通道的企业项目。
     * @return sysTags
     */
    public List<SysTag> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<SysTag> sysTags) {
        this.sysTags = sysTags;
    }

    public ShowStreamResponse withAutoScaleEnabled(Boolean autoScaleEnabled) {
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

    public ShowStreamResponse withAutoScaleMinPartitionCount(Integer autoScaleMinPartitionCount) {
        this.autoScaleMinPartitionCount = autoScaleMinPartitionCount;
        return this;
    }

    /**
     * 当自动扩缩容启用时，自动缩容的最小分片数。
     * @return autoScaleMinPartitionCount
     */
    public Integer getAutoScaleMinPartitionCount() {
        return autoScaleMinPartitionCount;
    }

    public void setAutoScaleMinPartitionCount(Integer autoScaleMinPartitionCount) {
        this.autoScaleMinPartitionCount = autoScaleMinPartitionCount;
    }

    public ShowStreamResponse withAutoScaleMaxPartitionCount(Integer autoScaleMaxPartitionCount) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStreamResponse that = (ShowStreamResponse) obj;
        return Objects.equals(this.streamName, that.streamName) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.lastModifiedTime, that.lastModifiedTime) && Objects.equals(this.status, that.status)
            && Objects.equals(this.streamType, that.streamType) && Objects.equals(this.partitions, that.partitions)
            && Objects.equals(this.hasMorePartitions, that.hasMorePartitions)
            && Objects.equals(this.retentionPeriod, that.retentionPeriod)
            && Objects.equals(this.streamId, that.streamId) && Objects.equals(this.dataType, that.dataType)
            && Objects.equals(this.dataSchema, that.dataSchema)
            && Objects.equals(this.compressionFormat, that.compressionFormat)
            && Objects.equals(this.csvProperties, that.csvProperties)
            && Objects.equals(this.writablePartitionCount, that.writablePartitionCount)
            && Objects.equals(this.readablePartitionCount, that.readablePartitionCount)
            && Objects.equals(this.updatePartitionCounts, that.updatePartitionCounts)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.sysTags, that.sysTags)
            && Objects.equals(this.autoScaleEnabled, that.autoScaleEnabled)
            && Objects.equals(this.autoScaleMinPartitionCount, that.autoScaleMinPartitionCount)
            && Objects.equals(this.autoScaleMaxPartitionCount, that.autoScaleMaxPartitionCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streamName,
            createTime,
            lastModifiedTime,
            status,
            streamType,
            partitions,
            hasMorePartitions,
            retentionPeriod,
            streamId,
            dataType,
            dataSchema,
            compressionFormat,
            csvProperties,
            writablePartitionCount,
            readablePartitionCount,
            updatePartitionCounts,
            tags,
            sysTags,
            autoScaleEnabled,
            autoScaleMinPartitionCount,
            autoScaleMaxPartitionCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStreamResponse {\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    streamType: ").append(toIndentedString(streamType)).append("\n");
        sb.append("    partitions: ").append(toIndentedString(partitions)).append("\n");
        sb.append("    hasMorePartitions: ").append(toIndentedString(hasMorePartitions)).append("\n");
        sb.append("    retentionPeriod: ").append(toIndentedString(retentionPeriod)).append("\n");
        sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    dataSchema: ").append(toIndentedString(dataSchema)).append("\n");
        sb.append("    compressionFormat: ").append(toIndentedString(compressionFormat)).append("\n");
        sb.append("    csvProperties: ").append(toIndentedString(csvProperties)).append("\n");
        sb.append("    writablePartitionCount: ").append(toIndentedString(writablePartitionCount)).append("\n");
        sb.append("    readablePartitionCount: ").append(toIndentedString(readablePartitionCount)).append("\n");
        sb.append("    updatePartitionCounts: ").append(toIndentedString(updatePartitionCounts)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
        sb.append("    autoScaleEnabled: ").append(toIndentedString(autoScaleEnabled)).append("\n");
        sb.append("    autoScaleMinPartitionCount: ").append(toIndentedString(autoScaleMinPartitionCount)).append("\n");
        sb.append("    autoScaleMaxPartitionCount: ").append(toIndentedString(autoScaleMaxPartitionCount)).append("\n");
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
