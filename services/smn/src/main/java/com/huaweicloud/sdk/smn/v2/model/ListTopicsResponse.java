package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListTopicsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_count")

    private Integer topicCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topics")

    private List<ListTopicsItem> topics = null;

    public ListTopicsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /** 请求的唯一标识ID。
     * 
     * @return requestId */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListTopicsResponse withTopicCount(Integer topicCount) {
        this.topicCount = topicCount;
        return this;
    }

    /** 返回的Topic个数。该参数不受offset和limit影响，即返回的是您账户下所有的Topic个数。
     * 
     * @return topicCount */
    public Integer getTopicCount() {
        return topicCount;
    }

    public void setTopicCount(Integer topicCount) {
        this.topicCount = topicCount;
    }

    public ListTopicsResponse withTopics(List<ListTopicsItem> topics) {
        this.topics = topics;
        return this;
    }

    public ListTopicsResponse addTopicsItem(ListTopicsItem topicsItem) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topicsItem);
        return this;
    }

    public ListTopicsResponse withTopics(Consumer<List<ListTopicsItem>> topicsSetter) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        topicsSetter.accept(this.topics);
        return this;
    }

    /** Topic结构体数组。
     * 
     * @return topics */
    public List<ListTopicsItem> getTopics() {
        return topics;
    }

    public void setTopics(List<ListTopicsItem> topics) {
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
        ListTopicsResponse listTopicsResponse = (ListTopicsResponse) o;
        return Objects.equals(this.requestId, listTopicsResponse.requestId)
            && Objects.equals(this.topicCount, listTopicsResponse.topicCount)
            && Objects.equals(this.topics, listTopicsResponse.topics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, topicCount, topics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTopicsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    topicCount: ").append(toIndentedString(topicCount)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
