package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SparseBackupPolicy
 */
public class SparseBackupPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_days")

    private Integer keepDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    public SparseBackupPolicy withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 参数解释：  备份策略ID。  取值范围：  不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SparseBackupPolicy withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 参数解释：  备份周期配置。  取值范围：  格式为“日期 月份 星期”形式的Cron表达式，时区为UTC时区。 日期支持范围为1~31、特殊字符*（表示任意值）、特殊字符L（表示最后一天）。填写1~31或L时支持填写多个，以逗号隔开。 月份支持范围为1~12、特殊字符*（表示任意值）。 星期支持范围为1~7（1表示星期一，2表示星期二，依次类推）、特殊字符*（表示任意值）。填写1~7数字时支持填写多个，以逗号隔开。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public SparseBackupPolicy withKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    /**
     * 参数解释：  备份文件可以保存的天数。  取值范围：  1~3660。
     * @return keepDays
     */
    public Integer getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
    }

    public SparseBackupPolicy withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 参数解释：  全量备份时间段。自动备份将在该时间段内触发。  取值范围：  格式为hh:mm-HH:MM，为UTC时间。 HH的值比hh大1。 mm和MM的值相同，且取值必须为00。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SparseBackupPolicy that = (SparseBackupPolicy) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.period, that.period)
            && Objects.equals(this.keepDays, that.keepDays) && Objects.equals(this.startTime, that.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, period, keepDays, startTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SparseBackupPolicy {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    keepDays: ").append(toIndentedString(keepDays)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
