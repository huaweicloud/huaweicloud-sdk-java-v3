package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.DeleteMqsInstanceTopicRespTopics;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class DeleteMqsInstanceTopicResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="topics")
    
    private List<DeleteMqsInstanceTopicRespTopics> topics = null;
    
    public DeleteMqsInstanceTopicResponse withTopics(List<DeleteMqsInstanceTopicRespTopics> topics) {
        this.topics = topics;
        return this;
    }

    
    public DeleteMqsInstanceTopicResponse addTopicsItem(DeleteMqsInstanceTopicRespTopics topicsItem) {
        if(this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topicsItem);
        return this;
    }

    public DeleteMqsInstanceTopicResponse withTopics(Consumer<List<DeleteMqsInstanceTopicRespTopics>> topicsSetter) {
        if(this.topics == null) {
            this.topics = new ArrayList<>();
        }
        topicsSetter.accept(this.topics);
        return this;
    }

    /**
     * Topic列表。
     * @return topics
     */
    public List<DeleteMqsInstanceTopicRespTopics> getTopics() {
        return topics;
    }

    public void setTopics(List<DeleteMqsInstanceTopicRespTopics> topics) {
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
        DeleteMqsInstanceTopicResponse deleteMqsInstanceTopicResponse = (DeleteMqsInstanceTopicResponse) o;
        return Objects.equals(this.topics, deleteMqsInstanceTopicResponse.topics);
    }
    @Override
    public int hashCode() {
        return Objects.hash(topics);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteMqsInstanceTopicResponse {\n");
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

