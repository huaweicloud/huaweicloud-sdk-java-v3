package com.huaweicloud.sdk.codeartsinspector.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ProductInfo
 */
public class ProductInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_speccode")

    private String resourceSpeccode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resouce_size_measure_id")

    private Integer resouceSizeMeasureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_size")

    private Integer resourceSize;

    public ProductInfo withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 用户购买的云服务的主云服务类型
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public ProductInfo withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品标识，通过订购询价接口获得
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ProductInfo withResourceSpeccode(String resourceSpeccode) {
        this.resourceSpeccode = resourceSpeccode;
        return this;
    }

    /**
     * 用户购买云服务产品的资源规格
     * @return resourceSpeccode
     */
    public String getResourceSpeccode() {
        return resourceSpeccode;
    }

    public void setResourceSpeccode(String resourceSpeccode) {
        this.resourceSpeccode = resourceSpeccode;
    }

    public ProductInfo withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 用户购买云服务产品的资源类型
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ProductInfo withResouceSizeMeasureId(Integer resouceSizeMeasureId) {
        this.resouceSizeMeasureId = resouceSizeMeasureId;
        return this;
    }

    /**
     * 资源容量度量标识，购买vss服务时使用14： 15：Mbps（购买带宽时使用） 17：GB（购买云硬盘时使用） 14：个/次
     * @return resouceSizeMeasureId
     */
    public Integer getResouceSizeMeasureId() {
        return resouceSizeMeasureId;
    }

    public void setResouceSizeMeasureId(Integer resouceSizeMeasureId) {
        this.resouceSizeMeasureId = resouceSizeMeasureId;
    }

    public ProductInfo withResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
        return this;
    }

    /**
     * 资源容量大小
     * @return resourceSize
     */
    public Integer getResourceSize() {
        return resourceSize;
    }

    public void setResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductInfo that = (ProductInfo) obj;
        return Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.productId, that.productId)
            && Objects.equals(this.resourceSpeccode, that.resourceSpeccode)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resouceSizeMeasureId, that.resouceSizeMeasureId)
            && Objects.equals(this.resourceSize, that.resourceSize);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(cloudServiceType, productId, resourceSpeccode, resourceType, resouceSizeMeasureId, resourceSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductInfo {\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    resourceSpeccode: ").append(toIndentedString(resourceSpeccode)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resouceSizeMeasureId: ").append(toIndentedString(resouceSizeMeasureId)).append("\n");
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
