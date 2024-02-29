package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SmartConnectTaskRespSinkConfig
 */
public class SmartConnectTaskRespSinkConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_address")

    private String redisAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_type")

    private String redisType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dcs_instance_id")

    private String dcsInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_db")

    private String targetDb;

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
    @JsonProperty(value = "connector_class")

    private String connectorClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_class")

    private String storageClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format_class")

    private String formatClass;

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

    public SmartConnectTaskRespSinkConfig withRedisAddress(String redisAddress) {
        this.redisAddress = redisAddress;
        return this;
    }

    /**
     * Redis实例地址。（仅目标端类型为Redis时会显示）
     * @return redisAddress
     */
    public String getRedisAddress() {
        return redisAddress;
    }

    public void setRedisAddress(String redisAddress) {
        this.redisAddress = redisAddress;
    }

    public SmartConnectTaskRespSinkConfig withRedisType(String redisType) {
        this.redisType = redisType;
        return this;
    }

    /**
     * Redis实例类型。（仅目标端类型为Redis时会显示）
     * @return redisType
     */
    public String getRedisType() {
        return redisType;
    }

    public void setRedisType(String redisType) {
        this.redisType = redisType;
    }

    public SmartConnectTaskRespSinkConfig withDcsInstanceId(String dcsInstanceId) {
        this.dcsInstanceId = dcsInstanceId;
        return this;
    }

    /**
     * DCS实例ID。（仅目标端类型为Redis时会显示）
     * @return dcsInstanceId
     */
    public String getDcsInstanceId() {
        return dcsInstanceId;
    }

    public void setDcsInstanceId(String dcsInstanceId) {
        this.dcsInstanceId = dcsInstanceId;
    }

    public SmartConnectTaskRespSinkConfig withTargetDb(String targetDb) {
        this.targetDb = targetDb;
        return this;
    }

    /**
     * 目标数据库，默认为-1。（仅目标端类型为Redis时会显示）
     * @return targetDb
     */
    public String getTargetDb() {
        return targetDb;
    }

    public void setTargetDb(String targetDb) {
        this.targetDb = targetDb;
    }

    public SmartConnectTaskRespSinkConfig withConsumerStrategy(String consumerStrategy) {
        this.consumerStrategy = consumerStrategy;
        return this;
    }

    /**
     * 转储启动偏移量，latest为获取最新的数据，earliest为获取最早的数据。（仅目标端类型为OBS时会显示）
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
     * 转储文件格式。当前只支持TEXT。（仅目标端类型为OBS时会显示）
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
     * 记数据转储周期（秒）。（仅目标端类型为OBS时会显示）
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
     * 转储地址。（仅目标端类型为OBS时会显示）
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
     * 转储目录。（仅目标端类型为OBS时会显示）
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
     * 时间目录格式。（仅目标端类型为OBS时会显示）
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
     * 记录分行符。（仅目标端类型为OBS时会显示）
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
     * 存储Key。（仅目标端类型为OBS时会显示）
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
     * 每个传输文件多大后就开始上传，单位为byte；默认值5242880。（仅目标端类型为OBS时会显示）
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
     * flush_size。（仅目标端类型为OBS时会显示）
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
     * 时区。（仅目标端类型为OBS时会显示）
     * @return timezone
     */
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public SmartConnectTaskRespSinkConfig withConnectorClass(String connectorClass) {
        this.connectorClass = connectorClass;
        return this;
    }

    /**
     * connector类，默认为\"com.huawei.dms.connector.obs.OBSSinkConnector\"。（仅目标端类型为OBS时会显示）
     * @return connectorClass
     */
    public String getConnectorClass() {
        return connectorClass;
    }

    public void setConnectorClass(String connectorClass) {
        this.connectorClass = connectorClass;
    }

    public SmartConnectTaskRespSinkConfig withStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }

    /**
     * storage类，默认为com.huawei.dms.connector.obs.storage.OBSStorage\"。（仅目标端类型为OBS时会显示）
     * @return storageClass
     */
    public String getStorageClass() {
        return storageClass;
    }

    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    public SmartConnectTaskRespSinkConfig withFormatClass(String formatClass) {
        this.formatClass = formatClass;
        return this;
    }

    /**
     * format类，默认为\"com.huawei.dms.connector.obs.format.bytearray.ByteArrayFormat\"。（仅目标端类型为OBS时会显示）
     * @return formatClass
     */
    public String getFormatClass() {
        return formatClass;
    }

    public void setFormatClass(String formatClass) {
        this.formatClass = formatClass;
    }

    public SmartConnectTaskRespSinkConfig withSchemaGeneratorClass(String schemaGeneratorClass) {
        this.schemaGeneratorClass = schemaGeneratorClass;
        return this;
    }

    /**
     * schema_generator类，默认为\"io.confluent.connect.storage.hive.schema.DefaultSchemaGenerator\"。（仅目标端类型为OBS时会显示）
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
     * partitioner类，默认\"io.confluent.connect.storage.partitioner.TimeBasedPartitioner\"。（仅目标端类型为OBS时会显示）
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
     * value_converter，默认为\"org.apache.kafka.connect.converters.ByteArrayConverter\"。（仅目标端类型为OBS时会显示）
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
     * key_converter，默认为\"org.apache.kafka.connect.converters.ByteArrayConverter\"。（仅目标端类型为OBS时会显示）
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
     * kv_delimiter，默认为\":\"。（仅目标端类型为OBS时会显示）
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
        return Objects.equals(this.redisAddress, that.redisAddress) && Objects.equals(this.redisType, that.redisType)
            && Objects.equals(this.dcsInstanceId, that.dcsInstanceId) && Objects.equals(this.targetDb, that.targetDb)
            && Objects.equals(this.consumerStrategy, that.consumerStrategy)
            && Objects.equals(this.destinationFileType, that.destinationFileType)
            && Objects.equals(this.deliverTimeInterval, that.deliverTimeInterval)
            && Objects.equals(this.obsBucketName, that.obsBucketName) && Objects.equals(this.obsPath, that.obsPath)
            && Objects.equals(this.partitionFormat, that.partitionFormat)
            && Objects.equals(this.recordDelimiter, that.recordDelimiter)
            && Objects.equals(this.storeKeys, that.storeKeys) && Objects.equals(this.obsPartSize, that.obsPartSize)
            && Objects.equals(this.flushSize, that.flushSize) && Objects.equals(this.timezone, that.timezone)
            && Objects.equals(this.connectorClass, that.connectorClass)
            && Objects.equals(this.storageClass, that.storageClass)
            && Objects.equals(this.formatClass, that.formatClass)
            && Objects.equals(this.schemaGeneratorClass, that.schemaGeneratorClass)
            && Objects.equals(this.partitionerClass, that.partitionerClass)
            && Objects.equals(this.valueConverter, that.valueConverter)
            && Objects.equals(this.keyConverter, that.keyConverter)
            && Objects.equals(this.kvDelimiter, that.kvDelimiter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(redisAddress,
            redisType,
            dcsInstanceId,
            targetDb,
            consumerStrategy,
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
            connectorClass,
            storageClass,
            formatClass,
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
        sb.append("    redisAddress: ").append(toIndentedString(redisAddress)).append("\n");
        sb.append("    redisType: ").append(toIndentedString(redisType)).append("\n");
        sb.append("    dcsInstanceId: ").append(toIndentedString(dcsInstanceId)).append("\n");
        sb.append("    targetDb: ").append(toIndentedString(targetDb)).append("\n");
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
        sb.append("    connectorClass: ").append(toIndentedString(connectorClass)).append("\n");
        sb.append("    storageClass: ").append(toIndentedString(storageClass)).append("\n");
        sb.append("    formatClass: ").append(toIndentedString(formatClass)).append("\n");
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
