package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResultValueListTaskResulDetailtVo
 */
public class ResultValueListTaskResulDetailtVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

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
    @JsonProperty(value = "value")

    private TaskResultDetailVo value;

    public ResultValueListTaskResulDetailtVo withTotal(Integer total) {
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

    public ResultValueListTaskResulDetailtVo withReason(String reason) {
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

    public ResultValueListTaskResulDetailtVo withPageSize(Integer pageSize) {
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

    public ResultValueListTaskResulDetailtVo withPageNo(Integer pageNo) {
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

    public ResultValueListTaskResulDetailtVo withValue(TaskResultDetailVo value) {
        this.value = value;
        return this;
    }

    public ResultValueListTaskResulDetailtVo withValue(Consumer<TaskResultDetailVo> valueSetter) {
        if (this.value == null) {
            this.value = new TaskResultDetailVo();
            valueSetter.accept(this.value);
        }

        return this;
    }

    /**
     * Get value
     * @return value
     */
    public TaskResultDetailVo getValue() {
        return value;
    }

    public void setValue(TaskResultDetailVo value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResultValueListTaskResulDetailtVo that = (ResultValueListTaskResulDetailtVo) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.reason, that.reason)
            && Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.pageNo, that.pageNo)
            && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, reason, pageSize, pageNo, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResultValueListTaskResulDetailtVo {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
