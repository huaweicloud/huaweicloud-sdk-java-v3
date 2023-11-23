package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowUpgradeDbMajorVersionStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_version")

    private String targetVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_expiration_time")

    private String reportExpirationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private String detail;

    public ShowUpgradeDbMajorVersionStatusResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 实例大版本升级状态 \" running\"：预检查或大版本升级进行中 \" success\"：预检查或大版本升级成功 \" failed\"：预检查或大版本升级失败
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowUpgradeDbMajorVersionStatusResponse withTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }

    /**
     * 目标版本。
     * @return targetVersion
     */
    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    public ShowUpgradeDbMajorVersionStatusResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间，格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如偏移1个小时显示为+0100。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowUpgradeDbMajorVersionStatusResponse withReportExpirationTime(String reportExpirationTime) {
        this.reportExpirationTime = reportExpirationTime;
        return this;
    }

    /**
     * 检查成功时，检查报告到期时间，格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如偏移1个小时显示为+0100。 该字段仅在action为check时返回。
     * @return reportExpirationTime
     */
    public String getReportExpirationTime() {
        return reportExpirationTime;
    }

    public void setReportExpirationTime(String reportExpirationTime) {
        this.reportExpirationTime = reportExpirationTime;
    }

    public ShowUpgradeDbMajorVersionStatusResponse withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * 预检查或升级报告信息。
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowUpgradeDbMajorVersionStatusResponse that = (ShowUpgradeDbMajorVersionStatusResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.targetVersion, that.targetVersion)
            && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.reportExpirationTime, that.reportExpirationTime)
            && Objects.equals(this.detail, that.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, targetVersion, startTime, reportExpirationTime, detail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUpgradeDbMajorVersionStatusResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    reportExpirationTime: ").append(toIndentedString(reportExpirationTime)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
