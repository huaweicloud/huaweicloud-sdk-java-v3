package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 高级备份策略，与请求参数相同。
 */
public class BackupStrategyResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_days")

    private String keepDays;

    public BackupStrategyResult withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 备份时间段。自动备份将在该时间段内触发。 取值范围：非空，格式必须为hh:mm-HH:MM且有效，当前时间指UTC时间。   - HH取值必须比hh大1。   - mm和MM取值必须相同，且取值必须为00、30。   - 不传该参数，默认的备份时间段为00:00-01:00。   - 取值示例：23:00-00:00。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public BackupStrategyResult withKeepDays(String keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    /**
     * 指定已生成的备份文件可以保存的天数。 取值范围：0~35。   - 取0值，表示不设置自动备份策略。   - 不传该参数，默认开启自动备份策略，备份文件默认保存7天。
     * @return keepDays
     */
    public String getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(String keepDays) {
        this.keepDays = keepDays;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupStrategyResult backupStrategyResult = (BackupStrategyResult) o;
        return Objects.equals(this.startTime, backupStrategyResult.startTime)
            && Objects.equals(this.keepDays, backupStrategyResult.keepDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, keepDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupStrategyResult {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    keepDays: ").append(toIndentedString(keepDays)).append("\n");
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
