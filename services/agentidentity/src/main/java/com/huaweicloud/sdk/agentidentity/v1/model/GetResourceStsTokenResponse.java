package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class GetResourceStsTokenResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_identity")

    private String sourceIdentity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assumed_agency")

    private GetResourceStsTokenResponseBodyAssumedAgency assumedAgency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credentials")

    private GetResourceStsTokenResponseBodyCredentials credentials;

    public GetResourceStsTokenResponse withSourceIdentity(String sourceIdentity) {
        this.sourceIdentity = sourceIdentity;
        return this;
    }

    /**
     * The source identity specified by the principal that is calling the operation
     * @return sourceIdentity
     */
    public String getSourceIdentity() {
        return sourceIdentity;
    }

    public void setSourceIdentity(String sourceIdentity) {
        this.sourceIdentity = sourceIdentity;
    }

    public GetResourceStsTokenResponse withAssumedAgency(GetResourceStsTokenResponseBodyAssumedAgency assumedAgency) {
        this.assumedAgency = assumedAgency;
        return this;
    }

    public GetResourceStsTokenResponse withAssumedAgency(
        Consumer<GetResourceStsTokenResponseBodyAssumedAgency> assumedAgencySetter) {
        if (this.assumedAgency == null) {
            this.assumedAgency = new GetResourceStsTokenResponseBodyAssumedAgency();
            assumedAgencySetter.accept(this.assumedAgency);
        }

        return this;
    }

    /**
     * Get assumedAgency
     * @return assumedAgency
     */
    public GetResourceStsTokenResponseBodyAssumedAgency getAssumedAgency() {
        return assumedAgency;
    }

    public void setAssumedAgency(GetResourceStsTokenResponseBodyAssumedAgency assumedAgency) {
        this.assumedAgency = assumedAgency;
    }

    public GetResourceStsTokenResponse withCredentials(GetResourceStsTokenResponseBodyCredentials credentials) {
        this.credentials = credentials;
        return this;
    }

    public GetResourceStsTokenResponse withCredentials(
        Consumer<GetResourceStsTokenResponseBodyCredentials> credentialsSetter) {
        if (this.credentials == null) {
            this.credentials = new GetResourceStsTokenResponseBodyCredentials();
            credentialsSetter.accept(this.credentials);
        }

        return this;
    }

    /**
     * Get credentials
     * @return credentials
     */
    public GetResourceStsTokenResponseBodyCredentials getCredentials() {
        return credentials;
    }

    public void setCredentials(GetResourceStsTokenResponseBodyCredentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetResourceStsTokenResponse that = (GetResourceStsTokenResponse) obj;
        return Objects.equals(this.sourceIdentity, that.sourceIdentity)
            && Objects.equals(this.assumedAgency, that.assumedAgency)
            && Objects.equals(this.credentials, that.credentials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceIdentity, assumedAgency, credentials);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetResourceStsTokenResponse {\n");
        sb.append("    sourceIdentity: ").append(toIndentedString(sourceIdentity)).append("\n");
        sb.append("    assumedAgency: ").append(toIndentedString(assumedAgency)).append("\n");
        sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
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
