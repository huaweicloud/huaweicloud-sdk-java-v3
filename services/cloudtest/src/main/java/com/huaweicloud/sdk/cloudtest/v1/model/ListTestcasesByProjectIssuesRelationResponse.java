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
public class ListTestcasesByProjectIssuesRelationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcases")

    private List<IssuesRelationTestCaseVo> testcases = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    private Integer pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    public ListTestcasesByProjectIssuesRelationResponse withTestcases(List<IssuesRelationTestCaseVo> testcases) {
        this.testcases = testcases;
        return this;
    }

    public ListTestcasesByProjectIssuesRelationResponse addTestcasesItem(IssuesRelationTestCaseVo testcasesItem) {
        if (this.testcases == null) {
            this.testcases = new ArrayList<>();
        }
        this.testcases.add(testcasesItem);
        return this;
    }

    public ListTestcasesByProjectIssuesRelationResponse withTestcases(
        Consumer<List<IssuesRelationTestCaseVo>> testcasesSetter) {
        if (this.testcases == null) {
            this.testcases = new ArrayList<>();
        }
        testcasesSetter.accept(this.testcases);
        return this;
    }

    /**
     * 用例详情
     * @return testcases
     */
    public List<IssuesRelationTestCaseVo> getTestcases() {
        return testcases;
    }

    public void setTestcases(List<IssuesRelationTestCaseVo> testcases) {
        this.testcases = testcases;
    }

    public ListTestcasesByProjectIssuesRelationResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 用例总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListTestcasesByProjectIssuesRelationResponse withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * 页码
     * @return pageNo
     */
    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public ListTestcasesByProjectIssuesRelationResponse withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页数量
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTestcasesByProjectIssuesRelationResponse that = (ListTestcasesByProjectIssuesRelationResponse) obj;
        return Objects.equals(this.testcases, that.testcases) && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.pageNo, that.pageNo) && Objects.equals(this.pageSize, that.pageSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testcases, totalCount, pageNo, pageSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTestcasesByProjectIssuesRelationResponse {\n");
        sb.append("    testcases: ").append(toIndentedString(testcases)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
