package com.huaweicloud.sdk.cloudtest.v1.model;

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
public class ListUsingGetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list")

    private List<DashboardDto> list = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_num")

    private Integer pageNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_page")

    private Integer totalPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_size")

    private Long totalSize;

    public ListUsingGetResponse withList(List<DashboardDto> list) {
        this.list = list;
        return this;
    }

    public ListUsingGetResponse addListItem(DashboardDto listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public ListUsingGetResponse withList(Consumer<List<DashboardDto>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * 返回结果
     * @return list
     */
    public List<DashboardDto> getList() {
        return list;
    }

    public void setList(List<DashboardDto> list) {
        this.list = list;
    }

    public ListUsingGetResponse withPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * 页码
     * @return pageNum
     */
    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public ListUsingGetResponse withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 分页大小
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListUsingGetResponse withTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    /**
     * 总页数
     * @return totalPage
     */
    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public ListUsingGetResponse withTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    /**
     * 总条数
     * @return totalSize
     */
    public Long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListUsingGetResponse that = (ListUsingGetResponse) obj;
        return Objects.equals(this.list, that.list) && Objects.equals(this.pageNum, that.pageNum)
            && Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.totalPage, that.totalPage)
            && Objects.equals(this.totalSize, that.totalSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list, pageNum, pageSize, totalPage, totalSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUsingGetResponse {\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
        sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    totalPage: ").append(toIndentedString(totalPage)).append("\n");
        sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
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
