package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 风险数量信息
 */
public class SecurityCheckRiskNumInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_risk_num")

    private Long totalRiskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_status")

    private String compareStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_num")

    private Integer compareNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "high_risk_num")

    private Integer highRiskNum;

    public SecurityCheckRiskNumInfo withTotalRiskNum(Long totalRiskNum) {
        this.totalRiskNum = totalRiskNum;
        return this;
    }

    /**
     * **参数解释**： 风险总数 **取值范围**： 不涉及 
     * @return totalRiskNum
     */
    public Long getTotalRiskNum() {
        return totalRiskNum;
    }

    public void setTotalRiskNum(Long totalRiskNum) {
        this.totalRiskNum = totalRiskNum;
    }

    public SecurityCheckRiskNumInfo withCompareStatus(String compareStatus) {
        this.compareStatus = compareStatus;
        return this;
    }

    /**
     * **参数解释**： 与上一周期比较的状态 **取值范围**： - lower：降低 - increase：增加 - equals：持平 
     * @return compareStatus
     */
    public String getCompareStatus() {
        return compareStatus;
    }

    public void setCompareStatus(String compareStatus) {
        this.compareStatus = compareStatus;
    }

    public SecurityCheckRiskNumInfo withCompareNum(Integer compareNum) {
        this.compareNum = compareNum;
        return this;
    }

    /**
     * **参数解释**： 与上一周期相差的数量的绝对值 **取值范围**： 不涉及 
     * @return compareNum
     */
    public Integer getCompareNum() {
        return compareNum;
    }

    public void setCompareNum(Integer compareNum) {
        this.compareNum = compareNum;
    }

    public SecurityCheckRiskNumInfo withHighRiskNum(Integer highRiskNum) {
        this.highRiskNum = highRiskNum;
        return this;
    }

    /**
     * **参数解释**： 高危风险数量 **取值范围**： 不涉及 
     * @return highRiskNum
     */
    public Integer getHighRiskNum() {
        return highRiskNum;
    }

    public void setHighRiskNum(Integer highRiskNum) {
        this.highRiskNum = highRiskNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityCheckRiskNumInfo that = (SecurityCheckRiskNumInfo) obj;
        return Objects.equals(this.totalRiskNum, that.totalRiskNum)
            && Objects.equals(this.compareStatus, that.compareStatus)
            && Objects.equals(this.compareNum, that.compareNum) && Objects.equals(this.highRiskNum, that.highRiskNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalRiskNum, compareStatus, compareNum, highRiskNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityCheckRiskNumInfo {\n");
        sb.append("    totalRiskNum: ").append(toIndentedString(totalRiskNum)).append("\n");
        sb.append("    compareStatus: ").append(toIndentedString(compareStatus)).append("\n");
        sb.append("    compareNum: ").append(toIndentedString(compareNum)).append("\n");
        sb.append("    highRiskNum: ").append(toIndentedString(highRiskNum)).append("\n");
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
