package com.huaweicloud.sdk.kafka.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kafka.v2.model.UpdateTopicAccessPolicyReqTopics;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UpdateTopicAccessPolicyReq
 */
public class UpdateTopicAccessPolicyReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="topics")
    
    private List<UpdateTopicAccessPolicyReqTopics> topics = null;
    
    public UpdateTopicAccessPolicyReq withTopics(List<UpdateTopicAccessPolicyReqTopics> topics) {
        this.topics = topics;
        return this;
    }

    
    public UpdateTopicAccessPolicyReq addTopicsItem(UpdateTopicAccessPolicyReqTopics topicsItem) {
        if(this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topicsItem);
        return this;
    }

    public UpdateTopicAccessPolicyReq withTopics(Consumer<List<UpdateTopicAccessPolicyReqTopics>> topicsSetter) {
        if(this.topics == null) {
            this.topics = new ArrayList<>();
        }
        topicsSetter.accept(this.topics);
        return this;
    }

    /**
     * topic列表。
     * @return topics
     */
    public List<UpdateTopicAccessPolicyReqTopics> getTopics() {
        return topics;
    }

    public void setTopics(List<UpdateTopicAccessPolicyReqTopics> topics) {
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
        UpdateTopicAccessPolicyReq updateTopicAccessPolicyReq = (UpdateTopicAccessPolicyReq) o;
        return Objects.equals(this.topics, updateTopicAccessPolicyReq.topics);
    }
    @Override
    public int hashCode() {
        return Objects.hash(topics);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTopicAccessPolicyReq {\n");
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

