package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AlarmParamForV4Db
 */
public class AlarmParamForV4Db {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_create_time")

    private Long alarmCreateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_update_time")

    private Long alarmUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_name")

    private String alarmRuleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_id")

    private Long alarmRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prom_instance_id")

    private String promInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_description")

    private String alarmRuleDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_enable")

    private Boolean alarmRuleEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_status")

    private String alarmRuleStatus;

    /**
     * 规则类型。 - “metric”：指标告警规则 - “event”：事件告警规则
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
    @JsonProperty(value = "metric_alarm_spec")

    private MetricAlarmSpec metricAlarmSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_alarm_spec")

    private EventAlarmSpec eventAlarmSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_notifications")

    private AlarmNotification alarmNotifications;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    public AlarmParamForV4Db withAlarmCreateTime(Long alarmCreateTime) {
        this.alarmCreateTime = alarmCreateTime;
        return this;
    }

    /**
     * 告警规则创建时间。
     * @return alarmCreateTime
     */
    public Long getAlarmCreateTime() {
        return alarmCreateTime;
    }

    public void setAlarmCreateTime(Long alarmCreateTime) {
        this.alarmCreateTime = alarmCreateTime;
    }

    public AlarmParamForV4Db withAlarmUpdateTime(Long alarmUpdateTime) {
        this.alarmUpdateTime = alarmUpdateTime;
        return this;
    }

    /**
     * 告警规则修改时间。
     * @return alarmUpdateTime
     */
    public Long getAlarmUpdateTime() {
        return alarmUpdateTime;
    }

    public void setAlarmUpdateTime(Long alarmUpdateTime) {
        this.alarmUpdateTime = alarmUpdateTime;
    }

    public AlarmParamForV4Db withAlarmRuleName(String alarmRuleName) {
        this.alarmRuleName = alarmRuleName;
        return this;
    }

    /**
     * 告警规则名称。
     * @return alarmRuleName
     */
    public String getAlarmRuleName() {
        return alarmRuleName;
    }

    public void setAlarmRuleName(String alarmRuleName) {
        this.alarmRuleName = alarmRuleName;
    }

    public AlarmParamForV4Db withAlarmRuleId(Long alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
        return this;
    }

    /**
     * 告警规则id。
     * @return alarmRuleId
     */
    public Long getAlarmRuleId() {
        return alarmRuleId;
    }

    public void setAlarmRuleId(Long alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
    }

    public AlarmParamForV4Db withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public AlarmParamForV4Db withPromInstanceId(String promInstanceId) {
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

    public AlarmParamForV4Db withAlarmRuleDescription(String alarmRuleDescription) {
        this.alarmRuleDescription = alarmRuleDescription;
        return this;
    }

    /**
     * 告警规则描述。
     * @return alarmRuleDescription
     */
    public String getAlarmRuleDescription() {
        return alarmRuleDescription;
    }

    public void setAlarmRuleDescription(String alarmRuleDescription) {
        this.alarmRuleDescription = alarmRuleDescription;
    }

    public AlarmParamForV4Db withAlarmRuleEnable(Boolean alarmRuleEnable) {
        this.alarmRuleEnable = alarmRuleEnable;
        return this;
    }

    /**
     * 是否启用。
     * @return alarmRuleEnable
     */
    public Boolean getAlarmRuleEnable() {
        return alarmRuleEnable;
    }

    public void setAlarmRuleEnable(Boolean alarmRuleEnable) {
        this.alarmRuleEnable = alarmRuleEnable;
    }

    public AlarmParamForV4Db withAlarmRuleStatus(String alarmRuleStatus) {
        this.alarmRuleStatus = alarmRuleStatus;
        return this;
    }

    /**
     * 告警状态。 - “OK”：正常 - “alarm”：超限阈值 - “Effective”：生效中 - “Invalid”：停用中
     * @return alarmRuleStatus
     */
    public String getAlarmRuleStatus() {
        return alarmRuleStatus;
    }

    public void setAlarmRuleStatus(String alarmRuleStatus) {
        this.alarmRuleStatus = alarmRuleStatus;
    }

    public AlarmParamForV4Db withAlarmRuleType(AlarmRuleTypeEnum alarmRuleType) {
        this.alarmRuleType = alarmRuleType;
        return this;
    }

    /**
     * 规则类型。 - “metric”：指标告警规则 - “event”：事件告警规则
     * @return alarmRuleType
     */
    public AlarmRuleTypeEnum getAlarmRuleType() {
        return alarmRuleType;
    }

    public void setAlarmRuleType(AlarmRuleTypeEnum alarmRuleType) {
        this.alarmRuleType = alarmRuleType;
    }

    public AlarmParamForV4Db withMetricAlarmSpec(MetricAlarmSpec metricAlarmSpec) {
        this.metricAlarmSpec = metricAlarmSpec;
        return this;
    }

    public AlarmParamForV4Db withMetricAlarmSpec(Consumer<MetricAlarmSpec> metricAlarmSpecSetter) {
        if (this.metricAlarmSpec == null) {
            this.metricAlarmSpec = new MetricAlarmSpec();
            metricAlarmSpecSetter.accept(this.metricAlarmSpec);
        }

        return this;
    }

    /**
     * Get metricAlarmSpec
     * @return metricAlarmSpec
     */
    public MetricAlarmSpec getMetricAlarmSpec() {
        return metricAlarmSpec;
    }

    public void setMetricAlarmSpec(MetricAlarmSpec metricAlarmSpec) {
        this.metricAlarmSpec = metricAlarmSpec;
    }

    public AlarmParamForV4Db withEventAlarmSpec(EventAlarmSpec eventAlarmSpec) {
        this.eventAlarmSpec = eventAlarmSpec;
        return this;
    }

    public AlarmParamForV4Db withEventAlarmSpec(Consumer<EventAlarmSpec> eventAlarmSpecSetter) {
        if (this.eventAlarmSpec == null) {
            this.eventAlarmSpec = new EventAlarmSpec();
            eventAlarmSpecSetter.accept(this.eventAlarmSpec);
        }

        return this;
    }

    /**
     * Get eventAlarmSpec
     * @return eventAlarmSpec
     */
    public EventAlarmSpec getEventAlarmSpec() {
        return eventAlarmSpec;
    }

    public void setEventAlarmSpec(EventAlarmSpec eventAlarmSpec) {
        this.eventAlarmSpec = eventAlarmSpec;
    }

    public AlarmParamForV4Db withAlarmNotifications(AlarmNotification alarmNotifications) {
        this.alarmNotifications = alarmNotifications;
        return this;
    }

    public AlarmParamForV4Db withAlarmNotifications(Consumer<AlarmNotification> alarmNotificationsSetter) {
        if (this.alarmNotifications == null) {
            this.alarmNotifications = new AlarmNotification();
            alarmNotificationsSetter.accept(this.alarmNotifications);
        }

        return this;
    }

    /**
     * Get alarmNotifications
     * @return alarmNotifications
     */
    public AlarmNotification getAlarmNotifications() {
        return alarmNotifications;
    }

    public void setAlarmNotifications(AlarmNotification alarmNotifications) {
        this.alarmNotifications = alarmNotifications;
    }

    public AlarmParamForV4Db withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户id。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmParamForV4Db that = (AlarmParamForV4Db) obj;
        return Objects.equals(this.alarmCreateTime, that.alarmCreateTime)
            && Objects.equals(this.alarmUpdateTime, that.alarmUpdateTime)
            && Objects.equals(this.alarmRuleName, that.alarmRuleName)
            && Objects.equals(this.alarmRuleId, that.alarmRuleId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.promInstanceId, that.promInstanceId)
            && Objects.equals(this.alarmRuleDescription, that.alarmRuleDescription)
            && Objects.equals(this.alarmRuleEnable, that.alarmRuleEnable)
            && Objects.equals(this.alarmRuleStatus, that.alarmRuleStatus)
            && Objects.equals(this.alarmRuleType, that.alarmRuleType)
            && Objects.equals(this.metricAlarmSpec, that.metricAlarmSpec)
            && Objects.equals(this.eventAlarmSpec, that.eventAlarmSpec)
            && Objects.equals(this.alarmNotifications, that.alarmNotifications)
            && Objects.equals(this.userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmCreateTime,
            alarmUpdateTime,
            alarmRuleName,
            alarmRuleId,
            enterpriseProjectId,
            promInstanceId,
            alarmRuleDescription,
            alarmRuleEnable,
            alarmRuleStatus,
            alarmRuleType,
            metricAlarmSpec,
            eventAlarmSpec,
            alarmNotifications,
            userId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmParamForV4Db {\n");
        sb.append("    alarmCreateTime: ").append(toIndentedString(alarmCreateTime)).append("\n");
        sb.append("    alarmUpdateTime: ").append(toIndentedString(alarmUpdateTime)).append("\n");
        sb.append("    alarmRuleName: ").append(toIndentedString(alarmRuleName)).append("\n");
        sb.append("    alarmRuleId: ").append(toIndentedString(alarmRuleId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    promInstanceId: ").append(toIndentedString(promInstanceId)).append("\n");
        sb.append("    alarmRuleDescription: ").append(toIndentedString(alarmRuleDescription)).append("\n");
        sb.append("    alarmRuleEnable: ").append(toIndentedString(alarmRuleEnable)).append("\n");
        sb.append("    alarmRuleStatus: ").append(toIndentedString(alarmRuleStatus)).append("\n");
        sb.append("    alarmRuleType: ").append(toIndentedString(alarmRuleType)).append("\n");
        sb.append("    metricAlarmSpec: ").append(toIndentedString(metricAlarmSpec)).append("\n");
        sb.append("    eventAlarmSpec: ").append(toIndentedString(eventAlarmSpec)).append("\n");
        sb.append("    alarmNotifications: ").append(toIndentedString(alarmNotifications)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
