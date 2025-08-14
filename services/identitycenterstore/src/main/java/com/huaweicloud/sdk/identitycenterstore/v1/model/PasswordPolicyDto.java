package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PasswordPolicyDto
 */
public class PasswordPolicyDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minimum_password_length")

    private Integer minimumPasswordLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "require_lowercase_characters")

    private Boolean requireLowercaseCharacters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "require_numbers")

    private Boolean requireNumbers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "require_symbols")

    private Boolean requireSymbols;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "require_uppercase_characters")

    private Boolean requireUppercaseCharacters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_password_age")

    private Integer maxPasswordAge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password_reuse_prevention")

    private Integer passwordReusePrevention;

    public PasswordPolicyDto withMinimumPasswordLength(Integer minimumPasswordLength) {
        this.minimumPasswordLength = minimumPasswordLength;
        return this;
    }

    /**
     * 最小密码长度
     * minimum: 8
     * maximum: 128
     * @return minimumPasswordLength
     */
    public Integer getMinimumPasswordLength() {
        return minimumPasswordLength;
    }

    public void setMinimumPasswordLength(Integer minimumPasswordLength) {
        this.minimumPasswordLength = minimumPasswordLength;
    }

    public PasswordPolicyDto withRequireLowercaseCharacters(Boolean requireLowercaseCharacters) {
        this.requireLowercaseCharacters = requireLowercaseCharacters;
        return this;
    }

    /**
     * 是否要求小写字母
     * @return requireLowercaseCharacters
     */
    public Boolean getRequireLowercaseCharacters() {
        return requireLowercaseCharacters;
    }

    public void setRequireLowercaseCharacters(Boolean requireLowercaseCharacters) {
        this.requireLowercaseCharacters = requireLowercaseCharacters;
    }

    public PasswordPolicyDto withRequireNumbers(Boolean requireNumbers) {
        this.requireNumbers = requireNumbers;
        return this;
    }

    /**
     * 是否要求数字
     * @return requireNumbers
     */
    public Boolean getRequireNumbers() {
        return requireNumbers;
    }

    public void setRequireNumbers(Boolean requireNumbers) {
        this.requireNumbers = requireNumbers;
    }

    public PasswordPolicyDto withRequireSymbols(Boolean requireSymbols) {
        this.requireSymbols = requireSymbols;
        return this;
    }

    /**
     * 是否要求特殊字符
     * @return requireSymbols
     */
    public Boolean getRequireSymbols() {
        return requireSymbols;
    }

    public void setRequireSymbols(Boolean requireSymbols) {
        this.requireSymbols = requireSymbols;
    }

    public PasswordPolicyDto withRequireUppercaseCharacters(Boolean requireUppercaseCharacters) {
        this.requireUppercaseCharacters = requireUppercaseCharacters;
        return this;
    }

    /**
     * 是否要求大写字母
     * @return requireUppercaseCharacters
     */
    public Boolean getRequireUppercaseCharacters() {
        return requireUppercaseCharacters;
    }

    public void setRequireUppercaseCharacters(Boolean requireUppercaseCharacters) {
        this.requireUppercaseCharacters = requireUppercaseCharacters;
    }

    public PasswordPolicyDto withMaxPasswordAge(Integer maxPasswordAge) {
        this.maxPasswordAge = maxPasswordAge;
        return this;
    }

    /**
     * 密码有效期
     * minimum: 1
     * maximum: 1095
     * @return maxPasswordAge
     */
    public Integer getMaxPasswordAge() {
        return maxPasswordAge;
    }

    public void setMaxPasswordAge(Integer maxPasswordAge) {
        this.maxPasswordAge = maxPasswordAge;
    }

    public PasswordPolicyDto withPasswordReusePrevention(Integer passwordReusePrevention) {
        this.passwordReusePrevention = passwordReusePrevention;
        return this;
    }

    /**
     * 密码重复使用次数，默认只支持1
     * minimum: 1
     * maximum: 1
     * @return passwordReusePrevention
     */
    public Integer getPasswordReusePrevention() {
        return passwordReusePrevention;
    }

    public void setPasswordReusePrevention(Integer passwordReusePrevention) {
        this.passwordReusePrevention = passwordReusePrevention;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PasswordPolicyDto that = (PasswordPolicyDto) obj;
        return Objects.equals(this.minimumPasswordLength, that.minimumPasswordLength)
            && Objects.equals(this.requireLowercaseCharacters, that.requireLowercaseCharacters)
            && Objects.equals(this.requireNumbers, that.requireNumbers)
            && Objects.equals(this.requireSymbols, that.requireSymbols)
            && Objects.equals(this.requireUppercaseCharacters, that.requireUppercaseCharacters)
            && Objects.equals(this.maxPasswordAge, that.maxPasswordAge)
            && Objects.equals(this.passwordReusePrevention, that.passwordReusePrevention);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minimumPasswordLength,
            requireLowercaseCharacters,
            requireNumbers,
            requireSymbols,
            requireUppercaseCharacters,
            maxPasswordAge,
            passwordReusePrevention);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PasswordPolicyDto {\n");
        sb.append("    minimumPasswordLength: ").append(toIndentedString(minimumPasswordLength)).append("\n");
        sb.append("    requireLowercaseCharacters: ").append(toIndentedString(requireLowercaseCharacters)).append("\n");
        sb.append("    requireNumbers: ").append(toIndentedString(requireNumbers)).append("\n");
        sb.append("    requireSymbols: ").append(toIndentedString(requireSymbols)).append("\n");
        sb.append("    requireUppercaseCharacters: ").append(toIndentedString(requireUppercaseCharacters)).append("\n");
        sb.append("    maxPasswordAge: ").append(toIndentedString(maxPasswordAge)).append("\n");
        sb.append("    passwordReusePrevention: ").append(toIndentedString(passwordReusePrevention)).append("\n");
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
