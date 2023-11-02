package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改自动扫描配置
 */
public class UpdateAutoScanConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_auto_scan")

    private Boolean enableAutoScan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_scan_at")

    private String firstScanAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private Integer interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_keys_count")

    private Integer scanKeysCount;

    public UpdateAutoScanConfigRequestBody withEnableAutoScan(Boolean enableAutoScan) {
        this.enableAutoScan = enableAutoScan;
        return this;
    }

    /**
     * 启用自动扫描
     * @return enableAutoScan
     */
    public Boolean getEnableAutoScan() {
        return enableAutoScan;
    }

    public void setEnableAutoScan(Boolean enableAutoScan) {
        this.enableAutoScan = enableAutoScan;
    }

    public UpdateAutoScanConfigRequestBody withFirstScanAt(String firstScanAt) {
        this.firstScanAt = firstScanAt;
        return this;
    }

    /**
     * 首次扫描时间，例如：2023-07-07T15:00:05.000
     * @return firstScanAt
     */
    public String getFirstScanAt() {
        return firstScanAt;
    }

    public void setFirstScanAt(String firstScanAt) {
        this.firstScanAt = firstScanAt;
    }

    public UpdateAutoScanConfigRequestBody withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 间隔时间(秒)
     * @return interval
     */
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public UpdateAutoScanConfigRequestBody withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 超时时间(秒)
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public UpdateAutoScanConfigRequestBody withScanKeysCount(Integer scanKeysCount) {
        this.scanKeysCount = scanKeysCount;
        return this;
    }

    /**
     * 扫描密钥计数
     * @return scanKeysCount
     */
    public Integer getScanKeysCount() {
        return scanKeysCount;
    }

    public void setScanKeysCount(Integer scanKeysCount) {
        this.scanKeysCount = scanKeysCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAutoScanConfigRequestBody that = (UpdateAutoScanConfigRequestBody) obj;
        return Objects.equals(this.enableAutoScan, that.enableAutoScan)
            && Objects.equals(this.firstScanAt, that.firstScanAt) && Objects.equals(this.interval, that.interval)
            && Objects.equals(this.timeout, that.timeout) && Objects.equals(this.scanKeysCount, that.scanKeysCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableAutoScan, firstScanAt, interval, timeout, scanKeysCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAutoScanConfigRequestBody {\n");
        sb.append("    enableAutoScan: ").append(toIndentedString(enableAutoScan)).append("\n");
        sb.append("    firstScanAt: ").append(toIndentedString(firstScanAt)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    scanKeysCount: ").append(toIndentedString(scanKeysCount)).append("\n");
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
