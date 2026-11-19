package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowTrialsStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trial_num")

    private Integer trialNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unprotected_num")

    private Integer unprotectedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset")

    private Integer asset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vulnerability")

    private Integer vulnerability;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intrusion")

    private Integer intrusion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline")

    private Integer baseline;

    public ShowTrialsStatisticsResponse withTrialNum(Integer trialNum) {
        this.trialNum = trialNum;
        return this;
    }

    /**
     * **参数解释**: 试用主机数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return trialNum
     */
    public Integer getTrialNum() {
        return trialNum;
    }

    public void setTrialNum(Integer trialNum) {
        this.trialNum = trialNum;
    }

    public ShowTrialsStatisticsResponse withUnprotectedNum(Integer unprotectedNum) {
        this.unprotectedNum = unprotectedNum;
        return this;
    }

    /**
     * **参数解释**: 未防护数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return unprotectedNum
     */
    public Integer getUnprotectedNum() {
        return unprotectedNum;
    }

    public void setUnprotectedNum(Integer unprotectedNum) {
        this.unprotectedNum = unprotectedNum;
    }

    public ShowTrialsStatisticsResponse withAsset(Integer asset) {
        this.asset = asset;
        return this;
    }

    /**
     * **参数解释**: 资产风险个数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return asset
     */
    public Integer getAsset() {
        return asset;
    }

    public void setAsset(Integer asset) {
        this.asset = asset;
    }

    public ShowTrialsStatisticsResponse withVulnerability(Integer vulnerability) {
        this.vulnerability = vulnerability;
        return this;
    }

    /**
     * **参数解释**: 漏洞风险个数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return vulnerability
     */
    public Integer getVulnerability() {
        return vulnerability;
    }

    public void setVulnerability(Integer vulnerability) {
        this.vulnerability = vulnerability;
    }

    public ShowTrialsStatisticsResponse withIntrusion(Integer intrusion) {
        this.intrusion = intrusion;
        return this;
    }

    /**
     * **参数解释**: 入侵事件个数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return intrusion
     */
    public Integer getIntrusion() {
        return intrusion;
    }

    public void setIntrusion(Integer intrusion) {
        this.intrusion = intrusion;
    }

    public ShowTrialsStatisticsResponse withBaseline(Integer baseline) {
        this.baseline = baseline;
        return this;
    }

    /**
     * **参数解释**: 基线检测风险个数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return baseline
     */
    public Integer getBaseline() {
        return baseline;
    }

    public void setBaseline(Integer baseline) {
        this.baseline = baseline;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTrialsStatisticsResponse that = (ShowTrialsStatisticsResponse) obj;
        return Objects.equals(this.trialNum, that.trialNum) && Objects.equals(this.unprotectedNum, that.unprotectedNum)
            && Objects.equals(this.asset, that.asset) && Objects.equals(this.vulnerability, that.vulnerability)
            && Objects.equals(this.intrusion, that.intrusion) && Objects.equals(this.baseline, that.baseline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trialNum, unprotectedNum, asset, vulnerability, intrusion, baseline);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTrialsStatisticsResponse {\n");
        sb.append("    trialNum: ").append(toIndentedString(trialNum)).append("\n");
        sb.append("    unprotectedNum: ").append(toIndentedString(unprotectedNum)).append("\n");
        sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
        sb.append("    vulnerability: ").append(toIndentedString(vulnerability)).append("\n");
        sb.append("    intrusion: ").append(toIndentedString(intrusion)).append("\n");
        sb.append("    baseline: ").append(toIndentedString(baseline)).append("\n");
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
