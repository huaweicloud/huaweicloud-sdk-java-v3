package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * InstanceOrderReq
 */
public class InstanceOrderReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private Integer chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payment_mode")

    private String paymentMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private Integer periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private Integer periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_renew")

    private Integer isAutoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_id")

    private String promotionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_plan_id")

    private String promotionPlanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_info")

    private String promotionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "composite_product_id")

    private String compositeProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_info")

    private InstanceCreateReqV2 instanceInfo;

    public InstanceOrderReq withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品编号
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public InstanceOrderReq withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费模式。
     * @return chargingMode
     */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    public InstanceOrderReq withPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
        return this;
    }

    /**
     * 支付模式。
     * @return paymentMode
     */
    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public InstanceOrderReq withPeriodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 订购周期类型： - 2：月 - 3：年
     * @return periodType
     */
    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public InstanceOrderReq withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 订购周期数
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public InstanceOrderReq withIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 是否支持自动续费
     * @return isAutoRenew
     */
    public Integer getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public InstanceOrderReq withPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }

    /**
     * 促销产品编号
     * @return promotionId
     */
    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public InstanceOrderReq withPromotionPlanId(String promotionPlanId) {
        this.promotionPlanId = promotionPlanId;
        return this;
    }

    /**
     * 促销计划编号
     * @return promotionPlanId
     */
    public String getPromotionPlanId() {
        return promotionPlanId;
    }

    public void setPromotionPlanId(String promotionPlanId) {
        this.promotionPlanId = promotionPlanId;
    }

    public InstanceOrderReq withPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
        return this;
    }

    /**
     * 促销信息
     * @return promotionInfo
     */
    public String getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    public InstanceOrderReq withCompositeProductId(String compositeProductId) {
        this.compositeProductId = compositeProductId;
        return this;
    }

    /**
     * 组合产品编号
     * @return compositeProductId
     */
    public String getCompositeProductId() {
        return compositeProductId;
    }

    public void setCompositeProductId(String compositeProductId) {
        this.compositeProductId = compositeProductId;
    }

    public InstanceOrderReq withInstanceInfo(InstanceCreateReqV2 instanceInfo) {
        this.instanceInfo = instanceInfo;
        return this;
    }

    public InstanceOrderReq withInstanceInfo(Consumer<InstanceCreateReqV2> instanceInfoSetter) {
        if (this.instanceInfo == null) {
            this.instanceInfo = new InstanceCreateReqV2();
            instanceInfoSetter.accept(this.instanceInfo);
        }

        return this;
    }

    /**
     * Get instanceInfo
     * @return instanceInfo
     */
    public InstanceCreateReqV2 getInstanceInfo() {
        return instanceInfo;
    }

    public void setInstanceInfo(InstanceCreateReqV2 instanceInfo) {
        this.instanceInfo = instanceInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceOrderReq that = (InstanceOrderReq) obj;
        return Objects.equals(this.productId, that.productId) && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.paymentMode, that.paymentMode) && Objects.equals(this.periodType, that.periodType)
            && Objects.equals(this.periodNum, that.periodNum) && Objects.equals(this.isAutoRenew, that.isAutoRenew)
            && Objects.equals(this.promotionId, that.promotionId)
            && Objects.equals(this.promotionPlanId, that.promotionPlanId)
            && Objects.equals(this.promotionInfo, that.promotionInfo)
            && Objects.equals(this.compositeProductId, that.compositeProductId)
            && Objects.equals(this.instanceInfo, that.instanceInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId,
            chargingMode,
            paymentMode,
            periodType,
            periodNum,
            isAutoRenew,
            promotionId,
            promotionPlanId,
            promotionInfo,
            compositeProductId,
            instanceInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceOrderReq {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    paymentMode: ").append(toIndentedString(paymentMode)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
        sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
        sb.append("    promotionPlanId: ").append(toIndentedString(promotionPlanId)).append("\n");
        sb.append("    promotionInfo: ").append(toIndentedString(promotionInfo)).append("\n");
        sb.append("    compositeProductId: ").append(toIndentedString(compositeProductId)).append("\n");
        sb.append("    instanceInfo: ").append(toIndentedString(instanceInfo)).append("\n");
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
