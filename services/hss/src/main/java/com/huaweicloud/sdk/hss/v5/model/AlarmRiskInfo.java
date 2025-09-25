package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AlarmRiskInfo
 */
public class AlarmRiskInfo {

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
    @JsonProperty(value = "total_risk_num")

    private Integer totalRiskNum;

    public AlarmRiskInfo withRiskList(List<RiskListInfo> riskList) {
        this.riskList = riskList;
        return this;
    }

    public AlarmRiskInfo addRiskListItem(RiskListInfo riskListItem) {
        if (this.riskList == null) {
            this.riskList = new ArrayList<>();
        }
        this.riskList.add(riskListItem);
        return this;
    }

    public AlarmRiskInfo withRiskList(Consumer<List<RiskListInfo>> riskListSetter) {
        if (this.riskList == null) {
            this.riskList = new ArrayList<>();
        }
        riskListSetter.accept(this.riskList);
        return this;
    }

    /**
     * **参数解释**： 风险列表 **取值范围**: 最小值0，最大值4 
     * @return riskList
     */
    public List<RiskListInfo> getRiskList() {
        return riskList;
    }

    public void setRiskList(List<RiskListInfo> riskList) {
        this.riskList = riskList;
    }

    public AlarmRiskInfo withDeductScore(Float deductScore) {
        this.deductScore = deductScore;
        return this;
    }

    /**
     * **参数解释**： 扣分 **取值范围**: 最小值0，最大值30 
     * minimum: 0
     * maximum: 3E+1
     * @return deductScore
     */
    public Float getDeductScore() {
        return deductScore;
    }

    public void setDeductScore(Float deductScore) {
        this.deductScore = deductScore;
    }

    public AlarmRiskInfo withPolicyList(List<PolicyInfo> policyList) {
        this.policyList = policyList;
        return this;
    }

    public AlarmRiskInfo addPolicyListItem(PolicyInfo policyListItem) {
        if (this.policyList == null) {
            this.policyList = new ArrayList<>();
        }
        this.policyList.add(policyListItem);
        return this;
    }

    public AlarmRiskInfo withPolicyList(Consumer<List<PolicyInfo>> policyListSetter) {
        if (this.policyList == null) {
            this.policyList = new ArrayList<>();
        }
        policyListSetter.accept(this.policyList);
        return this;
    }

    /**
     * **参数解释**：  策略信息  **取值范围**:  最小值0，最大值32 
     * @return policyList
     */
    public List<PolicyInfo> getPolicyList() {
        return policyList;
    }

    public void setPolicyList(List<PolicyInfo> policyList) {
        this.policyList = policyList;
    }

    public AlarmRiskInfo withTotalRiskNum(Integer totalRiskNum) {
        this.totalRiskNum = totalRiskNum;
        return this;
    }

    /**
     * **参数解释**： 风险总数 **取值范围**: 最小值0，最大值2147483647 
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
        AlarmRiskInfo that = (AlarmRiskInfo) obj;
        return Objects.equals(this.riskList, that.riskList) && Objects.equals(this.deductScore, that.deductScore)
            && Objects.equals(this.policyList, that.policyList) && Objects.equals(this.totalRiskNum, that.totalRiskNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riskList, deductScore, policyList, totalRiskNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmRiskInfo {\n");
        sb.append("    riskList: ").append(toIndentedString(riskList)).append("\n");
        sb.append("    deductScore: ").append(toIndentedString(deductScore)).append("\n");
        sb.append("    policyList: ").append(toIndentedString(policyList)).append("\n");
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
