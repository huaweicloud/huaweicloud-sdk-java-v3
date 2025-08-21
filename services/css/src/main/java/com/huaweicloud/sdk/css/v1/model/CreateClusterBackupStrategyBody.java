package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 开启自动创建快照策略，默认关闭。  当backupStrategy参数配置不为空时，才会开启自动创建快照策略。
 */
public class CreateClusterBackupStrategyBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefix")

    private String prefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keepday")

    private Integer keepday;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency")

    private String frequency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basePath")

    private String basePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency")

    private String agency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxSnapshotBytesPerSeconds")

    private String maxSnapshotBytesPerSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxRestoreBytesPerSeconds")

    private String maxRestoreBytesPerSeconds;

    public CreateClusterBackupStrategyBody withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 每天自动创建快照的时间点。只支持整点，后面需加上时区，格式为“HH:mm z”，“HH:mm”表示整点时间，“z”表示时区。比如“00:00 GMT+08:00”、“01:00 GMT+08:00”等。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public CreateClusterBackupStrategyBody withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * 自动创建的快照的前缀，需要用户自己手动输入。只能包含1~32位小写字母、数字、中划线或者下划线，并且以小写字母开头。
     * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public CreateClusterBackupStrategyBody withKeepday(Integer keepday) {
        this.keepday = keepday;
        return this;
    }

    /**
     * 自动创建快照的保留天数。取值范围：1-90。
     * @return keepday
     */
    public Integer getKeepday() {
        return keepday;
    }

    public void setKeepday(Integer keepday) {
        this.keepday = keepday;
    }

    public CreateClusterBackupStrategyBody withFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * 快照速率参数。
     * @return frequency
     */
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public CreateClusterBackupStrategyBody withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * 备份使用的OBS桶名称。
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public CreateClusterBackupStrategyBody withBasePath(String basePath) {
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

    public CreateClusterBackupStrategyBody withAgency(String agency) {
        this.agency = agency;
        return this;
    }

    /**
     * 委托名称，委托给CSS，允许CSS调用您的其他云服务。  >如果bucket、basePath和agency三个参数同时为空，则系统会自动创建OBS桶和IAM代理（若创建失败，则需要手工配置正确的参数）。
     * @return agency
     */
    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public CreateClusterBackupStrategyBody withMaxSnapshotBytesPerSeconds(String maxSnapshotBytesPerSeconds) {
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

    public CreateClusterBackupStrategyBody withMaxRestoreBytesPerSeconds(String maxRestoreBytesPerSeconds) {
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
        CreateClusterBackupStrategyBody that = (CreateClusterBackupStrategyBody) obj;
        return Objects.equals(this.period, that.period) && Objects.equals(this.prefix, that.prefix)
            && Objects.equals(this.keepday, that.keepday) && Objects.equals(this.frequency, that.frequency)
            && Objects.equals(this.bucket, that.bucket) && Objects.equals(this.basePath, that.basePath)
            && Objects.equals(this.agency, that.agency)
            && Objects.equals(this.maxSnapshotBytesPerSeconds, that.maxSnapshotBytesPerSeconds)
            && Objects.equals(this.maxRestoreBytesPerSeconds, that.maxRestoreBytesPerSeconds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(period,
            prefix,
            keepday,
            frequency,
            bucket,
            basePath,
            agency,
            maxSnapshotBytesPerSeconds,
            maxRestoreBytesPerSeconds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterBackupStrategyBody {\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    keepday: ").append(toIndentedString(keepday)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    basePath: ").append(toIndentedString(basePath)).append("\n");
        sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
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
