package com.huaweicloud.sdk.bssintl.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SendVerificationCodeV2Req
 */
public class SendVerificationCodeV2Req  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="email")
    
    private String email;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lang")
    
    private String lang;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="receiver_type")
    
    private Integer receiverType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scene")
    
    private Integer scene = 29;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timeout")
    
    private Integer timeout;

    public SendVerificationCodeV2Req withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    


    /**
     * |参数名称：客户ID，如果scene=18的时候必填。| |参数约束及描述：客户ID，如果scene=18的时候必填。|
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public SendVerificationCodeV2Req withEmail(String email) {
        this.email = email;
        return this;
    }

    


    /**
     * |参数名称：指定发送邮箱地址。| |参数约束及描述：指定发送邮箱地址。|
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SendVerificationCodeV2Req withLang(String lang) {
        this.lang = lang;
        return this;
    }

    


    /**
     * |参数名称：根据语言如果查询不到对应模板信息，就取系统默认语言对应的模板信息。zh-cn：中文；en-us：英文。| |参数约束及描述：根据语言如果查询不到对应模板信息，就取系统默认语言对应的模板信息。zh-cn：中文；en-us：英文。|
     * @return lang
     */
    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public SendVerificationCodeV2Req withReceiverType(Integer receiverType) {
        this.receiverType = receiverType;
        return this;
    }

    


    /**
     * |参数名称：发送类型：1：发送短信验证码。2：发送邮件验证码。| |参数的约束及描述：发送类型：1：发送短信验证码。2：发送邮件验证码。|
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

    public SendVerificationCodeV2Req withScene(Integer scene) {
        this.scene = scene;
        return this;
    }

    


    /**
     * |参数名称：场景| |参数的约束及描述：该参数非必填，29：注册；18：实名认证个人银行卡认证；不填写默认为29|
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

    public SendVerificationCodeV2Req withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    


    /**
     * |参数名称：验证码超时时间。如果不填的话，采用系统默认超时时间5分钟。单位：分钟| |参数的约束及描述：验证码超时时间。如果不填的话，采用系统默认超时时间5分钟。单位：分钟|
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SendVerificationCodeV2Req sendVerificationCodeV2Req = (SendVerificationCodeV2Req) o;
        return Objects.equals(this.customerId, sendVerificationCodeV2Req.customerId) &&
            Objects.equals(this.email, sendVerificationCodeV2Req.email) &&
            Objects.equals(this.lang, sendVerificationCodeV2Req.lang) &&
            Objects.equals(this.receiverType, sendVerificationCodeV2Req.receiverType) &&
            Objects.equals(this.scene, sendVerificationCodeV2Req.scene) &&
            Objects.equals(this.timeout, sendVerificationCodeV2Req.timeout);
    }
    @Override
    public int hashCode() {
        return Objects.hash(customerId, email, lang, receiverType, scene, timeout);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendVerificationCodeV2Req {\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
        sb.append("    receiverType: ").append(toIndentedString(receiverType)).append("\n");
        sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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

