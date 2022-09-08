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
    @JsonProperty(value = "logBasePath")

    private String logBasePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logBucket")

    private String logBucket;

    public UpdateLogSettingReq withAgency(String agency) {
        this.agency = agency;
        return this;
    }

    /**
     * IAM 委托。
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateLogSettingReq updateLogSettingReq = (UpdateLogSettingReq) o;
        return Objects.equals(this.agency, updateLogSettingReq.agency)
            && Objects.equals(this.logBasePath, updateLogSettingReq.logBasePath)
            && Objects.equals(this.logBucket, updateLogSettingReq.logBucket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agency, logBasePath, logBucket);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLogSettingReq {\n");
        sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
        sb.append("    logBasePath: ").append(toIndentedString(logBasePath)).append("\n");
        sb.append("    logBucket: ").append(toIndentedString(logBucket)).append("\n");
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
