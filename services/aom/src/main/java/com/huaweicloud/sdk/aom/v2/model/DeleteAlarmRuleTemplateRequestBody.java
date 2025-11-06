package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteAlarmRuleTemplateRequestBody
 */
public class DeleteAlarmRuleTemplateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_templates")

    private List<String> alarmRuleTemplates = null;

    public DeleteAlarmRuleTemplateRequestBody withAlarmRuleTemplates(List<String> alarmRuleTemplates) {
        this.alarmRuleTemplates = alarmRuleTemplates;
        return this;
    }

    public DeleteAlarmRuleTemplateRequestBody addAlarmRuleTemplatesItem(String alarmRuleTemplatesItem) {
        if (this.alarmRuleTemplates == null) {
            this.alarmRuleTemplates = new ArrayList<>();
        }
        this.alarmRuleTemplates.add(alarmRuleTemplatesItem);
        return this;
    }

    public DeleteAlarmRuleTemplateRequestBody withAlarmRuleTemplates(Consumer<List<String>> alarmRuleTemplatesSetter) {
        if (this.alarmRuleTemplates == null) {
            this.alarmRuleTemplates = new ArrayList<>();
        }
        alarmRuleTemplatesSetter.accept(this.alarmRuleTemplates);
        return this;
    }

    /**
     * 告警模板id列表。
     * @return alarmRuleTemplates
     */
    public List<String> getAlarmRuleTemplates() {
        return alarmRuleTemplates;
    }

    public void setAlarmRuleTemplates(List<String> alarmRuleTemplates) {
        this.alarmRuleTemplates = alarmRuleTemplates;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteAlarmRuleTemplateRequestBody that = (DeleteAlarmRuleTemplateRequestBody) obj;
        return Objects.equals(this.alarmRuleTemplates, that.alarmRuleTemplates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmRuleTemplates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAlarmRuleTemplateRequestBody {\n");
        sb.append("    alarmRuleTemplates: ").append(toIndentedString(alarmRuleTemplates)).append("\n");
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
