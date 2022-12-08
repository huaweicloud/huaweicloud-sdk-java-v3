package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 产品信息
 */
public class ProductInfoBean {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allResourceNames")

    private List<String> allResourceNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloudServiceType")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "displayId")

    private String displayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "productId")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "productSpecDesc")

    private String productSpecDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceName")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceSize")

    private Integer resourceSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceSizeMeasureId")

    private Integer resourceSizeMeasureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceSpecCode")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceType")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usageFactor")

    private String usageFactor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usageMeasureId")

    private Integer usageMeasureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usageValue")

    private Double usageValue;

    public ProductInfoBean withAllResourceNames(List<String> allResourceNames) {
        this.allResourceNames = allResourceNames;
        return this;
    }

    public ProductInfoBean addAllResourceNamesItem(String allResourceNamesItem) {
        if (this.allResourceNames == null) {
            this.allResourceNames = new ArrayList<>();
        }
        this.allResourceNames.add(allResourceNamesItem);
        return this;
    }

    public ProductInfoBean withAllResourceNames(Consumer<List<String>> allResourceNamesSetter) {
        if (this.allResourceNames == null) {
            this.allResourceNames = new ArrayList<>();
        }
        allResourceNamesSetter.accept(this.allResourceNames);
        return this;
    }

    /**
     * 资源名称列表
     * @return allResourceNames
     */
    public List<String> getAllResourceNames() {
        return allResourceNames;
    }

    public void setAllResourceNames(List<String> allResourceNames) {
        this.allResourceNames = allResourceNames;
    }

    public ProductInfoBean withCloudServiceType(String cloudServiceType) {
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

    public ProductInfoBean withDisplayId(String displayId) {
        this.displayId = displayId;
        return this;
    }

    /**
     * 展示ID
     * @return displayId
     */
    public String getDisplayId() {
        return displayId;
    }

    public void setDisplayId(String displayId) {
        this.displayId = displayId;
    }

    public ProductInfoBean withProductId(String productId) {
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

    public ProductInfoBean withProductSpecDesc(String productSpecDesc) {
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

    public ProductInfoBean withResourceName(String resourceName) {
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

    public ProductInfoBean withResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
        return this;
    }

    /**
     * 产品支持的数据库数量，或者支持obs的扫描量
     * @return resourceSize
     */
    public Integer getResourceSize() {
        return resourceSize;
    }

    public void setResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
    }

    public ProductInfoBean withResourceSizeMeasureId(Integer resourceSizeMeasureId) {
        this.resourceSizeMeasureId = resourceSizeMeasureId;
        return this;
    }

    /**
     * 资源容量度量标识，枚举值举例如下：15：mbps（购买带宽时使用），17：gb（购买云硬盘时使用），14：个/次
     * @return resourceSizeMeasureId
     */
    public Integer getResourceSizeMeasureId() {
        return resourceSizeMeasureId;
    }

    public void setResourceSizeMeasureId(Integer resourceSizeMeasureId) {
        this.resourceSizeMeasureId = resourceSizeMeasureId;
    }

    public ProductInfoBean withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 产品编码
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public ProductInfoBean withResourceType(String resourceType) {
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

    public ProductInfoBean withUsageFactor(String usageFactor) {
        this.usageFactor = usageFactor;
        return this;
    }

    /**
     * 已使用系数
     * @return usageFactor
     */
    public String getUsageFactor() {
        return usageFactor;
    }

    public void setUsageFactor(String usageFactor) {
        this.usageFactor = usageFactor;
    }

    public ProductInfoBean withUsageMeasureId(Integer usageMeasureId) {
        this.usageMeasureId = usageMeasureId;
        return this;
    }

    /**
     * 已使用容量度量标识
     * @return usageMeasureId
     */
    public Integer getUsageMeasureId() {
        return usageMeasureId;
    }

    public void setUsageMeasureId(Integer usageMeasureId) {
        this.usageMeasureId = usageMeasureId;
    }

    public ProductInfoBean withUsageValue(Double usageValue) {
        this.usageValue = usageValue;
        return this;
    }

    /**
     * 已使用值
     * @return usageValue
     */
    public Double getUsageValue() {
        return usageValue;
    }

    public void setUsageValue(Double usageValue) {
        this.usageValue = usageValue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductInfoBean productInfoBean = (ProductInfoBean) o;
        return Objects.equals(this.allResourceNames, productInfoBean.allResourceNames)
            && Objects.equals(this.cloudServiceType, productInfoBean.cloudServiceType)
            && Objects.equals(this.displayId, productInfoBean.displayId)
            && Objects.equals(this.productId, productInfoBean.productId)
            && Objects.equals(this.productSpecDesc, productInfoBean.productSpecDesc)
            && Objects.equals(this.resourceName, productInfoBean.resourceName)
            && Objects.equals(this.resourceSize, productInfoBean.resourceSize)
            && Objects.equals(this.resourceSizeMeasureId, productInfoBean.resourceSizeMeasureId)
            && Objects.equals(this.resourceSpecCode, productInfoBean.resourceSpecCode)
            && Objects.equals(this.resourceType, productInfoBean.resourceType)
            && Objects.equals(this.usageFactor, productInfoBean.usageFactor)
            && Objects.equals(this.usageMeasureId, productInfoBean.usageMeasureId)
            && Objects.equals(this.usageValue, productInfoBean.usageValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allResourceNames,
            cloudServiceType,
            displayId,
            productId,
            productSpecDesc,
            resourceName,
            resourceSize,
            resourceSizeMeasureId,
            resourceSpecCode,
            resourceType,
            usageFactor,
            usageMeasureId,
            usageValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductInfoBean {\n");
        sb.append("    allResourceNames: ").append(toIndentedString(allResourceNames)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    displayId: ").append(toIndentedString(displayId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productSpecDesc: ").append(toIndentedString(productSpecDesc)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceSize: ").append(toIndentedString(resourceSize)).append("\n");
        sb.append("    resourceSizeMeasureId: ").append(toIndentedString(resourceSizeMeasureId)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    usageFactor: ").append(toIndentedString(usageFactor)).append("\n");
        sb.append("    usageMeasureId: ").append(toIndentedString(usageMeasureId)).append("\n");
        sb.append("    usageValue: ").append(toIndentedString(usageValue)).append("\n");
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
