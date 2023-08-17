package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询时段内用例的执行情况请求体
 */
public class ShowUserExecuteTestCaseInfoRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_start_time")

    private String executeStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_end_time")

    private String executeEndTime;

    public ShowUserExecuteTestCaseInfoRequestBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 起始偏移量，表示从此偏移量开始查询，offset大于等于0，小于等于20000
     * minimum: 0
     * maximum: 20000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowUserExecuteTestCaseInfoRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量,最大支持100条
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowUserExecuteTestCaseInfoRequestBody withExecuteStartTime(String executeStartTime) {
        this.executeStartTime = executeStartTime;
        return this;
    }

    /**
     * 用例执行时间段开始
     * @return executeStartTime
     */
    public String getExecuteStartTime() {
        return executeStartTime;
    }

    public void setExecuteStartTime(String executeStartTime) {
        this.executeStartTime = executeStartTime;
    }

    public ShowUserExecuteTestCaseInfoRequestBody withExecuteEndTime(String executeEndTime) {
        this.executeEndTime = executeEndTime;
        return this;
    }

    /**
     * 用例执行时间段截止
     * @return executeEndTime
     */
    public String getExecuteEndTime() {
        return executeEndTime;
    }

    public void setExecuteEndTime(String executeEndTime) {
        this.executeEndTime = executeEndTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowUserExecuteTestCaseInfoRequestBody that = (ShowUserExecuteTestCaseInfoRequestBody) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.executeStartTime, that.executeStartTime)
            && Objects.equals(this.executeEndTime, that.executeEndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, executeStartTime, executeEndTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUserExecuteTestCaseInfoRequestBody {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    executeStartTime: ").append(toIndentedString(executeStartTime)).append("\n");
        sb.append("    executeEndTime: ").append(toIndentedString(executeEndTime)).append("\n");
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
