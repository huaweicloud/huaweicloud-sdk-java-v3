package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建外部推送通道请求结构体
 */
public class CreateChannelRequestDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_id")

    private String channelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel")

    private String channel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mqtt_channel_detail")

    private CreateMqttChannelDetail mqttChannelDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iotdb_channel_detail")

    private CreateIoTDBChannelDetail iotdbChannelDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "influxdb2_channel_detail")

    private CreateInfluxDB2ChannelDetail influxdb2ChannelDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pulsar_channel_detail")

    private CreatePulsarChannelDetail pulsarChannelDetail;

    public CreateChannelRequestDTO withChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * 推送通道ID,非必填，若用户不填，则系统自动生成
     * @return channelId
     */
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public CreateChannelRequestDTO withChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /**
     * 通道
     * @return channel
     */
    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public CreateChannelRequestDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 推送通道名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateChannelRequestDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 推送通道描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateChannelRequestDTO withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * 推送的地址
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public CreateChannelRequestDTO withMqttChannelDetail(CreateMqttChannelDetail mqttChannelDetail) {
        this.mqttChannelDetail = mqttChannelDetail;
        return this;
    }

    public CreateChannelRequestDTO withMqttChannelDetail(Consumer<CreateMqttChannelDetail> mqttChannelDetailSetter) {
        if (this.mqttChannelDetail == null) {
            this.mqttChannelDetail = new CreateMqttChannelDetail();
            mqttChannelDetailSetter.accept(this.mqttChannelDetail);
        }

        return this;
    }

    /**
     * Get mqttChannelDetail
     * @return mqttChannelDetail
     */
    public CreateMqttChannelDetail getMqttChannelDetail() {
        return mqttChannelDetail;
    }

    public void setMqttChannelDetail(CreateMqttChannelDetail mqttChannelDetail) {
        this.mqttChannelDetail = mqttChannelDetail;
    }

    public CreateChannelRequestDTO withIotdbChannelDetail(CreateIoTDBChannelDetail iotdbChannelDetail) {
        this.iotdbChannelDetail = iotdbChannelDetail;
        return this;
    }

    public CreateChannelRequestDTO withIotdbChannelDetail(Consumer<CreateIoTDBChannelDetail> iotdbChannelDetailSetter) {
        if (this.iotdbChannelDetail == null) {
            this.iotdbChannelDetail = new CreateIoTDBChannelDetail();
            iotdbChannelDetailSetter.accept(this.iotdbChannelDetail);
        }

        return this;
    }

    /**
     * Get iotdbChannelDetail
     * @return iotdbChannelDetail
     */
    public CreateIoTDBChannelDetail getIotdbChannelDetail() {
        return iotdbChannelDetail;
    }

    public void setIotdbChannelDetail(CreateIoTDBChannelDetail iotdbChannelDetail) {
        this.iotdbChannelDetail = iotdbChannelDetail;
    }

    public CreateChannelRequestDTO withInfluxdb2ChannelDetail(CreateInfluxDB2ChannelDetail influxdb2ChannelDetail) {
        this.influxdb2ChannelDetail = influxdb2ChannelDetail;
        return this;
    }

    public CreateChannelRequestDTO withInfluxdb2ChannelDetail(
        Consumer<CreateInfluxDB2ChannelDetail> influxdb2ChannelDetailSetter) {
        if (this.influxdb2ChannelDetail == null) {
            this.influxdb2ChannelDetail = new CreateInfluxDB2ChannelDetail();
            influxdb2ChannelDetailSetter.accept(this.influxdb2ChannelDetail);
        }

        return this;
    }

    /**
     * Get influxdb2ChannelDetail
     * @return influxdb2ChannelDetail
     */
    public CreateInfluxDB2ChannelDetail getInfluxdb2ChannelDetail() {
        return influxdb2ChannelDetail;
    }

    public void setInfluxdb2ChannelDetail(CreateInfluxDB2ChannelDetail influxdb2ChannelDetail) {
        this.influxdb2ChannelDetail = influxdb2ChannelDetail;
    }

    public CreateChannelRequestDTO withPulsarChannelDetail(CreatePulsarChannelDetail pulsarChannelDetail) {
        this.pulsarChannelDetail = pulsarChannelDetail;
        return this;
    }

    public CreateChannelRequestDTO withPulsarChannelDetail(
        Consumer<CreatePulsarChannelDetail> pulsarChannelDetailSetter) {
        if (this.pulsarChannelDetail == null) {
            this.pulsarChannelDetail = new CreatePulsarChannelDetail();
            pulsarChannelDetailSetter.accept(this.pulsarChannelDetail);
        }

        return this;
    }

    /**
     * Get pulsarChannelDetail
     * @return pulsarChannelDetail
     */
    public CreatePulsarChannelDetail getPulsarChannelDetail() {
        return pulsarChannelDetail;
    }

    public void setPulsarChannelDetail(CreatePulsarChannelDetail pulsarChannelDetail) {
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
        CreateChannelRequestDTO that = (CreateChannelRequestDTO) obj;
        return Objects.equals(this.channelId, that.channelId) && Objects.equals(this.channel, that.channel)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.endpoint, that.endpoint)
            && Objects.equals(this.mqttChannelDetail, that.mqttChannelDetail)
            && Objects.equals(this.iotdbChannelDetail, that.iotdbChannelDetail)
            && Objects.equals(this.influxdb2ChannelDetail, that.influxdb2ChannelDetail)
            && Objects.equals(this.pulsarChannelDetail, that.pulsarChannelDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelId,
            channel,
            name,
            description,
            endpoint,
            mqttChannelDetail,
            iotdbChannelDetail,
            influxdb2ChannelDetail,
            pulsarChannelDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateChannelRequestDTO {\n");
        sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    mqttChannelDetail: ").append(toIndentedString(mqttChannelDetail)).append("\n");
        sb.append("    iotdbChannelDetail: ").append(toIndentedString(iotdbChannelDetail)).append("\n");
        sb.append("    influxdb2ChannelDetail: ").append(toIndentedString(influxdb2ChannelDetail)).append("\n");
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
