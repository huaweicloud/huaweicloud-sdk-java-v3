package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DeployStrategyRollingRelease
 */
public class DeployStrategyRollingRelease {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batches")

    private Integer batches;

    public DeployStrategyRollingRelease withBatches(Integer batches) {
        this.batches = batches;
        return this;
    }

    /**
     * Get batches
     * @return batches
     */
    public Integer getBatches() {
        return batches;
    }

    public void setBatches(Integer batches) {
        this.batches = batches;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeployStrategyRollingRelease that = (DeployStrategyRollingRelease) obj;
        return Objects.equals(this.batches, that.batches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batches);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeployStrategyRollingRelease {\n");
        sb.append("    batches: ").append(toIndentedString(batches)).append("\n");
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
