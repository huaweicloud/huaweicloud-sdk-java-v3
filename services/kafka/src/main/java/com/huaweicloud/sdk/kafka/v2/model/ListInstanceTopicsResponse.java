package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
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
    @JsonProperty(value = "topics")

    private List<ListInstanceTopicsRespTopics> topics = null;

    public ListInstanceTopicsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /** topic总数。
     * 
     * @return total */
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

    /** 分页查询的大小。
     * 
     * @return size */
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

    /** 剩余分区数。
     * 
     * @return remainPartitions */
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

    /** 分区总数。
     * 
     * @return maxPartitions */
    public Integer getMaxPartitions() {
        return maxPartitions;
    }

    public void setMaxPartitions(Integer maxPartitions) {
        this.maxPartitions = maxPartitions;
    }

    public ListInstanceTopicsResponse withTopics(List<ListInstanceTopicsRespTopics> topics) {
        this.topics = topics;
        return this;
    }

    public ListInstanceTopicsResponse addTopicsItem(ListInstanceTopicsRespTopics topicsItem) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topicsItem);
        return this;
    }

    public ListInstanceTopicsResponse withTopics(Consumer<List<ListInstanceTopicsRespTopics>> topicsSetter) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        topicsSetter.accept(this.topics);
        return this;
    }

    /** topic列表。
     * 
     * @return topics */
    public List<ListInstanceTopicsRespTopics> getTopics() {
        return topics;
    }

    public void setTopics(List<ListInstanceTopicsRespTopics> topics) {
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
        ListInstanceTopicsResponse listInstanceTopicsResponse = (ListInstanceTopicsResponse) o;
        return Objects.equals(this.total, listInstanceTopicsResponse.total)
            && Objects.equals(this.size, listInstanceTopicsResponse.size)
            && Objects.equals(this.remainPartitions, listInstanceTopicsResponse.remainPartitions)
            && Objects.equals(this.maxPartitions, listInstanceTopicsResponse.maxPartitions)
            && Objects.equals(this.topics, listInstanceTopicsResponse.topics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, size, remainPartitions, maxPartitions, topics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceTopicsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    remainPartitions: ").append(toIndentedString(remainPartitions)).append("\n");
        sb.append("    maxPartitions: ").append(toIndentedString(maxPartitions)).append("\n");
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
