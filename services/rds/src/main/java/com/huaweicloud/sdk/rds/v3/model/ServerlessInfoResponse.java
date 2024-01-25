package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ServerlessInfoResponse
 */
public class ServerlessInfoResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_compute_unit")

    private String minComputeUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_compute_unit")

    private String maxComputeUnit;

    public ServerlessInfoResponse withMinComputeUnit(String minComputeUnit) {
        this.minComputeUnit = minComputeUnit;
        return this;
    }

    /**
     * Serverless型实例的算力范围最小值。取值范围：0.5 ~ 8，单位：RCU。
     * @return minComputeUnit
     */
    public String getMinComputeUnit() {
        return minComputeUnit;
    }

    public void setMinComputeUnit(String minComputeUnit) {
        this.minComputeUnit = minComputeUnit;
    }

    public ServerlessInfoResponse withMaxComputeUnit(String maxComputeUnit) {
        this.maxComputeUnit = maxComputeUnit;
        return this;
    }

    /**
     * Serverless型实例的算力范围最大值。取值范围：0.5 ~ 8，单位：RCU。
     * @return maxComputeUnit
     */
    public String getMaxComputeUnit() {
        return maxComputeUnit;
    }

    public void setMaxComputeUnit(String maxComputeUnit) {
        this.maxComputeUnit = maxComputeUnit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerlessInfoResponse that = (ServerlessInfoResponse) obj;
        return Objects.equals(this.minComputeUnit, that.minComputeUnit)
            && Objects.equals(this.maxComputeUnit, that.maxComputeUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minComputeUnit, maxComputeUnit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerlessInfoResponse {\n");
        sb.append("    minComputeUnit: ").append(toIndentedString(minComputeUnit)).append("\n");
        sb.append("    maxComputeUnit: ").append(toIndentedString(maxComputeUnit)).append("\n");
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
