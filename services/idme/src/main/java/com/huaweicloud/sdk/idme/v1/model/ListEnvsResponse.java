package com.huaweicloud.sdk.idme.v1.model;

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
public class ListEnvsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_num")

    private Integer pageNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_size")

    private Integer totalSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_pages")

    private Integer totalPages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<ListEnvsResponseBodyResult> result = null;

    public ListEnvsResponse withPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * 分页查询的页数。
     * @return pageNum
     */
    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public ListEnvsResponse withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 分页查询时，每页最多展示的记录数。
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListEnvsResponse withTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    /**
     * 总共条数。
     * @return totalSize
     */
    public Integer getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    public ListEnvsResponse withTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    /**
     * 总共页数。
     * @return totalPages
     */
    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public ListEnvsResponse withResult(List<ListEnvsResponseBodyResult> result) {
        this.result = result;
        return this;
    }

    public ListEnvsResponse addResultItem(ListEnvsResponseBodyResult resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public ListEnvsResponse withResult(Consumer<List<ListEnvsResponseBodyResult>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * 运行服务详情。
     * @return result
     */
    public List<ListEnvsResponseBodyResult> getResult() {
        return result;
    }

    public void setResult(List<ListEnvsResponseBodyResult> result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEnvsResponse that = (ListEnvsResponse) obj;
        return Objects.equals(this.pageNum, that.pageNum) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.totalSize, that.totalSize) && Objects.equals(this.totalPages, that.totalPages)
            && Objects.equals(this.result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageNum, pageSize, totalSize, totalPages, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnvsResponse {\n");
        sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
        sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
