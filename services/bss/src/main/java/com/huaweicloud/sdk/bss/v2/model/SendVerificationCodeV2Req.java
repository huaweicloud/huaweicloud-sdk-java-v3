package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SendVerificationCodeV2Req
 */
public class SendVerificationCodeV2Req {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receiver_type")

    private Integer receiverType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mobile_phone")

    private String mobilePhone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lang")

    private String lang;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene")

    private Integer scene;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    private String customerId;

    public SendVerificationCodeV2Req withReceiverType(Integer receiverType) {
        this.receiverType = receiverType;
        return this;
    }

    /**
     * 发送验证码的类型： 1：发送短信验证码
     * minimum: 1
     * maximum: 2
     * @return receiverType
     */
    public Integer getReceiverType() {
        return receiverType;
    }

    public void setReceiverType(Integer receiverType) {
        this.receiverType = receiverType;
    }

    public SendVerificationCodeV2Req withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 发送验证码的超时时间。 此参数不携带或携带值为null时，采用系统默认超时时间10分钟。 此参数值超过60时，取默认值5分钟。 单位：分钟。
     * minimum: 1
     * maximum: 2147483647
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public SendVerificationCodeV2Req withMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    /**
     * 指定发送验证码的手机号。 目前系统只支持中国手机号。 示例：13XXXXXXXXX
     * @return mobilePhone
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public SendVerificationCodeV2Req withLang(String lang) {
        this.lang = lang;
        return this;
    }

    /**
     * 根据该参数的取值选择发送短信验证码的语言。此参数默认值为“zh-cn：中文”。 zh-cn：中文en-us：英文
     * @return lang
     */
    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public SendVerificationCodeV2Req withScene(Integer scene) {
        this.scene = scene;
        return this;
    }

    /**
     * 验证码使用的场景，目前支持如下场景： 29：注册场景18：个人银行卡实名认证场景 此参数不携带或携带值为null时，默认值为“29：注册场景”。
     * minimum: 18
     * maximum: 29
     * @return scene
     */
    public Integer getScene() {
        return scene;
    }

    public void setScene(Integer scene) {
        this.scene = scene;
    }

    public SendVerificationCodeV2Req withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * 客户账号ID。您可以调用[查询客户列表](https://support.huaweicloud.com/api-bpconsole/mc_00021.html)接口获取customer_id。 当scene=18时此参数必填；除此之外此参数非必填，不携带或携带值为null时均不做处理。
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SendVerificationCodeV2Req sendVerificationCodeV2Req = (SendVerificationCodeV2Req) o;
        return Objects.equals(this.receiverType, sendVerificationCodeV2Req.receiverType)
            && Objects.equals(this.timeout, sendVerificationCodeV2Req.timeout)
            && Objects.equals(this.mobilePhone, sendVerificationCodeV2Req.mobilePhone)
            && Objects.equals(this.lang, sendVerificationCodeV2Req.lang)
            && Objects.equals(this.scene, sendVerificationCodeV2Req.scene)
            && Objects.equals(this.customerId, sendVerificationCodeV2Req.customerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(receiverType, timeout, mobilePhone, lang, scene, customerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendVerificationCodeV2Req {\n");
        sb.append("    receiverType: ").append(toIndentedString(receiverType)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
        sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
        sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
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
