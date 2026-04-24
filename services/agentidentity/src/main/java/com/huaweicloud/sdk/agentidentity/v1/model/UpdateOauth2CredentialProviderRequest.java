package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateOauth2CredentialProviderRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credential_provider_name")

    private String credentialProviderName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateOauth2CredentialProviderReqBody body;

    public UpdateOauth2CredentialProviderRequest withCredentialProviderName(String credentialProviderName) {
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

    public UpdateOauth2CredentialProviderRequest withBody(UpdateOauth2CredentialProviderReqBody body) {
        this.body = body;
        return this;
    }

    public UpdateOauth2CredentialProviderRequest withBody(Consumer<UpdateOauth2CredentialProviderReqBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateOauth2CredentialProviderReqBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateOauth2CredentialProviderReqBody getBody() {
        return body;
    }

    public void setBody(UpdateOauth2CredentialProviderReqBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateOauth2CredentialProviderRequest that = (UpdateOauth2CredentialProviderRequest) obj;
        return Objects.equals(this.credentialProviderName, that.credentialProviderName)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(credentialProviderName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOauth2CredentialProviderRequest {\n");
        sb.append("    credentialProviderName: ").append(toIndentedString(credentialProviderName)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
