package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 请求的返回的数据对象
 */
public class ResultValueQueryTestCasesByIssueVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private QueryTestCasesByIssueVo value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    private Integer pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_more")

    private Boolean hasMore;

    public ResultValueQueryTestCasesByIssueVo withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 起始记录数 大于 实际总条数时， 值为0， 分页请求才有此值
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ResultValueQueryTestCasesByIssueVo withValue(QueryTestCasesByIssueVo value) {
        this.value = value;
        return this;
    }

    public ResultValueQueryTestCasesByIssueVo withValue(Consumer<QueryTestCasesByIssueVo> valueSetter) {
        if (this.value == null) {
            this.value = new QueryTestCasesByIssueVo();
            valueSetter.accept(this.value);
        }

        return this;
    }

    /**
     * Get value
     * @return value
     */
    public QueryTestCasesByIssueVo getValue() {
        return value;
    }

    public void setValue(QueryTestCasesByIssueVo value) {
        this.value = value;
    }

    public ResultValueQueryTestCasesByIssueVo withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 业务失败的提示内容，对内接口才有此值
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultValueQueryTestCasesByIssueVo withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Get pageSize
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ResultValueQueryTestCasesByIssueVo withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * Get pageNo
     * @return pageNo
     */
    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public ResultValueQueryTestCasesByIssueVo withHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    /**
     * Get hasMore
     * @return hasMore
     */
    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResultValueQueryTestCasesByIssueVo that = (ResultValueQueryTestCasesByIssueVo) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.value, that.value)
            && Objects.equals(this.reason, that.reason) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.pageNo, that.pageNo) && Objects.equals(this.hasMore, that.hasMore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, value, reason, pageSize, pageNo, hasMore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResultValueQueryTestCasesByIssueVo {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
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
