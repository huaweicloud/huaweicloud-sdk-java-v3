package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AlarmInfo
 */
public class AlarmInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_device")

    private String alarmDevice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_number")

    private Integer alarmNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_duration")

    private Long alarmDuration;

    public AlarmInfo withAlarmDevice(String alarmDevice) {
        this.alarmDevice = alarmDevice;
        return this;
    }

    /**
     * 告警设备
     * @return alarmDevice
     */
    public String getAlarmDevice() {
        return alarmDevice;
    }

    public void setAlarmDevice(String alarmDevice) {
        this.alarmDevice = alarmDevice;
    }

    public AlarmInfo withAlarmNumber(Integer alarmNumber) {
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

    public AlarmInfo withAlarmDuration(Long alarmDuration) {
        this.alarmDuration = alarmDuration;
        return this;
    }

    /**
     * 告警时间
     * @return alarmDuration
     */
    public Long getAlarmDuration() {
        return alarmDuration;
    }

    public void setAlarmDuration(Long alarmDuration) {
        this.alarmDuration = alarmDuration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmInfo that = (AlarmInfo) obj;
        return Objects.equals(this.alarmDevice, that.alarmDevice) && Objects.equals(this.alarmNumber, that.alarmNumber)
            && Objects.equals(this.alarmDuration, that.alarmDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmDevice, alarmNumber, alarmDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmInfo {\n");
        sb.append("    alarmDevice: ").append(toIndentedString(alarmDevice)).append("\n");
        sb.append("    alarmNumber: ").append(toIndentedString(alarmNumber)).append("\n");
        sb.append("    alarmDuration: ").append(toIndentedString(alarmDuration)).append("\n");
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
