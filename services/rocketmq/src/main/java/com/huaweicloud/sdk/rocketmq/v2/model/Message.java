package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 消息。
 */
public class Message {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg_id")

    private String msgId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "store_timestamp")

    private BigDecimal storeTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "born_timestamp")

    private BigDecimal bornTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reconsume_times")

    private Integer reconsumeTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private String body;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body_crc")

    private BigDecimal bodyCrc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "store_size")

    private BigDecimal storeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_list")

    private List<MessagePropertyList> propertyList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "born_host")

    private String bornHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "store_host")

    private String storeHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_id")

    private Integer queueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_offset")

    private Integer queueOffset;

    public Message withMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }

    /**
     * 消息ID。
     * @return msgId
     */
    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public Message withInstanceId(String instanceId) {
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

    public Message withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * 主题名称。
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Message withStoreTimestamp(BigDecimal storeTimestamp) {
        this.storeTimestamp = storeTimestamp;
        return this;
    }

    /**
     * 存储消息的时间。
     * @return storeTimestamp
     */
    public BigDecimal getStoreTimestamp() {
        return storeTimestamp;
    }

    public void setStoreTimestamp(BigDecimal storeTimestamp) {
        this.storeTimestamp = storeTimestamp;
    }

    public Message withBornTimestamp(BigDecimal bornTimestamp) {
        this.bornTimestamp = bornTimestamp;
        return this;
    }

    /**
     * 产生消息的时间。
     * @return bornTimestamp
     */
    public BigDecimal getBornTimestamp() {
        return bornTimestamp;
    }

    public void setBornTimestamp(BigDecimal bornTimestamp) {
        this.bornTimestamp = bornTimestamp;
    }

    public Message withReconsumeTimes(Integer reconsumeTimes) {
        this.reconsumeTimes = reconsumeTimes;
        return this;
    }

    /**
     * 重试次数。
     * @return reconsumeTimes
     */
    public Integer getReconsumeTimes() {
        return reconsumeTimes;
    }

    public void setReconsumeTimes(Integer reconsumeTimes) {
        this.reconsumeTimes = reconsumeTimes;
    }

    public Message withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * 消息体。
     * @return body
     */
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Message withBodyCrc(BigDecimal bodyCrc) {
        this.bodyCrc = bodyCrc;
        return this;
    }

    /**
     * 消息体校验和。
     * @return bodyCrc
     */
    public BigDecimal getBodyCrc() {
        return bodyCrc;
    }

    public void setBodyCrc(BigDecimal bodyCrc) {
        this.bodyCrc = bodyCrc;
    }

    public Message withStoreSize(BigDecimal storeSize) {
        this.storeSize = storeSize;
        return this;
    }

    /**
     * 存储大小。
     * @return storeSize
     */
    public BigDecimal getStoreSize() {
        return storeSize;
    }

    public void setStoreSize(BigDecimal storeSize) {
        this.storeSize = storeSize;
    }

    public Message withPropertyList(List<MessagePropertyList> propertyList) {
        this.propertyList = propertyList;
        return this;
    }

    public Message addPropertyListItem(MessagePropertyList propertyListItem) {
        if (this.propertyList == null) {
            this.propertyList = new ArrayList<>();
        }
        this.propertyList.add(propertyListItem);
        return this;
    }

    public Message withPropertyList(Consumer<List<MessagePropertyList>> propertyListSetter) {
        if (this.propertyList == null) {
            this.propertyList = new ArrayList<>();
        }
        propertyListSetter.accept(this.propertyList);
        return this;
    }

    /**
     * 消息属性列表。
     * @return propertyList
     */
    public List<MessagePropertyList> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(List<MessagePropertyList> propertyList) {
        this.propertyList = propertyList;
    }

    public Message withBornHost(String bornHost) {
        this.bornHost = bornHost;
        return this;
    }

    /**
     * 产生消息的主机IP。
     * @return bornHost
     */
    public String getBornHost() {
        return bornHost;
    }

    public void setBornHost(String bornHost) {
        this.bornHost = bornHost;
    }

    public Message withStoreHost(String storeHost) {
        this.storeHost = storeHost;
        return this;
    }

    /**
     * 存储消息的主机IP。
     * @return storeHost
     */
    public String getStoreHost() {
        return storeHost;
    }

    public void setStoreHost(String storeHost) {
        this.storeHost = storeHost;
    }

    public Message withQueueId(Integer queueId) {
        this.queueId = queueId;
        return this;
    }

    /**
     * 队列ID。
     * @return queueId
     */
    public Integer getQueueId() {
        return queueId;
    }

    public void setQueueId(Integer queueId) {
        this.queueId = queueId;
    }

    public Message withQueueOffset(Integer queueOffset) {
        this.queueOffset = queueOffset;
        return this;
    }

    /**
     * 在队列中的偏移量。
     * @return queueOffset
     */
    public Integer getQueueOffset() {
        return queueOffset;
    }

    public void setQueueOffset(Integer queueOffset) {
        this.queueOffset = queueOffset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Message that = (Message) obj;
        return Objects.equals(this.msgId, that.msgId) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.topic, that.topic) && Objects.equals(this.storeTimestamp, that.storeTimestamp)
            && Objects.equals(this.bornTimestamp, that.bornTimestamp)
            && Objects.equals(this.reconsumeTimes, that.reconsumeTimes) && Objects.equals(this.body, that.body)
            && Objects.equals(this.bodyCrc, that.bodyCrc) && Objects.equals(this.storeSize, that.storeSize)
            && Objects.equals(this.propertyList, that.propertyList) && Objects.equals(this.bornHost, that.bornHost)
            && Objects.equals(this.storeHost, that.storeHost) && Objects.equals(this.queueId, that.queueId)
            && Objects.equals(this.queueOffset, that.queueOffset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(msgId,
            instanceId,
            topic,
            storeTimestamp,
            bornTimestamp,
            reconsumeTimes,
            body,
            bodyCrc,
            storeSize,
            propertyList,
            bornHost,
            storeHost,
            queueId,
            queueOffset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Message {\n");
        sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    storeTimestamp: ").append(toIndentedString(storeTimestamp)).append("\n");
        sb.append("    bornTimestamp: ").append(toIndentedString(bornTimestamp)).append("\n");
        sb.append("    reconsumeTimes: ").append(toIndentedString(reconsumeTimes)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    bodyCrc: ").append(toIndentedString(bodyCrc)).append("\n");
        sb.append("    storeSize: ").append(toIndentedString(storeSize)).append("\n");
        sb.append("    propertyList: ").append(toIndentedString(propertyList)).append("\n");
        sb.append("    bornHost: ").append(toIndentedString(bornHost)).append("\n");
        sb.append("    storeHost: ").append(toIndentedString(storeHost)).append("\n");
        sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
        sb.append("    queueOffset: ").append(toIndentedString(queueOffset)).append("\n");
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
