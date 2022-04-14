package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** DiscountDetailInfo */
public class DiscountDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_type")

    private String promotionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_amount")

    private Double discountAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_id")

    private String promotionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    public DiscountDetailInfo withPromotionType(String promotionType) {
        this.promotionType = promotionType;
        return this;
    }

    /** 折扣类型。 500：代理订购指定折扣 501：代理订购指定减免 502：代理订购指定一口价 600：合同折扣返利 （商履折扣） 601：渠道框架合同折扣 602：专款专用合同折扣（特殊商务合同折扣） 603：线下直签合同折扣
     * 604：电销授权合同折扣 605：商务合同折扣 606：渠道商务合同折扣 607：合作伙伴授权折扣 608：严选商品折扣 610：免单金额 700：促销折扣 （促销，只有包年/包月场景） 800：赠送奖励金
     * 
     * @return promotionType */
    public String getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(String promotionType) {
        this.promotionType = promotionType;
    }

    public DiscountDetailInfo withDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    /** 折扣金额。
     * 
     * @return discountAmount */
    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public DiscountDetailInfo withPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }

    /** 折扣类型对应的标识，可为合同ID或商务ID。
     * 
     * @return promotionId */
    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public DiscountDetailInfo withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /** 金额单位，1:元 3：分，默认3
     * 
     * @return measureId */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiscountDetailInfo discountDetailInfo = (DiscountDetailInfo) o;
        return Objects.equals(this.promotionType, discountDetailInfo.promotionType)
            && Objects.equals(this.discountAmount, discountDetailInfo.discountAmount)
            && Objects.equals(this.promotionId, discountDetailInfo.promotionId)
            && Objects.equals(this.measureId, discountDetailInfo.measureId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(promotionType, discountAmount, promotionId, measureId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiscountDetailInfo {\n");
        sb.append("    promotionType: ").append(toIndentedString(promotionType)).append("\n");
        sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
        sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
