package com.huaweicloud.sdk.dataartsfabric.v1.model;

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
public class ListMessageNotificationPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private List<MessageNotificationPolicy> policies = null;

    public ListMessageNotificationPolicyResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 符合条件的消息通知策略总数
     * minimum: 0
     * maximum: 10000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListMessageNotificationPolicyResponse withPolicies(List<MessageNotificationPolicy> policies) {
        this.policies = policies;
        return this;
    }

    public ListMessageNotificationPolicyResponse addPoliciesItem(MessageNotificationPolicy policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public ListMessageNotificationPolicyResponse withPolicies(
        Consumer<List<MessageNotificationPolicy>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * 消息通知策略列表信息
     * @return policies
     */
    public List<MessageNotificationPolicy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<MessageNotificationPolicy> policies) {
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
        ListMessageNotificationPolicyResponse that = (ListMessageNotificationPolicyResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.policies, that.policies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, policies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMessageNotificationPolicyResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
