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
public class ListInstanceTopicsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remain_partitions")

    private Integer remainPartitions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_partitions")

    private Integer maxPartitions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_max_partitions")

    private Integer topicMaxPartitions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topics")

    private List<TopicEntity> topics = null;

    public ListInstanceTopicsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： Topic总数。 **取值范围**： 不涉及。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListInstanceTopicsResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释**： 分页查询的大小。 **取值范围**： 不涉及。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListInstanceTopicsResponse withRemainPartitions(Integer remainPartitions) {
        this.remainPartitions = remainPartitions;
        return this;
    }

    /**
     * **参数解释**： 剩余分区数。 **取值范围**： 不涉及。
     * @return remainPartitions
     */
    public Integer getRemainPartitions() {
        return remainPartitions;
    }

    public void setRemainPartitions(Integer remainPartitions) {
        this.remainPartitions = remainPartitions;
    }

    public ListInstanceTopicsResponse withMaxPartitions(Integer maxPartitions) {
        this.maxPartitions = maxPartitions;
        return this;
    }

    /**
     * **参数解释**： 分区总数。 **取值范围**： 不涉及。
     * @return maxPartitions
     */
    public Integer getMaxPartitions() {
        return maxPartitions;
    }

    public void setMaxPartitions(Integer maxPartitions) {
        this.maxPartitions = maxPartitions;
    }

    public ListInstanceTopicsResponse withTopicMaxPartitions(Integer topicMaxPartitions) {
        this.topicMaxPartitions = topicMaxPartitions;
        return this;
    }

    /**
     * **参数解释**： 单个Topic最大占用分区数。 **取值范围**： 不涉及。
     * @return topicMaxPartitions
     */
    public Integer getTopicMaxPartitions() {
        return topicMaxPartitions;
    }

    public void setTopicMaxPartitions(Integer topicMaxPartitions) {
        this.topicMaxPartitions = topicMaxPartitions;
    }

    public ListInstanceTopicsResponse withTopics(List<TopicEntity> topics) {
        this.topics = topics;
        return this;
    }

    public ListInstanceTopicsResponse addTopicsItem(TopicEntity topicsItem) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topicsItem);
        return this;
    }

    public ListInstanceTopicsResponse withTopics(Consumer<List<TopicEntity>> topicsSetter) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        topicsSetter.accept(this.topics);
        return this;
    }

    /**
     * **参数解释**： topic列表。
     * @return topics
     */
    public List<TopicEntity> getTopics() {
        return topics;
    }

    public void setTopics(List<TopicEntity> topics) {
        this.topics = topics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceTopicsResponse that = (ListInstanceTopicsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.size, that.size)
            && Objects.equals(this.remainPartitions, that.remainPartitions)
            && Objects.equals(this.maxPartitions, that.maxPartitions)
            && Objects.equals(this.topicMaxPartitions, that.topicMaxPartitions)
            && Objects.equals(this.topics, that.topics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, size, remainPartitions, maxPartitions, topicMaxPartitions, topics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceTopicsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    remainPartitions: ").append(toIndentedString(remainPartitions)).append("\n");
        sb.append("    maxPartitions: ").append(toIndentedString(maxPartitions)).append("\n");
        sb.append("    topicMaxPartitions: ").append(toIndentedString(topicMaxPartitions)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
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
