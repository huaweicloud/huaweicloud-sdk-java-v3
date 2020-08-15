package com.huaweicloud.sdk.bss.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.DiscountEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AmountInfomation
 */
public class AmountInfomation  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="coupon_amount")
    
    private Double couponAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="discounts")
    
    private List<DiscountEntry> discounts = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flexipurchase_coupon_amount")
    
    private Double flexipurchaseCouponAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stored_card_amount")
    
    private Double storedCardAmount;

    public AmountInfomation withCouponAmount(Double couponAmount) {
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

    public AmountInfomation withDiscounts(List<DiscountEntry> discounts) {
        this.discounts = discounts;
        return this;
    }

    
    public AmountInfomation addDiscountsItem(DiscountEntry discountsItem) {
        if (this.discounts == null) {
            this.discounts = new ArrayList<>();
        }
        this.discounts.add(discountsItem);
        return this;
    }

    public AmountInfomation withDiscounts(Consumer<List<DiscountEntry>> discountsSetter) {
        if(this.discounts == null ){
            this.discounts = new ArrayList<>();
        }
        discountsSetter.accept(this.discounts);
        return this;
    }

    /**
     * |参数名称：费用项。| |参数约束及描述： 费用项。|
     * @return discounts
     */
    public List<DiscountEntry> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(List<DiscountEntry> discounts) {
        this.discounts = discounts;
    }

    public AmountInfomation withFlexipurchaseCouponAmount(Double flexipurchaseCouponAmount) {
        this.flexipurchaseCouponAmount = flexipurchaseCouponAmount;
        return this;
    }

    


    /**
     * |参数名称：现金券金额。| |参数的约束及描述：现金券金额。|
     * @return flexipurchaseCouponAmount
     */
    public Double getFlexipurchaseCouponAmount() {
        return flexipurchaseCouponAmount;
    }

    public void setFlexipurchaseCouponAmount(Double flexipurchaseCouponAmount) {
        this.flexipurchaseCouponAmount = flexipurchaseCouponAmount;
    }

    public AmountInfomation withStoredCardAmount(Double storedCardAmount) {
        this.storedCardAmount = storedCardAmount;
        return this;
    }

    


    /**
     * |参数名称：储值卡金额。| |参数的约束及描述：储值卡金额。|
     * @return storedCardAmount
     */
    public Double getStoredCardAmount() {
        return storedCardAmount;
    }

    public void setStoredCardAmount(Double storedCardAmount) {
        this.storedCardAmount = storedCardAmount;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AmountInfomation amountInfomation = (AmountInfomation) o;
        return Objects.equals(this.couponAmount, amountInfomation.couponAmount) &&
            Objects.equals(this.discounts, amountInfomation.discounts) &&
            Objects.equals(this.flexipurchaseCouponAmount, amountInfomation.flexipurchaseCouponAmount) &&
            Objects.equals(this.storedCardAmount, amountInfomation.storedCardAmount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(couponAmount, discounts, flexipurchaseCouponAmount, storedCardAmount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AmountInfomation {\n");
        sb.append("    couponAmount: ").append(toIndentedString(couponAmount)).append("\n");
        sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
        sb.append("    flexipurchaseCouponAmount: ").append(toIndentedString(flexipurchaseCouponAmount)).append("\n");
        sb.append("    storedCardAmount: ").append(toIndentedString(storedCardAmount)).append("\n");
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

