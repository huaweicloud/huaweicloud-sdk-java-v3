package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DelResourcesReq
 */
public class DelResourcesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<Resource> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_resources")

    private List<ProductResource> productResources = null;

    public DelResourcesReq withResources(List<Resource> resources) {
        this.resources = resources;
        return this;
    }

    public DelResourcesReq addResourcesItem(Resource resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public DelResourcesReq withResources(Consumer<List<Resource>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 当资源添加方式为手动创建、资源层级为子维度时，删除资源分组中的资源只需传递删除的资源信息
     * @return resources
     */
    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public DelResourcesReq withProductResources(List<ProductResource> productResources) {
        this.productResources = productResources;
        return this;
    }

    public DelResourcesReq addProductResourcesItem(ProductResource productResourcesItem) {
        if (this.productResources == null) {
            this.productResources = new ArrayList<>();
        }
        this.productResources.add(productResourcesItem);
        return this;
    }

    public DelResourcesReq withProductResources(Consumer<List<ProductResource>> productResourcesSetter) {
        if (this.productResources == null) {
            this.productResources = new ArrayList<>();
        }
        productResourcesSetter.accept(this.productResources);
        return this;
    }

    /**
     * 当资源添加方式为手动创建、资源层级为云产品时，删除资源分组中的资源只需传递删除的资源信息
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
        DelResourcesReq that = (DelResourcesReq) obj;
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
        sb.append("class DelResourcesReq {\n");
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
