package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowSecurityPolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_policy_id")

    @JacksonXmlProperty(localName = "security_policy_id")

    private String securityPolicyId;

    public ShowSecurityPolicyRequest withSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
        return this;
    }

    /**
     * 自定义安全策略ID。
     * @return securityPolicyId
     */
    public String getSecurityPolicyId() {
        return securityPolicyId;
    }

    public void setSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSecurityPolicyRequest showSecurityPolicyRequest = (ShowSecurityPolicyRequest) o;
        return Objects.equals(this.securityPolicyId, showSecurityPolicyRequest.securityPolicyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityPolicyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSecurityPolicyRequest {\n");
        sb.append("    securityPolicyId: ").append(toIndentedString(securityPolicyId)).append("\n");
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
