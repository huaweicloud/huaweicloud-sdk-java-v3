package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class ConfigByOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password_regex")

    private String passwordRegex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password_regex_description")

    private String passwordRegexDescription;

    public ConfigByOption withPasswordRegex(String passwordRegex) {
        this.passwordRegex = passwordRegex;
        return this;
    }

    /** 密码强度策略的正则表达式。(当option为password_regex时返回)
     * 
     * @return passwordRegex */
    public String getPasswordRegex() {
        return passwordRegex;
    }

    public void setPasswordRegex(String passwordRegex) {
        this.passwordRegex = passwordRegex;
    }

    public ConfigByOption withPasswordRegexDescription(String passwordRegexDescription) {
        this.passwordRegexDescription = passwordRegexDescription;
        return this;
    }

    /** 密码强度策略的描述。(当option为password_regex_description时返回)
     * 
     * @return passwordRegexDescription */
    public String getPasswordRegexDescription() {
        return passwordRegexDescription;
    }

    public void setPasswordRegexDescription(String passwordRegexDescription) {
        this.passwordRegexDescription = passwordRegexDescription;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfigByOption configByOption = (ConfigByOption) o;
        return Objects.equals(this.passwordRegex, configByOption.passwordRegex)
            && Objects.equals(this.passwordRegexDescription, configByOption.passwordRegexDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passwordRegex, passwordRegexDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigByOption {\n");
        sb.append("    passwordRegex: ").append(toIndentedString(passwordRegex)).append("\n");
        sb.append("    passwordRegexDescription: ").append(toIndentedString(passwordRegexDescription)).append("\n");
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
