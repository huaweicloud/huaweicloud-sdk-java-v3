package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SendMessageResp
 */
public class SendMessageResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private String body;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_list")

    private List<SendMessageProperties> propertyList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg_id")

    private String msgId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_id")

    private BigDecimal queueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_offset")

    private BigDecimal queueOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_name")

    private String brokerName;

    public SendMessageResp withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * **参数解释**： 主题名称。 **取值范围**： 不涉及。
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public SendMessageResp withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * **参数解释**： 消息内容。 **取值范围**： 不涉及。
     * @return body
     */
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public SendMessageResp withPropertyList(List<SendMessageProperties> propertyList) {
        this.propertyList = propertyList;
        return this;
    }

    public SendMessageResp addPropertyListItem(SendMessageProperties propertyListItem) {
        if (this.propertyList == null) {
            this.propertyList = new ArrayList<>();
        }
        this.propertyList.add(propertyListItem);
        return this;
    }

    public SendMessageResp withPropertyList(Consumer<List<SendMessageProperties>> propertyListSetter) {
        if (this.propertyList == null) {
            this.propertyList = new ArrayList<>();
        }
        propertyListSetter.accept(this.propertyList);
        return this;
    }

    /**
     * **参数解释**： 特性列表。 **取值范围**： 不涉及。
     * @return propertyList
     */
    public List<SendMessageProperties> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(List<SendMessageProperties> propertyList) {
        this.propertyList = propertyList;
    }

    public SendMessageResp withMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }

    /**
     * **参数解释**： 消息ID。 **取值范围**： 不涉及。
     * @return msgId
     */
    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public SendMessageResp withQueueId(BigDecimal queueId) {
        this.queueId = queueId;
        return this;
    }

    /**
     * **参数解释**： 队列ID。 **取值范围**： 不涉及。
     * @return queueId
     */
    public BigDecimal getQueueId() {
        return queueId;
    }

    public void setQueueId(BigDecimal queueId) {
        this.queueId = queueId;
    }

    public SendMessageResp withQueueOffset(BigDecimal queueOffset) {
        this.queueOffset = queueOffset;
        return this;
    }

    /**
     * **参数解释**： 队列offset。 **取值范围**： 不涉及。
     * @return queueOffset
     */
    public BigDecimal getQueueOffset() {
        return queueOffset;
    }

    public void setQueueOffset(BigDecimal queueOffset) {
        this.queueOffset = queueOffset;
    }

    public SendMessageResp withBrokerName(String brokerName) {
        this.brokerName = brokerName;
        return this;
    }

    /**
     * **参数解释**： Broker名称。 **取值范围**： 不涉及。
     * @return brokerName
     */
    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SendMessageResp that = (SendMessageResp) obj;
        return Objects.equals(this.topic, that.topic) && Objects.equals(this.body, that.body)
            && Objects.equals(this.propertyList, that.propertyList) && Objects.equals(this.msgId, that.msgId)
            && Objects.equals(this.queueId, that.queueId) && Objects.equals(this.queueOffset, that.queueOffset)
            && Objects.equals(this.brokerName, that.brokerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, body, propertyList, msgId, queueId, queueOffset, brokerName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendMessageResp {\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    propertyList: ").append(toIndentedString(propertyList)).append("\n");
        sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
        sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
        sb.append("    queueOffset: ").append(toIndentedString(queueOffset)).append("\n");
        sb.append("    brokerName: ").append(toIndentedString(brokerName)).append("\n");
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
