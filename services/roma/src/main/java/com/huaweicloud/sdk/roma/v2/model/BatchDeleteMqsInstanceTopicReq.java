package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeleteMqsInstanceTopicReq
 */
public class BatchDeleteMqsInstanceTopicReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topics")

    @JacksonXmlProperty(localName = "topics")

    private List<String> topics = null;

    public BatchDeleteMqsInstanceTopicReq withTopics(List<String> topics) {
        this.topics = topics;
        return this;
    }

    public BatchDeleteMqsInstanceTopicReq addTopicsItem(String topicsItem) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topicsItem);
        return this;
    }

    public BatchDeleteMqsInstanceTopicReq withTopics(Consumer<List<String>> topicsSetter) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        topicsSetter.accept(this.topics);
        return this;
    }

    /**
     * 待删除的topic列表。
     * @return topics
     */
    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
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
        BatchDeleteMqsInstanceTopicReq batchDeleteMqsInstanceTopicReq = (BatchDeleteMqsInstanceTopicReq) o;
        return Objects.equals(this.topics, batchDeleteMqsInstanceTopicReq.topics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteMqsInstanceTopicReq {\n");
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
