package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 设置告警提醒开关请求体
 */
public class SetRemindersConfigRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reminders")

    private Boolean reminders;

    public SetRemindersConfigRequestInfo withReminders(Boolean reminders) {
        this.reminders = reminders;
        return this;
    }

    /**
     * **参数解释**: 是否开启告警提醒 **约束限制**: 必填 **取值范围**: - true：开启 - false：关闭  **默认取值**: 不涉及 
     * @return reminders
     */
    public Boolean getReminders() {
        return reminders;
    }

    public void setReminders(Boolean reminders) {
        this.reminders = reminders;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetRemindersConfigRequestInfo that = (SetRemindersConfigRequestInfo) obj;
        return Objects.equals(this.reminders, that.reminders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reminders);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetRemindersConfigRequestInfo {\n");
        sb.append("    reminders: ").append(toIndentedString(reminders)).append("\n");
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
