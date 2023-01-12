package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 调度参数
 */
public class OperationDefinitionRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "day_backups")

    private Integer dayBackups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_backups")

    private Integer maxBackups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "month_backups")

    private Integer monthBackups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_duration_days")

    private Integer retentionDurationDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timezone")

    private String timezone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "week_backups")

    private Integer weekBackups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "year_backups")

    private Integer yearBackups;

    public OperationDefinitionRequestInfo withDayBackups(Integer dayBackups) {
        this.dayBackups = dayBackups;
        return this;
    }

    /**
     * 保留日备个数，该备份不受保留最大备份数限制。取值为0到100。若选择该参数，则timezone 也必选。最小值：0,最大值：100
     * minimum: 0
     * maximum: 100
     * @return dayBackups
     */
    public Integer getDayBackups() {
        return dayBackups;
    }

    public void setDayBackups(Integer dayBackups) {
        this.dayBackups = dayBackups;
    }

    public OperationDefinitionRequestInfo withMaxBackups(Integer maxBackups) {
        this.maxBackups = maxBackups;
        return this;
    }

    /**
     * 单个备份对象自动备份的最大备份数。取值为-1或0-99999。-1代表不按备份数清理。若该字段和retention_duration_days字段同时为空，备份会永久保留。最小值：1,最大值：99999,缺省值：-1
     * minimum: -1
     * maximum: 99999
     * @return maxBackups
     */
    public Integer getMaxBackups() {
        return maxBackups;
    }

    public void setMaxBackups(Integer maxBackups) {
        this.maxBackups = maxBackups;
    }

    public OperationDefinitionRequestInfo withMonthBackups(Integer monthBackups) {
        this.monthBackups = monthBackups;
        return this;
    }

    /**
     * 保留月备个数，该备份不受保留最大备份数限制。取值为0到100。若选择该参数，则timezone 也必选。最小值：0, 最大值：100
     * minimum: 0
     * maximum: 100
     * @return monthBackups
     */
    public Integer getMonthBackups() {
        return monthBackups;
    }

    public void setMonthBackups(Integer monthBackups) {
        this.monthBackups = monthBackups;
    }

    public OperationDefinitionRequestInfo withRetentionDurationDays(Integer retentionDurationDays) {
        this.retentionDurationDays = retentionDurationDays;
        return this;
    }

    /**
     * 备份保留时长，单位天。最长支持99999天。-1代表不按时间清理。若该字段和max_backups 参数同时为空，备份会永久保留。最小值：1, 最大值：99999, 缺省值：-1
     * minimum: -1
     * maximum: 99999
     * @return retentionDurationDays
     */
    public Integer getRetentionDurationDays() {
        return retentionDurationDays;
    }

    public void setRetentionDurationDays(Integer retentionDurationDays) {
        this.retentionDurationDays = retentionDurationDays;
    }

    public OperationDefinitionRequestInfo withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * 用户所在时区,格式形如UTC+08:00,若没有选择年备，月备，周备，日备中任一参数，则不能选择该参数。
     * @return timezone
     */
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public OperationDefinitionRequestInfo withWeekBackups(Integer weekBackups) {
        this.weekBackups = weekBackups;
        return this;
    }

    /**
     * 保留周备个数，该备份不受保留最大备份数限制。取值为0到100。若选择该参数，则timezone 也必选。
     * minimum: 0
     * maximum: 100
     * @return weekBackups
     */
    public Integer getWeekBackups() {
        return weekBackups;
    }

    public void setWeekBackups(Integer weekBackups) {
        this.weekBackups = weekBackups;
    }

    public OperationDefinitionRequestInfo withYearBackups(Integer yearBackups) {
        this.yearBackups = yearBackups;
        return this;
    }

    /**
     * 保留年备个数，该备份不受保留最大备份数限制。取值为0到100。若选择该参数，则timezone 也必选。最小值：0，最大值：100
     * minimum: 0
     * maximum: 100
     * @return yearBackups
     */
    public Integer getYearBackups() {
        return yearBackups;
    }

    public void setYearBackups(Integer yearBackups) {
        this.yearBackups = yearBackups;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OperationDefinitionRequestInfo operationDefinitionRequestInfo = (OperationDefinitionRequestInfo) o;
        return Objects.equals(this.dayBackups, operationDefinitionRequestInfo.dayBackups)
            && Objects.equals(this.maxBackups, operationDefinitionRequestInfo.maxBackups)
            && Objects.equals(this.monthBackups, operationDefinitionRequestInfo.monthBackups)
            && Objects.equals(this.retentionDurationDays, operationDefinitionRequestInfo.retentionDurationDays)
            && Objects.equals(this.timezone, operationDefinitionRequestInfo.timezone)
            && Objects.equals(this.weekBackups, operationDefinitionRequestInfo.weekBackups)
            && Objects.equals(this.yearBackups, operationDefinitionRequestInfo.yearBackups);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(dayBackups, maxBackups, monthBackups, retentionDurationDays, timezone, weekBackups, yearBackups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperationDefinitionRequestInfo {\n");
        sb.append("    dayBackups: ").append(toIndentedString(dayBackups)).append("\n");
        sb.append("    maxBackups: ").append(toIndentedString(maxBackups)).append("\n");
        sb.append("    monthBackups: ").append(toIndentedString(monthBackups)).append("\n");
        sb.append("    retentionDurationDays: ").append(toIndentedString(retentionDurationDays)).append("\n");
        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
        sb.append("    weekBackups: ").append(toIndentedString(weekBackups)).append("\n");
        sb.append("    yearBackups: ").append(toIndentedString(yearBackups)).append("\n");
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
