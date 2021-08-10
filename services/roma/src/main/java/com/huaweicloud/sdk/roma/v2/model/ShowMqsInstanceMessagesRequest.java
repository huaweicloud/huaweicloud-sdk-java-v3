package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ShowMqsInstanceMessagesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asc")

    private Boolean asc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "download")

    private Boolean download;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_offset")

    private String messageOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition")

    private String partition;

    public ShowMqsInstanceMessagesRequest withInstanceId(String instanceId) {
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

    public ShowMqsInstanceMessagesRequest withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /** topic名称。
     * 
     * @return topic */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public ShowMqsInstanceMessagesRequest withAsc(Boolean asc) {
        this.asc = asc;
        return this;
    }

    /** 是否按照时间排序。
     * 
     * @return asc */
    public Boolean getAsc() {
        return asc;
    }

    public void setAsc(Boolean asc) {
        this.asc = asc;
    }

    public ShowMqsInstanceMessagesRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 开始时间。Unix毫秒时间戳。
     * 
     * @return startTime */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowMqsInstanceMessagesRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 开始时间。Unix毫秒时间戳。
     * 
     * @return endTime */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ShowMqsInstanceMessagesRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /** 查询消息的数量。
     * 
     * @return limit */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ShowMqsInstanceMessagesRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /** 查询的偏移量。
     * 
     * @return offset */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ShowMqsInstanceMessagesRequest withDownload(Boolean download) {
        this.download = download;
        return this;
    }

    /** 是否下载。
     * 
     * @return download */
    public Boolean getDownload() {
        return download;
    }

    public void setDownload(Boolean download) {
        this.download = download;
    }

    public ShowMqsInstanceMessagesRequest withMessageOffset(String messageOffset) {
        this.messageOffset = messageOffset;
        return this;
    }

    /** 消息偏移量。
     * 
     * @return messageOffset */
    public String getMessageOffset() {
        return messageOffset;
    }

    public void setMessageOffset(String messageOffset) {
        this.messageOffset = messageOffset;
    }

    public ShowMqsInstanceMessagesRequest withPartition(String partition) {
        this.partition = partition;
        return this;
    }

    /** 分区。
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
        ShowMqsInstanceMessagesRequest showMqsInstanceMessagesRequest = (ShowMqsInstanceMessagesRequest) o;
        return Objects.equals(this.instanceId, showMqsInstanceMessagesRequest.instanceId)
            && Objects.equals(this.topic, showMqsInstanceMessagesRequest.topic)
            && Objects.equals(this.asc, showMqsInstanceMessagesRequest.asc)
            && Objects.equals(this.startTime, showMqsInstanceMessagesRequest.startTime)
            && Objects.equals(this.endTime, showMqsInstanceMessagesRequest.endTime)
            && Objects.equals(this.limit, showMqsInstanceMessagesRequest.limit)
            && Objects.equals(this.offset, showMqsInstanceMessagesRequest.offset)
            && Objects.equals(this.download, showMqsInstanceMessagesRequest.download)
            && Objects.equals(this.messageOffset, showMqsInstanceMessagesRequest.messageOffset)
            && Objects.equals(this.partition, showMqsInstanceMessagesRequest.partition);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(instanceId, topic, asc, startTime, endTime, limit, offset, download, messageOffset, partition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMqsInstanceMessagesRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    asc: ").append(toIndentedString(asc)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    download: ").append(toIndentedString(download)).append("\n");
        sb.append("    messageOffset: ").append(toIndentedString(messageOffset)).append("\n");
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
