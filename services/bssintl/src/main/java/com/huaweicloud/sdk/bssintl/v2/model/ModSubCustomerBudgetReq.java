package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

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

    private Double budgetAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cancel_partner_frozen")

    private String cancelPartnerFrozen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indirect_partner_id")

    private String indirectPartnerId;

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

    public ModSubCustomerBudgetReq withBudgetAmount(Double budgetAmount) {
        this.budgetAmount = budgetAmount;
        return this;
    }

    /**
     * 调整的目标金额。 单位：元。精确至小数点后2位。
     * minimum: 0
     * maximum: 2147483647
     * @return budgetAmount
     */
    public Double getBudgetAmount() {
        return budgetAmount;
    }

    public void setBudgetAmount(Double budgetAmount) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModSubCustomerBudgetReq modSubCustomerBudgetReq = (ModSubCustomerBudgetReq) o;
        return Objects.equals(this.customerId, modSubCustomerBudgetReq.customerId)
            && Objects.equals(this.budgetAmount, modSubCustomerBudgetReq.budgetAmount)
            && Objects.equals(this.cancelPartnerFrozen, modSubCustomerBudgetReq.cancelPartnerFrozen)
            && Objects.equals(this.indirectPartnerId, modSubCustomerBudgetReq.indirectPartnerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, budgetAmount, cancelPartnerFrozen, indirectPartnerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModSubCustomerBudgetReq {\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    budgetAmount: ").append(toIndentedString(budgetAmount)).append("\n");
        sb.append("    cancelPartnerFrozen: ").append(toIndentedString(cancelPartnerFrozen)).append("\n");
        sb.append("    indirectPartnerId: ").append(toIndentedString(indirectPartnerId)).append("\n");
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
