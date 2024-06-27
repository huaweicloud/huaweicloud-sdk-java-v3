package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PageResultBasicAWInfo
 */
public class PageResultBasicAWInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_list")

    private List<BasicAWInfo> pageList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    private Integer pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_page")

    private Integer totalPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_size")

    private Long totalSize;

    public PageResultBasicAWInfo withPageList(List<BasicAWInfo> pageList) {
        this.pageList = pageList;
        return this;
    }

    public PageResultBasicAWInfo addPageListItem(BasicAWInfo pageListItem) {
        if (this.pageList == null) {
            this.pageList = new ArrayList<>();
        }
        this.pageList.add(pageListItem);
        return this;
    }

    public PageResultBasicAWInfo withPageList(Consumer<List<BasicAWInfo>> pageListSetter) {
        if (this.pageList == null) {
            this.pageList = new ArrayList<>();
        }
        pageListSetter.accept(this.pageList);
        return this;
    }

    /**
     * 当前页数据
     * @return pageList
     */
    public List<BasicAWInfo> getPageList() {
        return pageList;
    }

    public void setPageList(List<BasicAWInfo> pageList) {
        this.pageList = pageList;
    }

    public PageResultBasicAWInfo withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * 当前页数
     * @return pageNo
     */
    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public PageResultBasicAWInfo withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页条数
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public PageResultBasicAWInfo withTotalPage(Integer totalPage) {
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

    public PageResultBasicAWInfo withTotalSize(Long totalSize) {
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
        PageResultBasicAWInfo that = (PageResultBasicAWInfo) obj;
        return Objects.equals(this.pageList, that.pageList) && Objects.equals(this.pageNo, that.pageNo)
            && Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.totalPage, that.totalPage)
            && Objects.equals(this.totalSize, that.totalSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageList, pageNo, pageSize, totalPage, totalSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PageResultBasicAWInfo {\n");
        sb.append("    pageList: ").append(toIndentedString(pageList)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
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
