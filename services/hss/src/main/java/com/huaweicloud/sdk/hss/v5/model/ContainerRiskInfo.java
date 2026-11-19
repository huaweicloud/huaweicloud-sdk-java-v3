package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ContainerRiskInfo
 */
public class ContainerRiskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_risk_num")

    private Integer baselineRiskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_total_num")

    private Integer vulTotalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "critical_vul_num")

    private Integer criticalVulNum;

    public ContainerRiskInfo withBaselineRiskNum(Integer baselineRiskNum) {
        this.baselineRiskNum = baselineRiskNum;
        return this;
    }

    /**
     * **参数解释**: 基线风险数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return baselineRiskNum
     */
    public Integer getBaselineRiskNum() {
        return baselineRiskNum;
    }

    public void setBaselineRiskNum(Integer baselineRiskNum) {
        this.baselineRiskNum = baselineRiskNum;
    }

    public ContainerRiskInfo withVulTotalNum(Integer vulTotalNum) {
        this.vulTotalNum = vulTotalNum;
        return this;
    }

    /**
     * **参数解释**: 漏洞总数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return vulTotalNum
     */
    public Integer getVulTotalNum() {
        return vulTotalNum;
    }

    public void setVulTotalNum(Integer vulTotalNum) {
        this.vulTotalNum = vulTotalNum;
    }

    public ContainerRiskInfo withCriticalVulNum(Integer criticalVulNum) {
        this.criticalVulNum = criticalVulNum;
        return this;
    }

    /**
     * **参数解释**: 紧急漏洞数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return criticalVulNum
     */
    public Integer getCriticalVulNum() {
        return criticalVulNum;
    }

    public void setCriticalVulNum(Integer criticalVulNum) {
        this.criticalVulNum = criticalVulNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContainerRiskInfo that = (ContainerRiskInfo) obj;
        return Objects.equals(this.baselineRiskNum, that.baselineRiskNum)
            && Objects.equals(this.vulTotalNum, that.vulTotalNum)
            && Objects.equals(this.criticalVulNum, that.criticalVulNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baselineRiskNum, vulTotalNum, criticalVulNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerRiskInfo {\n");
        sb.append("    baselineRiskNum: ").append(toIndentedString(baselineRiskNum)).append("\n");
        sb.append("    vulTotalNum: ").append(toIndentedString(vulTotalNum)).append("\n");
        sb.append("    criticalVulNum: ").append(toIndentedString(criticalVulNum)).append("\n");
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
