package com.huaweicloud.sdk.iotda.v5.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 上报设备告警消息结构
 */
public class ActionDeviceAlarm  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_status")
    
    private String alarmStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="severity")
    
    private String severity;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;

    public ActionDeviceAlarm withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 告警名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ActionDeviceAlarm withAlarmStatus(String alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }

    


    /**
     * 告警状态。 - fault：上报告警。 - recovery：恢复告警。 
     * @return alarmStatus
     */
    public String getAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(String alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    public ActionDeviceAlarm withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    


    /**
     * 告警级别,取值范围：warning（警告）、minor（一般）、major（严重）和critical（致命）。
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public ActionDeviceAlarm withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 告警的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionDeviceAlarm actionDeviceAlarm = (ActionDeviceAlarm) o;
        return Objects.equals(this.name, actionDeviceAlarm.name) &&
            Objects.equals(this.alarmStatus, actionDeviceAlarm.alarmStatus) &&
            Objects.equals(this.severity, actionDeviceAlarm.severity) &&
            Objects.equals(this.description, actionDeviceAlarm.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, alarmStatus, severity, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionDeviceAlarm {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    alarmStatus: ").append(toIndentedString(alarmStatus)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

