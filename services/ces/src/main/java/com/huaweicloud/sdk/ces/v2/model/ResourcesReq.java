package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResourcesReq
 */
public class ResourcesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<Resource> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_resources")

    private List<ProductResource> productResources = null;

    public ResourcesReq withResources(List<Resource> resources) {
        this.resources = resources;
        return this;
    }

    public ResourcesReq addResourcesItem(Resource resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ResourcesReq withResources(Consumer<List<Resource>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 资源信息
     * @return resources
     */
    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public ResourcesReq withProductResources(List<ProductResource> productResources) {
        this.productResources = productResources;
        return this;
    }

    public ResourcesReq addProductResourcesItem(ProductResource productResourcesItem) {
        if (this.productResources == null) {
            this.productResources = new ArrayList<>();
        }
        this.productResources.add(productResourcesItem);
        return this;
    }

    public ResourcesReq withProductResources(Consumer<List<ProductResource>> productResourcesSetter) {
        if (this.productResources == null) {
            this.productResources = new ArrayList<>();
        }
        productResourcesSetter.accept(this.productResources);
        return this;
    }

    /**
     * 手动创建，选择资源层级为云产品时的资源详情
     * @return productResources
     */
    public List<ProductResource> getProductResources() {
        return productResources;
    }

    public void setProductResources(List<ProductResource> productResources) {
        this.productResources = productResources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourcesReq that = (ResourcesReq) obj;
        return Objects.equals(this.resources, that.resources)
            && Objects.equals(this.productResources, that.productResources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resources, productResources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourcesReq {\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    productResources: ").append(toIndentedString(productResources)).append("\n");
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
