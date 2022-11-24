package com.huaweicloud.sdk.tms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ProviderResponseBody
 */
public class ProviderResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_i18n_display_name")

    private String providerI18nDisplayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_types")

    private List<ResourceTypeBody> resourceTypes = null;

    public ProviderResponseBody withProvider(String provider) {
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

    public ProviderResponseBody withProviderI18nDisplayName(String providerI18nDisplayName) {
        this.providerI18nDisplayName = providerI18nDisplayName;
        return this;
    }

    /**
     * 服务显示名称，可以通过参数中'locale'设置语言。
     * @return providerI18nDisplayName
     */
    public String getProviderI18nDisplayName() {
        return providerI18nDisplayName;
    }

    public void setProviderI18nDisplayName(String providerI18nDisplayName) {
        this.providerI18nDisplayName = providerI18nDisplayName;
    }

    public ProviderResponseBody withResourceTypes(List<ResourceTypeBody> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }

    public ProviderResponseBody addResourceTypesItem(ResourceTypeBody resourceTypesItem) {
        if (this.resourceTypes == null) {
            this.resourceTypes = new ArrayList<>();
        }
        this.resourceTypes.add(resourceTypesItem);
        return this;
    }

    public ProviderResponseBody withResourceTypes(Consumer<List<ResourceTypeBody>> resourceTypesSetter) {
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
    public List<ResourceTypeBody> getResourceTypes() {
        return resourceTypes;
    }

    public void setResourceTypes(List<ResourceTypeBody> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProviderResponseBody providerResponseBody = (ProviderResponseBody) o;
        return Objects.equals(this.provider, providerResponseBody.provider)
            && Objects.equals(this.providerI18nDisplayName, providerResponseBody.providerI18nDisplayName)
            && Objects.equals(this.resourceTypes, providerResponseBody.resourceTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provider, providerI18nDisplayName, resourceTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProviderResponseBody {\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    providerI18nDisplayName: ").append(toIndentedString(providerI18nDisplayName)).append("\n");
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
