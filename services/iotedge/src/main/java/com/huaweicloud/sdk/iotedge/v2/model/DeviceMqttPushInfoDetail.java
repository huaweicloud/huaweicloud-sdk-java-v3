package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 设备数据推送MQTT详情
 */
public class DeviceMqttPushInfoDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qos")

    private Integer qos;

    public DeviceMqttPushInfoDetail withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * client推送的topic
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public DeviceMqttPushInfoDetail withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 数据格式转换类型
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public DeviceMqttPushInfoDetail withQos(Integer qos) {
        this.qos = qos;
        return this;
    }

    /**
     * MQTT的服务质量
     * minimum: 0
     * maximum: 2
     * @return qos
     */
    public Integer getQos() {
        return qos;
    }

    public void setQos(Integer qos) {
        this.qos = qos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeviceMqttPushInfoDetail that = (DeviceMqttPushInfoDetail) obj;
        return Objects.equals(this.topic, that.topic) && Objects.equals(this.format, that.format)
            && Objects.equals(this.qos, that.qos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, format, qos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceMqttPushInfoDetail {\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    qos: ").append(toIndentedString(qos)).append("\n");
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
