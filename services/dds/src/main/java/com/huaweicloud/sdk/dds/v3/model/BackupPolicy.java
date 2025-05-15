package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 备份策略对象，包括备份保留的天数和备份开始时间。
 */
public class BackupPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_days")

    private String keepDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_incremental_backup")

    private Boolean enableIncrementalBackup;

    public BackupPolicy withKeepDays(String keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    /**
     * 指定已生成的备份文件可以保存的天数。 取值范围：0～732。取0值，表示关闭自动备份策略。
     * @return keepDays
     */
    public String getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(String keepDays) {
        this.keepDays = keepDays;
    }

    public BackupPolicy withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 备份时间段。自动备份将在该时间段内触发。开启自动备份策略时，该参数必选；关闭自动备份策略时，不传该参数。 取值范围：格式必须为hh:mm-HH:MM，且有效，当前时间指UTC时间。 - HH取值必须比hh大1。 - mm和MM取值必须相同，且取值必须为00、15、30或45。 取值示例： - 08:15-09:15 - 23:00-00:00
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public BackupPolicy withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 备份周期配置。自动备份将在每星期指定的天进行。取值范围：格式为半角逗号隔开的数字，数字代表星期。保留天数取值不同，备份周期约束如下： - 0天，不传该参数。 - 1～6天，备份周期全选，取值为：1,2,3,4,5,6,7。 - 7～732天，备份周期至少选择一周中的一天。示例：1,2,3,4。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public BackupPolicy withEnableIncrementalBackup(Boolean enableIncrementalBackup) {
        this.enableIncrementalBackup = enableIncrementalBackup;
        return this;
    }

    /**
     * 增量备份开关。不传这个参数则不对增备状态进行改动。开启增量备份后，系统会自动进行增量备份。增量备份开关的取值和约束如下： - false，代表关闭增量备份，关闭会将之前做的增量备份清理。 - true，代表开启增量备份，开启增量备份会触发一次全量备份。
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
        BackupPolicy that = (BackupPolicy) obj;
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
        sb.append("class BackupPolicy {\n");
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
