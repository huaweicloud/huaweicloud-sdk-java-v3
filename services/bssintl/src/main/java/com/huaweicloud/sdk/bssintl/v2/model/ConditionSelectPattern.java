package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConditionSelectPattern
 */
public class ConditionSelectPattern {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_type")

    private String conditionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_statement")

    private String conditionStatement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_mode")

    private String policyMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "official_price")

    private String officialPrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "division_pattern")

    private DivisionPattern divisionPattern;

    public ConditionSelectPattern withConditionType(String conditionType) {
        this.conditionType = conditionType;
        return this;
    }

    /**
     * 条件类型，SERVICE_HOUR_TIME：时间段 PERIOD_NUM：周期数 PERIOD_TYPE：周期类型，年、月、天、小时 PURCHASE_SCENE：订购场景，订购、续订、变更 NUMBER_OF_PEOPLE：线性大小
     * @return conditionType
     */
    public String getConditionType() {
        return conditionType;
    }

    public void setConditionType(String conditionType) {
        this.conditionType = conditionType;
    }

    public ConditionSelectPattern withConditionStatement(String conditionStatement) {
        this.conditionStatement = conditionStatement;
        return this;
    }

    /**
     * 条件表达式
     * @return conditionStatement
     */
    public String getConditionStatement() {
        return conditionStatement;
    }

    public void setConditionStatement(String conditionStatement) {
        this.conditionStatement = conditionStatement;
    }

    public ConditionSelectPattern withPolicyMode(String policyMode) {
        this.policyMode = policyMode;
        return this;
    }

    /**
     * 定价策略类型，SIMPLE：简单定价 DIVISION：阶梯定价
     * @return policyMode
     */
    public String getPolicyMode() {
        return policyMode;
    }

    public void setPolicyMode(String policyMode) {
        this.policyMode = policyMode;
    }

    public ConditionSelectPattern withOfficialPrice(String officialPrice) {
        this.officialPrice = officialPrice;
        return this;
    }

    /**
     * 阶梯官网价，policy_mode取值为SIMPLE时为官网价，如果取值为DIVISION，则价格在division_pattern中。
     * @return officialPrice
     */
    public String getOfficialPrice() {
        return officialPrice;
    }

    public void setOfficialPrice(String officialPrice) {
        this.officialPrice = officialPrice;
    }

    public ConditionSelectPattern withDivisionPattern(DivisionPattern divisionPattern) {
        this.divisionPattern = divisionPattern;
        return this;
    }

    public ConditionSelectPattern withDivisionPattern(Consumer<DivisionPattern> divisionPatternSetter) {
        if (this.divisionPattern == null) {
            this.divisionPattern = new DivisionPattern();
            divisionPatternSetter.accept(this.divisionPattern);
        }

        return this;
    }

    /**
     * Get divisionPattern
     * @return divisionPattern
     */
    public DivisionPattern getDivisionPattern() {
        return divisionPattern;
    }

    public void setDivisionPattern(DivisionPattern divisionPattern) {
        this.divisionPattern = divisionPattern;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConditionSelectPattern that = (ConditionSelectPattern) obj;
        return Objects.equals(this.conditionType, that.conditionType)
            && Objects.equals(this.conditionStatement, that.conditionStatement)
            && Objects.equals(this.policyMode, that.policyMode)
            && Objects.equals(this.officialPrice, that.officialPrice)
            && Objects.equals(this.divisionPattern, that.divisionPattern);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conditionType, conditionStatement, policyMode, officialPrice, divisionPattern);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConditionSelectPattern {\n");
        sb.append("    conditionType: ").append(toIndentedString(conditionType)).append("\n");
        sb.append("    conditionStatement: ").append(toIndentedString(conditionStatement)).append("\n");
        sb.append("    policyMode: ").append(toIndentedString(policyMode)).append("\n");
        sb.append("    officialPrice: ").append(toIndentedString(officialPrice)).append("\n");
        sb.append("    divisionPattern: ").append(toIndentedString(divisionPattern)).append("\n");
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
