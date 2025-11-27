package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RollingUpdateNodeUpgradeStrategy
 */
public class RollingUpdateNodeUpgradeStrategy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxUnavailable")

    private Object maxUnavailable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxSurge")

    private Object maxSurge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deletePolicy")

    private String deletePolicy;

    public RollingUpdateNodeUpgradeStrategy withMaxUnavailable(Object maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
        return this;
    }

    /**
     * 最大不可用个数
     * @return maxUnavailable
     */
    public Object getMaxUnavailable() {
        return maxUnavailable;
    }

    public void setMaxUnavailable(Object maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
    }

    public RollingUpdateNodeUpgradeStrategy withMaxSurge(Object maxSurge) {
        this.maxSurge = maxSurge;
        return this;
    }

    /**
     * 允许超出期望的最大个数
     * @return maxSurge
     */
    public Object getMaxSurge() {
        return maxSurge;
    }

    public void setMaxSurge(Object maxSurge) {
        this.maxSurge = maxSurge;
    }

    public RollingUpdateNodeUpgradeStrategy withDeletePolicy(String deletePolicy) {
        this.deletePolicy = deletePolicy;
        return this;
    }

    /**
     * 删除策略：Random、Oldest、Newest
     * @return deletePolicy
     */
    public String getDeletePolicy() {
        return deletePolicy;
    }

    public void setDeletePolicy(String deletePolicy) {
        this.deletePolicy = deletePolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RollingUpdateNodeUpgradeStrategy that = (RollingUpdateNodeUpgradeStrategy) obj;
        return Objects.equals(this.maxUnavailable, that.maxUnavailable) && Objects.equals(this.maxSurge, that.maxSurge)
            && Objects.equals(this.deletePolicy, that.deletePolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxUnavailable, maxSurge, deletePolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RollingUpdateNodeUpgradeStrategy {\n");
        sb.append("    maxUnavailable: ").append(toIndentedString(maxUnavailable)).append("\n");
        sb.append("    maxSurge: ").append(toIndentedString(maxSurge)).append("\n");
        sb.append("    deletePolicy: ").append(toIndentedString(deletePolicy)).append("\n");
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
