package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * BackupSwitchRequest
 */
public class BackupSwitchRequest {

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
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_time")

    private OffsetDateTime triggerTime;

    public BackupSwitchRequest withBucketName(String bucketName) {
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

    public BackupSwitchRequest withBucketRootPath(String bucketRootPath) {
        this.bucketRootPath = bucketRootPath;
        return this;
    }

    /**
     * 备份根路径
     * @return bucketRootPath
     */
    public String getBucketRootPath() {
        return bucketRootPath;
    }

    public void setBucketRootPath(String bucketRootPath) {
        this.bucketRootPath = bucketRootPath;
    }

    public BackupSwitchRequest withCycle(String cycle) {
        this.cycle = cycle;
        return this;
    }

    /**
     * 备份周期 - PER_DAY：每天 - PER_WEEK：每周 - PER_MONTH：每月 - PER_HOUR：每小时 - FIVE_MIN：每5分钟
     * @return cycle
     */
    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public BackupSwitchRequest withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 备份模式  - AUTO：自动备份
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public BackupSwitchRequest withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 开关状态  - 0：关闭  - 1：开启
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BackupSwitchRequest withTriggerTime(OffsetDateTime triggerTime) {
        this.triggerTime = triggerTime;
        return this;
    }

    /**
     * 触发时间，yyyy-MM-dd HH:mm:ss
     * @return triggerTime
     */
    public OffsetDateTime getTriggerTime() {
        return triggerTime;
    }

    public void setTriggerTime(OffsetDateTime triggerTime) {
        this.triggerTime = triggerTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackupSwitchRequest that = (BackupSwitchRequest) obj;
        return Objects.equals(this.bucketName, that.bucketName)
            && Objects.equals(this.bucketRootPath, that.bucketRootPath) && Objects.equals(this.cycle, that.cycle)
            && Objects.equals(this.mode, that.mode) && Objects.equals(this.status, that.status)
            && Objects.equals(this.triggerTime, that.triggerTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketName, bucketRootPath, cycle, mode, status, triggerTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupSwitchRequest {\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    bucketRootPath: ").append(toIndentedString(bucketRootPath)).append("\n");
        sb.append("    cycle: ").append(toIndentedString(cycle)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    triggerTime: ").append(toIndentedString(triggerTime)).append("\n");
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
