package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * DiscountItemV2
 */
public class DiscountItemV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_type")

    @JacksonXmlProperty(localName = "discount_type")

    private String discountType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_amount")

    @JacksonXmlProperty(localName = "discount_amount")

    private Double discountAmount;

    public DiscountItemV2 withDiscountType(String discountType) {
        this.discountType = discountType;
        return this;
    }

    /**
     * 折扣类型： 200：促销产品折扣300：促销折扣券301：促销代金券302：促销现金券500：代理订购指定折扣501：代理订购指定减免502：代理订购指定一口价600：折扣返利合同601：渠道框架合同602：专款专用合同603：线下直签合同604：电销授权合同605：商务合同折扣606：渠道商务合同折扣607：合作伙伴授权折扣609：订单调价折扣610：免单金额700：促销折扣800：充值帐户折扣900：产品本身折扣901：基准价一口价的折扣
     * @return discountType
     */
    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public DiscountItemV2 withDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    /**
     * 折扣金额。
     * @return discountAmount
     */
    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
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
        return Objects.equals(this.discountType, discountItemV2.discountType)
            && Objects.equals(this.discountAmount, discountItemV2.discountAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discountType, discountAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiscountItemV2 {\n");
        sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
        sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
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
