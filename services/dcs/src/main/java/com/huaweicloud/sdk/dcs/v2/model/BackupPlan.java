package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** BackupPlan */
public class BackupPlan {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timezone_offset")

    private String timezoneOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_at")

    private List<Integer> backupAt = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private String periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_at")

    private String beginAt;

    public BackupPlan withTimezoneOffset(String timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
        return this;
    }

    /** 备份的时区。取值为-1200 ~+1200之间的时区。若为空则默认使用DCS-Server节点的当前时区。
     * 
     * @return timezoneOffset */
    public String getTimezoneOffset() {
        return timezoneOffset;
    }

    public void setTimezoneOffset(String timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    public BackupPlan withBackupAt(List<Integer> backupAt) {
        this.backupAt = backupAt;
        return this;
    }

    public BackupPlan addBackupAtItem(Integer backupAtItem) {
        if (this.backupAt == null) {
            this.backupAt = new ArrayList<>();
        }
        this.backupAt.add(backupAtItem);
        return this;
    }

    public BackupPlan withBackupAt(Consumer<List<Integer>> backupAtSetter) {
        if (this.backupAt == null) {
            this.backupAt = new ArrayList<>();
        }
        backupAtSetter.accept(this.backupAt);
        return this;
    }

    /** 每周的周几开始备份，取值1-7，1代表周一，7代表周日。
     * 
     * @return backupAt */
    public List<Integer> getBackupAt() {
        return backupAt;
    }

    public void setBackupAt(List<Integer> backupAt) {
        this.backupAt = backupAt;
    }

    public BackupPlan withPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }

    /** 备份周期类型，目前支持“weekly”。
     * 
     * @return periodType */
    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public BackupPlan withBeginAt(String beginAt) {
        this.beginAt = beginAt;
        return this;
    }

    /** 备份执行时间，“00:00-01:00”代表0点开始执行备份。
     * 
     * @return beginAt */
    public String getBeginAt() {
        return beginAt;
    }

    public void setBeginAt(String beginAt) {
        this.beginAt = beginAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupPlan backupPlan = (BackupPlan) o;
        return Objects.equals(this.timezoneOffset, backupPlan.timezoneOffset)
            && Objects.equals(this.backupAt, backupPlan.backupAt)
            && Objects.equals(this.periodType, backupPlan.periodType)
            && Objects.equals(this.beginAt, backupPlan.beginAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timezoneOffset, backupAt, periodType, beginAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupPlan {\n");
        sb.append("    timezoneOffset: ").append(toIndentedString(timezoneOffset)).append("\n");
        sb.append("    backupAt: ").append(toIndentedString(backupAt)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    beginAt: ").append(toIndentedString(beginAt)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
