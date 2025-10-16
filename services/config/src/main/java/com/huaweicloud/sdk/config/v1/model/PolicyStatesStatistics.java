package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 合规统计结果
 */
public class PolicyStatesStatistics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_resource_count")

    private Integer totalResourceCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "non_compliant_resource_count")

    private Integer nonCompliantResourceCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_policy_count")

    private Integer totalPolicyCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "non_compliant_policy_count")

    private Integer nonCompliantPolicyCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistic_date")

    private String statisticDate;

    public PolicyStatesStatistics withTotalResourceCount(Integer totalResourceCount) {
        this.totalResourceCount = totalResourceCount;
        return this;
    }

    /**
     * 资源总数
     * @return totalResourceCount
     */
    public Integer getTotalResourceCount() {
        return totalResourceCount;
    }

    public void setTotalResourceCount(Integer totalResourceCount) {
        this.totalResourceCount = totalResourceCount;
    }

    public PolicyStatesStatistics withNonCompliantResourceCount(Integer nonCompliantResourceCount) {
        this.nonCompliantResourceCount = nonCompliantResourceCount;
        return this;
    }

    /**
     * 不合规资源数量
     * @return nonCompliantResourceCount
     */
    public Integer getNonCompliantResourceCount() {
        return nonCompliantResourceCount;
    }

    public void setNonCompliantResourceCount(Integer nonCompliantResourceCount) {
        this.nonCompliantResourceCount = nonCompliantResourceCount;
    }

    public PolicyStatesStatistics withTotalPolicyCount(Integer totalPolicyCount) {
        this.totalPolicyCount = totalPolicyCount;
        return this;
    }

    /**
     * 合规规则总数
     * @return totalPolicyCount
     */
    public Integer getTotalPolicyCount() {
        return totalPolicyCount;
    }

    public void setTotalPolicyCount(Integer totalPolicyCount) {
        this.totalPolicyCount = totalPolicyCount;
    }

    public PolicyStatesStatistics withNonCompliantPolicyCount(Integer nonCompliantPolicyCount) {
        this.nonCompliantPolicyCount = nonCompliantPolicyCount;
        return this;
    }

    /**
     * 不合规规则数量
     * @return nonCompliantPolicyCount
     */
    public Integer getNonCompliantPolicyCount() {
        return nonCompliantPolicyCount;
    }

    public void setNonCompliantPolicyCount(Integer nonCompliantPolicyCount) {
        this.nonCompliantPolicyCount = nonCompliantPolicyCount;
    }

    public PolicyStatesStatistics withStatisticDate(String statisticDate) {
        this.statisticDate = statisticDate;
        return this;
    }

    /**
     * 统计日期
     * @return statisticDate
     */
    public String getStatisticDate() {
        return statisticDate;
    }

    public void setStatisticDate(String statisticDate) {
        this.statisticDate = statisticDate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicyStatesStatistics that = (PolicyStatesStatistics) obj;
        return Objects.equals(this.totalResourceCount, that.totalResourceCount)
            && Objects.equals(this.nonCompliantResourceCount, that.nonCompliantResourceCount)
            && Objects.equals(this.totalPolicyCount, that.totalPolicyCount)
            && Objects.equals(this.nonCompliantPolicyCount, that.nonCompliantPolicyCount)
            && Objects.equals(this.statisticDate, that.statisticDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalResourceCount,
            nonCompliantResourceCount,
            totalPolicyCount,
            nonCompliantPolicyCount,
            statisticDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyStatesStatistics {\n");
        sb.append("    totalResourceCount: ").append(toIndentedString(totalResourceCount)).append("\n");
        sb.append("    nonCompliantResourceCount: ").append(toIndentedString(nonCompliantResourceCount)).append("\n");
        sb.append("    totalPolicyCount: ").append(toIndentedString(totalPolicyCount)).append("\n");
        sb.append("    nonCompliantPolicyCount: ").append(toIndentedString(nonCompliantPolicyCount)).append("\n");
        sb.append("    statisticDate: ").append(toIndentedString(statisticDate)).append("\n");
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
