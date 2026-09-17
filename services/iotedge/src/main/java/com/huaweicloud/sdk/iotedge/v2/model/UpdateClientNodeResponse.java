package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateClientNodeResponse extends SdkResponse {

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

    private MqttNodeChannelDetailDTO mqttChannelDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iotdb_channel_detail")

    private IoTDBNodeChannelDetailDTO iotdbChannelDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "influxdb2_channel_detail")

    private InfluxDB2NodeChannelDetailDTO influxdb2ChannelDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pulsar_channel_detail")

    private PulsarNodeChannelDetailDTO pulsarChannelDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "synchronized_time")

    private String synchronizedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "synchronized_status")

    private Boolean synchronizedStatus;

    public UpdateClientNodeResponse withChannel(String channel) {
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

    public UpdateClientNodeResponse withDescription(String description) {
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

    public UpdateClientNodeResponse withEndpoint(String endpoint) {
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

    public UpdateClientNodeResponse withMqttChannelDetail(MqttNodeChannelDetailDTO mqttChannelDetail) {
        this.mqttChannelDetail = mqttChannelDetail;
        return this;
    }

    public UpdateClientNodeResponse withMqttChannelDetail(Consumer<MqttNodeChannelDetailDTO> mqttChannelDetailSetter) {
        if (this.mqttChannelDetail == null) {
            this.mqttChannelDetail = new MqttNodeChannelDetailDTO();
            mqttChannelDetailSetter.accept(this.mqttChannelDetail);
        }

        return this;
    }

    /**
     * Get mqttChannelDetail
     * @return mqttChannelDetail
     */
    public MqttNodeChannelDetailDTO getMqttChannelDetail() {
        return mqttChannelDetail;
    }

    public void setMqttChannelDetail(MqttNodeChannelDetailDTO mqttChannelDetail) {
        this.mqttChannelDetail = mqttChannelDetail;
    }

    public UpdateClientNodeResponse withIotdbChannelDetail(IoTDBNodeChannelDetailDTO iotdbChannelDetail) {
        this.iotdbChannelDetail = iotdbChannelDetail;
        return this;
    }

    public UpdateClientNodeResponse withIotdbChannelDetail(
        Consumer<IoTDBNodeChannelDetailDTO> iotdbChannelDetailSetter) {
        if (this.iotdbChannelDetail == null) {
            this.iotdbChannelDetail = new IoTDBNodeChannelDetailDTO();
            iotdbChannelDetailSetter.accept(this.iotdbChannelDetail);
        }

        return this;
    }

    /**
     * Get iotdbChannelDetail
     * @return iotdbChannelDetail
     */
    public IoTDBNodeChannelDetailDTO getIotdbChannelDetail() {
        return iotdbChannelDetail;
    }

    public void setIotdbChannelDetail(IoTDBNodeChannelDetailDTO iotdbChannelDetail) {
        this.iotdbChannelDetail = iotdbChannelDetail;
    }

    public UpdateClientNodeResponse withInfluxdb2ChannelDetail(InfluxDB2NodeChannelDetailDTO influxdb2ChannelDetail) {
        this.influxdb2ChannelDetail = influxdb2ChannelDetail;
        return this;
    }

    public UpdateClientNodeResponse withInfluxdb2ChannelDetail(
        Consumer<InfluxDB2NodeChannelDetailDTO> influxdb2ChannelDetailSetter) {
        if (this.influxdb2ChannelDetail == null) {
            this.influxdb2ChannelDetail = new InfluxDB2NodeChannelDetailDTO();
            influxdb2ChannelDetailSetter.accept(this.influxdb2ChannelDetail);
        }

        return this;
    }

    /**
     * Get influxdb2ChannelDetail
     * @return influxdb2ChannelDetail
     */
    public InfluxDB2NodeChannelDetailDTO getInfluxdb2ChannelDetail() {
        return influxdb2ChannelDetail;
    }

    public void setInfluxdb2ChannelDetail(InfluxDB2NodeChannelDetailDTO influxdb2ChannelDetail) {
        this.influxdb2ChannelDetail = influxdb2ChannelDetail;
    }

    public UpdateClientNodeResponse withPulsarChannelDetail(PulsarNodeChannelDetailDTO pulsarChannelDetail) {
        this.pulsarChannelDetail = pulsarChannelDetail;
        return this;
    }

    public UpdateClientNodeResponse withPulsarChannelDetail(
        Consumer<PulsarNodeChannelDetailDTO> pulsarChannelDetailSetter) {
        if (this.pulsarChannelDetail == null) {
            this.pulsarChannelDetail = new PulsarNodeChannelDetailDTO();
            pulsarChannelDetailSetter.accept(this.pulsarChannelDetail);
        }

        return this;
    }

    /**
     * Get pulsarChannelDetail
     * @return pulsarChannelDetail
     */
    public PulsarNodeChannelDetailDTO getPulsarChannelDetail() {
        return pulsarChannelDetail;
    }

    public void setPulsarChannelDetail(PulsarNodeChannelDetailDTO pulsarChannelDetail) {
        this.pulsarChannelDetail = pulsarChannelDetail;
    }

    public UpdateClientNodeResponse withCreateTime(String createTime) {
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

    public UpdateClientNodeResponse withUpdateTime(String updateTime) {
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

    public UpdateClientNodeResponse withSynchronizedTime(String synchronizedTime) {
        this.synchronizedTime = synchronizedTime;
        return this;
    }

    /**
     * 下发时间，表示通道是否已经同步到了节点
     * @return synchronizedTime
     */
    public String getSynchronizedTime() {
        return synchronizedTime;
    }

    public void setSynchronizedTime(String synchronizedTime) {
        this.synchronizedTime = synchronizedTime;
    }

    public UpdateClientNodeResponse withSynchronizedStatus(Boolean synchronizedStatus) {
        this.synchronizedStatus = synchronizedStatus;
        return this;
    }

    /**
     * 下发状态，表示是否已同步到了节点
     * @return synchronizedStatus
     */
    public Boolean getSynchronizedStatus() {
        return synchronizedStatus;
    }

    public void setSynchronizedStatus(Boolean synchronizedStatus) {
        this.synchronizedStatus = synchronizedStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateClientNodeResponse that = (UpdateClientNodeResponse) obj;
        return Objects.equals(this.channel, that.channel) && Objects.equals(this.description, that.description)
            && Objects.equals(this.endpoint, that.endpoint)
            && Objects.equals(this.mqttChannelDetail, that.mqttChannelDetail)
            && Objects.equals(this.iotdbChannelDetail, that.iotdbChannelDetail)
            && Objects.equals(this.influxdb2ChannelDetail, that.influxdb2ChannelDetail)
            && Objects.equals(this.pulsarChannelDetail, that.pulsarChannelDetail)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.synchronizedTime, that.synchronizedTime)
            && Objects.equals(this.synchronizedStatus, that.synchronizedStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channel,
            description,
            endpoint,
            mqttChannelDetail,
            iotdbChannelDetail,
            influxdb2ChannelDetail,
            pulsarChannelDetail,
            createTime,
            updateTime,
            synchronizedTime,
            synchronizedStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateClientNodeResponse {\n");
        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    mqttChannelDetail: ").append(toIndentedString(mqttChannelDetail)).append("\n");
        sb.append("    iotdbChannelDetail: ").append(toIndentedString(iotdbChannelDetail)).append("\n");
        sb.append("    influxdb2ChannelDetail: ").append(toIndentedString(influxdb2ChannelDetail)).append("\n");
        sb.append("    pulsarChannelDetail: ").append(toIndentedString(pulsarChannelDetail)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    synchronizedTime: ").append(toIndentedString(synchronizedTime)).append("\n");
        sb.append("    synchronizedStatus: ").append(toIndentedString(synchronizedStatus)).append("\n");
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
