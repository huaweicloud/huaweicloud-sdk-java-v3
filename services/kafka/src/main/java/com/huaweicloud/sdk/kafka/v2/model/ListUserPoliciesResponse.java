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
public class ListUserPoliciesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private List<UserPolicyResponeEntity> policies = null;

    public ListUserPoliciesResponse withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**： 用户名。 **取值范围**： 不涉及。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ListUserPoliciesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： 用户权限总数。 **取值范围**： 不涉及。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListUserPoliciesResponse withPolicies(List<UserPolicyResponeEntity> policies) {
        this.policies = policies;
        return this;
    }

    public ListUserPoliciesResponse addPoliciesItem(UserPolicyResponeEntity policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public ListUserPoliciesResponse withPolicies(Consumer<List<UserPolicyResponeEntity>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * **参数解释**： 用户权限列表。
     * @return policies
     */
    public List<UserPolicyResponeEntity> getPolicies() {
        return policies;
    }

    public void setPolicies(List<UserPolicyResponeEntity> policies) {
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
        ListUserPoliciesResponse that = (ListUserPoliciesResponse) obj;
        return Objects.equals(this.userName, that.userName) && Objects.equals(this.total, that.total)
            && Objects.equals(this.policies, that.policies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, total, policies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUserPoliciesResponse {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
