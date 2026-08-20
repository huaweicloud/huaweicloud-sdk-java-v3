package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 参数校验规则
 */
public class ExtensionParameterValidation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isRequired")

    private Boolean isRequired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pattern")

    private String pattern;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "patternDescription")

    private String patternDescription;

    public ExtensionParameterValidation withIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }

    /**
     * 是否必填
     * @return isRequired
     */
    public Boolean getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    public ExtensionParameterValidation withPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * 正则校验
     * @return pattern
     */
    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public ExtensionParameterValidation withPatternDescription(String patternDescription) {
        this.patternDescription = patternDescription;
        return this;
    }

    /**
     * 校验说明
     * @return patternDescription
     */
    public String getPatternDescription() {
        return patternDescription;
    }

    public void setPatternDescription(String patternDescription) {
        this.patternDescription = patternDescription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtensionParameterValidation that = (ExtensionParameterValidation) obj;
        return Objects.equals(this.isRequired, that.isRequired) && Objects.equals(this.pattern, that.pattern)
            && Objects.equals(this.patternDescription, that.patternDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isRequired, pattern, patternDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionParameterValidation {\n");
        sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
        sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
        sb.append("    patternDescription: ").append(toIndentedString(patternDescription)).append("\n");
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
