package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 基线风险 
 */
public class SecurityRiskResponseBaselineRisk {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_list")

    private List<RiskListInfo> riskList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deduct_score")

    private Float deductScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_list")

    private List<PolicyInfo> policyList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "existed_pwd_host_num")

    private Integer existedPwdHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "un_scanned_baseline_host_num")

    private Integer unScannedBaselineHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_risk_num")

    private Integer totalRiskNum;

    public SecurityRiskResponseBaselineRisk withRiskList(List<RiskListInfo> riskList) {
        this.riskList = riskList;
        return this;
    }

    public SecurityRiskResponseBaselineRisk addRiskListItem(RiskListInfo riskListItem) {
        if (this.riskList == null) {
            this.riskList = new ArrayList<>();
        }
        this.riskList.add(riskListItem);
        return this;
    }

    public SecurityRiskResponseBaselineRisk withRiskList(Consumer<List<RiskListInfo>> riskListSetter) {
        if (this.riskList == null) {
            this.riskList = new ArrayList<>();
        }
        riskListSetter.accept(this.riskList);
        return this;
    }

    /**
     * **参数解释**： 基线风险列表 **取值范围**: 最小值0，最大值4 
     * @return riskList
     */
    public List<RiskListInfo> getRiskList() {
        return riskList;
    }

    public void setRiskList(List<RiskListInfo> riskList) {
        this.riskList = riskList;
    }

    public SecurityRiskResponseBaselineRisk withDeductScore(Float deductScore) {
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

    public SecurityRiskResponseBaselineRisk withPolicyList(List<PolicyInfo> policyList) {
        this.policyList = policyList;
        return this;
    }

    public SecurityRiskResponseBaselineRisk addPolicyListItem(PolicyInfo policyListItem) {
        if (this.policyList == null) {
            this.policyList = new ArrayList<>();
        }
        this.policyList.add(policyListItem);
        return this;
    }

    public SecurityRiskResponseBaselineRisk withPolicyList(Consumer<List<PolicyInfo>> policyListSetter) {
        if (this.policyList == null) {
            this.policyList = new ArrayList<>();
        }
        policyListSetter.accept(this.policyList);
        return this;
    }

    /**
     * **参数解释**： 未开启的策略列表 **取值范围**: 最小值0，最大值32 
     * @return policyList
     */
    public List<PolicyInfo> getPolicyList() {
        return policyList;
    }

    public void setPolicyList(List<PolicyInfo> policyList) {
        this.policyList = policyList;
    }

    public SecurityRiskResponseBaselineRisk withExistedPwdHostNum(Integer existedPwdHostNum) {
        this.existedPwdHostNum = existedPwdHostNum;
        return this;
    }

    /**
     * **参数解释**： 存在弱口令主机数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return existedPwdHostNum
     */
    public Integer getExistedPwdHostNum() {
        return existedPwdHostNum;
    }

    public void setExistedPwdHostNum(Integer existedPwdHostNum) {
        this.existedPwdHostNum = existedPwdHostNum;
    }

    public SecurityRiskResponseBaselineRisk withUnScannedBaselineHostNum(Integer unScannedBaselineHostNum) {
        this.unScannedBaselineHostNum = unScannedBaselineHostNum;
        return this;
    }

    /**
     * **参数解释**： 未进行基线配置检查的主机数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return unScannedBaselineHostNum
     */
    public Integer getUnScannedBaselineHostNum() {
        return unScannedBaselineHostNum;
    }

    public void setUnScannedBaselineHostNum(Integer unScannedBaselineHostNum) {
        this.unScannedBaselineHostNum = unScannedBaselineHostNum;
    }

    public SecurityRiskResponseBaselineRisk withTotalRiskNum(Integer totalRiskNum) {
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
        SecurityRiskResponseBaselineRisk that = (SecurityRiskResponseBaselineRisk) obj;
        return Objects.equals(this.riskList, that.riskList) && Objects.equals(this.deductScore, that.deductScore)
            && Objects.equals(this.policyList, that.policyList)
            && Objects.equals(this.existedPwdHostNum, that.existedPwdHostNum)
            && Objects.equals(this.unScannedBaselineHostNum, that.unScannedBaselineHostNum)
            && Objects.equals(this.totalRiskNum, that.totalRiskNum);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(riskList, deductScore, policyList, existedPwdHostNum, unScannedBaselineHostNum, totalRiskNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityRiskResponseBaselineRisk {\n");
        sb.append("    riskList: ").append(toIndentedString(riskList)).append("\n");
        sb.append("    deductScore: ").append(toIndentedString(deductScore)).append("\n");
        sb.append("    policyList: ").append(toIndentedString(policyList)).append("\n");
        sb.append("    existedPwdHostNum: ").append(toIndentedString(existedPwdHostNum)).append("\n");
        sb.append("    unScannedBaselineHostNum: ").append(toIndentedString(unScannedBaselineHostNum)).append("\n");
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
