package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConfigAlarmTopicRequest
 */
public class ConfigAlarmTopicRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_cpu")

    private Integer alarmCpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_disk")

    private Integer alarmDisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_memory")

    private Integer alarmMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_num")

    private Integer alarmNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_risk")

    private List<String> alarmRisk = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_switch")

    private String alarmSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_topic_urn")

    private String alarmTopicUrn;

    public ConfigAlarmTopicRequest withAlarmCpu(Integer alarmCpu) {
        this.alarmCpu = alarmCpu;
        return this;
    }

    /**
     * CPU告警阈值(%)
     * minimum: 1
     * maximum: 100
     * @return alarmCpu
     */
    public Integer getAlarmCpu() {
        return alarmCpu;
    }

    public void setAlarmCpu(Integer alarmCpu) {
        this.alarmCpu = alarmCpu;
    }

    public ConfigAlarmTopicRequest withAlarmDisk(Integer alarmDisk) {
        this.alarmDisk = alarmDisk;
        return this;
    }

    /**
     * 磁盘告警阈值(%)
     * minimum: 1
     * maximum: 100
     * @return alarmDisk
     */
    public Integer getAlarmDisk() {
        return alarmDisk;
    }

    public void setAlarmDisk(Integer alarmDisk) {
        this.alarmDisk = alarmDisk;
    }

    public ConfigAlarmTopicRequest withAlarmMemory(Integer alarmMemory) {
        this.alarmMemory = alarmMemory;
        return this;
    }

    /**
     * 内存告警阈值(%)
     * minimum: 1
     * maximum: 100
     * @return alarmMemory
     */
    public Integer getAlarmMemory() {
        return alarmMemory;
    }

    public void setAlarmMemory(Integer alarmMemory) {
        this.alarmMemory = alarmMemory;
    }

    public ConfigAlarmTopicRequest withAlarmNum(Integer alarmNum) {
        this.alarmNum = alarmNum;
        return this;
    }

    /**
     * 每天发送告警总条数
     * minimum: 1
     * maximum: 65535
     * @return alarmNum
     */
    public Integer getAlarmNum() {
        return alarmNum;
    }

    public void setAlarmNum(Integer alarmNum) {
        this.alarmNum = alarmNum;
    }

    public ConfigAlarmTopicRequest withAlarmRisk(List<String> alarmRisk) {
        this.alarmRisk = alarmRisk;
        return this;
    }

    public ConfigAlarmTopicRequest addAlarmRiskItem(String alarmRiskItem) {
        if (this.alarmRisk == null) {
            this.alarmRisk = new ArrayList<>();
        }
        this.alarmRisk.add(alarmRiskItem);
        return this;
    }

    public ConfigAlarmTopicRequest withAlarmRisk(Consumer<List<String>> alarmRiskSetter) {
        if (this.alarmRisk == null) {
            this.alarmRisk = new ArrayList<>();
        }
        alarmRiskSetter.accept(this.alarmRisk);
        return this;
    }

    /**
     * 告警等级 - high：高  - medium：中  - low：低
     * @return alarmRisk
     */
    public List<String> getAlarmRisk() {
        return alarmRisk;
    }

    public void setAlarmRisk(List<String> alarmRisk) {
        this.alarmRisk = alarmRisk;
    }

    public ConfigAlarmTopicRequest withAlarmSwitch(String alarmSwitch) {
        this.alarmSwitch = alarmSwitch;
        return this;
    }

    /**
     * 通知开关 - ON：开启  - OFF：关闭
     * @return alarmSwitch
     */
    public String getAlarmSwitch() {
        return alarmSwitch;
    }

    public void setAlarmSwitch(String alarmSwitch) {
        this.alarmSwitch = alarmSwitch;
    }

    public ConfigAlarmTopicRequest withAlarmTopicUrn(String alarmTopicUrn) {
        this.alarmTopicUrn = alarmTopicUrn;
        return this;
    }

    /**
     * 通知消息主题URN,调用SMN服务接口获取
     * @return alarmTopicUrn
     */
    public String getAlarmTopicUrn() {
        return alarmTopicUrn;
    }

    public void setAlarmTopicUrn(String alarmTopicUrn) {
        this.alarmTopicUrn = alarmTopicUrn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigAlarmTopicRequest that = (ConfigAlarmTopicRequest) obj;
        return Objects.equals(this.alarmCpu, that.alarmCpu) && Objects.equals(this.alarmDisk, that.alarmDisk)
            && Objects.equals(this.alarmMemory, that.alarmMemory) && Objects.equals(this.alarmNum, that.alarmNum)
            && Objects.equals(this.alarmRisk, that.alarmRisk) && Objects.equals(this.alarmSwitch, that.alarmSwitch)
            && Objects.equals(this.alarmTopicUrn, that.alarmTopicUrn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmCpu, alarmDisk, alarmMemory, alarmNum, alarmRisk, alarmSwitch, alarmTopicUrn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigAlarmTopicRequest {\n");
        sb.append("    alarmCpu: ").append(toIndentedString(alarmCpu)).append("\n");
        sb.append("    alarmDisk: ").append(toIndentedString(alarmDisk)).append("\n");
        sb.append("    alarmMemory: ").append(toIndentedString(alarmMemory)).append("\n");
        sb.append("    alarmNum: ").append(toIndentedString(alarmNum)).append("\n");
        sb.append("    alarmRisk: ").append(toIndentedString(alarmRisk)).append("\n");
        sb.append("    alarmSwitch: ").append(toIndentedString(alarmSwitch)).append("\n");
        sb.append("    alarmTopicUrn: ").append(toIndentedString(alarmTopicUrn)).append("\n");
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
