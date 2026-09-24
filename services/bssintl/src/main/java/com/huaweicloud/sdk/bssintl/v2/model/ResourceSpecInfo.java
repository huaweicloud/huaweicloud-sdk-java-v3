package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResourceSpecInfo
 */
public class ResourceSpecInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type_name")

    private String cloudServiceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type_name")

    private String resourceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec")

    private String resourceSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_name")

    private String resourceSpecName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private List<Attribute> attributes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "price_lists")

    private List<PriceItem> priceLists = null;

    public ResourceSpecInfo withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 云服务类型编码
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public ResourceSpecInfo withCloudServiceTypeName(String cloudServiceTypeName) {
        this.cloudServiceTypeName = cloudServiceTypeName;
        return this;
    }

    /**
     * 云服务类型名称
     * @return cloudServiceTypeName
     */
    public String getCloudServiceTypeName() {
        return cloudServiceTypeName;
    }

    public void setCloudServiceTypeName(String cloudServiceTypeName) {
        this.cloudServiceTypeName = cloudServiceTypeName;
    }

    public ResourceSpecInfo withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型编码
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ResourceSpecInfo withResourceTypeName(String resourceTypeName) {
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

    public ResourceSpecInfo withResourceSpec(String resourceSpec) {
        this.resourceSpec = resourceSpec;
        return this;
    }

    /**
     * 云服务类型的资源规格编码
     * @return resourceSpec
     */
    public String getResourceSpec() {
        return resourceSpec;
    }

    public void setResourceSpec(String resourceSpec) {
        this.resourceSpec = resourceSpec;
    }

    public ResourceSpecInfo withResourceSpecName(String resourceSpecName) {
        this.resourceSpecName = resourceSpecName;
        return this;
    }

    /**
     * 云服务类型的资源规格名称
     * @return resourceSpecName
     */
    public String getResourceSpecName() {
        return resourceSpecName;
    }

    public void setResourceSpecName(String resourceSpecName) {
        this.resourceSpecName = resourceSpecName;
    }

    public ResourceSpecInfo withAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    public ResourceSpecInfo addAttributesItem(Attribute attributesItem) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(attributesItem);
        return this;
    }

    public ResourceSpecInfo withAttributes(Consumer<List<Attribute>> attributesSetter) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        attributesSetter.accept(this.attributes);
        return this;
    }

    /**
     * 属性列表，need_attributes=true时返回属性信息。
     * @return attributes
     */
    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public ResourceSpecInfo withPriceLists(List<PriceItem> priceLists) {
        this.priceLists = priceLists;
        return this;
    }

    public ResourceSpecInfo addPriceListsItem(PriceItem priceListsItem) {
        if (this.priceLists == null) {
            this.priceLists = new ArrayList<>();
        }
        this.priceLists.add(priceListsItem);
        return this;
    }

    public ResourceSpecInfo withPriceLists(Consumer<List<PriceItem>> priceListsSetter) {
        if (this.priceLists == null) {
            this.priceLists = new ArrayList<>();
        }
        priceListsSetter.accept(this.priceLists);
        return this;
    }

    /**
     * 定价列表，need_price=true时返回定价信息。
     * @return priceLists
     */
    public List<PriceItem> getPriceLists() {
        return priceLists;
    }

    public void setPriceLists(List<PriceItem> priceLists) {
        this.priceLists = priceLists;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceSpecInfo that = (ResourceSpecInfo) obj;
        return Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.cloudServiceTypeName, that.cloudServiceTypeName)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceTypeName, that.resourceTypeName)
            && Objects.equals(this.resourceSpec, that.resourceSpec)
            && Objects.equals(this.resourceSpecName, that.resourceSpecName)
            && Objects.equals(this.attributes, that.attributes) && Objects.equals(this.priceLists, that.priceLists);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudServiceType,
            cloudServiceTypeName,
            resourceType,
            resourceTypeName,
            resourceSpec,
            resourceSpecName,
            attributes,
            priceLists);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceSpecInfo {\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    cloudServiceTypeName: ").append(toIndentedString(cloudServiceTypeName)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceTypeName: ").append(toIndentedString(resourceTypeName)).append("\n");
        sb.append("    resourceSpec: ").append(toIndentedString(resourceSpec)).append("\n");
        sb.append("    resourceSpecName: ").append(toIndentedString(resourceSpecName)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    priceLists: ").append(toIndentedString(priceLists)).append("\n");
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
