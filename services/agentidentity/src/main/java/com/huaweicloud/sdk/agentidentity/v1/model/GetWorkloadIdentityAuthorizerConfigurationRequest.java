package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class GetWorkloadIdentityAuthorizerConfigurationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_identity_name")

    private String workloadIdentityName;

    public GetWorkloadIdentityAuthorizerConfigurationRequest withWorkloadIdentityName(String workloadIdentityName) {
        this.workloadIdentityName = workloadIdentityName;
        return this;
    }

    /**
     * The name of the workload identity.
     * @return workloadIdentityName
     */
    public String getWorkloadIdentityName() {
        return workloadIdentityName;
    }

    public void setWorkloadIdentityName(String workloadIdentityName) {
        this.workloadIdentityName = workloadIdentityName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetWorkloadIdentityAuthorizerConfigurationRequest that =
            (GetWorkloadIdentityAuthorizerConfigurationRequest) obj;
        return Objects.equals(this.workloadIdentityName, that.workloadIdentityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workloadIdentityName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetWorkloadIdentityAuthorizerConfigurationRequest {\n");
        sb.append("    workloadIdentityName: ").append(toIndentedString(workloadIdentityName)).append("\n");
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
