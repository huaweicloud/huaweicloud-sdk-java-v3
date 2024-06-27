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
 * 指标类告警结构。
 */
public class MetricAlarmSpec {

    /**
     * 监控类型。 - “all_metric”：全量指标 - “promql”：PromQL - “resource”：（日落）资源类型
     */
    public static final class MonitorTypeEnum {

        /**
         * Enum ALL_METRIC for value: "all_metric"
         */
        public static final MonitorTypeEnum ALL_METRIC = new MonitorTypeEnum("all_metric");

        /**
         * Enum PROMQL for value: "promql"
         */
        public static final MonitorTypeEnum PROMQL = new MonitorTypeEnum("promql");

        /**
         * Enum RESOURCE for value: "resource"
         */
        public static final MonitorTypeEnum RESOURCE = new MonitorTypeEnum("resource");

        private static final Map<String, MonitorTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MonitorTypeEnum> createStaticFields() {
            Map<String, MonitorTypeEnum> map = new HashMap<>();
            map.put("all_metric", ALL_METRIC);
            map.put("promql", PROMQL);
            map.put("resource", RESOURCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MonitorTypeEnum(String value) {
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
        public static MonitorTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MonitorTypeEnum(value));
        }

        public static MonitorTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MonitorTypeEnum) {
                return this.value.equals(((MonitorTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitor_type")

    private MonitorTypeEnum monitorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no_data_conditions")

    private List<NoDataCondition> noDataConditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_tags")

    private List<AlarmTags> alarmTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitor_objects")

    private List<Map<String, String>> monitorObjects = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recovery_conditions")

    private RecoveryCondition recoveryConditions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_conditions")

    private List<TriggerCondition> triggerConditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_template_bind_enable")

    private Boolean alarmRuleTemplateBindEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_template_id")

    private String alarmRuleTemplateId;

    public MetricAlarmSpec withMonitorType(MonitorTypeEnum monitorType) {
        this.monitorType = monitorType;
        return this;
    }

    /**
     * 监控类型。 - “all_metric”：全量指标 - “promql”：PromQL - “resource”：（日落）资源类型
     * @return monitorType
     */
    public MonitorTypeEnum getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(MonitorTypeEnum monitorType) {
        this.monitorType = monitorType;
    }

    public MetricAlarmSpec withNoDataConditions(List<NoDataCondition> noDataConditions) {
        this.noDataConditions = noDataConditions;
        return this;
    }

    public MetricAlarmSpec addNoDataConditionsItem(NoDataCondition noDataConditionsItem) {
        if (this.noDataConditions == null) {
            this.noDataConditions = new ArrayList<>();
        }
        this.noDataConditions.add(noDataConditionsItem);
        return this;
    }

    public MetricAlarmSpec withNoDataConditions(Consumer<List<NoDataCondition>> noDataConditionsSetter) {
        if (this.noDataConditions == null) {
            this.noDataConditions = new ArrayList<>();
        }
        noDataConditionsSetter.accept(this.noDataConditions);
        return this;
    }

    /**
     * 无数据处理。
     * @return noDataConditions
     */
    public List<NoDataCondition> getNoDataConditions() {
        return noDataConditions;
    }

    public void setNoDataConditions(List<NoDataCondition> noDataConditions) {
        this.noDataConditions = noDataConditions;
    }

    public MetricAlarmSpec withAlarmTags(List<AlarmTags> alarmTags) {
        this.alarmTags = alarmTags;
        return this;
    }

    public MetricAlarmSpec addAlarmTagsItem(AlarmTags alarmTagsItem) {
        if (this.alarmTags == null) {
            this.alarmTags = new ArrayList<>();
        }
        this.alarmTags.add(alarmTagsItem);
        return this;
    }

    public MetricAlarmSpec withAlarmTags(Consumer<List<AlarmTags>> alarmTagsSetter) {
        if (this.alarmTags == null) {
            this.alarmTags = new ArrayList<>();
        }
        alarmTagsSetter.accept(this.alarmTags);
        return this;
    }

    /**
     * 告警标签。
     * @return alarmTags
     */
    public List<AlarmTags> getAlarmTags() {
        return alarmTags;
    }

    public void setAlarmTags(List<AlarmTags> alarmTags) {
        this.alarmTags = alarmTags;
    }

    public MetricAlarmSpec withMonitorObjects(List<Map<String, String>> monitorObjects) {
        this.monitorObjects = monitorObjects;
        return this;
    }

    public MetricAlarmSpec addMonitorObjectsItem(Map<String, String> monitorObjectsItem) {
        if (this.monitorObjects == null) {
            this.monitorObjects = new ArrayList<>();
        }
        this.monitorObjects.add(monitorObjectsItem);
        return this;
    }

    public MetricAlarmSpec withMonitorObjects(Consumer<List<Map<String, String>>> monitorObjectsSetter) {
        if (this.monitorObjects == null) {
            this.monitorObjects = new ArrayList<>();
        }
        monitorObjectsSetter.accept(this.monitorObjects);
        return this;
    }

    /**
     * 监控对象列表。
     * @return monitorObjects
     */
    public List<Map<String, String>> getMonitorObjects() {
        return monitorObjects;
    }

    public void setMonitorObjects(List<Map<String, String>> monitorObjects) {
        this.monitorObjects = monitorObjects;
    }

    public MetricAlarmSpec withRecoveryConditions(RecoveryCondition recoveryConditions) {
        this.recoveryConditions = recoveryConditions;
        return this;
    }

    public MetricAlarmSpec withRecoveryConditions(Consumer<RecoveryCondition> recoveryConditionsSetter) {
        if (this.recoveryConditions == null) {
            this.recoveryConditions = new RecoveryCondition();
            recoveryConditionsSetter.accept(this.recoveryConditions);
        }

        return this;
    }

    /**
     * Get recoveryConditions
     * @return recoveryConditions
     */
    public RecoveryCondition getRecoveryConditions() {
        return recoveryConditions;
    }

    public void setRecoveryConditions(RecoveryCondition recoveryConditions) {
        this.recoveryConditions = recoveryConditions;
    }

    public MetricAlarmSpec withTriggerConditions(List<TriggerCondition> triggerConditions) {
        this.triggerConditions = triggerConditions;
        return this;
    }

    public MetricAlarmSpec addTriggerConditionsItem(TriggerCondition triggerConditionsItem) {
        if (this.triggerConditions == null) {
            this.triggerConditions = new ArrayList<>();
        }
        this.triggerConditions.add(triggerConditionsItem);
        return this;
    }

    public MetricAlarmSpec withTriggerConditions(Consumer<List<TriggerCondition>> triggerConditionsSetter) {
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
    public List<TriggerCondition> getTriggerConditions() {
        return triggerConditions;
    }

    public void setTriggerConditions(List<TriggerCondition> triggerConditions) {
        this.triggerConditions = triggerConditions;
    }

    public MetricAlarmSpec withAlarmRuleTemplateBindEnable(Boolean alarmRuleTemplateBindEnable) {
        this.alarmRuleTemplateBindEnable = alarmRuleTemplateBindEnable;
        return this;
    }

    /**
     * 是否绑定告警规则模版（废弃）。
     * @return alarmRuleTemplateBindEnable
     */
    public Boolean getAlarmRuleTemplateBindEnable() {
        return alarmRuleTemplateBindEnable;
    }

    public void setAlarmRuleTemplateBindEnable(Boolean alarmRuleTemplateBindEnable) {
        this.alarmRuleTemplateBindEnable = alarmRuleTemplateBindEnable;
    }

    public MetricAlarmSpec withAlarmRuleTemplateId(String alarmRuleTemplateId) {
        this.alarmRuleTemplateId = alarmRuleTemplateId;
        return this;
    }

    /**
     * 告警规则模版id（废弃）。
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
        MetricAlarmSpec that = (MetricAlarmSpec) obj;
        return Objects.equals(this.monitorType, that.monitorType)
            && Objects.equals(this.noDataConditions, that.noDataConditions)
            && Objects.equals(this.alarmTags, that.alarmTags)
            && Objects.equals(this.monitorObjects, that.monitorObjects)
            && Objects.equals(this.recoveryConditions, that.recoveryConditions)
            && Objects.equals(this.triggerConditions, that.triggerConditions)
            && Objects.equals(this.alarmRuleTemplateBindEnable, that.alarmRuleTemplateBindEnable)
            && Objects.equals(this.alarmRuleTemplateId, that.alarmRuleTemplateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(monitorType,
            noDataConditions,
            alarmTags,
            monitorObjects,
            recoveryConditions,
            triggerConditions,
            alarmRuleTemplateBindEnable,
            alarmRuleTemplateId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricAlarmSpec {\n");
        sb.append("    monitorType: ").append(toIndentedString(monitorType)).append("\n");
        sb.append("    noDataConditions: ").append(toIndentedString(noDataConditions)).append("\n");
        sb.append("    alarmTags: ").append(toIndentedString(alarmTags)).append("\n");
        sb.append("    monitorObjects: ").append(toIndentedString(monitorObjects)).append("\n");
        sb.append("    recoveryConditions: ").append(toIndentedString(recoveryConditions)).append("\n");
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
