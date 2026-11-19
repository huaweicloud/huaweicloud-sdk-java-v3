package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowHoneypotEventStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risky_host_num")

    private Integer riskyHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_host_num")

    private Integer protectionHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "critical_risky_num")

    private Integer criticalRiskyNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "high_risky_num")

    private Integer highRiskyNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "medium_risky_num")

    private Integer mediumRiskyNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "low_risky_num")

    private Integer lowRiskyNum;

    public ShowHoneypotEventStatisticsResponse withRiskyHostNum(Integer riskyHostNum) {
        this.riskyHostNum = riskyHostNum;
        return this;
    }

    /**
     * **参数解释**： 存在风险的服务器数量 **取值范围**： 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return riskyHostNum
     */
    public Integer getRiskyHostNum() {
        return riskyHostNum;
    }

    public void setRiskyHostNum(Integer riskyHostNum) {
        this.riskyHostNum = riskyHostNum;
    }

    public ShowHoneypotEventStatisticsResponse withProtectionHostNum(Integer protectionHostNum) {
        this.protectionHostNum = protectionHostNum;
        return this;
    }

    /**
     * **参数解释**： 防护服务器数量 **取值范围**： 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return protectionHostNum
     */
    public Integer getProtectionHostNum() {
        return protectionHostNum;
    }

    public void setProtectionHostNum(Integer protectionHostNum) {
        this.protectionHostNum = protectionHostNum;
    }

    public ShowHoneypotEventStatisticsResponse withCriticalRiskyNum(Integer criticalRiskyNum) {
        this.criticalRiskyNum = criticalRiskyNum;
        return this;
    }

    /**
     * **参数解释**： 致命风险数量 **取值范围**： 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return criticalRiskyNum
     */
    public Integer getCriticalRiskyNum() {
        return criticalRiskyNum;
    }

    public void setCriticalRiskyNum(Integer criticalRiskyNum) {
        this.criticalRiskyNum = criticalRiskyNum;
    }

    public ShowHoneypotEventStatisticsResponse withHighRiskyNum(Integer highRiskyNum) {
        this.highRiskyNum = highRiskyNum;
        return this;
    }

    /**
     * **参数解释**： 高危风险数量 **取值范围**： 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return highRiskyNum
     */
    public Integer getHighRiskyNum() {
        return highRiskyNum;
    }

    public void setHighRiskyNum(Integer highRiskyNum) {
        this.highRiskyNum = highRiskyNum;
    }

    public ShowHoneypotEventStatisticsResponse withMediumRiskyNum(Integer mediumRiskyNum) {
        this.mediumRiskyNum = mediumRiskyNum;
        return this;
    }

    /**
     * **参数解释**： 中危风险数量 **取值范围**： 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return mediumRiskyNum
     */
    public Integer getMediumRiskyNum() {
        return mediumRiskyNum;
    }

    public void setMediumRiskyNum(Integer mediumRiskyNum) {
        this.mediumRiskyNum = mediumRiskyNum;
    }

    public ShowHoneypotEventStatisticsResponse withLowRiskyNum(Integer lowRiskyNum) {
        this.lowRiskyNum = lowRiskyNum;
        return this;
    }

    /**
     * **参数解释**： 低危风险数量 **取值范围**： 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return lowRiskyNum
     */
    public Integer getLowRiskyNum() {
        return lowRiskyNum;
    }

    public void setLowRiskyNum(Integer lowRiskyNum) {
        this.lowRiskyNum = lowRiskyNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowHoneypotEventStatisticsResponse that = (ShowHoneypotEventStatisticsResponse) obj;
        return Objects.equals(this.riskyHostNum, that.riskyHostNum)
            && Objects.equals(this.protectionHostNum, that.protectionHostNum)
            && Objects.equals(this.criticalRiskyNum, that.criticalRiskyNum)
            && Objects.equals(this.highRiskyNum, that.highRiskyNum)
            && Objects.equals(this.mediumRiskyNum, that.mediumRiskyNum)
            && Objects.equals(this.lowRiskyNum, that.lowRiskyNum);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(riskyHostNum, protectionHostNum, criticalRiskyNum, highRiskyNum, mediumRiskyNum, lowRiskyNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHoneypotEventStatisticsResponse {\n");
        sb.append("    riskyHostNum: ").append(toIndentedString(riskyHostNum)).append("\n");
        sb.append("    protectionHostNum: ").append(toIndentedString(protectionHostNum)).append("\n");
        sb.append("    criticalRiskyNum: ").append(toIndentedString(criticalRiskyNum)).append("\n");
        sb.append("    highRiskyNum: ").append(toIndentedString(highRiskyNum)).append("\n");
        sb.append("    mediumRiskyNum: ").append(toIndentedString(mediumRiskyNum)).append("\n");
        sb.append("    lowRiskyNum: ").append(toIndentedString(lowRiskyNum)).append("\n");
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
