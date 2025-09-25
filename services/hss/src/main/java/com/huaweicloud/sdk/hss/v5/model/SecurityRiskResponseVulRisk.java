package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 漏洞风险 
 */
public class SecurityRiskResponseVulRisk {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_list")

    private List<RiskListInfo> riskList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deduct_score")

    private Float deductScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "un_scanned_host_num")

    private Integer unScannedHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_risk_num")

    private Integer totalRiskNum;

    public SecurityRiskResponseVulRisk withRiskList(List<RiskListInfo> riskList) {
        this.riskList = riskList;
        return this;
    }

    public SecurityRiskResponseVulRisk addRiskListItem(RiskListInfo riskListItem) {
        if (this.riskList == null) {
            this.riskList = new ArrayList<>();
        }
        this.riskList.add(riskListItem);
        return this;
    }

    public SecurityRiskResponseVulRisk withRiskList(Consumer<List<RiskListInfo>> riskListSetter) {
        if (this.riskList == null) {
            this.riskList = new ArrayList<>();
        }
        riskListSetter.accept(this.riskList);
        return this;
    }

    /**
     * **参数解释**： 漏洞风险列表 **取值范围**: 最小值0，最大值4 
     * @return riskList
     */
    public List<RiskListInfo> getRiskList() {
        return riskList;
    }

    public void setRiskList(List<RiskListInfo> riskList) {
        this.riskList = riskList;
    }

    public SecurityRiskResponseVulRisk withDeductScore(Float deductScore) {
        this.deductScore = deductScore;
        return this;
    }

    /**
     * **参数解释**： 扣分 **取值范围**: 最小值0，最大值20 
     * minimum: 0
     * maximum: 2E+1
     * @return deductScore
     */
    public Float getDeductScore() {
        return deductScore;
    }

    public void setDeductScore(Float deductScore) {
        this.deductScore = deductScore;
    }

    public SecurityRiskResponseVulRisk withUnScannedHostNum(Integer unScannedHostNum) {
        this.unScannedHostNum = unScannedHostNum;
        return this;
    }

    /**
     * **参数解释**： 未进行漏洞扫描主机数(一个月内) **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return unScannedHostNum
     */
    public Integer getUnScannedHostNum() {
        return unScannedHostNum;
    }

    public void setUnScannedHostNum(Integer unScannedHostNum) {
        this.unScannedHostNum = unScannedHostNum;
    }

    public SecurityRiskResponseVulRisk withTotalRiskNum(Integer totalRiskNum) {
        this.totalRiskNum = totalRiskNum;
        return this;
    }

    /**
     * **参数解释**： 风险总数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return totalRiskNum
     */
    public Integer getTotalRiskNum() {
        return totalRiskNum;
    }

    public void setTotalRiskNum(Integer totalRiskNum) {
        this.totalRiskNum = totalRiskNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityRiskResponseVulRisk that = (SecurityRiskResponseVulRisk) obj;
        return Objects.equals(this.riskList, that.riskList) && Objects.equals(this.deductScore, that.deductScore)
            && Objects.equals(this.unScannedHostNum, that.unScannedHostNum)
            && Objects.equals(this.totalRiskNum, that.totalRiskNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riskList, deductScore, unScannedHostNum, totalRiskNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityRiskResponseVulRisk {\n");
        sb.append("    riskList: ").append(toIndentedString(riskList)).append("\n");
        sb.append("    deductScore: ").append(toIndentedString(deductScore)).append("\n");
        sb.append("    unScannedHostNum: ").append(toIndentedString(unScannedHostNum)).append("\n");
        sb.append("    totalRiskNum: ").append(toIndentedString(totalRiskNum)).append("\n");
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
