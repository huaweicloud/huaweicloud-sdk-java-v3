package com.huaweicloud.sdk.tms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResourceTypeBody
 */
public class ResourceTypeBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type_i18n_display_name")

    private String resourceTypeI18nDisplayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regions")

    private List<String> regions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global")

    private Boolean global;

    public ResourceTypeBody withResourceType(String resourceType) {
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

    public ResourceTypeBody withResourceTypeI18nDisplayName(String resourceTypeI18nDisplayName) {
        this.resourceTypeI18nDisplayName = resourceTypeI18nDisplayName;
        return this;
    }

    /**
     * 资源类型显示名称，可以通过参数中'locale'设置语言
     * @return resourceTypeI18nDisplayName
     */
    public String getResourceTypeI18nDisplayName() {
        return resourceTypeI18nDisplayName;
    }

    public void setResourceTypeI18nDisplayName(String resourceTypeI18nDisplayName) {
        this.resourceTypeI18nDisplayName = resourceTypeI18nDisplayName;
    }

    public ResourceTypeBody withRegions(List<String> regions) {
        this.regions = regions;
        return this;
    }

    public ResourceTypeBody addRegionsItem(String regionsItem) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        this.regions.add(regionsItem);
        return this;
    }

    public ResourceTypeBody withRegions(Consumer<List<String>> regionsSetter) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        regionsSetter.accept(this.regions);
        return this;
    }

    /**
     * 支持的region列表
     * @return regions
     */
    public List<String> getRegions() {
        return regions;
    }

    public void setRegions(List<String> regions) {
        this.regions = regions;
    }

    public ResourceTypeBody withGlobal(Boolean global) {
        this.global = global;
        return this;
    }

    /**
     * 是否是全局类型的资源
     * @return global
     */
    public Boolean getGlobal() {
        return global;
    }

    public void setGlobal(Boolean global) {
        this.global = global;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceTypeBody resourceTypeBody = (ResourceTypeBody) o;
        return Objects.equals(this.resourceType, resourceTypeBody.resourceType)
            && Objects.equals(this.resourceTypeI18nDisplayName, resourceTypeBody.resourceTypeI18nDisplayName)
            && Objects.equals(this.regions, resourceTypeBody.regions)
            && Objects.equals(this.global, resourceTypeBody.global);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType, resourceTypeI18nDisplayName, regions, global);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceTypeBody {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceTypeI18nDisplayName: ")
            .append(toIndentedString(resourceTypeI18nDisplayName))
            .append("\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
        sb.append("    global: ").append(toIndentedString(global)).append("\n");
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
