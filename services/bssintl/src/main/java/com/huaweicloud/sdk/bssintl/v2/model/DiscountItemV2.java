package com.huaweicloud.sdk.bssintl.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DiscountItemV2
 */
public class DiscountItemV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="discount_amount")
    
    private Double discountAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="discount_type")
    
    private String discountType;

    public DiscountItemV2 withDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    


    /**
     * |参数名称：折扣金额。| |参数的约束及描述：折扣金额。|
     * @return discountAmount
     */
    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public DiscountItemV2 withDiscountType(String discountType) {
        this.discountType = discountType;
        return this;
    }

    


    /**
     * |参数名称：折扣类型：200：促销产品折扣；300：促销折扣券；301：促销代金券；302：促销现金券；500：代理订购指定折扣；501：代理订购指定减免；502：代理订购指定一口价；600：折扣返利合同；601：渠道框架合同；602：专款专用合同；603：线下直签合同；604：电销授权合同；605：商务合同折扣；606：渠道商务合同折扣；607：合作伙伴授权折扣；609：订单调价折扣；700：促销折扣；800：充值帐户折扣；| |参数约束及描述：折扣类型：200：促销产品折扣；300：促销折扣券；301：促销代金券；302：促销现金券；500：代理订购指定折扣；501：代理订购指定减免；502：代理订购指定一口价；600：折扣返利合同；601：渠道框架合同；602：专款专用合同；603：线下直签合同；604：电销授权合同；605：商务合同折扣；606：渠道商务合同折扣；607：合作伙伴授权折扣；609：订单调价折扣；700：促销折扣；800：充值帐户折扣；|
     * @return discountType
     */
    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiscountItemV2 discountItemV2 = (DiscountItemV2) o;
        return Objects.equals(this.discountAmount, discountItemV2.discountAmount) &&
            Objects.equals(this.discountType, discountItemV2.discountType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(discountAmount, discountType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiscountItemV2 {\n");
        sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
        sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
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

