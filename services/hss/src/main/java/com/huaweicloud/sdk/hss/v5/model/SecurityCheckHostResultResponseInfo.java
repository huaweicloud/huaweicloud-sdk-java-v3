package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 服务器的安全体检结果信息
 */
public class SecurityCheckHostResultResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_info")

    private SecurityCheckHostInfo hostInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_rating")

    private Integer riskRating;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_num")

    private Integer riskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_time")

    private Long scanTime;

    public SecurityCheckHostResultResponseInfo withHostInfo(SecurityCheckHostInfo hostInfo) {
        this.hostInfo = hostInfo;
        return this;
    }

    public SecurityCheckHostResultResponseInfo withHostInfo(Consumer<SecurityCheckHostInfo> hostInfoSetter) {
        if (this.hostInfo == null) {
            this.hostInfo = new SecurityCheckHostInfo();
            hostInfoSetter.accept(this.hostInfo);
        }

        return this;
    }

    /**
     * Get hostInfo
     * @return hostInfo
     */
    public SecurityCheckHostInfo getHostInfo() {
        return hostInfo;
    }

    public void setHostInfo(SecurityCheckHostInfo hostInfo) {
        this.hostInfo = hostInfo;
    }

    public SecurityCheckHostResultResponseInfo withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释**： 风险级别 **取值范围**： - high：高危 - medium：中危 - low：低危 - safe：安全，无风险 
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public SecurityCheckHostResultResponseInfo withRiskRating(Integer riskRating) {
        this.riskRating = riskRating;
        return this;
    }

    /**
     * **参数解释**： 风险评分 **取值范围**： 不涉及 
     * @return riskRating
     */
    public Integer getRiskRating() {
        return riskRating;
    }

    public void setRiskRating(Integer riskRating) {
        this.riskRating = riskRating;
    }

    public SecurityCheckHostResultResponseInfo withRiskNum(Integer riskNum) {
        this.riskNum = riskNum;
        return this;
    }

    /**
     * **参数解释**： 风险数量 **取值范围**： 不涉及 
     * @return riskNum
     */
    public Integer getRiskNum() {
        return riskNum;
    }

    public void setRiskNum(Integer riskNum) {
        this.riskNum = riskNum;
    }

    public SecurityCheckHostResultResponseInfo withScanTime(Long scanTime) {
        this.scanTime = scanTime;
        return this;
    }

    /**
     * **参数解释**： 最新检测时间 **取值范围**： 不涉及 
     * @return scanTime
     */
    public Long getScanTime() {
        return scanTime;
    }

    public void setScanTime(Long scanTime) {
        this.scanTime = scanTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityCheckHostResultResponseInfo that = (SecurityCheckHostResultResponseInfo) obj;
        return Objects.equals(this.hostInfo, that.hostInfo) && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.riskRating, that.riskRating) && Objects.equals(this.riskNum, that.riskNum)
            && Objects.equals(this.scanTime, that.scanTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostInfo, severity, riskRating, riskNum, scanTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityCheckHostResultResponseInfo {\n");
        sb.append("    hostInfo: ").append(toIndentedString(hostInfo)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    riskRating: ").append(toIndentedString(riskRating)).append("\n");
        sb.append("    riskNum: ").append(toIndentedString(riskNum)).append("\n");
        sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
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
