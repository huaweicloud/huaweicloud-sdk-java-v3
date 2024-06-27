package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 备份策略信息
 */
public class BackupPolicyInfo {

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

    private String differentialPeriod;

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

    public BackupPolicyInfo withKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    /**
     * 备份文件可以保存的天数。取值范围：1-36500天。
     * @return keepDays
     */
    public Integer getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
    }

    public BackupPolicyInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 备份时间段。自动备份将在该时间段内触发。取值范围：非空，格式必须为hh:mm-HH:MM且有效，当前时间指UTC时间。 HH取值必须比hh大1，mm和MM取值必须相同，且取值必须为00。 取值示例： 21:00-22:00
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public BackupPolicyInfo withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 全量备份周期配置。自动全量备份将在每星期指定的天进行。 取值范围：格式为逗号隔开的数字，数字代表星期。取值示例：1,2,3,4则表示备份周期配置为星期一、星期二、星期三和星期四。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public BackupPolicyInfo withDifferentialPeriod(String differentialPeriod) {
        this.differentialPeriod = differentialPeriod;
        return this;
    }

    /**
     * 差异备份间隔时间配置。每次自动差异备份的间隔时间。 取值范围：15、30、60、180、360、720、1440。单位：分钟。 取值示例：30
     * @return differentialPeriod
     */
    public String getDifferentialPeriod() {
        return differentialPeriod;
    }

    public void setDifferentialPeriod(String differentialPeriod) {
        this.differentialPeriod = differentialPeriod;
    }

    public BackupPolicyInfo withRateLimit(Integer rateLimit) {
        this.rateLimit = rateLimit;
        return this;
    }

    /**
     * 备份限速,默认值为0MB/s，表示不限速。控制备份是备份数据上传OBS的速度，限速用于限制上传备份对上传带宽的影响 取值范围：0~ 1024 最小值：0 MB/s
     * @return rateLimit
     */
    public Integer getRateLimit() {
        return rateLimit;
    }

    public void setRateLimit(Integer rateLimit) {
        this.rateLimit = rateLimit;
    }

    public BackupPolicyInfo withPrefetchBlock(Integer prefetchBlock) {
        this.prefetchBlock = prefetchBlock;
        return this;
    }

    /**
     * 控制差量备份时读取磁盘上表文件差量修改页面的预取页面个数。当差量修改页面非常集中时（如数据导入场景），可以适当调大            该值；当差量修改页面非常分散时（如随机更新），可以适当调小该值。默认为64,单位个数 取值范围：1 ~ 8192 最小值：1 最大值：8192
     * @return prefetchBlock
     */
    public Integer getPrefetchBlock() {
        return prefetchBlock;
    }

    public void setPrefetchBlock(Integer prefetchBlock) {
        this.prefetchBlock = prefetchBlock;
    }

    public BackupPolicyInfo withFileSplitSize(Integer fileSplitSize) {
        this.fileSplitSize = fileSplitSize;
        return this;
    }

    /**
     * 全量、差量备份时产生的备份文件会根据该参数的值进行拆分，可设置范围为0~1024GB，设置需为4的倍数，默认4GB，0GB表示不           限制大小。 取值范围：0 ~ 1024 最小值：0 最大值：1024
     * @return fileSplitSize
     */
    public Integer getFileSplitSize() {
        return fileSplitSize;
    }

    public void setFileSplitSize(Integer fileSplitSize) {
        this.fileSplitSize = fileSplitSize;
    }

    public BackupPolicyInfo withEnableStandbyBackup(Boolean enableStandbyBackup) {
        this.enableStandbyBackup = enableStandbyBackup;
        return this;
    }

    /**
     * 是否启用备机备份。(不支持单节点实例及3.100.0以下的实例)
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
        BackupPolicyInfo that = (BackupPolicyInfo) obj;
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
        sb.append("class BackupPolicyInfo {\n");
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
