package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 传译员AI数字资产信息
 */
public class InterpreterAiDigitalInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "digitalAccount")

    private String digitalAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "digitalName")

    private String digitalName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "presenterAccount")

    private String presenterAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "presenterRealNameAccount")

    private String presenterRealNameAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "presenterName")

    private String presenterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "presenterUserID")

    private String presenterUserID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "localConfId")

    private String localConfId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "localConfAddr")

    private String localConfAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "localAuthInfo")

    private String localAuthInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "localNeedProxy")

    private Boolean localNeedProxy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "localAuthUrl")

    private String localAuthUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "localAuthAppId")

    private String localAuthAppId;

    public InterpreterAiDigitalInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 数字资产类型：PUBLIC（系统公共）、PRIVATE（企业专用账号绑定）、LOCAL（企业本地通用）。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public InterpreterAiDigitalInfo withDigitalAccount(String digitalAccount) {
        this.digitalAccount = digitalAccount;
        return this;
    }

    /**
     * AI传译员场景下绑定使用的数字资产ID（数字人或TTS音色）。
     * @return digitalAccount
     */
    public String getDigitalAccount() {
        return digitalAccount;
    }

    public void setDigitalAccount(String digitalAccount) {
        this.digitalAccount = digitalAccount;
    }

    public InterpreterAiDigitalInfo withDigitalName(String digitalName) {
        this.digitalName = digitalName;
        return this;
    }

    /**
     * 数字资产名称。
     * @return digitalName
     */
    public String getDigitalName() {
        return digitalName;
    }

    public void setDigitalName(String digitalName) {
        this.digitalName = digitalName;
    }

    public InterpreterAiDigitalInfo withPresenterAccount(String presenterAccount) {
        this.presenterAccount = presenterAccount;
        return this;
    }

    /**
     * 专用数字资产绑定的发言人登录账号，翻译对象非匿名必填。
     * @return presenterAccount
     */
    public String getPresenterAccount() {
        return presenterAccount;
    }

    public void setPresenterAccount(String presenterAccount) {
        this.presenterAccount = presenterAccount;
    }

    public InterpreterAiDigitalInfo withPresenterRealNameAccount(String presenterRealNameAccount) {
        this.presenterRealNameAccount = presenterRealNameAccount;
        return this;
    }

    /**
     * 专用数字资产绑定的发言人登录账号（匿名时），翻译对象匿名必填。
     * @return presenterRealNameAccount
     */
    public String getPresenterRealNameAccount() {
        return presenterRealNameAccount;
    }

    public void setPresenterRealNameAccount(String presenterRealNameAccount) {
        this.presenterRealNameAccount = presenterRealNameAccount;
    }

    public InterpreterAiDigitalInfo withPresenterName(String presenterName) {
        this.presenterName = presenterName;
        return this;
    }

    /**
     * 专用数字资产绑定的发言人名称。
     * @return presenterName
     */
    public String getPresenterName() {
        return presenterName;
    }

    public void setPresenterName(String presenterName) {
        this.presenterName = presenterName;
    }

    public InterpreterAiDigitalInfo withPresenterUserID(String presenterUserID) {
        this.presenterUserID = presenterUserID;
        return this;
    }

    /**
     * 发言人用户的userUUID。
     * @return presenterUserID
     */
    public String getPresenterUserID() {
        return presenterUserID;
    }

    public void setPresenterUserID(String presenterUserID) {
        this.presenterUserID = presenterUserID;
    }

    public InterpreterAiDigitalInfo withLocalConfId(String localConfId) {
        this.localConfId = localConfId;
        return this;
    }

    /**
     * 本地会议的会议id（第三方对接参数），数字资产为LOCAL时必填。
     * @return localConfId
     */
    public String getLocalConfId() {
        return localConfId;
    }

    public void setLocalConfId(String localConfId) {
        this.localConfId = localConfId;
    }

    public InterpreterAiDigitalInfo withLocalConfAddr(String localConfAddr) {
        this.localConfAddr = localConfAddr;
        return this;
    }

    /**
     * 本地会议对接地址或域名。
     * @return localConfAddr
     */
    public String getLocalConfAddr() {
        return localConfAddr;
    }

    public void setLocalConfAddr(String localConfAddr) {
        this.localConfAddr = localConfAddr;
    }

    public InterpreterAiDigitalInfo withLocalAuthInfo(String localAuthInfo) {
        this.localAuthInfo = localAuthInfo;
        return this;
    }

    /**
     * 本地会议对接鉴权信息。
     * @return localAuthInfo
     */
    public String getLocalAuthInfo() {
        return localAuthInfo;
    }

    public void setLocalAuthInfo(String localAuthInfo) {
        this.localAuthInfo = localAuthInfo;
    }

    public InterpreterAiDigitalInfo withLocalNeedProxy(Boolean localNeedProxy) {
        this.localNeedProxy = localNeedProxy;
        return this;
    }

    /**
     * true：需要代理 false：不需要代理。
     * @return localNeedProxy
     */
    public Boolean getLocalNeedProxy() {
        return localNeedProxy;
    }

    public void setLocalNeedProxy(Boolean localNeedProxy) {
        this.localNeedProxy = localNeedProxy;
    }

    public InterpreterAiDigitalInfo withLocalAuthUrl(String localAuthUrl) {
        this.localAuthUrl = localAuthUrl;
        return this;
    }

    /**
     * 本地会议获取动态鉴权信息Url。
     * @return localAuthUrl
     */
    public String getLocalAuthUrl() {
        return localAuthUrl;
    }

    public void setLocalAuthUrl(String localAuthUrl) {
        this.localAuthUrl = localAuthUrl;
    }

    public InterpreterAiDigitalInfo withLocalAuthAppId(String localAuthAppId) {
        this.localAuthAppId = localAuthAppId;
        return this;
    }

    /**
     * 本地会议鉴权AppId。
     * @return localAuthAppId
     */
    public String getLocalAuthAppId() {
        return localAuthAppId;
    }

    public void setLocalAuthAppId(String localAuthAppId) {
        this.localAuthAppId = localAuthAppId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InterpreterAiDigitalInfo that = (InterpreterAiDigitalInfo) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.digitalAccount, that.digitalAccount)
            && Objects.equals(this.digitalName, that.digitalName)
            && Objects.equals(this.presenterAccount, that.presenterAccount)
            && Objects.equals(this.presenterRealNameAccount, that.presenterRealNameAccount)
            && Objects.equals(this.presenterName, that.presenterName)
            && Objects.equals(this.presenterUserID, that.presenterUserID)
            && Objects.equals(this.localConfId, that.localConfId)
            && Objects.equals(this.localConfAddr, that.localConfAddr)
            && Objects.equals(this.localAuthInfo, that.localAuthInfo)
            && Objects.equals(this.localNeedProxy, that.localNeedProxy)
            && Objects.equals(this.localAuthUrl, that.localAuthUrl)
            && Objects.equals(this.localAuthAppId, that.localAuthAppId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            digitalAccount,
            digitalName,
            presenterAccount,
            presenterRealNameAccount,
            presenterName,
            presenterUserID,
            localConfId,
            localConfAddr,
            localAuthInfo,
            localNeedProxy,
            localAuthUrl,
            localAuthAppId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InterpreterAiDigitalInfo {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    digitalAccount: ").append(toIndentedString(digitalAccount)).append("\n");
        sb.append("    digitalName: ").append(toIndentedString(digitalName)).append("\n");
        sb.append("    presenterAccount: ").append(toIndentedString(presenterAccount)).append("\n");
        sb.append("    presenterRealNameAccount: ").append(toIndentedString(presenterRealNameAccount)).append("\n");
        sb.append("    presenterName: ").append(toIndentedString(presenterName)).append("\n");
        sb.append("    presenterUserID: ").append(toIndentedString(presenterUserID)).append("\n");
        sb.append("    localConfId: ").append(toIndentedString(localConfId)).append("\n");
        sb.append("    localConfAddr: ").append(toIndentedString(localConfAddr)).append("\n");
        sb.append("    localAuthInfo: ").append(toIndentedString(localAuthInfo)).append("\n");
        sb.append("    localNeedProxy: ").append(toIndentedString(localNeedProxy)).append("\n");
        sb.append("    localAuthUrl: ").append(toIndentedString(localAuthUrl)).append("\n");
        sb.append("    localAuthAppId: ").append(toIndentedString(localAuthAppId)).append("\n");
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
