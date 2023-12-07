package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SinkKafkaParameters
 */
public class SinkKafkaParameters {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyTransform")

    private List<TransForm> keyTransform = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connectionId")

    private String connectionId;

    public SinkKafkaParameters withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * topic名称
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public SinkKafkaParameters withKeyTransform(List<TransForm> keyTransform) {
        this.keyTransform = keyTransform;
        return this;
    }

    public SinkKafkaParameters addKeyTransformItem(TransForm keyTransformItem) {
        if (this.keyTransform == null) {
            this.keyTransform = new ArrayList<>();
        }
        this.keyTransform.add(keyTransformItem);
        return this;
    }

    public SinkKafkaParameters withKeyTransform(Consumer<List<TransForm>> keyTransformSetter) {
        if (this.keyTransform == null) {
            this.keyTransform = new ArrayList<>();
        }
        keyTransformSetter.accept(this.keyTransform);
        return this;
    }

    /**
     * key的转换规则
     * @return keyTransform
     */
    public List<TransForm> getKeyTransform() {
        return keyTransform;
    }

    public void setKeyTransform(List<TransForm> keyTransform) {
        this.keyTransform = keyTransform;
    }

    public SinkKafkaParameters withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * 目标连接id
     * @return connectionId
     */
    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SinkKafkaParameters that = (SinkKafkaParameters) obj;
        return Objects.equals(this.topic, that.topic) && Objects.equals(this.keyTransform, that.keyTransform)
            && Objects.equals(this.connectionId, that.connectionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, keyTransform, connectionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SinkKafkaParameters {\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    keyTransform: ").append(toIndentedString(keyTransform)).append("\n");
        sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
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
