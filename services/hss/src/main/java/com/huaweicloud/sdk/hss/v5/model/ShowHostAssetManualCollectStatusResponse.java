package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowHostAssetManualCollectStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_status")

    private String scanStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scanned_time")

    private Long scannedTime;

    public ShowHostAssetManualCollectStatusResponse withScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
        return this;
    }

    /**
     * 手动检测状态
     * @return scanStatus
     */
    public String getScanStatus() {
        return scanStatus;
    }

    public void setScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
    }

    public ShowHostAssetManualCollectStatusResponse withScannedTime(Long scannedTime) {
        this.scannedTime = scannedTime;
        return this;
    }

    /**
     * 检测完成时间
     * @return scannedTime
     */
    public Long getScannedTime() {
        return scannedTime;
    }

    public void setScannedTime(Long scannedTime) {
        this.scannedTime = scannedTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowHostAssetManualCollectStatusResponse that = (ShowHostAssetManualCollectStatusResponse) obj;
        return Objects.equals(this.scanStatus, that.scanStatus) && Objects.equals(this.scannedTime, that.scannedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scanStatus, scannedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHostAssetManualCollectStatusResponse {\n");
        sb.append("    scanStatus: ").append(toIndentedString(scanStatus)).append("\n");
        sb.append("    scannedTime: ").append(toIndentedString(scannedTime)).append("\n");
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
