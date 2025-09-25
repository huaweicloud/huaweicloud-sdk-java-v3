package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowProtectStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_library_update_time")

    private Long vulLibraryUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_days")

    private Long protectDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threat_library_update_time")

    private Long threatLibraryUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_detected_total_num")

    private Long vulDetectedTotalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_detected_total_num")

    private Long baselineDetectedTotalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finger_scan_total_num")

    private Long fingerScanTotalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_detected_total_num")

    private Long alarmDetectedTotalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ransomware_alarm_detected_total_num")

    private Long ransomwareAlarmDetectedTotalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_alarm_detected_total_num")

    private Long fileAlarmDetectedTotalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rasp_alarm_detected_total_num")

    private Long raspAlarmDetectedTotalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wtp_alarm_detected_total_num")

    private Long wtpAlarmDetectedTotalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_risk_total_num")

    private Long imageRiskTotalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_alarm_total_num")

    private Long containerAlarmTotalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_firewall_policy_total_num")

    private Long containerFirewallPolicyTotalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_kill_virus_status")

    private Boolean autoKillVirusStatus;

    public ShowProtectStatisticsResponse withVulLibraryUpdateTime(Long vulLibraryUpdateTime) {
        this.vulLibraryUpdateTime = vulLibraryUpdateTime;
        return this;
    }

    /**
     * **参数解释**: 漏洞库更新时间 **取值范围**: 最小值0，最大值4071095999000 
     * minimum: 0
     * maximum: 4071095999000
     * @return vulLibraryUpdateTime
     */
    public Long getVulLibraryUpdateTime() {
        return vulLibraryUpdateTime;
    }

    public void setVulLibraryUpdateTime(Long vulLibraryUpdateTime) {
        this.vulLibraryUpdateTime = vulLibraryUpdateTime;
    }

    public ShowProtectStatisticsResponse withProtectDays(Long protectDays) {
        this.protectDays = protectDays;
        return this;
    }

    /**
     * **参数解释**: 守护天数 **取值范围**: 最小值0，最大值4071095999000 
     * minimum: 0
     * maximum: 4071095999000
     * @return protectDays
     */
    public Long getProtectDays() {
        return protectDays;
    }

    public void setProtectDays(Long protectDays) {
        this.protectDays = protectDays;
    }

    public ShowProtectStatisticsResponse withThreatLibraryUpdateTime(Long threatLibraryUpdateTime) {
        this.threatLibraryUpdateTime = threatLibraryUpdateTime;
        return this;
    }

    /**
     * **参数解释**: 病毒库更新时间 **取值范围**: 最小值0，最大值4071095999000 
     * minimum: 0
     * maximum: 4071095999000
     * @return threatLibraryUpdateTime
     */
    public Long getThreatLibraryUpdateTime() {
        return threatLibraryUpdateTime;
    }

    public void setThreatLibraryUpdateTime(Long threatLibraryUpdateTime) {
        this.threatLibraryUpdateTime = threatLibraryUpdateTime;
    }

    public ShowProtectStatisticsResponse withVulDetectedTotalNum(Long vulDetectedTotalNum) {
        this.vulDetectedTotalNum = vulDetectedTotalNum;
        return this;
    }

    /**
     * **参数解释**: 漏洞累计已检测数量 **取值范围**: 最小值0，最大值4071095999000 
     * minimum: 0
     * maximum: 4071095999000
     * @return vulDetectedTotalNum
     */
    public Long getVulDetectedTotalNum() {
        return vulDetectedTotalNum;
    }

    public void setVulDetectedTotalNum(Long vulDetectedTotalNum) {
        this.vulDetectedTotalNum = vulDetectedTotalNum;
    }

    public ShowProtectStatisticsResponse withBaselineDetectedTotalNum(Long baselineDetectedTotalNum) {
        this.baselineDetectedTotalNum = baselineDetectedTotalNum;
        return this;
    }

    /**
     * **参数解释**: 累计检测基线总数量 **取值范围**: 最小值0，最大值4071095999000 
     * minimum: 0
     * maximum: 4071095999000
     * @return baselineDetectedTotalNum
     */
    public Long getBaselineDetectedTotalNum() {
        return baselineDetectedTotalNum;
    }

    public void setBaselineDetectedTotalNum(Long baselineDetectedTotalNum) {
        this.baselineDetectedTotalNum = baselineDetectedTotalNum;
    }

    public ShowProtectStatisticsResponse withFingerScanTotalNum(Long fingerScanTotalNum) {
        this.fingerScanTotalNum = fingerScanTotalNum;
        return this;
    }

    /**
     * **参数解释**: 累计扫描指纹数量 **取值范围**: 最小值0，最大值4071095999000 
     * minimum: 0
     * maximum: 4071095999000
     * @return fingerScanTotalNum
     */
    public Long getFingerScanTotalNum() {
        return fingerScanTotalNum;
    }

    public void setFingerScanTotalNum(Long fingerScanTotalNum) {
        this.fingerScanTotalNum = fingerScanTotalNum;
    }

    public ShowProtectStatisticsResponse withAlarmDetectedTotalNum(Long alarmDetectedTotalNum) {
        this.alarmDetectedTotalNum = alarmDetectedTotalNum;
        return this;
    }

    /**
     * **参数解释**: 入侵检测累计检测告警总数量 **取值范围**: 最小值0，最大值4071095999000 
     * minimum: 0
     * maximum: 4071095999000
     * @return alarmDetectedTotalNum
     */
    public Long getAlarmDetectedTotalNum() {
        return alarmDetectedTotalNum;
    }

    public void setAlarmDetectedTotalNum(Long alarmDetectedTotalNum) {
        this.alarmDetectedTotalNum = alarmDetectedTotalNum;
    }

    public ShowProtectStatisticsResponse withRansomwareAlarmDetectedTotalNum(Long ransomwareAlarmDetectedTotalNum) {
        this.ransomwareAlarmDetectedTotalNum = ransomwareAlarmDetectedTotalNum;
        return this;
    }

    /**
     * **参数解释**: 累计防御勒索病毒告警次数 **取值范围**: 最小值0，最大值4071095999000 
     * minimum: 0
     * maximum: 4071095999000
     * @return ransomwareAlarmDetectedTotalNum
     */
    public Long getRansomwareAlarmDetectedTotalNum() {
        return ransomwareAlarmDetectedTotalNum;
    }

    public void setRansomwareAlarmDetectedTotalNum(Long ransomwareAlarmDetectedTotalNum) {
        this.ransomwareAlarmDetectedTotalNum = ransomwareAlarmDetectedTotalNum;
    }

    public ShowProtectStatisticsResponse withFileAlarmDetectedTotalNum(Long fileAlarmDetectedTotalNum) {
        this.fileAlarmDetectedTotalNum = fileAlarmDetectedTotalNum;
        return this;
    }

    /**
     * **参数解释**: 文件完整性监控累计检测文件变更告警总数 **取值范围**: 最小值0，最大值4071095999000 
     * minimum: 0
     * maximum: 4071095999000
     * @return fileAlarmDetectedTotalNum
     */
    public Long getFileAlarmDetectedTotalNum() {
        return fileAlarmDetectedTotalNum;
    }

    public void setFileAlarmDetectedTotalNum(Long fileAlarmDetectedTotalNum) {
        this.fileAlarmDetectedTotalNum = fileAlarmDetectedTotalNum;
    }

    public ShowProtectStatisticsResponse withRaspAlarmDetectedTotalNum(Long raspAlarmDetectedTotalNum) {
        this.raspAlarmDetectedTotalNum = raspAlarmDetectedTotalNum;
        return this;
    }

    /**
     * **参数解释**: 应用防护累计检测告警总数 **取值范围**: 最小值0，最大值4071095999000 
     * minimum: 0
     * maximum: 4071095999000
     * @return raspAlarmDetectedTotalNum
     */
    public Long getRaspAlarmDetectedTotalNum() {
        return raspAlarmDetectedTotalNum;
    }

    public void setRaspAlarmDetectedTotalNum(Long raspAlarmDetectedTotalNum) {
        this.raspAlarmDetectedTotalNum = raspAlarmDetectedTotalNum;
    }

    public ShowProtectStatisticsResponse withWtpAlarmDetectedTotalNum(Long wtpAlarmDetectedTotalNum) {
        this.wtpAlarmDetectedTotalNum = wtpAlarmDetectedTotalNum;
        return this;
    }

    /**
     * **参数解释**: 网页防篡改累计抵御网页防篡改次数 **取值范围**: 最小值0，最大值4071095999000 
     * minimum: 0
     * maximum: 4071095999000
     * @return wtpAlarmDetectedTotalNum
     */
    public Long getWtpAlarmDetectedTotalNum() {
        return wtpAlarmDetectedTotalNum;
    }

    public void setWtpAlarmDetectedTotalNum(Long wtpAlarmDetectedTotalNum) {
        this.wtpAlarmDetectedTotalNum = wtpAlarmDetectedTotalNum;
    }

    public ShowProtectStatisticsResponse withImageRiskTotalNum(Long imageRiskTotalNum) {
        this.imageRiskTotalNum = imageRiskTotalNum;
        return this;
    }

    /**
     * **参数解释**: 容器镜像安全累计检测风险个数 **取值范围**: 最小值0，最大值4071095999000 
     * minimum: 0
     * maximum: 4071095999000
     * @return imageRiskTotalNum
     */
    public Long getImageRiskTotalNum() {
        return imageRiskTotalNum;
    }

    public void setImageRiskTotalNum(Long imageRiskTotalNum) {
        this.imageRiskTotalNum = imageRiskTotalNum;
    }

    public ShowProtectStatisticsResponse withContainerAlarmTotalNum(Long containerAlarmTotalNum) {
        this.containerAlarmTotalNum = containerAlarmTotalNum;
        return this;
    }

    /**
     * **参数解释**: 容器安全防护累计检测容器告警个数 **取值范围**: 最小值0，最大值4071095999000 
     * minimum: 0
     * maximum: 4071095999000
     * @return containerAlarmTotalNum
     */
    public Long getContainerAlarmTotalNum() {
        return containerAlarmTotalNum;
    }

    public void setContainerAlarmTotalNum(Long containerAlarmTotalNum) {
        this.containerAlarmTotalNum = containerAlarmTotalNum;
    }

    public ShowProtectStatisticsResponse withContainerFirewallPolicyTotalNum(Long containerFirewallPolicyTotalNum) {
        this.containerFirewallPolicyTotalNum = containerFirewallPolicyTotalNum;
        return this;
    }

    /**
     * **参数解释**: 容器防火墙累计设置策略条数 **取值范围**: 最小值0，最大值4071095999000 
     * minimum: 0
     * maximum: 4071095999000
     * @return containerFirewallPolicyTotalNum
     */
    public Long getContainerFirewallPolicyTotalNum() {
        return containerFirewallPolicyTotalNum;
    }

    public void setContainerFirewallPolicyTotalNum(Long containerFirewallPolicyTotalNum) {
        this.containerFirewallPolicyTotalNum = containerFirewallPolicyTotalNum;
    }

    public ShowProtectStatisticsResponse withAutoKillVirusStatus(Boolean autoKillVirusStatus) {
        this.autoKillVirusStatus = autoKillVirusStatus;
        return this;
    }

    /**
     * **参数解释**: 是否开启恶意自动查杀 **取值范围**: - true：是。 - false：否。 
     * @return autoKillVirusStatus
     */
    public Boolean getAutoKillVirusStatus() {
        return autoKillVirusStatus;
    }

    public void setAutoKillVirusStatus(Boolean autoKillVirusStatus) {
        this.autoKillVirusStatus = autoKillVirusStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowProtectStatisticsResponse that = (ShowProtectStatisticsResponse) obj;
        return Objects.equals(this.vulLibraryUpdateTime, that.vulLibraryUpdateTime)
            && Objects.equals(this.protectDays, that.protectDays)
            && Objects.equals(this.threatLibraryUpdateTime, that.threatLibraryUpdateTime)
            && Objects.equals(this.vulDetectedTotalNum, that.vulDetectedTotalNum)
            && Objects.equals(this.baselineDetectedTotalNum, that.baselineDetectedTotalNum)
            && Objects.equals(this.fingerScanTotalNum, that.fingerScanTotalNum)
            && Objects.equals(this.alarmDetectedTotalNum, that.alarmDetectedTotalNum)
            && Objects.equals(this.ransomwareAlarmDetectedTotalNum, that.ransomwareAlarmDetectedTotalNum)
            && Objects.equals(this.fileAlarmDetectedTotalNum, that.fileAlarmDetectedTotalNum)
            && Objects.equals(this.raspAlarmDetectedTotalNum, that.raspAlarmDetectedTotalNum)
            && Objects.equals(this.wtpAlarmDetectedTotalNum, that.wtpAlarmDetectedTotalNum)
            && Objects.equals(this.imageRiskTotalNum, that.imageRiskTotalNum)
            && Objects.equals(this.containerAlarmTotalNum, that.containerAlarmTotalNum)
            && Objects.equals(this.containerFirewallPolicyTotalNum, that.containerFirewallPolicyTotalNum)
            && Objects.equals(this.autoKillVirusStatus, that.autoKillVirusStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vulLibraryUpdateTime,
            protectDays,
            threatLibraryUpdateTime,
            vulDetectedTotalNum,
            baselineDetectedTotalNum,
            fingerScanTotalNum,
            alarmDetectedTotalNum,
            ransomwareAlarmDetectedTotalNum,
            fileAlarmDetectedTotalNum,
            raspAlarmDetectedTotalNum,
            wtpAlarmDetectedTotalNum,
            imageRiskTotalNum,
            containerAlarmTotalNum,
            containerFirewallPolicyTotalNum,
            autoKillVirusStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProtectStatisticsResponse {\n");
        sb.append("    vulLibraryUpdateTime: ").append(toIndentedString(vulLibraryUpdateTime)).append("\n");
        sb.append("    protectDays: ").append(toIndentedString(protectDays)).append("\n");
        sb.append("    threatLibraryUpdateTime: ").append(toIndentedString(threatLibraryUpdateTime)).append("\n");
        sb.append("    vulDetectedTotalNum: ").append(toIndentedString(vulDetectedTotalNum)).append("\n");
        sb.append("    baselineDetectedTotalNum: ").append(toIndentedString(baselineDetectedTotalNum)).append("\n");
        sb.append("    fingerScanTotalNum: ").append(toIndentedString(fingerScanTotalNum)).append("\n");
        sb.append("    alarmDetectedTotalNum: ").append(toIndentedString(alarmDetectedTotalNum)).append("\n");
        sb.append("    ransomwareAlarmDetectedTotalNum: ")
            .append(toIndentedString(ransomwareAlarmDetectedTotalNum))
            .append("\n");
        sb.append("    fileAlarmDetectedTotalNum: ").append(toIndentedString(fileAlarmDetectedTotalNum)).append("\n");
        sb.append("    raspAlarmDetectedTotalNum: ").append(toIndentedString(raspAlarmDetectedTotalNum)).append("\n");
        sb.append("    wtpAlarmDetectedTotalNum: ").append(toIndentedString(wtpAlarmDetectedTotalNum)).append("\n");
        sb.append("    imageRiskTotalNum: ").append(toIndentedString(imageRiskTotalNum)).append("\n");
        sb.append("    containerAlarmTotalNum: ").append(toIndentedString(containerAlarmTotalNum)).append("\n");
        sb.append("    containerFirewallPolicyTotalNum: ")
            .append(toIndentedString(containerFirewallPolicyTotalNum))
            .append("\n");
        sb.append("    autoKillVirusStatus: ").append(toIndentedString(autoKillVirusStatus)).append("\n");
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
