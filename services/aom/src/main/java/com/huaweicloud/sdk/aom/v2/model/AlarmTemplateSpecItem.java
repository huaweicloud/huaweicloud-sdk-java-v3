package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * AlarmTemplateSpecItem
 */
public class AlarmTemplateSpecItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_template_name")

    private String alarmTemplateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_template_name_en")

    private String alarmTemplateNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc_en")

    private String descEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_template_spec_type")

    private String alarmTemplateSpecType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_alarm_template_spec")

    private MetricAlarmTemplateSpec metricAlarmTemplateSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_alarm_template_spec")

    private EventAlarmTemplateSpec eventAlarmTemplateSpec;

    public AlarmTemplateSpecItem withAlarmTemplateName(String alarmTemplateName) {
        this.alarmTemplateName = alarmTemplateName;
        return this;
    }

    /**
     * 告警模板下单个告警规则名称。
     * @return alarmTemplateName
     */
    public String getAlarmTemplateName() {
        return alarmTemplateName;
    }

    public void setAlarmTemplateName(String alarmTemplateName) {
        this.alarmTemplateName = alarmTemplateName;
    }

    public AlarmTemplateSpecItem withAlarmTemplateNameEn(String alarmTemplateNameEn) {
        this.alarmTemplateNameEn = alarmTemplateNameEn;
        return this;
    }

    /**
     * 告警模板下单个告警规则英文名称。
     * @return alarmTemplateNameEn
     */
    public String getAlarmTemplateNameEn() {
        return alarmTemplateNameEn;
    }

    public void setAlarmTemplateNameEn(String alarmTemplateNameEn) {
        this.alarmTemplateNameEn = alarmTemplateNameEn;
    }

    public AlarmTemplateSpecItem withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 告警模板下单个告警规则描述。
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public AlarmTemplateSpecItem withDescEn(String descEn) {
        this.descEn = descEn;
        return this;
    }

    /**
     * 告警模板下单个告警规则英文描述。
     * @return descEn
     */
    public String getDescEn() {
        return descEn;
    }

    public void setDescEn(String descEn) {
        this.descEn = descEn;
    }

    public AlarmTemplateSpecItem withAlarmTemplateSpecType(String alarmTemplateSpecType) {
        this.alarmTemplateSpecType = alarmTemplateSpecType;
        return this;
    }

    /**
     * 告警模板下单个告警规则类型。 “metric”：指标告警 “event”：事件告警
     * @return alarmTemplateSpecType
     */
    public String getAlarmTemplateSpecType() {
        return alarmTemplateSpecType;
    }

    public void setAlarmTemplateSpecType(String alarmTemplateSpecType) {
        this.alarmTemplateSpecType = alarmTemplateSpecType;
    }

    public AlarmTemplateSpecItem withMetricAlarmTemplateSpec(MetricAlarmTemplateSpec metricAlarmTemplateSpec) {
        this.metricAlarmTemplateSpec = metricAlarmTemplateSpec;
        return this;
    }

    public AlarmTemplateSpecItem withMetricAlarmTemplateSpec(
        Consumer<MetricAlarmTemplateSpec> metricAlarmTemplateSpecSetter) {
        if (this.metricAlarmTemplateSpec == null) {
            this.metricAlarmTemplateSpec = new MetricAlarmTemplateSpec();
            metricAlarmTemplateSpecSetter.accept(this.metricAlarmTemplateSpec);
        }

        return this;
    }

    /**
     * Get metricAlarmTemplateSpec
     * @return metricAlarmTemplateSpec
     */
    public MetricAlarmTemplateSpec getMetricAlarmTemplateSpec() {
        return metricAlarmTemplateSpec;
    }

    public void setMetricAlarmTemplateSpec(MetricAlarmTemplateSpec metricAlarmTemplateSpec) {
        this.metricAlarmTemplateSpec = metricAlarmTemplateSpec;
    }

    public AlarmTemplateSpecItem withEventAlarmTemplateSpec(EventAlarmTemplateSpec eventAlarmTemplateSpec) {
        this.eventAlarmTemplateSpec = eventAlarmTemplateSpec;
        return this;
    }

    public AlarmTemplateSpecItem withEventAlarmTemplateSpec(
        Consumer<EventAlarmTemplateSpec> eventAlarmTemplateSpecSetter) {
        if (this.eventAlarmTemplateSpec == null) {
            this.eventAlarmTemplateSpec = new EventAlarmTemplateSpec();
            eventAlarmTemplateSpecSetter.accept(this.eventAlarmTemplateSpec);
        }

        return this;
    }

    /**
     * Get eventAlarmTemplateSpec
     * @return eventAlarmTemplateSpec
     */
    public EventAlarmTemplateSpec getEventAlarmTemplateSpec() {
        return eventAlarmTemplateSpec;
    }

    public void setEventAlarmTemplateSpec(EventAlarmTemplateSpec eventAlarmTemplateSpec) {
        this.eventAlarmTemplateSpec = eventAlarmTemplateSpec;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmTemplateSpecItem that = (AlarmTemplateSpecItem) obj;
        return Objects.equals(this.alarmTemplateName, that.alarmTemplateName)
            && Objects.equals(this.alarmTemplateNameEn, that.alarmTemplateNameEn)
            && Objects.equals(this.desc, that.desc) && Objects.equals(this.descEn, that.descEn)
            && Objects.equals(this.alarmTemplateSpecType, that.alarmTemplateSpecType)
            && Objects.equals(this.metricAlarmTemplateSpec, that.metricAlarmTemplateSpec)
            && Objects.equals(this.eventAlarmTemplateSpec, that.eventAlarmTemplateSpec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmTemplateName,
            alarmTemplateNameEn,
            desc,
            descEn,
            alarmTemplateSpecType,
            metricAlarmTemplateSpec,
            eventAlarmTemplateSpec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmTemplateSpecItem {\n");
        sb.append("    alarmTemplateName: ").append(toIndentedString(alarmTemplateName)).append("\n");
        sb.append("    alarmTemplateNameEn: ").append(toIndentedString(alarmTemplateNameEn)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    descEn: ").append(toIndentedString(descEn)).append("\n");
        sb.append("    alarmTemplateSpecType: ").append(toIndentedString(alarmTemplateSpecType)).append("\n");
        sb.append("    metricAlarmTemplateSpec: ").append(toIndentedString(metricAlarmTemplateSpec)).append("\n");
        sb.append("    eventAlarmTemplateSpec: ").append(toIndentedString(eventAlarmTemplateSpec)).append("\n");
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
