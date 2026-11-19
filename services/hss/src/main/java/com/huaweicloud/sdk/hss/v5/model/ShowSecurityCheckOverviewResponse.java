package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowSecurityCheckOverviewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_rating")

    private Integer riskRating;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_time")

    private Long scanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_num")

    private Integer hostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_num")

    private Integer riskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_check_status")

    private Boolean scheduledCheckStatus;

    public ShowSecurityCheckOverviewResponse withRiskRating(Integer riskRating) {
        this.riskRating = riskRating;
        return this;
    }

    /**
     * **参数解释**: 风险评分 **取值范围**: 最小值0，最大值100 
     * minimum: 0
     * maximum: 100
     * @return riskRating
     */
    public Integer getRiskRating() {
        return riskRating;
    }

    public void setRiskRating(Integer riskRating) {
        this.riskRating = riskRating;
    }

    public ShowSecurityCheckOverviewResponse withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释**: 风险级别 **取值范围**: - Security：安全 - Low：低危 - Medium：中危 - High：高危 
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public ShowSecurityCheckOverviewResponse withScanTime(Long scanTime) {
        this.scanTime = scanTime;
        return this;
    }

    /**
     * **参数解释**: 最新检测时间，毫秒级时间戳 **取值范围**: 最小值0，最大值9223372036854775807（UTC时区，从1970-01-01 00:00:00开始计算） 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return scanTime
     */
    public Long getScanTime() {
        return scanTime;
    }

    public void setScanTime(Long scanTime) {
        this.scanTime = scanTime;
    }

    public ShowSecurityCheckOverviewResponse withHostNum(Integer hostNum) {
        this.hostNum = hostNum;
        return this;
    }

    /**
     * **参数解释**: 防护的服务器数量 **取值范围**: 最小值0，最大值2000000 
     * minimum: 0
     * maximum: 2000000
     * @return hostNum
     */
    public Integer getHostNum() {
        return hostNum;
    }

    public void setHostNum(Integer hostNum) {
        this.hostNum = hostNum;
    }

    public ShowSecurityCheckOverviewResponse withRiskNum(Integer riskNum) {
        this.riskNum = riskNum;
        return this;
    }

    /**
     * **参数解释**: 安全风险数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return riskNum
     */
    public Integer getRiskNum() {
        return riskNum;
    }

    public void setRiskNum(Integer riskNum) {
        this.riskNum = riskNum;
    }

    public ShowSecurityCheckOverviewResponse withScheduledCheckStatus(Boolean scheduledCheckStatus) {
        this.scheduledCheckStatus = scheduledCheckStatus;
        return this;
    }

    /**
     * **参数解释**: 定时体检开启状态 **取值范围**: - true：已开启 - false：未开启 
     * @return scheduledCheckStatus
     */
    public Boolean getScheduledCheckStatus() {
        return scheduledCheckStatus;
    }

    public void setScheduledCheckStatus(Boolean scheduledCheckStatus) {
        this.scheduledCheckStatus = scheduledCheckStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSecurityCheckOverviewResponse that = (ShowSecurityCheckOverviewResponse) obj;
        return Objects.equals(this.riskRating, that.riskRating) && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.scanTime, that.scanTime) && Objects.equals(this.hostNum, that.hostNum)
            && Objects.equals(this.riskNum, that.riskNum)
            && Objects.equals(this.scheduledCheckStatus, that.scheduledCheckStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riskRating, severity, scanTime, hostNum, riskNum, scheduledCheckStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSecurityCheckOverviewResponse {\n");
        sb.append("    riskRating: ").append(toIndentedString(riskRating)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
        sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
        sb.append("    riskNum: ").append(toIndentedString(riskNum)).append("\n");
        sb.append("    scheduledCheckStatus: ").append(toIndentedString(scheduledCheckStatus)).append("\n");
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
