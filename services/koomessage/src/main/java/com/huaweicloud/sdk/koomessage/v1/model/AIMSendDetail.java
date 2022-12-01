package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 短信发送明细。
 */
public class AIMSendDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg_id")

    private String msgId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_id")

    private String tplId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_name")

    private String tplName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cust_flag")

    private String custFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_account")

    private String sendAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_status")

    private String sendStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_time")

    private String sendTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receive_time")

    private String receiveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_code")

    private String resultCode;

    public AIMSendDetail withMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }

    /**
     * 发送明细的唯一标识ID。
     * @return msgId
     */
    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public AIMSendDetail withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public AIMSendDetail withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名称。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public AIMSendDetail withTplId(String tplId) {
        this.tplId = tplId;
        return this;
    }

    /**
     * 智能信息模板ID。
     * @return tplId
     */
    public String getTplId() {
        return tplId;
    }

    public void setTplId(String tplId) {
        this.tplId = tplId;
    }

    public AIMSendDetail withTplName(String tplName) {
        this.tplName = tplName;
        return this;
    }

    /**
     * 智能信息模板名称。
     * @return tplName
     */
    public String getTplName() {
        return tplName;
    }

    public void setTplName(String tplName) {
        this.tplName = tplName;
    }

    public AIMSendDetail withCustFlag(String custFlag) {
        this.custFlag = custFlag;
        return this;
    }

    /**
     * 创建解析任务时填写用户唯一标识，手机号码或者任何的唯一标识，唯一标识不超过64个字符。发送智能信息时则必须填客户的手机号码。此处为手机号。样例为：130****0001。
     * @return custFlag
     */
    public String getCustFlag() {
        return custFlag;
    }

    public void setCustFlag(String custFlag) {
        this.custFlag = custFlag;
    }

    public AIMSendDetail withSendAccount(String sendAccount) {
        this.sendAccount = sendAccount;
        return this;
    }

    /**
     * 发送的目标手机号。
     * @return sendAccount
     */
    public String getSendAccount() {
        return sendAccount;
    }

    public void setSendAccount(String sendAccount) {
        this.sendAccount = sendAccount;
    }

    public AIMSendDetail withSendStatus(String sendStatus) {
        this.sendStatus = sendStatus;
        return this;
    }

    /**
     * 发送状态。 - success：发送成功  - fail：发送失败  - sending：发送中 
     * @return sendStatus
     */
    public String getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus;
    }

    public AIMSendDetail withSendTime(String sendTime) {
        this.sendTime = sendTime;
        return this;
    }

    /**
     * 发送时间。
     * @return sendTime
     */
    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public AIMSendDetail withReceiveTime(String receiveTime) {
        this.receiveTime = receiveTime;
        return this;
    }

    /**
     * 接收时间。
     * @return receiveTime
     */
    public String getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(String receiveTime) {
        this.receiveTime = receiveTime;
    }

    public AIMSendDetail withResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    /**
     * 发送错误码。
     * @return resultCode
     */
    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AIMSendDetail aiMSendDetail = (AIMSendDetail) o;
        return Objects.equals(this.msgId, aiMSendDetail.msgId) && Objects.equals(this.taskId, aiMSendDetail.taskId)
            && Objects.equals(this.taskName, aiMSendDetail.taskName) && Objects.equals(this.tplId, aiMSendDetail.tplId)
            && Objects.equals(this.tplName, aiMSendDetail.tplName)
            && Objects.equals(this.custFlag, aiMSendDetail.custFlag)
            && Objects.equals(this.sendAccount, aiMSendDetail.sendAccount)
            && Objects.equals(this.sendStatus, aiMSendDetail.sendStatus)
            && Objects.equals(this.sendTime, aiMSendDetail.sendTime)
            && Objects.equals(this.receiveTime, aiMSendDetail.receiveTime)
            && Objects.equals(this.resultCode, aiMSendDetail.resultCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(msgId,
            taskId,
            taskName,
            tplId,
            tplName,
            custFlag,
            sendAccount,
            sendStatus,
            sendTime,
            receiveTime,
            resultCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AIMSendDetail {\n");
        sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    tplId: ").append(toIndentedString(tplId)).append("\n");
        sb.append("    tplName: ").append(toIndentedString(tplName)).append("\n");
        sb.append("    custFlag: ").append(toIndentedString(custFlag)).append("\n");
        sb.append("    sendAccount: ").append(toIndentedString(sendAccount)).append("\n");
        sb.append("    sendStatus: ").append(toIndentedString(sendStatus)).append("\n");
        sb.append("    sendTime: ").append(toIndentedString(sendTime)).append("\n");
        sb.append("    receiveTime: ").append(toIndentedString(receiveTime)).append("\n");
        sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
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
