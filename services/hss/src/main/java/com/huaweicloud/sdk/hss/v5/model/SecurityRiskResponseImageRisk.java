package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 镜像风险 
 */
public class SecurityRiskResponseImageRisk {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deduct_score")

    private Float deductScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "un_scanned_image_num")

    private Integer unScannedImageNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_list")

    private List<SecurityRiskResponseImageRiskRiskList> riskList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_risk_num")

    private Integer totalRiskNum;

    public SecurityRiskResponseImageRisk withDeductScore(Float deductScore) {
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

    public SecurityRiskResponseImageRisk withUnScannedImageNum(Integer unScannedImageNum) {
        this.unScannedImageNum = unScannedImageNum;
        return this;
    }

    /**
     * **参数解释**： 未扫描镜像数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return unScannedImageNum
     */
    public Integer getUnScannedImageNum() {
        return unScannedImageNum;
    }

    public void setUnScannedImageNum(Integer unScannedImageNum) {
        this.unScannedImageNum = unScannedImageNum;
    }

    public SecurityRiskResponseImageRisk withRiskList(List<SecurityRiskResponseImageRiskRiskList> riskList) {
        this.riskList = riskList;
        return this;
    }

    public SecurityRiskResponseImageRisk addRiskListItem(SecurityRiskResponseImageRiskRiskList riskListItem) {
        if (this.riskList == null) {
            this.riskList = new ArrayList<>();
        }
        this.riskList.add(riskListItem);
        return this;
    }

    public SecurityRiskResponseImageRisk withRiskList(
        Consumer<List<SecurityRiskResponseImageRiskRiskList>> riskListSetter) {
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
    public List<SecurityRiskResponseImageRiskRiskList> getRiskList() {
        return riskList;
    }

    public void setRiskList(List<SecurityRiskResponseImageRiskRiskList> riskList) {
        this.riskList = riskList;
    }

    public SecurityRiskResponseImageRisk withTotalRiskNum(Integer totalRiskNum) {
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
        SecurityRiskResponseImageRisk that = (SecurityRiskResponseImageRisk) obj;
        return Objects.equals(this.deductScore, that.deductScore)
            && Objects.equals(this.unScannedImageNum, that.unScannedImageNum)
            && Objects.equals(this.riskList, that.riskList) && Objects.equals(this.totalRiskNum, that.totalRiskNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deductScore, unScannedImageNum, riskList, totalRiskNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityRiskResponseImageRisk {\n");
        sb.append("    deductScore: ").append(toIndentedString(deductScore)).append("\n");
        sb.append("    unScannedImageNum: ").append(toIndentedString(unScannedImageNum)).append("\n");
        sb.append("    riskList: ").append(toIndentedString(riskList)).append("\n");
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
