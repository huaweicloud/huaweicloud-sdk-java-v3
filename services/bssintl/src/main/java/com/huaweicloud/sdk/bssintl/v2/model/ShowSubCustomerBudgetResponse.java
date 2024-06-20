package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowSubCustomerBudgetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "budget_amount")

    private BigDecimal budgetAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_amount")

    private BigDecimal usedAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    private String currency;

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

    public ShowSubCustomerBudgetResponse withBudgetAmount(BigDecimal budgetAmount) {
        this.budgetAmount = budgetAmount;
        return this;
    }

    /**
     * 初始预算金额。
     * @return budgetAmount
     */
    public BigDecimal getBudgetAmount() {
        return budgetAmount;
    }

    public void setBudgetAmount(BigDecimal budgetAmount) {
        this.budgetAmount = budgetAmount;
    }

    public ShowSubCustomerBudgetResponse withUsedAmount(BigDecimal usedAmount) {
        this.usedAmount = usedAmount;
        return this;
    }

    /**
     * 已经使用的预算。该预算存在一定的时延和误差。
     * @return usedAmount
     */
    public BigDecimal getUsedAmount() {
        return usedAmount;
    }

    public void setUsedAmount(BigDecimal usedAmount) {
        this.usedAmount = usedAmount;
    }

    public ShowSubCustomerBudgetResponse withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /**
     * 金额单位。 1：元
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public ShowSubCustomerBudgetResponse withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * 币种。 USD：美金
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ShowSubCustomerBudgetResponse withBudgetType(BudgetTypeEnum budgetType) {
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
        ShowSubCustomerBudgetResponse that = (ShowSubCustomerBudgetResponse) obj;
        return Objects.equals(this.budgetAmount, that.budgetAmount) && Objects.equals(this.usedAmount, that.usedAmount)
            && Objects.equals(this.measureId, that.measureId) && Objects.equals(this.currency, that.currency)
            && Objects.equals(this.budgetType, that.budgetType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(budgetAmount, usedAmount, measureId, currency, budgetType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSubCustomerBudgetResponse {\n");
        sb.append("    budgetAmount: ").append(toIndentedString(budgetAmount)).append("\n");
        sb.append("    usedAmount: ").append(toIndentedString(usedAmount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
