package com.huaweicloud.sdk.kafka.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceTopicReqTopics;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 修改的topic列表。
 */
public class UpdateInstanceTopicReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="topics")
    
    private List<UpdateInstanceTopicReqTopics> topics = null;
    
    public UpdateInstanceTopicReq withTopics(List<UpdateInstanceTopicReqTopics> topics) {
        this.topics = topics;
        return this;
    }

    
    public UpdateInstanceTopicReq addTopicsItem(UpdateInstanceTopicReqTopics topicsItem) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topicsItem);
        return this;
    }

    public UpdateInstanceTopicReq withTopics(Consumer<List<UpdateInstanceTopicReqTopics>> topicsSetter) {
        if(this.topics == null ){
            this.topics = new ArrayList<>();
        }
        topicsSetter.accept(this.topics);
        return this;
    }

    /**
     * 修改的topic列表。
     * @return topics
     */
    public List<UpdateInstanceTopicReqTopics> getTopics() {
        return topics;
    }

    public void setTopics(List<UpdateInstanceTopicReqTopics> topics) {
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
        UpdateInstanceTopicReq updateInstanceTopicReq = (UpdateInstanceTopicReq) o;
        return Objects.equals(this.topics, updateInstanceTopicReq.topics);
    }
    @Override
    public int hashCode() {
        return Objects.hash(topics);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceTopicReq {\n");
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

