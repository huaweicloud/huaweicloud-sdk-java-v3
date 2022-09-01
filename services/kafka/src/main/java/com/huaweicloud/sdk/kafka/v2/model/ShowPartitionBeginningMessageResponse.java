package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowPartitionBeginningMessageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    @JacksonXmlProperty(localName = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition")

    @JacksonXmlProperty(localName = "partition")

    private Integer partition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    @JacksonXmlProperty(localName = "timestamp")

    private Long timestamp;

    public ShowPartitionBeginningMessageResponse withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * Topic名称。
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public ShowPartitionBeginningMessageResponse withPartition(Integer partition) {
        this.partition = partition;
        return this;
    }

    /**
     * 分区编号。
     * @return partition
     */
    public Integer getPartition() {
        return partition;
    }

    public void setPartition(Integer partition) {
        this.partition = partition;
    }

    public ShowPartitionBeginningMessageResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 最新消息位置。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowPartitionBeginningMessageResponse withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 生产消息的时间。 格式为Unix时间戳。单位为毫秒。
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPartitionBeginningMessageResponse showPartitionBeginningMessageResponse =
            (ShowPartitionBeginningMessageResponse) o;
        return Objects.equals(this.topic, showPartitionBeginningMessageResponse.topic)
            && Objects.equals(this.partition, showPartitionBeginningMessageResponse.partition)
            && Objects.equals(this.offset, showPartitionBeginningMessageResponse.offset)
            && Objects.equals(this.timestamp, showPartitionBeginningMessageResponse.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, partition, offset, timestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPartitionBeginningMessageResponse {\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
