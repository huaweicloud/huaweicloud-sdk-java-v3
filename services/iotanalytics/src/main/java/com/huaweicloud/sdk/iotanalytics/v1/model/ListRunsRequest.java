package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListRunsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    @JacksonXmlProperty(localName = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    @JacksonXmlProperty(localName = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_pattern")

    @JacksonXmlProperty(localName = "sql_pattern")

    private String sqlPattern;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_type")

    @JacksonXmlProperty(localName = "sql_type")

    private String sqlType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    @JacksonXmlProperty(localName = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    @JacksonXmlProperty(localName = "order_by")

    private String orderBy;

    /**
     * 指定作业排序的升降序，默认为desc（降序），支持asc（升序）、desc（降序）两种排序方式。
     */
    public static final class OrderEnum {

        /**
         * Enum ASC for value: "asc"
         */
        public static final OrderEnum ASC = new OrderEnum("asc");

        /**
         * Enum DESC for value: "desc"
         */
        public static final OrderEnum DESC = new OrderEnum("desc");

        private static final Map<String, OrderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderEnum> createStaticFields() {
            Map<String, OrderEnum> map = new HashMap<>();
            map.put("asc", ASC);
            map.put("desc", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OrderEnum(String value) {
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
        public static OrderEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OrderEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OrderEnum(value);
            }
            return result;
        }

        public static OrderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OrderEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OrderEnum) {
                return this.value.equals(((OrderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    @JacksonXmlProperty(localName = "order")

    private OrderEnum order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    @JacksonXmlProperty(localName = "job_name")

    private String jobName;

    public ListRunsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 当前偏移量，默认为0。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListRunsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的最大作业个数，范围: [1, 100]。默认值：10。
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

    public ListRunsRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 用于查询开始时间在该时间点之后的作业。时间格式为ISO日期时间格式yyyy-MM-dd'T'HH:mm:ss.SSS。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListRunsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 用于查询开始时间在该时间点之前的作业。时间格式为ISO日期时间格式yyyy-MM-dd'T'HH:mm:ss.SSS。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListRunsRequest withSqlPattern(String sqlPattern) {
        this.sqlPattern = sqlPattern;
        return this;
    }

    /**
     * 仅当作业类型为SqlJob时可用。指定sql片段作为作业过滤条件，不区分大小写。
     * @return sqlPattern
     */
    public String getSqlPattern() {
        return sqlPattern;
    }

    public void setSqlPattern(String sqlPattern) {
        this.sqlPattern = sqlPattern;
    }

    public ListRunsRequest withSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }

    /**
     * 仅当作业类型为SqlJob时可用。SQL作业类型。DDL, DCL, IMPORT, EXPORT, QUERY, INSERT, SELECT, DATA_MIGRATION, ANALYZE, OBS_SELECT, COMPLEX
     * @return sqlType
     */
    public String getSqlType() {
        return sqlType;
    }

    public void setSqlType(String sqlType) {
        this.sqlType = sqlType;
    }

    public ListRunsRequest withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 作业类型。目前仅支持SqlJob
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public ListRunsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 此作业的当前状态，包含提交（LAUNCHING）、运行中（RUNNING）、完成（FINISHED）、失败（FAILED）、取消（CANCELLED）
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListRunsRequest withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * 指定作业排序字段，默认为从created_time（作业提交时间），支持duration（作业运行时长）、created_time（作业提交时间） 、job_name（作业名称）三种排序字段。
     * @return orderBy
     */
    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public ListRunsRequest withOrder(OrderEnum order) {
        this.order = order;
        return this;
    }

    /**
     * 指定作业排序的升降序，默认为desc（降序），支持asc（升序）、desc（降序）两种排序方式。
     * @return order
     */
    public OrderEnum getOrder() {
        return order;
    }

    public void setOrder(OrderEnum order) {
        this.order = order;
    }

    public ListRunsRequest withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 作业名称
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRunsRequest listRunsRequest = (ListRunsRequest) o;
        return Objects.equals(this.offset, listRunsRequest.offset) && Objects.equals(this.limit, listRunsRequest.limit)
            && Objects.equals(this.startTime, listRunsRequest.startTime)
            && Objects.equals(this.endTime, listRunsRequest.endTime)
            && Objects.equals(this.sqlPattern, listRunsRequest.sqlPattern)
            && Objects.equals(this.sqlType, listRunsRequest.sqlType)
            && Objects.equals(this.jobType, listRunsRequest.jobType)
            && Objects.equals(this.status, listRunsRequest.status)
            && Objects.equals(this.orderBy, listRunsRequest.orderBy)
            && Objects.equals(this.order, listRunsRequest.order)
            && Objects.equals(this.jobName, listRunsRequest.jobName);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(offset, limit, startTime, endTime, sqlPattern, sqlType, jobType, status, orderBy, order, jobName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRunsRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    sqlPattern: ").append(toIndentedString(sqlPattern)).append("\n");
        sb.append("    sqlType: ").append(toIndentedString(sqlType)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
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
