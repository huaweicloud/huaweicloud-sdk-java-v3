package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ListScaleOutPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private List<ScaleOutPolicyRsp> policies = null;

    public ListScaleOutPolicyResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListScaleOutPolicyResponse withPolicies(List<ScaleOutPolicyRsp> policies) {
        this.policies = policies;
        return this;
    }

    public ListScaleOutPolicyResponse addPoliciesItem(ScaleOutPolicyRsp policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public ListScaleOutPolicyResponse withPolicies(Consumer<List<ScaleOutPolicyRsp>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * 扩容策略列表
     * @return policies
     */
    public List<ScaleOutPolicyRsp> getPolicies() {
        return policies;
    }

    public void setPolicies(List<ScaleOutPolicyRsp> policies) {
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
        ListScaleOutPolicyResponse that = (ListScaleOutPolicyResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.policies, that.policies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, policies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScaleOutPolicyResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
