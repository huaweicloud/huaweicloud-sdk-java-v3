package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ProductInfoBeanNew
 */
public class ProductInfoBeanNew {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_resource_names")

    private List<String> allResourceNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_id")

    private String displayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_spec_desc")

    private String productSpecDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    public ProductInfoBeanNew withAllResourceNames(List<String> allResourceNames) {
        this.allResourceNames = allResourceNames;
        return this;
    }

    public ProductInfoBeanNew addAllResourceNamesItem(String allResourceNamesItem) {
        if (this.allResourceNames == null) {
            this.allResourceNames = new ArrayList<>();
        }
        this.allResourceNames.add(allResourceNamesItem);
        return this;
    }

    public ProductInfoBeanNew withAllResourceNames(Consumer<List<String>> allResourceNamesSetter) {
        if (this.allResourceNames == null) {
            this.allResourceNames = new ArrayList<>();
        }
        allResourceNamesSetter.accept(this.allResourceNames);
        return this;
    }

    /**
     * 所有资源名称
     * @return allResourceNames
     */
    public List<String> getAllResourceNames() {
        return allResourceNames;
    }

    public void setAllResourceNames(List<String> allResourceNames) {
        this.allResourceNames = allResourceNames;
    }

    public ProductInfoBeanNew withCloudServiceType(String cloudServiceType) {
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

    public ProductInfoBeanNew withDisplayId(String displayId) {
        this.displayId = displayId;
        return this;
    }

    /**
     * 显示ID
     * @return displayId
     */
    public String getDisplayId() {
        return displayId;
    }

    public void setDisplayId(String displayId) {
        this.displayId = displayId;
    }

    public ProductInfoBeanNew withProductId(String productId) {
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

    public ProductInfoBeanNew withProductSpecDesc(String productSpecDesc) {
        this.productSpecDesc = productSpecDesc;
        return this;
    }

    /**
     * 产品规格描述
     * @return productSpecDesc
     */
    public String getProductSpecDesc() {
        return productSpecDesc;
    }

    public void setProductSpecDesc(String productSpecDesc) {
        this.productSpecDesc = productSpecDesc;
    }

    public ProductInfoBeanNew withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ProductInfoBeanNew withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 资源规格
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public ProductInfoBeanNew withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductInfoBeanNew that = (ProductInfoBeanNew) obj;
        return Objects.equals(this.allResourceNames, that.allResourceNames)
            && Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.displayId, that.displayId) && Objects.equals(this.productId, that.productId)
            && Objects.equals(this.productSpecDesc, that.productSpecDesc)
            && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.resourceType, that.resourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allResourceNames,
            cloudServiceType,
            displayId,
            productId,
            productSpecDesc,
            resourceName,
            resourceSpecCode,
            resourceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductInfoBeanNew {\n");
        sb.append("    allResourceNames: ").append(toIndentedString(allResourceNames)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    displayId: ").append(toIndentedString(displayId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productSpecDesc: ").append(toIndentedString(productSpecDesc)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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
