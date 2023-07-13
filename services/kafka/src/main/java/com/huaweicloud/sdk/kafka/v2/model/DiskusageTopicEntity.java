package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DiskusageTopicEntity
 */
public class DiskusageTopicEntity {

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

    public DiskusageTopicEntity withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * 磁盘使用量。
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public DiskusageTopicEntity withTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /**
     * topic名称。
     * @return topicName
     */
    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public DiskusageTopicEntity withTopicPartition(String topicPartition) {
        this.topicPartition = topicPartition;
        return this;
    }

    /**
     * 分区。
     * @return topicPartition
     */
    public String getTopicPartition() {
        return topicPartition;
    }

    public void setTopicPartition(String topicPartition) {
        this.topicPartition = topicPartition;
    }

    public DiskusageTopicEntity withPercentage(Double percentage) {
        this.percentage = percentage;
        return this;
    }

    /**
     * 磁盘使用量的占比。
     * @return percentage
     */
    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DiskusageTopicEntity that = (DiskusageTopicEntity) obj;
        return Objects.equals(this.size, that.size) && Objects.equals(this.topicName, that.topicName)
            && Objects.equals(this.topicPartition, that.topicPartition)
            && Objects.equals(this.percentage, that.percentage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, topicName, topicPartition, percentage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiskusageTopicEntity {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
        sb.append("    topicPartition: ").append(toIndentedString(topicPartition)).append("\n");
        sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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
