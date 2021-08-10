package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ShowInstanceMessagesRequest {

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

    public ShowInstanceMessagesRequest withInstanceId(String instanceId) {
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

    public ShowInstanceMessagesRequest withTopic(String topic) {
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

    public ShowInstanceMessagesRequest withAsc(Boolean asc) {
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

    public ShowInstanceMessagesRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 开始时间。Unix毫秒时间戳。 查询消息偏移量时，为必选参数。
     * 
     * @return startTime */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowInstanceMessagesRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 结束时间。Unix毫秒时间戳。 查询消息偏移量时，为必选参数。
     * 
     * @return endTime */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ShowInstanceMessagesRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /** 分页大小。
     * 
     * @return limit */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ShowInstanceMessagesRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /** 分页偏移量。
     * 
     * @return offset */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ShowInstanceMessagesRequest withDownload(Boolean download) {
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

    public ShowInstanceMessagesRequest withMessageOffset(String messageOffset) {
        this.messageOffset = messageOffset;
        return this;
    }

    /** 消息偏移量。 **查询消息内容时，为必选参数。** 若start_time、end_time参数不为空，该参数无效。
     * 
     * @return messageOffset */
    public String getMessageOffset() {
        return messageOffset;
    }

    public void setMessageOffset(String messageOffset) {
        this.messageOffset = messageOffset;
    }

    public ShowInstanceMessagesRequest withPartition(String partition) {
        this.partition = partition;
        return this;
    }

    /** 分区。 **查询消息内容时，为必选参数。** 若start_time、end_time参数不为空，该参数无效。
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
        ShowInstanceMessagesRequest showInstanceMessagesRequest = (ShowInstanceMessagesRequest) o;
        return Objects.equals(this.instanceId, showInstanceMessagesRequest.instanceId)
            && Objects.equals(this.topic, showInstanceMessagesRequest.topic)
            && Objects.equals(this.asc, showInstanceMessagesRequest.asc)
            && Objects.equals(this.startTime, showInstanceMessagesRequest.startTime)
            && Objects.equals(this.endTime, showInstanceMessagesRequest.endTime)
            && Objects.equals(this.limit, showInstanceMessagesRequest.limit)
            && Objects.equals(this.offset, showInstanceMessagesRequest.offset)
            && Objects.equals(this.download, showInstanceMessagesRequest.download)
            && Objects.equals(this.messageOffset, showInstanceMessagesRequest.messageOffset)
            && Objects.equals(this.partition, showInstanceMessagesRequest.partition);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(instanceId, topic, asc, startTime, endTime, limit, offset, download, messageOffset, partition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceMessagesRequest {\n");
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
