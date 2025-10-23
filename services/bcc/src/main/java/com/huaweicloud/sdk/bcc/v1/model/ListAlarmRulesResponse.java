package com.huaweicloud.sdk.bcc.v1.model;

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
public class ListAlarmRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rules")

    private List<AlarmRuleEntity> alarmRules = null;

    public ListAlarmRulesResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 告警规则总条数
     * minimum: 0
     * maximum: 65535
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListAlarmRulesResponse withAlarmRules(List<AlarmRuleEntity> alarmRules) {
        this.alarmRules = alarmRules;
        return this;
    }

    public ListAlarmRulesResponse addAlarmRulesItem(AlarmRuleEntity alarmRulesItem) {
        if (this.alarmRules == null) {
            this.alarmRules = new ArrayList<>();
        }
        this.alarmRules.add(alarmRulesItem);
        return this;
    }

    public ListAlarmRulesResponse withAlarmRules(Consumer<List<AlarmRuleEntity>> alarmRulesSetter) {
        if (this.alarmRules == null) {
            this.alarmRules = new ArrayList<>();
        }
        alarmRulesSetter.accept(this.alarmRules);
        return this;
    }

    /**
     * 告警规则
     * @return alarmRules
     */
    public List<AlarmRuleEntity> getAlarmRules() {
        return alarmRules;
    }

    public void setAlarmRules(List<AlarmRuleEntity> alarmRules) {
        this.alarmRules = alarmRules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAlarmRulesResponse that = (ListAlarmRulesResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.alarmRules, that.alarmRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, alarmRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmRulesResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    alarmRules: ").append(toIndentedString(alarmRules)).append("\n");
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
