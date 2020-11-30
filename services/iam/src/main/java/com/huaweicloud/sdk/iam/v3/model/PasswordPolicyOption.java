package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class PasswordPolicyOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="maximum_consecutive_identical_chars")
    
    private Integer maximumConsecutiveIdenticalChars;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="minimum_password_age")
    
    private Integer minimumPasswordAge;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="minimum_password_length")
    
    private Integer minimumPasswordLength;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="number_of_recent_passwords_disallowed")
    
    private Integer numberOfRecentPasswordsDisallowed;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password_not_username_or_invert")
    
    private Boolean passwordNotUsernameOrInvert;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password_validity_period")
    
    private Integer passwordValidityPeriod;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password_char_combination")
    
    private Integer passwordCharCombination = 2;

    public PasswordPolicyOption withMaximumConsecutiveIdenticalChars(Integer maximumConsecutiveIdenticalChars) {
        this.maximumConsecutiveIdenticalChars = maximumConsecutiveIdenticalChars;
        return this;
    }

    


    /**
     * 同一字符连续出现的最大次数，取值范围[0,32]。
     * @return maximumConsecutiveIdenticalChars
     */
    public Integer getMaximumConsecutiveIdenticalChars() {
        return maximumConsecutiveIdenticalChars;
    }

    public void setMaximumConsecutiveIdenticalChars(Integer maximumConsecutiveIdenticalChars) {
        this.maximumConsecutiveIdenticalChars = maximumConsecutiveIdenticalChars;
    }

    public PasswordPolicyOption withMinimumPasswordAge(Integer minimumPasswordAge) {
        this.minimumPasswordAge = minimumPasswordAge;
        return this;
    }

    


    /**
     * 密码最短使用时间(分钟)，取值范围[0,1440]。
     * @return minimumPasswordAge
     */
    public Integer getMinimumPasswordAge() {
        return minimumPasswordAge;
    }

    public void setMinimumPasswordAge(Integer minimumPasswordAge) {
        this.minimumPasswordAge = minimumPasswordAge;
    }

    public PasswordPolicyOption withMinimumPasswordLength(Integer minimumPasswordLength) {
        this.minimumPasswordLength = minimumPasswordLength;
        return this;
    }

    


    /**
     * 密码最小字符数，取值范围[6,32]。
     * @return minimumPasswordLength
     */
    public Integer getMinimumPasswordLength() {
        return minimumPasswordLength;
    }

    public void setMinimumPasswordLength(Integer minimumPasswordLength) {
        this.minimumPasswordLength = minimumPasswordLength;
    }

    public PasswordPolicyOption withNumberOfRecentPasswordsDisallowed(Integer numberOfRecentPasswordsDisallowed) {
        this.numberOfRecentPasswordsDisallowed = numberOfRecentPasswordsDisallowed;
        return this;
    }

    


    /**
     * 密码不能与历史密码重复次数，取值范围[0,10]。
     * @return numberOfRecentPasswordsDisallowed
     */
    public Integer getNumberOfRecentPasswordsDisallowed() {
        return numberOfRecentPasswordsDisallowed;
    }

    public void setNumberOfRecentPasswordsDisallowed(Integer numberOfRecentPasswordsDisallowed) {
        this.numberOfRecentPasswordsDisallowed = numberOfRecentPasswordsDisallowed;
    }

    public PasswordPolicyOption withPasswordNotUsernameOrInvert(Boolean passwordNotUsernameOrInvert) {
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

    public PasswordPolicyOption withPasswordValidityPeriod(Integer passwordValidityPeriod) {
        this.passwordValidityPeriod = passwordValidityPeriod;
        return this;
    }

    


    /**
     * 密码有效期（天），取值范围[0,180]，设置0表示关闭该策略。
     * @return passwordValidityPeriod
     */
    public Integer getPasswordValidityPeriod() {
        return passwordValidityPeriod;
    }

    public void setPasswordValidityPeriod(Integer passwordValidityPeriod) {
        this.passwordValidityPeriod = passwordValidityPeriod;
    }

    public PasswordPolicyOption withPasswordCharCombination(Integer passwordCharCombination) {
        this.passwordCharCombination = passwordCharCombination;
        return this;
    }

    


    /**
     * 至少包含字符种类的个数，取值区间[2,4]。
     * minimum: 2
     * maximum: 4
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
        PasswordPolicyOption passwordPolicyOption = (PasswordPolicyOption) o;
        return Objects.equals(this.maximumConsecutiveIdenticalChars, passwordPolicyOption.maximumConsecutiveIdenticalChars) &&
            Objects.equals(this.minimumPasswordAge, passwordPolicyOption.minimumPasswordAge) &&
            Objects.equals(this.minimumPasswordLength, passwordPolicyOption.minimumPasswordLength) &&
            Objects.equals(this.numberOfRecentPasswordsDisallowed, passwordPolicyOption.numberOfRecentPasswordsDisallowed) &&
            Objects.equals(this.passwordNotUsernameOrInvert, passwordPolicyOption.passwordNotUsernameOrInvert) &&
            Objects.equals(this.passwordValidityPeriod, passwordPolicyOption.passwordValidityPeriod) &&
            Objects.equals(this.passwordCharCombination, passwordPolicyOption.passwordCharCombination);
    }
    @Override
    public int hashCode() {
        return Objects.hash(maximumConsecutiveIdenticalChars, minimumPasswordAge, minimumPasswordLength, numberOfRecentPasswordsDisallowed, passwordNotUsernameOrInvert, passwordValidityPeriod, passwordCharCombination);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PasswordPolicyOption {\n");
        sb.append("    maximumConsecutiveIdenticalChars: ").append(toIndentedString(maximumConsecutiveIdenticalChars)).append("\n");
        sb.append("    minimumPasswordAge: ").append(toIndentedString(minimumPasswordAge)).append("\n");
        sb.append("    minimumPasswordLength: ").append(toIndentedString(minimumPasswordLength)).append("\n");
        sb.append("    numberOfRecentPasswordsDisallowed: ").append(toIndentedString(numberOfRecentPasswordsDisallowed)).append("\n");
        sb.append("    passwordNotUsernameOrInvert: ").append(toIndentedString(passwordNotUsernameOrInvert)).append("\n");
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

