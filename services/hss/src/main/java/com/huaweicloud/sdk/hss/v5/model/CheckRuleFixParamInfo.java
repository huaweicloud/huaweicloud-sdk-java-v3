package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配置检测检查项参数信息
 */
public class CheckRuleFixParamInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_param_id")

    private Integer ruleParamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_desc")

    private String ruleDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_value")

    private Integer defaultValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "range_min")

    private Integer rangeMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "range_max")

    private Integer rangeMax;

    public CheckRuleFixParamInfo withRuleParamId(Integer ruleParamId) {
        this.ruleParamId = ruleParamId;
        return this;
    }

    /**
     * 检查项参数ID
     * minimum: 0
     * maximum: 10
     * @return ruleParamId
     */
    public Integer getRuleParamId() {
        return ruleParamId;
    }

    public void setRuleParamId(Integer ruleParamId) {
        this.ruleParamId = ruleParamId;
    }

    public CheckRuleFixParamInfo withRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
        return this;
    }

    /**
     * 检查项参数描述
     * @return ruleDesc
     */
    public String getRuleDesc() {
        return ruleDesc;
    }

    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
    }

    public CheckRuleFixParamInfo withDefaultValue(Integer defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * 检查项参数默认值
     * minimum: 0
     * maximum: 2147483647
     * @return defaultValue
     */
    public Integer getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Integer defaultValue) {
        this.defaultValue = defaultValue;
    }

    public CheckRuleFixParamInfo withRangeMin(Integer rangeMin) {
        this.rangeMin = rangeMin;
        return this;
    }

    /**
     * 检查项参数可取最小值
     * minimum: 0
     * maximum: 2147483647
     * @return rangeMin
     */
    public Integer getRangeMin() {
        return rangeMin;
    }

    public void setRangeMin(Integer rangeMin) {
        this.rangeMin = rangeMin;
    }

    public CheckRuleFixParamInfo withRangeMax(Integer rangeMax) {
        this.rangeMax = rangeMax;
        return this;
    }

    /**
     * 检查项参数可取最大值
     * minimum: 0
     * maximum: 2147483647
     * @return rangeMax
     */
    public Integer getRangeMax() {
        return rangeMax;
    }

    public void setRangeMax(Integer rangeMax) {
        this.rangeMax = rangeMax;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckRuleFixParamInfo that = (CheckRuleFixParamInfo) obj;
        return Objects.equals(this.ruleParamId, that.ruleParamId) && Objects.equals(this.ruleDesc, that.ruleDesc)
            && Objects.equals(this.defaultValue, that.defaultValue) && Objects.equals(this.rangeMin, that.rangeMin)
            && Objects.equals(this.rangeMax, that.rangeMax);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleParamId, ruleDesc, defaultValue, rangeMin, rangeMax);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckRuleFixParamInfo {\n");
        sb.append("    ruleParamId: ").append(toIndentedString(ruleParamId)).append("\n");
        sb.append("    ruleDesc: ").append(toIndentedString(ruleDesc)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    rangeMin: ").append(toIndentedString(rangeMin)).append("\n");
        sb.append("    rangeMax: ").append(toIndentedString(rangeMax)).append("\n");
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
