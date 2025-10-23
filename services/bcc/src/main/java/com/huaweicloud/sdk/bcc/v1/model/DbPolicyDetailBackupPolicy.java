package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据库备份策略
 */
public class DbPolicyDetailBackupPolicy {

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
    @JsonProperty(value = "differential_period")

    private Integer differentialPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rate_limit")

    private Integer rateLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefetch_block")

    private Integer prefetchBlock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_split_size")

    private Integer fileSplitSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_standby_backup")

    private Boolean enableStandbyBackup;

    public DbPolicyDetailBackupPolicy withKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    /**
     * 备份保留时长
     * @return keepDays
     */
    public Integer getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
    }

    public DbPolicyDetailBackupPolicy withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 备份开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public DbPolicyDetailBackupPolicy withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 备份周期，一周哪几天
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public DbPolicyDetailBackupPolicy withDifferentialPeriod(Integer differentialPeriod) {
        this.differentialPeriod = differentialPeriod;
        return this;
    }

    /**
     * gaussdb差异备份周期
     * @return differentialPeriod
     */
    public Integer getDifferentialPeriod() {
        return differentialPeriod;
    }

    public void setDifferentialPeriod(Integer differentialPeriod) {
        this.differentialPeriod = differentialPeriod;
    }

    public DbPolicyDetailBackupPolicy withRateLimit(Integer rateLimit) {
        this.rateLimit = rateLimit;
        return this;
    }

    /**
     * gaussdb备份限速
     * @return rateLimit
     */
    public Integer getRateLimit() {
        return rateLimit;
    }

    public void setRateLimit(Integer rateLimit) {
        this.rateLimit = rateLimit;
    }

    public DbPolicyDetailBackupPolicy withPrefetchBlock(Integer prefetchBlock) {
        this.prefetchBlock = prefetchBlock;
        return this;
    }

    /**
     * gaussdb预取页面个数
     * @return prefetchBlock
     */
    public Integer getPrefetchBlock() {
        return prefetchBlock;
    }

    public void setPrefetchBlock(Integer prefetchBlock) {
        this.prefetchBlock = prefetchBlock;
    }

    public DbPolicyDetailBackupPolicy withFileSplitSize(Integer fileSplitSize) {
        this.fileSplitSize = fileSplitSize;
        return this;
    }

    /**
     * gaussdb文件拆分大小
     * @return fileSplitSize
     */
    public Integer getFileSplitSize() {
        return fileSplitSize;
    }

    public void setFileSplitSize(Integer fileSplitSize) {
        this.fileSplitSize = fileSplitSize;
    }

    public DbPolicyDetailBackupPolicy withEnableStandbyBackup(Boolean enableStandbyBackup) {
        this.enableStandbyBackup = enableStandbyBackup;
        return this;
    }

    /**
     * gaussdb是否启用standby备份
     * @return enableStandbyBackup
     */
    public Boolean getEnableStandbyBackup() {
        return enableStandbyBackup;
    }

    public void setEnableStandbyBackup(Boolean enableStandbyBackup) {
        this.enableStandbyBackup = enableStandbyBackup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DbPolicyDetailBackupPolicy that = (DbPolicyDetailBackupPolicy) obj;
        return Objects.equals(this.keepDays, that.keepDays) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.period, that.period)
            && Objects.equals(this.differentialPeriod, that.differentialPeriod)
            && Objects.equals(this.rateLimit, that.rateLimit) && Objects.equals(this.prefetchBlock, that.prefetchBlock)
            && Objects.equals(this.fileSplitSize, that.fileSplitSize)
            && Objects.equals(this.enableStandbyBackup, that.enableStandbyBackup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keepDays,
            startTime,
            period,
            differentialPeriod,
            rateLimit,
            prefetchBlock,
            fileSplitSize,
            enableStandbyBackup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DbPolicyDetailBackupPolicy {\n");
        sb.append("    keepDays: ").append(toIndentedString(keepDays)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    differentialPeriod: ").append(toIndentedString(differentialPeriod)).append("\n");
        sb.append("    rateLimit: ").append(toIndentedString(rateLimit)).append("\n");
        sb.append("    prefetchBlock: ").append(toIndentedString(prefetchBlock)).append("\n");
        sb.append("    fileSplitSize: ").append(toIndentedString(fileSplitSize)).append("\n");
        sb.append("    enableStandbyBackup: ").append(toIndentedString(enableStandbyBackup)).append("\n");
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
