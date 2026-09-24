package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListResourceSpecsPriceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private ResourceSpecsPricePageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_code")

    private String regionCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_infos")

    private List<ResourceSpecInfo> resourceSpecInfos = null;

    public ListResourceSpecsPriceResponse withPageInfo(ResourceSpecsPricePageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListResourceSpecsPriceResponse withPageInfo(Consumer<ResourceSpecsPricePageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new ResourceSpecsPricePageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public ResourceSpecsPricePageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(ResourceSpecsPricePageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ListResourceSpecsPriceResponse withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * 云服务区编码
     * @return regionCode
     */
    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public ListResourceSpecsPriceResponse withResourceSpecInfos(List<ResourceSpecInfo> resourceSpecInfos) {
        this.resourceSpecInfos = resourceSpecInfos;
        return this;
    }

    public ListResourceSpecsPriceResponse addResourceSpecInfosItem(ResourceSpecInfo resourceSpecInfosItem) {
        if (this.resourceSpecInfos == null) {
            this.resourceSpecInfos = new ArrayList<>();
        }
        this.resourceSpecInfos.add(resourceSpecInfosItem);
        return this;
    }

    public ListResourceSpecsPriceResponse withResourceSpecInfos(
        Consumer<List<ResourceSpecInfo>> resourceSpecInfosSetter) {
        if (this.resourceSpecInfos == null) {
            this.resourceSpecInfos = new ArrayList<>();
        }
        resourceSpecInfosSetter.accept(this.resourceSpecInfos);
        return this;
    }

    /**
     * 资源规格列表
     * @return resourceSpecInfos
     */
    public List<ResourceSpecInfo> getResourceSpecInfos() {
        return resourceSpecInfos;
    }

    public void setResourceSpecInfos(List<ResourceSpecInfo> resourceSpecInfos) {
        this.resourceSpecInfos = resourceSpecInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListResourceSpecsPriceResponse that = (ListResourceSpecsPriceResponse) obj;
        return Objects.equals(this.pageInfo, that.pageInfo) && Objects.equals(this.regionCode, that.regionCode)
            && Objects.equals(this.resourceSpecInfos, that.resourceSpecInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageInfo, regionCode, resourceSpecInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceSpecsPriceResponse {\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
        sb.append("    resourceSpecInfos: ").append(toIndentedString(resourceSpecInfos)).append("\n");
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
