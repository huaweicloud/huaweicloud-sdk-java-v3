package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GetResourceApiKeyRequestBody
 */
public class GetResourceApiKeyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_credential_provider_name")

    private String resourceCredentialProviderName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_access_token")

    private String workloadAccessToken;

    public GetResourceApiKeyRequestBody withResourceCredentialProviderName(String resourceCredentialProviderName) {
        this.resourceCredentialProviderName = resourceCredentialProviderName;
        return this;
    }

    /**
     * Name of the resource credential provider to retrieve API key from
     * @return resourceCredentialProviderName
     */
    public String getResourceCredentialProviderName() {
        return resourceCredentialProviderName;
    }

    public void setResourceCredentialProviderName(String resourceCredentialProviderName) {
        this.resourceCredentialProviderName = resourceCredentialProviderName;
    }

    public GetResourceApiKeyRequestBody withWorkloadAccessToken(String workloadAccessToken) {
        this.workloadAccessToken = workloadAccessToken;
        return this;
    }

    /**
     * Identity token of the workload requesting the API key
     * @return workloadAccessToken
     */
    public String getWorkloadAccessToken() {
        return workloadAccessToken;
    }

    public void setWorkloadAccessToken(String workloadAccessToken) {
        this.workloadAccessToken = workloadAccessToken;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetResourceApiKeyRequestBody that = (GetResourceApiKeyRequestBody) obj;
        return Objects.equals(this.resourceCredentialProviderName, that.resourceCredentialProviderName)
            && Objects.equals(this.workloadAccessToken, that.workloadAccessToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceCredentialProviderName, workloadAccessToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetResourceApiKeyRequestBody {\n");
        sb.append("    resourceCredentialProviderName: ")
            .append(toIndentedString(resourceCredentialProviderName))
            .append("\n");
        sb.append("    workloadAccessToken: ").append(toIndentedString(workloadAccessToken)).append("\n");
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
