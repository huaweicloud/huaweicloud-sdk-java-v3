package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class GetApiKeyCredentialProviderResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credential_provider")

    private ApiKeyCredentialProvider credentialProvider;

    public GetApiKeyCredentialProviderResponse withCredentialProvider(ApiKeyCredentialProvider credentialProvider) {
        this.credentialProvider = credentialProvider;
        return this;
    }

    public GetApiKeyCredentialProviderResponse withCredentialProvider(
        Consumer<ApiKeyCredentialProvider> credentialProviderSetter) {
        if (this.credentialProvider == null) {
            this.credentialProvider = new ApiKeyCredentialProvider();
            credentialProviderSetter.accept(this.credentialProvider);
        }

        return this;
    }

    /**
     * Get credentialProvider
     * @return credentialProvider
     */
    public ApiKeyCredentialProvider getCredentialProvider() {
        return credentialProvider;
    }

    public void setCredentialProvider(ApiKeyCredentialProvider credentialProvider) {
        this.credentialProvider = credentialProvider;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetApiKeyCredentialProviderResponse that = (GetApiKeyCredentialProviderResponse) obj;
        return Objects.equals(this.credentialProvider, that.credentialProvider);
    }

    @Override
    public int hashCode() {
        return Objects.hash(credentialProvider);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetApiKeyCredentialProviderResponse {\n");
        sb.append("    credentialProvider: ").append(toIndentedString(credentialProvider)).append("\n");
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
