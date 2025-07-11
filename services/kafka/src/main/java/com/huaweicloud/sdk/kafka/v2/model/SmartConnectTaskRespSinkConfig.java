package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SmartConnectTaskRespSinkConfig
 */
public class SmartConnectTaskRespSinkConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumer_strategy")

    private String consumerStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_file_type")

    private String destinationFileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deliver_time_interval")

    private Integer deliverTimeInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket_name")

    private String obsBucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_path")

    private String obsPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_format")

    private String partitionFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_delimiter")

    private String recordDelimiter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "store_keys")

    private Boolean storeKeys;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_part_size")

    private Integer obsPartSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flush_size")

    private Integer flushSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timezone")

    private String timezone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_generator_class")

    private String schemaGeneratorClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partitioner_class")

    private String partitionerClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_converter")

    private String valueConverter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_converter")

    private String keyConverter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kv_delimiter")

    private String kvDelimiter;

    public SmartConnectTaskRespSinkConfig withConsumerStrategy(String consumerStrategy) {
        this.consumerStrategy = consumerStrategy;
        return this;
    }

    /**
     * **参数解释**： 转储启动偏移量。（仅目标端类型为OBS时会显示） **取值范围**： - latest：获取最新的数据。 - earliest：获取最早的数据。
     * @return consumerStrategy
     */
    public String getConsumerStrategy() {
        return consumerStrategy;
    }

    public void setConsumerStrategy(String consumerStrategy) {
        this.consumerStrategy = consumerStrategy;
    }

    public SmartConnectTaskRespSinkConfig withDestinationFileType(String destinationFileType) {
        this.destinationFileType = destinationFileType;
        return this;
    }

    /**
     * **参数解释**： 转储文件格式。当前只支持TEXT。（仅目标端类型为OBS时会显示） **取值范围**： 不涉及。
     * @return destinationFileType
     */
    public String getDestinationFileType() {
        return destinationFileType;
    }

    public void setDestinationFileType(String destinationFileType) {
        this.destinationFileType = destinationFileType;
    }

    public SmartConnectTaskRespSinkConfig withDeliverTimeInterval(Integer deliverTimeInterval) {
        this.deliverTimeInterval = deliverTimeInterval;
        return this;
    }

    /**
     * **参数解释**： 数据转储周期（秒）。（仅目标端类型为OBS时会显示） **取值范围**： 不涉及。
     * @return deliverTimeInterval
     */
    public Integer getDeliverTimeInterval() {
        return deliverTimeInterval;
    }

    public void setDeliverTimeInterval(Integer deliverTimeInterval) {
        this.deliverTimeInterval = deliverTimeInterval;
    }

    public SmartConnectTaskRespSinkConfig withObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
        return this;
    }

    /**
     * **参数解释**： 转储地址。（仅目标端类型为OBS时会显示） **取值范围**： 不涉及。
     * @return obsBucketName
     */
    public String getObsBucketName() {
        return obsBucketName;
    }

    public void setObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
    }

    public SmartConnectTaskRespSinkConfig withObsPath(String obsPath) {
        this.obsPath = obsPath;
        return this;
    }

    /**
     * **参数解释**： 转储目录。（仅目标端类型为OBS时会显示） **取值范围**： 不涉及。
     * @return obsPath
     */
    public String getObsPath() {
        return obsPath;
    }

    public void setObsPath(String obsPath) {
        this.obsPath = obsPath;
    }

    public SmartConnectTaskRespSinkConfig withPartitionFormat(String partitionFormat) {
        this.partitionFormat = partitionFormat;
        return this;
    }

    /**
     * **参数解释**： 时间目录格式。（仅目标端类型为OBS时会显示） **取值范围**： 不涉及。
     * @return partitionFormat
     */
    public String getPartitionFormat() {
        return partitionFormat;
    }

    public void setPartitionFormat(String partitionFormat) {
        this.partitionFormat = partitionFormat;
    }

    public SmartConnectTaskRespSinkConfig withRecordDelimiter(String recordDelimiter) {
        this.recordDelimiter = recordDelimiter;
        return this;
    }

    /**
     * **参数解释**： 记录分行符。（仅目标端类型为OBS时会显示） **取值范围**： 不涉及。
     * @return recordDelimiter
     */
    public String getRecordDelimiter() {
        return recordDelimiter;
    }

    public void setRecordDelimiter(String recordDelimiter) {
        this.recordDelimiter = recordDelimiter;
    }

    public SmartConnectTaskRespSinkConfig withStoreKeys(Boolean storeKeys) {
        this.storeKeys = storeKeys;
        return this;
    }

    /**
     * **参数解释**： 存储Key。（仅目标端类型为OBS时会显示） **取值范围**： 不涉及。
     * @return storeKeys
     */
    public Boolean getStoreKeys() {
        return storeKeys;
    }

    public void setStoreKeys(Boolean storeKeys) {
        this.storeKeys = storeKeys;
    }

    public SmartConnectTaskRespSinkConfig withObsPartSize(Integer obsPartSize) {
        this.obsPartSize = obsPartSize;
        return this;
    }

    /**
     * **参数解释**： 每个传输文件多大后就开始上传，单位为byte；默认值5242880。（仅目标端类型为OBS时会显示） **取值范围**： 不涉及。
     * @return obsPartSize
     */
    public Integer getObsPartSize() {
        return obsPartSize;
    }

    public void setObsPartSize(Integer obsPartSize) {
        this.obsPartSize = obsPartSize;
    }

    public SmartConnectTaskRespSinkConfig withFlushSize(Integer flushSize) {
        this.flushSize = flushSize;
        return this;
    }

    /**
     * **参数解释**： 刷写数量。（仅目标端类型为OBS时会显示） **取值范围**： 不涉及。
     * @return flushSize
     */
    public Integer getFlushSize() {
        return flushSize;
    }

    public void setFlushSize(Integer flushSize) {
        this.flushSize = flushSize;
    }

    public SmartConnectTaskRespSinkConfig withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * **参数解释**： 时区。（仅目标端类型为OBS时会显示） **取值范围**： 不涉及。
     * @return timezone
     */
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public SmartConnectTaskRespSinkConfig withSchemaGeneratorClass(String schemaGeneratorClass) {
        this.schemaGeneratorClass = schemaGeneratorClass;
        return this;
    }

    /**
     * **参数解释**： schema_generator类，默认为\"io.confluent.connect.storage.hive.schema.DefaultSchemaGenerator\"。（仅目标端类型为OBS时会显示） **取值范围**： 不涉及。
     * @return schemaGeneratorClass
     */
    public String getSchemaGeneratorClass() {
        return schemaGeneratorClass;
    }

    public void setSchemaGeneratorClass(String schemaGeneratorClass) {
        this.schemaGeneratorClass = schemaGeneratorClass;
    }

    public SmartConnectTaskRespSinkConfig withPartitionerClass(String partitionerClass) {
        this.partitionerClass = partitionerClass;
        return this;
    }

    /**
     * **参数解释**： partitioner类，默认\"io.confluent.connect.storage.partitioner.TimeBasedPartitioner\"。（仅目标端类型为OBS时会显示） **取值范围**： 不涉及。
     * @return partitionerClass
     */
    public String getPartitionerClass() {
        return partitionerClass;
    }

    public void setPartitionerClass(String partitionerClass) {
        this.partitionerClass = partitionerClass;
    }

    public SmartConnectTaskRespSinkConfig withValueConverter(String valueConverter) {
        this.valueConverter = valueConverter;
        return this;
    }

    /**
     * **参数解释**： 值转换器，默认为\"org.apache.kafka.connect.converters.ByteArrayConverter\"。（仅目标端类型为OBS时会显示） **取值范围**： 不涉及。
     * @return valueConverter
     */
    public String getValueConverter() {
        return valueConverter;
    }

    public void setValueConverter(String valueConverter) {
        this.valueConverter = valueConverter;
    }

    public SmartConnectTaskRespSinkConfig withKeyConverter(String keyConverter) {
        this.keyConverter = keyConverter;
        return this;
    }

    /**
     * **参数解释**： 键转换器，默认为\"org.apache.kafka.connect.converters.ByteArrayConverter\"。（仅目标端类型为OBS时会显示） **取值范围**： 不涉及。
     * @return keyConverter
     */
    public String getKeyConverter() {
        return keyConverter;
    }

    public void setKeyConverter(String keyConverter) {
        this.keyConverter = keyConverter;
    }

    public SmartConnectTaskRespSinkConfig withKvDelimiter(String kvDelimiter) {
        this.kvDelimiter = kvDelimiter;
        return this;
    }

    /**
     * **参数解释**： 键值分隔符，默认为\":\"。（仅目标端类型为OBS时会显示） **取值范围**： 不涉及。
     * @return kvDelimiter
     */
    public String getKvDelimiter() {
        return kvDelimiter;
    }

    public void setKvDelimiter(String kvDelimiter) {
        this.kvDelimiter = kvDelimiter;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmartConnectTaskRespSinkConfig that = (SmartConnectTaskRespSinkConfig) obj;
        return Objects.equals(this.consumerStrategy, that.consumerStrategy)
            && Objects.equals(this.destinationFileType, that.destinationFileType)
            && Objects.equals(this.deliverTimeInterval, that.deliverTimeInterval)
            && Objects.equals(this.obsBucketName, that.obsBucketName) && Objects.equals(this.obsPath, that.obsPath)
            && Objects.equals(this.partitionFormat, that.partitionFormat)
            && Objects.equals(this.recordDelimiter, that.recordDelimiter)
            && Objects.equals(this.storeKeys, that.storeKeys) && Objects.equals(this.obsPartSize, that.obsPartSize)
            && Objects.equals(this.flushSize, that.flushSize) && Objects.equals(this.timezone, that.timezone)
            && Objects.equals(this.schemaGeneratorClass, that.schemaGeneratorClass)
            && Objects.equals(this.partitionerClass, that.partitionerClass)
            && Objects.equals(this.valueConverter, that.valueConverter)
            && Objects.equals(this.keyConverter, that.keyConverter)
            && Objects.equals(this.kvDelimiter, that.kvDelimiter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consumerStrategy,
            destinationFileType,
            deliverTimeInterval,
            obsBucketName,
            obsPath,
            partitionFormat,
            recordDelimiter,
            storeKeys,
            obsPartSize,
            flushSize,
            timezone,
            schemaGeneratorClass,
            partitionerClass,
            valueConverter,
            keyConverter,
            kvDelimiter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartConnectTaskRespSinkConfig {\n");
        sb.append("    consumerStrategy: ").append(toIndentedString(consumerStrategy)).append("\n");
        sb.append("    destinationFileType: ").append(toIndentedString(destinationFileType)).append("\n");
        sb.append("    deliverTimeInterval: ").append(toIndentedString(deliverTimeInterval)).append("\n");
        sb.append("    obsBucketName: ").append(toIndentedString(obsBucketName)).append("\n");
        sb.append("    obsPath: ").append(toIndentedString(obsPath)).append("\n");
        sb.append("    partitionFormat: ").append(toIndentedString(partitionFormat)).append("\n");
        sb.append("    recordDelimiter: ").append(toIndentedString(recordDelimiter)).append("\n");
        sb.append("    storeKeys: ").append(toIndentedString(storeKeys)).append("\n");
        sb.append("    obsPartSize: ").append(toIndentedString(obsPartSize)).append("\n");
        sb.append("    flushSize: ").append(toIndentedString(flushSize)).append("\n");
        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
        sb.append("    schemaGeneratorClass: ").append(toIndentedString(schemaGeneratorClass)).append("\n");
        sb.append("    partitionerClass: ").append(toIndentedString(partitionerClass)).append("\n");
        sb.append("    valueConverter: ").append(toIndentedString(valueConverter)).append("\n");
        sb.append("    keyConverter: ").append(toIndentedString(keyConverter)).append("\n");
        sb.append("    kvDelimiter: ").append(toIndentedString(kvDelimiter)).append("\n");
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
