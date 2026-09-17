package com.huaweicloud.sdk.iotedge.v3.model;

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
public class ShowClusterResourcesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDTO pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_list")

    private List<ResourceDetail> resourceList = null;

    public ShowClusterResourcesResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 总记录数
     * minimum: 0
     * maximum: 1000000
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ShowClusterResourcesResponse withPageInfo(PageInfoDTO pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ShowClusterResourcesResponse withPageInfo(Consumer<PageInfoDTO> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfoDTO();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfoDTO getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoDTO pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ShowClusterResourcesResponse withResourceList(List<ResourceDetail> resourceList) {
        this.resourceList = resourceList;
        return this;
    }

    public ShowClusterResourcesResponse addResourceListItem(ResourceDetail resourceListItem) {
        if (this.resourceList == null) {
            this.resourceList = new ArrayList<>();
        }
        this.resourceList.add(resourceListItem);
        return this;
    }

    public ShowClusterResourcesResponse withResourceList(Consumer<List<ResourceDetail>> resourceListSetter) {
        if (this.resourceList == null) {
            this.resourceList = new ArrayList<>();
        }
        resourceListSetter.accept(this.resourceList);
        return this;
    }

    /**
     * 查询资源列表返回消息体
     * @return resourceList
     */
    public List<ResourceDetail> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<ResourceDetail> resourceList) {
        this.resourceList = resourceList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowClusterResourcesResponse that = (ShowClusterResourcesResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.resourceList, that.resourceList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, pageInfo, resourceList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusterResourcesResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    resourceList: ").append(toIndentedString(resourceList)).append("\n");
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
