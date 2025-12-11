package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowAntivirusStatisticResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_malware_num")

    private Integer totalMalwareNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "malware_host_num")

    private Integer malwareHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_task_num")

    private Integer totalTaskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scanning_task_num")

    private Integer scanningTaskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_scan_time")

    private Long latestScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_type")

    private String scanType;

    public ShowAntivirusStatisticResponse withTotalMalwareNum(Integer totalMalwareNum) {
        this.totalMalwareNum = totalMalwareNum;
        return this;
    }

    /**
     * **参数解释**： 病毒总数 **取值范围**： 最小值0，最大值2147483647，单位：个 
     * minimum: 0
     * maximum: 2147483647
     * @return totalMalwareNum
     */
    public Integer getTotalMalwareNum() {
        return totalMalwareNum;
    }

    public void setTotalMalwareNum(Integer totalMalwareNum) {
        this.totalMalwareNum = totalMalwareNum;
    }

    public ShowAntivirusStatisticResponse withMalwareHostNum(Integer malwareHostNum) {
        this.malwareHostNum = malwareHostNum;
        return this;
    }

    /**
     * **参数解释**: 影响主机数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return malwareHostNum
     */
    public Integer getMalwareHostNum() {
        return malwareHostNum;
    }

    public void setMalwareHostNum(Integer malwareHostNum) {
        this.malwareHostNum = malwareHostNum;
    }

    public ShowAntivirusStatisticResponse withTotalTaskNum(Integer totalTaskNum) {
        this.totalTaskNum = totalTaskNum;
        return this;
    }

    /**
     * **参数解释**： 累计扫描任务数 **取值范围**： 最小值0，最大值2147483647，单位：个 
     * minimum: 0
     * maximum: 2147483647
     * @return totalTaskNum
     */
    public Integer getTotalTaskNum() {
        return totalTaskNum;
    }

    public void setTotalTaskNum(Integer totalTaskNum) {
        this.totalTaskNum = totalTaskNum;
    }

    public ShowAntivirusStatisticResponse withScanningTaskNum(Integer scanningTaskNum) {
        this.scanningTaskNum = scanningTaskNum;
        return this;
    }

    /**
     * **参数解释**： 运行中任务数 **取值范围**： 最小值0，最大值2147483647，单位：个 
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

    public ShowAntivirusStatisticResponse withLatestScanTime(Long latestScanTime) {
        this.latestScanTime = latestScanTime;
        return this;
    }

    /**
     * **参数解释**： 启动时间 **取值范围**： 最小值0，最大值9223372036854775807；时间格式：毫秒级时间戳（UTC时区，从1970-01-01 00:00:00开始计算）；单位：ms 
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

    public ShowAntivirusStatisticResponse withScanType(String scanType) {
        this.scanType = scanType;
        return this;
    }

    /**
     * **参数解释**： 任务类型 **取值范围**： 包含如下:   - quick ：快速扫描   - full : 全盘扫描   - custom : 自定义扫描 
     * @return scanType
     */
    public String getScanType() {
        return scanType;
    }

    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAntivirusStatisticResponse that = (ShowAntivirusStatisticResponse) obj;
        return Objects.equals(this.totalMalwareNum, that.totalMalwareNum)
            && Objects.equals(this.malwareHostNum, that.malwareHostNum)
            && Objects.equals(this.totalTaskNum, that.totalTaskNum)
            && Objects.equals(this.scanningTaskNum, that.scanningTaskNum)
            && Objects.equals(this.latestScanTime, that.latestScanTime) && Objects.equals(this.scanType, that.scanType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalMalwareNum, malwareHostNum, totalTaskNum, scanningTaskNum, latestScanTime, scanType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAntivirusStatisticResponse {\n");
        sb.append("    totalMalwareNum: ").append(toIndentedString(totalMalwareNum)).append("\n");
        sb.append("    malwareHostNum: ").append(toIndentedString(malwareHostNum)).append("\n");
        sb.append("    totalTaskNum: ").append(toIndentedString(totalTaskNum)).append("\n");
        sb.append("    scanningTaskNum: ").append(toIndentedString(scanningTaskNum)).append("\n");
        sb.append("    latestScanTime: ").append(toIndentedString(latestScanTime)).append("\n");
        sb.append("    scanType: ").append(toIndentedString(scanType)).append("\n");
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
