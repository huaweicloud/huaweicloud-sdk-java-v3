package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;

/**
 * Request Object
 */
public class Oauth2CallbackRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credential_provider_id")

    private UUID credentialProviderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private String error;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_description")

    private String errorDescription;

    public Oauth2CallbackRequest withCredentialProviderId(UUID credentialProviderId) {
        this.credentialProviderId = credentialProviderId;
        return this;
    }

    /**
     * Unique identifier of the credential provider
     * @return credentialProviderId
     */
    public UUID getCredentialProviderId() {
        return credentialProviderId;
    }

    public void setCredentialProviderId(UUID credentialProviderId) {
        this.credentialProviderId = credentialProviderId;
    }

    public Oauth2CallbackRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * OAuth2.0 Standard Authorization Code - one-time use, short-lived token for access token exchange. Present ONLY on successful authorization.
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Oauth2CallbackRequest withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * OAuth2.0 Standard CSRF Protection State - opaque string, echo of original request state. PRESENT FOR BOTH SUCCESS AND ERROR.
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Oauth2CallbackRequest withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * OAuth2.0 Standard Error Code - present ONLY on authorization failure (denial/expiry/invalid). e.g. access_denied, invalid_scope, server_error
     * @return error
     */
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Oauth2CallbackRequest withErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
        return this;
    }

    /**
     * OAuth2.0 Standard Error Description - human-readable error message, paired with error param, URL-encoded for safe transmission
     * @return errorDescription
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Oauth2CallbackRequest that = (Oauth2CallbackRequest) obj;
        return Objects.equals(this.credentialProviderId, that.credentialProviderId)
            && Objects.equals(this.code, that.code) && Objects.equals(this.state, that.state)
            && Objects.equals(this.error, that.error) && Objects.equals(this.errorDescription, that.errorDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(credentialProviderId, code, state, error, errorDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Oauth2CallbackRequest {\n");
        sb.append("    credentialProviderId: ").append(toIndentedString(credentialProviderId)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
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
