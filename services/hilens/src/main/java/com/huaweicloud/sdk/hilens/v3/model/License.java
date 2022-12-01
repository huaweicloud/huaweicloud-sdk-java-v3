package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * License
 */
public class License {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_limit")

    private Integer channelLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_model")

    private Integer chargingModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hilens_resource_spec_code")

    private String hilensResourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_type")

    private String measureType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_unit")

    private String measureUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offline_flag")

    private Integer offlineFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_limit")

    private Integer orderLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_info")

    private List<ProductInfo> productInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_step_size")

    private Integer resourceStepSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validity")

    private Integer validity;

    public License withChannelLimit(Integer channelLimit) {
        this.channelLimit = channelLimit;
        return this;
    }

    /**
     * Get channelLimit
     * @return channelLimit
     */
    public Integer getChannelLimit() {
        return channelLimit;
    }

    public void setChannelLimit(Integer channelLimit) {
        this.channelLimit = channelLimit;
    }

    public License withChargingModel(Integer chargingModel) {
        this.chargingModel = chargingModel;
        return this;
    }

    /**
     * Get chargingModel
     * @return chargingModel
     */
    public Integer getChargingModel() {
        return chargingModel;
    }

    public void setChargingModel(Integer chargingModel) {
        this.chargingModel = chargingModel;
    }

    public License withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * Get cloudServiceType
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public License withHilensResourceSpecCode(String hilensResourceSpecCode) {
        this.hilensResourceSpecCode = hilensResourceSpecCode;
        return this;
    }

    /**
     * Get hilensResourceSpecCode
     * @return hilensResourceSpecCode
     */
    public String getHilensResourceSpecCode() {
        return hilensResourceSpecCode;
    }

    public void setHilensResourceSpecCode(String hilensResourceSpecCode) {
        this.hilensResourceSpecCode = hilensResourceSpecCode;
    }

    public License withMeasureType(String measureType) {
        this.measureType = measureType;
        return this;
    }

    /**
     * Get measureType
     * @return measureType
     */
    public String getMeasureType() {
        return measureType;
    }

    public void setMeasureType(String measureType) {
        this.measureType = measureType;
    }

    public License withMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
        return this;
    }

    /**
     * Get measureUnit
     * @return measureUnit
     */
    public String getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
    }

    public License withOfflineFlag(Integer offlineFlag) {
        this.offlineFlag = offlineFlag;
        return this;
    }

    /**
     * Get offlineFlag
     * @return offlineFlag
     */
    public Integer getOfflineFlag() {
        return offlineFlag;
    }

    public void setOfflineFlag(Integer offlineFlag) {
        this.offlineFlag = offlineFlag;
    }

    public License withOrderLimit(Integer orderLimit) {
        this.orderLimit = orderLimit;
        return this;
    }

    /**
     * Get orderLimit
     * @return orderLimit
     */
    public Integer getOrderLimit() {
        return orderLimit;
    }

    public void setOrderLimit(Integer orderLimit) {
        this.orderLimit = orderLimit;
    }

    public License withProductInfo(List<ProductInfo> productInfo) {
        this.productInfo = productInfo;
        return this;
    }

    public License addProductInfoItem(ProductInfo productInfoItem) {
        if (this.productInfo == null) {
            this.productInfo = new ArrayList<>();
        }
        this.productInfo.add(productInfoItem);
        return this;
    }

    public License withProductInfo(Consumer<List<ProductInfo>> productInfoSetter) {
        if (this.productInfo == null) {
            this.productInfo = new ArrayList<>();
        }
        productInfoSetter.accept(this.productInfo);
        return this;
    }

    /**
     * Get productInfo
     * @return productInfo
     */
    public List<ProductInfo> getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(List<ProductInfo> productInfo) {
        this.productInfo = productInfo;
    }

    public License withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * Get resourceSpecCode
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public License withResourceStepSize(Integer resourceStepSize) {
        this.resourceStepSize = resourceStepSize;
        return this;
    }

    /**
     * Get resourceStepSize
     * @return resourceStepSize
     */
    public Integer getResourceStepSize() {
        return resourceStepSize;
    }

    public void setResourceStepSize(Integer resourceStepSize) {
        this.resourceStepSize = resourceStepSize;
    }

    public License withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get resourceType
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public License withValidity(Integer validity) {
        this.validity = validity;
        return this;
    }

    /**
     * Get validity
     * @return validity
     */
    public Integer getValidity() {
        return validity;
    }

    public void setValidity(Integer validity) {
        this.validity = validity;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        License license = (License) o;
        return Objects.equals(this.channelLimit, license.channelLimit)
            && Objects.equals(this.chargingModel, license.chargingModel)
            && Objects.equals(this.cloudServiceType, license.cloudServiceType)
            && Objects.equals(this.hilensResourceSpecCode, license.hilensResourceSpecCode)
            && Objects.equals(this.measureType, license.measureType)
            && Objects.equals(this.measureUnit, license.measureUnit)
            && Objects.equals(this.offlineFlag, license.offlineFlag)
            && Objects.equals(this.orderLimit, license.orderLimit)
            && Objects.equals(this.productInfo, license.productInfo)
            && Objects.equals(this.resourceSpecCode, license.resourceSpecCode)
            && Objects.equals(this.resourceStepSize, license.resourceStepSize)
            && Objects.equals(this.resourceType, license.resourceType)
            && Objects.equals(this.validity, license.validity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelLimit,
            chargingModel,
            cloudServiceType,
            hilensResourceSpecCode,
            measureType,
            measureUnit,
            offlineFlag,
            orderLimit,
            productInfo,
            resourceSpecCode,
            resourceStepSize,
            resourceType,
            validity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class License {\n");
        sb.append("    channelLimit: ").append(toIndentedString(channelLimit)).append("\n");
        sb.append("    chargingModel: ").append(toIndentedString(chargingModel)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    hilensResourceSpecCode: ").append(toIndentedString(hilensResourceSpecCode)).append("\n");
        sb.append("    measureType: ").append(toIndentedString(measureType)).append("\n");
        sb.append("    measureUnit: ").append(toIndentedString(measureUnit)).append("\n");
        sb.append("    offlineFlag: ").append(toIndentedString(offlineFlag)).append("\n");
        sb.append("    orderLimit: ").append(toIndentedString(orderLimit)).append("\n");
        sb.append("    productInfo: ").append(toIndentedString(productInfo)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    resourceStepSize: ").append(toIndentedString(resourceStepSize)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
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
