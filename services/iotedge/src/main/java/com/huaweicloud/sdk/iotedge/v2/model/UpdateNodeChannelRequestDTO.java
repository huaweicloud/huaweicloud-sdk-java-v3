package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新已分配节点通道请求结构体
 */
public class UpdateNodeChannelRequestDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mqtt_channel_detail")

    private UpdateMqttNodeChannelDetail mqttChannelDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pulsar_channel_detail")

    private UpdatePulsarNodeChannelDetail pulsarChannelDetail;

    public UpdateNodeChannelRequestDTO withMqttChannelDetail(UpdateMqttNodeChannelDetail mqttChannelDetail) {
        this.mqttChannelDetail = mqttChannelDetail;
        return this;
    }

    public UpdateNodeChannelRequestDTO withMqttChannelDetail(
        Consumer<UpdateMqttNodeChannelDetail> mqttChannelDetailSetter) {
        if (this.mqttChannelDetail == null) {
            this.mqttChannelDetail = new UpdateMqttNodeChannelDetail();
            mqttChannelDetailSetter.accept(this.mqttChannelDetail);
        }

        return this;
    }

    /**
     * Get mqttChannelDetail
     * @return mqttChannelDetail
     */
    public UpdateMqttNodeChannelDetail getMqttChannelDetail() {
        return mqttChannelDetail;
    }

    public void setMqttChannelDetail(UpdateMqttNodeChannelDetail mqttChannelDetail) {
        this.mqttChannelDetail = mqttChannelDetail;
    }

    public UpdateNodeChannelRequestDTO withPulsarChannelDetail(UpdatePulsarNodeChannelDetail pulsarChannelDetail) {
        this.pulsarChannelDetail = pulsarChannelDetail;
        return this;
    }

    public UpdateNodeChannelRequestDTO withPulsarChannelDetail(
        Consumer<UpdatePulsarNodeChannelDetail> pulsarChannelDetailSetter) {
        if (this.pulsarChannelDetail == null) {
            this.pulsarChannelDetail = new UpdatePulsarNodeChannelDetail();
            pulsarChannelDetailSetter.accept(this.pulsarChannelDetail);
        }

        return this;
    }

    /**
     * Get pulsarChannelDetail
     * @return pulsarChannelDetail
     */
    public UpdatePulsarNodeChannelDetail getPulsarChannelDetail() {
        return pulsarChannelDetail;
    }

    public void setPulsarChannelDetail(UpdatePulsarNodeChannelDetail pulsarChannelDetail) {
        this.pulsarChannelDetail = pulsarChannelDetail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateNodeChannelRequestDTO that = (UpdateNodeChannelRequestDTO) obj;
        return Objects.equals(this.mqttChannelDetail, that.mqttChannelDetail)
            && Objects.equals(this.pulsarChannelDetail, that.pulsarChannelDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mqttChannelDetail, pulsarChannelDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNodeChannelRequestDTO {\n");
        sb.append("    mqttChannelDetail: ").append(toIndentedString(mqttChannelDetail)).append("\n");
        sb.append("    pulsarChannelDetail: ").append(toIndentedString(pulsarChannelDetail)).append("\n");
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
