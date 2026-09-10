package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListOperateRecordRequestBody
 */
public class ListOperateRecordRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_type")

    private String operateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private String sort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private String order;

    public ListOperateRecordRequestBody withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 查询开始时间，格式为毫秒级时间戳。
     * minimum: 0
     * maximum: 10000000000000
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListOperateRecordRequestBody withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 查询结束时间，格式为毫秒级时间戳。
     * minimum: 0
     * maximum: 10000000000000
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListOperateRecordRequestBody withOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * 操作类型
     * @return operateType
     */
    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public ListOperateRecordRequestBody withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名称
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ListOperateRecordRequestBody withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * 事件等级
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public ListOperateRecordRequestBody withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询偏移量，默认为0。
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ListOperateRecordRequestBody withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询数量，默认为10。
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListOperateRecordRequestBody withSort(String sort) {
        this.sort = sort;
        return this;
    }

    /**
     * 排序字段，默认为operate_time。取值范围：operate_type、user_name、operate_time、level。
     * @return sort
     */
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public ListOperateRecordRequestBody withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * 排序方式，默认为desc（倒序）。取值范围：desc（倒序）、asc（正序）。
     * @return order
     */
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOperateRecordRequestBody that = (ListOperateRecordRequestBody) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.operateType, that.operateType) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.level, that.level) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.sort, that.sort)
            && Objects.equals(this.order, that.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, operateType, userName, level, offset, limit, sort, order);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOperateRecordRequestBody {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
