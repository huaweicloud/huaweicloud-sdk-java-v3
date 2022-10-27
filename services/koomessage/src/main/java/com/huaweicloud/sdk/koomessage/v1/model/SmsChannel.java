package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 短信发送通道参数。
 */
public class SmsChannel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_number")

    private String channelNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sms_tpl_id")

    private String smsTplId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sms_sign")

    private String smsSign;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sms_app_name")

    private String smsAppName;

    public SmsChannel withChannelNumber(String channelNumber) {
        this.channelNumber = channelNumber;
        return this;
    }

    /**
     * 短信通道号。  > 必须与另外三个字段sms_tpl_id、sms_sign、sms_app_name相匹配，这些字段信息可以从“云消息服务KooMessage-管理控制台-短信配置-短信签名管理-通道号”中获取。 
     * @return channelNumber
     */
    public String getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(String channelNumber) {
        this.channelNumber = channelNumber;
    }

    public SmsChannel withSmsTplId(String smsTplId) {
        this.smsTplId = smsTplId;
        return this;
    }

    /**
     * 短信模板ID。  > 必须与另外三个字段channel_number、sms_sign、sms_app_name相匹配，这些字段信息可以从“云消息服务KooMessage-管理控制台-短信配置-短信模板管理-模板ID”中获取。 
     * @return smsTplId
     */
    public String getSmsTplId() {
        return smsTplId;
    }

    public void setSmsTplId(String smsTplId) {
        this.smsTplId = smsTplId;
    }

    public SmsChannel withSmsSign(String smsSign) {
        this.smsSign = smsSign;
        return this;
    }

    /**
     * 短信签名。  > 必须与另外三个字段channel_number、sms_tpl_id、sms_app_name相匹配，这些字段信息可以从“云消息服务KooMessage-管理控制台-短信配置-短信模板管理-所属签名”中获取。 
     * @return smsSign
     */
    public String getSmsSign() {
        return smsSign;
    }

    public void setSmsSign(String smsSign) {
        this.smsSign = smsSign;
    }

    public SmsChannel withSmsAppName(String smsAppName) {
        this.smsAppName = smsAppName;
        return this;
    }

    /**
     * 短信应用名称。  > 必须与另外三个字段channel_number、sms_sign、sms_tpl_id相匹配，这些字段信息可以从“云消息服务KooMessage-管理控制台-短信配置-短信模板管理-所属应用”中获取。 
     * @return smsAppName
     */
    public String getSmsAppName() {
        return smsAppName;
    }

    public void setSmsAppName(String smsAppName) {
        this.smsAppName = smsAppName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsChannel smsChannel = (SmsChannel) o;
        return Objects.equals(this.channelNumber, smsChannel.channelNumber)
            && Objects.equals(this.smsTplId, smsChannel.smsTplId) && Objects.equals(this.smsSign, smsChannel.smsSign)
            && Objects.equals(this.smsAppName, smsChannel.smsAppName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelNumber, smsTplId, smsSign, smsAppName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmsChannel {\n");
        sb.append("    channelNumber: ").append(toIndentedString(channelNumber)).append("\n");
        sb.append("    smsTplId: ").append(toIndentedString(smsTplId)).append("\n");
        sb.append("    smsSign: ").append(toIndentedString(smsSign)).append("\n");
        sb.append("    smsAppName: ").append(toIndentedString(smsAppName)).append("\n");
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
