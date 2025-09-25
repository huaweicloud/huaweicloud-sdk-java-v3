package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 告警信息
 */
public class RiskHandleInfoAlarmInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_num")

    private Long alarmNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "malware_file_num")

    private Long malwareFileNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_block_num")

    private Long autoBlockNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manual_handle_num")

    private Long manualHandleNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_handle_num")

    private Long autoHandleNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_rate")

    private Float handleRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "beat_rate")

    private Float beatRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virus_kill_config_enable")

    private Boolean virusKillConfigEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_open_virus_kill_rate")

    private Float userOpenVirusKillRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_notify_config_enable")

    private Boolean alarmNotifyConfigEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_open_alarm_notify_rate")

    private Float userOpenAlarmNotifyRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ransomware_event_num")

    private Long ransomwareEventNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ransomware_event_host_list")

    private List<String> ransomwareEventHostList = null;

    public RiskHandleInfoAlarmInfo withAlarmNum(Long alarmNum) {
        this.alarmNum = alarmNum;
        return this;
    }

    /**
     * **参数解释**: 攻击、异常行为数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return alarmNum
     */
    public Long getAlarmNum() {
        return alarmNum;
    }

    public void setAlarmNum(Long alarmNum) {
        this.alarmNum = alarmNum;
    }

    public RiskHandleInfoAlarmInfo withMalwareFileNum(Long malwareFileNum) {
        this.malwareFileNum = malwareFileNum;
        return this;
    }

    /**
     * **参数解释**: 病毒文件数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return malwareFileNum
     */
    public Long getMalwareFileNum() {
        return malwareFileNum;
    }

    public void setMalwareFileNum(Long malwareFileNum) {
        this.malwareFileNum = malwareFileNum;
    }

    public RiskHandleInfoAlarmInfo withAutoBlockNum(Long autoBlockNum) {
        this.autoBlockNum = autoBlockNum;
        return this;
    }

    /**
     * **参数解释**: 阻断的数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return autoBlockNum
     */
    public Long getAutoBlockNum() {
        return autoBlockNum;
    }

    public void setAutoBlockNum(Long autoBlockNum) {
        this.autoBlockNum = autoBlockNum;
    }

    public RiskHandleInfoAlarmInfo withManualHandleNum(Long manualHandleNum) {
        this.manualHandleNum = manualHandleNum;
        return this;
    }

    /**
     * **参数解释**: 手工处置数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return manualHandleNum
     */
    public Long getManualHandleNum() {
        return manualHandleNum;
    }

    public void setManualHandleNum(Long manualHandleNum) {
        this.manualHandleNum = manualHandleNum;
    }

    public RiskHandleInfoAlarmInfo withAutoHandleNum(Long autoHandleNum) {
        this.autoHandleNum = autoHandleNum;
        return this;
    }

    /**
     * **参数解释**: 自动处置数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return autoHandleNum
     */
    public Long getAutoHandleNum() {
        return autoHandleNum;
    }

    public void setAutoHandleNum(Long autoHandleNum) {
        this.autoHandleNum = autoHandleNum;
    }

    public RiskHandleInfoAlarmInfo withHandleRate(Float handleRate) {
        this.handleRate = handleRate;
        return this;
    }

    /**
     * **参数解释**: 平均处置率 **取值范围**: 最小值0，最大值1 
     * minimum: 0
     * maximum: 1
     * @return handleRate
     */
    public Float getHandleRate() {
        return handleRate;
    }

    public void setHandleRate(Float handleRate) {
        this.handleRate = handleRate;
    }

    public RiskHandleInfoAlarmInfo withBeatRate(Float beatRate) {
        this.beatRate = beatRate;
        return this;
    }

    /**
     * **参数解释**: 平均处置率击败的用户率 **取值范围**: 最小值0，最大值1 
     * minimum: 0
     * maximum: 1
     * @return beatRate
     */
    public Float getBeatRate() {
        return beatRate;
    }

    public void setBeatRate(Float beatRate) {
        this.beatRate = beatRate;
    }

    public RiskHandleInfoAlarmInfo withVirusKillConfigEnable(Boolean virusKillConfigEnable) {
        this.virusKillConfigEnable = virusKillConfigEnable;
        return this;
    }

    /**
     * **参数解释**: 是否开启隔离查杀 **取值范围**:  - true：是。  - false：否。 
     * @return virusKillConfigEnable
     */
    public Boolean getVirusKillConfigEnable() {
        return virusKillConfigEnable;
    }

    public void setVirusKillConfigEnable(Boolean virusKillConfigEnable) {
        this.virusKillConfigEnable = virusKillConfigEnable;
    }

    public RiskHandleInfoAlarmInfo withUserOpenVirusKillRate(Float userOpenVirusKillRate) {
        this.userOpenVirusKillRate = userOpenVirusKillRate;
        return this;
    }

    /**
     * **参数解释**: 开启隔离查杀的用户率 **取值范围**: 最小值0，最大值1 
     * minimum: 0
     * maximum: 1
     * @return userOpenVirusKillRate
     */
    public Float getUserOpenVirusKillRate() {
        return userOpenVirusKillRate;
    }

    public void setUserOpenVirusKillRate(Float userOpenVirusKillRate) {
        this.userOpenVirusKillRate = userOpenVirusKillRate;
    }

    public RiskHandleInfoAlarmInfo withAlarmNotifyConfigEnable(Boolean alarmNotifyConfigEnable) {
        this.alarmNotifyConfigEnable = alarmNotifyConfigEnable;
        return this;
    }

    /**
     * **参数解释**: 是否开启告警通知 **取值范围**:  - true：是。  - false：否。 
     * @return alarmNotifyConfigEnable
     */
    public Boolean getAlarmNotifyConfigEnable() {
        return alarmNotifyConfigEnable;
    }

    public void setAlarmNotifyConfigEnable(Boolean alarmNotifyConfigEnable) {
        this.alarmNotifyConfigEnable = alarmNotifyConfigEnable;
    }

    public RiskHandleInfoAlarmInfo withUserOpenAlarmNotifyRate(Float userOpenAlarmNotifyRate) {
        this.userOpenAlarmNotifyRate = userOpenAlarmNotifyRate;
        return this;
    }

    /**
     * **参数解释**: 开启告警通知的用户率 **取值范围**: 最小值0，最大值1 
     * minimum: 0
     * maximum: 1
     * @return userOpenAlarmNotifyRate
     */
    public Float getUserOpenAlarmNotifyRate() {
        return userOpenAlarmNotifyRate;
    }

    public void setUserOpenAlarmNotifyRate(Float userOpenAlarmNotifyRate) {
        this.userOpenAlarmNotifyRate = userOpenAlarmNotifyRate;
    }

    public RiskHandleInfoAlarmInfo withRansomwareEventNum(Long ransomwareEventNum) {
        this.ransomwareEventNum = ransomwareEventNum;
        return this;
    }

    /**
     * **参数解释**: 勒索病毒攻击数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return ransomwareEventNum
     */
    public Long getRansomwareEventNum() {
        return ransomwareEventNum;
    }

    public void setRansomwareEventNum(Long ransomwareEventNum) {
        this.ransomwareEventNum = ransomwareEventNum;
    }

    public RiskHandleInfoAlarmInfo withRansomwareEventHostList(List<String> ransomwareEventHostList) {
        this.ransomwareEventHostList = ransomwareEventHostList;
        return this;
    }

    public RiskHandleInfoAlarmInfo addRansomwareEventHostListItem(String ransomwareEventHostListItem) {
        if (this.ransomwareEventHostList == null) {
            this.ransomwareEventHostList = new ArrayList<>();
        }
        this.ransomwareEventHostList.add(ransomwareEventHostListItem);
        return this;
    }

    public RiskHandleInfoAlarmInfo withRansomwareEventHostList(Consumer<List<String>> ransomwareEventHostListSetter) {
        if (this.ransomwareEventHostList == null) {
            this.ransomwareEventHostList = new ArrayList<>();
        }
        ransomwareEventHostListSetter.accept(this.ransomwareEventHostList);
        return this;
    }

    /**
     * **参数解释**: 存在勒索病毒攻击的主机列表 **取值范围**: 最小值0，最大值10000 
     * @return ransomwareEventHostList
     */
    public List<String> getRansomwareEventHostList() {
        return ransomwareEventHostList;
    }

    public void setRansomwareEventHostList(List<String> ransomwareEventHostList) {
        this.ransomwareEventHostList = ransomwareEventHostList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RiskHandleInfoAlarmInfo that = (RiskHandleInfoAlarmInfo) obj;
        return Objects.equals(this.alarmNum, that.alarmNum) && Objects.equals(this.malwareFileNum, that.malwareFileNum)
            && Objects.equals(this.autoBlockNum, that.autoBlockNum)
            && Objects.equals(this.manualHandleNum, that.manualHandleNum)
            && Objects.equals(this.autoHandleNum, that.autoHandleNum)
            && Objects.equals(this.handleRate, that.handleRate) && Objects.equals(this.beatRate, that.beatRate)
            && Objects.equals(this.virusKillConfigEnable, that.virusKillConfigEnable)
            && Objects.equals(this.userOpenVirusKillRate, that.userOpenVirusKillRate)
            && Objects.equals(this.alarmNotifyConfigEnable, that.alarmNotifyConfigEnable)
            && Objects.equals(this.userOpenAlarmNotifyRate, that.userOpenAlarmNotifyRate)
            && Objects.equals(this.ransomwareEventNum, that.ransomwareEventNum)
            && Objects.equals(this.ransomwareEventHostList, that.ransomwareEventHostList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmNum,
            malwareFileNum,
            autoBlockNum,
            manualHandleNum,
            autoHandleNum,
            handleRate,
            beatRate,
            virusKillConfigEnable,
            userOpenVirusKillRate,
            alarmNotifyConfigEnable,
            userOpenAlarmNotifyRate,
            ransomwareEventNum,
            ransomwareEventHostList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RiskHandleInfoAlarmInfo {\n");
        sb.append("    alarmNum: ").append(toIndentedString(alarmNum)).append("\n");
        sb.append("    malwareFileNum: ").append(toIndentedString(malwareFileNum)).append("\n");
        sb.append("    autoBlockNum: ").append(toIndentedString(autoBlockNum)).append("\n");
        sb.append("    manualHandleNum: ").append(toIndentedString(manualHandleNum)).append("\n");
        sb.append("    autoHandleNum: ").append(toIndentedString(autoHandleNum)).append("\n");
        sb.append("    handleRate: ").append(toIndentedString(handleRate)).append("\n");
        sb.append("    beatRate: ").append(toIndentedString(beatRate)).append("\n");
        sb.append("    virusKillConfigEnable: ").append(toIndentedString(virusKillConfigEnable)).append("\n");
        sb.append("    userOpenVirusKillRate: ").append(toIndentedString(userOpenVirusKillRate)).append("\n");
        sb.append("    alarmNotifyConfigEnable: ").append(toIndentedString(alarmNotifyConfigEnable)).append("\n");
        sb.append("    userOpenAlarmNotifyRate: ").append(toIndentedString(userOpenAlarmNotifyRate)).append("\n");
        sb.append("    ransomwareEventNum: ").append(toIndentedString(ransomwareEventNum)).append("\n");
        sb.append("    ransomwareEventHostList: ").append(toIndentedString(ransomwareEventHostList)).append("\n");
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
