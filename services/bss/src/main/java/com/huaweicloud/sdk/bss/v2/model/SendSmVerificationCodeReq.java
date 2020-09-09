package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.TemplateArgs;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SendSmVerificationCodeReq
 */
public class SendSmVerificationCodeReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="language")
    
    private String language;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mobile_phone")
    
    private String mobilePhone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sm_template_args")
    
    private List<TemplateArgs> smTemplateArgs = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timeout")
    
    private Integer timeout = 10;

    public SendSmVerificationCodeReq withLanguage(String language) {
        this.language = language;
        return this;
    }

    


    /**
     * |参数名称：发送的短信的语言zh-cn: 中文en-us: 英语| |参数约束及描述：发送的短信的语言zh-cn: 中文en-us: 英语|
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public SendSmVerificationCodeReq withMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    


    /**
     * |参数名称：手机号| |参数约束及描述：手机号|
     * @return mobilePhone
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public SendSmVerificationCodeReq withSmTemplateArgs(List<TemplateArgs> smTemplateArgs) {
        this.smTemplateArgs = smTemplateArgs;
        return this;
    }

    
    public SendSmVerificationCodeReq addSmTemplateArgsItem(TemplateArgs smTemplateArgsItem) {
        if (this.smTemplateArgs == null) {
            this.smTemplateArgs = new ArrayList<>();
        }
        this.smTemplateArgs.add(smTemplateArgsItem);
        return this;
    }

    public SendSmVerificationCodeReq withSmTemplateArgs(Consumer<List<TemplateArgs>> smTemplateArgsSetter) {
        if(this.smTemplateArgs == null ){
            this.smTemplateArgs = new ArrayList<>();
        }
        smTemplateArgsSetter.accept(this.smTemplateArgs);
        return this;
    }

    /**
     * |参数名称：短信模板参数| |参数约束以及描述：短信模板参数|
     * @return smTemplateArgs
     */
    public List<TemplateArgs> getSmTemplateArgs() {
        return smTemplateArgs;
    }

    public void setSmTemplateArgs(List<TemplateArgs> smTemplateArgs) {
        this.smTemplateArgs = smTemplateArgs;
    }

    public SendSmVerificationCodeReq withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    


    /**
     * |参数名称：超时时间，单位是分钟| |参数的约束及描述：超时时间，单位是分钟，短信传递10，邮箱传递60|
     * minimum: 0
     * maximum: 100
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
        SendSmVerificationCodeReq sendSmVerificationCodeReq = (SendSmVerificationCodeReq) o;
        return Objects.equals(this.language, sendSmVerificationCodeReq.language) &&
            Objects.equals(this.mobilePhone, sendSmVerificationCodeReq.mobilePhone) &&
            Objects.equals(this.smTemplateArgs, sendSmVerificationCodeReq.smTemplateArgs) &&
            Objects.equals(this.timeout, sendSmVerificationCodeReq.timeout);
    }
    @Override
    public int hashCode() {
        return Objects.hash(language, mobilePhone, smTemplateArgs, timeout);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendSmVerificationCodeReq {\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
        sb.append("    smTemplateArgs: ").append(toIndentedString(smTemplateArgs)).append("\n");
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

