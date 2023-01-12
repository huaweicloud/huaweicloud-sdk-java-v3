package com.huaweicloud.sdk.rocketmq.v2.model;

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
public class ListRocketInstanceTopicsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Integer max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remaining")

    private Integer remaining;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_offset")

    private Integer nextOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "previous_offset")

    private Integer previousOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topics")

    private List<Topic> topics = null;

    public ListRocketInstanceTopicsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * topic总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListRocketInstanceTopicsResponse withMax(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * 最大可创建topic数量。
     * @return max
     */
    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public ListRocketInstanceTopicsResponse withRemaining(Integer remaining) {
        this.remaining = remaining;
        return this;
    }

    /**
     * 剩余可创建topic数量。
     * @return remaining
     */
    public Integer getRemaining() {
        return remaining;
    }

    public void setRemaining(Integer remaining) {
        this.remaining = remaining;
    }

    public ListRocketInstanceTopicsResponse withNextOffset(Integer nextOffset) {
        this.nextOffset = nextOffset;
        return this;
    }

    /**
     * 下个分页的offset。
     * @return nextOffset
     */
    public Integer getNextOffset() {
        return nextOffset;
    }

    public void setNextOffset(Integer nextOffset) {
        this.nextOffset = nextOffset;
    }

    public ListRocketInstanceTopicsResponse withPreviousOffset(Integer previousOffset) {
        this.previousOffset = previousOffset;
        return this;
    }

    /**
     * 上个分页的offset。
     * @return previousOffset
     */
    public Integer getPreviousOffset() {
        return previousOffset;
    }

    public void setPreviousOffset(Integer previousOffset) {
        this.previousOffset = previousOffset;
    }

    public ListRocketInstanceTopicsResponse withTopics(List<Topic> topics) {
        this.topics = topics;
        return this;
    }

    public ListRocketInstanceTopicsResponse addTopicsItem(Topic topicsItem) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topicsItem);
        return this;
    }

    public ListRocketInstanceTopicsResponse withTopics(Consumer<List<Topic>> topicsSetter) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        topicsSetter.accept(this.topics);
        return this;
    }

    /**
     * topic列表。
     * @return topics
     */
    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
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
        ListRocketInstanceTopicsResponse listRocketInstanceTopicsResponse = (ListRocketInstanceTopicsResponse) o;
        return Objects.equals(this.total, listRocketInstanceTopicsResponse.total)
            && Objects.equals(this.max, listRocketInstanceTopicsResponse.max)
            && Objects.equals(this.remaining, listRocketInstanceTopicsResponse.remaining)
            && Objects.equals(this.nextOffset, listRocketInstanceTopicsResponse.nextOffset)
            && Objects.equals(this.previousOffset, listRocketInstanceTopicsResponse.previousOffset)
            && Objects.equals(this.topics, listRocketInstanceTopicsResponse.topics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, max, remaining, nextOffset, previousOffset, topics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRocketInstanceTopicsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    remaining: ").append(toIndentedString(remaining)).append("\n");
        sb.append("    nextOffset: ").append(toIndentedString(nextOffset)).append("\n");
        sb.append("    previousOffset: ").append(toIndentedString(previousOffset)).append("\n");
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
