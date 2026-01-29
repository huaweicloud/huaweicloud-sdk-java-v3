package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * KafkaTopicDetailEntity
 */
public class KafkaTopicDetailEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partitions")

    private List<KafkaTopicDetailEntityPartitions> partitions = null;

    public KafkaTopicDetailEntity withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * **参数解释**： Topic名称。  **取值范围**： 不涉及。
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public KafkaTopicDetailEntity withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**： 创建时间。  **取值范围**： 不涉及。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public KafkaTopicDetailEntity withPartitions(List<KafkaTopicDetailEntityPartitions> partitions) {
        this.partitions = partitions;
        return this;
    }

    public KafkaTopicDetailEntity addPartitionsItem(KafkaTopicDetailEntityPartitions partitionsItem) {
        if (this.partitions == null) {
            this.partitions = new ArrayList<>();
        }
        this.partitions.add(partitionsItem);
        return this;
    }

    public KafkaTopicDetailEntity withPartitions(Consumer<List<KafkaTopicDetailEntityPartitions>> partitionsSetter) {
        if (this.partitions == null) {
            this.partitions = new ArrayList<>();
        }
        partitionsSetter.accept(this.partitions);
        return this;
    }

    /**
     * **参数解释**： 分区列表。
     * @return partitions
     */
    public List<KafkaTopicDetailEntityPartitions> getPartitions() {
        return partitions;
    }

    public void setPartitions(List<KafkaTopicDetailEntityPartitions> partitions) {
        this.partitions = partitions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KafkaTopicDetailEntity that = (KafkaTopicDetailEntity) obj;
        return Objects.equals(this.topic, that.topic) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.partitions, that.partitions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, createTime, partitions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KafkaTopicDetailEntity {\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    partitions: ").append(toIndentedString(partitions)).append("\n");
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
