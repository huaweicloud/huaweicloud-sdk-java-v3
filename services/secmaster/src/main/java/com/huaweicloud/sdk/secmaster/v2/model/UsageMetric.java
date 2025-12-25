package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 使用量指标
 */
public class UsageMetric {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private String used;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "un_used")

    private String unUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_percentage")

    private Boolean isPercentage;

    public UsageMetric withUsed(String used) {
        this.used = used;
        return this;
    }

    /**
     * 已使用
     * @return used
     */
    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }

    public UsageMetric withUnUsed(String unUsed) {
        this.unUsed = unUsed;
        return this;
    }

    /**
     * 未使用
     * @return unUsed
     */
    public String getUnUsed() {
        return unUsed;
    }

    public void setUnUsed(String unUsed) {
        this.unUsed = unUsed;
    }

    public UsageMetric withIsPercentage(Boolean isPercentage) {
        this.isPercentage = isPercentage;
        return this;
    }

    /**
     * 是否百分比
     * @return isPercentage
     */
    public Boolean getIsPercentage() {
        return isPercentage;
    }

    public void setIsPercentage(Boolean isPercentage) {
        this.isPercentage = isPercentage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UsageMetric that = (UsageMetric) obj;
        return Objects.equals(this.used, that.used) && Objects.equals(this.unUsed, that.unUsed)
            && Objects.equals(this.isPercentage, that.isPercentage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(used, unUsed, isPercentage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsageMetric {\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    unUsed: ").append(toIndentedString(unUsed)).append("\n");
        sb.append("    isPercentage: ").append(toIndentedString(isPercentage)).append("\n");
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
