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
public class ShowHttpAttackDistributionStatsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    /**
     * 安全统计指标类型。 比如req_num（请求次数），bw（带宽），目前支持req_num
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

    /**
     * 目前支持action（防护动作）, attack_type（攻击类型）
     */
    public static final class GroupByEnum {

        /**
         * Enum ACTION for value: "action"
         */
        public static final GroupByEnum ACTION = new GroupByEnum("action");

        /**
         * Enum ATTACK_TYPE for value: "attack_type"
         */
        public static final GroupByEnum ATTACK_TYPE = new GroupByEnum("attack_type");

        private static final Map<String, GroupByEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, GroupByEnum> createStaticFields() {
            Map<String, GroupByEnum> map = new HashMap<>();
            map.put("action", ACTION);
            map.put("attack_type", ATTACK_TYPE);
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
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    public ShowHttpAttackDistributionStatsRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ShowHttpAttackDistributionStatsRequest withDomainName(String domainName) {
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

    public ShowHttpAttackDistributionStatsRequest withStatType(StatTypeEnum statType) {
        this.statType = statType;
        return this;
    }

    /**
     * 安全统计指标类型。 比如req_num（请求次数），bw（带宽），目前支持req_num
     * @return statType
     */
    public StatTypeEnum getStatType() {
        return statType;
    }

    public void setStatType(StatTypeEnum statType) {
        this.statType = statType;
    }

    public ShowHttpAttackDistributionStatsRequest withGroupBy(GroupByEnum groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /**
     * 目前支持action（防护动作）, attack_type（攻击类型）
     * @return groupBy
     */
    public GroupByEnum getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(GroupByEnum groupBy) {
        this.groupBy = groupBy;
    }

    public ShowHttpAttackDistributionStatsRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 起始时间，使用秒级时间戳
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowHttpAttackDistributionStatsRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间，使用秒级时间戳
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
        ShowHttpAttackDistributionStatsRequest that = (ShowHttpAttackDistributionStatsRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.domainName, that.domainName) && Objects.equals(this.statType, that.statType)
            && Objects.equals(this.groupBy, that.groupBy) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, domainName, statType, groupBy, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHttpAttackDistributionStatsRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    statType: ").append(toIndentedString(statType)).append("\n");
        sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
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
