package com.huaweicloud.sdk.clouddc.v1.model;

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
public class ShowAlarmSummaryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_levels")

    private List<AlarmLevelInfo> alarmLevels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_devices")

    private List<AlarmDeviceInfo> alarmDevices = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_hosts")

    private List<AlarmHost> alarmHosts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_groups")

    private List<AlarmGroup> alarmGroups = null;

    public ShowAlarmSummaryResponse withAlarmLevels(List<AlarmLevelInfo> alarmLevels) {
        this.alarmLevels = alarmLevels;
        return this;
    }

    public ShowAlarmSummaryResponse addAlarmLevelsItem(AlarmLevelInfo alarmLevelsItem) {
        if (this.alarmLevels == null) {
            this.alarmLevels = new ArrayList<>();
        }
        this.alarmLevels.add(alarmLevelsItem);
        return this;
    }

    public ShowAlarmSummaryResponse withAlarmLevels(Consumer<List<AlarmLevelInfo>> alarmLevelsSetter) {
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

    public ShowAlarmSummaryResponse withAlarmDevices(List<AlarmDeviceInfo> alarmDevices) {
        this.alarmDevices = alarmDevices;
        return this;
    }

    public ShowAlarmSummaryResponse addAlarmDevicesItem(AlarmDeviceInfo alarmDevicesItem) {
        if (this.alarmDevices == null) {
            this.alarmDevices = new ArrayList<>();
        }
        this.alarmDevices.add(alarmDevicesItem);
        return this;
    }

    public ShowAlarmSummaryResponse withAlarmDevices(Consumer<List<AlarmDeviceInfo>> alarmDevicesSetter) {
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

    public ShowAlarmSummaryResponse withAlarmHosts(List<AlarmHost> alarmHosts) {
        this.alarmHosts = alarmHosts;
        return this;
    }

    public ShowAlarmSummaryResponse addAlarmHostsItem(AlarmHost alarmHostsItem) {
        if (this.alarmHosts == null) {
            this.alarmHosts = new ArrayList<>();
        }
        this.alarmHosts.add(alarmHostsItem);
        return this;
    }

    public ShowAlarmSummaryResponse withAlarmHosts(Consumer<List<AlarmHost>> alarmHostsSetter) {
        if (this.alarmHosts == null) {
            this.alarmHosts = new ArrayList<>();
        }
        alarmHostsSetter.accept(this.alarmHosts);
        return this;
    }

    /**
     * 故障服务器Top10
     * @return alarmHosts
     */
    public List<AlarmHost> getAlarmHosts() {
        return alarmHosts;
    }

    public void setAlarmHosts(List<AlarmHost> alarmHosts) {
        this.alarmHosts = alarmHosts;
    }

    public ShowAlarmSummaryResponse withAlarmGroups(List<AlarmGroup> alarmGroups) {
        this.alarmGroups = alarmGroups;
        return this;
    }

    public ShowAlarmSummaryResponse addAlarmGroupsItem(AlarmGroup alarmGroupsItem) {
        if (this.alarmGroups == null) {
            this.alarmGroups = new ArrayList<>();
        }
        this.alarmGroups.add(alarmGroupsItem);
        return this;
    }

    public ShowAlarmSummaryResponse withAlarmGroups(Consumer<List<AlarmGroup>> alarmGroupsSetter) {
        if (this.alarmGroups == null) {
            this.alarmGroups = new ArrayList<>();
        }
        alarmGroupsSetter.accept(this.alarmGroups);
        return this;
    }

    /**
     * 告警分组
     * @return alarmGroups
     */
    public List<AlarmGroup> getAlarmGroups() {
        return alarmGroups;
    }

    public void setAlarmGroups(List<AlarmGroup> alarmGroups) {
        this.alarmGroups = alarmGroups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAlarmSummaryResponse that = (ShowAlarmSummaryResponse) obj;
        return Objects.equals(this.alarmLevels, that.alarmLevels)
            && Objects.equals(this.alarmDevices, that.alarmDevices) && Objects.equals(this.alarmHosts, that.alarmHosts)
            && Objects.equals(this.alarmGroups, that.alarmGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmLevels, alarmDevices, alarmHosts, alarmGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAlarmSummaryResponse {\n");
        sb.append("    alarmLevels: ").append(toIndentedString(alarmLevels)).append("\n");
        sb.append("    alarmDevices: ").append(toIndentedString(alarmDevices)).append("\n");
        sb.append("    alarmHosts: ").append(toIndentedString(alarmHosts)).append("\n");
        sb.append("    alarmGroups: ").append(toIndentedString(alarmGroups)).append("\n");
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
