package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAlarmRuleTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_templates")

    private List<AlarmRuleTemplateBody> alarmRuleTemplates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListAlarmRuleTemplateResponse withAlarmRuleTemplates(List<AlarmRuleTemplateBody> alarmRuleTemplates) {
        this.alarmRuleTemplates = alarmRuleTemplates;
        return this;
    }

    public ListAlarmRuleTemplateResponse addAlarmRuleTemplatesItem(AlarmRuleTemplateBody alarmRuleTemplatesItem) {
        if (this.alarmRuleTemplates == null) {
            this.alarmRuleTemplates = new ArrayList<>();
        }
        this.alarmRuleTemplates.add(alarmRuleTemplatesItem);
        return this;
    }

    public ListAlarmRuleTemplateResponse withAlarmRuleTemplates(
        Consumer<List<AlarmRuleTemplateBody>> alarmRuleTemplatesSetter) {
        if (this.alarmRuleTemplates == null) {
            this.alarmRuleTemplates = new ArrayList<>();
        }
        alarmRuleTemplatesSetter.accept(this.alarmRuleTemplates);
        return this;
    }

    /**
     * 告警模板列表。
     * @return alarmRuleTemplates
     */
    public List<AlarmRuleTemplateBody> getAlarmRuleTemplates() {
        return alarmRuleTemplates;
    }

    public void setAlarmRuleTemplates(List<AlarmRuleTemplateBody> alarmRuleTemplates) {
        this.alarmRuleTemplates = alarmRuleTemplates;
    }

    public ListAlarmRuleTemplateResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 告警模板总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAlarmRuleTemplateResponse that = (ListAlarmRuleTemplateResponse) obj;
        return Objects.equals(this.alarmRuleTemplates, that.alarmRuleTemplates)
            && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmRuleTemplates, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmRuleTemplateResponse {\n");
        sb.append("    alarmRuleTemplates: ").append(toIndentedString(alarmRuleTemplates)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
