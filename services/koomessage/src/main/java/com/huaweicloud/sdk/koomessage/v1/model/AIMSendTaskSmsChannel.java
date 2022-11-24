package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询智能信息发送任务响应体。
 */
public class AIMSendTaskSmsChannel {

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

    public AIMSendTaskSmsChannel withChannelNumber(String channelNumber) {
        this.channelNumber = channelNumber;
        return this;
    }

    /**
     * 短信通道号。  > 预留字段，暂时为空。 
     * @return channelNumber
     */
    public String getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(String channelNumber) {
        this.channelNumber = channelNumber;
    }

    public AIMSendTaskSmsChannel withSmsTplId(String smsTplId) {
        this.smsTplId = smsTplId;
        return this;
    }

    /**
     * 短信模板ID。
     * @return smsTplId
     */
    public String getSmsTplId() {
        return smsTplId;
    }

    public void setSmsTplId(String smsTplId) {
        this.smsTplId = smsTplId;
    }

    public AIMSendTaskSmsChannel withSmsSign(String smsSign) {
        this.smsSign = smsSign;
        return this;
    }

    /**
     * 短信签名。
     * @return smsSign
     */
    public String getSmsSign() {
        return smsSign;
    }

    public void setSmsSign(String smsSign) {
        this.smsSign = smsSign;
    }

    public AIMSendTaskSmsChannel withSmsAppName(String smsAppName) {
        this.smsAppName = smsAppName;
        return this;
    }

    /**
     * 短信应用名称。  > 预留字段，暂时为空。 
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
        AIMSendTaskSmsChannel aiMSendTaskSmsChannel = (AIMSendTaskSmsChannel) o;
        return Objects.equals(this.channelNumber, aiMSendTaskSmsChannel.channelNumber)
            && Objects.equals(this.smsTplId, aiMSendTaskSmsChannel.smsTplId)
            && Objects.equals(this.smsSign, aiMSendTaskSmsChannel.smsSign)
            && Objects.equals(this.smsAppName, aiMSendTaskSmsChannel.smsAppName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelNumber, smsTplId, smsSign, smsAppName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AIMSendTaskSmsChannel {\n");
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
