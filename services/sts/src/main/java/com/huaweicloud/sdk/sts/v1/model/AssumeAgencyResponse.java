package com.huaweicloud.sdk.sts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class AssumeAgencyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_identity")

    private String sourceIdentity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assumed_agency")

    private AssumedAgencyDto assumedAgency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credentials")

    private CredentialsDto credentials;

    public AssumeAgencyResponse withSourceIdentity(String sourceIdentity) {
        this.sourceIdentity = sourceIdentity;
        return this;
    }

    /**
     * 调用链里最初调用者所声明的身份。
     * @return sourceIdentity
     */
    public String getSourceIdentity() {
        return sourceIdentity;
    }

    public void setSourceIdentity(String sourceIdentity) {
        this.sourceIdentity = sourceIdentity;
    }

    public AssumeAgencyResponse withAssumedAgency(AssumedAgencyDto assumedAgency) {
        this.assumedAgency = assumedAgency;
        return this;
    }

    public AssumeAgencyResponse withAssumedAgency(Consumer<AssumedAgencyDto> assumedAgencySetter) {
        if (this.assumedAgency == null) {
            this.assumedAgency = new AssumedAgencyDto();
            assumedAgencySetter.accept(this.assumedAgency);
        }

        return this;
    }

    /**
     * Get assumedAgency
     * @return assumedAgency
     */
    public AssumedAgencyDto getAssumedAgency() {
        return assumedAgency;
    }

    public void setAssumedAgency(AssumedAgencyDto assumedAgency) {
        this.assumedAgency = assumedAgency;
    }

    public AssumeAgencyResponse withCredentials(CredentialsDto credentials) {
        this.credentials = credentials;
        return this;
    }

    public AssumeAgencyResponse withCredentials(Consumer<CredentialsDto> credentialsSetter) {
        if (this.credentials == null) {
            this.credentials = new CredentialsDto();
            credentialsSetter.accept(this.credentials);
        }

        return this;
    }

    /**
     * Get credentials
     * @return credentials
     */
    public CredentialsDto getCredentials() {
        return credentials;
    }

    public void setCredentials(CredentialsDto credentials) {
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
        AssumeAgencyResponse that = (AssumeAgencyResponse) obj;
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
        sb.append("class AssumeAgencyResponse {\n");
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
