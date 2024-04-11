package com.huaweicloud.sdk.dsc.v1.model;

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
public class ShowTopicsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_topic_urn")

    private String defaultTopicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_count")

    private Integer topicCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topics")

    private List<TopicBean> topics = null;

    public ShowTopicsResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * DSC告警主题ID（非消息通知服务主题ID）
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowTopicsResponse withDefaultTopicUrn(String defaultTopicUrn) {
        this.defaultTopicUrn = defaultTopicUrn;
        return this;
    }

    /**
     * 默认消息通知主题的唯一资源标识符
     * @return defaultTopicUrn
     */
    public String getDefaultTopicUrn() {
        return defaultTopicUrn;
    }

    public void setDefaultTopicUrn(String defaultTopicUrn) {
        this.defaultTopicUrn = defaultTopicUrn;
    }

    public ShowTopicsResponse withTopicCount(Integer topicCount) {
        this.topicCount = topicCount;
        return this;
    }

    /**
     * 已确认的消息通知主题数量
     * @return topicCount
     */
    public Integer getTopicCount() {
        return topicCount;
    }

    public void setTopicCount(Integer topicCount) {
        this.topicCount = topicCount;
    }

    public ShowTopicsResponse withTopics(List<TopicBean> topics) {
        this.topics = topics;
        return this;
    }

    public ShowTopicsResponse addTopicsItem(TopicBean topicsItem) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topicsItem);
        return this;
    }

    public ShowTopicsResponse withTopics(Consumer<List<TopicBean>> topicsSetter) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        topicsSetter.accept(this.topics);
        return this;
    }

    /**
     * 已确认的消息通知主题列表
     * @return topics
     */
    public List<TopicBean> getTopics() {
        return topics;
    }

    public void setTopics(List<TopicBean> topics) {
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
        ShowTopicsResponse that = (ShowTopicsResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.defaultTopicUrn, that.defaultTopicUrn)
            && Objects.equals(this.topicCount, that.topicCount) && Objects.equals(this.topics, that.topics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, defaultTopicUrn, topicCount, topics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTopicsResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    defaultTopicUrn: ").append(toIndentedString(defaultTopicUrn)).append("\n");
        sb.append("    topicCount: ").append(toIndentedString(topicCount)).append("\n");
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
