package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ShowKafkaTopicPartitionDiskusageRespTopicList */
public class ShowKafkaTopicPartitionDiskusageRespTopicList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private String size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_name")

    private String topicName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_partition")

    private String topicPartition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "percentage")

    private Double percentage;

    public ShowKafkaTopicPartitionDiskusageRespTopicList withSize(String size) {
        this.size = size;
        return this;
    }

    /** 磁盘使用量。
     * 
     * @return size */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ShowKafkaTopicPartitionDiskusageRespTopicList withTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /** topic名称。
     * 
     * @return topicName */
    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public ShowKafkaTopicPartitionDiskusageRespTopicList withTopicPartition(String topicPartition) {
        this.topicPartition = topicPartition;
        return this;
    }

    /** 分区。
     * 
     * @return topicPartition */
    public String getTopicPartition() {
        return topicPartition;
    }

    public void setTopicPartition(String topicPartition) {
        this.topicPartition = topicPartition;
    }

    public ShowKafkaTopicPartitionDiskusageRespTopicList withPercentage(Double percentage) {
        this.percentage = percentage;
        return this;
    }

    /** 磁盘使用量的占比。
     * 
     * @return percentage */
    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowKafkaTopicPartitionDiskusageRespTopicList showKafkaTopicPartitionDiskusageRespTopicList =
            (ShowKafkaTopicPartitionDiskusageRespTopicList) o;
        return Objects.equals(this.size, showKafkaTopicPartitionDiskusageRespTopicList.size)
            && Objects.equals(this.topicName, showKafkaTopicPartitionDiskusageRespTopicList.topicName)
            && Objects.equals(this.topicPartition, showKafkaTopicPartitionDiskusageRespTopicList.topicPartition)
            && Objects.equals(this.percentage, showKafkaTopicPartitionDiskusageRespTopicList.percentage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, topicName, topicPartition, percentage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKafkaTopicPartitionDiskusageRespTopicList {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
        sb.append("    topicPartition: ").append(toIndentedString(topicPartition)).append("\n");
        sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
