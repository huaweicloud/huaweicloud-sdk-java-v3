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
    @JsonProperty(value = "maxSnapshotBytesPerSeconds")

    private String maxSnapshotBytesPerSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxRestoreBytesPerSeconds")

    private String maxRestoreBytesPerSeconds;

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
            && Objects.equals(this.maxRestoreBytesPerSeconds, that.maxRestoreBytesPerSeconds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucket, agency, basePath, maxSnapshotBytesPerSeconds, maxRestoreBytesPerSeconds);
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
