package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResourceSpecsPriceQueryReq
 */
public class ResourceSpecsPriceQueryReq {

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
    @JsonProperty(value = "filters")

    private List<ResourceSpecsPriceFilter> filters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_attributes")

    private Boolean needAttributes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_price")

    private Boolean needPrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ResourceSpecsPriceQueryReq withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 云服务类型编码，非必填，范围1-64，此参数不携带或携带值为null时，不作为筛选条件。
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public ResourceSpecsPriceQueryReq withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型编码，非必填，范围1-64，此参数不携带或携带值为null时，不作为筛选条件。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ResourceSpecsPriceQueryReq withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * 区域编码，必填，范围1-64。
     * @return regionCode
     */
    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public ResourceSpecsPriceQueryReq withFilters(List<ResourceSpecsPriceFilter> filters) {
        this.filters = filters;
        return this;
    }

    public ResourceSpecsPriceQueryReq addFiltersItem(ResourceSpecsPriceFilter filtersItem) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filtersItem);
        return this;
    }

    public ResourceSpecsPriceQueryReq withFilters(Consumer<List<ResourceSpecsPriceFilter>> filtersSetter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        filtersSetter.accept(this.filters);
        return this;
    }

    /**
     * 过滤条件列表，非必填，最多1个。此参数不携带或携带值为空列表或携带值为null时，不作为筛选条件。
     * @return filters
     */
    public List<ResourceSpecsPriceFilter> getFilters() {
        return filters;
    }

    public void setFilters(List<ResourceSpecsPriceFilter> filters) {
        this.filters = filters;
    }

    public ResourceSpecsPriceQueryReq withNeedAttributes(Boolean needAttributes) {
        this.needAttributes = needAttributes;
        return this;
    }

    /**
     * 是否返回资源规格属性信息，非必填，false：不返回（默认）true：返回
     * @return needAttributes
     */
    public Boolean getNeedAttributes() {
        return needAttributes;
    }

    public void setNeedAttributes(Boolean needAttributes) {
        this.needAttributes = needAttributes;
    }

    public ResourceSpecsPriceQueryReq withNeedPrice(Boolean needPrice) {
        this.needPrice = needPrice;
        return this;
    }

    /**
     * 是否返回资源规格官网定价信息，非必填，false：不返回（默认）true：返回
     * @return needPrice
     */
    public Boolean getNeedPrice() {
        return needPrice;
    }

    public void setNeedPrice(Boolean needPrice) {
        this.needPrice = needPrice;
    }

    public ResourceSpecsPriceQueryReq withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 翻页信息，非必填，首页查询不携带此参数或携带值为null，非首页查询传入上一页响应返回的next_marker
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ResourceSpecsPriceQueryReq withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询条数，非必填，取值范围1-50，默认值50
     * minimum: 1
     * maximum: 50
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
        ResourceSpecsPriceQueryReq that = (ResourceSpecsPriceQueryReq) obj;
        return Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.regionCode, that.regionCode)
            && Objects.equals(this.filters, that.filters) && Objects.equals(this.needAttributes, that.needAttributes)
            && Objects.equals(this.needPrice, that.needPrice) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(cloudServiceType, resourceType, regionCode, filters, needAttributes, needPrice, marker, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceSpecsPriceQueryReq {\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
        sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
        sb.append("    needAttributes: ").append(toIndentedString(needAttributes)).append("\n");
        sb.append("    needPrice: ").append(toIndentedString(needPrice)).append("\n");
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
