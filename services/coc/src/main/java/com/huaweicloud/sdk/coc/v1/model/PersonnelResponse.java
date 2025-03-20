package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 人员信息
 */
public class PersonnelResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_root_user")

    private Boolean isRootUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dingtalk_webhook")

    private String dingtalkWebhook;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mobile")

    private String mobile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wecom_webhook")

    private String wecomWebhook;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dingtalk_private_key")

    private String dingtalkPrivateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg_subscription_status")

    private Integer msgSubscriptionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weichat_subscription_status")

    private Integer weichatSubscriptionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ding_talk_subscription_status")

    private Integer dingTalkSubscriptionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email_subscription_status")

    private Integer emailSubscriptionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "call_notify_subscription_status")

    private Integer callNotifySubscriptionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private String sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_status")

    private String sourceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lark_webhook")

    private String larkWebhook;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lark_subscription_status")

    private Integer larkSubscriptionStatus;

    public PersonnelResponse withIsRootUser(Boolean isRootUser) {
        this.isRootUser = isRootUser;
        return this;
    }

    /**
     * 该用户是否是根用户
     * @return isRootUser
     */
    public Boolean getIsRootUser() {
        return isRootUser;
    }

    public void setIsRootUser(Boolean isRootUser) {
        this.isRootUser = isRootUser;
    }

    public PersonnelResponse withDingtalkWebhook(String dingtalkWebhook) {
        this.dingtalkWebhook = dingtalkWebhook;
        return this;
    }

    /**
     * 钉钉回调
     * @return dingtalkWebhook
     */
    public String getDingtalkWebhook() {
        return dingtalkWebhook;
    }

    public void setDingtalkWebhook(String dingtalkWebhook) {
        this.dingtalkWebhook = dingtalkWebhook;
    }

    public PersonnelResponse withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 邮箱
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PersonnelResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 用户id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PersonnelResponse withMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    /**
     * 手机
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public PersonnelResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用户名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonnelResponse withWecomWebhook(String wecomWebhook) {
        this.wecomWebhook = wecomWebhook;
        return this;
    }

    /**
     * 企业微信回调
     * @return wecomWebhook
     */
    public String getWecomWebhook() {
        return wecomWebhook;
    }

    public void setWecomWebhook(String wecomWebhook) {
        this.wecomWebhook = wecomWebhook;
    }

    public PersonnelResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PersonnelResponse withDingtalkPrivateKey(String dingtalkPrivateKey) {
        this.dingtalkPrivateKey = dingtalkPrivateKey;
        return this;
    }

    /**
     * 钉钉秘钥
     * @return dingtalkPrivateKey
     */
    public String getDingtalkPrivateKey() {
        return dingtalkPrivateKey;
    }

    public void setDingtalkPrivateKey(String dingtalkPrivateKey) {
        this.dingtalkPrivateKey = dingtalkPrivateKey;
    }

    public PersonnelResponse withMsgSubscriptionStatus(Integer msgSubscriptionStatus) {
        this.msgSubscriptionStatus = msgSubscriptionStatus;
        return this;
    }

    /**
     * 短信订阅状态
     * @return msgSubscriptionStatus
     */
    public Integer getMsgSubscriptionStatus() {
        return msgSubscriptionStatus;
    }

    public void setMsgSubscriptionStatus(Integer msgSubscriptionStatus) {
        this.msgSubscriptionStatus = msgSubscriptionStatus;
    }

    public PersonnelResponse withWeichatSubscriptionStatus(Integer weichatSubscriptionStatus) {
        this.weichatSubscriptionStatus = weichatSubscriptionStatus;
        return this;
    }

    /**
     * 企业微信订阅状态
     * @return weichatSubscriptionStatus
     */
    public Integer getWeichatSubscriptionStatus() {
        return weichatSubscriptionStatus;
    }

    public void setWeichatSubscriptionStatus(Integer weichatSubscriptionStatus) {
        this.weichatSubscriptionStatus = weichatSubscriptionStatus;
    }

    public PersonnelResponse withDingTalkSubscriptionStatus(Integer dingTalkSubscriptionStatus) {
        this.dingTalkSubscriptionStatus = dingTalkSubscriptionStatus;
        return this;
    }

    /**
     * 钉钉订阅状态
     * @return dingTalkSubscriptionStatus
     */
    public Integer getDingTalkSubscriptionStatus() {
        return dingTalkSubscriptionStatus;
    }

    public void setDingTalkSubscriptionStatus(Integer dingTalkSubscriptionStatus) {
        this.dingTalkSubscriptionStatus = dingTalkSubscriptionStatus;
    }

    public PersonnelResponse withEmailSubscriptionStatus(Integer emailSubscriptionStatus) {
        this.emailSubscriptionStatus = emailSubscriptionStatus;
        return this;
    }

    /**
     * 邮箱订阅
     * @return emailSubscriptionStatus
     */
    public Integer getEmailSubscriptionStatus() {
        return emailSubscriptionStatus;
    }

    public void setEmailSubscriptionStatus(Integer emailSubscriptionStatus) {
        this.emailSubscriptionStatus = emailSubscriptionStatus;
    }

    public PersonnelResponse withCallNotifySubscriptionStatus(Integer callNotifySubscriptionStatus) {
        this.callNotifySubscriptionStatus = callNotifySubscriptionStatus;
        return this;
    }

    /**
     * 语音订阅状态
     * @return callNotifySubscriptionStatus
     */
    public Integer getCallNotifySubscriptionStatus() {
        return callNotifySubscriptionStatus;
    }

    public void setCallNotifySubscriptionStatus(Integer callNotifySubscriptionStatus) {
        this.callNotifySubscriptionStatus = callNotifySubscriptionStatus;
    }

    public PersonnelResponse withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 账号来源类型
     * @return sourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public PersonnelResponse withSourceStatus(String sourceStatus) {
        this.sourceStatus = sourceStatus;
        return this;
    }

    /**
     * 账号状态
     * @return sourceStatus
     */
    public String getSourceStatus() {
        return sourceStatus;
    }

    public void setSourceStatus(String sourceStatus) {
        this.sourceStatus = sourceStatus;
    }

    public PersonnelResponse withLarkWebhook(String larkWebhook) {
        this.larkWebhook = larkWebhook;
        return this;
    }

    /**
     * 飞书回调
     * @return larkWebhook
     */
    public String getLarkWebhook() {
        return larkWebhook;
    }

    public void setLarkWebhook(String larkWebhook) {
        this.larkWebhook = larkWebhook;
    }

    public PersonnelResponse withLarkSubscriptionStatus(Integer larkSubscriptionStatus) {
        this.larkSubscriptionStatus = larkSubscriptionStatus;
        return this;
    }

    /**
     * 飞书订阅状态
     * @return larkSubscriptionStatus
     */
    public Integer getLarkSubscriptionStatus() {
        return larkSubscriptionStatus;
    }

    public void setLarkSubscriptionStatus(Integer larkSubscriptionStatus) {
        this.larkSubscriptionStatus = larkSubscriptionStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PersonnelResponse that = (PersonnelResponse) obj;
        return Objects.equals(this.isRootUser, that.isRootUser)
            && Objects.equals(this.dingtalkWebhook, that.dingtalkWebhook) && Objects.equals(this.email, that.email)
            && Objects.equals(this.id, that.id) && Objects.equals(this.mobile, that.mobile)
            && Objects.equals(this.name, that.name) && Objects.equals(this.wecomWebhook, that.wecomWebhook)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.dingtalkPrivateKey, that.dingtalkPrivateKey)
            && Objects.equals(this.msgSubscriptionStatus, that.msgSubscriptionStatus)
            && Objects.equals(this.weichatSubscriptionStatus, that.weichatSubscriptionStatus)
            && Objects.equals(this.dingTalkSubscriptionStatus, that.dingTalkSubscriptionStatus)
            && Objects.equals(this.emailSubscriptionStatus, that.emailSubscriptionStatus)
            && Objects.equals(this.callNotifySubscriptionStatus, that.callNotifySubscriptionStatus)
            && Objects.equals(this.sourceType, that.sourceType) && Objects.equals(this.sourceStatus, that.sourceStatus)
            && Objects.equals(this.larkWebhook, that.larkWebhook)
            && Objects.equals(this.larkSubscriptionStatus, that.larkSubscriptionStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isRootUser,
            dingtalkWebhook,
            email,
            id,
            mobile,
            name,
            wecomWebhook,
            description,
            dingtalkPrivateKey,
            msgSubscriptionStatus,
            weichatSubscriptionStatus,
            dingTalkSubscriptionStatus,
            emailSubscriptionStatus,
            callNotifySubscriptionStatus,
            sourceType,
            sourceStatus,
            larkWebhook,
            larkSubscriptionStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersonnelResponse {\n");
        sb.append("    isRootUser: ").append(toIndentedString(isRootUser)).append("\n");
        sb.append("    dingtalkWebhook: ").append(toIndentedString(dingtalkWebhook)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    wecomWebhook: ").append(toIndentedString(wecomWebhook)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dingtalkPrivateKey: ").append(toIndentedString(dingtalkPrivateKey)).append("\n");
        sb.append("    msgSubscriptionStatus: ").append(toIndentedString(msgSubscriptionStatus)).append("\n");
        sb.append("    weichatSubscriptionStatus: ").append(toIndentedString(weichatSubscriptionStatus)).append("\n");
        sb.append("    dingTalkSubscriptionStatus: ").append(toIndentedString(dingTalkSubscriptionStatus)).append("\n");
        sb.append("    emailSubscriptionStatus: ").append(toIndentedString(emailSubscriptionStatus)).append("\n");
        sb.append("    callNotifySubscriptionStatus: ")
            .append(toIndentedString(callNotifySubscriptionStatus))
            .append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    sourceStatus: ").append(toIndentedString(sourceStatus)).append("\n");
        sb.append("    larkWebhook: ").append(toIndentedString(larkWebhook)).append("\n");
        sb.append("    larkSubscriptionStatus: ").append(toIndentedString(larkSubscriptionStatus)).append("\n");
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
