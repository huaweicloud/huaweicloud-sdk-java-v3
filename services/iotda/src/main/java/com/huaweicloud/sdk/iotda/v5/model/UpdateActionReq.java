package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改规则动作请求结构体
 */
public class UpdateActionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel")

    @JacksonXmlProperty(localName = "channel")

    private String channel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_detail")

    @JacksonXmlProperty(localName = "channel_detail")

    private ChannelDetail channelDetail;

    public UpdateActionReq withChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /**
     * **参数说明**：规则动作的类型。 **取值范围**： - HTTP_FORWARDING：HTTP服务消息类型。 - DIS_FORWARDING：转发DIS服务消息类型。 - OBS_FORWARDING：转发OBS服务消息类型。 - AMQP_FORWARDING：转发AMQP服务消息类型。 - DMS_KAFKA_FORWARDING：转发kafka消息类型。
     * @return channel
     */
    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public UpdateActionReq withChannelDetail(ChannelDetail channelDetail) {
        this.channelDetail = channelDetail;
        return this;
    }

    public UpdateActionReq withChannelDetail(Consumer<ChannelDetail> channelDetailSetter) {
        if (this.channelDetail == null) {
            this.channelDetail = new ChannelDetail();
            channelDetailSetter.accept(this.channelDetail);
        }

        return this;
    }

    /**
     * Get channelDetail
     * @return channelDetail
     */
    public ChannelDetail getChannelDetail() {
        return channelDetail;
    }

    public void setChannelDetail(ChannelDetail channelDetail) {
        this.channelDetail = channelDetail;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateActionReq updateActionReq = (UpdateActionReq) o;
        return Objects.equals(this.channel, updateActionReq.channel)
            && Objects.equals(this.channelDetail, updateActionReq.channelDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channel, channelDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateActionReq {\n");
        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
        sb.append("    channelDetail: ").append(toIndentedString(channelDetail)).append("\n");
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
