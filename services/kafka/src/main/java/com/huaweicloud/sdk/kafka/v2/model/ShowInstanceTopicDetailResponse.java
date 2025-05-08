package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowInstanceTopicDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partitions")

    private List<ShowInstanceTopicDetailRespPartitions> partitions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_subscribed")

    private List<String> groupSubscribed = null;

    public ShowInstanceTopicDetailResponse withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * **参数解释**： topic名称。 **取值范围**： 不涉及
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public ShowInstanceTopicDetailResponse withPartitions(List<ShowInstanceTopicDetailRespPartitions> partitions) {
        this.partitions = partitions;
        return this;
    }

    public ShowInstanceTopicDetailResponse addPartitionsItem(ShowInstanceTopicDetailRespPartitions partitionsItem) {
        if (this.partitions == null) {
            this.partitions = new ArrayList<>();
        }
        this.partitions.add(partitionsItem);
        return this;
    }

    public ShowInstanceTopicDetailResponse withPartitions(
        Consumer<List<ShowInstanceTopicDetailRespPartitions>> partitionsSetter) {
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
    public List<ShowInstanceTopicDetailRespPartitions> getPartitions() {
        return partitions;
    }

    public void setPartitions(List<ShowInstanceTopicDetailRespPartitions> partitions) {
        this.partitions = partitions;
    }

    public ShowInstanceTopicDetailResponse withGroupSubscribed(List<String> groupSubscribed) {
        this.groupSubscribed = groupSubscribed;
        return this;
    }

    public ShowInstanceTopicDetailResponse addGroupSubscribedItem(String groupSubscribedItem) {
        if (this.groupSubscribed == null) {
            this.groupSubscribed = new ArrayList<>();
        }
        this.groupSubscribed.add(groupSubscribedItem);
        return this;
    }

    public ShowInstanceTopicDetailResponse withGroupSubscribed(Consumer<List<String>> groupSubscribedSetter) {
        if (this.groupSubscribed == null) {
            this.groupSubscribed = new ArrayList<>();
        }
        groupSubscribedSetter.accept(this.groupSubscribed);
        return this;
    }

    /**
     * **参数解释**： 订阅该topic的消费组名称列表。
     * @return groupSubscribed
     */
    public List<String> getGroupSubscribed() {
        return groupSubscribed;
    }

    public void setGroupSubscribed(List<String> groupSubscribed) {
        this.groupSubscribed = groupSubscribed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceTopicDetailResponse that = (ShowInstanceTopicDetailResponse) obj;
        return Objects.equals(this.topic, that.topic) && Objects.equals(this.partitions, that.partitions)
            && Objects.equals(this.groupSubscribed, that.groupSubscribed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, partitions, groupSubscribed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceTopicDetailResponse {\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    partitions: ").append(toIndentedString(partitions)).append("\n");
        sb.append("    groupSubscribed: ").append(toIndentedString(groupSubscribed)).append("\n");
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
