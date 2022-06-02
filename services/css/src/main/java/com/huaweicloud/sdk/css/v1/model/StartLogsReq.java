package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StartLogsReq
 */
public class StartLogsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency")

    private String agency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logBasePath")

    private String logBasePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logBucket")

    private String logBucket;

    public StartLogsReq withAgency(String agency) {
        this.agency = agency;
        return this;
    }

    /**
     * IAM委托。
     * @return agency
     */
    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public StartLogsReq withLogBasePath(String logBasePath) {
        this.logBasePath = logBasePath;
        return this;
    }

    /**
     * 备份路径。
     * @return logBasePath
     */
    public String getLogBasePath() {
        return logBasePath;
    }

    public void setLogBasePath(String logBasePath) {
        this.logBasePath = logBasePath;
    }

    public StartLogsReq withLogBucket(String logBucket) {
        this.logBucket = logBucket;
        return this;
    }

    /**
     * OBS桶。
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
        StartLogsReq startLogsReq = (StartLogsReq) o;
        return Objects.equals(this.agency, startLogsReq.agency)
            && Objects.equals(this.logBasePath, startLogsReq.logBasePath)
            && Objects.equals(this.logBucket, startLogsReq.logBucket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agency, logBasePath, logBucket);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartLogsReq {\n");
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