package com.huaweicloud.sdk.sts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class AssumeAgencyWithOIDCResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_identity")

    private String sourceIdentity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assumed_agency")

    private AssumedAgencyWithFederationDto assumedAgency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credentials")

    private CredentialsDto credentials;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audience")

    private String audience;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject_from_id_token")

    private String subjectFromIdToken;

    public AssumeAgencyWithOIDCResponse withSourceIdentity(String sourceIdentity) {
        this.sourceIdentity = sourceIdentity;
        return this;
    }

    /**
     * **参数解释**： 身份提供商返回的OIDC令牌中所申明的身份。  **取值范围**： 不涉及。 
     * @return sourceIdentity
     */
    public String getSourceIdentity() {
        return sourceIdentity;
    }

    public void setSourceIdentity(String sourceIdentity) {
        this.sourceIdentity = sourceIdentity;
    }

    public AssumeAgencyWithOIDCResponse withAssumedAgency(AssumedAgencyWithFederationDto assumedAgency) {
        this.assumedAgency = assumedAgency;
        return this;
    }

    public AssumeAgencyWithOIDCResponse withAssumedAgency(
        Consumer<AssumedAgencyWithFederationDto> assumedAgencySetter) {
        if (this.assumedAgency == null) {
            this.assumedAgency = new AssumedAgencyWithFederationDto();
            assumedAgencySetter.accept(this.assumedAgency);
        }

        return this;
    }

    /**
     * Get assumedAgency
     * @return assumedAgency
     */
    public AssumedAgencyWithFederationDto getAssumedAgency() {
        return assumedAgency;
    }

    public void setAssumedAgency(AssumedAgencyWithFederationDto assumedAgency) {
        this.assumedAgency = assumedAgency;
    }

    public AssumeAgencyWithOIDCResponse withCredentials(CredentialsDto credentials) {
        this.credentials = credentials;
        return this;
    }

    public AssumeAgencyWithOIDCResponse withCredentials(Consumer<CredentialsDto> credentialsSetter) {
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

    public AssumeAgencyWithOIDCResponse withAudience(String audience) {
        this.audience = audience;
        return this;
    }

    /**
     * **参数解释**： OIDC令牌的预期受众（也称为客户端ID），通常是分发给应用程序的客户端标识符。  **取值范围**： 不涉及。 
     * @return audience
     */
    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public AssumeAgencyWithOIDCResponse withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * **参数解释**： 身份提供商的URN。  **取值范围**： 不涉及。 
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public AssumeAgencyWithOIDCResponse withSubjectFromIdToken(String subjectFromIdToken) {
        this.subjectFromIdToken = subjectFromIdToken;
        return this;
    }

    /**
     * **参数解释**： 由身份提供商返回的唯一用户标识符，即OIDC令牌中的sub(Subject)声明的值。  **取值范围**： 不涉及。 
     * @return subjectFromIdToken
     */
    public String getSubjectFromIdToken() {
        return subjectFromIdToken;
    }

    public void setSubjectFromIdToken(String subjectFromIdToken) {
        this.subjectFromIdToken = subjectFromIdToken;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssumeAgencyWithOIDCResponse that = (AssumeAgencyWithOIDCResponse) obj;
        return Objects.equals(this.sourceIdentity, that.sourceIdentity)
            && Objects.equals(this.assumedAgency, that.assumedAgency)
            && Objects.equals(this.credentials, that.credentials) && Objects.equals(this.audience, that.audience)
            && Objects.equals(this.provider, that.provider)
            && Objects.equals(this.subjectFromIdToken, that.subjectFromIdToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceIdentity, assumedAgency, credentials, audience, provider, subjectFromIdToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssumeAgencyWithOIDCResponse {\n");
        sb.append("    sourceIdentity: ").append(toIndentedString(sourceIdentity)).append("\n");
        sb.append("    assumedAgency: ").append(toIndentedString(assumedAgency)).append("\n");
        sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
        sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    subjectFromIdToken: ").append(toIndentedString(subjectFromIdToken)).append("\n");
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
