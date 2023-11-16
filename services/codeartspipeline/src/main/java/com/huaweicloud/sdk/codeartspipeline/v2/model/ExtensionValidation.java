package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ExtensionValidation
 */
public class ExtensionValidation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "required_message")

    private String requiredMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regex")

    private String regex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regex_message")

    private String regexMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_length")

    private Integer maxLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_length")

    private Integer minLength;

    public ExtensionValidation withRequiredMessage(String requiredMessage) {
        this.requiredMessage = requiredMessage;
        return this;
    }

    /**
     * 消息
     * @return requiredMessage
     */
    public String getRequiredMessage() {
        return requiredMessage;
    }

    public void setRequiredMessage(String requiredMessage) {
        this.requiredMessage = requiredMessage;
    }

    public ExtensionValidation withRegex(String regex) {
        this.regex = regex;
        return this;
    }

    /**
     * 正则
     * @return regex
     */
    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public ExtensionValidation withRegexMessage(String regexMessage) {
        this.regexMessage = regexMessage;
        return this;
    }

    /**
     * 正则消息
     * @return regexMessage
     */
    public String getRegexMessage() {
        return regexMessage;
    }

    public void setRegexMessage(String regexMessage) {
        this.regexMessage = regexMessage;
    }

    public ExtensionValidation withMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    /**
     * 最大长度
     * @return maxLength
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public ExtensionValidation withMinLength(Integer minLength) {
        this.minLength = minLength;
        return this;
    }

    /**
     * 最小长度
     * @return minLength
     */
    public Integer getMinLength() {
        return minLength;
    }

    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtensionValidation that = (ExtensionValidation) obj;
        return Objects.equals(this.requiredMessage, that.requiredMessage) && Objects.equals(this.regex, that.regex)
            && Objects.equals(this.regexMessage, that.regexMessage) && Objects.equals(this.maxLength, that.maxLength)
            && Objects.equals(this.minLength, that.minLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requiredMessage, regex, regexMessage, maxLength, minLength);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionValidation {\n");
        sb.append("    requiredMessage: ").append(toIndentedString(requiredMessage)).append("\n");
        sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
        sb.append("    regexMessage: ").append(toIndentedString(regexMessage)).append("\n");
        sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
        sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
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
