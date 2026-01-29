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
 * ModSubCustomerBudgetReq
 */
public class ModSubCustomerBudgetReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "budget_amount")

    private BigDecimal budgetAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cancel_partner_frozen")

    private String cancelPartnerFrozen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indirect_partner_id")

    private String indirectPartnerId;

    /**
     * |参数名称：预算模式| |参数的约束及描述：MONTHLY 月度预算 PACKAGE 一次性预算 ，此参数不携带或携带值为null时，默认值为MONTHLY。|
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen_operate_type")

    private Integer frozenOperateType;

    public ModSubCustomerBudgetReq withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * 客户账号ID。您可以调用查询客户列表接口获取customer_id。
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public ModSubCustomerBudgetReq withBudgetAmount(BigDecimal budgetAmount) {
        this.budgetAmount = budgetAmount;
        return this;
    }

    /**
     * 调整的目标金额。 单位：元。精确至小数点后2位。
     * minimum: 0
     * maximum: 2147483647
     * @return budgetAmount
     */
    public BigDecimal getBudgetAmount() {
        return budgetAmount;
    }

    public void setBudgetAmount(BigDecimal budgetAmount) {
        this.budgetAmount = budgetAmount;
    }

    public ModSubCustomerBudgetReq withCancelPartnerFrozen(String cancelPartnerFrozen) {
        this.cancelPartnerFrozen = cancelPartnerFrozen;
        return this;
    }

    /**
     * 是否在设置客户预算的同时解除账号冻结： 0：否1：是 默认值为0。
     * @return cancelPartnerFrozen
     */
    public String getCancelPartnerFrozen() {
        return cancelPartnerFrozen;
    }

    public void setCancelPartnerFrozen(String cancelPartnerFrozen) {
        this.cancelPartnerFrozen = cancelPartnerFrozen;
    }

    public ModSubCustomerBudgetReq withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    /**
     * 云经销商ID。获取方法请参见查询云经销商列表。如果需要查询云经销商的子客户列表，必须携带该字段。除此之外，此参数不做处理。
     * @return indirectPartnerId
     */
    public String getIndirectPartnerId() {
        return indirectPartnerId;
    }

    public void setIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
    }

    public ModSubCustomerBudgetReq withBudgetType(BudgetTypeEnum budgetType) {
        this.budgetType = budgetType;
        return this;
    }

    /**
     * |参数名称：预算模式| |参数的约束及描述：MONTHLY 月度预算 PACKAGE 一次性预算 ，此参数不携带或携带值为null时，默认值为MONTHLY。|
     * @return budgetType
     */
    public BudgetTypeEnum getBudgetType() {
        return budgetType;
    }

    public void setBudgetType(BudgetTypeEnum budgetType) {
        this.budgetType = budgetType;
    }

    public ModSubCustomerBudgetReq withFrozenOperateType(Integer frozenOperateType) {
        this.frozenOperateType = frozenOperateType;
        return this;
    }

    /**
     * |参数名称：设置超预算时是否自动冻结| |参数的约束及描述：0：手工冻结 1：自动冻结，此参数不携带或携带值为null或携带值为空时，字段不生效。|
     * minimum: 0
     * maximum: 1
     * @return frozenOperateType
     */
    public Integer getFrozenOperateType() {
        return frozenOperateType;
    }

    public void setFrozenOperateType(Integer frozenOperateType) {
        this.frozenOperateType = frozenOperateType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModSubCustomerBudgetReq that = (ModSubCustomerBudgetReq) obj;
        return Objects.equals(this.customerId, that.customerId) && Objects.equals(this.budgetAmount, that.budgetAmount)
            && Objects.equals(this.cancelPartnerFrozen, that.cancelPartnerFrozen)
            && Objects.equals(this.indirectPartnerId, that.indirectPartnerId)
            && Objects.equals(this.budgetType, that.budgetType)
            && Objects.equals(this.frozenOperateType, that.frozenOperateType);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(customerId, budgetAmount, cancelPartnerFrozen, indirectPartnerId, budgetType, frozenOperateType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModSubCustomerBudgetReq {\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    budgetAmount: ").append(toIndentedString(budgetAmount)).append("\n");
        sb.append("    cancelPartnerFrozen: ").append(toIndentedString(cancelPartnerFrozen)).append("\n");
        sb.append("    indirectPartnerId: ").append(toIndentedString(indirectPartnerId)).append("\n");
        sb.append("    budgetType: ").append(toIndentedString(budgetType)).append("\n");
        sb.append("    frozenOperateType: ").append(toIndentedString(frozenOperateType)).append("\n");
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
