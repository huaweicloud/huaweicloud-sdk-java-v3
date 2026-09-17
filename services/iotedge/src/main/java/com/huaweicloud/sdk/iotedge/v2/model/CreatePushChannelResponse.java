package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreatePushChannelResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_id")

    private String channelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel")

    private String channel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mqtt_channel_detail")

    private MqttChannelDetailDTO mqttChannelDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iotdb_channel_detail")

    private IoTDBChannelDetailDTO iotdbChannelDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "influxdb2_channel_detail")

    private CreateInfluxDB2ChannelDetail influxdb2ChannelDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pulsar_channel_detail")

    private PulsarChannelDetailDTO pulsarChannelDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public CreatePushChannelResponse withChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * 推送通道ID
     * @return channelId
     */
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public CreatePushChannelResponse withName(String name) {
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

    public CreatePushChannelResponse withChannel(String channel) {
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

    public CreatePushChannelResponse withDescription(String description) {
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

    public CreatePushChannelResponse withEndpoint(String endpoint) {
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

    public CreatePushChannelResponse withMqttChannelDetail(MqttChannelDetailDTO mqttChannelDetail) {
        this.mqttChannelDetail = mqttChannelDetail;
        return this;
    }

    public CreatePushChannelResponse withMqttChannelDetail(Consumer<MqttChannelDetailDTO> mqttChannelDetailSetter) {
        if (this.mqttChannelDetail == null) {
            this.mqttChannelDetail = new MqttChannelDetailDTO();
            mqttChannelDetailSetter.accept(this.mqttChannelDetail);
        }

        return this;
    }

    /**
     * Get mqttChannelDetail
     * @return mqttChannelDetail
     */
    public MqttChannelDetailDTO getMqttChannelDetail() {
        return mqttChannelDetail;
    }

    public void setMqttChannelDetail(MqttChannelDetailDTO mqttChannelDetail) {
        this.mqttChannelDetail = mqttChannelDetail;
    }

    public CreatePushChannelResponse withIotdbChannelDetail(IoTDBChannelDetailDTO iotdbChannelDetail) {
        this.iotdbChannelDetail = iotdbChannelDetail;
        return this;
    }

    public CreatePushChannelResponse withIotdbChannelDetail(Consumer<IoTDBChannelDetailDTO> iotdbChannelDetailSetter) {
        if (this.iotdbChannelDetail == null) {
            this.iotdbChannelDetail = new IoTDBChannelDetailDTO();
            iotdbChannelDetailSetter.accept(this.iotdbChannelDetail);
        }

        return this;
    }

    /**
     * Get iotdbChannelDetail
     * @return iotdbChannelDetail
     */
    public IoTDBChannelDetailDTO getIotdbChannelDetail() {
        return iotdbChannelDetail;
    }

    public void setIotdbChannelDetail(IoTDBChannelDetailDTO iotdbChannelDetail) {
        this.iotdbChannelDetail = iotdbChannelDetail;
    }

    public CreatePushChannelResponse withInfluxdb2ChannelDetail(CreateInfluxDB2ChannelDetail influxdb2ChannelDetail) {
        this.influxdb2ChannelDetail = influxdb2ChannelDetail;
        return this;
    }

    public CreatePushChannelResponse withInfluxdb2ChannelDetail(
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

    public CreatePushChannelResponse withPulsarChannelDetail(PulsarChannelDetailDTO pulsarChannelDetail) {
        this.pulsarChannelDetail = pulsarChannelDetail;
        return this;
    }

    public CreatePushChannelResponse withPulsarChannelDetail(
        Consumer<PulsarChannelDetailDTO> pulsarChannelDetailSetter) {
        if (this.pulsarChannelDetail == null) {
            this.pulsarChannelDetail = new PulsarChannelDetailDTO();
            pulsarChannelDetailSetter.accept(this.pulsarChannelDetail);
        }

        return this;
    }

    /**
     * Get pulsarChannelDetail
     * @return pulsarChannelDetail
     */
    public PulsarChannelDetailDTO getPulsarChannelDetail() {
        return pulsarChannelDetail;
    }

    public void setPulsarChannelDetail(PulsarChannelDetailDTO pulsarChannelDetail) {
        this.pulsarChannelDetail = pulsarChannelDetail;
    }

    public CreatePushChannelResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public CreatePushChannelResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePushChannelResponse that = (CreatePushChannelResponse) obj;
        return Objects.equals(this.channelId, that.channelId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.channel, that.channel) && Objects.equals(this.description, that.description)
            && Objects.equals(this.endpoint, that.endpoint)
            && Objects.equals(this.mqttChannelDetail, that.mqttChannelDetail)
            && Objects.equals(this.iotdbChannelDetail, that.iotdbChannelDetail)
            && Objects.equals(this.influxdb2ChannelDetail, that.influxdb2ChannelDetail)
            && Objects.equals(this.pulsarChannelDetail, that.pulsarChannelDetail)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelId,
            name,
            channel,
            description,
            endpoint,
            mqttChannelDetail,
            iotdbChannelDetail,
            influxdb2ChannelDetail,
            pulsarChannelDetail,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePushChannelResponse {\n");
        sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    mqttChannelDetail: ").append(toIndentedString(mqttChannelDetail)).append("\n");
        sb.append("    iotdbChannelDetail: ").append(toIndentedString(iotdbChannelDetail)).append("\n");
        sb.append("    influxdb2ChannelDetail: ").append(toIndentedString(influxdb2ChannelDetail)).append("\n");
        sb.append("    pulsarChannelDetail: ").append(toIndentedString(pulsarChannelDetail)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
