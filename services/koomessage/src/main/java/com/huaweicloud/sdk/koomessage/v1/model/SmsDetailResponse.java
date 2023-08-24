package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SmsDetailResponse
 */
public class SmsDetailResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private String to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_num")

    private String channelNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg_id")

    private String msgId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_status")

    private String sendStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    public SmsDetailResponse withTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * 短信接收方的号码。
     * @return to
     */
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public SmsDetailResponse withChannelNum(String channelNum) {
        this.channelNum = channelNum;
        return this;
    }

    /**
     * 短信发送方的号码。
     * @return channelNum
     */
    public String getChannelNum() {
        return channelNum;
    }

    public void setChannelNum(String channelNum) {
        this.channelNum = channelNum;
    }

    public SmsDetailResponse withMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }

    /**
     * 短信的唯一标识。
     * @return msgId
     */
    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public SmsDetailResponse withSendStatus(String sendStatus) {
        this.sendStatus = sendStatus;
        return this;
    }

    /**
     * 短信状态码。  以下举例状态码及其说明，具体处理建议请参考[API错误码](https://support.huaweicloud.com/api-msgsms/sms_05_0050.html)。  - 000000：短信平台处理请求成功 - E200015：待发送短信数量太大 - E200028：模板变量校验失败 - E200029：模板类型校验失败 - E200030：模板未激活 - E200031：协议校验失败 - E200033：模板类型不正确 - E200041：同一短信内容接收号码重复
     * @return sendStatus
     */
    public String getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus;
    }

    public SmsDetailResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 短信资源的创建时间。  即短信平台接收到用户发送短信请求的时间，为UTC时间。 格式为：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmsDetailResponse that = (SmsDetailResponse) obj;
        return Objects.equals(this.to, that.to) && Objects.equals(this.channelNum, that.channelNum)
            && Objects.equals(this.msgId, that.msgId) && Objects.equals(this.sendStatus, that.sendStatus)
            && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(to, channelNum, msgId, sendStatus, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmsDetailResponse {\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    channelNum: ").append(toIndentedString(channelNum)).append("\n");
        sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
        sb.append("    sendStatus: ").append(toIndentedString(sendStatus)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
