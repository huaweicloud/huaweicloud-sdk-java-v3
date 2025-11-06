package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EventAlarmTemplateSpec
 */
public class EventAlarmTemplateSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_subtype")

    private String alarmSubtype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_source")

    private String alarmSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_source")

    private String eventSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitor_object_templates")

    private List<String> monitorObjectTemplates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitor_objects")

    private List<Map<String, String>> monitorObjects = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_conditions")

    private List<EventTriggerCondition> triggerConditions = null;

    public EventAlarmTemplateSpec withAlarmSubtype(String alarmSubtype) {
        this.alarmSubtype = alarmSubtype;
        return this;
    }

    /**
     * 告警规则类别。
     * @return alarmSubtype
     */
    public String getAlarmSubtype() {
        return alarmSubtype;
    }

    public void setAlarmSubtype(String alarmSubtype) {
        this.alarmSubtype = alarmSubtype;
    }

    public EventAlarmTemplateSpec withAlarmSource(String alarmSource) {
        this.alarmSource = alarmSource;
        return this;
    }

    /**
     * 告警规则来源云服务：CCE 创建标识。
     * @return alarmSource
     */
    public String getAlarmSource() {
        return alarmSource;
    }

    public void setAlarmSource(String alarmSource) {
        this.alarmSource = alarmSource;
    }

    public EventAlarmTemplateSpec withEventSource(String eventSource) {
        this.eventSource = eventSource;
        return this;
    }

    /**
     * 告警来源。
     * @return eventSource
     */
    public String getEventSource() {
        return eventSource;
    }

    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }

    public EventAlarmTemplateSpec withMonitorObjectTemplates(List<String> monitorObjectTemplates) {
        this.monitorObjectTemplates = monitorObjectTemplates;
        return this;
    }

    public EventAlarmTemplateSpec addMonitorObjectTemplatesItem(String monitorObjectTemplatesItem) {
        if (this.monitorObjectTemplates == null) {
            this.monitorObjectTemplates = new ArrayList<>();
        }
        this.monitorObjectTemplates.add(monitorObjectTemplatesItem);
        return this;
    }

    public EventAlarmTemplateSpec withMonitorObjectTemplates(Consumer<List<String>> monitorObjectTemplatesSetter) {
        if (this.monitorObjectTemplates == null) {
            this.monitorObjectTemplates = new ArrayList<>();
        }
        monitorObjectTemplatesSetter.accept(this.monitorObjectTemplates);
        return this;
    }

    /**
     * 监控对象模板（创建告警时需要补齐里面的内容）。
     * @return monitorObjectTemplates
     */
    public List<String> getMonitorObjectTemplates() {
        return monitorObjectTemplates;
    }

    public void setMonitorObjectTemplates(List<String> monitorObjectTemplates) {
        this.monitorObjectTemplates = monitorObjectTemplates;
    }

    public EventAlarmTemplateSpec withMonitorObjects(List<Map<String, String>> monitorObjects) {
        this.monitorObjects = monitorObjects;
        return this;
    }

    public EventAlarmTemplateSpec addMonitorObjectsItem(Map<String, String> monitorObjectsItem) {
        if (this.monitorObjects == null) {
            this.monitorObjects = new ArrayList<>();
        }
        this.monitorObjects.add(monitorObjectsItem);
        return this;
    }

    public EventAlarmTemplateSpec withMonitorObjects(Consumer<List<Map<String, String>>> monitorObjectsSetter) {
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

    public EventAlarmTemplateSpec withTriggerConditions(List<EventTriggerCondition> triggerConditions) {
        this.triggerConditions = triggerConditions;
        return this;
    }

    public EventAlarmTemplateSpec addTriggerConditionsItem(EventTriggerCondition triggerConditionsItem) {
        if (this.triggerConditions == null) {
            this.triggerConditions = new ArrayList<>();
        }
        this.triggerConditions.add(triggerConditionsItem);
        return this;
    }

    public EventAlarmTemplateSpec withTriggerConditions(Consumer<List<EventTriggerCondition>> triggerConditionsSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventAlarmTemplateSpec that = (EventAlarmTemplateSpec) obj;
        return Objects.equals(this.alarmSubtype, that.alarmSubtype)
            && Objects.equals(this.alarmSource, that.alarmSource) && Objects.equals(this.eventSource, that.eventSource)
            && Objects.equals(this.monitorObjectTemplates, that.monitorObjectTemplates)
            && Objects.equals(this.monitorObjects, that.monitorObjects)
            && Objects.equals(this.triggerConditions, that.triggerConditions);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(alarmSubtype, alarmSource, eventSource, monitorObjectTemplates, monitorObjects, triggerConditions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventAlarmTemplateSpec {\n");
        sb.append("    alarmSubtype: ").append(toIndentedString(alarmSubtype)).append("\n");
        sb.append("    alarmSource: ").append(toIndentedString(alarmSource)).append("\n");
        sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
        sb.append("    monitorObjectTemplates: ").append(toIndentedString(monitorObjectTemplates)).append("\n");
        sb.append("    monitorObjects: ").append(toIndentedString(monitorObjects)).append("\n");
        sb.append("    triggerConditions: ").append(toIndentedString(triggerConditions)).append("\n");
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
