package com.huaweicloud.sdk.dms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** SendMessageEntity */
public class SendMessageEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private Object body;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private Object attributes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private Object tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay_time")

    private Object delayTime;

    public SendMessageEntity withBody(Object body) {
        this.body = body;
        return this;
    }

    /** 消息正文。
     * 
     * @return body */
    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public SendMessageEntity withAttributes(Object attributes) {
        this.attributes = attributes;
        return this;
    }

    /** 属性列表，包含属性名称和属性值。 同一条消息的属性名称不可重复，否则属性值将被覆盖。
     * 
     * @return attributes */
    public Object getAttributes() {
        return attributes;
    }

    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }

    public SendMessageEntity withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    /** 消息标签，即Label，是通过对消息增加Label来区分队列中的消息分类，DMS允许消费者按照Label对消息进行过滤，确保消费者最终只消费到他关心的消息类型。
     * 消息标签只能包含a~z，A~Z，0-9，-，_，长度是[1，64]。 最多可添加3个标签。
     * 
     * @return tags */
    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
        this.tags = tags;
    }

    public SendMessageEntity withDelayTime(Object delayTime) {
        this.delayTime = delayTime;
        return this;
    }

    /** 延时消息的延时时长。 延时消息是指消息发送到DMS服务后，并不期望这条消息立即被消费，而是延迟一段时间后才能被消费。 取值范围：0~604800000 单位：毫秒 不配置该参数或者配置为0，表示无延时。
     * 配置为浮点数时，自动取小数点前面的整数值，比如配置为6000.9，则自动取值为6000。
     * 仅NORMAL队列和FIFO队列可以设置延时消息，Kafka队列不支持延时消息的功能，如果向Kafka队列生产延时消息，提示{\"code\":10540010, \"message\":\"Invalid request
     * format: kafka queue message could not have delayTime.\"}。
     * 
     * @return delayTime */
    public Object getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(Object delayTime) {
        this.delayTime = delayTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SendMessageEntity sendMessageEntity = (SendMessageEntity) o;
        return Objects.equals(this.body, sendMessageEntity.body)
            && Objects.equals(this.attributes, sendMessageEntity.attributes)
            && Objects.equals(this.tags, sendMessageEntity.tags)
            && Objects.equals(this.delayTime, sendMessageEntity.delayTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, attributes, tags, delayTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendMessageEntity {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    delayTime: ").append(toIndentedString(delayTime)).append("\n");
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
