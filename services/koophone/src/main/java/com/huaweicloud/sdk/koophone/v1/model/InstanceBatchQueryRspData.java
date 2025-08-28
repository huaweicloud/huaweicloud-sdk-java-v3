package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * InstanceBatchQueryRspData
 */
public class InstanceBatchQueryRspData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<InstanceBatchQueryRspDataResult> result = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    private Integer pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public InstanceBatchQueryRspData withResult(List<InstanceBatchQueryRspDataResult> result) {
        this.result = result;
        return this;
    }

    public InstanceBatchQueryRspData addResultItem(InstanceBatchQueryRspDataResult resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public InstanceBatchQueryRspData withResult(Consumer<List<InstanceBatchQueryRspDataResult>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * Get result
     * @return result
     */
    public List<InstanceBatchQueryRspDataResult> getResult() {
        return result;
    }

    public void setResult(List<InstanceBatchQueryRspDataResult> result) {
        this.result = result;
    }

    public InstanceBatchQueryRspData withPageNo(Integer pageNo) {
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

    public InstanceBatchQueryRspData withPageSize(Integer pageSize) {
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

    public InstanceBatchQueryRspData withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get totalCount
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public InstanceBatchQueryRspData withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get errorCode
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public InstanceBatchQueryRspData withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * Get errorMsg
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceBatchQueryRspData that = (InstanceBatchQueryRspData) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.pageNo, that.pageNo)
            && Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.errorMsg, that.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, pageNo, pageSize, totalCount, errorCode, errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceBatchQueryRspData {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
