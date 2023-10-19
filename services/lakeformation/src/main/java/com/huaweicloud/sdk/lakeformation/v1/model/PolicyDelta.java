package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * PolicyDelta
 */
public class PolicyDelta {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private Policy policy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_type")

    private Integer changeType;

    public PolicyDelta withPolicy(Policy policy) {
        this.policy = policy;
        return this;
    }

    public PolicyDelta withPolicy(Consumer<Policy> policySetter) {
        if (this.policy == null) {
            this.policy = new Policy();
            policySetter.accept(this.policy);
        }

        return this;
    }

    /**
     * Get policy
     * @return policy
     */
    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public PolicyDelta withChangeType(Integer changeType) {
        this.changeType = changeType;
        return this;
    }

    /**
     * 变更类型
     * minimum: 0
     * maximum: 2147483647
     * @return changeType
     */
    public Integer getChangeType() {
        return changeType;
    }

    public void setChangeType(Integer changeType) {
        this.changeType = changeType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicyDelta that = (PolicyDelta) obj;
        return Objects.equals(this.policy, that.policy) && Objects.equals(this.changeType, that.changeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policy, changeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyDelta {\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
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
