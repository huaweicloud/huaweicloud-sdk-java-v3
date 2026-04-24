package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * WorkloadIdentityAuthorizerConfiguration
 */
public class WorkloadIdentityAuthorizerConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_identity_name")

    private String workloadIdentityName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorizer_type")

    private AuthorizerType authorizerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorizer_configuration")

    private AuthorizerConfiguration authorizerConfiguration;

    public WorkloadIdentityAuthorizerConfiguration withWorkloadIdentityName(String workloadIdentityName) {
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

    public WorkloadIdentityAuthorizerConfiguration withAuthorizerType(AuthorizerType authorizerType) {
        this.authorizerType = authorizerType;
        return this;
    }

    /**
     * Get authorizerType
     * @return authorizerType
     */
    public AuthorizerType getAuthorizerType() {
        return authorizerType;
    }

    public void setAuthorizerType(AuthorizerType authorizerType) {
        this.authorizerType = authorizerType;
    }

    public WorkloadIdentityAuthorizerConfiguration withAuthorizerConfiguration(
        AuthorizerConfiguration authorizerConfiguration) {
        this.authorizerConfiguration = authorizerConfiguration;
        return this;
    }

    public WorkloadIdentityAuthorizerConfiguration withAuthorizerConfiguration(
        Consumer<AuthorizerConfiguration> authorizerConfigurationSetter) {
        if (this.authorizerConfiguration == null) {
            this.authorizerConfiguration = new AuthorizerConfiguration();
            authorizerConfigurationSetter.accept(this.authorizerConfiguration);
        }

        return this;
    }

    /**
     * Get authorizerConfiguration
     * @return authorizerConfiguration
     */
    public AuthorizerConfiguration getAuthorizerConfiguration() {
        return authorizerConfiguration;
    }

    public void setAuthorizerConfiguration(AuthorizerConfiguration authorizerConfiguration) {
        this.authorizerConfiguration = authorizerConfiguration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkloadIdentityAuthorizerConfiguration that = (WorkloadIdentityAuthorizerConfiguration) obj;
        return Objects.equals(this.workloadIdentityName, that.workloadIdentityName)
            && Objects.equals(this.authorizerType, that.authorizerType)
            && Objects.equals(this.authorizerConfiguration, that.authorizerConfiguration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workloadIdentityName, authorizerType, authorizerConfiguration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkloadIdentityAuthorizerConfiguration {\n");
        sb.append("    workloadIdentityName: ").append(toIndentedString(workloadIdentityName)).append("\n");
        sb.append("    authorizerType: ").append(toIndentedString(authorizerType)).append("\n");
        sb.append("    authorizerConfiguration: ").append(toIndentedString(authorizerConfiguration)).append("\n");
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
