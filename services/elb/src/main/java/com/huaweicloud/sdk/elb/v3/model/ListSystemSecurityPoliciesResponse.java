package com.huaweicloud.sdk.elb.v3.model;

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
public class ListSystemSecurityPoliciesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_security_policies")

    private List<SystemSecurityPolicy> systemSecurityPolicies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListSystemSecurityPoliciesResponse withSystemSecurityPolicies(
        List<SystemSecurityPolicy> systemSecurityPolicies) {
        this.systemSecurityPolicies = systemSecurityPolicies;
        return this;
    }

    public ListSystemSecurityPoliciesResponse addSystemSecurityPoliciesItem(
        SystemSecurityPolicy systemSecurityPoliciesItem) {
        if (this.systemSecurityPolicies == null) {
            this.systemSecurityPolicies = new ArrayList<>();
        }
        this.systemSecurityPolicies.add(systemSecurityPoliciesItem);
        return this;
    }

    public ListSystemSecurityPoliciesResponse withSystemSecurityPolicies(
        Consumer<List<SystemSecurityPolicy>> systemSecurityPoliciesSetter) {
        if (this.systemSecurityPolicies == null) {
            this.systemSecurityPolicies = new ArrayList<>();
        }
        systemSecurityPoliciesSetter.accept(this.systemSecurityPolicies);
        return this;
    }

    /**
     * **参数解释**：系统安全策略列表。
     * @return systemSecurityPolicies
     */
    public List<SystemSecurityPolicy> getSystemSecurityPolicies() {
        return systemSecurityPolicies;
    }

    public void setSystemSecurityPolicies(List<SystemSecurityPolicy> systemSecurityPolicies) {
        this.systemSecurityPolicies = systemSecurityPolicies;
    }

    public ListSystemSecurityPoliciesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * **参数解释**：请求ID。  **取值范围**：由数字、小写字母和中划线（-）组成的字符串，自动生成。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSystemSecurityPoliciesResponse that = (ListSystemSecurityPoliciesResponse) obj;
        return Objects.equals(this.systemSecurityPolicies, that.systemSecurityPolicies)
            && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(systemSecurityPolicies, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSystemSecurityPoliciesResponse {\n");
        sb.append("    systemSecurityPolicies: ").append(toIndentedString(systemSecurityPolicies)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
