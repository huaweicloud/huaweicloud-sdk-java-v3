package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 规则总结详情
 */
public class PolicyComplianceSummaryUnit {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliant_count")

    private Integer compliantCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "non_compliant_count")

    private Integer nonCompliantCount;

    public PolicyComplianceSummaryUnit withCompliantCount(Integer compliantCount) {
        this.compliantCount = compliantCount;
        return this;
    }

    /**
     * 合规数量
     * @return compliantCount
     */
    public Integer getCompliantCount() {
        return compliantCount;
    }

    public void setCompliantCount(Integer compliantCount) {
        this.compliantCount = compliantCount;
    }

    public PolicyComplianceSummaryUnit withNonCompliantCount(Integer nonCompliantCount) {
        this.nonCompliantCount = nonCompliantCount;
        return this;
    }

    /**
     * 不合规数量
     * @return nonCompliantCount
     */
    public Integer getNonCompliantCount() {
        return nonCompliantCount;
    }

    public void setNonCompliantCount(Integer nonCompliantCount) {
        this.nonCompliantCount = nonCompliantCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicyComplianceSummaryUnit that = (PolicyComplianceSummaryUnit) obj;
        return Objects.equals(this.compliantCount, that.compliantCount)
            && Objects.equals(this.nonCompliantCount, that.nonCompliantCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compliantCount, nonCompliantCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyComplianceSummaryUnit {\n");
        sb.append("    compliantCount: ").append(toIndentedString(compliantCount)).append("\n");
        sb.append("    nonCompliantCount: ").append(toIndentedString(nonCompliantCount)).append("\n");
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
