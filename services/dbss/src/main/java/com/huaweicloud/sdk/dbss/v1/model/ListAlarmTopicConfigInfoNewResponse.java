package com.huaweicloud.sdk.dbss.v1.model;

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
public class ListAlarmTopicConfigInfoNewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_cpu")

    private String alarmCpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_disk")

    private String alarmDisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_memory")

    private String alarmMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_num")

    private String alarmNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_risk")

    private List<String> alarmRisk = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_switch")

    private String alarmSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_topic_urn")

    private String alarmTopicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_effective")

    private Boolean smnEffective;

    public ListAlarmTopicConfigInfoNewResponse withAlarmCpu(String alarmCpu) {
        this.alarmCpu = alarmCpu;
        return this;
    }

    /**
     * CPU告警阈值(%)
     * @return alarmCpu
     */
    public String getAlarmCpu() {
        return alarmCpu;
    }

    public void setAlarmCpu(String alarmCpu) {
        this.alarmCpu = alarmCpu;
    }

    public ListAlarmTopicConfigInfoNewResponse withAlarmDisk(String alarmDisk) {
        this.alarmDisk = alarmDisk;
        return this;
    }

    /**
     * 磁盘告警阈值(%)
     * @return alarmDisk
     */
    public String getAlarmDisk() {
        return alarmDisk;
    }

    public void setAlarmDisk(String alarmDisk) {
        this.alarmDisk = alarmDisk;
    }

    public ListAlarmTopicConfigInfoNewResponse withAlarmMemory(String alarmMemory) {
        this.alarmMemory = alarmMemory;
        return this;
    }

    /**
     * 内存告警阈值(%)
     * @return alarmMemory
     */
    public String getAlarmMemory() {
        return alarmMemory;
    }

    public void setAlarmMemory(String alarmMemory) {
        this.alarmMemory = alarmMemory;
    }

    public ListAlarmTopicConfigInfoNewResponse withAlarmNum(String alarmNum) {
        this.alarmNum = alarmNum;
        return this;
    }

    /**
     * 每天发送告警总条数
     * @return alarmNum
     */
    public String getAlarmNum() {
        return alarmNum;
    }

    public void setAlarmNum(String alarmNum) {
        this.alarmNum = alarmNum;
    }

    public ListAlarmTopicConfigInfoNewResponse withAlarmRisk(List<String> alarmRisk) {
        this.alarmRisk = alarmRisk;
        return this;
    }

    public ListAlarmTopicConfigInfoNewResponse addAlarmRiskItem(String alarmRiskItem) {
        if (this.alarmRisk == null) {
            this.alarmRisk = new ArrayList<>();
        }
        this.alarmRisk.add(alarmRiskItem);
        return this;
    }

    public ListAlarmTopicConfigInfoNewResponse withAlarmRisk(Consumer<List<String>> alarmRiskSetter) {
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

    public ListAlarmTopicConfigInfoNewResponse withAlarmSwitch(String alarmSwitch) {
        this.alarmSwitch = alarmSwitch;
        return this;
    }

    /**
     * 通知开关 - ON：开启 - OFF：关闭
     * @return alarmSwitch
     */
    public String getAlarmSwitch() {
        return alarmSwitch;
    }

    public void setAlarmSwitch(String alarmSwitch) {
        this.alarmSwitch = alarmSwitch;
    }

    public ListAlarmTopicConfigInfoNewResponse withAlarmTopicUrn(String alarmTopicUrn) {
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

    public ListAlarmTopicConfigInfoNewResponse withSmnEffective(Boolean smnEffective) {
        this.smnEffective = smnEffective;
        return this;
    }

    /**
     * 是否支持SMN订阅  - true: 支持  - false: 不支持
     * @return smnEffective
     */
    public Boolean getSmnEffective() {
        return smnEffective;
    }

    public void setSmnEffective(Boolean smnEffective) {
        this.smnEffective = smnEffective;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAlarmTopicConfigInfoNewResponse that = (ListAlarmTopicConfigInfoNewResponse) obj;
        return Objects.equals(this.alarmCpu, that.alarmCpu) && Objects.equals(this.alarmDisk, that.alarmDisk)
            && Objects.equals(this.alarmMemory, that.alarmMemory) && Objects.equals(this.alarmNum, that.alarmNum)
            && Objects.equals(this.alarmRisk, that.alarmRisk) && Objects.equals(this.alarmSwitch, that.alarmSwitch)
            && Objects.equals(this.alarmTopicUrn, that.alarmTopicUrn)
            && Objects.equals(this.smnEffective, that.smnEffective);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(alarmCpu, alarmDisk, alarmMemory, alarmNum, alarmRisk, alarmSwitch, alarmTopicUrn, smnEffective);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmTopicConfigInfoNewResponse {\n");
        sb.append("    alarmCpu: ").append(toIndentedString(alarmCpu)).append("\n");
        sb.append("    alarmDisk: ").append(toIndentedString(alarmDisk)).append("\n");
        sb.append("    alarmMemory: ").append(toIndentedString(alarmMemory)).append("\n");
        sb.append("    alarmNum: ").append(toIndentedString(alarmNum)).append("\n");
        sb.append("    alarmRisk: ").append(toIndentedString(alarmRisk)).append("\n");
        sb.append("    alarmSwitch: ").append(toIndentedString(alarmSwitch)).append("\n");
        sb.append("    alarmTopicUrn: ").append(toIndentedString(alarmTopicUrn)).append("\n");
        sb.append("    smnEffective: ").append(toIndentedString(smnEffective)).append("\n");
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
