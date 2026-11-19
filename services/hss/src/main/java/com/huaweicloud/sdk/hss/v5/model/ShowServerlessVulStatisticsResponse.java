package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowServerlessVulStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_app_vul_num")

    private Integer totalAppVulNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "high_risky_app_vul")

    private Integer highRiskyAppVul;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_linux_vul_num")

    private Integer totalLinuxVulNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "high_risky_linux_vul")

    private Integer highRiskyLinuxVul;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risky_pod_num")

    private Integer riskyPodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_scan_num")

    private Integer totalScanNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_time")

    private Long lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scanning_task_num")

    private Long scanningTaskNum;

    public ShowServerlessVulStatisticsResponse withTotalAppVulNum(Integer totalAppVulNum) {
        this.totalAppVulNum = totalAppVulNum;
        return this;
    }

    /**
     * **参数解释**: 应用漏洞总数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return totalAppVulNum
     */
    public Integer getTotalAppVulNum() {
        return totalAppVulNum;
    }

    public void setTotalAppVulNum(Integer totalAppVulNum) {
        this.totalAppVulNum = totalAppVulNum;
    }

    public ShowServerlessVulStatisticsResponse withHighRiskyAppVul(Integer highRiskyAppVul) {
        this.highRiskyAppVul = highRiskyAppVul;
        return this;
    }

    /**
     * **参数解释**: 高风险应用漏洞数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return highRiskyAppVul
     */
    public Integer getHighRiskyAppVul() {
        return highRiskyAppVul;
    }

    public void setHighRiskyAppVul(Integer highRiskyAppVul) {
        this.highRiskyAppVul = highRiskyAppVul;
    }

    public ShowServerlessVulStatisticsResponse withTotalLinuxVulNum(Integer totalLinuxVulNum) {
        this.totalLinuxVulNum = totalLinuxVulNum;
        return this;
    }

    /**
     * **参数解释**: linux漏洞总数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return totalLinuxVulNum
     */
    public Integer getTotalLinuxVulNum() {
        return totalLinuxVulNum;
    }

    public void setTotalLinuxVulNum(Integer totalLinuxVulNum) {
        this.totalLinuxVulNum = totalLinuxVulNum;
    }

    public ShowServerlessVulStatisticsResponse withHighRiskyLinuxVul(Integer highRiskyLinuxVul) {
        this.highRiskyLinuxVul = highRiskyLinuxVul;
        return this;
    }

    /**
     * **参数解释**: 高风险应用漏洞数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return highRiskyLinuxVul
     */
    public Integer getHighRiskyLinuxVul() {
        return highRiskyLinuxVul;
    }

    public void setHighRiskyLinuxVul(Integer highRiskyLinuxVul) {
        this.highRiskyLinuxVul = highRiskyLinuxVul;
    }

    public ShowServerlessVulStatisticsResponse withRiskyPodNum(Integer riskyPodNum) {
        this.riskyPodNum = riskyPodNum;
        return this;
    }

    /**
     * **参数解释**: 存在漏洞的实例数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return riskyPodNum
     */
    public Integer getRiskyPodNum() {
        return riskyPodNum;
    }

    public void setRiskyPodNum(Integer riskyPodNum) {
        this.riskyPodNum = riskyPodNum;
    }

    public ShowServerlessVulStatisticsResponse withTotalScanNum(Integer totalScanNum) {
        this.totalScanNum = totalScanNum;
        return this;
    }

    /**
     * **参数解释**: 累计手动漏洞扫描次数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return totalScanNum
     */
    public Integer getTotalScanNum() {
        return totalScanNum;
    }

    public void setTotalScanNum(Integer totalScanNum) {
        this.totalScanNum = totalScanNum;
    }

    public ShowServerlessVulStatisticsResponse withLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * **参数解释**: 最近检测时间 **取值范围**: 最小值0，最大值4071095999000 
     * minimum: 0
     * maximum: 4071095999000
     * @return lastUpdateTime
     */
    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public ShowServerlessVulStatisticsResponse withScanningTaskNum(Long scanningTaskNum) {
        this.scanningTaskNum = scanningTaskNum;
        return this;
    }

    /**
     * **参数解释**: 正在扫描数 **取值范围**: 最小值0，最大值4071095999000 
     * minimum: 0
     * maximum: 4071095999000
     * @return scanningTaskNum
     */
    public Long getScanningTaskNum() {
        return scanningTaskNum;
    }

    public void setScanningTaskNum(Long scanningTaskNum) {
        this.scanningTaskNum = scanningTaskNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowServerlessVulStatisticsResponse that = (ShowServerlessVulStatisticsResponse) obj;
        return Objects.equals(this.totalAppVulNum, that.totalAppVulNum)
            && Objects.equals(this.highRiskyAppVul, that.highRiskyAppVul)
            && Objects.equals(this.totalLinuxVulNum, that.totalLinuxVulNum)
            && Objects.equals(this.highRiskyLinuxVul, that.highRiskyLinuxVul)
            && Objects.equals(this.riskyPodNum, that.riskyPodNum)
            && Objects.equals(this.totalScanNum, that.totalScanNum)
            && Objects.equals(this.lastUpdateTime, that.lastUpdateTime)
            && Objects.equals(this.scanningTaskNum, that.scanningTaskNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalAppVulNum,
            highRiskyAppVul,
            totalLinuxVulNum,
            highRiskyLinuxVul,
            riskyPodNum,
            totalScanNum,
            lastUpdateTime,
            scanningTaskNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowServerlessVulStatisticsResponse {\n");
        sb.append("    totalAppVulNum: ").append(toIndentedString(totalAppVulNum)).append("\n");
        sb.append("    highRiskyAppVul: ").append(toIndentedString(highRiskyAppVul)).append("\n");
        sb.append("    totalLinuxVulNum: ").append(toIndentedString(totalLinuxVulNum)).append("\n");
        sb.append("    highRiskyLinuxVul: ").append(toIndentedString(highRiskyLinuxVul)).append("\n");
        sb.append("    riskyPodNum: ").append(toIndentedString(riskyPodNum)).append("\n");
        sb.append("    totalScanNum: ").append(toIndentedString(totalScanNum)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    scanningTaskNum: ").append(toIndentedString(scanningTaskNum)).append("\n");
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
