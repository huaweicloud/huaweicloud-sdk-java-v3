package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeletePolicyInstanceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyinstanceid")

    private String policyinstanceid;

    public DeletePolicyInstanceRequest withPolicyinstanceid(String policyinstanceid) {
        this.policyinstanceid = policyinstanceid;
        return this;
    }

    /**
     * 策略实例id
     * @return policyinstanceid
     */
    public String getPolicyinstanceid() {
        return policyinstanceid;
    }

    public void setPolicyinstanceid(String policyinstanceid) {
        this.policyinstanceid = policyinstanceid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeletePolicyInstanceRequest that = (DeletePolicyInstanceRequest) obj;
        return Objects.equals(this.policyinstanceid, that.policyinstanceid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyinstanceid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeletePolicyInstanceRequest {\n");
        sb.append("    policyinstanceid: ").append(toIndentedString(policyinstanceid)).append("\n");
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
