package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 阈值查询结果结构体 */
public class ThresholdData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receiving")

    private Integer receiving;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receivingDefault")

    private Integer receivingDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sending")

    private Integer sending;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sendingDefault")

    private Integer sendingDefault;

    public ThresholdData withReceiving(Integer receiving) {
        this.receiving = receiving;
        return this;
    }

    /** 自定义接收方向阈值，单位为毫秒(ms) minimum: 0 maximum: 10000
     * 
     * @return receiving */
    public Integer getReceiving() {
        return receiving;
    }

    public void setReceiving(Integer receiving) {
        this.receiving = receiving;
    }

    public ThresholdData withReceivingDefault(Integer receivingDefault) {
        this.receivingDefault = receivingDefault;
        return this;
    }

    /** 默认接收方向阈值，单位为毫秒(ms) minimum: 0 maximum: 10000
     * 
     * @return receivingDefault */
    public Integer getReceivingDefault() {
        return receivingDefault;
    }

    public void setReceivingDefault(Integer receivingDefault) {
        this.receivingDefault = receivingDefault;
    }

    public ThresholdData withSending(Integer sending) {
        this.sending = sending;
        return this;
    }

    /** 自定义发送方向阈值，单位为毫秒(ms) minimum: 0 maximum: 10000
     * 
     * @return sending */
    public Integer getSending() {
        return sending;
    }

    public void setSending(Integer sending) {
        this.sending = sending;
    }

    public ThresholdData withSendingDefault(Integer sendingDefault) {
        this.sendingDefault = sendingDefault;
        return this;
    }

    /** 默认发送方向阈值，单位为毫秒(ms) minimum: 0 maximum: 10000
     * 
     * @return sendingDefault */
    public Integer getSendingDefault() {
        return sendingDefault;
    }

    public void setSendingDefault(Integer sendingDefault) {
        this.sendingDefault = sendingDefault;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ThresholdData thresholdData = (ThresholdData) o;
        return Objects.equals(this.receiving, thresholdData.receiving)
            && Objects.equals(this.receivingDefault, thresholdData.receivingDefault)
            && Objects.equals(this.sending, thresholdData.sending)
            && Objects.equals(this.sendingDefault, thresholdData.sendingDefault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(receiving, receivingDefault, sending, sendingDefault);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThresholdData {\n");
        sb.append("    receiving: ").append(toIndentedString(receiving)).append("\n");
        sb.append("    receivingDefault: ").append(toIndentedString(receivingDefault)).append("\n");
        sb.append("    sending: ").append(toIndentedString(sending)).append("\n");
        sb.append("    sendingDefault: ").append(toIndentedString(sendingDefault)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
