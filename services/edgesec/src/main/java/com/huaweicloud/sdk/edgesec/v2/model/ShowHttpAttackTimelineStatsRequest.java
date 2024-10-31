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
public class ShowHttpAttackTimelineStatsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    /**
     * 指标类型，当前仅支持req_num
     */
    public static final class StatTypeEnum {

        /**
         * Enum REQ_NUM for value: "req_num"
         */
        public static final StatTypeEnum REQ_NUM = new StatTypeEnum("req_num");

        private static final Map<String, StatTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatTypeEnum> createStaticFields() {
            Map<String, StatTypeEnum> map = new HashMap<>();
            map.put("req_num", REQ_NUM);
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

    /**
     * 分组类型，当前仅支持action，attack_category
     */
    public static final class GroupByEnum {

        /**
         * Enum ACTION for value: "action"
         */
        public static final GroupByEnum ACTION = new GroupByEnum("action");

        /**
         * Enum ATTACK_CATEGORY for value: "attack_category"
         */
        public static final GroupByEnum ATTACK_CATEGORY = new GroupByEnum("attack_category");

        private static final Map<String, GroupByEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, GroupByEnum> createStaticFields() {
            Map<String, GroupByEnum> map = new HashMap<>();
            map.put("action", ACTION);
            map.put("attack_category", ATTACK_CATEGORY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        GroupByEnum(String value) {
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
        public static GroupByEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new GroupByEnum(value));
        }

        public static GroupByEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof GroupByEnum) {
                return this.value.equals(((GroupByEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_by")

    private GroupByEnum groupBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_by_value")

    private String groupByValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private Integer interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    public ShowHttpAttackTimelineStatsRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ShowHttpAttackTimelineStatsRequest withDomainName(String domainName) {
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

    public ShowHttpAttackTimelineStatsRequest withStatType(StatTypeEnum statType) {
        this.statType = statType;
        return this;
    }

    /**
     * 指标类型，当前仅支持req_num
     * @return statType
     */
    public StatTypeEnum getStatType() {
        return statType;
    }

    public void setStatType(StatTypeEnum statType) {
        this.statType = statType;
    }

    public ShowHttpAttackTimelineStatsRequest withGroupBy(GroupByEnum groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /**
     * 分组类型，当前仅支持action，attack_category
     * @return groupBy
     */
    public GroupByEnum getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(GroupByEnum groupBy) {
        this.groupBy = groupBy;
    }

    public ShowHttpAttackTimelineStatsRequest withGroupByValue(String groupByValue) {
        this.groupByValue = groupByValue;
        return this;
    }

    /**
     * 分组类型对应的具体的值，不传的话默认总和（例如：action指标类型：log、block、captcha、js_challenge） （例如：attack_category指标类型：cc、access_control、bot、web_app_attack）
     * @return groupByValue
     */
    public String getGroupByValue() {
        return groupByValue;
    }

    public void setGroupByValue(String groupByValue) {
        this.groupByValue = groupByValue;
    }

    public ShowHttpAttackTimelineStatsRequest withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 时间粒度(单位：秒)，不同时间范围有不同的可选时间粒度。[0,1H]，可选时间粒度为1M、5M；(1H,1D]，可选时间粒度为1M、5M、1H；(1D,3D]，可选时间粒度为1M、5M、1H、1D；(3D,7D]，可选时间粒度为5M、1H、1D；(7D,30D]，可选时间粒度为1H、1D。其中M代表分钟，H代表小时，D代表天。
     * @return interval
     */
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public ShowHttpAttackTimelineStatsRequest withStartTime(Long startTime) {
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

    public ShowHttpAttackTimelineStatsRequest withEndTime(Long endTime) {
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
        ShowHttpAttackTimelineStatsRequest that = (ShowHttpAttackTimelineStatsRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.domainName, that.domainName) && Objects.equals(this.statType, that.statType)
            && Objects.equals(this.groupBy, that.groupBy) && Objects.equals(this.groupByValue, that.groupByValue)
            && Objects.equals(this.interval, that.interval) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(enterpriseProjectId, domainName, statType, groupBy, groupByValue, interval, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHttpAttackTimelineStatsRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    statType: ").append(toIndentedString(statType)).append("\n");
        sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
        sb.append("    groupByValue: ").append(toIndentedString(groupByValue)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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
