package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AlarmLevelInfo
 */
public class AlarmLevelInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_level")

    private Integer alarmLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_number")

    private Integer alarmNumber;

    public AlarmLevelInfo withAlarmLevel(Integer alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }

    /**
     * 告警级别
     * @return alarmLevel
     */
    public Integer getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(Integer alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public AlarmLevelInfo withAlarmNumber(Integer alarmNumber) {
        this.alarmNumber = alarmNumber;
        return this;
    }

    /**
     * 告警数量
     * @return alarmNumber
     */
    public Integer getAlarmNumber() {
        return alarmNumber;
    }

    public void setAlarmNumber(Integer alarmNumber) {
        this.alarmNumber = alarmNumber;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmLevelInfo that = (AlarmLevelInfo) obj;
        return Objects.equals(this.alarmLevel, that.alarmLevel) && Objects.equals(this.alarmNumber, that.alarmNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmLevel, alarmNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmLevelInfo {\n");
        sb.append("    alarmLevel: ").append(toIndentedString(alarmLevel)).append("\n");
        sb.append("    alarmNumber: ").append(toIndentedString(alarmNumber)).append("\n");
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
