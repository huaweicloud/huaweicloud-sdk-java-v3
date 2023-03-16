package com.huaweicloud.sdk.cbh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云堡垒机产品信息。
 */
public class ProductInfos {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_size_measure_id")

    private String resourceSizeMeasureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_size")

    private String resourceSize;

    public ProductInfos withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品标识，通过订购询价接口获得。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ProductInfos withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 云服务类型，填写“hws.service.type.cbh”。
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public ProductInfos withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 云堡垒机资源类型，填写“hws.resource.type.cbh.ins”。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ProductInfos withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 待创建云堡垒机规格ID，例如： - cbh.basic.50 - cbh.enhance.50 已上线的规格请参见《云堡垒机产品介绍》的“服务版本差异(https://support.huaweicloud.com/productdesc-cbh/cbh_01_0010.html)”章节。
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public ProductInfos withResourceSizeMeasureId(String resourceSizeMeasureId) {
        this.resourceSizeMeasureId = resourceSizeMeasureId;
        return this;
    }

    /**
     * 资源容量度量标识。 - 15：Mbps（购买带宽时使用） - 17：GB（购买云硬盘时使用） - 14：个/次（购买堡垒机使用）
     * @return resourceSizeMeasureId
     */
    public String getResourceSizeMeasureId() {
        return resourceSizeMeasureId;
    }

    public void setResourceSizeMeasureId(String resourceSizeMeasureId) {
        this.resourceSizeMeasureId = resourceSizeMeasureId;
    }

    public ProductInfos withResourceSize(String resourceSize) {
        this.resourceSize = resourceSize;
        return this;
    }

    /**
     * 资源容量大小。默认为1
     * @return resourceSize
     */
    public String getResourceSize() {
        return resourceSize;
    }

    public void setResourceSize(String resourceSize) {
        this.resourceSize = resourceSize;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductInfos productInfos = (ProductInfos) o;
        return Objects.equals(this.productId, productInfos.productId)
            && Objects.equals(this.cloudServiceType, productInfos.cloudServiceType)
            && Objects.equals(this.resourceType, productInfos.resourceType)
            && Objects.equals(this.resourceSpecCode, productInfos.resourceSpecCode)
            && Objects.equals(this.resourceSizeMeasureId, productInfos.resourceSizeMeasureId)
            && Objects.equals(this.resourceSize, productInfos.resourceSize);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(productId, cloudServiceType, resourceType, resourceSpecCode, resourceSizeMeasureId, resourceSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductInfos {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    resourceSizeMeasureId: ").append(toIndentedString(resourceSizeMeasureId)).append("\n");
        sb.append("    resourceSize: ").append(toIndentedString(resourceSize)).append("\n");
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
