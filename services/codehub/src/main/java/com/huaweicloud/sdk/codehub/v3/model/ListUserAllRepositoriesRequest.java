package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListUserAllRepositoriesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_index")

    @JacksonXmlProperty(localName = "page_index")

    private Integer pageIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    @JacksonXmlProperty(localName = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search")

    @JacksonXmlProperty(localName = "search")

    private String search;

    public ListUserAllRepositoriesRequest withPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    /**
     * 分页索引，从1开始计数
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public ListUserAllRepositoriesRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页条目数
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListUserAllRepositoriesRequest withSearch(String search) {
        this.search = search;
        return this;
    }

    /**
     * 搜索关键字
     * @return search
     */
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListUserAllRepositoriesRequest listUserAllRepositoriesRequest = (ListUserAllRepositoriesRequest) o;
        return Objects.equals(this.pageIndex, listUserAllRepositoriesRequest.pageIndex)
            && Objects.equals(this.pageSize, listUserAllRepositoriesRequest.pageSize)
            && Objects.equals(this.search, listUserAllRepositoriesRequest.search);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageIndex, pageSize, search);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUserAllRepositoriesRequest {\n");
        sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
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
