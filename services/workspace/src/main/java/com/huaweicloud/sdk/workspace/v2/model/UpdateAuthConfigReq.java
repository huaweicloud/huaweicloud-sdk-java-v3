package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 增量更新认证配置请求。
 */
public class UpdateAuthConfigReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sms_login_enabled")

    private Boolean smsLoginEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_captcha")

    private LoginCaptchaConfig loginCaptcha;

    public UpdateAuthConfigReq withSmsLoginEnabled(Boolean smsLoginEnabled) {
        this.smsLoginEnabled = smsLoginEnabled;
        return this;
    }

    /**
     * 是否开启短信登录。
     * @return smsLoginEnabled
     */
    public Boolean getSmsLoginEnabled() {
        return smsLoginEnabled;
    }

    public void setSmsLoginEnabled(Boolean smsLoginEnabled) {
        this.smsLoginEnabled = smsLoginEnabled;
    }

    public UpdateAuthConfigReq withLoginCaptcha(LoginCaptchaConfig loginCaptcha) {
        this.loginCaptcha = loginCaptcha;
        return this;
    }

    public UpdateAuthConfigReq withLoginCaptcha(Consumer<LoginCaptchaConfig> loginCaptchaSetter) {
        if (this.loginCaptcha == null) {
            this.loginCaptcha = new LoginCaptchaConfig();
            loginCaptchaSetter.accept(this.loginCaptcha);
        }

        return this;
    }

    /**
     * Get loginCaptcha
     * @return loginCaptcha
     */
    public LoginCaptchaConfig getLoginCaptcha() {
        return loginCaptcha;
    }

    public void setLoginCaptcha(LoginCaptchaConfig loginCaptcha) {
        this.loginCaptcha = loginCaptcha;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAuthConfigReq that = (UpdateAuthConfigReq) obj;
        return Objects.equals(this.smsLoginEnabled, that.smsLoginEnabled)
            && Objects.equals(this.loginCaptcha, that.loginCaptcha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(smsLoginEnabled, loginCaptcha);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAuthConfigReq {\n");
        sb.append("    smsLoginEnabled: ").append(toIndentedString(smsLoginEnabled)).append("\n");
        sb.append("    loginCaptcha: ").append(toIndentedString(loginCaptcha)).append("\n");
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
