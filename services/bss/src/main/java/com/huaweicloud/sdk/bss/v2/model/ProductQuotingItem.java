package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 产品报价项折扣信息
 */
public class ProductQuotingItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_id")

    private String itemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_spec_name")

    private String productSpecName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type_name")

    private String cloudServiceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_code")

    private String siteCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_regions")

    private List<RegionInfo> relatedRegions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_event_code")

    private String chargeEventCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private String chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preferential_category")

    private Integer preferentialCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preferential_type")

    private Integer preferentialType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sales_price")

    private BigDecimal salesPrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_ratio")

    private BigDecimal discountRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pricing_basis")

    private String pricingBasis;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_time")

    private String effectiveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_quoting_item_steps")

    private List<ProductQuotingItemStep> productQuotingItemSteps = null;

    public ProductQuotingItem withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * 报价项ID
     * @return itemId
     */
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public ProductQuotingItem withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品ID
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ProductQuotingItem withProductSpecName(String productSpecName) {
        this.productSpecName = productSpecName;
        return this;
    }

    /**
     * 产品规格名称
     * @return productSpecName
     */
    public String getProductSpecName() {
        return productSpecName;
    }

    public void setProductSpecName(String productSpecName) {
        this.productSpecName = productSpecName;
    }

    public ProductQuotingItem withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 云服务编码
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public ProductQuotingItem withCloudServiceTypeName(String cloudServiceTypeName) {
        this.cloudServiceTypeName = cloudServiceTypeName;
        return this;
    }

    /**
     * 云服务名称
     * @return cloudServiceTypeName
     */
    public String getCloudServiceTypeName() {
        return cloudServiceTypeName;
    }

    public void setCloudServiceTypeName(String cloudServiceTypeName) {
        this.cloudServiceTypeName = cloudServiceTypeName;
    }

    public ProductQuotingItem withSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }

    /**
     * 运营站点编码
     * @return siteCode
     */
    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    public ProductQuotingItem withRelatedRegions(List<RegionInfo> relatedRegions) {
        this.relatedRegions = relatedRegions;
        return this;
    }

    public ProductQuotingItem addRelatedRegionsItem(RegionInfo relatedRegionsItem) {
        if (this.relatedRegions == null) {
            this.relatedRegions = new ArrayList<>();
        }
        this.relatedRegions.add(relatedRegionsItem);
        return this;
    }

    public ProductQuotingItem withRelatedRegions(Consumer<List<RegionInfo>> relatedRegionsSetter) {
        if (this.relatedRegions == null) {
            this.relatedRegions = new ArrayList<>();
        }
        relatedRegionsSetter.accept(this.relatedRegions);
        return this;
    }

    /**
     * 产品关联的云服务区信息列表
     * @return relatedRegions
     */
    public List<RegionInfo> getRelatedRegions() {
        return relatedRegions;
    }

    public void setRelatedRegions(List<RegionInfo> relatedRegions) {
        this.relatedRegions = relatedRegions;
    }

    public ProductQuotingItem withChargeEventCode(String chargeEventCode) {
        this.chargeEventCode = chargeEventCode;
        return this;
    }

    /**
     * 计费事件编码
     * @return chargeEventCode
     */
    public String getChargeEventCode() {
        return chargeEventCode;
    }

    public void setChargeEventCode(String chargeEventCode) {
        this.chargeEventCode = chargeEventCode;
    }

    public ProductQuotingItem withChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费模式，ONDEMAND：按需、ONETIME：一次性、DAILY：包天、MONTHLY：包月、1_YEARLY：包1年、2_YEARLY：包2年、3_YEARLY：包3年、4_YEARLY：包4年、5_YEARLY：包5年、1_YEARLY_RI：包1年预留实例、3_YEARLY_RI：包3年预留实例
     * @return chargingMode
     */
    public String getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ProductQuotingItem withPreferentialCategory(Integer preferentialCategory) {
        this.preferentialCategory = preferentialCategory;
        return this;
    }

    /**
     * 优惠分类：0：普通优惠，1：产品阶梯，2：分时优惠
     * @return preferentialCategory
     */
    public Integer getPreferentialCategory() {
        return preferentialCategory;
    }

    public void setPreferentialCategory(Integer preferentialCategory) {
        this.preferentialCategory = preferentialCategory;
    }

    public ProductQuotingItem withPreferentialType(Integer preferentialType) {
        this.preferentialType = preferentialType;
        return this;
    }

    /**
     * 优惠方式：0：产品折扣，1：固定单价
     * @return preferentialType
     */
    public Integer getPreferentialType() {
        return preferentialType;
    }

    public void setPreferentialType(Integer preferentialType) {
        this.preferentialType = preferentialType;
    }

    public ProductQuotingItem withSalesPrice(BigDecimal salesPrice) {
        this.salesPrice = salesPrice;
        return this;
    }

    /**
     * 固定单价（preferential_type=1固定单价时有值）
     * @return salesPrice
     */
    public BigDecimal getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(BigDecimal salesPrice) {
        this.salesPrice = salesPrice;
    }

    public ProductQuotingItem withDiscountRatio(BigDecimal discountRatio) {
        this.discountRatio = discountRatio;
        return this;
    }

    /**
     * 折扣率（preferential_type=0产品折扣时有值）
     * @return discountRatio
     */
    public BigDecimal getDiscountRatio() {
        return discountRatio;
    }

    public void setDiscountRatio(BigDecimal discountRatio) {
        this.discountRatio = discountRatio;
    }

    public ProductQuotingItem withPricingBasis(String pricingBasis) {
        this.pricingBasis = pricingBasis;
        return this;
    }

    /**
     * 计费单位
     * @return pricingBasis
     */
    public String getPricingBasis() {
        return pricingBasis;
    }

    public void setPricingBasis(String pricingBasis) {
        this.pricingBasis = pricingBasis;
    }

    public ProductQuotingItem withEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    /**
     * 报价项生效时间，UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public ProductQuotingItem withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 报价项失效时间，UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public ProductQuotingItem withProductQuotingItemSteps(List<ProductQuotingItemStep> productQuotingItemSteps) {
        this.productQuotingItemSteps = productQuotingItemSteps;
        return this;
    }

    public ProductQuotingItem addProductQuotingItemStepsItem(ProductQuotingItemStep productQuotingItemStepsItem) {
        if (this.productQuotingItemSteps == null) {
            this.productQuotingItemSteps = new ArrayList<>();
        }
        this.productQuotingItemSteps.add(productQuotingItemStepsItem);
        return this;
    }

    public ProductQuotingItem withProductQuotingItemSteps(
        Consumer<List<ProductQuotingItemStep>> productQuotingItemStepsSetter) {
        if (this.productQuotingItemSteps == null) {
            this.productQuotingItemSteps = new ArrayList<>();
        }
        productQuotingItemStepsSetter.accept(this.productQuotingItemSteps);
        return this;
    }

    /**
     * 产品报价项阶梯列表，产品阶梯或分时优惠时有值返回，否则返回空列表
     * @return productQuotingItemSteps
     */
    public List<ProductQuotingItemStep> getProductQuotingItemSteps() {
        return productQuotingItemSteps;
    }

    public void setProductQuotingItemSteps(List<ProductQuotingItemStep> productQuotingItemSteps) {
        this.productQuotingItemSteps = productQuotingItemSteps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductQuotingItem that = (ProductQuotingItem) obj;
        return Objects.equals(this.itemId, that.itemId) && Objects.equals(this.productId, that.productId)
            && Objects.equals(this.productSpecName, that.productSpecName)
            && Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.cloudServiceTypeName, that.cloudServiceTypeName)
            && Objects.equals(this.siteCode, that.siteCode) && Objects.equals(this.relatedRegions, that.relatedRegions)
            && Objects.equals(this.chargeEventCode, that.chargeEventCode)
            && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.preferentialCategory, that.preferentialCategory)
            && Objects.equals(this.preferentialType, that.preferentialType)
            && Objects.equals(this.salesPrice, that.salesPrice)
            && Objects.equals(this.discountRatio, that.discountRatio)
            && Objects.equals(this.pricingBasis, that.pricingBasis)
            && Objects.equals(this.effectiveTime, that.effectiveTime)
            && Objects.equals(this.expireTime, that.expireTime)
            && Objects.equals(this.productQuotingItemSteps, that.productQuotingItemSteps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId,
            productId,
            productSpecName,
            cloudServiceType,
            cloudServiceTypeName,
            siteCode,
            relatedRegions,
            chargeEventCode,
            chargingMode,
            preferentialCategory,
            preferentialType,
            salesPrice,
            discountRatio,
            pricingBasis,
            effectiveTime,
            expireTime,
            productQuotingItemSteps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductQuotingItem {\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productSpecName: ").append(toIndentedString(productSpecName)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    cloudServiceTypeName: ").append(toIndentedString(cloudServiceTypeName)).append("\n");
        sb.append("    siteCode: ").append(toIndentedString(siteCode)).append("\n");
        sb.append("    relatedRegions: ").append(toIndentedString(relatedRegions)).append("\n");
        sb.append("    chargeEventCode: ").append(toIndentedString(chargeEventCode)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    preferentialCategory: ").append(toIndentedString(preferentialCategory)).append("\n");
        sb.append("    preferentialType: ").append(toIndentedString(preferentialType)).append("\n");
        sb.append("    salesPrice: ").append(toIndentedString(salesPrice)).append("\n");
        sb.append("    discountRatio: ").append(toIndentedString(discountRatio)).append("\n");
        sb.append("    pricingBasis: ").append(toIndentedString(pricingBasis)).append("\n");
        sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    productQuotingItemSteps: ").append(toIndentedString(productQuotingItemSteps)).append("\n");
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
