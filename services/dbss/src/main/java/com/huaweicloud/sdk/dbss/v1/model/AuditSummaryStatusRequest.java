package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AuditSummaryStatusRequest
 */
public class AuditSummaryStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oper_type")

    private String operType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_begin_time")

    private Long queryBeginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_end_time")

    private Long queryEndTime;

    public AuditSummaryStatusRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 操作码，operType为switch时必输入  - on: 开启  - off: 关闭
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public AuditSummaryStatusRequest withOperType(String operType) {
        this.operType = operType;
        return this;
    }

    /**
     * 操作类型  - switch: 任务开关  - execute: 立即刷新
     * @return operType
     */
    public String getOperType() {
        return operType;
    }

    public void setOperType(String operType) {
        this.operType = operType;
    }

    public AuditSummaryStatusRequest withQueryBeginTime(Long queryBeginTime) {
        this.queryBeginTime = queryBeginTime;
        return this;
    }

    /**
     * 查询条件：开始时间
     * @return queryBeginTime
     */
    public Long getQueryBeginTime() {
        return queryBeginTime;
    }

    public void setQueryBeginTime(Long queryBeginTime) {
        this.queryBeginTime = queryBeginTime;
    }

    public AuditSummaryStatusRequest withQueryEndTime(Long queryEndTime) {
        this.queryEndTime = queryEndTime;
        return this;
    }

    /**
     * 查询条件：结束时间
     * @return queryEndTime
     */
    public Long getQueryEndTime() {
        return queryEndTime;
    }

    public void setQueryEndTime(Long queryEndTime) {
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
        AuditSummaryStatusRequest that = (AuditSummaryStatusRequest) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.operType, that.operType)
            && Objects.equals(this.queryBeginTime, that.queryBeginTime)
            && Objects.equals(this.queryEndTime, that.queryEndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, operType, queryBeginTime, queryEndTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditSummaryStatusRequest {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    operType: ").append(toIndentedString(operType)).append("\n");
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
