package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowMqsInstanceMessagesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    @JacksonXmlProperty(localName = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    @JacksonXmlProperty(localName = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asc")

    @JacksonXmlProperty(localName = "asc")

    private Boolean asc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    @JacksonXmlProperty(localName = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    @JacksonXmlProperty(localName = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "download")

    @JacksonXmlProperty(localName = "download")

    private Boolean download;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_offset")

    @JacksonXmlProperty(localName = "message_offset")

    private String messageOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition")

    @JacksonXmlProperty(localName = "partition")

    private String partition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    @JacksonXmlProperty(localName = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_id")

    @JacksonXmlProperty(localName = "message_id")

    private String messageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    @JacksonXmlProperty(localName = "tag")

    private String tag;

    public ShowMqsInstanceMessagesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。
     * @return instanceId
     */
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

    /**
     * topic名称。
     * @return topic
     */
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

    /**
     * 是否按照时间排序。
     * @return asc
     */
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

    /**
     * 开始时间。Unix毫秒时间戳。 查询消息偏移量时，为必选参数。
     * @return startTime
     */
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

    /**
     * 结束时间。Unix毫秒时间戳。 查询消息偏移量时，为必选参数。
     * @return endTime
     */
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

    /**
     * 查询消息的数量。
     * @return limit
     */
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

    /**
     * 查询的偏移量。
     * @return offset
     */
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

    /**
     * 是否下载。
     * @return download
     */
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

    /**
     * 消息偏移量。 查询消息内容时，为必选参数。 若start_time、end_time参数不为空，该参数无效。
     * @return messageOffset
     */
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

    /**
     * 分区。 查询消息内容时，为必选参数。 若start_time、end_time参数不为空，该参数无效。
     * @return partition
     */
    public String getPartition() {
        return partition;
    }

    public void setPartition(String partition) {
        this.partition = partition;
    }

    public ShowMqsInstanceMessagesRequest withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 消息key。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ShowMqsInstanceMessagesRequest withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * 消息ID。
     * @return messageId
     */
    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public ShowMqsInstanceMessagesRequest withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 消息标签。
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
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
            && Objects.equals(this.partition, showMqsInstanceMessagesRequest.partition)
            && Objects.equals(this.key, showMqsInstanceMessagesRequest.key)
            && Objects.equals(this.messageId, showMqsInstanceMessagesRequest.messageId)
            && Objects.equals(this.tag, showMqsInstanceMessagesRequest.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId,
            topic,
            asc,
            startTime,
            endTime,
            limit,
            offset,
            download,
            messageOffset,
            partition,
            key,
            messageId,
            tag);
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
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
