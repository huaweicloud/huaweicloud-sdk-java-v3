package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 滑块验证码相关配置。
 */
public class LoginCaptchaConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_threshold")

    private Integer triggerThreshold;

    public LoginCaptchaConfig withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否开启滑块验证码。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public LoginCaptchaConfig withTriggerThreshold(Integer triggerThreshold) {
        this.triggerThreshold = triggerThreshold;
        return this;
    }

    /**
     * 用户登录失败 trigger_threshold 次后开始要求验证码认证。验证码不启用时无意义，启用时若不传默认为 3。
     * @return triggerThreshold
     */
    public Integer getTriggerThreshold() {
        return triggerThreshold;
    }

    public void setTriggerThreshold(Integer triggerThreshold) {
        this.triggerThreshold = triggerThreshold;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LoginCaptchaConfig that = (LoginCaptchaConfig) obj;
        return Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.triggerThreshold, that.triggerThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, triggerThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoginCaptchaConfig {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    triggerThreshold: ").append(toIndentedString(triggerThreshold)).append("\n");
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
