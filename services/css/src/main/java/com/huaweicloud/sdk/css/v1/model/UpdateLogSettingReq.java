package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateLogSettingReq
 */
public class UpdateLogSettingReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency")

    private String agency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_base_path")

    private String logBasePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_bucket")

    private String logBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_prefix")

    private String indexPrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_days")

    private Integer keepDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_cluster_id")

    private String targetClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_enable")

    private Boolean autoEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    public UpdateLogSettingReq withAgency(String agency) {
        this.agency = agency;
        return this;
    }

    /**
     * 委托名称，委托给CSS，允许CSS调用您的其他云服务。
     * @return agency
     */
    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public UpdateLogSettingReq withLogBasePath(String logBasePath) {
        this.logBasePath = logBasePath;
        return this;
    }

    /**
     * 日志在OBS桶中的备份路径。
     * @return logBasePath
     */
    public String getLogBasePath() {
        return logBasePath;
    }

    public void setLogBasePath(String logBasePath) {
        this.logBasePath = logBasePath;
    }

    public UpdateLogSettingReq withLogBucket(String logBucket) {
        this.logBucket = logBucket;
        return this;
    }

    /**
     * 用于存储日志的OBS桶的桶名。
     * @return logBucket
     */
    public String getLogBucket() {
        return logBucket;
    }

    public void setLogBucket(String logBucket) {
        this.logBucket = logBucket;
    }

    public UpdateLogSettingReq withIndexPrefix(String indexPrefix) {
        this.indexPrefix = indexPrefix;
        return this;
    }

    /**
     * 设置保存日志的索引前缀。
     * @return indexPrefix
     */
    public String getIndexPrefix() {
        return indexPrefix;
    }

    public void setIndexPrefix(String indexPrefix) {
        this.indexPrefix = indexPrefix;
    }

    public UpdateLogSettingReq withKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    /**
     * 修改日志保存的天数。
     * @return keepDays
     */
    public Integer getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
    }

    public UpdateLogSettingReq withTargetClusterId(String targetClusterId) {
        this.targetClusterId = targetClusterId;
        return this;
    }

    /**
     * 设置保存日志的目标集群ID。
     * @return targetClusterId
     */
    public String getTargetClusterId() {
        return targetClusterId;
    }

    public void setTargetClusterId(String targetClusterId) {
        this.targetClusterId = targetClusterId;
    }

    public UpdateLogSettingReq withAutoEnable(Boolean autoEnable) {
        this.autoEnable = autoEnable;
        return this;
    }

    /**
     * 集群日志是否开启自动备份。
     * @return autoEnable
     */
    public Boolean getAutoEnable() {
        return autoEnable;
    }

    public void setAutoEnable(Boolean autoEnable) {
        this.autoEnable = autoEnable;
    }

    public UpdateLogSettingReq withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 集群日志备份开始时间。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateLogSettingReq that = (UpdateLogSettingReq) obj;
        return Objects.equals(this.agency, that.agency) && Objects.equals(this.logBasePath, that.logBasePath)
            && Objects.equals(this.logBucket, that.logBucket) && Objects.equals(this.indexPrefix, that.indexPrefix)
            && Objects.equals(this.keepDays, that.keepDays)
            && Objects.equals(this.targetClusterId, that.targetClusterId)
            && Objects.equals(this.autoEnable, that.autoEnable) && Objects.equals(this.period, that.period);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agency, logBasePath, logBucket, indexPrefix, keepDays, targetClusterId, autoEnable, period);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLogSettingReq {\n");
        sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
        sb.append("    logBasePath: ").append(toIndentedString(logBasePath)).append("\n");
        sb.append("    logBucket: ").append(toIndentedString(logBucket)).append("\n");
        sb.append("    indexPrefix: ").append(toIndentedString(indexPrefix)).append("\n");
        sb.append("    keepDays: ").append(toIndentedString(keepDays)).append("\n");
        sb.append("    targetClusterId: ").append(toIndentedString(targetClusterId)).append("\n");
        sb.append("    autoEnable: ").append(toIndentedString(autoEnable)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
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
