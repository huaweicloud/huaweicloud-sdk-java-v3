package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * BudgetInfo
 */
public class BudgetInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "budget_amount")

    private BigDecimal budgetAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_amount")

    private BigDecimal usedAmount;

    /**
     * |参数名称：预算模式| |参数的约束及描述：MONTHLY 月度预算 PACKAGE 一次性预算|
     */
    public static final class BudgetTypeEnum {

        /**
         * Enum MONTHLY for value: "MONTHLY"
         */
        public static final BudgetTypeEnum MONTHLY = new BudgetTypeEnum("MONTHLY");

        /**
         * Enum PACKAGE for value: "PACKAGE"
         */
        public static final BudgetTypeEnum PACKAGE = new BudgetTypeEnum("PACKAGE");

        private static final Map<String, BudgetTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BudgetTypeEnum> createStaticFields() {
            Map<String, BudgetTypeEnum> map = new HashMap<>();
            map.put("MONTHLY", MONTHLY);
            map.put("PACKAGE", PACKAGE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BudgetTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static BudgetTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BudgetTypeEnum(value));
        }

        public static BudgetTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BudgetTypeEnum) {
                return this.value.equals(((BudgetTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "budget_type")

    private BudgetTypeEnum budgetType;

    public BudgetInfo withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * |参数名称：客户账号ID||参数的约束及描述：必填参数，范围限制:1-64|
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public BudgetInfo withBudgetAmount(BigDecimal budgetAmount) {
        this.budgetAmount = budgetAmount;
        return this;
    }

    /**
     * |参数名称：初始预算金额。| |参数的约束及描述：非必填，初始预算金额。|
     * @return budgetAmount
     */
    public BigDecimal getBudgetAmount() {
        return budgetAmount;
    }

    public void setBudgetAmount(BigDecimal budgetAmount) {
        this.budgetAmount = budgetAmount;
    }

    public BudgetInfo withUsedAmount(BigDecimal usedAmount) {
        this.usedAmount = usedAmount;
        return this;
    }

    /**
     * |参数名称：已经使用的预算。| |参数的约束及描述：已经使用的预算。非必填，该预算存在一定的时延和误差。|
     * @return usedAmount
     */
    public BigDecimal getUsedAmount() {
        return usedAmount;
    }

    public void setUsedAmount(BigDecimal usedAmount) {
        this.usedAmount = usedAmount;
    }

    public BudgetInfo withBudgetType(BudgetTypeEnum budgetType) {
        this.budgetType = budgetType;
        return this;
    }

    /**
     * |参数名称：预算模式| |参数的约束及描述：MONTHLY 月度预算 PACKAGE 一次性预算|
     * @return budgetType
     */
    public BudgetTypeEnum getBudgetType() {
        return budgetType;
    }

    public void setBudgetType(BudgetTypeEnum budgetType) {
        this.budgetType = budgetType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BudgetInfo that = (BudgetInfo) obj;
        return Objects.equals(this.customerId, that.customerId) && Objects.equals(this.budgetAmount, that.budgetAmount)
            && Objects.equals(this.usedAmount, that.usedAmount) && Objects.equals(this.budgetType, that.budgetType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, budgetAmount, usedAmount, budgetType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BudgetInfo {\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    budgetAmount: ").append(toIndentedString(budgetAmount)).append("\n");
        sb.append("    usedAmount: ").append(toIndentedString(usedAmount)).append("\n");
        sb.append("    budgetType: ").append(toIndentedString(budgetType)).append("\n");
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
