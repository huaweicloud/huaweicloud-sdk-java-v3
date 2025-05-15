package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 备份策略对象，包括备份保留的天数和备份开始时间。
 */
public class BackupPolicyItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_days")

    private Integer keepDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_incremental_backup")

    private Boolean enableIncrementalBackup;

    public BackupPolicyItem withKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    /**
     * 备份文件可以保存的天数。
     * minimum: 0
     * maximum: 732
     * @return keepDays
     */
    public Integer getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
    }

    public BackupPolicyItem withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 备份时间段。自动备份将在该时间段内触发。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public BackupPolicyItem withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 备份周期配置。自动备份将在每星期指定的天进行。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public BackupPolicyItem withEnableIncrementalBackup(Boolean enableIncrementalBackup) {
        this.enableIncrementalBackup = enableIncrementalBackup;
        return this;
    }

    /**
     * 是否开启增量备份。true：表示增量备份策略为开启状态；false：表示增量备份策略为关闭状态。
     * @return enableIncrementalBackup
     */
    public Boolean getEnableIncrementalBackup() {
        return enableIncrementalBackup;
    }

    public void setEnableIncrementalBackup(Boolean enableIncrementalBackup) {
        this.enableIncrementalBackup = enableIncrementalBackup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackupPolicyItem that = (BackupPolicyItem) obj;
        return Objects.equals(this.keepDays, that.keepDays) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.period, that.period)
            && Objects.equals(this.enableIncrementalBackup, that.enableIncrementalBackup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keepDays, startTime, period, enableIncrementalBackup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupPolicyItem {\n");
        sb.append("    keepDays: ").append(toIndentedString(keepDays)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    enableIncrementalBackup: ").append(toIndentedString(enableIncrementalBackup)).append("\n");
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
