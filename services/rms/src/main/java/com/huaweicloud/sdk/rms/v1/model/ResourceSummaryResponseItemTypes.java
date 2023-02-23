package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源类型
 */
public class ResourceSummaryResponseItemTypes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regions")

    private List<ResourceSummaryResponseItemRegions> regions = null;

    public ResourceSummaryResponseItemTypes withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 资源类型名称
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ResourceSummaryResponseItemTypes withRegions(List<ResourceSummaryResponseItemRegions> regions) {
        this.regions = regions;
        return this;
    }

    public ResourceSummaryResponseItemTypes addRegionsItem(ResourceSummaryResponseItemRegions regionsItem) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        this.regions.add(regionsItem);
        return this;
    }

    public ResourceSummaryResponseItemTypes withRegions(
        Consumer<List<ResourceSummaryResponseItemRegions>> regionsSetter) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        regionsSetter.accept(this.regions);
        return this;
    }

    /**
     * 区域列表
     * @return regions
     */
    public List<ResourceSummaryResponseItemRegions> getRegions() {
        return regions;
    }

    public void setRegions(List<ResourceSummaryResponseItemRegions> regions) {
        this.regions = regions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceSummaryResponseItemTypes resourceSummaryResponseItemTypes = (ResourceSummaryResponseItemTypes) o;
        return Objects.equals(this.type, resourceSummaryResponseItemTypes.type)
            && Objects.equals(this.regions, resourceSummaryResponseItemTypes.regions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, regions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceSummaryResponseItemTypes {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
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
