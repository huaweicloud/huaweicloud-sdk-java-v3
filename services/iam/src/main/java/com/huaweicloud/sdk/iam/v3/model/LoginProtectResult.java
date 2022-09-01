package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 
 */
public class LoginProtectResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    @JacksonXmlProperty(localName = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    @JacksonXmlProperty(localName = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_method")

    @JacksonXmlProperty(localName = "verification_method")

    private String verificationMethod;

    public LoginProtectResult withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * IAM用户是否开启登录保护，开启为\"true\"，未开启为\"false\"。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public LoginProtectResult withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * IAM用户ID。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LoginProtectResult withVerificationMethod(String verificationMethod) {
        this.verificationMethod = verificationMethod;
        return this;
    }

    /**
     * IAM用户登录验证方式。
     * @return verificationMethod
     */
    public String getVerificationMethod() {
        return verificationMethod;
    }

    public void setVerificationMethod(String verificationMethod) {
        this.verificationMethod = verificationMethod;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoginProtectResult loginProtectResult = (LoginProtectResult) o;
        return Objects.equals(this.enabled, loginProtectResult.enabled)
            && Objects.equals(this.userId, loginProtectResult.userId)
            && Objects.equals(this.verificationMethod, loginProtectResult.verificationMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, userId, verificationMethod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoginProtectResult {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    verificationMethod: ").append(toIndentedString(verificationMethod)).append("\n");
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
