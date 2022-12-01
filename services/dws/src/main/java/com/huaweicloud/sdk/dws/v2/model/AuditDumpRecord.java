package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 审计日志
 */
public class AuditDumpRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exector_time")

    private String exectorTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configure_status")

    private String configureStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location_prefix")

    private String locationPrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reason")

    private String failedReason;

    public AuditDumpRecord withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群id。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public AuditDumpRecord withExectorTime(String exectorTime) {
        this.exectorTime = exectorTime;
        return this;
    }

    /**
     * 执行时间。
     * @return exectorTime
     */
    public String getExectorTime() {
        return exectorTime;
    }

    public void setExectorTime(String exectorTime) {
        this.exectorTime = exectorTime;
    }

    public AuditDumpRecord withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 开始时间。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public AuditDumpRecord withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public AuditDumpRecord withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * 桶名。
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public AuditDumpRecord withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public AuditDumpRecord withConfigureStatus(String configureStatus) {
        this.configureStatus = configureStatus;
        return this;
    }

    /**
     * 配置状态。
     * @return configureStatus
     */
    public String getConfigureStatus() {
        return configureStatus;
    }

    public void setConfigureStatus(String configureStatus) {
        this.configureStatus = configureStatus;
    }

    public AuditDumpRecord withLocationPrefix(String locationPrefix) {
        this.locationPrefix = locationPrefix;
        return this;
    }

    /**
     * 前缀。
     * @return locationPrefix
     */
    public String getLocationPrefix() {
        return locationPrefix;
    }

    public void setLocationPrefix(String locationPrefix) {
        this.locationPrefix = locationPrefix;
    }

    public AuditDumpRecord withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 结果。
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public AuditDumpRecord withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /**
     * 失败原因。
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuditDumpRecord auditDumpRecord = (AuditDumpRecord) o;
        return Objects.equals(this.clusterId, auditDumpRecord.clusterId)
            && Objects.equals(this.exectorTime, auditDumpRecord.exectorTime)
            && Objects.equals(this.beginTime, auditDumpRecord.beginTime)
            && Objects.equals(this.endTime, auditDumpRecord.endTime)
            && Objects.equals(this.bucketName, auditDumpRecord.bucketName)
            && Objects.equals(this.version, auditDumpRecord.version)
            && Objects.equals(this.configureStatus, auditDumpRecord.configureStatus)
            && Objects.equals(this.locationPrefix, auditDumpRecord.locationPrefix)
            && Objects.equals(this.result, auditDumpRecord.result)
            && Objects.equals(this.failedReason, auditDumpRecord.failedReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId,
            exectorTime,
            beginTime,
            endTime,
            bucketName,
            version,
            configureStatus,
            locationPrefix,
            result,
            failedReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditDumpRecord {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    exectorTime: ").append(toIndentedString(exectorTime)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    configureStatus: ").append(toIndentedString(configureStatus)).append("\n");
        sb.append("    locationPrefix: ").append(toIndentedString(locationPrefix)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
