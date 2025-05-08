package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 消费组TOPIC详情
 */
public class GroupTopicEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partitions")

    private Integer partitions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lag")

    private Integer lag;

    public GroupTopicEntity withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * TOPIC名称
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public GroupTopicEntity withPartitions(Integer partitions) {
        this.partitions = partitions;
        return this;
    }

    /**
     * 分区
     * @return partitions
     */
    public Integer getPartitions() {
        return partitions;
    }

    public void setPartitions(Integer partitions) {
        this.partitions = partitions;
    }

    public GroupTopicEntity withLag(Integer lag) {
        this.lag = lag;
        return this;
    }

    /**
     * 消息堆积数量
     * @return lag
     */
    public Integer getLag() {
        return lag;
    }

    public void setLag(Integer lag) {
        this.lag = lag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GroupTopicEntity that = (GroupTopicEntity) obj;
        return Objects.equals(this.topic, that.topic) && Objects.equals(this.partitions, that.partitions)
            && Objects.equals(this.lag, that.lag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, partitions, lag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupTopicEntity {\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    partitions: ").append(toIndentedString(partitions)).append("\n");
        sb.append("    lag: ").append(toIndentedString(lag)).append("\n");
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
