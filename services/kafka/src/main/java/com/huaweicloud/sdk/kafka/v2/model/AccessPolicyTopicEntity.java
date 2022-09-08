package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 权限实体。
 */
public class AccessPolicyTopicEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private List<AccessPolicyEntity> policies = null;

    public AccessPolicyTopicEntity withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * topic名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccessPolicyTopicEntity withPolicies(List<AccessPolicyEntity> policies) {
        this.policies = policies;
        return this;
    }

    public AccessPolicyTopicEntity addPoliciesItem(AccessPolicyEntity policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public AccessPolicyTopicEntity withPolicies(Consumer<List<AccessPolicyEntity>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * 权限列表。
     * @return policies
     */
    public List<AccessPolicyEntity> getPolicies() {
        return policies;
    }

    public void setPolicies(List<AccessPolicyEntity> policies) {
        this.policies = policies;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccessPolicyTopicEntity accessPolicyTopicEntity = (AccessPolicyTopicEntity) o;
        return Objects.equals(this.name, accessPolicyTopicEntity.name)
            && Objects.equals(this.policies, accessPolicyTopicEntity.policies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, policies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessPolicyTopicEntity {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
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
