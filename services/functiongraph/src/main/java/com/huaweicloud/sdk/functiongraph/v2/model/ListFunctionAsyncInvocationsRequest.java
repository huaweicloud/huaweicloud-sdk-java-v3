package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListFunctionAsyncInvocationsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_urn")

    private String functionUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    /**
     * 本次查询指定的异步调用状态，支持5种状态，如果不指定，则查询所有状态的调用记录 WAIT: 等待 RUNNING: 执行中 SUCCESS: 执行成功 FAIL: 执行失败 DISCARD: 请求丢弃
     */
    public static final class StatusEnum {

        /**
         * Enum WAIT for value: "WAIT"
         */
        public static final StatusEnum WAIT = new StatusEnum("WAIT");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StatusEnum RUNNING = new StatusEnum("RUNNING");

        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("SUCCESS");

        /**
         * Enum FAIL for value: "FAIL"
         */
        public static final StatusEnum FAIL = new StatusEnum("FAIL");

        /**
         * Enum DISCARD for value: "DISCARD"
         */
        public static final StatusEnum DISCARD = new StatusEnum("DISCARD");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("WAIT", WAIT);
            map.put("RUNNING", RUNNING);
            map.put("SUCCESS", SUCCESS);
            map.put("FAIL", FAIL);
            map.put("DISCARD", DISCARD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_begin_time")

    private OffsetDateTime queryBeginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_end_time")

    private OffsetDateTime queryEndTime;

    public ListFunctionAsyncInvocationsRequest withFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
        return this;
    }

    /**
     * 函数URN
     * @return functionUrn
     */
    public String getFunctionUrn() {
        return functionUrn;
    }

    public void setFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
    }

    public ListFunctionAsyncInvocationsRequest withRequestId(String requestId) {
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

    public ListFunctionAsyncInvocationsRequest withLimit(String limit) {
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

    public ListFunctionAsyncInvocationsRequest withMarker(String marker) {
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

    public ListFunctionAsyncInvocationsRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 本次查询指定的异步调用状态，支持5种状态，如果不指定，则查询所有状态的调用记录 WAIT: 等待 RUNNING: 执行中 SUCCESS: 执行成功 FAIL: 执行失败 DISCARD: 请求丢弃
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListFunctionAsyncInvocationsRequest withQueryBeginTime(OffsetDateTime queryBeginTime) {
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

    public ListFunctionAsyncInvocationsRequest withQueryEndTime(OffsetDateTime queryEndTime) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFunctionAsyncInvocationsRequest listFunctionAsyncInvocationsRequest =
            (ListFunctionAsyncInvocationsRequest) o;
        return Objects.equals(this.functionUrn, listFunctionAsyncInvocationsRequest.functionUrn)
            && Objects.equals(this.requestId, listFunctionAsyncInvocationsRequest.requestId)
            && Objects.equals(this.limit, listFunctionAsyncInvocationsRequest.limit)
            && Objects.equals(this.marker, listFunctionAsyncInvocationsRequest.marker)
            && Objects.equals(this.status, listFunctionAsyncInvocationsRequest.status)
            && Objects.equals(this.queryBeginTime, listFunctionAsyncInvocationsRequest.queryBeginTime)
            && Objects.equals(this.queryEndTime, listFunctionAsyncInvocationsRequest.queryEndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functionUrn, requestId, limit, marker, status, queryBeginTime, queryEndTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFunctionAsyncInvocationsRequest {\n");
        sb.append("    functionUrn: ").append(toIndentedString(functionUrn)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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
