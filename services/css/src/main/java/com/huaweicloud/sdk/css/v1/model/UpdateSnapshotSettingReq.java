package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateSnapshotSettingReq
 */
public class UpdateSnapshotSettingReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency")

    private String agency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_path")

    private String basePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_snapshot_bytes_per_seconds")

    private String maxSnapshotBytesPerSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_restore_bytes_per_seconds")

    private String maxRestoreBytesPerSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private String enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indices")

    private String indices;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefix")

    private String prefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keepday")

    private Integer keepday;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency")

    private String frequency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_auto")

    private String deleteAuto;

    public UpdateSnapshotSettingReq withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * 备份使用的OBS桶的桶名。
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public UpdateSnapshotSettingReq withAgency(String agency) {
        this.agency = agency;
        return this;
    }

    /**
     * 委托名称，委托给CSS，允许CSS调用您的其他云服务。
     * @return agency
     */
    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public UpdateSnapshotSettingReq withBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }

    /**
     * 快照在OBS桶中的存放路径。
     * @return basePath
     */
    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public UpdateSnapshotSettingReq withMaxSnapshotBytesPerSeconds(String maxSnapshotBytesPerSeconds) {
        this.maxSnapshotBytesPerSeconds = maxSnapshotBytesPerSeconds;
        return this;
    }

    /**
     * 配置每个节点的最大备份速率（每秒），即当备份的速率超过该值时会被限流，避免速率太大导致资源占用过高，影响系统稳定性。实际备份速率不一定能达到该值，会受OBS、磁盘等影响。
     * @return maxSnapshotBytesPerSeconds
     */
    public String getMaxSnapshotBytesPerSeconds() {
        return maxSnapshotBytesPerSeconds;
    }

    public void setMaxSnapshotBytesPerSeconds(String maxSnapshotBytesPerSeconds) {
        this.maxSnapshotBytesPerSeconds = maxSnapshotBytesPerSeconds;
    }

    public UpdateSnapshotSettingReq withMaxRestoreBytesPerSeconds(String maxRestoreBytesPerSeconds) {
        this.maxRestoreBytesPerSeconds = maxRestoreBytesPerSeconds;
        return this;
    }

    /**
     * 配置每个节点的最大恢复速率（每秒），即当恢复的速率超过该值时会被限流，避免速率太大导致资源占用过高，影响系统稳定性。实际恢复速率不一定能达到该值，会受OBS、磁盘等影响。
     * @return maxRestoreBytesPerSeconds
     */
    public String getMaxRestoreBytesPerSeconds() {
        return maxRestoreBytesPerSeconds;
    }

    public void setMaxRestoreBytesPerSeconds(String maxRestoreBytesPerSeconds) {
        this.maxRestoreBytesPerSeconds = maxRestoreBytesPerSeconds;
    }

    public UpdateSnapshotSettingReq withEnable(String enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否开启自动创建快照策略。
     * @return enable
     */
    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public UpdateSnapshotSettingReq withIndices(String indices) {
        this.indices = indices;
        return this;
    }

    /**
     * 需要备份的索引名。
     * @return indices
     */
    public String getIndices() {
        return indices;
    }

    public void setIndices(String indices) {
        this.indices = indices;
    }

    public UpdateSnapshotSettingReq withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * 自动创建快照的名称前缀，需要用户自己手动输入。
     * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public UpdateSnapshotSettingReq withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 每天创建快照的时刻。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public UpdateSnapshotSettingReq withKeepday(Integer keepday) {
        this.keepday = keepday;
        return this;
    }

    /**
     * 自定义设置快照保留的个数。系统在半点时刻会自动删除超过保留个数的快照。过期删除策略只针对与当前自动创建快照策略相同执行频次的自动快照。
     * @return keepday
     */
    public Integer getKeepday() {
        return keepday;
    }

    public void setKeepday(Integer keepday) {
        this.keepday = keepday;
    }

    public UpdateSnapshotSettingReq withFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * 自动创建快照的执行频次。
     * @return frequency
     */
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public UpdateSnapshotSettingReq withDeleteAuto(String deleteAuto) {
        this.deleteAuto = deleteAuto;
        return this;
    }

    /**
     * 表示关闭自动创建快照策略时，是否需要清除所有自动创建的快照。
     * @return deleteAuto
     */
    public String getDeleteAuto() {
        return deleteAuto;
    }

    public void setDeleteAuto(String deleteAuto) {
        this.deleteAuto = deleteAuto;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSnapshotSettingReq that = (UpdateSnapshotSettingReq) obj;
        return Objects.equals(this.bucket, that.bucket) && Objects.equals(this.agency, that.agency)
            && Objects.equals(this.basePath, that.basePath)
            && Objects.equals(this.maxSnapshotBytesPerSeconds, that.maxSnapshotBytesPerSeconds)
            && Objects.equals(this.maxRestoreBytesPerSeconds, that.maxRestoreBytesPerSeconds)
            && Objects.equals(this.enable, that.enable) && Objects.equals(this.indices, that.indices)
            && Objects.equals(this.prefix, that.prefix) && Objects.equals(this.period, that.period)
            && Objects.equals(this.keepday, that.keepday) && Objects.equals(this.frequency, that.frequency)
            && Objects.equals(this.deleteAuto, that.deleteAuto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucket,
            agency,
            basePath,
            maxSnapshotBytesPerSeconds,
            maxRestoreBytesPerSeconds,
            enable,
            indices,
            prefix,
            period,
            keepday,
            frequency,
            deleteAuto);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSnapshotSettingReq {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
        sb.append("    basePath: ").append(toIndentedString(basePath)).append("\n");
        sb.append("    maxSnapshotBytesPerSeconds: ").append(toIndentedString(maxSnapshotBytesPerSeconds)).append("\n");
        sb.append("    maxRestoreBytesPerSeconds: ").append(toIndentedString(maxRestoreBytesPerSeconds)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    indices: ").append(toIndentedString(indices)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    keepday: ").append(toIndentedString(keepday)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    deleteAuto: ").append(toIndentedString(deleteAuto)).append("\n");
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
