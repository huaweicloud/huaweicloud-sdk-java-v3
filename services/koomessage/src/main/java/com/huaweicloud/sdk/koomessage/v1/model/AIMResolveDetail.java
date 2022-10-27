package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 解析详情。
 */
public class AIMResolveDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolve_id")

    private String resolveId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_account")

    private String sendAccount;

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
    @JsonProperty(value = "aim_url")

    private String aimUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_code")

    private String resultCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "generate_date")

    private String generateDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_date")

    private String expireDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolved_time")

    private String resolvedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolved_status")

    private Object resolvedStatus;

    public AIMResolveDetail withResolveId(String resolveId) {
        this.resolveId = resolveId;
        return this;
    }

    /**
     * 解析详情唯一标识ID。
     * @return resolveId
     */
    public String getResolveId() {
        return resolveId;
    }

    public void setResolveId(String resolveId) {
        this.resolveId = resolveId;
    }

    public AIMResolveDetail withTaskId(String taskId) {
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

    public AIMResolveDetail withSendAccount(String sendAccount) {
        this.sendAccount = sendAccount;
        return this;
    }

    /**
     * 发送的用户名。
     * @return sendAccount
     */
    public String getSendAccount() {
        return sendAccount;
    }

    public void setSendAccount(String sendAccount) {
        this.sendAccount = sendAccount;
    }

    public AIMResolveDetail withTplId(String tplId) {
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

    public AIMResolveDetail withTplName(String tplName) {
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

    public AIMResolveDetail withCustFlag(String custFlag) {
        this.custFlag = custFlag;
        return this;
    }

    /**
     * 创建解析任务时填写用户唯一标识，手机号码或者任何的唯一标识，唯一标识不超过64个字符。发送智能信息时则必须填客户的手机号码。此处为手机号。样例为：13000000001。
     * @return custFlag
     */
    public String getCustFlag() {
        return custFlag;
    }

    public void setCustFlag(String custFlag) {
        this.custFlag = custFlag;
    }

    public AIMResolveDetail withAimUrl(String aimUrl) {
        this.aimUrl = aimUrl;
        return this;
    }

    /**
     * 智能信息短链，通过自己的短信渠道发送时，需要把该短链添加到短信模板中，并确保发送短信时的签名与创建短链时的签名保持一致。
     * @return aimUrl
     */
    public String getAimUrl() {
        return aimUrl;
    }

    public void setAimUrl(String aimUrl) {
        this.aimUrl = aimUrl;
    }

    public AIMResolveDetail withResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    /**
     * 短链申请结果返回码。 - 0：成功 - 非0：失败，具体请参见错误码。 
     * @return resultCode
     */
    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public AIMResolveDetail withGenerateDate(String generateDate) {
        this.generateDate = generateDate;
        return this;
    }

    /**
     * 短链生成时间。样例为：2019-10-12T07:20:50Z。
     * @return generateDate
     */
    public String getGenerateDate() {
        return generateDate;
    }

    public void setGenerateDate(String generateDate) {
        this.generateDate = generateDate;
    }

    public AIMResolveDetail withExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }

    /**
     * 短链到期时间。样例为：2019-10-12T07:20:50Z。
     * @return expireDate
     */
    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public AIMResolveDetail withResolvedTime(String resolvedTime) {
        this.resolvedTime = resolvedTime;
        return this;
    }

    /**
     * 解析时间。样例为：2019-10-12T07:20:50Z。
     * @return resolvedTime
     */
    public String getResolvedTime() {
        return resolvedTime;
    }

    public void setResolvedTime(String resolvedTime) {
        this.resolvedTime = resolvedTime;
    }

    public AIMResolveDetail withResolvedStatus(Object resolvedStatus) {
        this.resolvedStatus = resolvedStatus;
        return this;
    }

    /**
     * 解析状态。 - success：解析成功 - fail：解析失败 - unresolved：未解析 
     * @return resolvedStatus
     */
    public Object getResolvedStatus() {
        return resolvedStatus;
    }

    public void setResolvedStatus(Object resolvedStatus) {
        this.resolvedStatus = resolvedStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AIMResolveDetail aiMResolveDetail = (AIMResolveDetail) o;
        return Objects.equals(this.resolveId, aiMResolveDetail.resolveId)
            && Objects.equals(this.taskId, aiMResolveDetail.taskId)
            && Objects.equals(this.sendAccount, aiMResolveDetail.sendAccount)
            && Objects.equals(this.tplId, aiMResolveDetail.tplId)
            && Objects.equals(this.tplName, aiMResolveDetail.tplName)
            && Objects.equals(this.custFlag, aiMResolveDetail.custFlag)
            && Objects.equals(this.aimUrl, aiMResolveDetail.aimUrl)
            && Objects.equals(this.resultCode, aiMResolveDetail.resultCode)
            && Objects.equals(this.generateDate, aiMResolveDetail.generateDate)
            && Objects.equals(this.expireDate, aiMResolveDetail.expireDate)
            && Objects.equals(this.resolvedTime, aiMResolveDetail.resolvedTime)
            && Objects.equals(this.resolvedStatus, aiMResolveDetail.resolvedStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolveId,
            taskId,
            sendAccount,
            tplId,
            tplName,
            custFlag,
            aimUrl,
            resultCode,
            generateDate,
            expireDate,
            resolvedTime,
            resolvedStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AIMResolveDetail {\n");
        sb.append("    resolveId: ").append(toIndentedString(resolveId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    sendAccount: ").append(toIndentedString(sendAccount)).append("\n");
        sb.append("    tplId: ").append(toIndentedString(tplId)).append("\n");
        sb.append("    tplName: ").append(toIndentedString(tplName)).append("\n");
        sb.append("    custFlag: ").append(toIndentedString(custFlag)).append("\n");
        sb.append("    aimUrl: ").append(toIndentedString(aimUrl)).append("\n");
        sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
        sb.append("    generateDate: ").append(toIndentedString(generateDate)).append("\n");
        sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
        sb.append("    resolvedTime: ").append(toIndentedString(resolvedTime)).append("\n");
        sb.append("    resolvedStatus: ").append(toIndentedString(resolvedStatus)).append("\n");
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
