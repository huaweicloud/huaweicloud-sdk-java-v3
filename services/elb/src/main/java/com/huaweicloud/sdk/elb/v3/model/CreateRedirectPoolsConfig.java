package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 转发的后端主机组的配置。
 */
public class CreateRedirectPoolsConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    public CreateRedirectPoolsConfig withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * 后端主机组的ID。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public CreateRedirectPoolsConfig withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * 后端主机组的权重。  取值：0-100。
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRedirectPoolsConfig createRedirectPoolsConfig = (CreateRedirectPoolsConfig) o;
        return Objects.equals(this.poolId, createRedirectPoolsConfig.poolId)
            && Objects.equals(this.weight, createRedirectPoolsConfig.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poolId, weight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRedirectPoolsConfig {\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
