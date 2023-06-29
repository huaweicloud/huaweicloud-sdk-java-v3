package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 云服务详情
 */
public class ResourceProviderResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_display_name")

    private String categoryDisplayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_types")

    private List<ResourceTypeResponse> resourceTypes = null;

    public ResourceProviderResponse withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 云服务名称
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public ResourceProviderResponse withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 云服务显示名称，可以通过请求Header中的'X-Language'设置语言
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ResourceProviderResponse withCategoryDisplayName(String categoryDisplayName) {
        this.categoryDisplayName = categoryDisplayName;
        return this;
    }

    /**
     * 云服务类别显示名称，可以通过请求Header中的'X-Language'设置语言
     * @return categoryDisplayName
     */
    public String getCategoryDisplayName() {
        return categoryDisplayName;
    }

    public void setCategoryDisplayName(String categoryDisplayName) {
        this.categoryDisplayName = categoryDisplayName;
    }

    public ResourceProviderResponse withResourceTypes(List<ResourceTypeResponse> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }

    public ResourceProviderResponse addResourceTypesItem(ResourceTypeResponse resourceTypesItem) {
        if (this.resourceTypes == null) {
            this.resourceTypes = new ArrayList<>();
        }
        this.resourceTypes.add(resourceTypesItem);
        return this;
    }

    public ResourceProviderResponse withResourceTypes(Consumer<List<ResourceTypeResponse>> resourceTypesSetter) {
        if (this.resourceTypes == null) {
            this.resourceTypes = new ArrayList<>();
        }
        resourceTypesSetter.accept(this.resourceTypes);
        return this;
    }

    /**
     * 资源类型列表
     * @return resourceTypes
     */
    public List<ResourceTypeResponse> getResourceTypes() {
        return resourceTypes;
    }

    public void setResourceTypes(List<ResourceTypeResponse> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceProviderResponse that = (ResourceProviderResponse) obj;
        return Objects.equals(this.provider, that.provider) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.categoryDisplayName, that.categoryDisplayName)
            && Objects.equals(this.resourceTypes, that.resourceTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provider, displayName, categoryDisplayName, resourceTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceProviderResponse {\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    categoryDisplayName: ").append(toIndentedString(categoryDisplayName)).append("\n");
        sb.append("    resourceTypes: ").append(toIndentedString(resourceTypes)).append("\n");
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
