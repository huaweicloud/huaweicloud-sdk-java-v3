package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class SecurityCompliance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password_regex")

    private String passwordRegex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password_regex_description")

    private String passwordRegexDescription;

    public SecurityCompliance withPasswordRegex(String passwordRegex) {
        this.passwordRegex = passwordRegex;
        return this;
    }

    /**
     * 密码强度策略的正则表达式。
     * @return passwordRegex
     */
    public String getPasswordRegex() {
        return passwordRegex;
    }

    public void setPasswordRegex(String passwordRegex) {
        this.passwordRegex = passwordRegex;
    }

    public SecurityCompliance withPasswordRegexDescription(String passwordRegexDescription) {
        this.passwordRegexDescription = passwordRegexDescription;
        return this;
    }

    /**
     * 密码强度策略的描述。
     * @return passwordRegexDescription
     */
    public String getPasswordRegexDescription() {
        return passwordRegexDescription;
    }

    public void setPasswordRegexDescription(String passwordRegexDescription) {
        this.passwordRegexDescription = passwordRegexDescription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityCompliance that = (SecurityCompliance) obj;
        return Objects.equals(this.passwordRegex, that.passwordRegex)
            && Objects.equals(this.passwordRegexDescription, that.passwordRegexDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passwordRegex, passwordRegexDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityCompliance {\n");
        sb.append("    passwordRegex: ").append(toIndentedString(passwordRegex)).append("\n");
        sb.append("    passwordRegexDescription: ").append(toIndentedString(passwordRegexDescription)).append("\n");
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
