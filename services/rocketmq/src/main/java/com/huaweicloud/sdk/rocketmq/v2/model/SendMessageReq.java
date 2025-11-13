package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SendMessageReq
 */
public class SendMessageReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private String body;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_list")

    private List<SendMessageProperties> propertyList = null;

    public SendMessageReq withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * **参数解释**： 主题名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public SendMessageReq withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * **参数解释**： 消息内容。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return body
     */
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public SendMessageReq withPropertyList(List<SendMessageProperties> propertyList) {
        this.propertyList = propertyList;
        return this;
    }

    public SendMessageReq addPropertyListItem(SendMessageProperties propertyListItem) {
        if (this.propertyList == null) {
            this.propertyList = new ArrayList<>();
        }
        this.propertyList.add(propertyListItem);
        return this;
    }

    public SendMessageReq withPropertyList(Consumer<List<SendMessageProperties>> propertyListSetter) {
        if (this.propertyList == null) {
            this.propertyList = new ArrayList<>();
        }
        propertyListSetter.accept(this.propertyList);
        return this;
    }

    /**
     * **参数解释**： 特性列表。
     * @return propertyList
     */
    public List<SendMessageProperties> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(List<SendMessageProperties> propertyList) {
        this.propertyList = propertyList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SendMessageReq that = (SendMessageReq) obj;
        return Objects.equals(this.topic, that.topic) && Objects.equals(this.body, that.body)
            && Objects.equals(this.propertyList, that.propertyList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, body, propertyList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendMessageReq {\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    propertyList: ").append(toIndentedString(propertyList)).append("\n");
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
