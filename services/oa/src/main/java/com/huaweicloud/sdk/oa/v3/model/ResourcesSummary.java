package com.huaweicloud.sdk.oa.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResourcesSummary
 */
public class ResourcesSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_resource_count")

    private Integer riskResourceCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checked_resource_count")

    private Integer checkedResourceCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignored_resources_count")

    private Integer ignoredResourcesCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suppressed_resource_count")

    private Integer suppressedResourceCount;

    public ResourcesSummary withRiskResourceCount(Integer riskResourceCount) {
        this.riskResourceCount = riskResourceCount;
        return this;
    }

    /**
     * 风险资源数
     * minimum: 0
     * maximum: 999999
     * @return riskResourceCount
     */
    public Integer getRiskResourceCount() {
        return riskResourceCount;
    }

    public void setRiskResourceCount(Integer riskResourceCount) {
        this.riskResourceCount = riskResourceCount;
    }

    public ResourcesSummary withCheckedResourceCount(Integer checkedResourceCount) {
        this.checkedResourceCount = checkedResourceCount;
        return this;
    }

    /**
     * 检查资源数
     * minimum: 0
     * maximum: 999999
     * @return checkedResourceCount
     */
    public Integer getCheckedResourceCount() {
        return checkedResourceCount;
    }

    public void setCheckedResourceCount(Integer checkedResourceCount) {
        this.checkedResourceCount = checkedResourceCount;
    }

    public ResourcesSummary withIgnoredResourcesCount(Integer ignoredResourcesCount) {
        this.ignoredResourcesCount = ignoredResourcesCount;
        return this;
    }

    /**
     * 信息不可用被忽略资源数
     * minimum: 0
     * maximum: 999999
     * @return ignoredResourcesCount
     */
    public Integer getIgnoredResourcesCount() {
        return ignoredResourcesCount;
    }

    public void setIgnoredResourcesCount(Integer ignoredResourcesCount) {
        this.ignoredResourcesCount = ignoredResourcesCount;
    }

    public ResourcesSummary withSuppressedResourceCount(Integer suppressedResourceCount) {
        this.suppressedResourceCount = suppressedResourceCount;
        return this;
    }

    /**
     * 无需检查资源数
     * minimum: 0
     * maximum: 999999
     * @return suppressedResourceCount
     */
    public Integer getSuppressedResourceCount() {
        return suppressedResourceCount;
    }

    public void setSuppressedResourceCount(Integer suppressedResourceCount) {
        this.suppressedResourceCount = suppressedResourceCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourcesSummary that = (ResourcesSummary) obj;
        return Objects.equals(this.riskResourceCount, that.riskResourceCount)
            && Objects.equals(this.checkedResourceCount, that.checkedResourceCount)
            && Objects.equals(this.ignoredResourcesCount, that.ignoredResourcesCount)
            && Objects.equals(this.suppressedResourceCount, that.suppressedResourceCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riskResourceCount, checkedResourceCount, ignoredResourcesCount, suppressedResourceCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourcesSummary {\n");
        sb.append("    riskResourceCount: ").append(toIndentedString(riskResourceCount)).append("\n");
        sb.append("    checkedResourceCount: ").append(toIndentedString(checkedResourceCount)).append("\n");
        sb.append("    ignoredResourcesCount: ").append(toIndentedString(ignoredResourcesCount)).append("\n");
        sb.append("    suppressedResourceCount: ").append(toIndentedString(suppressedResourceCount)).append("\n");
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
