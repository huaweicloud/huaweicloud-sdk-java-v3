package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SmartConnectTaskReqSinkConfig
 */
public class SmartConnectTaskReqSinkConfig {

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
    @JsonProperty(value = "access_key")

    private String accessKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_key")

    private String secretKey;

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

    public SmartConnectTaskReqSinkConfig withConsumerStrategy(String consumerStrategy) {
        this.consumerStrategy = consumerStrategy;
        return this;
    }

    /**
     * 转储启动偏移量，latest为获取最新的数据，earliest为获取最早的数据。（仅目标端类型为OBS时需要填写）
     * @return consumerStrategy
     */
    public String getConsumerStrategy() {
        return consumerStrategy;
    }

    public void setConsumerStrategy(String consumerStrategy) {
        this.consumerStrategy = consumerStrategy;
    }

    public SmartConnectTaskReqSinkConfig withDestinationFileType(String destinationFileType) {
        this.destinationFileType = destinationFileType;
        return this;
    }

    /**
     * 转储文件格式。当前只支持TEXT。（仅目标端类型为OBS时需要填写）
     * @return destinationFileType
     */
    public String getDestinationFileType() {
        return destinationFileType;
    }

    public void setDestinationFileType(String destinationFileType) {
        this.destinationFileType = destinationFileType;
    }

    public SmartConnectTaskReqSinkConfig withDeliverTimeInterval(Integer deliverTimeInterval) {
        this.deliverTimeInterval = deliverTimeInterval;
        return this;
    }

    /**
     * 数据转储周期（秒），默认配置为300秒。（仅目标端类型为OBS时需要填写）
     * @return deliverTimeInterval
     */
    public Integer getDeliverTimeInterval() {
        return deliverTimeInterval;
    }

    public void setDeliverTimeInterval(Integer deliverTimeInterval) {
        this.deliverTimeInterval = deliverTimeInterval;
    }

    public SmartConnectTaskReqSinkConfig withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * AK，访问密钥ID。（仅目标端类型为OBS时需要填写）
     * @return accessKey
     */
    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public SmartConnectTaskReqSinkConfig withSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * SK，与访问密钥ID结合使用的密钥。（仅目标端类型为OBS时需要填写）
     * @return secretKey
     */
    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public SmartConnectTaskReqSinkConfig withObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
        return this;
    }

    /**
     * 转储地址，即存储Topic数据的OBS桶的名称。（仅目标端类型为OBS时需要填写）
     * @return obsBucketName
     */
    public String getObsBucketName() {
        return obsBucketName;
    }

    public void setObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
    }

    public SmartConnectTaskReqSinkConfig withObsPath(String obsPath) {
        this.obsPath = obsPath;
        return this;
    }

    /**
     * 转储目录，即OBS中存储Topic的目录，多级目录可以用“/”进行分隔。（仅目标端类型为OBS时需要填写）
     * @return obsPath
     */
    public String getObsPath() {
        return obsPath;
    }

    public void setObsPath(String obsPath) {
        this.obsPath = obsPath;
    }

    public SmartConnectTaskReqSinkConfig withPartitionFormat(String partitionFormat) {
        this.partitionFormat = partitionFormat;
        return this;
    }

    /**
     * 时间目录格式。（仅目标端类型为OBS时需要填写）   - yyyy：年   - yyyy/MM：年/月   - yyyy/MM/dd：年/月/日   - yyyy/MM/dd/HH：年/月/日/时   - yyyy/MM/dd/HH/mm：年/月/日/时/分 
     * @return partitionFormat
     */
    public String getPartitionFormat() {
        return partitionFormat;
    }

    public void setPartitionFormat(String partitionFormat) {
        this.partitionFormat = partitionFormat;
    }

    public SmartConnectTaskReqSinkConfig withRecordDelimiter(String recordDelimiter) {
        this.recordDelimiter = recordDelimiter;
        return this;
    }

    /**
     *  记录分行符，用于分隔写入转储文件的用户数据。（仅目标端类型为OBS时需要填写）   取值范围：   - 逗号“,”   - 分号“;”   - 竖线“|”   - 换行符“\\n”   - NULL 
     * @return recordDelimiter
     */
    public String getRecordDelimiter() {
        return recordDelimiter;
    }

    public void setRecordDelimiter(String recordDelimiter) {
        this.recordDelimiter = recordDelimiter;
    }

    public SmartConnectTaskReqSinkConfig withStoreKeys(Boolean storeKeys) {
        this.storeKeys = storeKeys;
        return this;
    }

    /**
     * 是否转储Key，开启表示转储Key，关闭表示不转储Key。（仅目标端类型为OBS时需要填写）
     * @return storeKeys
     */
    public Boolean getStoreKeys() {
        return storeKeys;
    }

    public void setStoreKeys(Boolean storeKeys) {
        this.storeKeys = storeKeys;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmartConnectTaskReqSinkConfig that = (SmartConnectTaskReqSinkConfig) obj;
        return Objects.equals(this.consumerStrategy, that.consumerStrategy)
            && Objects.equals(this.destinationFileType, that.destinationFileType)
            && Objects.equals(this.deliverTimeInterval, that.deliverTimeInterval)
            && Objects.equals(this.accessKey, that.accessKey) && Objects.equals(this.secretKey, that.secretKey)
            && Objects.equals(this.obsBucketName, that.obsBucketName) && Objects.equals(this.obsPath, that.obsPath)
            && Objects.equals(this.partitionFormat, that.partitionFormat)
            && Objects.equals(this.recordDelimiter, that.recordDelimiter)
            && Objects.equals(this.storeKeys, that.storeKeys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consumerStrategy,
            destinationFileType,
            deliverTimeInterval,
            accessKey,
            secretKey,
            obsBucketName,
            obsPath,
            partitionFormat,
            recordDelimiter,
            storeKeys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartConnectTaskReqSinkConfig {\n");
        sb.append("    consumerStrategy: ").append(toIndentedString(consumerStrategy)).append("\n");
        sb.append("    destinationFileType: ").append(toIndentedString(destinationFileType)).append("\n");
        sb.append("    deliverTimeInterval: ").append(toIndentedString(deliverTimeInterval)).append("\n");
        sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
        sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
        sb.append("    obsBucketName: ").append(toIndentedString(obsBucketName)).append("\n");
        sb.append("    obsPath: ").append(toIndentedString(obsPath)).append("\n");
        sb.append("    partitionFormat: ").append(toIndentedString(partitionFormat)).append("\n");
        sb.append("    recordDelimiter: ").append(toIndentedString(recordDelimiter)).append("\n");
        sb.append("    storeKeys: ").append(toIndentedString(storeKeys)).append("\n");
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
