package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MQTT配置
 */
public class MqttConfigs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_mqtt")

    private Boolean enableMqtt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mqtts")

    private List<Mqtt> mqtts = null;

    public MqttConfigs withEnableMqtt(Boolean enableMqtt) {
        this.enableMqtt = enableMqtt;
        return this;
    }

    /**
     * 是否启用MQTT
     * @return enableMqtt
     */
    public Boolean getEnableMqtt() {
        return enableMqtt;
    }

    public void setEnableMqtt(Boolean enableMqtt) {
        this.enableMqtt = enableMqtt;
    }

    public MqttConfigs withMqtts(List<Mqtt> mqtts) {
        this.mqtts = mqtts;
        return this;
    }

    public MqttConfigs addMqttsItem(Mqtt mqttsItem) {
        if (this.mqtts == null) {
            this.mqtts = new ArrayList<>();
        }
        this.mqtts.add(mqttsItem);
        return this;
    }

    public MqttConfigs withMqtts(Consumer<List<Mqtt>> mqttsSetter) {
        if (this.mqtts == null) {
            this.mqtts = new ArrayList<>();
        }
        mqttsSetter.accept(this.mqtts);
        return this;
    }

    /**
     * MQTT配置 当enable_mqtt取值为false时，mqtts需要为空数组
     * @return mqtts
     */
    public List<Mqtt> getMqtts() {
        return mqtts;
    }

    public void setMqtts(List<Mqtt> mqtts) {
        this.mqtts = mqtts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MqttConfigs that = (MqttConfigs) obj;
        return Objects.equals(this.enableMqtt, that.enableMqtt) && Objects.equals(this.mqtts, that.mqtts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableMqtt, mqtts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MqttConfigs {\n");
        sb.append("    enableMqtt: ").append(toIndentedString(enableMqtt)).append("\n");
        sb.append("    mqtts: ").append(toIndentedString(mqtts)).append("\n");
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
