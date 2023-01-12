package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FreeResourceRecord
 */
public class FreeResourceRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deduct_time")

    private String deductTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_resource_id")

    private String freeResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type_code")

    private String resourceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type_name")

    private String resourceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_tag")

    private String resourceTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    private String productName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_type_code")

    private String usageTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_amount")

    private String availableAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remaining_amount")

    private String remainingAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_amount")

    private String usedAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_time")

    private String effectiveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    public FreeResourceRecord withDeductTime(String deductTime) {
        this.deductTime = deductTime;
        return this;
    }

    /**
     * 资源抵扣时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如\"2021-10-13T10:01:49Z\"。
     * @return deductTime
     */
    public String getDeductTime() {
        return deductTime;
    }

    public void setDeductTime(String deductTime) {
        this.deductTime = deductTime;
    }

    public FreeResourceRecord withFreeResourceId(String freeResourceId) {
        this.freeResourceId = freeResourceId;
        return this;
    }

    /**
     * 资源项ID，一个资源包中会含有多个资源项，一个使用量类型对应一个资源项。
     * @return freeResourceId
     */
    public String getFreeResourceId() {
        return freeResourceId;
    }

    public void setFreeResourceId(String freeResourceId) {
        this.freeResourceId = freeResourceId;
    }

    public FreeResourceRecord withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public FreeResourceRecord withResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
        return this;
    }

    /**
     * 资源类型编码。例如ECS的VM为“hws.resource.type.vm”。
     * @return resourceTypeCode
     */
    public String getResourceTypeCode() {
        return resourceTypeCode;
    }

    public void setResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
    }

    public FreeResourceRecord withResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
        return this;
    }

    /**
     * 资源类型名称。例如ECS的资源类型名称为“云主机”。
     * @return resourceTypeName
     */
    public String getResourceTypeName() {
        return resourceTypeName;
    }

    public void setResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
    }

    public FreeResourceRecord withResourceTag(String resourceTag) {
        this.resourceTag = resourceTag;
        return this;
    }

    /**
     * 资源标签。
     * @return resourceTag
     */
    public String getResourceTag() {
        return resourceTag;
    }

    public void setResourceTag(String resourceTag) {
        this.resourceTag = resourceTag;
    }

    public FreeResourceRecord withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品ID，即资源包ID。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public FreeResourceRecord withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * 产品名称，即资源包名称。
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public FreeResourceRecord withUsageTypeCode(String usageTypeCode) {
        this.usageTypeCode = usageTypeCode;
        return this;
    }

    /**
     * 使用量类型。
     * @return usageTypeCode
     */
    public String getUsageTypeCode() {
        return usageTypeCode;
    }

    public void setUsageTypeCode(String usageTypeCode) {
        this.usageTypeCode = usageTypeCode;
    }

    public FreeResourceRecord withAvailableAmount(String availableAmount) {
        this.availableAmount = availableAmount;
        return this;
    }

    /**
     * 资源抵扣前余量。
     * @return availableAmount
     */
    public String getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(String availableAmount) {
        this.availableAmount = availableAmount;
    }

    public FreeResourceRecord withRemainingAmount(String remainingAmount) {
        this.remainingAmount = remainingAmount;
        return this;
    }

    /**
     * 资源抵扣后余量。
     * @return remainingAmount
     */
    public String getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(String remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public FreeResourceRecord withUsedAmount(String usedAmount) {
        this.usedAmount = usedAmount;
        return this;
    }

    /**
     * 抵扣量。
     * @return usedAmount
     */
    public String getUsedAmount() {
        return usedAmount;
    }

    public void setUsedAmount(String usedAmount) {
        this.usedAmount = usedAmount;
    }

    public FreeResourceRecord withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /**
     * 度量单位，免费资源套餐额度度量单位。您可以调用查询度量单位列表接口获取。
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public FreeResourceRecord withEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    /**
     * 资源使用的开始时间，UTC时间。
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public FreeResourceRecord withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 资源使用的结束时间，UTC时间。
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FreeResourceRecord freeResourceRecord = (FreeResourceRecord) o;
        return Objects.equals(this.deductTime, freeResourceRecord.deductTime)
            && Objects.equals(this.freeResourceId, freeResourceRecord.freeResourceId)
            && Objects.equals(this.resourceId, freeResourceRecord.resourceId)
            && Objects.equals(this.resourceTypeCode, freeResourceRecord.resourceTypeCode)
            && Objects.equals(this.resourceTypeName, freeResourceRecord.resourceTypeName)
            && Objects.equals(this.resourceTag, freeResourceRecord.resourceTag)
            && Objects.equals(this.productId, freeResourceRecord.productId)
            && Objects.equals(this.productName, freeResourceRecord.productName)
            && Objects.equals(this.usageTypeCode, freeResourceRecord.usageTypeCode)
            && Objects.equals(this.availableAmount, freeResourceRecord.availableAmount)
            && Objects.equals(this.remainingAmount, freeResourceRecord.remainingAmount)
            && Objects.equals(this.usedAmount, freeResourceRecord.usedAmount)
            && Objects.equals(this.measureId, freeResourceRecord.measureId)
            && Objects.equals(this.effectiveTime, freeResourceRecord.effectiveTime)
            && Objects.equals(this.expireTime, freeResourceRecord.expireTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deductTime,
            freeResourceId,
            resourceId,
            resourceTypeCode,
            resourceTypeName,
            resourceTag,
            productId,
            productName,
            usageTypeCode,
            availableAmount,
            remainingAmount,
            usedAmount,
            measureId,
            effectiveTime,
            expireTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FreeResourceRecord {\n");
        sb.append("    deductTime: ").append(toIndentedString(deductTime)).append("\n");
        sb.append("    freeResourceId: ").append(toIndentedString(freeResourceId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceTypeCode: ").append(toIndentedString(resourceTypeCode)).append("\n");
        sb.append("    resourceTypeName: ").append(toIndentedString(resourceTypeName)).append("\n");
        sb.append("    resourceTag: ").append(toIndentedString(resourceTag)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    usageTypeCode: ").append(toIndentedString(usageTypeCode)).append("\n");
        sb.append("    availableAmount: ").append(toIndentedString(availableAmount)).append("\n");
        sb.append("    remainingAmount: ").append(toIndentedString(remainingAmount)).append("\n");
        sb.append("    usedAmount: ").append(toIndentedString(usedAmount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
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
