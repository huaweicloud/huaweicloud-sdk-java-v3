package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowScanStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_status")

    private String scanStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaned_time")

    private Long scanedTime;

    public ShowScanStatusResponse withScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
        return this;
    }

    /**
     * **参数解释**： 手动检测状态 **取值范围**： - neverscan：无扫描任务 - scanning：扫描中 - scaned：扫描完成 - failed：扫描失败 - over_time：扫描超时（扫描时间超过30分钟） - longscanning：扫描超时（扫描时间超过60分钟）
     * @return scanStatus
     */
    public String getScanStatus() {
        return scanStatus;
    }

    public void setScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
    }

    public ShowScanStatusResponse withScanedTime(Long scanedTime) {
        this.scanedTime = scanedTime;
        return this;
    }

    /**
     * **参数解释**： 检测完成时间 **取值范围**： 不涉及
     * @return scanedTime
     */
    public Long getScanedTime() {
        return scanedTime;
    }

    public void setScanedTime(Long scanedTime) {
        this.scanedTime = scanedTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowScanStatusResponse that = (ShowScanStatusResponse) obj;
        return Objects.equals(this.scanStatus, that.scanStatus) && Objects.equals(this.scanedTime, that.scanedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scanStatus, scanedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowScanStatusResponse {\n");
        sb.append("    scanStatus: ").append(toIndentedString(scanStatus)).append("\n");
        sb.append("    scanedTime: ").append(toIndentedString(scanedTime)).append("\n");
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
