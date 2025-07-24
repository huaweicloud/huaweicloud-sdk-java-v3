package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AlarmDeviceInfo
 */
public class AlarmDeviceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_device")

    private String alarmDevice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_number")

    private Integer alarmNumber;

    public AlarmDeviceInfo withAlarmDevice(String alarmDevice) {
        this.alarmDevice = alarmDevice;
        return this;
    }

    /**
     * 告警硬件
     * @return alarmDevice
     */
    public String getAlarmDevice() {
        return alarmDevice;
    }

    public void setAlarmDevice(String alarmDevice) {
        this.alarmDevice = alarmDevice;
    }

    public AlarmDeviceInfo withAlarmNumber(Integer alarmNumber) {
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
        AlarmDeviceInfo that = (AlarmDeviceInfo) obj;
        return Objects.equals(this.alarmDevice, that.alarmDevice) && Objects.equals(this.alarmNumber, that.alarmNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmDevice, alarmNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmDeviceInfo {\n");
        sb.append("    alarmDevice: ").append(toIndentedString(alarmDevice)).append("\n");
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
