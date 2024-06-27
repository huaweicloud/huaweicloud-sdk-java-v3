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
 * 新增或修改告警规则请求体。
 */
public class AddOrUpdateAlarmRuleV4RequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_notifications")

    private AlarmNotification alarmNotifications;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_description")

    private String alarmRuleDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_enable")

    private Boolean alarmRuleEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_name")

    private String alarmRuleName;

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
    @JsonProperty(value = "event_alarm_spec")

    private EventAlarmSpec eventAlarmSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_alarm_spec")

    private MetricAlarmSpec metricAlarmSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prom_instance_id")

    private String promInstanceId;

    public AddOrUpdateAlarmRuleV4RequestBody withAlarmNotifications(AlarmNotification alarmNotifications) {
        this.alarmNotifications = alarmNotifications;
        return this;
    }

    public AddOrUpdateAlarmRuleV4RequestBody withAlarmNotifications(
        Consumer<AlarmNotification> alarmNotificationsSetter) {
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

    public AddOrUpdateAlarmRuleV4RequestBody withAlarmRuleDescription(String alarmRuleDescription) {
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

    public AddOrUpdateAlarmRuleV4RequestBody withAlarmRuleEnable(Boolean alarmRuleEnable) {
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

    public AddOrUpdateAlarmRuleV4RequestBody withAlarmRuleName(String alarmRuleName) {
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

    public AddOrUpdateAlarmRuleV4RequestBody withAlarmRuleType(AlarmRuleTypeEnum alarmRuleType) {
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

    public AddOrUpdateAlarmRuleV4RequestBody withEventAlarmSpec(EventAlarmSpec eventAlarmSpec) {
        this.eventAlarmSpec = eventAlarmSpec;
        return this;
    }

    public AddOrUpdateAlarmRuleV4RequestBody withEventAlarmSpec(Consumer<EventAlarmSpec> eventAlarmSpecSetter) {
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

    public AddOrUpdateAlarmRuleV4RequestBody withMetricAlarmSpec(MetricAlarmSpec metricAlarmSpec) {
        this.metricAlarmSpec = metricAlarmSpec;
        return this;
    }

    public AddOrUpdateAlarmRuleV4RequestBody withMetricAlarmSpec(Consumer<MetricAlarmSpec> metricAlarmSpecSetter) {
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

    public AddOrUpdateAlarmRuleV4RequestBody withPromInstanceId(String promInstanceId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddOrUpdateAlarmRuleV4RequestBody that = (AddOrUpdateAlarmRuleV4RequestBody) obj;
        return Objects.equals(this.alarmNotifications, that.alarmNotifications)
            && Objects.equals(this.alarmRuleDescription, that.alarmRuleDescription)
            && Objects.equals(this.alarmRuleEnable, that.alarmRuleEnable)
            && Objects.equals(this.alarmRuleName, that.alarmRuleName)
            && Objects.equals(this.alarmRuleType, that.alarmRuleType)
            && Objects.equals(this.eventAlarmSpec, that.eventAlarmSpec)
            && Objects.equals(this.metricAlarmSpec, that.metricAlarmSpec)
            && Objects.equals(this.promInstanceId, that.promInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmNotifications,
            alarmRuleDescription,
            alarmRuleEnable,
            alarmRuleName,
            alarmRuleType,
            eventAlarmSpec,
            metricAlarmSpec,
            promInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddOrUpdateAlarmRuleV4RequestBody {\n");
        sb.append("    alarmNotifications: ").append(toIndentedString(alarmNotifications)).append("\n");
        sb.append("    alarmRuleDescription: ").append(toIndentedString(alarmRuleDescription)).append("\n");
        sb.append("    alarmRuleEnable: ").append(toIndentedString(alarmRuleEnable)).append("\n");
        sb.append("    alarmRuleName: ").append(toIndentedString(alarmRuleName)).append("\n");
        sb.append("    alarmRuleType: ").append(toIndentedString(alarmRuleType)).append("\n");
        sb.append("    eventAlarmSpec: ").append(toIndentedString(eventAlarmSpec)).append("\n");
        sb.append("    metricAlarmSpec: ").append(toIndentedString(metricAlarmSpec)).append("\n");
        sb.append("    promInstanceId: ").append(toIndentedString(promInstanceId)).append("\n");
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
