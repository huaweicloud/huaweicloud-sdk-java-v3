package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteAlarmRuleRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_rule_id")
    
    @JacksonXmlProperty(localName = "alarm_rule_id")
    
    private String alarmRuleId;

    public DeleteAlarmRuleRequest withAlarmRuleId(String alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
        return this;
    }

    


    /**
     * 阈值规则ID。
     * @return alarmRuleId
     */
    public String getAlarmRuleId() {
        return alarmRuleId;
    }

    public void setAlarmRuleId(String alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteAlarmRuleRequest deleteAlarmRuleRequest = (DeleteAlarmRuleRequest) o;
        return Objects.equals(this.alarmRuleId, deleteAlarmRuleRequest.alarmRuleId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(alarmRuleId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAlarmRuleRequest {\n");
        sb.append("    alarmRuleId: ").append(toIndentedString(alarmRuleId)).append("\n");
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

