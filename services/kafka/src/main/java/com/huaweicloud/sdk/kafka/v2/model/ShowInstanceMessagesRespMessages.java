package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ShowInstanceMessagesRespMessages */
public class ShowInstanceMessagesRespMessages {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition")

    private Integer partition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "huge_message")

    private Boolean hugeMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_offset")

    private Integer messageOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_id")

    private String messageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    public ShowInstanceMessagesRespMessages withTopic(String topic) {
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

    public ShowInstanceMessagesRespMessages withPartition(Integer partition) {
        this.partition = partition;
        return this;
    }

    /** 消息所在的分区。
     * 
     * @return partition */
    public Integer getPartition() {
        return partition;
    }

    public void setPartition(Integer partition) {
        this.partition = partition;
    }

    public ShowInstanceMessagesRespMessages withKey(String key) {
        this.key = key;
        return this;
    }

    /** 消息key。
     * 
     * @return key */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ShowInstanceMessagesRespMessages withValue(String value) {
        this.value = value;
        return this;
    }

    /** 消息内容。
     * 
     * @return value */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ShowInstanceMessagesRespMessages withSize(Integer size) {
        this.size = size;
        return this;
    }

    /** 消息大小。
     * 
     * @return size */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ShowInstanceMessagesRespMessages withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /** topic名称。
     * 
     * @return timestamp */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public ShowInstanceMessagesRespMessages withHugeMessage(Boolean hugeMessage) {
        this.hugeMessage = hugeMessage;
        return this;
    }

    /** 大数据标识。
     * 
     * @return hugeMessage */
    public Boolean getHugeMessage() {
        return hugeMessage;
    }

    public void setHugeMessage(Boolean hugeMessage) {
        this.hugeMessage = hugeMessage;
    }

    public ShowInstanceMessagesRespMessages withMessageOffset(Integer messageOffset) {
        this.messageOffset = messageOffset;
        return this;
    }

    /** 消息偏移量。
     * 
     * @return messageOffset */
    public Integer getMessageOffset() {
        return messageOffset;
    }

    public void setMessageOffset(Integer messageOffset) {
        this.messageOffset = messageOffset;
    }

    public ShowInstanceMessagesRespMessages withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /** 消息ID。
     * 
     * @return messageId */
    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public ShowInstanceMessagesRespMessages withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /** 应用ID。
     * 
     * @return appId */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ShowInstanceMessagesRespMessages withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /** 消息标签。
     * 
     * @return tag */
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
        ShowInstanceMessagesRespMessages showInstanceMessagesRespMessages = (ShowInstanceMessagesRespMessages) o;
        return Objects.equals(this.topic, showInstanceMessagesRespMessages.topic)
            && Objects.equals(this.partition, showInstanceMessagesRespMessages.partition)
            && Objects.equals(this.key, showInstanceMessagesRespMessages.key)
            && Objects.equals(this.value, showInstanceMessagesRespMessages.value)
            && Objects.equals(this.size, showInstanceMessagesRespMessages.size)
            && Objects.equals(this.timestamp, showInstanceMessagesRespMessages.timestamp)
            && Objects.equals(this.hugeMessage, showInstanceMessagesRespMessages.hugeMessage)
            && Objects.equals(this.messageOffset, showInstanceMessagesRespMessages.messageOffset)
            && Objects.equals(this.messageId, showInstanceMessagesRespMessages.messageId)
            && Objects.equals(this.appId, showInstanceMessagesRespMessages.appId)
            && Objects.equals(this.tag, showInstanceMessagesRespMessages.tag);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(topic, partition, key, value, size, timestamp, hugeMessage, messageOffset, messageId, appId, tag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceMessagesRespMessages {\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    hugeMessage: ").append(toIndentedString(hugeMessage)).append("\n");
        sb.append("    messageOffset: ").append(toIndentedString(messageOffset)).append("\n");
        sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
