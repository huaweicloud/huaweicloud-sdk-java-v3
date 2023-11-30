package com.huaweicloud.sdk.dis.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UpdateStreamReq
 */
public class UpdateStreamReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    private String streamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_duration")

    private Integer dataDuration;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_scale_enabled")

    private Boolean autoScaleEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_scale_min_partition_count")

    private Long autoScaleMinPartitionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_scale_max_partition_count")

    private Long autoScaleMaxPartitionCount;

    public UpdateStreamReq withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * 待更新的通道名称。
     * @return streamName
     */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public UpdateStreamReq withDataDuration(Integer dataDuration) {
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

    public UpdateStreamReq withDataType(DataTypeEnum dataType) {
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

    public UpdateStreamReq withDataSchema(String dataSchema) {
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

    public UpdateStreamReq withAutoScaleEnabled(Boolean autoScaleEnabled) {
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

    public UpdateStreamReq withAutoScaleMinPartitionCount(Long autoScaleMinPartitionCount) {
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

    public UpdateStreamReq withAutoScaleMaxPartitionCount(Long autoScaleMaxPartitionCount) {
        this.autoScaleMaxPartitionCount = autoScaleMaxPartitionCount;
        return this;
    }

    /**
     * 当自动扩缩容启用时，自动扩容的最大分片数。
     * @return autoScaleMaxPartitionCount
     */
    public Long getAutoScaleMaxPartitionCount() {
        return autoScaleMaxPartitionCount;
    }

    public void setAutoScaleMaxPartitionCount(Long autoScaleMaxPartitionCount) {
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
        UpdateStreamReq that = (UpdateStreamReq) obj;
        return Objects.equals(this.streamName, that.streamName) && Objects.equals(this.dataDuration, that.dataDuration)
            && Objects.equals(this.dataType, that.dataType) && Objects.equals(this.dataSchema, that.dataSchema)
            && Objects.equals(this.autoScaleEnabled, that.autoScaleEnabled)
            && Objects.equals(this.autoScaleMinPartitionCount, that.autoScaleMinPartitionCount)
            && Objects.equals(this.autoScaleMaxPartitionCount, that.autoScaleMaxPartitionCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streamName,
            dataDuration,
            dataType,
            dataSchema,
            autoScaleEnabled,
            autoScaleMinPartitionCount,
            autoScaleMaxPartitionCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateStreamReq {\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    dataDuration: ").append(toIndentedString(dataDuration)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    dataSchema: ").append(toIndentedString(dataSchema)).append("\n");
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
