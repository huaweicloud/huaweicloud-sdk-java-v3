package com.huaweicloud.sdk.kafka.v2.model;

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
public class SendKafkaMessageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private String body;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_list")

    private List<Object> propertyList = null;

    public SendKafkaMessageResponse withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * Kafka的Topic
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public SendKafkaMessageResponse withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * 消息内容
     * @return body
     */
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public SendKafkaMessageResponse withPropertyList(List<Object> propertyList) {
        this.propertyList = propertyList;
        return this;
    }

    public SendKafkaMessageResponse addPropertyListItem(Object propertyListItem) {
        if (this.propertyList == null) {
            this.propertyList = new ArrayList<>();
        }
        this.propertyList.add(propertyListItem);
        return this;
    }

    public SendKafkaMessageResponse withPropertyList(Consumer<List<Object>> propertyListSetter) {
        if (this.propertyList == null) {
            this.propertyList = new ArrayList<>();
        }
        propertyListSetter.accept(this.propertyList);
        return this;
    }

    /**
     * Topic的分区信息等
     * @return propertyList
     */
    public List<Object> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(List<Object> propertyList) {
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
        SendKafkaMessageResponse that = (SendKafkaMessageResponse) obj;
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
        sb.append("class SendKafkaMessageResponse {\n");
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
