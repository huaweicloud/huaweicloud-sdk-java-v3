package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListImageScanOverviewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_image_num")

    private Integer totalImageNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risky_image_num")

    private Integer riskyImageNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vuls_num")

    private Integer vulsNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risky_config_num")

    private Integer riskyConfigNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "malwares_num")

    private Integer malwaresNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unscanned_num")

    private Integer unscannedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scanning_task_num")

    private Integer scanningTaskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finished_task_num")

    private Integer finishedTaskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_scan_time")

    private Long latestScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_scanning_task_num")

    private Integer localScanningTaskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_finished_task_num")

    private Integer localFinishedTaskNum;

    public ListImageScanOverviewResponse withTotalImageNum(Integer totalImageNum) {
        this.totalImageNum = totalImageNum;
        return this;
    }

    /**
     * **参数解释**: 镜像总数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return totalImageNum
     */
    public Integer getTotalImageNum() {
        return totalImageNum;
    }

    public void setTotalImageNum(Integer totalImageNum) {
        this.totalImageNum = totalImageNum;
    }

    public ListImageScanOverviewResponse withRiskyImageNum(Integer riskyImageNum) {
        this.riskyImageNum = riskyImageNum;
        return this;
    }

    /**
     * **参数解释**: 存在风险的镜像数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return riskyImageNum
     */
    public Integer getRiskyImageNum() {
        return riskyImageNum;
    }

    public void setRiskyImageNum(Integer riskyImageNum) {
        this.riskyImageNum = riskyImageNum;
    }

    public ListImageScanOverviewResponse withVulsNum(Integer vulsNum) {
        this.vulsNum = vulsNum;
        return this;
    }

    /**
     * **参数解释**: 漏洞数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return vulsNum
     */
    public Integer getVulsNum() {
        return vulsNum;
    }

    public void setVulsNum(Integer vulsNum) {
        this.vulsNum = vulsNum;
    }

    public ListImageScanOverviewResponse withRiskyConfigNum(Integer riskyConfigNum) {
        this.riskyConfigNum = riskyConfigNum;
        return this;
    }

    /**
     * **参数解释**: 风险配置数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return riskyConfigNum
     */
    public Integer getRiskyConfigNum() {
        return riskyConfigNum;
    }

    public void setRiskyConfigNum(Integer riskyConfigNum) {
        this.riskyConfigNum = riskyConfigNum;
    }

    public ListImageScanOverviewResponse withMalwaresNum(Integer malwaresNum) {
        this.malwaresNum = malwaresNum;
        return this;
    }

    /**
     * **参数解释**: 恶意文件数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return malwaresNum
     */
    public Integer getMalwaresNum() {
        return malwaresNum;
    }

    public void setMalwaresNum(Integer malwaresNum) {
        this.malwaresNum = malwaresNum;
    }

    public ListImageScanOverviewResponse withUnscannedNum(Integer unscannedNum) {
        this.unscannedNum = unscannedNum;
        return this;
    }

    /**
     * **参数解释**: 未扫描数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return unscannedNum
     */
    public Integer getUnscannedNum() {
        return unscannedNum;
    }

    public void setUnscannedNum(Integer unscannedNum) {
        this.unscannedNum = unscannedNum;
    }

    public ListImageScanOverviewResponse withScanningTaskNum(Integer scanningTaskNum) {
        this.scanningTaskNum = scanningTaskNum;
        return this;
    }

    /**
     * **参数解释**: 扫描中任务数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return scanningTaskNum
     */
    public Integer getScanningTaskNum() {
        return scanningTaskNum;
    }

    public void setScanningTaskNum(Integer scanningTaskNum) {
        this.scanningTaskNum = scanningTaskNum;
    }

    public ListImageScanOverviewResponse withFinishedTaskNum(Integer finishedTaskNum) {
        this.finishedTaskNum = finishedTaskNum;
        return this;
    }

    /**
     * **参数解释**: 已完成任务数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return finishedTaskNum
     */
    public Integer getFinishedTaskNum() {
        return finishedTaskNum;
    }

    public void setFinishedTaskNum(Integer finishedTaskNum) {
        this.finishedTaskNum = finishedTaskNum;
    }

    public ListImageScanOverviewResponse withLatestScanTime(Long latestScanTime) {
        this.latestScanTime = latestScanTime;
        return this;
    }

    /**
     * **参数解释**: 最近扫描时间，毫秒级时间戳 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return latestScanTime
     */
    public Long getLatestScanTime() {
        return latestScanTime;
    }

    public void setLatestScanTime(Long latestScanTime) {
        this.latestScanTime = latestScanTime;
    }

    public ListImageScanOverviewResponse withLocalScanningTaskNum(Integer localScanningTaskNum) {
        this.localScanningTaskNum = localScanningTaskNum;
        return this;
    }

    /**
     * **参数解释**: 本地扫描中任务数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return localScanningTaskNum
     */
    public Integer getLocalScanningTaskNum() {
        return localScanningTaskNum;
    }

    public void setLocalScanningTaskNum(Integer localScanningTaskNum) {
        this.localScanningTaskNum = localScanningTaskNum;
    }

    public ListImageScanOverviewResponse withLocalFinishedTaskNum(Integer localFinishedTaskNum) {
        this.localFinishedTaskNum = localFinishedTaskNum;
        return this;
    }

    /**
     * **参数解释**: 本地已完成任务数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return localFinishedTaskNum
     */
    public Integer getLocalFinishedTaskNum() {
        return localFinishedTaskNum;
    }

    public void setLocalFinishedTaskNum(Integer localFinishedTaskNum) {
        this.localFinishedTaskNum = localFinishedTaskNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListImageScanOverviewResponse that = (ListImageScanOverviewResponse) obj;
        return Objects.equals(this.totalImageNum, that.totalImageNum)
            && Objects.equals(this.riskyImageNum, that.riskyImageNum) && Objects.equals(this.vulsNum, that.vulsNum)
            && Objects.equals(this.riskyConfigNum, that.riskyConfigNum)
            && Objects.equals(this.malwaresNum, that.malwaresNum)
            && Objects.equals(this.unscannedNum, that.unscannedNum)
            && Objects.equals(this.scanningTaskNum, that.scanningTaskNum)
            && Objects.equals(this.finishedTaskNum, that.finishedTaskNum)
            && Objects.equals(this.latestScanTime, that.latestScanTime)
            && Objects.equals(this.localScanningTaskNum, that.localScanningTaskNum)
            && Objects.equals(this.localFinishedTaskNum, that.localFinishedTaskNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalImageNum,
            riskyImageNum,
            vulsNum,
            riskyConfigNum,
            malwaresNum,
            unscannedNum,
            scanningTaskNum,
            finishedTaskNum,
            latestScanTime,
            localScanningTaskNum,
            localFinishedTaskNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListImageScanOverviewResponse {\n");
        sb.append("    totalImageNum: ").append(toIndentedString(totalImageNum)).append("\n");
        sb.append("    riskyImageNum: ").append(toIndentedString(riskyImageNum)).append("\n");
        sb.append("    vulsNum: ").append(toIndentedString(vulsNum)).append("\n");
        sb.append("    riskyConfigNum: ").append(toIndentedString(riskyConfigNum)).append("\n");
        sb.append("    malwaresNum: ").append(toIndentedString(malwaresNum)).append("\n");
        sb.append("    unscannedNum: ").append(toIndentedString(unscannedNum)).append("\n");
        sb.append("    scanningTaskNum: ").append(toIndentedString(scanningTaskNum)).append("\n");
        sb.append("    finishedTaskNum: ").append(toIndentedString(finishedTaskNum)).append("\n");
        sb.append("    latestScanTime: ").append(toIndentedString(latestScanTime)).append("\n");
        sb.append("    localScanningTaskNum: ").append(toIndentedString(localScanningTaskNum)).append("\n");
        sb.append("    localFinishedTaskNum: ").append(toIndentedString(localFinishedTaskNum)).append("\n");
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
