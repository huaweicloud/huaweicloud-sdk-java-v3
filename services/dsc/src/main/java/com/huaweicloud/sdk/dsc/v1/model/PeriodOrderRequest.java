package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PeriodOrderRequest
 */
public class PeriodOrderRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chargingMode")

    private Integer chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloudServiceType")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compositeProductId")

    private String compositeProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discountId")

    private String discountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoRenew")

    private Integer isAutoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "periodNum")

    private Integer periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "periodType")

    private Integer periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "productInfos")

    private List<ProductInfoBean> productInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotionActivityId")

    private String promotionActivityId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotionInfo")

    private String promotionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regionId")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone")

    private String zone;

    public PeriodOrderRequest withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费模式，0：包周期计费，1：按需计费，2：一次性计费
     * @return chargingMode
     */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    public PeriodOrderRequest withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 云服务类型
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public PeriodOrderRequest withCompositeProductId(String compositeProductId) {
        this.compositeProductId = compositeProductId;
        return this;
    }

    /**
     * 组合套餐ID
     * @return compositeProductId
     */
    public String getCompositeProductId() {
        return compositeProductId;
    }

    public void setCompositeProductId(String compositeProductId) {
        this.compositeProductId = compositeProductId;
    }

    public PeriodOrderRequest withDiscountId(String discountId) {
        this.discountId = discountId;
        return this;
    }

    /**
     * 折扣ID
     * @return discountId
     */
    public String getDiscountId() {
        return discountId;
    }

    public void setDiscountId(String discountId) {
        this.discountId = discountId;
    }

    public PeriodOrderRequest withIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 是否自动续费
     * @return isAutoRenew
     */
    public Integer getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public PeriodOrderRequest withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 订购周期数目
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public PeriodOrderRequest withPeriodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 订购周期类型，2：月，3：年
     * @return periodType
     */
    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public PeriodOrderRequest withProductInfos(List<ProductInfoBean> productInfos) {
        this.productInfos = productInfos;
        return this;
    }

    public PeriodOrderRequest addProductInfosItem(ProductInfoBean productInfosItem) {
        if (this.productInfos == null) {
            this.productInfos = new ArrayList<>();
        }
        this.productInfos.add(productInfosItem);
        return this;
    }

    public PeriodOrderRequest withProductInfos(Consumer<List<ProductInfoBean>> productInfosSetter) {
        if (this.productInfos == null) {
            this.productInfos = new ArrayList<>();
        }
        productInfosSetter.accept(this.productInfos);
        return this;
    }

    /**
     * 产品信息列表
     * @return productInfos
     */
    public List<ProductInfoBean> getProductInfos() {
        return productInfos;
    }

    public void setProductInfos(List<ProductInfoBean> productInfos) {
        this.productInfos = productInfos;
    }

    public PeriodOrderRequest withPromotionActivityId(String promotionActivityId) {
        this.promotionActivityId = promotionActivityId;
        return this;
    }

    /**
     * 促销ID
     * @return promotionActivityId
     */
    public String getPromotionActivityId() {
        return promotionActivityId;
    }

    public void setPromotionActivityId(String promotionActivityId) {
        this.promotionActivityId = promotionActivityId;
    }

    public PeriodOrderRequest withPromotionInfo(String promotionInfo) {
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

    public PeriodOrderRequest withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 当前项目所在region的id，如：xx-xx-1。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public PeriodOrderRequest withZone(String zone) {
        this.zone = zone;
        return this;
    }

    /**
     * 所属国家区域
     * @return zone
     */
    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PeriodOrderRequest periodOrderRequest = (PeriodOrderRequest) o;
        return Objects.equals(this.chargingMode, periodOrderRequest.chargingMode)
            && Objects.equals(this.cloudServiceType, periodOrderRequest.cloudServiceType)
            && Objects.equals(this.compositeProductId, periodOrderRequest.compositeProductId)
            && Objects.equals(this.discountId, periodOrderRequest.discountId)
            && Objects.equals(this.isAutoRenew, periodOrderRequest.isAutoRenew)
            && Objects.equals(this.periodNum, periodOrderRequest.periodNum)
            && Objects.equals(this.periodType, periodOrderRequest.periodType)
            && Objects.equals(this.productInfos, periodOrderRequest.productInfos)
            && Objects.equals(this.promotionActivityId, periodOrderRequest.promotionActivityId)
            && Objects.equals(this.promotionInfo, periodOrderRequest.promotionInfo)
            && Objects.equals(this.regionId, periodOrderRequest.regionId)
            && Objects.equals(this.zone, periodOrderRequest.zone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargingMode,
            cloudServiceType,
            compositeProductId,
            discountId,
            isAutoRenew,
            periodNum,
            periodType,
            productInfos,
            promotionActivityId,
            promotionInfo,
            regionId,
            zone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PeriodOrderRequest {\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    compositeProductId: ").append(toIndentedString(compositeProductId)).append("\n");
        sb.append("    discountId: ").append(toIndentedString(discountId)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    productInfos: ").append(toIndentedString(productInfos)).append("\n");
        sb.append("    promotionActivityId: ").append(toIndentedString(promotionActivityId)).append("\n");
        sb.append("    promotionInfo: ").append(toIndentedString(promotionInfo)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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
