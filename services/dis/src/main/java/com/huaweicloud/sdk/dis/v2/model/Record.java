package com.huaweicloud.sdk.dis.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Record
 */
public class Record {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_key")

    private String partitionKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence_number")

    private String sequenceNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private String data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp_type")

    private String timestampType;

    public Record withPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }

    /**
     * 用户上传数据时设置的partition_key。  说明：  上传数据时，如果传了partition_key参数，则下载数据时可返回此参数。如果上传数据时，未传partition_key参数，而是传入partition_id，则不返回partition_key。
     * @return partitionKey
     */
    public String getPartitionKey() {
        return partitionKey;
    }

    public void setPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
    }

    public Record withSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     * 该条数据的序列号。
     * @return sequenceNumber
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public Record withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * 下载的数据。  下载的数据为序列化之后的二进制数据（Base64编码后的字符串）。  比如下载数据接口返回的数据是“ZGF0YQ==”，“ZGF0YQ==”经过Base64解码之后是“data”。
     * @return data
     */
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Record withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 记录写入DIS的时间戳。
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Record withTimestampType(String timestampType) {
        this.timestampType = timestampType;
        return this;
    }

    /**
     * 时间戳类型。  - CreateTime：创建时间。
     * @return timestampType
     */
    public String getTimestampType() {
        return timestampType;
    }

    public void setTimestampType(String timestampType) {
        this.timestampType = timestampType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Record that = (Record) obj;
        return Objects.equals(this.partitionKey, that.partitionKey)
            && Objects.equals(this.sequenceNumber, that.sequenceNumber) && Objects.equals(this.data, that.data)
            && Objects.equals(this.timestamp, that.timestamp) && Objects.equals(this.timestampType, that.timestampType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partitionKey, sequenceNumber, data, timestamp, timestampType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Record {\n");
        sb.append("    partitionKey: ").append(toIndentedString(partitionKey)).append("\n");
        sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    timestampType: ").append(toIndentedString(timestampType)).append("\n");
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
