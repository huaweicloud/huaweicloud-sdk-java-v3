package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DeleteAlarmRuleTemplateItemResult
 */
public class DeleteAlarmRuleTemplateItemResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_template_name")

    private String alarmRuleTemplateName;

    public DeleteAlarmRuleTemplateItemResult withAlarmRuleTemplateName(String alarmRuleTemplateName) {
        this.alarmRuleTemplateName = alarmRuleTemplateName;
        return this;
    }

    /**
     * 告警模板id。
     * @return alarmRuleTemplateName
     */
    public String getAlarmRuleTemplateName() {
        return alarmRuleTemplateName;
    }

    public void setAlarmRuleTemplateName(String alarmRuleTemplateName) {
        this.alarmRuleTemplateName = alarmRuleTemplateName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteAlarmRuleTemplateItemResult that = (DeleteAlarmRuleTemplateItemResult) obj;
        return Objects.equals(this.alarmRuleTemplateName, that.alarmRuleTemplateName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmRuleTemplateName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAlarmRuleTemplateItemResult {\n");
        sb.append("    alarmRuleTemplateName: ").append(toIndentedString(alarmRuleTemplateName)).append("\n");
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
