package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源概要信息
 */
public class ResourceSummaryResponseItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "types")

    private List<ResourceSummaryResponseItemTypes> types = null;

    public ResourceSummaryResponseItem withProvider(String provider) {
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

    public ResourceSummaryResponseItem withTypes(List<ResourceSummaryResponseItemTypes> types) {
        this.types = types;
        return this;
    }

    public ResourceSummaryResponseItem addTypesItem(ResourceSummaryResponseItemTypes typesItem) {
        if (this.types == null) {
            this.types = new ArrayList<>();
        }
        this.types.add(typesItem);
        return this;
    }

    public ResourceSummaryResponseItem withTypes(Consumer<List<ResourceSummaryResponseItemTypes>> typesSetter) {
        if (this.types == null) {
            this.types = new ArrayList<>();
        }
        typesSetter.accept(this.types);
        return this;
    }

    /**
     * 资源类型列表
     * @return types
     */
    public List<ResourceSummaryResponseItemTypes> getTypes() {
        return types;
    }

    public void setTypes(List<ResourceSummaryResponseItemTypes> types) {
        this.types = types;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceSummaryResponseItem resourceSummaryResponseItem = (ResourceSummaryResponseItem) o;
        return Objects.equals(this.provider, resourceSummaryResponseItem.provider)
            && Objects.equals(this.types, resourceSummaryResponseItem.types);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provider, types);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceSummaryResponseItem {\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    types: ").append(toIndentedString(types)).append("\n");
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
