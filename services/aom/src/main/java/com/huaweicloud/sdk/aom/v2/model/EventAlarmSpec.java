package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 事件类告警结构。
 */
public class EventAlarmSpec {

    /**
     * 告警规则来源。 - “systemEvent”：系统事件 - “customEvent”：自定义事件
     */
    public static final class AlarmSourceEnum {

        /**
         * Enum SYSTEMEVENT for value: "systemEvent"
         */
        public static final AlarmSourceEnum SYSTEMEVENT = new AlarmSourceEnum("systemEvent");

        /**
         * Enum CUSTOMEVENT for value: "customEvent"
         */
        public static final AlarmSourceEnum CUSTOMEVENT = new AlarmSourceEnum("customEvent");

        private static final Map<String, AlarmSourceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AlarmSourceEnum> createStaticFields() {
            Map<String, AlarmSourceEnum> map = new HashMap<>();
            map.put("systemEvent", SYSTEMEVENT);
            map.put("customEvent", CUSTOMEVENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AlarmSourceEnum(String value) {
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
        public static AlarmSourceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AlarmSourceEnum(value));
        }

        public static AlarmSourceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AlarmSourceEnum) {
                return this.value.equals(((AlarmSourceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_source")

    private AlarmSourceEnum alarmSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_source")

    private String eventSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitor_objects")

    private List<Map<String, String>> monitorObjects = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_conditions")

    private List<EventTriggerCondition> triggerConditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_template_bind_enable")

    private Boolean alarmRuleTemplateBindEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_template_id")

    private String alarmRuleTemplateId;

    public EventAlarmSpec withAlarmSource(AlarmSourceEnum alarmSource) {
        this.alarmSource = alarmSource;
        return this;
    }

    /**
     * 告警规则来源。 - “systemEvent”：系统事件 - “customEvent”：自定义事件
     * @return alarmSource
     */
    public AlarmSourceEnum getAlarmSource() {
        return alarmSource;
    }

    public void setAlarmSource(AlarmSourceEnum alarmSource) {
        this.alarmSource = alarmSource;
    }

    public EventAlarmSpec withEventSource(String eventSource) {
        this.eventSource = eventSource;
        return this;
    }

    /**
     * 告警来源。 - “RDS” - “EVS” - “CCE” - “LTS” - “AOM”
     * @return eventSource
     */
    public String getEventSource() {
        return eventSource;
    }

    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }

    public EventAlarmSpec withMonitorObjects(List<Map<String, String>> monitorObjects) {
        this.monitorObjects = monitorObjects;
        return this;
    }

    public EventAlarmSpec addMonitorObjectsItem(Map<String, String> monitorObjectsItem) {
        if (this.monitorObjects == null) {
            this.monitorObjects = new ArrayList<>();
        }
        this.monitorObjects.add(monitorObjectsItem);
        return this;
    }

    public EventAlarmSpec withMonitorObjects(Consumer<List<Map<String, String>>> monitorObjectsSetter) {
        if (this.monitorObjects == null) {
            this.monitorObjects = new ArrayList<>();
        }
        monitorObjectsSetter.accept(this.monitorObjects);
        return this;
    }

    /**
     * 监控对象列表。键值对形式，键值为： - “event_type”：通知类型 - “event_severity”：告警级别 - “event_name”：事件名称 - “namespace”：命名空间 - “clusterId”：集群id - “customField”：用户自定义字段
     * @return monitorObjects
     */
    public List<Map<String, String>> getMonitorObjects() {
        return monitorObjects;
    }

    public void setMonitorObjects(List<Map<String, String>> monitorObjects) {
        this.monitorObjects = monitorObjects;
    }

    public EventAlarmSpec withTriggerConditions(List<EventTriggerCondition> triggerConditions) {
        this.triggerConditions = triggerConditions;
        return this;
    }

    public EventAlarmSpec addTriggerConditionsItem(EventTriggerCondition triggerConditionsItem) {
        if (this.triggerConditions == null) {
            this.triggerConditions = new ArrayList<>();
        }
        this.triggerConditions.add(triggerConditionsItem);
        return this;
    }

    public EventAlarmSpec withTriggerConditions(Consumer<List<EventTriggerCondition>> triggerConditionsSetter) {
        if (this.triggerConditions == null) {
            this.triggerConditions = new ArrayList<>();
        }
        triggerConditionsSetter.accept(this.triggerConditions);
        return this;
    }

    /**
     * 触发条件。
     * @return triggerConditions
     */
    public List<EventTriggerCondition> getTriggerConditions() {
        return triggerConditions;
    }

    public void setTriggerConditions(List<EventTriggerCondition> triggerConditions) {
        this.triggerConditions = triggerConditions;
    }

    public EventAlarmSpec withAlarmRuleTemplateBindEnable(Boolean alarmRuleTemplateBindEnable) {
        this.alarmRuleTemplateBindEnable = alarmRuleTemplateBindEnable;
        return this;
    }

    /**
     * 是否绑定告警模板（废弃）。
     * @return alarmRuleTemplateBindEnable
     */
    public Boolean getAlarmRuleTemplateBindEnable() {
        return alarmRuleTemplateBindEnable;
    }

    public void setAlarmRuleTemplateBindEnable(Boolean alarmRuleTemplateBindEnable) {
        this.alarmRuleTemplateBindEnable = alarmRuleTemplateBindEnable;
    }

    public EventAlarmSpec withAlarmRuleTemplateId(String alarmRuleTemplateId) {
        this.alarmRuleTemplateId = alarmRuleTemplateId;
        return this;
    }

    /**
     * 告警模板id（废弃）。
     * @return alarmRuleTemplateId
     */
    public String getAlarmRuleTemplateId() {
        return alarmRuleTemplateId;
    }

    public void setAlarmRuleTemplateId(String alarmRuleTemplateId) {
        this.alarmRuleTemplateId = alarmRuleTemplateId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventAlarmSpec that = (EventAlarmSpec) obj;
        return Objects.equals(this.alarmSource, that.alarmSource) && Objects.equals(this.eventSource, that.eventSource)
            && Objects.equals(this.monitorObjects, that.monitorObjects)
            && Objects.equals(this.triggerConditions, that.triggerConditions)
            && Objects.equals(this.alarmRuleTemplateBindEnable, that.alarmRuleTemplateBindEnable)
            && Objects.equals(this.alarmRuleTemplateId, that.alarmRuleTemplateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmSource,
            eventSource,
            monitorObjects,
            triggerConditions,
            alarmRuleTemplateBindEnable,
            alarmRuleTemplateId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventAlarmSpec {\n");
        sb.append("    alarmSource: ").append(toIndentedString(alarmSource)).append("\n");
        sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
        sb.append("    monitorObjects: ").append(toIndentedString(monitorObjects)).append("\n");
        sb.append("    triggerConditions: ").append(toIndentedString(triggerConditions)).append("\n");
        sb.append("    alarmRuleTemplateBindEnable: ")
            .append(toIndentedString(alarmRuleTemplateBindEnable))
            .append("\n");
        sb.append("    alarmRuleTemplateId: ").append(toIndentedString(alarmRuleTemplateId)).append("\n");
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
