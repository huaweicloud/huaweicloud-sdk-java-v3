package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * InstanceApplicationQueryRspData
 */
public class InstanceApplicationQueryRspData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<InstanceApplicationQueryRspDataResult> result = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    private Integer pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public InstanceApplicationQueryRspData withResult(List<InstanceApplicationQueryRspDataResult> result) {
        this.result = result;
        return this;
    }

    public InstanceApplicationQueryRspData addResultItem(InstanceApplicationQueryRspDataResult resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public InstanceApplicationQueryRspData withResult(
        Consumer<List<InstanceApplicationQueryRspDataResult>> resultSetter) {
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
    public List<InstanceApplicationQueryRspDataResult> getResult() {
        return result;
    }

    public void setResult(List<InstanceApplicationQueryRspDataResult> result) {
        this.result = result;
    }

    public InstanceApplicationQueryRspData withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * 分页页码
     * @return pageNo
     */
    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public InstanceApplicationQueryRspData withPageSize(Integer pageSize) {
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

    public InstanceApplicationQueryRspData withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 元素总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceApplicationQueryRspData that = (InstanceApplicationQueryRspData) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.pageNo, that.pageNo)
            && Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, pageNo, pageSize, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceApplicationQueryRspData {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
