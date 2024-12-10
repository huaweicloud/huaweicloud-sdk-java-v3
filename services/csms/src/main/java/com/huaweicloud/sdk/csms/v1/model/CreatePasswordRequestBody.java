package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 生成随机密码入参
 */
public class CreatePasswordRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password_policy_name")

    private String passwordPolicyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "length")

    private Integer length;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_characters")

    private String excludeCharacters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_lowercase")

    private Boolean excludeLowercase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_uppercase")

    private Boolean excludeUppercase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_numbers")

    private Boolean excludeNumbers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_punctuation")

    private Boolean excludePunctuation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_space")

    private Boolean includeSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "require_each_included_type")

    private Boolean requireEachIncludedType;

    public CreatePasswordRequestBody withPasswordPolicyName(String passwordPolicyName) {
        this.passwordPolicyName = passwordPolicyName;
        return this;
    }

    /**
     * 策略名称
     * @return passwordPolicyName
     */
    public String getPasswordPolicyName() {
        return passwordPolicyName;
    }

    public void setPasswordPolicyName(String passwordPolicyName) {
        this.passwordPolicyName = passwordPolicyName;
    }

    public CreatePasswordRequestBody withLength(Integer length) {
        this.length = length;
        return this;
    }

    /**
     * 长度，默认32
     * @return length
     */
    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public CreatePasswordRequestBody withExcludeCharacters(String excludeCharacters) {
        this.excludeCharacters = excludeCharacters;
        return this;
    }

    /**
     * 需要排除的字符
     * @return excludeCharacters
     */
    public String getExcludeCharacters() {
        return excludeCharacters;
    }

    public void setExcludeCharacters(String excludeCharacters) {
        this.excludeCharacters = excludeCharacters;
    }

    public CreatePasswordRequestBody withExcludeLowercase(Boolean excludeLowercase) {
        this.excludeLowercase = excludeLowercase;
        return this;
    }

    /**
     * 排除小写字母，默认false
     * @return excludeLowercase
     */
    public Boolean getExcludeLowercase() {
        return excludeLowercase;
    }

    public void setExcludeLowercase(Boolean excludeLowercase) {
        this.excludeLowercase = excludeLowercase;
    }

    public CreatePasswordRequestBody withExcludeUppercase(Boolean excludeUppercase) {
        this.excludeUppercase = excludeUppercase;
        return this;
    }

    /**
     * 排除大写字母，默认false
     * @return excludeUppercase
     */
    public Boolean getExcludeUppercase() {
        return excludeUppercase;
    }

    public void setExcludeUppercase(Boolean excludeUppercase) {
        this.excludeUppercase = excludeUppercase;
    }

    public CreatePasswordRequestBody withExcludeNumbers(Boolean excludeNumbers) {
        this.excludeNumbers = excludeNumbers;
        return this;
    }

    /**
     * 排除数字，默认false
     * @return excludeNumbers
     */
    public Boolean getExcludeNumbers() {
        return excludeNumbers;
    }

    public void setExcludeNumbers(Boolean excludeNumbers) {
        this.excludeNumbers = excludeNumbers;
    }

    public CreatePasswordRequestBody withExcludePunctuation(Boolean excludePunctuation) {
        this.excludePunctuation = excludePunctuation;
        return this;
    }

    /**
     * 排除符号，默认false
     * @return excludePunctuation
     */
    public Boolean getExcludePunctuation() {
        return excludePunctuation;
    }

    public void setExcludePunctuation(Boolean excludePunctuation) {
        this.excludePunctuation = excludePunctuation;
    }

    public CreatePasswordRequestBody withIncludeSpace(Boolean includeSpace) {
        this.includeSpace = includeSpace;
        return this;
    }

    /**
     * 包含空格，默认false
     * @return includeSpace
     */
    public Boolean getIncludeSpace() {
        return includeSpace;
    }

    public void setIncludeSpace(Boolean includeSpace) {
        this.includeSpace = includeSpace;
    }

    public CreatePasswordRequestBody withRequireEachIncludedType(Boolean requireEachIncludedType) {
        this.requireEachIncludedType = requireEachIncludedType;
        return this;
    }

    /**
     * 需要每个包含的类型，默认false
     * @return requireEachIncludedType
     */
    public Boolean getRequireEachIncludedType() {
        return requireEachIncludedType;
    }

    public void setRequireEachIncludedType(Boolean requireEachIncludedType) {
        this.requireEachIncludedType = requireEachIncludedType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePasswordRequestBody that = (CreatePasswordRequestBody) obj;
        return Objects.equals(this.passwordPolicyName, that.passwordPolicyName)
            && Objects.equals(this.length, that.length)
            && Objects.equals(this.excludeCharacters, that.excludeCharacters)
            && Objects.equals(this.excludeLowercase, that.excludeLowercase)
            && Objects.equals(this.excludeUppercase, that.excludeUppercase)
            && Objects.equals(this.excludeNumbers, that.excludeNumbers)
            && Objects.equals(this.excludePunctuation, that.excludePunctuation)
            && Objects.equals(this.includeSpace, that.includeSpace)
            && Objects.equals(this.requireEachIncludedType, that.requireEachIncludedType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passwordPolicyName,
            length,
            excludeCharacters,
            excludeLowercase,
            excludeUppercase,
            excludeNumbers,
            excludePunctuation,
            includeSpace,
            requireEachIncludedType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePasswordRequestBody {\n");
        sb.append("    passwordPolicyName: ").append(toIndentedString(passwordPolicyName)).append("\n");
        sb.append("    length: ").append(toIndentedString(length)).append("\n");
        sb.append("    excludeCharacters: ").append(toIndentedString(excludeCharacters)).append("\n");
        sb.append("    excludeLowercase: ").append(toIndentedString(excludeLowercase)).append("\n");
        sb.append("    excludeUppercase: ").append(toIndentedString(excludeUppercase)).append("\n");
        sb.append("    excludeNumbers: ").append(toIndentedString(excludeNumbers)).append("\n");
        sb.append("    excludePunctuation: ").append(toIndentedString(excludePunctuation)).append("\n");
        sb.append("    includeSpace: ").append(toIndentedString(includeSpace)).append("\n");
        sb.append("    requireEachIncludedType: ").append(toIndentedString(requireEachIncludedType)).append("\n");
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
