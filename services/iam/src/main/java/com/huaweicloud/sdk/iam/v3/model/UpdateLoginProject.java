package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class UpdateLoginProject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_method")

    private String verificationMethod;

    public UpdateLoginProject withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /** IAM用户是否开启登录保护，开启为\"true\"，未开启为\"false\"。
     * 
     * @return enabled */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public UpdateLoginProject withVerificationMethod(String verificationMethod) {
        this.verificationMethod = verificationMethod;
        return this;
    }

    /** IAM用户登录验证方式。手机验证为“sms”,邮箱验证为“email”,MFA验证为“vmfa”。
     * 
     * @return verificationMethod */
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
        UpdateLoginProject updateLoginProject = (UpdateLoginProject) o;
        return Objects.equals(this.enabled, updateLoginProject.enabled)
            && Objects.equals(this.verificationMethod, updateLoginProject.verificationMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, verificationMethod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLoginProject {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    verificationMethod: ").append(toIndentedString(verificationMethod)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
