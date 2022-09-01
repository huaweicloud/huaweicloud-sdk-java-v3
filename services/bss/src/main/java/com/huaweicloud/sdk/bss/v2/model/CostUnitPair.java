package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * CostUnitPair
 */
public class CostUnitPair {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cost_unit_name")

    @JacksonXmlProperty(localName = "cost_unit_name")

    private String costUnitName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cost_unit_rule_value")

    @JacksonXmlProperty(localName = "cost_unit_rule_value")

    private String costUnitRuleValue;

    public CostUnitPair withCostUnitName(String costUnitName) {
        this.costUnitName = costUnitName;
        return this;
    }

    /**
     * 成本单元名称。
     * @return costUnitName
     */
    public String getCostUnitName() {
        return costUnitName;
    }

    public void setCostUnitName(String costUnitName) {
        this.costUnitName = costUnitName;
    }

    public CostUnitPair withCostUnitRuleValue(String costUnitRuleValue) {
        this.costUnitRuleValue = costUnitRuleValue;
        return this;
    }

    /**
     * 成本单元规则值。
     * @return costUnitRuleValue
     */
    public String getCostUnitRuleValue() {
        return costUnitRuleValue;
    }

    public void setCostUnitRuleValue(String costUnitRuleValue) {
        this.costUnitRuleValue = costUnitRuleValue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CostUnitPair costUnitPair = (CostUnitPair) o;
        return Objects.equals(this.costUnitName, costUnitPair.costUnitName)
            && Objects.equals(this.costUnitRuleValue, costUnitPair.costUnitRuleValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(costUnitName, costUnitRuleValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CostUnitPair {\n");
        sb.append("    costUnitName: ").append(toIndentedString(costUnitName)).append("\n");
        sb.append("    costUnitRuleValue: ").append(toIndentedString(costUnitRuleValue)).append("\n");
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
