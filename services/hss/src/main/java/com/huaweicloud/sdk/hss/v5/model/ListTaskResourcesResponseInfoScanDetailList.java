package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 扫描项信息
 */
public class ListTaskResourcesResponseInfoScanDetailList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_type")

    private String scanType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reason")

    private String failedReason;

    public ListTaskResourcesResponseInfoScanDetailList withScanType(String scanType) {
        this.scanType = scanType;
        return this;
    }

    /**
     * 扫描项类型，包含如下   - cluster_vul：集群漏洞   - risk_assessment：风险评估   - benchmark：安全合规
     * @return scanType
     */
    public String getScanType() {
        return scanType;
    }

    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

    public ListTaskResourcesResponseInfoScanDetailList withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 扫描状态，包含如下：   - scanning：扫描中   - success：扫描成功   - failed：扫描失败
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListTaskResourcesResponseInfoScanDetailList withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /**
     * 扫描失败的原因
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTaskResourcesResponseInfoScanDetailList that = (ListTaskResourcesResponseInfoScanDetailList) obj;
        return Objects.equals(this.scanType, that.scanType) && Objects.equals(this.status, that.status)
            && Objects.equals(this.failedReason, that.failedReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scanType, status, failedReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTaskResourcesResponseInfoScanDetailList {\n");
        sb.append("    scanType: ").append(toIndentedString(scanType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
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
