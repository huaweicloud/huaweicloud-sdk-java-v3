package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 密码策略。
 */
public class PasswordPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maximum_consecutive_identical_chars")

    private Integer maximumConsecutiveIdenticalChars;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maximum_password_length")

    private Integer maximumPasswordLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minimum_password_age")

    private Integer minimumPasswordAge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minimum_password_length")

    private Integer minimumPasswordLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password_reuse_prevention")

    private Integer passwordReusePrevention;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password_not_username_or_invert")

    private Boolean passwordNotUsernameOrInvert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password_requirements")

    private String passwordRequirements;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password_validity_period")

    private Integer passwordValidityPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password_char_combination")

    private Integer passwordCharCombination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_user_to_change_password")

    private Boolean allowUserToChangePassword;

    public PasswordPolicy withMaximumConsecutiveIdenticalChars(Integer maximumConsecutiveIdenticalChars) {
        this.maximumConsecutiveIdenticalChars = maximumConsecutiveIdenticalChars;
        return this;
    }

    /**
     * 同一字符连续出现的最大次数。
     * @return maximumConsecutiveIdenticalChars
     */
    public Integer getMaximumConsecutiveIdenticalChars() {
        return maximumConsecutiveIdenticalChars;
    }

    public void setMaximumConsecutiveIdenticalChars(Integer maximumConsecutiveIdenticalChars) {
        this.maximumConsecutiveIdenticalChars = maximumConsecutiveIdenticalChars;
    }

    public PasswordPolicy withMaximumPasswordLength(Integer maximumPasswordLength) {
        this.maximumPasswordLength = maximumPasswordLength;
        return this;
    }

    /**
     * 密码最大字符数。
     * @return maximumPasswordLength
     */
    public Integer getMaximumPasswordLength() {
        return maximumPasswordLength;
    }

    public void setMaximumPasswordLength(Integer maximumPasswordLength) {
        this.maximumPasswordLength = maximumPasswordLength;
    }

    public PasswordPolicy withMinimumPasswordAge(Integer minimumPasswordAge) {
        this.minimumPasswordAge = minimumPasswordAge;
        return this;
    }

    /**
     * 密码最短使用时间（分钟）。
     * @return minimumPasswordAge
     */
    public Integer getMinimumPasswordAge() {
        return minimumPasswordAge;
    }

    public void setMinimumPasswordAge(Integer minimumPasswordAge) {
        this.minimumPasswordAge = minimumPasswordAge;
    }

    public PasswordPolicy withMinimumPasswordLength(Integer minimumPasswordLength) {
        this.minimumPasswordLength = minimumPasswordLength;
        return this;
    }

    /**
     * 密码最小字符数。
     * @return minimumPasswordLength
     */
    public Integer getMinimumPasswordLength() {
        return minimumPasswordLength;
    }

    public void setMinimumPasswordLength(Integer minimumPasswordLength) {
        this.minimumPasswordLength = minimumPasswordLength;
    }

    public PasswordPolicy withPasswordReusePrevention(Integer passwordReusePrevention) {
        this.passwordReusePrevention = passwordReusePrevention;
        return this;
    }

    /**
     * 密码不能与历史密码重复次数。
     * @return passwordReusePrevention
     */
    public Integer getPasswordReusePrevention() {
        return passwordReusePrevention;
    }

    public void setPasswordReusePrevention(Integer passwordReusePrevention) {
        this.passwordReusePrevention = passwordReusePrevention;
    }

    public PasswordPolicy withPasswordNotUsernameOrInvert(Boolean passwordNotUsernameOrInvert) {
        this.passwordNotUsernameOrInvert = passwordNotUsernameOrInvert;
        return this;
    }

    /**
     * 密码是否可以是用户名或用户名的反序。
     * @return passwordNotUsernameOrInvert
     */
    public Boolean getPasswordNotUsernameOrInvert() {
        return passwordNotUsernameOrInvert;
    }

    public void setPasswordNotUsernameOrInvert(Boolean passwordNotUsernameOrInvert) {
        this.passwordNotUsernameOrInvert = passwordNotUsernameOrInvert;
    }

    public PasswordPolicy withPasswordRequirements(String passwordRequirements) {
        this.passwordRequirements = passwordRequirements;
        return this;
    }

    /**
     * 设置密码必须包含的字符要求。
     * @return passwordRequirements
     */
    public String getPasswordRequirements() {
        return passwordRequirements;
    }

    public void setPasswordRequirements(String passwordRequirements) {
        this.passwordRequirements = passwordRequirements;
    }

    public PasswordPolicy withPasswordValidityPeriod(Integer passwordValidityPeriod) {
        this.passwordValidityPeriod = passwordValidityPeriod;
        return this;
    }

    /**
     * 密码有效期（天）。
     * @return passwordValidityPeriod
     */
    public Integer getPasswordValidityPeriod() {
        return passwordValidityPeriod;
    }

    public void setPasswordValidityPeriod(Integer passwordValidityPeriod) {
        this.passwordValidityPeriod = passwordValidityPeriod;
    }

    public PasswordPolicy withPasswordCharCombination(Integer passwordCharCombination) {
        this.passwordCharCombination = passwordCharCombination;
        return this;
    }

    /**
     * 至少包含字符种类的个数。
     * @return passwordCharCombination
     */
    public Integer getPasswordCharCombination() {
        return passwordCharCombination;
    }

    public void setPasswordCharCombination(Integer passwordCharCombination) {
        this.passwordCharCombination = passwordCharCombination;
    }

    public PasswordPolicy withAllowUserToChangePassword(Boolean allowUserToChangePassword) {
        this.allowUserToChangePassword = allowUserToChangePassword;
        return this;
    }

    /**
     * 是否允许IAM用户修改自己的密码，不适用于根用户。
     * @return allowUserToChangePassword
     */
    public Boolean getAllowUserToChangePassword() {
        return allowUserToChangePassword;
    }

    public void setAllowUserToChangePassword(Boolean allowUserToChangePassword) {
        this.allowUserToChangePassword = allowUserToChangePassword;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PasswordPolicy that = (PasswordPolicy) obj;
        return Objects.equals(this.maximumConsecutiveIdenticalChars, that.maximumConsecutiveIdenticalChars)
            && Objects.equals(this.maximumPasswordLength, that.maximumPasswordLength)
            && Objects.equals(this.minimumPasswordAge, that.minimumPasswordAge)
            && Objects.equals(this.minimumPasswordLength, that.minimumPasswordLength)
            && Objects.equals(this.passwordReusePrevention, that.passwordReusePrevention)
            && Objects.equals(this.passwordNotUsernameOrInvert, that.passwordNotUsernameOrInvert)
            && Objects.equals(this.passwordRequirements, that.passwordRequirements)
            && Objects.equals(this.passwordValidityPeriod, that.passwordValidityPeriod)
            && Objects.equals(this.passwordCharCombination, that.passwordCharCombination)
            && Objects.equals(this.allowUserToChangePassword, that.allowUserToChangePassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maximumConsecutiveIdenticalChars,
            maximumPasswordLength,
            minimumPasswordAge,
            minimumPasswordLength,
            passwordReusePrevention,
            passwordNotUsernameOrInvert,
            passwordRequirements,
            passwordValidityPeriod,
            passwordCharCombination,
            allowUserToChangePassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PasswordPolicy {\n");
        sb.append("    maximumConsecutiveIdenticalChars: ")
            .append(toIndentedString(maximumConsecutiveIdenticalChars))
            .append("\n");
        sb.append("    maximumPasswordLength: ").append(toIndentedString(maximumPasswordLength)).append("\n");
        sb.append("    minimumPasswordAge: ").append(toIndentedString(minimumPasswordAge)).append("\n");
        sb.append("    minimumPasswordLength: ").append(toIndentedString(minimumPasswordLength)).append("\n");
        sb.append("    passwordReusePrevention: ").append(toIndentedString(passwordReusePrevention)).append("\n");
        sb.append("    passwordNotUsernameOrInvert: ")
            .append(toIndentedString(passwordNotUsernameOrInvert))
            .append("\n");
        sb.append("    passwordRequirements: ").append(toIndentedString(passwordRequirements)).append("\n");
        sb.append("    passwordValidityPeriod: ").append(toIndentedString(passwordValidityPeriod)).append("\n");
        sb.append("    passwordCharCombination: ").append(toIndentedString(passwordCharCombination)).append("\n");
        sb.append("    allowUserToChangePassword: ").append(toIndentedString(allowUserToChangePassword)).append("\n");
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
