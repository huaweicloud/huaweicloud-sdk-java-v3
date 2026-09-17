package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 分类报价项折扣信息
 */
public class CategoryQuotingItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_id")

    private String itemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type_name")

    private String cloudServiceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commercial_resource_type")

    private String commercialResourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type_code")

    private String resourceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type_name")

    private String resourceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sku_family_code")

    private String skuFamilyCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sku_family_name")

    private String skuFamilyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_code")

    private String siteCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_code")

    private String regionCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    private String regionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_code")

    private String azCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_name")

    private String azName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_no")

    private String stepNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private String chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_ratio")

    private BigDecimal discountRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_time")

    private String effectiveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    public CategoryQuotingItem withItemId(String itemId) {
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

    public CategoryQuotingItem withCloudServiceType(String cloudServiceType) {
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

    public CategoryQuotingItem withCloudServiceTypeName(String cloudServiceTypeName) {
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

    public CategoryQuotingItem withCommercialResourceType(String commercialResourceType) {
        this.commercialResourceType = commercialResourceType;
        return this;
    }

    /**
     * 商务资源类型
     * @return commercialResourceType
     */
    public String getCommercialResourceType() {
        return commercialResourceType;
    }

    public void setCommercialResourceType(String commercialResourceType) {
        this.commercialResourceType = commercialResourceType;
    }

    public CategoryQuotingItem withResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
        return this;
    }

    /**
     * 资源类型编码
     * @return resourceTypeCode
     */
    public String getResourceTypeCode() {
        return resourceTypeCode;
    }

    public void setResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
    }

    public CategoryQuotingItem withResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
        return this;
    }

    /**
     * 资源类型名称
     * @return resourceTypeName
     */
    public String getResourceTypeName() {
        return resourceTypeName;
    }

    public void setResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
    }

    public CategoryQuotingItem withSkuFamilyCode(String skuFamilyCode) {
        this.skuFamilyCode = skuFamilyCode;
        return this;
    }

    /**
     * SKU族编码
     * @return skuFamilyCode
     */
    public String getSkuFamilyCode() {
        return skuFamilyCode;
    }

    public void setSkuFamilyCode(String skuFamilyCode) {
        this.skuFamilyCode = skuFamilyCode;
    }

    public CategoryQuotingItem withSkuFamilyName(String skuFamilyName) {
        this.skuFamilyName = skuFamilyName;
        return this;
    }

    /**
     * SKU族名称
     * @return skuFamilyName
     */
    public String getSkuFamilyName() {
        return skuFamilyName;
    }

    public void setSkuFamilyName(String skuFamilyName) {
        this.skuFamilyName = skuFamilyName;
    }

    public CategoryQuotingItem withSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }

    /**
     * 归属站点编码
     * @return siteCode
     */
    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    public CategoryQuotingItem withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * 区域编码
     * @return regionCode
     */
    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public CategoryQuotingItem withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * 区域名称
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public CategoryQuotingItem withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    /**
     * 可用区AZ编码
     * @return azCode
     */
    public String getAzCode() {
        return azCode;
    }

    public void setAzCode(String azCode) {
        this.azCode = azCode;
    }

    public CategoryQuotingItem withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * 可用区AZ名称
     * @return azName
     */
    public String getAzName() {
        return azName;
    }

    public void setAzName(String azName) {
        this.azName = azName;
    }

    public CategoryQuotingItem withStepNo(String stepNo) {
        this.stepNo = stepNo;
        return this;
    }

    /**
     * 阶梯编号
     * @return stepNo
     */
    public String getStepNo() {
        return stepNo;
    }

    public void setStepNo(String stepNo) {
        this.stepNo = stepNo;
    }

    public CategoryQuotingItem withChargingMode(String chargingMode) {
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

    public CategoryQuotingItem withDiscountRatio(BigDecimal discountRatio) {
        this.discountRatio = discountRatio;
        return this;
    }

    /**
     * 折扣率
     * @return discountRatio
     */
    public BigDecimal getDiscountRatio() {
        return discountRatio;
    }

    public void setDiscountRatio(BigDecimal discountRatio) {
        this.discountRatio = discountRatio;
    }

    public CategoryQuotingItem withEffectiveTime(String effectiveTime) {
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

    public CategoryQuotingItem withExpireTime(String expireTime) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CategoryQuotingItem that = (CategoryQuotingItem) obj;
        return Objects.equals(this.itemId, that.itemId) && Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.cloudServiceTypeName, that.cloudServiceTypeName)
            && Objects.equals(this.commercialResourceType, that.commercialResourceType)
            && Objects.equals(this.resourceTypeCode, that.resourceTypeCode)
            && Objects.equals(this.resourceTypeName, that.resourceTypeName)
            && Objects.equals(this.skuFamilyCode, that.skuFamilyCode)
            && Objects.equals(this.skuFamilyName, that.skuFamilyName) && Objects.equals(this.siteCode, that.siteCode)
            && Objects.equals(this.regionCode, that.regionCode) && Objects.equals(this.regionName, that.regionName)
            && Objects.equals(this.azCode, that.azCode) && Objects.equals(this.azName, that.azName)
            && Objects.equals(this.stepNo, that.stepNo) && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.discountRatio, that.discountRatio)
            && Objects.equals(this.effectiveTime, that.effectiveTime)
            && Objects.equals(this.expireTime, that.expireTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId,
            cloudServiceType,
            cloudServiceTypeName,
            commercialResourceType,
            resourceTypeCode,
            resourceTypeName,
            skuFamilyCode,
            skuFamilyName,
            siteCode,
            regionCode,
            regionName,
            azCode,
            azName,
            stepNo,
            chargingMode,
            discountRatio,
            effectiveTime,
            expireTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CategoryQuotingItem {\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    cloudServiceTypeName: ").append(toIndentedString(cloudServiceTypeName)).append("\n");
        sb.append("    commercialResourceType: ").append(toIndentedString(commercialResourceType)).append("\n");
        sb.append("    resourceTypeCode: ").append(toIndentedString(resourceTypeCode)).append("\n");
        sb.append("    resourceTypeName: ").append(toIndentedString(resourceTypeName)).append("\n");
        sb.append("    skuFamilyCode: ").append(toIndentedString(skuFamilyCode)).append("\n");
        sb.append("    skuFamilyName: ").append(toIndentedString(skuFamilyName)).append("\n");
        sb.append("    siteCode: ").append(toIndentedString(siteCode)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
        sb.append("    azName: ").append(toIndentedString(azName)).append("\n");
        sb.append("    stepNo: ").append(toIndentedString(stepNo)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    discountRatio: ").append(toIndentedString(discountRatio)).append("\n");
        sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
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
