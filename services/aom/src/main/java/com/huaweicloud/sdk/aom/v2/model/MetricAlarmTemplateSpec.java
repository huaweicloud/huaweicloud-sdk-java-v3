package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MetricAlarmTemplateSpec
 */
public class MetricAlarmTemplateSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_subtype")

    private String alarmSubtype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_source")

    private String alarmSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitor_type")

    private String monitorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_conditions")

    private List<TemplateTriggerCondition> triggerConditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no_data_conditions")

    private List<NoDataCondition> noDataConditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_tags")

    private List<AlarmTags> alarmTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recovery_conditions")

    private RecoveryCondition recoveryConditions;

    public MetricAlarmTemplateSpec withAlarmSubtype(String alarmSubtype) {
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

    public MetricAlarmTemplateSpec withAlarmSource(String alarmSource) {
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

    public MetricAlarmTemplateSpec withMonitorType(String monitorType) {
        this.monitorType = monitorType;
        return this;
    }

    /**
     * 监控类型。
     * @return monitorType
     */
    public String getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType;
    }

    public MetricAlarmTemplateSpec withTriggerConditions(List<TemplateTriggerCondition> triggerConditions) {
        this.triggerConditions = triggerConditions;
        return this;
    }

    public MetricAlarmTemplateSpec addTriggerConditionsItem(TemplateTriggerCondition triggerConditionsItem) {
        if (this.triggerConditions == null) {
            this.triggerConditions = new ArrayList<>();
        }
        this.triggerConditions.add(triggerConditionsItem);
        return this;
    }

    public MetricAlarmTemplateSpec withTriggerConditions(
        Consumer<List<TemplateTriggerCondition>> triggerConditionsSetter) {
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
    public List<TemplateTriggerCondition> getTriggerConditions() {
        return triggerConditions;
    }

    public void setTriggerConditions(List<TemplateTriggerCondition> triggerConditions) {
        this.triggerConditions = triggerConditions;
    }

    public MetricAlarmTemplateSpec withNoDataConditions(List<NoDataCondition> noDataConditions) {
        this.noDataConditions = noDataConditions;
        return this;
    }

    public MetricAlarmTemplateSpec addNoDataConditionsItem(NoDataCondition noDataConditionsItem) {
        if (this.noDataConditions == null) {
            this.noDataConditions = new ArrayList<>();
        }
        this.noDataConditions.add(noDataConditionsItem);
        return this;
    }

    public MetricAlarmTemplateSpec withNoDataConditions(Consumer<List<NoDataCondition>> noDataConditionsSetter) {
        if (this.noDataConditions == null) {
            this.noDataConditions = new ArrayList<>();
        }
        noDataConditionsSetter.accept(this.noDataConditions);
        return this;
    }

    /**
     * 数据不足条件。
     * @return noDataConditions
     */
    public List<NoDataCondition> getNoDataConditions() {
        return noDataConditions;
    }

    public void setNoDataConditions(List<NoDataCondition> noDataConditions) {
        this.noDataConditions = noDataConditions;
    }

    public MetricAlarmTemplateSpec withAlarmTags(List<AlarmTags> alarmTags) {
        this.alarmTags = alarmTags;
        return this;
    }

    public MetricAlarmTemplateSpec addAlarmTagsItem(AlarmTags alarmTagsItem) {
        if (this.alarmTags == null) {
            this.alarmTags = new ArrayList<>();
        }
        this.alarmTags.add(alarmTagsItem);
        return this;
    }

    public MetricAlarmTemplateSpec withAlarmTags(Consumer<List<AlarmTags>> alarmTagsSetter) {
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

    public MetricAlarmTemplateSpec withRecoveryConditions(RecoveryCondition recoveryConditions) {
        this.recoveryConditions = recoveryConditions;
        return this;
    }

    public MetricAlarmTemplateSpec withRecoveryConditions(Consumer<RecoveryCondition> recoveryConditionsSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetricAlarmTemplateSpec that = (MetricAlarmTemplateSpec) obj;
        return Objects.equals(this.alarmSubtype, that.alarmSubtype)
            && Objects.equals(this.alarmSource, that.alarmSource) && Objects.equals(this.monitorType, that.monitorType)
            && Objects.equals(this.triggerConditions, that.triggerConditions)
            && Objects.equals(this.noDataConditions, that.noDataConditions)
            && Objects.equals(this.alarmTags, that.alarmTags)
            && Objects.equals(this.recoveryConditions, that.recoveryConditions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmSubtype,
            alarmSource,
            monitorType,
            triggerConditions,
            noDataConditions,
            alarmTags,
            recoveryConditions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricAlarmTemplateSpec {\n");
        sb.append("    alarmSubtype: ").append(toIndentedString(alarmSubtype)).append("\n");
        sb.append("    alarmSource: ").append(toIndentedString(alarmSource)).append("\n");
        sb.append("    monitorType: ").append(toIndentedString(monitorType)).append("\n");
        sb.append("    triggerConditions: ").append(toIndentedString(triggerConditions)).append("\n");
        sb.append("    noDataConditions: ").append(toIndentedString(noDataConditions)).append("\n");
        sb.append("    alarmTags: ").append(toIndentedString(alarmTags)).append("\n");
        sb.append("    recoveryConditions: ").append(toIndentedString(recoveryConditions)).append("\n");
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
