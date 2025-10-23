package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 策略定义，备份和复制里面的具体字段各不相同，和策略的保持一致。
 */
public class BccOrganizationPolicyDetailPolicyOperationDefinition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "day_backups")

    private Integer dayBackups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_project_id")

    private String destinationProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_region")

    private String destinationRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_acceleration")

    private Boolean enableAcceleration;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_backup_interval")

    private Integer fullBackupInterval;

    public BccOrganizationPolicyDetailPolicyOperationDefinition withDayBackups(Integer dayBackups) {
        this.dayBackups = dayBackups;
        return this;
    }

    /**
     * 保留日备个数，该备份不受保留最大备份数限制。取值为0到100。
     * @return dayBackups
     */
    public Integer getDayBackups() {
        return dayBackups;
    }

    public void setDayBackups(Integer dayBackups) {
        this.dayBackups = dayBackups;
    }

    public BccOrganizationPolicyDetailPolicyOperationDefinition withDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
        return this;
    }

    /**
     * 复制的目标项目ID，仅在跨区域复制时才会使用并且必须指定。
     * @return destinationProjectId
     */
    public String getDestinationProjectId() {
        return destinationProjectId;
    }

    public void setDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
    }

    public BccOrganizationPolicyDetailPolicyOperationDefinition withDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }

    /**
     * 复制的目标区域。
     * @return destinationRegion
     */
    public String getDestinationRegion() {
        return destinationRegion;
    }

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    public BccOrganizationPolicyDetailPolicyOperationDefinition withEnableAcceleration(Boolean enableAcceleration) {
        this.enableAcceleration = enableAcceleration;
        return this;
    }

    /**
     * 跨区域复制时，是否启用加速从而缩减复制的时间，如果不指定，默认不启用加速。
     * @return enableAcceleration
     */
    public Boolean getEnableAcceleration() {
        return enableAcceleration;
    }

    public void setEnableAcceleration(Boolean enableAcceleration) {
        this.enableAcceleration = enableAcceleration;
    }

    public BccOrganizationPolicyDetailPolicyOperationDefinition withMaxBackups(Integer maxBackups) {
        this.maxBackups = maxBackups;
        return this;
    }

    /**
     * 单个备份对象自动备份的最大备份数。取值为-1或1-99999。-1代表不按备份数清理。
     * @return maxBackups
     */
    public Integer getMaxBackups() {
        return maxBackups;
    }

    public void setMaxBackups(Integer maxBackups) {
        this.maxBackups = maxBackups;
    }

    public BccOrganizationPolicyDetailPolicyOperationDefinition withMonthBackups(Integer monthBackups) {
        this.monthBackups = monthBackups;
        return this;
    }

    /**
     * 保留月备个数，该备份不受保留最大备份数限制。取值为0到100。
     * @return monthBackups
     */
    public Integer getMonthBackups() {
        return monthBackups;
    }

    public void setMonthBackups(Integer monthBackups) {
        this.monthBackups = monthBackups;
    }

    public BccOrganizationPolicyDetailPolicyOperationDefinition withRetentionDurationDays(
        Integer retentionDurationDays) {
        this.retentionDurationDays = retentionDurationDays;
        return this;
    }

    /**
     * 备份保留时长，单位天。最长支持99999天。-1代表不按时间清理。
     * @return retentionDurationDays
     */
    public Integer getRetentionDurationDays() {
        return retentionDurationDays;
    }

    public void setRetentionDurationDays(Integer retentionDurationDays) {
        this.retentionDurationDays = retentionDurationDays;
    }

    public BccOrganizationPolicyDetailPolicyOperationDefinition withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * 用户所在时区,格式形如UTC+08:00。
     * @return timezone
     */
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public BccOrganizationPolicyDetailPolicyOperationDefinition withWeekBackups(Integer weekBackups) {
        this.weekBackups = weekBackups;
        return this;
    }

    /**
     * 保留周备个数，该备份不受保留最大备份数限制。取值为0到100。
     * @return weekBackups
     */
    public Integer getWeekBackups() {
        return weekBackups;
    }

    public void setWeekBackups(Integer weekBackups) {
        this.weekBackups = weekBackups;
    }

    public BccOrganizationPolicyDetailPolicyOperationDefinition withYearBackups(Integer yearBackups) {
        this.yearBackups = yearBackups;
        return this;
    }

    /**
     * 保留年备个数，该备份不受保留最大备份数限制。取值为0到100。
     * @return yearBackups
     */
    public Integer getYearBackups() {
        return yearBackups;
    }

    public void setYearBackups(Integer yearBackups) {
        this.yearBackups = yearBackups;
    }

    public BccOrganizationPolicyDetailPolicyOperationDefinition withFullBackupInterval(Integer fullBackupInterval) {
        this.fullBackupInterval = fullBackupInterval;
        return this;
    }

    /**
     * 每间隔多少次执行一次全量备份，当取值为 -1 时，不执行全量备份。最小值：-1，最大值：100。
     * @return fullBackupInterval
     */
    public Integer getFullBackupInterval() {
        return fullBackupInterval;
    }

    public void setFullBackupInterval(Integer fullBackupInterval) {
        this.fullBackupInterval = fullBackupInterval;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BccOrganizationPolicyDetailPolicyOperationDefinition that =
            (BccOrganizationPolicyDetailPolicyOperationDefinition) obj;
        return Objects.equals(this.dayBackups, that.dayBackups)
            && Objects.equals(this.destinationProjectId, that.destinationProjectId)
            && Objects.equals(this.destinationRegion, that.destinationRegion)
            && Objects.equals(this.enableAcceleration, that.enableAcceleration)
            && Objects.equals(this.maxBackups, that.maxBackups) && Objects.equals(this.monthBackups, that.monthBackups)
            && Objects.equals(this.retentionDurationDays, that.retentionDurationDays)
            && Objects.equals(this.timezone, that.timezone) && Objects.equals(this.weekBackups, that.weekBackups)
            && Objects.equals(this.yearBackups, that.yearBackups)
            && Objects.equals(this.fullBackupInterval, that.fullBackupInterval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dayBackups,
            destinationProjectId,
            destinationRegion,
            enableAcceleration,
            maxBackups,
            monthBackups,
            retentionDurationDays,
            timezone,
            weekBackups,
            yearBackups,
            fullBackupInterval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BccOrganizationPolicyDetailPolicyOperationDefinition {\n");
        sb.append("    dayBackups: ").append(toIndentedString(dayBackups)).append("\n");
        sb.append("    destinationProjectId: ").append(toIndentedString(destinationProjectId)).append("\n");
        sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
        sb.append("    enableAcceleration: ").append(toIndentedString(enableAcceleration)).append("\n");
        sb.append("    maxBackups: ").append(toIndentedString(maxBackups)).append("\n");
        sb.append("    monthBackups: ").append(toIndentedString(monthBackups)).append("\n");
        sb.append("    retentionDurationDays: ").append(toIndentedString(retentionDurationDays)).append("\n");
        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
        sb.append("    weekBackups: ").append(toIndentedString(weekBackups)).append("\n");
        sb.append("    yearBackups: ").append(toIndentedString(yearBackups)).append("\n");
        sb.append("    fullBackupInterval: ").append(toIndentedString(fullBackupInterval)).append("\n");
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
