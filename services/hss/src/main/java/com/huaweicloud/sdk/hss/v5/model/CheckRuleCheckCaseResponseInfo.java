package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 配置检测检查项的检测用例信息
 */
public class CheckRuleCheckCaseResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_description")

    @JacksonXmlProperty(localName = "check_description")

    private String checkDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_value")

    @JacksonXmlProperty(localName = "current_value")

    private String currentValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggest_value")

    @JacksonXmlProperty(localName = "suggest_value")

    private String suggestValue;

    public CheckRuleCheckCaseResponseInfo withCheckDescription(String checkDescription) {
        this.checkDescription = checkDescription;
        return this;
    }

    /**
     * 检测用例描述
     * @return checkDescription
     */
    public String getCheckDescription() {
        return checkDescription;
    }

    public void setCheckDescription(String checkDescription) {
        this.checkDescription = checkDescription;
    }

    public CheckRuleCheckCaseResponseInfo withCurrentValue(String currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * 当前结果
     * @return currentValue
     */
    public String getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(String currentValue) {
        this.currentValue = currentValue;
    }

    public CheckRuleCheckCaseResponseInfo withSuggestValue(String suggestValue) {
        this.suggestValue = suggestValue;
        return this;
    }

    /**
     * 期待结果
     * @return suggestValue
     */
    public String getSuggestValue() {
        return suggestValue;
    }

    public void setSuggestValue(String suggestValue) {
        this.suggestValue = suggestValue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckRuleCheckCaseResponseInfo checkRuleCheckCaseResponseInfo = (CheckRuleCheckCaseResponseInfo) o;
        return Objects.equals(this.checkDescription, checkRuleCheckCaseResponseInfo.checkDescription)
            && Objects.equals(this.currentValue, checkRuleCheckCaseResponseInfo.currentValue)
            && Objects.equals(this.suggestValue, checkRuleCheckCaseResponseInfo.suggestValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkDescription, currentValue, suggestValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckRuleCheckCaseResponseInfo {\n");
        sb.append("    checkDescription: ").append(toIndentedString(checkDescription)).append("\n");
        sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
        sb.append("    suggestValue: ").append(toIndentedString(suggestValue)).append("\n");
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
