package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class GetOauth2CredentialProviderRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credential_provider_name")

    private String credentialProviderName;

    public GetOauth2CredentialProviderRequest withCredentialProviderName(String credentialProviderName) {
        this.credentialProviderName = credentialProviderName;
        return this;
    }

    /**
     * The name of the credential provider.
     * @return credentialProviderName
     */
    public String getCredentialProviderName() {
        return credentialProviderName;
    }

    public void setCredentialProviderName(String credentialProviderName) {
        this.credentialProviderName = credentialProviderName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetOauth2CredentialProviderRequest that = (GetOauth2CredentialProviderRequest) obj;
        return Objects.equals(this.credentialProviderName, that.credentialProviderName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(credentialProviderName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetOauth2CredentialProviderRequest {\n");
        sb.append("    credentialProviderName: ").append(toIndentedString(credentialProviderName)).append("\n");
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
