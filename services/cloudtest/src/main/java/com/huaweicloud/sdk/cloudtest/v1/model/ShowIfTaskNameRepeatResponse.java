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
public class ShowIfTaskNameRepeatResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pageNo")

    private Integer pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pageSize")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalPage")

    private Integer totalPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalSize")

    private Integer totalSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pageList")

    private List<AlarmTemplateInfo> pageList = null;

    public ShowIfTaskNameRepeatResponse withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * 当前页
     * @return pageNo
     */
    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public ShowIfTaskNameRepeatResponse withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页大小
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ShowIfTaskNameRepeatResponse withTotalPage(Integer totalPage) {
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

    public ShowIfTaskNameRepeatResponse withTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    /**
     * 总条数
     * @return totalSize
     */
    public Integer getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    public ShowIfTaskNameRepeatResponse withPageList(List<AlarmTemplateInfo> pageList) {
        this.pageList = pageList;
        return this;
    }

    public ShowIfTaskNameRepeatResponse addPageListItem(AlarmTemplateInfo pageListItem) {
        if (this.pageList == null) {
            this.pageList = new ArrayList<>();
        }
        this.pageList.add(pageListItem);
        return this;
    }

    public ShowIfTaskNameRepeatResponse withPageList(Consumer<List<AlarmTemplateInfo>> pageListSetter) {
        if (this.pageList == null) {
            this.pageList = new ArrayList<>();
        }
        pageListSetter.accept(this.pageList);
        return this;
    }

    /**
     * 查询到的告警模板
     * @return pageList
     */
    public List<AlarmTemplateInfo> getPageList() {
        return pageList;
    }

    public void setPageList(List<AlarmTemplateInfo> pageList) {
        this.pageList = pageList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowIfTaskNameRepeatResponse that = (ShowIfTaskNameRepeatResponse) obj;
        return Objects.equals(this.pageNo, that.pageNo) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.totalPage, that.totalPage) && Objects.equals(this.totalSize, that.totalSize)
            && Objects.equals(this.pageList, that.pageList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageNo, pageSize, totalPage, totalSize, pageList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIfTaskNameRepeatResponse {\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    totalPage: ").append(toIndentedString(totalPage)).append("\n");
        sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
        sb.append("    pageList: ").append(toIndentedString(pageList)).append("\n");
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
