package com.huaweicloud.sdk.voicecall.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CallVerifyReq
 */
public class CallVerifyReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "displayNbr")

    private String displayNbr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "calleeNbr")

    private String calleeNbr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "languageType")

    private Integer languageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preTone")

    private String preTone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verifyCode")

    private String verifyCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "posTone")

    private String posTone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "times")

    private Integer times;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statusUrl")

    private String statusUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feeUrl")

    private String feeUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "returnIdlePort")

    private String returnIdlePort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userData")

    private String userData;

    public CallVerifyReq withDisplayNbr(String displayNbr) {
        this.displayNbr = displayNbr;
        return this;
    }

    /**
     * 固话号码，被叫终端上显示的主叫号码，需要提前在订购号码页面申请该号码。
     * @return displayNbr
     */
    public String getDisplayNbr() {
        return displayNbr;
    }

    public void setDisplayNbr(String displayNbr) {
        this.displayNbr = displayNbr;
    }

    public CallVerifyReq withCalleeNbr(String calleeNbr) {
        this.calleeNbr = calleeNbr;
        return this;
    }

    /**
     * 被叫号码。
     * @return calleeNbr
     */
    public String getCalleeNbr() {
        return calleeNbr;
    }

    public void setCalleeNbr(String calleeNbr) {
        this.calleeNbr = calleeNbr;
    }

    public CallVerifyReq withLanguageType(Integer languageType) {
        this.languageType = languageType;
        return this;
    }

    /**
     * 验证码播放的语言类型。
     * @return languageType
     */
    public Integer getLanguageType() {
        return languageType;
    }

    public void setLanguageType(Integer languageType) {
        this.languageType = languageType;
    }

    public CallVerifyReq withPreTone(String preTone) {
        this.preTone = preTone;
        return this;
    }

    /**
     * 播放语音验证码之前需要播放的放音文件名，放音文件需要提前通过放音文件管理页面上传并审核通过才能使用。
     * @return preTone
     */
    public String getPreTone() {
        return preTone;
    }

    public void setPreTone(String preTone) {
        this.preTone = preTone;
    }

    public CallVerifyReq withVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }

    /**
     * 验证码：只支持0～9的数字，最大8位
     * @return verifyCode
     */
    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public CallVerifyReq withPosTone(String posTone) {
        this.posTone = posTone;
        return this;
    }

    /**
     * 播放语音验证码之后需要播放的放音文件名。
     * @return posTone
     */
    public String getPosTone() {
        return posTone;
    }

    public void setPosTone(String posTone) {
        this.posTone = posTone;
    }

    public CallVerifyReq withTimes(Integer times) {
        this.times = times;
        return this;
    }

    /**
     * 播放次数：0～9。0表示无限循环
     * minimum: 0
     * maximum: 9
     * @return times
     */
    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public CallVerifyReq withStatusUrl(String statusUrl) {
        this.statusUrl = statusUrl;
        return this;
    }

    /**
     * 此参数请采用BASE64编码进行加密。此字段用于设置SP接收状态上报的URL。
     * @return statusUrl
     */
    public String getStatusUrl() {
        return statusUrl;
    }

    public void setStatusUrl(String statusUrl) {
        this.statusUrl = statusUrl;
    }

    public CallVerifyReq withFeeUrl(String feeUrl) {
        this.feeUrl = feeUrl;
        return this;
    }

    /**
     * 此参数请采用BASE64编码进行加密。此参数用于设置SP接收话单上报的URL。
     * @return feeUrl
     */
    public String getFeeUrl() {
        return feeUrl;
    }

    public void setFeeUrl(String feeUrl) {
        this.feeUrl = feeUrl;
    }

    public CallVerifyReq withReturnIdlePort(String returnIdlePort) {
        this.returnIdlePort = returnIdlePort;
        return this;
    }

    /**
     * 指示是否需要返回空闲端口数量。true：需要返回,false：不需要返回。
     * @return returnIdlePort
     */
    public String getReturnIdlePort() {
        return returnIdlePort;
    }

    public void setReturnIdlePort(String returnIdlePort) {
        this.returnIdlePort = returnIdlePort;
    }

    public CallVerifyReq withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * 用户附属信息，此标识由第三方服务器定义，会在后续的通知消息中携带此信息。
     * @return userData
     */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CallVerifyReq that = (CallVerifyReq) obj;
        return Objects.equals(this.displayNbr, that.displayNbr) && Objects.equals(this.calleeNbr, that.calleeNbr)
            && Objects.equals(this.languageType, that.languageType) && Objects.equals(this.preTone, that.preTone)
            && Objects.equals(this.verifyCode, that.verifyCode) && Objects.equals(this.posTone, that.posTone)
            && Objects.equals(this.times, that.times) && Objects.equals(this.statusUrl, that.statusUrl)
            && Objects.equals(this.feeUrl, that.feeUrl) && Objects.equals(this.returnIdlePort, that.returnIdlePort)
            && Objects.equals(this.userData, that.userData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayNbr,
            calleeNbr,
            languageType,
            preTone,
            verifyCode,
            posTone,
            times,
            statusUrl,
            feeUrl,
            returnIdlePort,
            userData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CallVerifyReq {\n");
        sb.append("    displayNbr: ").append(toIndentedString(displayNbr)).append("\n");
        sb.append("    calleeNbr: ").append(toIndentedString(calleeNbr)).append("\n");
        sb.append("    languageType: ").append(toIndentedString(languageType)).append("\n");
        sb.append("    preTone: ").append(toIndentedString(preTone)).append("\n");
        sb.append("    verifyCode: ").append(toIndentedString(verifyCode)).append("\n");
        sb.append("    posTone: ").append(toIndentedString(posTone)).append("\n");
        sb.append("    times: ").append(toIndentedString(times)).append("\n");
        sb.append("    statusUrl: ").append(toIndentedString(statusUrl)).append("\n");
        sb.append("    feeUrl: ").append(toIndentedString(feeUrl)).append("\n");
        sb.append("    returnIdlePort: ").append(toIndentedString(returnIdlePort)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
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
