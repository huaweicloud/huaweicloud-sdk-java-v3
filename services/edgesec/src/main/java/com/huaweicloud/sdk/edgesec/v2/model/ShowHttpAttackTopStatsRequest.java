package com.huaweicloud.sdk.edgesec.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowHttpAttackTopStatsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    /**
     * 指标类型。例如：req_num（请求次数）、bw（带宽）。目前只支持req_num
     */
    public static final class StatTypeEnum {

        /**
         * Enum REQ_NUM for value: "req_num"
         */
        public static final StatTypeEnum REQ_NUM = new StatTypeEnum("req_num");

        /**
         * Enum BW for value: "bw"
         */
        public static final StatTypeEnum BW = new StatTypeEnum("bw");

        private static final Map<String, StatTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatTypeEnum> createStaticFields() {
            Map<String, StatTypeEnum> map = new HashMap<>();
            map.put("req_num", REQ_NUM);
            map.put("bw", BW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatTypeEnum(String value) {
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
        public static StatTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatTypeEnum(value));
        }

        public static StatTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatTypeEnum) {
                return this.value.equals(((StatTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_type")

    private StatTypeEnum statType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_by")

    private String groupBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    /**
     * 时间枚举（LATEST（最近30mins）、TODAY（今天）、CUSTOMIZE（自定义，昨天到近30天任意整数天内））
     */
    public static final class TimeTypeEnum {

        /**
         * Enum LATEST for value: "LATEST"
         */
        public static final TimeTypeEnum LATEST = new TimeTypeEnum("LATEST");

        /**
         * Enum TODAY for value: "TODAY"
         */
        public static final TimeTypeEnum TODAY = new TimeTypeEnum("TODAY");

        /**
         * Enum CUSTOMIZE for value: "CUSTOMIZE"
         */
        public static final TimeTypeEnum CUSTOMIZE = new TimeTypeEnum("CUSTOMIZE");

        private static final Map<String, TimeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TimeTypeEnum> createStaticFields() {
            Map<String, TimeTypeEnum> map = new HashMap<>();
            map.put("LATEST", LATEST);
            map.put("TODAY", TODAY);
            map.put("CUSTOMIZE", CUSTOMIZE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TimeTypeEnum(String value) {
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
        public static TimeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TimeTypeEnum(value));
        }

        public static TimeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TimeTypeEnum) {
                return this.value.equals(((TimeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_type")

    private TimeTypeEnum timeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    public ShowHttpAttackTopStatsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 您可以通过调用企业项目管理服务（EPS）的查询企业项目列表接口（ListEnterpriseProject）查询企业项目id，默认为0
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowHttpAttackTopStatsRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 域名
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ShowHttpAttackTopStatsRequest withStatType(StatTypeEnum statType) {
        this.statType = statType;
        return this;
    }

    /**
     * 指标类型。例如：req_num（请求次数）、bw（带宽）。目前只支持req_num
     * @return statType
     */
    public StatTypeEnum getStatType() {
        return statType;
    }

    public void setStatType(StatTypeEnum statType) {
        this.statType = statType;
    }

    public ShowHttpAttackTopStatsRequest withGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /**
     * 分组类型。响应值按分组类型进行统计，类型可为：host（请求的服务器域名）、sip（请求的客户端IP）、url（请求URL）、rule（自定义的策略类型描述）、user-agent（用户代理）、method（请求方法）、country（国家维度统计）。
     * @return groupBy
     */
    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    public ShowHttpAttackTopStatsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 限制Top数量(不超过100，默认为10)
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowHttpAttackTopStatsRequest withTimeType(TimeTypeEnum timeType) {
        this.timeType = timeType;
        return this;
    }

    /**
     * 时间枚举（LATEST（最近30mins）、TODAY（今天）、CUSTOMIZE（自定义，昨天到近30天任意整数天内））
     * @return timeType
     */
    public TimeTypeEnum getTimeType() {
        return timeType;
    }

    public void setTimeType(TimeTypeEnum timeType) {
        this.timeType = timeType;
    }

    public ShowHttpAttackTopStatsRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowHttpAttackTopStatsRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowHttpAttackTopStatsRequest that = (ShowHttpAttackTopStatsRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.domainName, that.domainName) && Objects.equals(this.statType, that.statType)
            && Objects.equals(this.groupBy, that.groupBy) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.timeType, that.timeType) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, domainName, statType, groupBy, limit, timeType, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHttpAttackTopStatsRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    statType: ").append(toIndentedString(statType)).append("\n");
        sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    timeType: ").append(toIndentedString(timeType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
