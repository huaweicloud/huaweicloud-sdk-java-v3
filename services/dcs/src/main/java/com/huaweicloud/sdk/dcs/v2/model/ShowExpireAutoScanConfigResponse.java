package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowExpireAutoScanConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public ShowExpireAutoScanConfigResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowExpireAutoScanConfigResponse withEnableAutoScan(Boolean enableAutoScan) {
        this.enableAutoScan = enableAutoScan;
        return this;
    }

    /**
     * 是否开启自动扫描
     * @return enableAutoScan
     */
    public Boolean getEnableAutoScan() {
        return enableAutoScan;
    }

    public void setEnableAutoScan(Boolean enableAutoScan) {
        this.enableAutoScan = enableAutoScan;
    }

    public ShowExpireAutoScanConfigResponse withFirstScanAt(String firstScanAt) {
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

    public ShowExpireAutoScanConfigResponse withInterval(Integer interval) {
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

    public ShowExpireAutoScanConfigResponse withTimeout(Integer timeout) {
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

    public ShowExpireAutoScanConfigResponse withScanKeysCount(Integer scanKeysCount) {
        this.scanKeysCount = scanKeysCount;
        return this;
    }

    /**
     * 扫描数
     * @return scanKeysCount
     */
    public Integer getScanKeysCount() {
        return scanKeysCount;
    }

    public void setScanKeysCount(Integer scanKeysCount) {
        this.scanKeysCount = scanKeysCount;
    }

    public ShowExpireAutoScanConfigResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间，例如：2023-06-15T06:20:13.283Z
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowExpireAutoScanConfigResponse that = (ShowExpireAutoScanConfigResponse) obj;
        return Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.enableAutoScan, that.enableAutoScan)
            && Objects.equals(this.firstScanAt, that.firstScanAt) && Objects.equals(this.interval, that.interval)
            && Objects.equals(this.timeout, that.timeout) && Objects.equals(this.scanKeysCount, that.scanKeysCount)
            && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, enableAutoScan, firstScanAt, interval, timeout, scanKeysCount, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowExpireAutoScanConfigResponse {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    enableAutoScan: ").append(toIndentedString(enableAutoScan)).append("\n");
        sb.append("    firstScanAt: ").append(toIndentedString(firstScanAt)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    scanKeysCount: ").append(toIndentedString(scanKeysCount)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
