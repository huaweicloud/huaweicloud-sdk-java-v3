package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 漏洞信息
 */
public class RiskHandleInfoVulInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_scan_task_num")

    private Integer vulScanTaskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_num")

    private Long vulNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handled_vul_num")

    private Long handledVulNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handled_rate")

    private Float handledRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "beat_rate")

    private Float beatRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_urgent_vul_num")

    private Integer newUrgentVulNum;

    public RiskHandleInfoVulInfo withVulScanTaskNum(Integer vulScanTaskNum) {
        this.vulScanTaskNum = vulScanTaskNum;
        return this;
    }

    /**
     * **参数解释**: 漏洞扫描任务次数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return vulScanTaskNum
     */
    public Integer getVulScanTaskNum() {
        return vulScanTaskNum;
    }

    public void setVulScanTaskNum(Integer vulScanTaskNum) {
        this.vulScanTaskNum = vulScanTaskNum;
    }

    public RiskHandleInfoVulInfo withVulNum(Long vulNum) {
        this.vulNum = vulNum;
        return this;
    }

    /**
     * **参数解释**: 发现的漏洞数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return vulNum
     */
    public Long getVulNum() {
        return vulNum;
    }

    public void setVulNum(Long vulNum) {
        this.vulNum = vulNum;
    }

    public RiskHandleInfoVulInfo withHandledVulNum(Long handledVulNum) {
        this.handledVulNum = handledVulNum;
        return this;
    }

    /**
     * **参数解释**: 已经处置的漏洞数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return handledVulNum
     */
    public Long getHandledVulNum() {
        return handledVulNum;
    }

    public void setHandledVulNum(Long handledVulNum) {
        this.handledVulNum = handledVulNum;
    }

    public RiskHandleInfoVulInfo withHandledRate(Float handledRate) {
        this.handledRate = handledRate;
        return this;
    }

    /**
     * **参数解释**: 处置率 **取值范围**: 最小值0，最大值1 
     * minimum: 0
     * maximum: 1
     * @return handledRate
     */
    public Float getHandledRate() {
        return handledRate;
    }

    public void setHandledRate(Float handledRate) {
        this.handledRate = handledRate;
    }

    public RiskHandleInfoVulInfo withBeatRate(Float beatRate) {
        this.beatRate = beatRate;
        return this;
    }

    /**
     * **参数解释**: 处置率击败的用户率 **取值范围**: 最小值0，最大值1 
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

    public RiskHandleInfoVulInfo withNewUrgentVulNum(Integer newUrgentVulNum) {
        this.newUrgentVulNum = newUrgentVulNum;
        return this;
    }

    /**
     * **参数解释**: 新增应急漏洞数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return newUrgentVulNum
     */
    public Integer getNewUrgentVulNum() {
        return newUrgentVulNum;
    }

    public void setNewUrgentVulNum(Integer newUrgentVulNum) {
        this.newUrgentVulNum = newUrgentVulNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RiskHandleInfoVulInfo that = (RiskHandleInfoVulInfo) obj;
        return Objects.equals(this.vulScanTaskNum, that.vulScanTaskNum) && Objects.equals(this.vulNum, that.vulNum)
            && Objects.equals(this.handledVulNum, that.handledVulNum)
            && Objects.equals(this.handledRate, that.handledRate) && Objects.equals(this.beatRate, that.beatRate)
            && Objects.equals(this.newUrgentVulNum, that.newUrgentVulNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vulScanTaskNum, vulNum, handledVulNum, handledRate, beatRate, newUrgentVulNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RiskHandleInfoVulInfo {\n");
        sb.append("    vulScanTaskNum: ").append(toIndentedString(vulScanTaskNum)).append("\n");
        sb.append("    vulNum: ").append(toIndentedString(vulNum)).append("\n");
        sb.append("    handledVulNum: ").append(toIndentedString(handledVulNum)).append("\n");
        sb.append("    handledRate: ").append(toIndentedString(handledRate)).append("\n");
        sb.append("    beatRate: ").append(toIndentedString(beatRate)).append("\n");
        sb.append("    newUrgentVulNum: ").append(toIndentedString(newUrgentVulNum)).append("\n");
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
