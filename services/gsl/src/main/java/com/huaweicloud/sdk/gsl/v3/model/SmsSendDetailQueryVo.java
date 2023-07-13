package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * SmsSendDetailQueryVo
 */
public class SmsSendDetailQueryVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cid")

    private String cid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msisdn")

    private String msisdn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sent_time")

    private OffsetDateTime sentTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "received_time")

    private OffsetDateTime receivedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sms_status")

    private Integer smsStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sms_content")

    private String smsContent;

    public SmsSendDetailQueryVo withCid(String cid) {
        this.cid = cid;
        return this;
    }

    /**
     * 容器ID
     * @return cid
     */
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public SmsSendDetailQueryVo withMsisdn(String msisdn) {
        this.msisdn = msisdn;
        return this;
    }

    /**
     * MSISDN
     * @return msisdn
     */
    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public SmsSendDetailQueryVo withSentTime(OffsetDateTime sentTime) {
        this.sentTime = sentTime;
        return this;
    }

    /**
     * 发送时间
     * @return sentTime
     */
    public OffsetDateTime getSentTime() {
        return sentTime;
    }

    public void setSentTime(OffsetDateTime sentTime) {
        this.sentTime = sentTime;
    }

    public SmsSendDetailQueryVo withReceivedTime(OffsetDateTime receivedTime) {
        this.receivedTime = receivedTime;
        return this;
    }

    /**
     * 接收时间
     * @return receivedTime
     */
    public OffsetDateTime getReceivedTime() {
        return receivedTime;
    }

    public void setReceivedTime(OffsetDateTime receivedTime) {
        this.receivedTime = receivedTime;
    }

    public SmsSendDetailQueryVo withSmsStatus(Integer smsStatus) {
        this.smsStatus = smsStatus;
        return this;
    }

    /**
     * 短信状态:1发送中 2.已送达 3.失败
     * @return smsStatus
     */
    public Integer getSmsStatus() {
        return smsStatus;
    }

    public void setSmsStatus(Integer smsStatus) {
        this.smsStatus = smsStatus;
    }

    public SmsSendDetailQueryVo withSmsContent(String smsContent) {
        this.smsContent = smsContent;
        return this;
    }

    /**
     * 短信内容
     * @return smsContent
     */
    public String getSmsContent() {
        return smsContent;
    }

    public void setSmsContent(String smsContent) {
        this.smsContent = smsContent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmsSendDetailQueryVo that = (SmsSendDetailQueryVo) obj;
        return Objects.equals(this.cid, that.cid) && Objects.equals(this.msisdn, that.msisdn)
            && Objects.equals(this.sentTime, that.sentTime) && Objects.equals(this.receivedTime, that.receivedTime)
            && Objects.equals(this.smsStatus, that.smsStatus) && Objects.equals(this.smsContent, that.smsContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cid, msisdn, sentTime, receivedTime, smsStatus, smsContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmsSendDetailQueryVo {\n");
        sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
        sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
        sb.append("    sentTime: ").append(toIndentedString(sentTime)).append("\n");
        sb.append("    receivedTime: ").append(toIndentedString(receivedTime)).append("\n");
        sb.append("    smsStatus: ").append(toIndentedString(smsStatus)).append("\n");
        sb.append("    smsContent: ").append(toIndentedString(smsContent)).append("\n");
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
