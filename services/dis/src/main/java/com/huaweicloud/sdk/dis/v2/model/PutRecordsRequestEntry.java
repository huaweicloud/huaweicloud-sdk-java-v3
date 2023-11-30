package com.huaweicloud.sdk.dis.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PutRecordsRequestEntry
 */
public class PutRecordsRequestEntry {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private String data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "explicit_hash_key")

    private String explicitHashKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_id")

    private String partitionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_key")

    private String partitionKey;

    public PutRecordsRequestEntry withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * 需要上传的数据。  上传的数据为序列化之后的二进制数据（Base64编码后的字符串）。  比如需要上传字符串“data”，“data”经过Base64编码之后是“ZGF0YQ==”。
     * @return data
     */
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public PutRecordsRequestEntry withExplicitHashKey(String explicitHashKey) {
        this.explicitHashKey = explicitHashKey;
        return this;
    }

    /**
     * 用于明确数据需要写入分区的哈希值，此哈希值将覆盖“partition_key”的哈希值。  取值范围：0~long.max
     * @return explicitHashKey
     */
    public String getExplicitHashKey() {
        return explicitHashKey;
    }

    public void setExplicitHashKey(String explicitHashKey) {
        this.explicitHashKey = explicitHashKey;
    }

    public PutRecordsRequestEntry withPartitionId(String partitionId) {
        this.partitionId = partitionId;
        return this;
    }

    /**
     * 通道的分区标识符。 可定义为如下两种样式： - shardId-0000000000 - 0  比如一个通道有三个分区，那么分区标识符分别为0, 1, 2，或者shardId-0000000000, shardId-0000000001, shardId-0000000002
     * @return partitionId
     */
    public String getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(String partitionId) {
        this.partitionId = partitionId;
    }

    public PutRecordsRequestEntry withPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }

    /**
     * 数据将写入的分区。  说明：  如果传了partition_id参数，则优先使用partition_id参数。如果partition_id没有传，则使用partition_key。
     * @return partitionKey
     */
    public String getPartitionKey() {
        return partitionKey;
    }

    public void setPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PutRecordsRequestEntry that = (PutRecordsRequestEntry) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.explicitHashKey, that.explicitHashKey)
            && Objects.equals(this.partitionId, that.partitionId)
            && Objects.equals(this.partitionKey, that.partitionKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, explicitHashKey, partitionId, partitionKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutRecordsRequestEntry {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    explicitHashKey: ").append(toIndentedString(explicitHashKey)).append("\n");
        sb.append("    partitionId: ").append(toIndentedString(partitionId)).append("\n");
        sb.append("    partitionKey: ").append(toIndentedString(partitionKey)).append("\n");
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
