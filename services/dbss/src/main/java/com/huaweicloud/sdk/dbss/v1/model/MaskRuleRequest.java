package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MaskRuleRequest
 */
public class MaskRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mask_regex")

    private String maskRegex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mask_value")

    private String maskValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    public MaskRuleRequest withMaskRegex(String maskRegex) {
        this.maskRegex = maskRegex;
        return this;
    }

    /**
     * 匹配正则
     * @return maskRegex
     */
    public String getMaskRegex() {
        return maskRegex;
    }

    public void setMaskRegex(String maskRegex) {
        this.maskRegex = maskRegex;
    }

    public MaskRuleRequest withMaskValue(String maskValue) {
        this.maskValue = maskValue;
        return this;
    }

    /**
     * 脱敏值
     * @return maskValue
     */
    public String getMaskValue() {
        return maskValue;
    }

    public void setMaskValue(String maskValue) {
        this.maskValue = maskValue;
    }

    public MaskRuleRequest withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 隐私数据保护规则名称
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MaskRuleRequest that = (MaskRuleRequest) obj;
        return Objects.equals(this.maskRegex, that.maskRegex) && Objects.equals(this.maskValue, that.maskValue)
            && Objects.equals(this.ruleName, that.ruleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maskRegex, maskValue, ruleName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MaskRuleRequest {\n");
        sb.append("    maskRegex: ").append(toIndentedString(maskRegex)).append("\n");
        sb.append("    maskValue: ").append(toIndentedString(maskValue)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
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
