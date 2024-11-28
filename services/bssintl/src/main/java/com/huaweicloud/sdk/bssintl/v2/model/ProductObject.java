package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ProductObject
 */
public class ProductObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_spec_desc")

    private String productSpecDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_code")

    private String categoryCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_owner_service")

    private String productOwnerService;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commercial_resource")

    private String commercialResource;

    public ProductObject withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品ID。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ProductObject withProductSpecDesc(String productSpecDesc) {
        this.productSpecDesc = productSpecDesc;
        return this;
    }

    /**
     * 产品规格描述。
     * @return productSpecDesc
     */
    public String getProductSpecDesc() {
        return productSpecDesc;
    }

    public void setProductSpecDesc(String productSpecDesc) {
        this.productSpecDesc = productSpecDesc;
    }

    public ProductObject withCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }

    /**
     * 产品目录编码。
     * @return categoryCode
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public ProductObject withProductOwnerService(String productOwnerService) {
        this.productOwnerService = productOwnerService;
        return this;
    }

    /**
     * 产品归属的云服务类型编码。
     * @return productOwnerService
     */
    public String getProductOwnerService() {
        return productOwnerService;
    }

    public void setProductOwnerService(String productOwnerService) {
        this.productOwnerService = productOwnerService;
    }

    public ProductObject withCommercialResource(String commercialResource) {
        this.commercialResource = commercialResource;
        return this;
    }

    /**
     * 商务归属的资源类型编码。
     * @return commercialResource
     */
    public String getCommercialResource() {
        return commercialResource;
    }

    public void setCommercialResource(String commercialResource) {
        this.commercialResource = commercialResource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductObject that = (ProductObject) obj;
        return Objects.equals(this.productId, that.productId)
            && Objects.equals(this.productSpecDesc, that.productSpecDesc)
            && Objects.equals(this.categoryCode, that.categoryCode)
            && Objects.equals(this.productOwnerService, that.productOwnerService)
            && Objects.equals(this.commercialResource, that.commercialResource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productSpecDesc, categoryCode, productOwnerService, commercialResource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductObject {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productSpecDesc: ").append(toIndentedString(productSpecDesc)).append("\n");
        sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
        sb.append("    productOwnerService: ").append(toIndentedString(productOwnerService)).append("\n");
        sb.append("    commercialResource: ").append(toIndentedString(commercialResource)).append("\n");
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
