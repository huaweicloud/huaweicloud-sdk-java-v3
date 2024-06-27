package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ValidateRule
 */
public class ValidateRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependent_info")

    private List<ConditionInstance> dependentInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_configDep")

    private Boolean isConfigDep;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_dependent")

    private Boolean isDependent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "special_char")

    private String specialChar;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "special_char_valid")

    private String specialCharValid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x_example")

    private String xExample;

    public ValidateRule withDependentInfo(List<ConditionInstance> dependentInfo) {
        this.dependentInfo = dependentInfo;
        return this;
    }

    public ValidateRule addDependentInfoItem(ConditionInstance dependentInfoItem) {
        if (this.dependentInfo == null) {
            this.dependentInfo = new ArrayList<>();
        }
        this.dependentInfo.add(dependentInfoItem);
        return this;
    }

    public ValidateRule withDependentInfo(Consumer<List<ConditionInstance>> dependentInfoSetter) {
        if (this.dependentInfo == null) {
            this.dependentInfo = new ArrayList<>();
        }
        dependentInfoSetter.accept(this.dependentInfo);
        return this;
    }

    /**
     * 依赖信息列表
     * @return dependentInfo
     */
    public List<ConditionInstance> getDependentInfo() {
        return dependentInfo;
    }

    public void setDependentInfo(List<ConditionInstance> dependentInfo) {
        this.dependentInfo = dependentInfo;
    }

    public ValidateRule withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否启用的标识符
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ValidateRule withIsConfigDep(Boolean isConfigDep) {
        this.isConfigDep = isConfigDep;
        return this;
    }

    /**
     * 配置依赖的标识符
     * @return isConfigDep
     */
    public Boolean getIsConfigDep() {
        return isConfigDep;
    }

    public void setIsConfigDep(Boolean isConfigDep) {
        this.isConfigDep = isConfigDep;
    }

    public ValidateRule withIsDependent(Boolean isDependent) {
        this.isDependent = isDependent;
        return this;
    }

    /**
     * 是否依赖的标识符
     * @return isDependent
     */
    public Boolean getIsDependent() {
        return isDependent;
    }

    public void setIsDependent(Boolean isDependent) {
        this.isDependent = isDependent;
    }

    public ValidateRule withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 消息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ValidateRule withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 结果
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public ValidateRule withSpecialChar(String specialChar) {
        this.specialChar = specialChar;
        return this;
    }

    /**
     * 特殊字符
     * @return specialChar
     */
    public String getSpecialChar() {
        return specialChar;
    }

    public void setSpecialChar(String specialChar) {
        this.specialChar = specialChar;
    }

    public ValidateRule withSpecialCharValid(String specialCharValid) {
        this.specialCharValid = specialCharValid;
        return this;
    }

    /**
     * 特殊字符的有效性
     * @return specialCharValid
     */
    public String getSpecialCharValid() {
        return specialCharValid;
    }

    public void setSpecialCharValid(String specialCharValid) {
        this.specialCharValid = specialCharValid;
    }

    public ValidateRule withXExample(String xExample) {
        this.xExample = xExample;
        return this;
    }

    /**
     * 示例
     * @return xExample
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x_example")
    public String getXExample() {
        return xExample;
    }

    public void setXExample(String xExample) {
        this.xExample = xExample;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ValidateRule that = (ValidateRule) obj;
        return Objects.equals(this.dependentInfo, that.dependentInfo) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.isConfigDep, that.isConfigDep) && Objects.equals(this.isDependent, that.isDependent)
            && Objects.equals(this.message, that.message) && Objects.equals(this.result, that.result)
            && Objects.equals(this.specialChar, that.specialChar)
            && Objects.equals(this.specialCharValid, that.specialCharValid)
            && Objects.equals(this.xExample, that.xExample);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dependentInfo,
            enabled,
            isConfigDep,
            isDependent,
            message,
            result,
            specialChar,
            specialCharValid,
            xExample);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidateRule {\n");
        sb.append("    dependentInfo: ").append(toIndentedString(dependentInfo)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    isConfigDep: ").append(toIndentedString(isConfigDep)).append("\n");
        sb.append("    isDependent: ").append(toIndentedString(isDependent)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    specialChar: ").append(toIndentedString(specialChar)).append("\n");
        sb.append("    specialCharValid: ").append(toIndentedString(specialCharValid)).append("\n");
        sb.append("    xExample: ").append(toIndentedString(xExample)).append("\n");
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
