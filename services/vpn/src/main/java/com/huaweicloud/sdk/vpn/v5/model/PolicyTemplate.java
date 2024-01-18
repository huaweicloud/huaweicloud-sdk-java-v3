package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * PolicyTemplate
 */
public class PolicyTemplate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ike_policy")

    private VgwIkePolicy ikePolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipsec_policy")

    private VgwIpsecPolicy ipsecPolicy;

    public PolicyTemplate withIkePolicy(VgwIkePolicy ikePolicy) {
        this.ikePolicy = ikePolicy;
        return this;
    }

    public PolicyTemplate withIkePolicy(Consumer<VgwIkePolicy> ikePolicySetter) {
        if (this.ikePolicy == null) {
            this.ikePolicy = new VgwIkePolicy();
            ikePolicySetter.accept(this.ikePolicy);
        }

        return this;
    }

    /**
     * Get ikePolicy
     * @return ikePolicy
     */
    public VgwIkePolicy getIkePolicy() {
        return ikePolicy;
    }

    public void setIkePolicy(VgwIkePolicy ikePolicy) {
        this.ikePolicy = ikePolicy;
    }

    public PolicyTemplate withIpsecPolicy(VgwIpsecPolicy ipsecPolicy) {
        this.ipsecPolicy = ipsecPolicy;
        return this;
    }

    public PolicyTemplate withIpsecPolicy(Consumer<VgwIpsecPolicy> ipsecPolicySetter) {
        if (this.ipsecPolicy == null) {
            this.ipsecPolicy = new VgwIpsecPolicy();
            ipsecPolicySetter.accept(this.ipsecPolicy);
        }

        return this;
    }

    /**
     * Get ipsecPolicy
     * @return ipsecPolicy
     */
    public VgwIpsecPolicy getIpsecPolicy() {
        return ipsecPolicy;
    }

    public void setIpsecPolicy(VgwIpsecPolicy ipsecPolicy) {
        this.ipsecPolicy = ipsecPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicyTemplate that = (PolicyTemplate) obj;
        return Objects.equals(this.ikePolicy, that.ikePolicy) && Objects.equals(this.ipsecPolicy, that.ipsecPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ikePolicy, ipsecPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyTemplate {\n");
        sb.append("    ikePolicy: ").append(toIndentedString(ikePolicy)).append("\n");
        sb.append("    ipsecPolicy: ").append(toIndentedString(ipsecPolicy)).append("\n");
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
