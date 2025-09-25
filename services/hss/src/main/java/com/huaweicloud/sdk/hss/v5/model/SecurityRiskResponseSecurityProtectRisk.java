package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 安全防护风险 
 */
public class SecurityRiskResponseSecurityProtectRisk {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "un_open_protection_host_num")

    private Integer unOpenProtectionHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deduct_score")

    private Float deductScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_risk_num")

    private Integer totalRiskNum;

    public SecurityRiskResponseSecurityProtectRisk withUnOpenProtectionHostNum(Integer unOpenProtectionHostNum) {
        this.unOpenProtectionHostNum = unOpenProtectionHostNum;
        return this;
    }

    /**
     * **参数解释**： 未开主机安全防护主机数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return unOpenProtectionHostNum
     */
    public Integer getUnOpenProtectionHostNum() {
        return unOpenProtectionHostNum;
    }

    public void setUnOpenProtectionHostNum(Integer unOpenProtectionHostNum) {
        this.unOpenProtectionHostNum = unOpenProtectionHostNum;
    }

    public SecurityRiskResponseSecurityProtectRisk withDeductScore(Float deductScore) {
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

    public SecurityRiskResponseSecurityProtectRisk withTotalRiskNum(Integer totalRiskNum) {
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
        SecurityRiskResponseSecurityProtectRisk that = (SecurityRiskResponseSecurityProtectRisk) obj;
        return Objects.equals(this.unOpenProtectionHostNum, that.unOpenProtectionHostNum)
            && Objects.equals(this.deductScore, that.deductScore)
            && Objects.equals(this.totalRiskNum, that.totalRiskNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unOpenProtectionHostNum, deductScore, totalRiskNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityRiskResponseSecurityProtectRisk {\n");
        sb.append("    unOpenProtectionHostNum: ").append(toIndentedString(unOpenProtectionHostNum)).append("\n");
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
