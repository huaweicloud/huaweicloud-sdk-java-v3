package com.huaweicloud.sdk.kafka.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kafka.v2.model.BatchDeleteInstanceTopicRespTopics;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class BatchDeleteInstanceTopicResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="topics")
    
    private List<BatchDeleteInstanceTopicRespTopics> topics = null;
    
    public BatchDeleteInstanceTopicResponse withTopics(List<BatchDeleteInstanceTopicRespTopics> topics) {
        this.topics = topics;
        return this;
    }

    
    public BatchDeleteInstanceTopicResponse addTopicsItem(BatchDeleteInstanceTopicRespTopics topicsItem) {
        this.topics.add(topicsItem);
        return this;
    }

    public BatchDeleteInstanceTopicResponse withTopics(Consumer<List<BatchDeleteInstanceTopicRespTopics>> topicsSetter) {
        if(this.topics == null ){
            this.topics = new ArrayList<>();
        }
        topicsSetter.accept(this.topics);
        return this;
    }

    /**
     * Topic列表。
     * @return topics
     */
    public List<BatchDeleteInstanceTopicRespTopics> getTopics() {
        return topics;
    }

    public void setTopics(List<BatchDeleteInstanceTopicRespTopics> topics) {
        this.topics = topics;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchDeleteInstanceTopicResponse batchDeleteInstanceTopicResponse = (BatchDeleteInstanceTopicResponse) o;
        return Objects.equals(this.topics, batchDeleteInstanceTopicResponse.topics);
    }
    @Override
    public int hashCode() {
        return Objects.hash(topics);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteInstanceTopicResponse {\n");
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

