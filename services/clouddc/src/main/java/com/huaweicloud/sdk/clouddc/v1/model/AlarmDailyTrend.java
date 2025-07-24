package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AlarmDailyTrend
 */
public class AlarmDailyTrend {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_date")

    private OffsetDateTime alarmDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_devices")

    private List<AlarmDeviceInfo> alarmDevices = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_levels")

    private List<AlarmLevelInfo> alarmLevels = null;

    public AlarmDailyTrend withAlarmDate(OffsetDateTime alarmDate) {
        this.alarmDate = alarmDate;
        return this;
    }

    /**
     * 告警时间
     * @return alarmDate
     */
    public OffsetDateTime getAlarmDate() {
        return alarmDate;
    }

    public void setAlarmDate(OffsetDateTime alarmDate) {
        this.alarmDate = alarmDate;
    }

    public AlarmDailyTrend withAlarmDevices(List<AlarmDeviceInfo> alarmDevices) {
        this.alarmDevices = alarmDevices;
        return this;
    }

    public AlarmDailyTrend addAlarmDevicesItem(AlarmDeviceInfo alarmDevicesItem) {
        if (this.alarmDevices == null) {
            this.alarmDevices = new ArrayList<>();
        }
        this.alarmDevices.add(alarmDevicesItem);
        return this;
    }

    public AlarmDailyTrend withAlarmDevices(Consumer<List<AlarmDeviceInfo>> alarmDevicesSetter) {
        if (this.alarmDevices == null) {
            this.alarmDevices = new ArrayList<>();
        }
        alarmDevicesSetter.accept(this.alarmDevices);
        return this;
    }

    /**
     * 告警设备信息，包括设备类型及告警数量
     * @return alarmDevices
     */
    public List<AlarmDeviceInfo> getAlarmDevices() {
        return alarmDevices;
    }

    public void setAlarmDevices(List<AlarmDeviceInfo> alarmDevices) {
        this.alarmDevices = alarmDevices;
    }

    public AlarmDailyTrend withAlarmLevels(List<AlarmLevelInfo> alarmLevels) {
        this.alarmLevels = alarmLevels;
        return this;
    }

    public AlarmDailyTrend addAlarmLevelsItem(AlarmLevelInfo alarmLevelsItem) {
        if (this.alarmLevels == null) {
            this.alarmLevels = new ArrayList<>();
        }
        this.alarmLevels.add(alarmLevelsItem);
        return this;
    }

    public AlarmDailyTrend withAlarmLevels(Consumer<List<AlarmLevelInfo>> alarmLevelsSetter) {
        if (this.alarmLevels == null) {
            this.alarmLevels = new ArrayList<>();
        }
        alarmLevelsSetter.accept(this.alarmLevels);
        return this;
    }

    /**
     * 告警级别
     * @return alarmLevels
     */
    public List<AlarmLevelInfo> getAlarmLevels() {
        return alarmLevels;
    }

    public void setAlarmLevels(List<AlarmLevelInfo> alarmLevels) {
        this.alarmLevels = alarmLevels;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmDailyTrend that = (AlarmDailyTrend) obj;
        return Objects.equals(this.alarmDate, that.alarmDate) && Objects.equals(this.alarmDevices, that.alarmDevices)
            && Objects.equals(this.alarmLevels, that.alarmLevels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmDate, alarmDevices, alarmLevels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmDailyTrend {\n");
        sb.append("    alarmDate: ").append(toIndentedString(alarmDate)).append("\n");
        sb.append("    alarmDevices: ").append(toIndentedString(alarmDevices)).append("\n");
        sb.append("    alarmLevels: ").append(toIndentedString(alarmLevels)).append("\n");
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
