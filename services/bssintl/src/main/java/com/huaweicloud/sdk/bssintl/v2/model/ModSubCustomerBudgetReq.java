package com.huaweicloud.sdk.bssintl.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ModSubCustomerBudgetReq
 */
public class ModSubCustomerBudgetReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="budget_amount")
    
    private Double budgetAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cancel_partner_frozen")
    
    private String cancelPartnerFrozen;

    public ModSubCustomerBudgetReq withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    


    /**
     * |参数名称：客户ID。| |参数约束及描述：客户ID。|
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
     * |参数名称：调整的目标金额，可精确至小数点后面2位。| |参数的约束及描述：调整的目标金额，可精确至小数点后面2位。|
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
     * |参数名称：是否在设置客户预算的同时解除账号冻结：0：否；1：是。默认为否。| |参数约束及描述：是否在设置客户预算的同时解除账号冻结：0：否；1：是。默认为否。|
     * @return cancelPartnerFrozen
     */
    public String getCancelPartnerFrozen() {
        return cancelPartnerFrozen;
    }

    public void setCancelPartnerFrozen(String cancelPartnerFrozen) {
        this.cancelPartnerFrozen = cancelPartnerFrozen;
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
        return Objects.equals(this.customerId, modSubCustomerBudgetReq.customerId) &&
            Objects.equals(this.budgetAmount, modSubCustomerBudgetReq.budgetAmount) &&
            Objects.equals(this.cancelPartnerFrozen, modSubCustomerBudgetReq.cancelPartnerFrozen);
    }
    @Override
    public int hashCode() {
        return Objects.hash(customerId, budgetAmount, cancelPartnerFrozen);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModSubCustomerBudgetReq {\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    budgetAmount: ").append(toIndentedString(budgetAmount)).append("\n");
        sb.append("    cancelPartnerFrozen: ").append(toIndentedString(cancelPartnerFrozen)).append("\n");
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

