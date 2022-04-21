package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 开启自动创建快照策略。 说明：当backupStrategy参数配置不为空时，才会开启自动创建快照策略。
 */
public class CreateClusterBackupStrategyBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefix")

    private String prefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keepday")

    private Integer keepday;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basePath")

    private String basePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency")

    private String agency;

    public CreateClusterBackupStrategyBody withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 每天自动创建快照的时间点。只支持整点，后面需加上时区，格式为“HH:mm z”，“HH:mm”表示整点时间，“z”表示时区。比如“00:00 GMT+08:00”、“01:00 GMT+08:00”等。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public CreateClusterBackupStrategyBody withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * 自动创建的快照的前缀。
     * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public CreateClusterBackupStrategyBody withKeepday(Integer keepday) {
        this.keepday = keepday;
        return this;
    }

    /**
     * 自动创建快照的保留天数。取值范围：1-90。
     * @return keepday
     */
    public Integer getKeepday() {
        return keepday;
    }

    public void setKeepday(Integer keepday) {
        this.keepday = keepday;
    }

    public CreateClusterBackupStrategyBody withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * 备份使用的OBS桶名称，如果桶已经存放快照数据了，不可更改。
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public CreateClusterBackupStrategyBody withBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }

    /**
     * 快照在OBS桶中的存放路径。
     * @return basePath
     */
    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public CreateClusterBackupStrategyBody withAgency(String agency) {
        this.agency = agency;
        return this;
    }

    /**
     * 访问OBS使用的IAM委托名称。   说明：如果bucket、basePath和agency三个参数同时为空，则系统会自动创建OBS桶和IAM代理，否则使用配置的参数值。
     * @return agency
     */
    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateClusterBackupStrategyBody createClusterBackupStrategyBody = (CreateClusterBackupStrategyBody) o;
        return Objects.equals(this.period, createClusterBackupStrategyBody.period)
            && Objects.equals(this.prefix, createClusterBackupStrategyBody.prefix)
            && Objects.equals(this.keepday, createClusterBackupStrategyBody.keepday)
            && Objects.equals(this.bucket, createClusterBackupStrategyBody.bucket)
            && Objects.equals(this.basePath, createClusterBackupStrategyBody.basePath)
            && Objects.equals(this.agency, createClusterBackupStrategyBody.agency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(period, prefix, keepday, bucket, basePath, agency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterBackupStrategyBody {\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    keepday: ").append(toIndentedString(keepday)).append("\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    basePath: ").append(toIndentedString(basePath)).append("\n");
        sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
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
