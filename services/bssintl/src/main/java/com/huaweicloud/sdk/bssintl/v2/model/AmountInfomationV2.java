package com.huaweicloud.sdk.bssintl.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bssintl.v2.model.DiscountItemV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AmountInfomationV2
 */
public class AmountInfomationV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="discounts")
    
    private List<DiscountItemV2> discounts = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flexipurchase_coupon_amount")
    
    private Double flexipurchaseCouponAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="coupon_amount")
    
    private Double couponAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stored_card_amount")
    
    private Double storedCardAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="commission_amount")
    
    private Double commissionAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="consumed_amount")
    
    private Double consumedAmount;

    public AmountInfomationV2 withDiscounts(List<DiscountItemV2> discounts) {
        this.discounts = discounts;
        return this;
    }

    
    public AmountInfomationV2 addDiscountsItem(DiscountItemV2 discountsItem) {
        if(this.discounts == null) {
            this.discounts = new ArrayList<>();
        }
        this.discounts.add(discountsItem);
        return this;
    }

    public AmountInfomationV2 withDiscounts(Consumer<List<DiscountItemV2>> discountsSetter) {
        if(this.discounts == null) {
            this.discounts = new ArrayList<>();
        }
        discountsSetter.accept(this.discounts);
        return this;
    }

    /**
     * |参数名称：费用项。具体请参见表 DiscountItemV2。| |参数约束以及描述：费用项。具体请参见表 DiscountItemV2。|
     * @return discounts
     */
    public List<DiscountItemV2> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(List<DiscountItemV2> discounts) {
        this.discounts = discounts;
    }

    

    public AmountInfomationV2 withFlexipurchaseCouponAmount(Double flexipurchaseCouponAmount) {
        this.flexipurchaseCouponAmount = flexipurchaseCouponAmount;
        return this;
    }

    


    /**
     * |参数名称：现金券金额，预留。| |参数的约束及描述：现金券金额，预留。|
     * @return flexipurchaseCouponAmount
     */
    public Double getFlexipurchaseCouponAmount() {
        return flexipurchaseCouponAmount;
    }

    public void setFlexipurchaseCouponAmount(Double flexipurchaseCouponAmount) {
        this.flexipurchaseCouponAmount = flexipurchaseCouponAmount;
    }

    

    public AmountInfomationV2 withCouponAmount(Double couponAmount) {
        this.couponAmount = couponAmount;
        return this;
    }

    


    /**
     * |参数名称：代金券金额。| |参数的约束及描述：代金券金额。|
     * @return couponAmount
     */
    public Double getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(Double couponAmount) {
        this.couponAmount = couponAmount;
    }

    

    public AmountInfomationV2 withStoredCardAmount(Double storedCardAmount) {
        this.storedCardAmount = storedCardAmount;
        return this;
    }

    


    /**
     * |参数名称：储值卡金额，预留。| |参数的约束及描述：储值卡金额，预留。|
     * @return storedCardAmount
     */
    public Double getStoredCardAmount() {
        return storedCardAmount;
    }

    public void setStoredCardAmount(Double storedCardAmount) {
        this.storedCardAmount = storedCardAmount;
    }

    

    public AmountInfomationV2 withCommissionAmount(Double commissionAmount) {
        this.commissionAmount = commissionAmount;
        return this;
    }

    


    /**
     * |参数名称：手续费（仅退订订单存在）。| |参数的约束及描述：手续费（仅退订订单存在）。|
     * @return commissionAmount
     */
    public Double getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(Double commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    

    public AmountInfomationV2 withConsumedAmount(Double consumedAmount) {
        this.consumedAmount = consumedAmount;
        return this;
    }

    


    /**
     * |参数名称：消费金额（仅退订订单存在）。| |参数的约束及描述：消费金额（仅退订订单存在）。|
     * @return consumedAmount
     */
    public Double getConsumedAmount() {
        return consumedAmount;
    }

    public void setConsumedAmount(Double consumedAmount) {
        this.consumedAmount = consumedAmount;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AmountInfomationV2 amountInfomationV2 = (AmountInfomationV2) o;
        return Objects.equals(this.discounts, amountInfomationV2.discounts) &&
            Objects.equals(this.flexipurchaseCouponAmount, amountInfomationV2.flexipurchaseCouponAmount) &&
            Objects.equals(this.couponAmount, amountInfomationV2.couponAmount) &&
            Objects.equals(this.storedCardAmount, amountInfomationV2.storedCardAmount) &&
            Objects.equals(this.commissionAmount, amountInfomationV2.commissionAmount) &&
            Objects.equals(this.consumedAmount, amountInfomationV2.consumedAmount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(discounts, flexipurchaseCouponAmount, couponAmount, storedCardAmount, commissionAmount, consumedAmount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AmountInfomationV2 {\n");
        sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
        sb.append("    flexipurchaseCouponAmount: ").append(toIndentedString(flexipurchaseCouponAmount)).append("\n");
        sb.append("    couponAmount: ").append(toIndentedString(couponAmount)).append("\n");
        sb.append("    storedCardAmount: ").append(toIndentedString(storedCardAmount)).append("\n");
        sb.append("    commissionAmount: ").append(toIndentedString(commissionAmount)).append("\n");
        sb.append("    consumedAmount: ").append(toIndentedString(consumedAmount)).append("\n");
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

