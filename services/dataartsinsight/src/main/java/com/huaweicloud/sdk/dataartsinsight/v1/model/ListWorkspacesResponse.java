package com.huaweicloud.sdk.dataartsinsight.v1.model;

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
public class ListWorkspacesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_data")

    private List<WorkspaceVO> pageData = null;

    public ListWorkspacesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 总条目数。
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListWorkspacesResponse withPageData(List<WorkspaceVO> pageData) {
        this.pageData = pageData;
        return this;
    }

    public ListWorkspacesResponse addPageDataItem(WorkspaceVO pageDataItem) {
        if (this.pageData == null) {
            this.pageData = new ArrayList<>();
        }
        this.pageData.add(pageDataItem);
        return this;
    }

    public ListWorkspacesResponse withPageData(Consumer<List<WorkspaceVO>> pageDataSetter) {
        if (this.pageData == null) {
            this.pageData = new ArrayList<>();
        }
        pageDataSetter.accept(this.pageData);
        return this;
    }

    /**
     * 当前页的数据，元素类型为WorkspaceVO
     * @return pageData
     */
    public List<WorkspaceVO> getPageData() {
        return pageData;
    }

    public void setPageData(List<WorkspaceVO> pageData) {
        this.pageData = pageData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWorkspacesResponse that = (ListWorkspacesResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.pageData, that.pageData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, pageData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkspacesResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    pageData: ").append(toIndentedString(pageData)).append("\n");
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
