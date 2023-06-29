package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 订阅的kafka事件目标参数列表，该字段序列化后总长度不超过1024字节
 */
public class KafkaTargetDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyTransform")

    private KafkaTargetDetailKeyTransform keyTransform;

    public KafkaTargetDetail withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * 主题
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public KafkaTargetDetail withKeyTransform(KafkaTargetDetailKeyTransform keyTransform) {
        this.keyTransform = keyTransform;
        return this;
    }

    public KafkaTargetDetail withKeyTransform(Consumer<KafkaTargetDetailKeyTransform> keyTransformSetter) {
        if (this.keyTransform == null) {
            this.keyTransform = new KafkaTargetDetailKeyTransform();
            keyTransformSetter.accept(this.keyTransform);
        }

        return this;
    }

    /**
     * Get keyTransform
     * @return keyTransform
     */
    public KafkaTargetDetailKeyTransform getKeyTransform() {
        return keyTransform;
    }

    public void setKeyTransform(KafkaTargetDetailKeyTransform keyTransform) {
        this.keyTransform = keyTransform;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KafkaTargetDetail that = (KafkaTargetDetail) obj;
        return Objects.equals(this.topic, that.topic) && Objects.equals(this.keyTransform, that.keyTransform);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, keyTransform);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KafkaTargetDetail {\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    keyTransform: ").append(toIndentedString(keyTransform)).append("\n");
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
