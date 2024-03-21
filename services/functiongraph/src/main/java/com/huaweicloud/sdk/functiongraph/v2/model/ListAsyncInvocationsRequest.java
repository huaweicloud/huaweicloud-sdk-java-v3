package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Request Object
 */
public class ListAsyncInvocationsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_urn")

    private String functionUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_begin_time")

    private OffsetDateTime queryBeginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_end_time")

    private OffsetDateTime queryEndTime;

    public ListAsyncInvocationsRequest withFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
        return this;
    }

    /**
     * 函数的URN，详细解释见FunctionGraph函数模型的描述。
     * @return functionUrn
     */
    public String getFunctionUrn() {
        return functionUrn;
    }

    public void setFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
    }

    public ListAsyncInvocationsRequest withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 需要查询的异步请求ID。如果不指定，默认查询所有异步调用记录
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListAsyncInvocationsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 本次查询起始位置，默认值0
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListAsyncInvocationsRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 本次查询最大返回的数据条数，最大值500，默认值100
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListAsyncInvocationsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 本次查询指定的异步调用状态，支持5种状态，如果不指定，则查询所有状态的调用记录 WAIT: 等待 RUNNING: 执行中 SUCCESS: 执行成功 FAIL: 执行失败 DISCARD: 请求丢弃
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListAsyncInvocationsRequest withQueryBeginTime(OffsetDateTime queryBeginTime) {
        this.queryBeginTime = queryBeginTime;
        return this;
    }

    /**
     * 搜索起始时间（格式为YYYY-MM-DD'T'HH:mm:ss,UTC时间）。如果不指定默认为当前时间前1小时
     * @return queryBeginTime
     */
    public OffsetDateTime getQueryBeginTime() {
        return queryBeginTime;
    }

    public void setQueryBeginTime(OffsetDateTime queryBeginTime) {
        this.queryBeginTime = queryBeginTime;
    }

    public ListAsyncInvocationsRequest withQueryEndTime(OffsetDateTime queryEndTime) {
        this.queryEndTime = queryEndTime;
        return this;
    }

    /**
     * 搜索结束时间（格式为YYYY-MM-DD'T'HH:mm:ss,UTC时间）。如果不指定默认为当前时间
     * @return queryEndTime
     */
    public OffsetDateTime getQueryEndTime() {
        return queryEndTime;
    }

    public void setQueryEndTime(OffsetDateTime queryEndTime) {
        this.queryEndTime = queryEndTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAsyncInvocationsRequest that = (ListAsyncInvocationsRequest) obj;
        return Objects.equals(this.functionUrn, that.functionUrn) && Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.status, that.status) && Objects.equals(this.queryBeginTime, that.queryBeginTime)
            && Objects.equals(this.queryEndTime, that.queryEndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functionUrn, requestId, marker, limit, status, queryBeginTime, queryEndTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAsyncInvocationsRequest {\n");
        sb.append("    functionUrn: ").append(toIndentedString(functionUrn)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    queryBeginTime: ").append(toIndentedString(queryBeginTime)).append("\n");
        sb.append("    queryEndTime: ").append(toIndentedString(queryEndTime)).append("\n");
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
