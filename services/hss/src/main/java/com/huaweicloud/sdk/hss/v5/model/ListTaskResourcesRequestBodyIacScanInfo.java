package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IAC安全扫描任务特有的查询条件，任务类型为“iac_scan”可用
 */
public class ListTaskResourcesRequestBodyIacScanInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_status")

    private String scanStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chart_name")

    private String chartName;

    public ListTaskResourcesRequestBodyIacScanInfo withScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
        return this;
    }

    /**
     * 文件的扫描状态，包含如下：   - scanning：扫描中   - success：扫描成功   - failed：扫描失败
     * @return scanStatus
     */
    public String getScanStatus() {
        return scanStatus;
    }

    public void setScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
    }

    public ListTaskResourcesRequestBodyIacScanInfo withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文件名称
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ListTaskResourcesRequestBodyIacScanInfo withChartName(String chartName) {
        this.chartName = chartName;
        return this;
    }

    /**
     * chart包名称
     * @return chartName
     */
    public String getChartName() {
        return chartName;
    }

    public void setChartName(String chartName) {
        this.chartName = chartName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTaskResourcesRequestBodyIacScanInfo that = (ListTaskResourcesRequestBodyIacScanInfo) obj;
        return Objects.equals(this.scanStatus, that.scanStatus) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.chartName, that.chartName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scanStatus, fileName, chartName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTaskResourcesRequestBodyIacScanInfo {\n");
        sb.append("    scanStatus: ").append(toIndentedString(scanStatus)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    chartName: ").append(toIndentedString(chartName)).append("\n");
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
