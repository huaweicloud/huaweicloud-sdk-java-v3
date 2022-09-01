package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateRuleActionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_id")

    @JacksonXmlProperty(localName = "action_id")

    private String actionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    @JacksonXmlProperty(localName = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    @JacksonXmlProperty(localName = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel")

    @JacksonXmlProperty(localName = "channel")

    private String channel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_detail")

    @JacksonXmlProperty(localName = "channel_detail")

    private ChannelDetail channelDetail;

    public UpdateRuleActionResponse withActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }

    /**
     * 规则动作ID，用于唯一标识一条规则动作，在创建规则动作时由物联网平台分配获得，创建时无需携带，由平台统一分配唯一的action_id。
     * @return actionId
     */
    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public UpdateRuleActionResponse withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * 规则动作对应的的规则触发条件ID。
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public UpdateRuleActionResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 资源空间ID。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public UpdateRuleActionResponse withChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /**
     * 规则动作的类型，取值范围： - HTTP_FORWARDING：HTTP服务消息类型。 - DIS_FORWARDING：转发DIS服务消息类型。 - OBS_FORWARDING：转发OBS服务消息类型。 - AMQP_FORWARDING：转发AMQP服务消息类型。 - DMS_KAFKA_FORWARDING：转发kafka消息类型。 
     * @return channel
     */
    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public UpdateRuleActionResponse withChannelDetail(ChannelDetail channelDetail) {
        this.channelDetail = channelDetail;
        return this;
    }

    public UpdateRuleActionResponse withChannelDetail(Consumer<ChannelDetail> channelDetailSetter) {
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
        UpdateRuleActionResponse updateRuleActionResponse = (UpdateRuleActionResponse) o;
        return Objects.equals(this.actionId, updateRuleActionResponse.actionId)
            && Objects.equals(this.ruleId, updateRuleActionResponse.ruleId)
            && Objects.equals(this.appId, updateRuleActionResponse.appId)
            && Objects.equals(this.channel, updateRuleActionResponse.channel)
            && Objects.equals(this.channelDetail, updateRuleActionResponse.channelDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionId, ruleId, appId, channel, channelDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRuleActionResponse {\n");
        sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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
