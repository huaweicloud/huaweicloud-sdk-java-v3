package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResourceSpecsQueryReq
 */
public class ResourceSpecsQueryReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_code")

    private String regionCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private String chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filters")

    private List<ResourceSpecsFilter> filters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ResourceSpecsQueryReq withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * |参数名称：云服务类型编码| |参数的约束及描述：必填，云服务类型编码|
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public ResourceSpecsQueryReq withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * |参数名称：资源类型编码| |参数的约束及描述：必填，资源类型编码|
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ResourceSpecsQueryReq withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * |参数名称：区域编码| |参数的约束及描述：必填，区域编码|
     * @return regionCode
     */
    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public ResourceSpecsQueryReq withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * |参数名称：计费模式| |参数的约束及描述：必填，1：包年/包月，3：按需|
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public ResourceSpecsQueryReq withFilters(List<ResourceSpecsFilter> filters) {
        this.filters = filters;
        return this;
    }

    public ResourceSpecsQueryReq addFiltersItem(ResourceSpecsFilter filtersItem) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filtersItem);
        return this;
    }

    public ResourceSpecsQueryReq withFilters(Consumer<List<ResourceSpecsFilter>> filtersSetter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        filtersSetter.accept(this.filters);
        return this;
    }

    /**
     * |参数名称：过滤条件| |参数的约束及描述：非必填，过滤条件列表，最多1个|
     * @return filters
     */
    public List<ResourceSpecsFilter> getFilters() {
        return filters;
    }

    public void setFilters(List<ResourceSpecsFilter> filters) {
        this.filters = filters;
    }

    public ResourceSpecsQueryReq withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * |参数名称：翻页信息| |参数的约束及描述：非必填，首页查询不携带此参数，非首页查询传入上一页响应返回的next_marker|
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ResourceSpecsQueryReq withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * |参数名称：查询条数| |参数的约束及描述：非必填，取值范围1-100，默认值100|
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceSpecsQueryReq that = (ResourceSpecsQueryReq) obj;
        return Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.regionCode, that.regionCode)
            && Objects.equals(this.chargeMode, that.chargeMode) && Objects.equals(this.filters, that.filters)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudServiceType, resourceType, regionCode, chargeMode, filters, marker, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceSpecsQueryReq {\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
