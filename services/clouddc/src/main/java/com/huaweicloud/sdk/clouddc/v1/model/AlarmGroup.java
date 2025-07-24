package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AlarmGroup
 */
public class AlarmGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_devices")

    private List<AlarmDeviceInfo> alarmDevices = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sns")

    private List<String> sns = null;

    public AlarmGroup withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 标签
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public AlarmGroup withAlarmDevices(List<AlarmDeviceInfo> alarmDevices) {
        this.alarmDevices = alarmDevices;
        return this;
    }

    public AlarmGroup addAlarmDevicesItem(AlarmDeviceInfo alarmDevicesItem) {
        if (this.alarmDevices == null) {
            this.alarmDevices = new ArrayList<>();
        }
        this.alarmDevices.add(alarmDevicesItem);
        return this;
    }

    public AlarmGroup withAlarmDevices(Consumer<List<AlarmDeviceInfo>> alarmDevicesSetter) {
        if (this.alarmDevices == null) {
            this.alarmDevices = new ArrayList<>();
        }
        alarmDevicesSetter.accept(this.alarmDevices);
        return this;
    }

    /**
     * 告警设备
     * @return alarmDevices
     */
    public List<AlarmDeviceInfo> getAlarmDevices() {
        return alarmDevices;
    }

    public void setAlarmDevices(List<AlarmDeviceInfo> alarmDevices) {
        this.alarmDevices = alarmDevices;
    }

    public AlarmGroup withSns(List<String> sns) {
        this.sns = sns;
        return this;
    }

    public AlarmGroup addSnsItem(String snsItem) {
        if (this.sns == null) {
            this.sns = new ArrayList<>();
        }
        this.sns.add(snsItem);
        return this;
    }

    public AlarmGroup withSns(Consumer<List<String>> snsSetter) {
        if (this.sns == null) {
            this.sns = new ArrayList<>();
        }
        snsSetter.accept(this.sns);
        return this;
    }

    /**
     * sn列表
     * @return sns
     */
    public List<String> getSns() {
        return sns;
    }

    public void setSns(List<String> sns) {
        this.sns = sns;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmGroup that = (AlarmGroup) obj;
        return Objects.equals(this.label, that.label) && Objects.equals(this.alarmDevices, that.alarmDevices)
            && Objects.equals(this.sns, that.sns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, alarmDevices, sns);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmGroup {\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    alarmDevices: ").append(toIndentedString(alarmDevices)).append("\n");
        sb.append("    sns: ").append(toIndentedString(sns)).append("\n");
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
