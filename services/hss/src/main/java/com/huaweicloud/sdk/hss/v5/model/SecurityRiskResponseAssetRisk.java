package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 资产风险 
 */
public class SecurityRiskResponseAssetRisk {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "existed_danger_port_host_num")

    private Integer existedDangerPortHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_list")

    private List<PolicyInfo> policyList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deduct_score")

    private Float deductScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_risk_num")

    private Integer totalRiskNum;

    public SecurityRiskResponseAssetRisk withExistedDangerPortHostNum(Integer existedDangerPortHostNum) {
        this.existedDangerPortHostNum = existedDangerPortHostNum;
        return this;
    }

    /**
     * **参数解释**： 存在危险端口主机数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return existedDangerPortHostNum
     */
    public Integer getExistedDangerPortHostNum() {
        return existedDangerPortHostNum;
    }

    public void setExistedDangerPortHostNum(Integer existedDangerPortHostNum) {
        this.existedDangerPortHostNum = existedDangerPortHostNum;
    }

    public SecurityRiskResponseAssetRisk withPolicyList(List<PolicyInfo> policyList) {
        this.policyList = policyList;
        return this;
    }

    public SecurityRiskResponseAssetRisk addPolicyListItem(PolicyInfo policyListItem) {
        if (this.policyList == null) {
            this.policyList = new ArrayList<>();
        }
        this.policyList.add(policyListItem);
        return this;
    }

    public SecurityRiskResponseAssetRisk withPolicyList(Consumer<List<PolicyInfo>> policyListSetter) {
        if (this.policyList == null) {
            this.policyList = new ArrayList<>();
        }
        policyListSetter.accept(this.policyList);
        return this;
    }

    /**
     * **参数解释**： 策略列表 **取值范围**: 最小值0，最大值32 
     * @return policyList
     */
    public List<PolicyInfo> getPolicyList() {
        return policyList;
    }

    public void setPolicyList(List<PolicyInfo> policyList) {
        this.policyList = policyList;
    }

    public SecurityRiskResponseAssetRisk withDeductScore(Float deductScore) {
        this.deductScore = deductScore;
        return this;
    }

    /**
     * **参数解释**： 扣分 **取值范围**: 最小值0，最大值10 
     * minimum: 0
     * maximum: 1E+1
     * @return deductScore
     */
    public Float getDeductScore() {
        return deductScore;
    }

    public void setDeductScore(Float deductScore) {
        this.deductScore = deductScore;
    }

    public SecurityRiskResponseAssetRisk withTotalRiskNum(Integer totalRiskNum) {
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
        SecurityRiskResponseAssetRisk that = (SecurityRiskResponseAssetRisk) obj;
        return Objects.equals(this.existedDangerPortHostNum, that.existedDangerPortHostNum)
            && Objects.equals(this.policyList, that.policyList) && Objects.equals(this.deductScore, that.deductScore)
            && Objects.equals(this.totalRiskNum, that.totalRiskNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(existedDangerPortHostNum, policyList, deductScore, totalRiskNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityRiskResponseAssetRisk {\n");
        sb.append("    existedDangerPortHostNum: ").append(toIndentedString(existedDangerPortHostNum)).append("\n");
        sb.append("    policyList: ").append(toIndentedString(policyList)).append("\n");
        sb.append("    deductScore: ").append(toIndentedString(deductScore)).append("\n");
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
