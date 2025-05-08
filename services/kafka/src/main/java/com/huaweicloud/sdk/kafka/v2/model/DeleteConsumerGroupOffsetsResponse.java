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
public class DeleteConsumerGroupOffsetsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topics")

    private List<DeleteConsumerGroupOffsetsResponseEntity> topics = null;

    public DeleteConsumerGroupOffsetsResponse withTopics(List<DeleteConsumerGroupOffsetsResponseEntity> topics) {
        this.topics = topics;
        return this;
    }

    public DeleteConsumerGroupOffsetsResponse addTopicsItem(DeleteConsumerGroupOffsetsResponseEntity topicsItem) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topicsItem);
        return this;
    }

    public DeleteConsumerGroupOffsetsResponse withTopics(
        Consumer<List<DeleteConsumerGroupOffsetsResponseEntity>> topicsSetter) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        topicsSetter.accept(this.topics);
        return this;
    }

    /**
     * 结果列表
     * @return topics
     */
    public List<DeleteConsumerGroupOffsetsResponseEntity> getTopics() {
        return topics;
    }

    public void setTopics(List<DeleteConsumerGroupOffsetsResponseEntity> topics) {
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
        DeleteConsumerGroupOffsetsResponse that = (DeleteConsumerGroupOffsetsResponse) obj;
        return Objects.equals(this.topics, that.topics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteConsumerGroupOffsetsResponse {\n");
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
