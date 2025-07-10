package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 日志基础设置。
 */
public class LoggingBucketBaseline {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_days")

    private Integer retentionDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_multi_az")

    private Boolean enableMultiAz;

    public LoggingBucketBaseline withRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    /**
     * 桶保留天数。
     * minimum: 1
     * maximum: 5475
     * @return retentionDays
     */
    public Integer getRetentionDays() {
        return retentionDays;
    }

    public void setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
    }

    public LoggingBucketBaseline withEnableMultiAz(Boolean enableMultiAz) {
        this.enableMultiAz = enableMultiAz;
        return this;
    }

    /**
     * 是否允许多AZ存储。
     * @return enableMultiAz
     */
    public Boolean getEnableMultiAz() {
        return enableMultiAz;
    }

    public void setEnableMultiAz(Boolean enableMultiAz) {
        this.enableMultiAz = enableMultiAz;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LoggingBucketBaseline that = (LoggingBucketBaseline) obj;
        return Objects.equals(this.retentionDays, that.retentionDays)
            && Objects.equals(this.enableMultiAz, that.enableMultiAz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(retentionDays, enableMultiAz);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoggingBucketBaseline {\n");
        sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
        sb.append("    enableMultiAz: ").append(toIndentedString(enableMultiAz)).append("\n");
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
