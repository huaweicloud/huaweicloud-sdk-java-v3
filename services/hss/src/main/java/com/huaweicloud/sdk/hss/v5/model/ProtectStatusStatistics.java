package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 防护状态统计信息
 */
public class ProtectStatusStatistics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_type")

    private String protectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unprotected_num")

    private Integer unprotectedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_num")

    private Integer protectedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_num")

    private Integer riskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clean_num")

    private Integer cleanNum;

    public ProtectStatusStatistics withProtectType(String protectType) {
        this.protectType = protectType;
        return this;
    }

    /**
     * **参数解释**: 防护类型 **取值范围**: - host：主机 - container：容器 - application：应用 - serverless：Serverless 
     * @return protectType
     */
    public String getProtectType() {
        return protectType;
    }

    public void setProtectType(String protectType) {
        this.protectType = protectType;
    }

    public ProtectStatusStatistics withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * **参数解释**: 总数 **取值范围**: 最小值0，最大值2147483647 
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public ProtectStatusStatistics withUnprotectedNum(Integer unprotectedNum) {
        this.unprotectedNum = unprotectedNum;
        return this;
    }

    /**
     * **参数解释**: 未防护数 **取值范围**: 最小值0，最大值2147483647 
     * @return unprotectedNum
     */
    public Integer getUnprotectedNum() {
        return unprotectedNum;
    }

    public void setUnprotectedNum(Integer unprotectedNum) {
        this.unprotectedNum = unprotectedNum;
    }

    public ProtectStatusStatistics withProtectedNum(Integer protectedNum) {
        this.protectedNum = protectedNum;
        return this;
    }

    /**
     * **参数解释**: 已防护数，只在serverless类型返回 **取值范围**: 最小值0，最大值2147483647 
     * @return protectedNum
     */
    public Integer getProtectedNum() {
        return protectedNum;
    }

    public void setProtectedNum(Integer protectedNum) {
        this.protectedNum = protectedNum;
    }

    public ProtectStatusStatistics withRiskNum(Integer riskNum) {
        this.riskNum = riskNum;
        return this;
    }

    /**
     * **参数解释**: 有风险数 **取值范围**: 最小值0，最大值2147483647 
     * @return riskNum
     */
    public Integer getRiskNum() {
        return riskNum;
    }

    public void setRiskNum(Integer riskNum) {
        this.riskNum = riskNum;
    }

    public ProtectStatusStatistics withCleanNum(Integer cleanNum) {
        this.cleanNum = cleanNum;
        return this;
    }

    /**
     * **参数解释**: 无风险数 **取值范围**: 最小值0，最大值2147483647 
     * @return cleanNum
     */
    public Integer getCleanNum() {
        return cleanNum;
    }

    public void setCleanNum(Integer cleanNum) {
        this.cleanNum = cleanNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProtectStatusStatistics that = (ProtectStatusStatistics) obj;
        return Objects.equals(this.protectType, that.protectType) && Objects.equals(this.totalNum, that.totalNum)
            && Objects.equals(this.unprotectedNum, that.unprotectedNum)
            && Objects.equals(this.protectedNum, that.protectedNum) && Objects.equals(this.riskNum, that.riskNum)
            && Objects.equals(this.cleanNum, that.cleanNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectType, totalNum, unprotectedNum, protectedNum, riskNum, cleanNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectStatusStatistics {\n");
        sb.append("    protectType: ").append(toIndentedString(protectType)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    unprotectedNum: ").append(toIndentedString(unprotectedNum)).append("\n");
        sb.append("    protectedNum: ").append(toIndentedString(protectedNum)).append("\n");
        sb.append("    riskNum: ").append(toIndentedString(riskNum)).append("\n");
        sb.append("    cleanNum: ").append(toIndentedString(cleanNum)).append("\n");
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
