package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTopicAccessPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_type")

    private Integer topicType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private List<PolicyEntity> policies = null;

    public ShowTopicAccessPolicyResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Topic名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowTopicAccessPolicyResponse withTopicType(Integer topicType) {
        this.topicType = topicType;
        return this;
    }

    /**
     * **参数解释**： Topic类型。 **取值范围**： - 0：普通Topic。 - 1：系统(内部)Topic。
     * @return topicType
     */
    public Integer getTopicType() {
        return topicType;
    }

    public void setTopicType(Integer topicType) {
        this.topicType = topicType;
    }

    public ShowTopicAccessPolicyResponse withPolicies(List<PolicyEntity> policies) {
        this.policies = policies;
        return this;
    }

    public ShowTopicAccessPolicyResponse addPoliciesItem(PolicyEntity policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public ShowTopicAccessPolicyResponse withPolicies(Consumer<List<PolicyEntity>> policiesSetter) {
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
    public List<PolicyEntity> getPolicies() {
        return policies;
    }

    public void setPolicies(List<PolicyEntity> policies) {
        this.policies = policies;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTopicAccessPolicyResponse that = (ShowTopicAccessPolicyResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.topicType, that.topicType)
            && Objects.equals(this.policies, that.policies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, topicType, policies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTopicAccessPolicyResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    topicType: ").append(toIndentedString(topicType)).append("\n");
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
