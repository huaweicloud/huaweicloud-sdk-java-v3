package com.huaweicloud.sdk.aos.v1.model;

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
public class ListStackResourcesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_resources")

    private List<StackResource> stackResources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListStackResourcesResponse withStackResources(List<StackResource> stackResources) {
        this.stackResources = stackResources;
        return this;
    }

    public ListStackResourcesResponse addStackResourcesItem(StackResource stackResourcesItem) {
        if (this.stackResources == null) {
            this.stackResources = new ArrayList<>();
        }
        this.stackResources.add(stackResourcesItem);
        return this;
    }

    public ListStackResourcesResponse withStackResources(Consumer<List<StackResource>> stackResourcesSetter) {
        if (this.stackResources == null) {
            this.stackResources = new ArrayList<>();
        }
        stackResourcesSetter.accept(this.stackResources);
        return this;
    }

    /**
     * 资源栈中所管理的资源信息列表
     * @return stackResources
     */
    public List<StackResource> getStackResources() {
        return stackResources;
    }

    public void setStackResources(List<StackResource> stackResources) {
        this.stackResources = stackResources;
    }

    public ListStackResourcesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListStackResourcesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListStackResourcesResponse that = (ListStackResourcesResponse) obj;
        return Objects.equals(this.stackResources, that.stackResources) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stackResources, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStackResourcesResponse {\n");
        sb.append("    stackResources: ").append(toIndentedString(stackResources)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
