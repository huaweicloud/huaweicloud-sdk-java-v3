package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ServerlessInfo
 */
public class ServerlessInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_cap")

    private String minCap;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_cap")

    private String maxCap;

    public ServerlessInfo withMinCap(String minCap) {
        this.minCap = minCap;
        return this;
    }

    /**
     * Serverless型实例的最小算力，单位RCU，范围0.5~8，步进0.5。
     * @return minCap
     */
    public String getMinCap() {
        return minCap;
    }

    public void setMinCap(String minCap) {
        this.minCap = minCap;
    }

    public ServerlessInfo withMaxCap(String maxCap) {
        this.maxCap = maxCap;
        return this;
    }

    /**
     * Serverless型实例的最大算力，单位RCU，范围0.5~8，步进0.5。
     * @return maxCap
     */
    public String getMaxCap() {
        return maxCap;
    }

    public void setMaxCap(String maxCap) {
        this.maxCap = maxCap;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerlessInfo that = (ServerlessInfo) obj;
        return Objects.equals(this.minCap, that.minCap) && Objects.equals(this.maxCap, that.maxCap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minCap, maxCap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerlessInfo {\n");
        sb.append("    minCap: ").append(toIndentedString(minCap)).append("\n");
        sb.append("    maxCap: ").append(toIndentedString(maxCap)).append("\n");
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
