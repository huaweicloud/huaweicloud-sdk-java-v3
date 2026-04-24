package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class GetWorkloadIdentityAuthorizerConfigurationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_identity_authorizer_configuration")

    private WorkloadIdentityAuthorizerConfiguration workloadIdentityAuthorizerConfiguration;

    public GetWorkloadIdentityAuthorizerConfigurationResponse withWorkloadIdentityAuthorizerConfiguration(
        WorkloadIdentityAuthorizerConfiguration workloadIdentityAuthorizerConfiguration) {
        this.workloadIdentityAuthorizerConfiguration = workloadIdentityAuthorizerConfiguration;
        return this;
    }

    public GetWorkloadIdentityAuthorizerConfigurationResponse withWorkloadIdentityAuthorizerConfiguration(
        Consumer<WorkloadIdentityAuthorizerConfiguration> workloadIdentityAuthorizerConfigurationSetter) {
        if (this.workloadIdentityAuthorizerConfiguration == null) {
            this.workloadIdentityAuthorizerConfiguration = new WorkloadIdentityAuthorizerConfiguration();
            workloadIdentityAuthorizerConfigurationSetter.accept(this.workloadIdentityAuthorizerConfiguration);
        }

        return this;
    }

    /**
     * Get workloadIdentityAuthorizerConfiguration
     * @return workloadIdentityAuthorizerConfiguration
     */
    public WorkloadIdentityAuthorizerConfiguration getWorkloadIdentityAuthorizerConfiguration() {
        return workloadIdentityAuthorizerConfiguration;
    }

    public void setWorkloadIdentityAuthorizerConfiguration(
        WorkloadIdentityAuthorizerConfiguration workloadIdentityAuthorizerConfiguration) {
        this.workloadIdentityAuthorizerConfiguration = workloadIdentityAuthorizerConfiguration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetWorkloadIdentityAuthorizerConfigurationResponse that =
            (GetWorkloadIdentityAuthorizerConfigurationResponse) obj;
        return Objects.equals(this.workloadIdentityAuthorizerConfiguration,
            that.workloadIdentityAuthorizerConfiguration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workloadIdentityAuthorizerConfiguration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetWorkloadIdentityAuthorizerConfigurationResponse {\n");
        sb.append("    workloadIdentityAuthorizerConfiguration: ")
            .append(toIndentedString(workloadIdentityAuthorizerConfiguration))
            .append("\n");
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
