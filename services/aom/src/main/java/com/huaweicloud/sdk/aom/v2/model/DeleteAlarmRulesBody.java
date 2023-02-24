package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DeleteAlarmRulesBody
 */
public class DeleteAlarmRulesBody  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_rules")
    
    private List<String> alarmRules = null;
    
    public DeleteAlarmRulesBody withAlarmRules(List<String> alarmRules) {
        this.alarmRules = alarmRules;
        return this;
    }

    
    public DeleteAlarmRulesBody addAlarmRulesItem(String alarmRulesItem) {
        if(this.alarmRules == null) {
            this.alarmRules = new ArrayList<>();
        }
        this.alarmRules.add(alarmRulesItem);
        return this;
    }

    public DeleteAlarmRulesBody withAlarmRules(Consumer<List<String>> alarmRulesSetter) {
        if(this.alarmRules == null) {
            this.alarmRules = new ArrayList<>();
        }
        alarmRulesSetter.accept(this.alarmRules);
        return this;
    }

    /**
     * 阈值规则列表
     * @return alarmRules
     */
    public List<String> getAlarmRules() {
        return alarmRules;
    }

    public void setAlarmRules(List<String> alarmRules) {
        this.alarmRules = alarmRules;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteAlarmRulesBody deleteAlarmRulesBody = (DeleteAlarmRulesBody) o;
        return Objects.equals(this.alarmRules, deleteAlarmRulesBody.alarmRules);
    }
    @Override
    public int hashCode() {
        return Objects.hash(alarmRules);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAlarmRulesBody {\n");
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

