package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class CountMultiResourcesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendor")

    private String vendor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_id")

    private String viewId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_resource")

    private Boolean isResource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    public CountMultiResourcesRequest withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * 厂商来源（默认RMS，可填RMS/ALI/AWS）
     * @return vendor
     */
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public CountMultiResourcesRequest withViewId(String viewId) {
        this.viewId = viewId;
        return this;
    }

    /**
     * 视图 id，视图模式下必填
     * @return viewId
     */
    public String getViewId() {
        return viewId;
    }

    public void setViewId(String viewId) {
        this.viewId = viewId;
    }

    public CountMultiResourcesRequest withIsResource(Boolean isResource) {
        this.isResource = isResource;
        return this;
    }

    /**
     * 是否为资源模块
     * @return isResource
     */
    public Boolean getIsResource() {
        return isResource;
    }

    public void setIsResource(Boolean isResource) {
        this.isResource = isResource;
    }

    public CountMultiResourcesRequest withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域 id
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CountMultiResourcesRequest that = (CountMultiResourcesRequest) obj;
        return Objects.equals(this.vendor, that.vendor) && Objects.equals(this.viewId, that.viewId)
            && Objects.equals(this.isResource, that.isResource) && Objects.equals(this.regionId, that.regionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendor, viewId, isResource, regionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountMultiResourcesRequest {\n");
        sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
        sb.append("    viewId: ").append(toIndentedString(viewId)).append("\n");
        sb.append("    isResource: ").append(toIndentedString(isResource)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
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
