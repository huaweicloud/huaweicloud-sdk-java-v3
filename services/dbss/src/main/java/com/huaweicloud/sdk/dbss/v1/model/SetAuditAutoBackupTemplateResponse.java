package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Response Object
 */
public class SetAuditAutoBackupTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_root_path")

    private String bucketRootPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cycle")

    private String cycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_backup_time")

    private OffsetDateTime latestBackupTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_time")

    private OffsetDateTime triggerTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "triggered")

    private Boolean triggered;

    public SetAuditAutoBackupTemplateResponse withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * OBS桶名称
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public SetAuditAutoBackupTemplateResponse withBucketRootPath(String bucketRootPath) {
        this.bucketRootPath = bucketRootPath;
        return this;
    }

    /**
     * OBS备份根路径
     * @return bucketRootPath
     */
    public String getBucketRootPath() {
        return bucketRootPath;
    }

    public void setBucketRootPath(String bucketRootPath) {
        this.bucketRootPath = bucketRootPath;
    }

    public SetAuditAutoBackupTemplateResponse withCycle(String cycle) {
        this.cycle = cycle;
        return this;
    }

    /**
     * 周期 - PER_DAY：每天 - PER_WEEK：每周 - PER_MONTH：每月 - PER_HOUR：每小时 - FIVE_MIN：每5分钟
     * @return cycle
     */
    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public SetAuditAutoBackupTemplateResponse withLatestBackupTime(OffsetDateTime latestBackupTime) {
        this.latestBackupTime = latestBackupTime;
        return this;
    }

    /**
     * 最近备份时间
     * @return latestBackupTime
     */
    public OffsetDateTime getLatestBackupTime() {
        return latestBackupTime;
    }

    public void setLatestBackupTime(OffsetDateTime latestBackupTime) {
        this.latestBackupTime = latestBackupTime;
    }

    public SetAuditAutoBackupTemplateResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 备份开关  - 0：关闭  - 1：开启
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public SetAuditAutoBackupTemplateResponse withTriggerTime(OffsetDateTime triggerTime) {
        this.triggerTime = triggerTime;
        return this;
    }

    /**
     * 触发时间
     * @return triggerTime
     */
    public OffsetDateTime getTriggerTime() {
        return triggerTime;
    }

    public void setTriggerTime(OffsetDateTime triggerTime) {
        this.triggerTime = triggerTime;
    }

    public SetAuditAutoBackupTemplateResponse withTriggered(Boolean triggered) {
        this.triggered = triggered;
        return this;
    }

    /**
     * 是否已触发
     * @return triggered
     */
    public Boolean getTriggered() {
        return triggered;
    }

    public void setTriggered(Boolean triggered) {
        this.triggered = triggered;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetAuditAutoBackupTemplateResponse that = (SetAuditAutoBackupTemplateResponse) obj;
        return Objects.equals(this.bucketName, that.bucketName)
            && Objects.equals(this.bucketRootPath, that.bucketRootPath) && Objects.equals(this.cycle, that.cycle)
            && Objects.equals(this.latestBackupTime, that.latestBackupTime) && Objects.equals(this.status, that.status)
            && Objects.equals(this.triggerTime, that.triggerTime) && Objects.equals(this.triggered, that.triggered);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketName, bucketRootPath, cycle, latestBackupTime, status, triggerTime, triggered);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetAuditAutoBackupTemplateResponse {\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    bucketRootPath: ").append(toIndentedString(bucketRootPath)).append("\n");
        sb.append("    cycle: ").append(toIndentedString(cycle)).append("\n");
        sb.append("    latestBackupTime: ").append(toIndentedString(latestBackupTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    triggerTime: ").append(toIndentedString(triggerTime)).append("\n");
        sb.append("    triggered: ").append(toIndentedString(triggered)).append("\n");
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
