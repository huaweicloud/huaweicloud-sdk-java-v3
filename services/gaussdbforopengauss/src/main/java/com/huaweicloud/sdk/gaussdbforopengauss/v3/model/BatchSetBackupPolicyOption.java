package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 批量备份策略信息
 */
public class BatchSetBackupPolicyOption {

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

    public BatchSetBackupPolicyOption withKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    /**
     * **参数解释**: 备份文件可以保存的天数。 **约束限制**: 不涉及。 **取值范围**: 1-732天。如果需要延长保留时间请联系客服人员申请，自动备份最长可以保留36500天。 **默认取值**: 不涉及。
     * @return keepDays
     */
    public Integer getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
    }

    public BatchSetBackupPolicyOption withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**: 备份时间段。自动备份将在该时间段内触发。 **约束限制**: - 该时间段为执行备份的UTC时间段。比如备份时间是当地时间05:00-06:00，时区为UTC+08:00，则接口需要传入21:00-22:00；如果时区为UTC+04:00，接口传入01:00-02:00。 - 当填写start_time时，建议同时填写period，再下发修改，以免修改后的备份时间段和周期在您的时区不符合预期。  **取值范围**: 非空，格式必须为hh:mm-HH:MM且有效，当前时间指UTC时间。 HH取值必须比hh大1，mm和MM取值必须相同，且取值必须为00。 取值示例： 21:00-22:00 **默认取值**: 不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public BatchSetBackupPolicyOption withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * **参数解释**: 全量备份周期配置。自动全量备份将在每周对应的UTC日期进行。 **约束限制**: - 该时间段为执行备份的UTC日期。比如备份时间为当地时间周一、周二05:00-06:00，时区为UTC+08:00，则period传入1,7；如果时区为UTC+04:00，period传入1,2。 - 当填写period时，建议同时填写start_time，再下发修改，以免修改后的备份时间段和周期在您的时区不符合预期。  **取值范围**: 格式为逗号隔开的数字，数字代表星期，取1~7。 取值示例： - 1,2,3,4 表示备份周期配置为星期一、星期二、星期三和星期四。 - 1,2,3,4,5,6,7 则表示星期一至星期日每天执行一次自动备份。 - 1,3,5表示周一、周三、周五执行一次自动备份。  **默认取值**: 不涉及。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public BatchSetBackupPolicyOption withDifferentialPeriod(String differentialPeriod) {
        this.differentialPeriod = differentialPeriod;
        return this;
    }

    /**
     * **参数解释**: 差异备份间隔时间配置。每次自动差异备份的间隔时间。 **约束限制**: 不涉及。 **取值范围**: 格式为逗号隔开的数字，数字代表星期，取1~7。 取值示例： 15、30、60、180、360、720、1440。单位：分钟。 **默认取值**: 不涉及。
     * @return differentialPeriod
     */
    public String getDifferentialPeriod() {
        return differentialPeriod;
    }

    public void setDifferentialPeriod(String differentialPeriod) {
        this.differentialPeriod = differentialPeriod;
    }

    public BatchSetBackupPolicyOption withRateLimit(Integer rateLimit) {
        this.rateLimit = rateLimit;
        return this;
    }

    /**
     * **参数解释**: 备份限速。控制备份时备份数据上传OBS的速度，限速用于限制上传备份对上传带宽的影响。 **约束限制**: 不涉及。 **取值范围**: 0~1024MB/s，0表示不限速。 **默认取值**: 75MB/s
     * @return rateLimit
     */
    public Integer getRateLimit() {
        return rateLimit;
    }

    public void setRateLimit(Integer rateLimit) {
        this.rateLimit = rateLimit;
    }

    public BatchSetBackupPolicyOption withPrefetchBlock(Integer prefetchBlock) {
        this.prefetchBlock = prefetchBlock;
        return this;
    }

    /**
     * **参数解释**: 差量预取页面个数。控制差量备份时读取磁盘上表文件差量修改页面的预取页面个数。当差量修改页面非常集中时（如数据导入场景），可以适当调大该值；当差量修改页面非常分散时（如随机更新），可以适当调小该值。 **约束限制**: 不涉及。 **取值范围**: 1~8192 **默认取值**: 64
     * @return prefetchBlock
     */
    public Integer getPrefetchBlock() {
        return prefetchBlock;
    }

    public void setPrefetchBlock(Integer prefetchBlock) {
        this.prefetchBlock = prefetchBlock;
    }

    public BatchSetBackupPolicyOption withFileSplitSize(Integer fileSplitSize) {
        this.fileSplitSize = fileSplitSize;
        return this;
    }

    /**
     * **参数解释**: 文件拆分大小。全量、差量备份时产生的备份文件会根据该参数的值进行拆分。 **约束限制**: 需为4的倍数。 **取值范围**: 可设置范围为0~1024GB。0GB表示不限制大小。 **默认取值**: 4GB
     * @return fileSplitSize
     */
    public Integer getFileSplitSize() {
        return fileSplitSize;
    }

    public void setFileSplitSize(Integer fileSplitSize) {
        this.fileSplitSize = fileSplitSize;
    }

    public BatchSetBackupPolicyOption withEnableStandbyBackup(Boolean enableStandbyBackup) {
        this.enableStandbyBackup = enableStandbyBackup;
        return this;
    }

    /**
     * **参数解释**: 是否启用备机备份。 **约束限制**: 不支持单节点实例及V2.0-3.100.0以下的实例。 **取值范围**: - true：启用备机备份。 - false：不启用备机备份。  **默认取值**: 不涉及。
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
        BatchSetBackupPolicyOption that = (BatchSetBackupPolicyOption) obj;
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
        sb.append("class BatchSetBackupPolicyOption {\n");
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
