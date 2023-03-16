package com.huaweicloud.sdk.organizations.v1.model;

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
public class ListRootsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roots")

    private List<RootDto> roots = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListRootsResponse withRoots(List<RootDto> roots) {
        this.roots = roots;
        return this;
    }

    public ListRootsResponse addRootsItem(RootDto rootsItem) {
        if (this.roots == null) {
            this.roots = new ArrayList<>();
        }
        this.roots.add(rootsItem);
        return this;
    }

    public ListRootsResponse withRoots(Consumer<List<RootDto>> rootsSetter) {
        if (this.roots == null) {
            this.roots = new ArrayList<>();
        }
        rootsSetter.accept(this.roots);
        return this;
    }

    /**
     * 在组织中定义的根列表。
     * @return roots
     */
    public List<RootDto> getRoots() {
        return roots;
    }

    public void setRoots(List<RootDto> roots) {
        this.roots = roots;
    }

    public ListRootsResponse withPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListRootsResponse withPageInfo(Consumer<PageInfoDto> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfoDto();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfoDto getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRootsResponse listRootsResponse = (ListRootsResponse) o;
        return Objects.equals(this.roots, listRootsResponse.roots)
            && Objects.equals(this.pageInfo, listRootsResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roots, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRootsResponse {\n");
        sb.append("    roots: ").append(toIndentedString(roots)).append("\n");
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
