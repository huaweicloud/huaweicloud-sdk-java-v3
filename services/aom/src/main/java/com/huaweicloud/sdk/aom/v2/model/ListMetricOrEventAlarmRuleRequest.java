package com.huaweicloud.sdk.aom.v2.model;

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
public class ListMetricOrEventAlarmRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_by")

    private String sortBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_source")

    private String eventSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_severity")

    private String eventSeverity;

    /**
     * 告警规则状态。 - “OK”：正常 - “alarm”：超限阈值 - “Effective”：生效中 - “Invalid”：停用中
     */
    public static final class AlarmRuleStatusEnum {

        /**
         * Enum OK for value: "OK"
         */
        public static final AlarmRuleStatusEnum OK = new AlarmRuleStatusEnum("OK");

        /**
         * Enum ALARM for value: "alarm"
         */
        public static final AlarmRuleStatusEnum ALARM = new AlarmRuleStatusEnum("alarm");

        /**
         * Enum EFFECTIVE for value: "Effective"
         */
        public static final AlarmRuleStatusEnum EFFECTIVE = new AlarmRuleStatusEnum("Effective");

        /**
         * Enum INVALID for value: "Invalid"
         */
        public static final AlarmRuleStatusEnum INVALID = new AlarmRuleStatusEnum("Invalid");

        private static final Map<String, AlarmRuleStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AlarmRuleStatusEnum> createStaticFields() {
            Map<String, AlarmRuleStatusEnum> map = new HashMap<>();
            map.put("OK", OK);
            map.put("alarm", ALARM);
            map.put("Effective", EFFECTIVE);
            map.put("Invalid", INVALID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AlarmRuleStatusEnum(String value) {
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
        public static AlarmRuleStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AlarmRuleStatusEnum(value));
        }

        public static AlarmRuleStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AlarmRuleStatusEnum) {
                return this.value.equals(((AlarmRuleStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_status")

    private AlarmRuleStatusEnum alarmRuleStatus;

    /**
     * 告警规则类型。 - “metric”：指标告警规则 - “event”：事件告警规则
     */
    public static final class AlarmRuleTypeEnum {

        /**
         * Enum METRIC for value: "metric"
         */
        public static final AlarmRuleTypeEnum METRIC = new AlarmRuleTypeEnum("metric");

        /**
         * Enum EVENT for value: "event"
         */
        public static final AlarmRuleTypeEnum EVENT = new AlarmRuleTypeEnum("event");

        private static final Map<String, AlarmRuleTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AlarmRuleTypeEnum> createStaticFields() {
            Map<String, AlarmRuleTypeEnum> map = new HashMap<>();
            map.put("metric", METRIC);
            map.put("event", EVENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AlarmRuleTypeEnum(String value) {
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
        public static AlarmRuleTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AlarmRuleTypeEnum(value));
        }

        public static AlarmRuleTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AlarmRuleTypeEnum) {
                return this.value.equals(((AlarmRuleTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_type")

    private AlarmRuleTypeEnum alarmRuleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prom_instance_id")

    private String promInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_notification_rule_id")

    private String bindNotificationRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_cce_clusters")

    private String relatedCceClusters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Enterprise-Project-Id")

    private String enterpriseProjectId;

    public ListMetricOrEventAlarmRuleRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 告警规则名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListMetricOrEventAlarmRuleRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 用于限制本次返回的结果数据条数。
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListMetricOrEventAlarmRuleRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页查询起始位置，为非负整数。
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ListMetricOrEventAlarmRuleRequest withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * 根据告警规则名称或者告警创建时间排序。 - alarm_rule_name.asc - alarm_create_time.desc
     * @return sortBy
     */
    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public ListMetricOrEventAlarmRuleRequest withEventSource(String eventSource) {
        this.eventSource = eventSource;
        return this;
    }

    /**
     * 事件告警规则事件来源。 - “RDS” - “EVS” - “CCE” - “LTS” - “AOM”
     * @return eventSource
     */
    public String getEventSource() {
        return eventSource;
    }

    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }

    public ListMetricOrEventAlarmRuleRequest withEventSeverity(String eventSeverity) {
        this.eventSeverity = eventSeverity;
        return this;
    }

    /**
     * 事件告警级别。 - “Critical\" - “Major” - “Minor” - “Info”
     * @return eventSeverity
     */
    public String getEventSeverity() {
        return eventSeverity;
    }

    public void setEventSeverity(String eventSeverity) {
        this.eventSeverity = eventSeverity;
    }

    public ListMetricOrEventAlarmRuleRequest withAlarmRuleStatus(AlarmRuleStatusEnum alarmRuleStatus) {
        this.alarmRuleStatus = alarmRuleStatus;
        return this;
    }

    /**
     * 告警规则状态。 - “OK”：正常 - “alarm”：超限阈值 - “Effective”：生效中 - “Invalid”：停用中
     * @return alarmRuleStatus
     */
    public AlarmRuleStatusEnum getAlarmRuleStatus() {
        return alarmRuleStatus;
    }

    public void setAlarmRuleStatus(AlarmRuleStatusEnum alarmRuleStatus) {
        this.alarmRuleStatus = alarmRuleStatus;
    }

    public ListMetricOrEventAlarmRuleRequest withAlarmRuleType(AlarmRuleTypeEnum alarmRuleType) {
        this.alarmRuleType = alarmRuleType;
        return this;
    }

    /**
     * 告警规则类型。 - “metric”：指标告警规则 - “event”：事件告警规则
     * @return alarmRuleType
     */
    public AlarmRuleTypeEnum getAlarmRuleType() {
        return alarmRuleType;
    }

    public void setAlarmRuleType(AlarmRuleTypeEnum alarmRuleType) {
        this.alarmRuleType = alarmRuleType;
    }

    public ListMetricOrEventAlarmRuleRequest withPromInstanceId(String promInstanceId) {
        this.promInstanceId = promInstanceId;
        return this;
    }

    /**
     * Prometheus实例id。
     * @return promInstanceId
     */
    public String getPromInstanceId() {
        return promInstanceId;
    }

    public void setPromInstanceId(String promInstanceId) {
        this.promInstanceId = promInstanceId;
    }

    public ListMetricOrEventAlarmRuleRequest withBindNotificationRuleId(String bindNotificationRuleId) {
        this.bindNotificationRuleId = bindNotificationRuleId;
        return this;
    }

    /**
     * 绑定的告警行动规则名称。
     * @return bindNotificationRuleId
     */
    public String getBindNotificationRuleId() {
        return bindNotificationRuleId;
    }

    public void setBindNotificationRuleId(String bindNotificationRuleId) {
        this.bindNotificationRuleId = bindNotificationRuleId;
    }

    public ListMetricOrEventAlarmRuleRequest withRelatedCceClusters(String relatedCceClusters) {
        this.relatedCceClusters = relatedCceClusters;
        return this;
    }

    /**
     * CCE集群id。
     * @return relatedCceClusters
     */
    public String getRelatedCceClusters() {
        return relatedCceClusters;
    }

    public void setRelatedCceClusters(String relatedCceClusters) {
        this.relatedCceClusters = relatedCceClusters;
    }

    public ListMetricOrEventAlarmRuleRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id。获取方式请参见：[获取企业项目ID](aom_04_0024.xml)。 - 查询单个企业项目下实例，填写企业项目id。  - 查询所有企业项目下实例，填写“all_granted_eps”。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMetricOrEventAlarmRuleRequest that = (ListMetricOrEventAlarmRuleRequest) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.sortBy, that.sortBy)
            && Objects.equals(this.eventSource, that.eventSource)
            && Objects.equals(this.eventSeverity, that.eventSeverity)
            && Objects.equals(this.alarmRuleStatus, that.alarmRuleStatus)
            && Objects.equals(this.alarmRuleType, that.alarmRuleType)
            && Objects.equals(this.promInstanceId, that.promInstanceId)
            && Objects.equals(this.bindNotificationRuleId, that.bindNotificationRuleId)
            && Objects.equals(this.relatedCceClusters, that.relatedCceClusters)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            limit,
            offset,
            sortBy,
            eventSource,
            eventSeverity,
            alarmRuleStatus,
            alarmRuleType,
            promInstanceId,
            bindNotificationRuleId,
            relatedCceClusters,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMetricOrEventAlarmRuleRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
        sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
        sb.append("    eventSeverity: ").append(toIndentedString(eventSeverity)).append("\n");
        sb.append("    alarmRuleStatus: ").append(toIndentedString(alarmRuleStatus)).append("\n");
        sb.append("    alarmRuleType: ").append(toIndentedString(alarmRuleType)).append("\n");
        sb.append("    promInstanceId: ").append(toIndentedString(promInstanceId)).append("\n");
        sb.append("    bindNotificationRuleId: ").append(toIndentedString(bindNotificationRuleId)).append("\n");
        sb.append("    relatedCceClusters: ").append(toIndentedString(relatedCceClusters)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
