package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IAM信任委托。
 */
public class IAMAgency {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_policy")

    private String trustPolicy;

    public IAMAgency withTrustPolicy(String trustPolicy) {
        this.trustPolicy = trustPolicy;
        return this;
    }

    /**
     * 该策略JSON格式策略文档。
     * @return trustPolicy
     */
    public String getTrustPolicy() {
        return trustPolicy;
    }

    public void setTrustPolicy(String trustPolicy) {
        this.trustPolicy = trustPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IAMAgency that = (IAMAgency) obj;
        return Objects.equals(this.trustPolicy, that.trustPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trustPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IAMAgency {\n");
        sb.append("    trustPolicy: ").append(toIndentedString(trustPolicy)).append("\n");
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
