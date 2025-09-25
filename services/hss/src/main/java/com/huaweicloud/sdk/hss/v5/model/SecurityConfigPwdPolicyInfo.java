package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 口令复杂度策略
 */
public class SecurityConfigPwdPolicyInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_length")

    private Boolean minLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uppercase_letter")

    private Boolean uppercaseLetter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lowercase_letter")

    private Boolean lowercaseLetter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private Boolean number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "special_character")

    private Boolean specialCharacter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    private String suggestion;

    public SecurityConfigPwdPolicyInfo withMinLength(Boolean minLength) {
        this.minLength = minLength;
        return this;
    }

    /**
     * **参数解释**： 口令最小长度策略是否满足要求 **取值范围**： - true：满足要求 - false：不满足要求 
     * @return minLength
     */
    public Boolean getMinLength() {
        return minLength;
    }

    public void setMinLength(Boolean minLength) {
        this.minLength = minLength;
    }

    public SecurityConfigPwdPolicyInfo withUppercaseLetter(Boolean uppercaseLetter) {
        this.uppercaseLetter = uppercaseLetter;
        return this;
    }

    /**
     * **参数解释**： 大写字母策略是否满足要求 **取值范围**： - true：满足要求 - false：不满足要求 
     * @return uppercaseLetter
     */
    public Boolean getUppercaseLetter() {
        return uppercaseLetter;
    }

    public void setUppercaseLetter(Boolean uppercaseLetter) {
        this.uppercaseLetter = uppercaseLetter;
    }

    public SecurityConfigPwdPolicyInfo withLowercaseLetter(Boolean lowercaseLetter) {
        this.lowercaseLetter = lowercaseLetter;
        return this;
    }

    /**
     * **参数解释**： 小写字母策略是否满足要求 **取值范围**： - true：满足要求 - false：不满足要求 
     * @return lowercaseLetter
     */
    public Boolean getLowercaseLetter() {
        return lowercaseLetter;
    }

    public void setLowercaseLetter(Boolean lowercaseLetter) {
        this.lowercaseLetter = lowercaseLetter;
    }

    public SecurityConfigPwdPolicyInfo withNumber(Boolean number) {
        this.number = number;
        return this;
    }

    /**
     * **参数解释**： 数字策略是否满足要求 **取值范围**： - true：满足要求 - false：不满足要求不涉及 
     * @return number
     */
    public Boolean getNumber() {
        return number;
    }

    public void setNumber(Boolean number) {
        this.number = number;
    }

    public SecurityConfigPwdPolicyInfo withSpecialCharacter(Boolean specialCharacter) {
        this.specialCharacter = specialCharacter;
        return this;
    }

    /**
     * **参数解释**： 特殊字符策略是否满足要求 **取值范围**： - true：满足要求 - false：不满足要求 
     * @return specialCharacter
     */
    public Boolean getSpecialCharacter() {
        return specialCharacter;
    }

    public void setSpecialCharacter(Boolean specialCharacter) {
        this.specialCharacter = specialCharacter;
    }

    public SecurityConfigPwdPolicyInfo withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * **参数解释**： 修改建议 **取值范围**： 不涉及 
     * @return suggestion
     */
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityConfigPwdPolicyInfo that = (SecurityConfigPwdPolicyInfo) obj;
        return Objects.equals(this.minLength, that.minLength)
            && Objects.equals(this.uppercaseLetter, that.uppercaseLetter)
            && Objects.equals(this.lowercaseLetter, that.lowercaseLetter) && Objects.equals(this.number, that.number)
            && Objects.equals(this.specialCharacter, that.specialCharacter)
            && Objects.equals(this.suggestion, that.suggestion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minLength, uppercaseLetter, lowercaseLetter, number, specialCharacter, suggestion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityConfigPwdPolicyInfo {\n");
        sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
        sb.append("    uppercaseLetter: ").append(toIndentedString(uppercaseLetter)).append("\n");
        sb.append("    lowercaseLetter: ").append(toIndentedString(lowercaseLetter)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    specialCharacter: ").append(toIndentedString(specialCharacter)).append("\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
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
