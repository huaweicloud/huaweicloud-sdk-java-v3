package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class PasswordPolicyResult {

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
    @JsonProperty(value = "number_of_recent_passwords_disallowed")

    private Integer numberOfRecentPasswordsDisallowed;

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

    public PasswordPolicyResult withMaximumConsecutiveIdenticalChars(Integer maximumConsecutiveIdenticalChars) {
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

    public PasswordPolicyResult withMaximumPasswordLength(Integer maximumPasswordLength) {
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

    public PasswordPolicyResult withMinimumPasswordAge(Integer minimumPasswordAge) {
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

    public PasswordPolicyResult withMinimumPasswordLength(Integer minimumPasswordLength) {
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

    public PasswordPolicyResult withNumberOfRecentPasswordsDisallowed(Integer numberOfRecentPasswordsDisallowed) {
        this.numberOfRecentPasswordsDisallowed = numberOfRecentPasswordsDisallowed;
        return this;
    }

    /**
     * 密码不能与历史密码重复次数。
     * @return numberOfRecentPasswordsDisallowed
     */
    public Integer getNumberOfRecentPasswordsDisallowed() {
        return numberOfRecentPasswordsDisallowed;
    }

    public void setNumberOfRecentPasswordsDisallowed(Integer numberOfRecentPasswordsDisallowed) {
        this.numberOfRecentPasswordsDisallowed = numberOfRecentPasswordsDisallowed;
    }

    public PasswordPolicyResult withPasswordNotUsernameOrInvert(Boolean passwordNotUsernameOrInvert) {
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

    public PasswordPolicyResult withPasswordRequirements(String passwordRequirements) {
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

    public PasswordPolicyResult withPasswordValidityPeriod(Integer passwordValidityPeriod) {
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

    public PasswordPolicyResult withPasswordCharCombination(Integer passwordCharCombination) {
        this.passwordCharCombination = passwordCharCombination;
        return this;
    }

    /**
     * 至少包含字符种类的个数，取值区间[2,4]。
     * @return passwordCharCombination
     */
    public Integer getPasswordCharCombination() {
        return passwordCharCombination;
    }

    public void setPasswordCharCombination(Integer passwordCharCombination) {
        this.passwordCharCombination = passwordCharCombination;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PasswordPolicyResult passwordPolicyResult = (PasswordPolicyResult) o;
        return Objects.equals(this.maximumConsecutiveIdenticalChars,
            passwordPolicyResult.maximumConsecutiveIdenticalChars)
            && Objects.equals(this.maximumPasswordLength, passwordPolicyResult.maximumPasswordLength)
            && Objects.equals(this.minimumPasswordAge, passwordPolicyResult.minimumPasswordAge)
            && Objects.equals(this.minimumPasswordLength, passwordPolicyResult.minimumPasswordLength)
            && Objects.equals(this.numberOfRecentPasswordsDisallowed,
                passwordPolicyResult.numberOfRecentPasswordsDisallowed)
            && Objects.equals(this.passwordNotUsernameOrInvert, passwordPolicyResult.passwordNotUsernameOrInvert)
            && Objects.equals(this.passwordRequirements, passwordPolicyResult.passwordRequirements)
            && Objects.equals(this.passwordValidityPeriod, passwordPolicyResult.passwordValidityPeriod)
            && Objects.equals(this.passwordCharCombination, passwordPolicyResult.passwordCharCombination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maximumConsecutiveIdenticalChars,
            maximumPasswordLength,
            minimumPasswordAge,
            minimumPasswordLength,
            numberOfRecentPasswordsDisallowed,
            passwordNotUsernameOrInvert,
            passwordRequirements,
            passwordValidityPeriod,
            passwordCharCombination);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PasswordPolicyResult {\n");
        sb.append("    maximumConsecutiveIdenticalChars: ")
            .append(toIndentedString(maximumConsecutiveIdenticalChars))
            .append("\n");
        sb.append("    maximumPasswordLength: ").append(toIndentedString(maximumPasswordLength)).append("\n");
        sb.append("    minimumPasswordAge: ").append(toIndentedString(minimumPasswordAge)).append("\n");
        sb.append("    minimumPasswordLength: ").append(toIndentedString(minimumPasswordLength)).append("\n");
        sb.append("    numberOfRecentPasswordsDisallowed: ")
            .append(toIndentedString(numberOfRecentPasswordsDisallowed))
            .append("\n");
        sb.append("    passwordNotUsernameOrInvert: ")
            .append(toIndentedString(passwordNotUsernameOrInvert))
            .append("\n");
        sb.append("    passwordRequirements: ").append(toIndentedString(passwordRequirements)).append("\n");
        sb.append("    passwordValidityPeriod: ").append(toIndentedString(passwordValidityPeriod)).append("\n");
        sb.append("    passwordCharCombination: ").append(toIndentedString(passwordCharCombination)).append("\n");
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
