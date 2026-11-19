package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowSecurityScoreResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_risk_num")

    private Integer securityRiskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_score")

    private Float securityScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_time")

    private Long detectTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_health_check_total_host_num")

    private Integer freeHealthCheckTotalHostNum;

    public ShowSecurityScoreResponse withSecurityRiskNum(Integer securityRiskNum) {
        this.securityRiskNum = securityRiskNum;
        return this;
    }

    /**
     * **参数解释**: 安全风险总数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return securityRiskNum
     */
    public Integer getSecurityRiskNum() {
        return securityRiskNum;
    }

    public void setSecurityRiskNum(Integer securityRiskNum) {
        this.securityRiskNum = securityRiskNum;
    }

    public ShowSecurityScoreResponse withSecurityScore(Float securityScore) {
        this.securityScore = securityScore;
        return this;
    }

    /**
     * **参数解释**: 安全评分 **取值范围**: 最小值0，最大值100 
     * minimum: 0
     * maximum: 1E+2
     * @return securityScore
     */
    public Float getSecurityScore() {
        return securityScore;
    }

    public void setSecurityScore(Float securityScore) {
        this.securityScore = securityScore;
    }

    public ShowSecurityScoreResponse withDetectTime(Long detectTime) {
        this.detectTime = detectTime;
        return this;
    }

    /**
     * **参数解释**: 更新时间，毫秒级时间戳 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return detectTime
     */
    public Long getDetectTime() {
        return detectTime;
    }

    public void setDetectTime(Long detectTime) {
        this.detectTime = detectTime;
    }

    public ShowSecurityScoreResponse withFreeHealthCheckTotalHostNum(Integer freeHealthCheckTotalHostNum) {
        this.freeHealthCheckTotalHostNum = freeHealthCheckTotalHostNum;
        return this;
    }

    /**
     * **参数解释**: 免费体检主机数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return freeHealthCheckTotalHostNum
     */
    public Integer getFreeHealthCheckTotalHostNum() {
        return freeHealthCheckTotalHostNum;
    }

    public void setFreeHealthCheckTotalHostNum(Integer freeHealthCheckTotalHostNum) {
        this.freeHealthCheckTotalHostNum = freeHealthCheckTotalHostNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSecurityScoreResponse that = (ShowSecurityScoreResponse) obj;
        return Objects.equals(this.securityRiskNum, that.securityRiskNum)
            && Objects.equals(this.securityScore, that.securityScore)
            && Objects.equals(this.detectTime, that.detectTime)
            && Objects.equals(this.freeHealthCheckTotalHostNum, that.freeHealthCheckTotalHostNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityRiskNum, securityScore, detectTime, freeHealthCheckTotalHostNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSecurityScoreResponse {\n");
        sb.append("    securityRiskNum: ").append(toIndentedString(securityRiskNum)).append("\n");
        sb.append("    securityScore: ").append(toIndentedString(securityScore)).append("\n");
        sb.append("    detectTime: ").append(toIndentedString(detectTime)).append("\n");
        sb.append("    freeHealthCheckTotalHostNum: ")
            .append(toIndentedString(freeHealthCheckTotalHostNum))
            .append("\n");
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
