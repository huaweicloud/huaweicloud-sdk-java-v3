package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ShowMessagesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition")

    private String partition;

    public ShowMessagesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 实例ID。
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowMessagesRequest withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /** Topic名称。
     * 
     * @return topic */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public ShowMessagesRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 查询起始时间，为unix时间戳格式，默认值为0。
     * 
     * @return startTime */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowMessagesRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 查询结束时间，为unix时间戳格式，默认值为系统当前时间。
     * 
     * @return endTime */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ShowMessagesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 单页返回消息数，默认值为10。
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowMessagesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 查询的页码，默认值为1。
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowMessagesRequest withPartition(String partition) {
        this.partition = partition;
        return this;
    }

    /** 分区编号，默认值为-1，若传入值为-1，则查询所有分区。
     * 
     * @return partition */
    public String getPartition() {
        return partition;
    }

    public void setPartition(String partition) {
        this.partition = partition;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMessagesRequest showMessagesRequest = (ShowMessagesRequest) o;
        return Objects.equals(this.instanceId, showMessagesRequest.instanceId)
            && Objects.equals(this.topic, showMessagesRequest.topic)
            && Objects.equals(this.startTime, showMessagesRequest.startTime)
            && Objects.equals(this.endTime, showMessagesRequest.endTime)
            && Objects.equals(this.limit, showMessagesRequest.limit)
            && Objects.equals(this.offset, showMessagesRequest.offset)
            && Objects.equals(this.partition, showMessagesRequest.partition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, topic, startTime, endTime, limit, offset, partition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMessagesRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
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
