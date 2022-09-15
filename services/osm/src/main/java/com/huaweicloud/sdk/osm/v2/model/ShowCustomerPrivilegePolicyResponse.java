package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowCustomerPrivilegePolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_switch")

    private Boolean policySwitch;

    public ShowCustomerPrivilegePolicyResponse withPolicySwitch(Boolean policySwitch) {
        this.policySwitch = policySwitch;
        return this;
    }

    /**
     * 开关状态
     * @return policySwitch
     */
    public Boolean getPolicySwitch() {
        return policySwitch;
    }

    public void setPolicySwitch(Boolean policySwitch) {
        this.policySwitch = policySwitch;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCustomerPrivilegePolicyResponse showCustomerPrivilegePolicyResponse =
            (ShowCustomerPrivilegePolicyResponse) o;
        return Objects.equals(this.policySwitch, showCustomerPrivilegePolicyResponse.policySwitch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policySwitch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCustomerPrivilegePolicyResponse {\n");
        sb.append("    policySwitch: ").append(toIndentedString(policySwitch)).append("\n");
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
