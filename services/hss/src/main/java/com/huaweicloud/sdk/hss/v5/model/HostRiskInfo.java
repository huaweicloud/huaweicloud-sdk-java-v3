package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HostRiskInfo
 */
public class HostRiskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_risk_num")

    private Integer baselineRiskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_total_num")

    private Integer vulTotalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "critical_vul_num")

    private Integer criticalVulNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_total_num")

    private Integer alarmTotalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "critical_alarm_num")

    private Integer criticalAlarmNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unhandled_suspicious_process_num")

    private Integer unhandledSuspiciousProcessNum;

    public HostRiskInfo withBaselineRiskNum(Integer baselineRiskNum) {
        this.baselineRiskNum = baselineRiskNum;
        return this;
    }

    /**
     * **参数解释**: 基线风险数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return baselineRiskNum
     */
    public Integer getBaselineRiskNum() {
        return baselineRiskNum;
    }

    public void setBaselineRiskNum(Integer baselineRiskNum) {
        this.baselineRiskNum = baselineRiskNum;
    }

    public HostRiskInfo withVulTotalNum(Integer vulTotalNum) {
        this.vulTotalNum = vulTotalNum;
        return this;
    }

    /**
     * **参数解释**: 漏洞总数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return vulTotalNum
     */
    public Integer getVulTotalNum() {
        return vulTotalNum;
    }

    public void setVulTotalNum(Integer vulTotalNum) {
        this.vulTotalNum = vulTotalNum;
    }

    public HostRiskInfo withCriticalVulNum(Integer criticalVulNum) {
        this.criticalVulNum = criticalVulNum;
        return this;
    }

    /**
     * **参数解释**: 紧急漏洞数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return criticalVulNum
     */
    public Integer getCriticalVulNum() {
        return criticalVulNum;
    }

    public void setCriticalVulNum(Integer criticalVulNum) {
        this.criticalVulNum = criticalVulNum;
    }

    public HostRiskInfo withAlarmTotalNum(Integer alarmTotalNum) {
        this.alarmTotalNum = alarmTotalNum;
        return this;
    }

    /**
     * **参数解释**: 告警总数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return alarmTotalNum
     */
    public Integer getAlarmTotalNum() {
        return alarmTotalNum;
    }

    public void setAlarmTotalNum(Integer alarmTotalNum) {
        this.alarmTotalNum = alarmTotalNum;
    }

    public HostRiskInfo withCriticalAlarmNum(Integer criticalAlarmNum) {
        this.criticalAlarmNum = criticalAlarmNum;
        return this;
    }

    /**
     * **参数解释**: 需紧急处理的告警（危急+高危） **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return criticalAlarmNum
     */
    public Integer getCriticalAlarmNum() {
        return criticalAlarmNum;
    }

    public void setCriticalAlarmNum(Integer criticalAlarmNum) {
        this.criticalAlarmNum = criticalAlarmNum;
    }

    public HostRiskInfo withUnhandledSuspiciousProcessNum(Integer unhandledSuspiciousProcessNum) {
        this.unhandledSuspiciousProcessNum = unhandledSuspiciousProcessNum;
        return this;
    }

    /**
     * **参数解释**: 待处理可疑进程数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return unhandledSuspiciousProcessNum
     */
    public Integer getUnhandledSuspiciousProcessNum() {
        return unhandledSuspiciousProcessNum;
    }

    public void setUnhandledSuspiciousProcessNum(Integer unhandledSuspiciousProcessNum) {
        this.unhandledSuspiciousProcessNum = unhandledSuspiciousProcessNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostRiskInfo that = (HostRiskInfo) obj;
        return Objects.equals(this.baselineRiskNum, that.baselineRiskNum)
            && Objects.equals(this.vulTotalNum, that.vulTotalNum)
            && Objects.equals(this.criticalVulNum, that.criticalVulNum)
            && Objects.equals(this.alarmTotalNum, that.alarmTotalNum)
            && Objects.equals(this.criticalAlarmNum, that.criticalAlarmNum)
            && Objects.equals(this.unhandledSuspiciousProcessNum, that.unhandledSuspiciousProcessNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baselineRiskNum,
            vulTotalNum,
            criticalVulNum,
            alarmTotalNum,
            criticalAlarmNum,
            unhandledSuspiciousProcessNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostRiskInfo {\n");
        sb.append("    baselineRiskNum: ").append(toIndentedString(baselineRiskNum)).append("\n");
        sb.append("    vulTotalNum: ").append(toIndentedString(vulTotalNum)).append("\n");
        sb.append("    criticalVulNum: ").append(toIndentedString(criticalVulNum)).append("\n");
        sb.append("    alarmTotalNum: ").append(toIndentedString(alarmTotalNum)).append("\n");
        sb.append("    criticalAlarmNum: ").append(toIndentedString(criticalAlarmNum)).append("\n");
        sb.append("    unhandledSuspiciousProcessNum: ")
            .append(toIndentedString(unhandledSuspiciousProcessNum))
            .append("\n");
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
