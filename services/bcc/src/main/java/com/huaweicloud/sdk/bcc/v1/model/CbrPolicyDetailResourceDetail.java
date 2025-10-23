package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源详情
 */
public class CbrPolicyDetailResourceDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_acceleration")

    private Boolean enableAcceleration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_backup_interval")

    private Integer fullBackupInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_project_id")

    private String destinationProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_type")

    private String operationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timezone")

    private String timezone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "week_backups")

    private Integer weekBackups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pattern")

    private String pattern;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_region")

    private String destinationRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_duration_days")

    private Integer retentionDurationDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "day_backups")

    private Integer dayBackups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_vaults")

    private List<BccPolicyAssociateVault> associateVaults = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_backups")

    private Integer maxBackups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "year_backups")

    private Integer yearBackups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "month_backups")

    private Integer monthBackups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cross_account_urn")

    private String crossAccountUrn;

    public CbrPolicyDetailResourceDetail withEnableAcceleration(Boolean enableAcceleration) {
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

    public CbrPolicyDetailResourceDetail withFullBackupInterval(Integer fullBackupInterval) {
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

    public CbrPolicyDetailResourceDetail withDestinationProjectId(String destinationProjectId) {
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

    public CbrPolicyDetailResourceDetail withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * 数据保护类型
     * @return operationType
     */
    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public CbrPolicyDetailResourceDetail withTimezone(String timezone) {
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

    public CbrPolicyDetailResourceDetail withWeekBackups(Integer weekBackups) {
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

    public CbrPolicyDetailResourceDetail withPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * pattern
     * @return pattern
     */
    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public CbrPolicyDetailResourceDetail withDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }

    /**
     * 目标region
     * @return destinationRegion
     */
    public String getDestinationRegion() {
        return destinationRegion;
    }

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    public CbrPolicyDetailResourceDetail withRetentionDurationDays(Integer retentionDurationDays) {
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

    public CbrPolicyDetailResourceDetail withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否启用
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public CbrPolicyDetailResourceDetail withDayBackups(Integer dayBackups) {
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

    public CbrPolicyDetailResourceDetail withAssociateVaults(List<BccPolicyAssociateVault> associateVaults) {
        this.associateVaults = associateVaults;
        return this;
    }

    public CbrPolicyDetailResourceDetail addAssociateVaultsItem(BccPolicyAssociateVault associateVaultsItem) {
        if (this.associateVaults == null) {
            this.associateVaults = new ArrayList<>();
        }
        this.associateVaults.add(associateVaultsItem);
        return this;
    }

    public CbrPolicyDetailResourceDetail withAssociateVaults(
        Consumer<List<BccPolicyAssociateVault>> associateVaultsSetter) {
        if (this.associateVaults == null) {
            this.associateVaults = new ArrayList<>();
        }
        associateVaultsSetter.accept(this.associateVaults);
        return this;
    }

    /**
     * 管理存储库列表
     * @return associateVaults
     */
    public List<BccPolicyAssociateVault> getAssociateVaults() {
        return associateVaults;
    }

    public void setAssociateVaults(List<BccPolicyAssociateVault> associateVaults) {
        this.associateVaults = associateVaults;
    }

    public CbrPolicyDetailResourceDetail withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间start_time
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public CbrPolicyDetailResourceDetail withMaxBackups(Integer maxBackups) {
        this.maxBackups = maxBackups;
        return this;
    }

    /**
     * 最大备份数量max_backups
     * @return maxBackups
     */
    public Integer getMaxBackups() {
        return maxBackups;
    }

    public void setMaxBackups(Integer maxBackups) {
        this.maxBackups = maxBackups;
    }

    public CbrPolicyDetailResourceDetail withYearBackups(Integer yearBackups) {
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

    public CbrPolicyDetailResourceDetail withMonthBackups(Integer monthBackups) {
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

    public CbrPolicyDetailResourceDetail withCrossAccountUrn(String crossAccountUrn) {
        this.crossAccountUrn = crossAccountUrn;
        return this;
    }

    /**
     * 账号备份的账号urn
     * @return crossAccountUrn
     */
    public String getCrossAccountUrn() {
        return crossAccountUrn;
    }

    public void setCrossAccountUrn(String crossAccountUrn) {
        this.crossAccountUrn = crossAccountUrn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CbrPolicyDetailResourceDetail that = (CbrPolicyDetailResourceDetail) obj;
        return Objects.equals(this.enableAcceleration, that.enableAcceleration)
            && Objects.equals(this.fullBackupInterval, that.fullBackupInterval)
            && Objects.equals(this.destinationProjectId, that.destinationProjectId)
            && Objects.equals(this.operationType, that.operationType) && Objects.equals(this.timezone, that.timezone)
            && Objects.equals(this.weekBackups, that.weekBackups) && Objects.equals(this.pattern, that.pattern)
            && Objects.equals(this.destinationRegion, that.destinationRegion)
            && Objects.equals(this.retentionDurationDays, that.retentionDurationDays)
            && Objects.equals(this.enabled, that.enabled) && Objects.equals(this.dayBackups, that.dayBackups)
            && Objects.equals(this.associateVaults, that.associateVaults)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.maxBackups, that.maxBackups)
            && Objects.equals(this.yearBackups, that.yearBackups)
            && Objects.equals(this.monthBackups, that.monthBackups)
            && Objects.equals(this.crossAccountUrn, that.crossAccountUrn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableAcceleration,
            fullBackupInterval,
            destinationProjectId,
            operationType,
            timezone,
            weekBackups,
            pattern,
            destinationRegion,
            retentionDurationDays,
            enabled,
            dayBackups,
            associateVaults,
            startTime,
            maxBackups,
            yearBackups,
            monthBackups,
            crossAccountUrn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CbrPolicyDetailResourceDetail {\n");
        sb.append("    enableAcceleration: ").append(toIndentedString(enableAcceleration)).append("\n");
        sb.append("    fullBackupInterval: ").append(toIndentedString(fullBackupInterval)).append("\n");
        sb.append("    destinationProjectId: ").append(toIndentedString(destinationProjectId)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
        sb.append("    weekBackups: ").append(toIndentedString(weekBackups)).append("\n");
        sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
        sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
        sb.append("    retentionDurationDays: ").append(toIndentedString(retentionDurationDays)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    dayBackups: ").append(toIndentedString(dayBackups)).append("\n");
        sb.append("    associateVaults: ").append(toIndentedString(associateVaults)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    maxBackups: ").append(toIndentedString(maxBackups)).append("\n");
        sb.append("    yearBackups: ").append(toIndentedString(yearBackups)).append("\n");
        sb.append("    monthBackups: ").append(toIndentedString(monthBackups)).append("\n");
        sb.append("    crossAccountUrn: ").append(toIndentedString(crossAccountUrn)).append("\n");
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
