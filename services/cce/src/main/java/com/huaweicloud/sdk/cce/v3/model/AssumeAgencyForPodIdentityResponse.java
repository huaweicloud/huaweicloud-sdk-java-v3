package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class AssumeAgencyForPodIdentityResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assumedAgency")

    private AssumedAgency assumedAgency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audience")

    private String audience;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credentials")

    private Credentials credentials;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "podIdentityAssociationId")

    private String podIdentityAssociationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private PodIdentitySubject subject;

    public AssumeAgencyForPodIdentityResponse withAssumedAgency(AssumedAgency assumedAgency) {
        this.assumedAgency = assumedAgency;
        return this;
    }

    public AssumeAgencyForPodIdentityResponse withAssumedAgency(Consumer<AssumedAgency> assumedAgencySetter) {
        if (this.assumedAgency == null) {
            this.assumedAgency = new AssumedAgency();
            assumedAgencySetter.accept(this.assumedAgency);
        }

        return this;
    }

    /**
     * Get assumedAgency
     * @return assumedAgency
     */
    public AssumedAgency getAssumedAgency() {
        return assumedAgency;
    }

    public void setAssumedAgency(AssumedAgency assumedAgency) {
        this.assumedAgency = assumedAgency;
    }

    public AssumeAgencyForPodIdentityResponse withAudience(String audience) {
        this.audience = audience;
        return this;
    }

    /**
     * **参数解释：** 凭据签发时传入的audience属性，通过pod-identity关联获取委托凭据的场景下，该值固定为 service.cce.pods。 该属性只在pod-identity关联绑定信任委托时返回 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return audience
     */
    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public AssumeAgencyForPodIdentityResponse withCredentials(Credentials credentials) {
        this.credentials = credentials;
        return this;
    }

    public AssumeAgencyForPodIdentityResponse withCredentials(Consumer<Credentials> credentialsSetter) {
        if (this.credentials == null) {
            this.credentials = new Credentials();
            credentialsSetter.accept(this.credentials);
        }

        return this;
    }

    /**
     * Get credentials
     * @return credentials
     */
    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public AssumeAgencyForPodIdentityResponse withPodIdentityAssociationId(String podIdentityAssociationId) {
        this.podIdentityAssociationId = podIdentityAssociationId;
        return this;
    }

    /**
     * **参数解释：** 委托凭据所属的pod-identity关联id。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return podIdentityAssociationId
     */
    public String getPodIdentityAssociationId() {
        return podIdentityAssociationId;
    }

    public void setPodIdentityAssociationId(String podIdentityAssociationId) {
        this.podIdentityAssociationId = podIdentityAssociationId;
    }

    public AssumeAgencyForPodIdentityResponse withSubject(PodIdentitySubject subject) {
        this.subject = subject;
        return this;
    }

    public AssumeAgencyForPodIdentityResponse withSubject(Consumer<PodIdentitySubject> subjectSetter) {
        if (this.subject == null) {
            this.subject = new PodIdentitySubject();
            subjectSetter.accept(this.subject);
        }

        return this;
    }

    /**
     * Get subject
     * @return subject
     */
    public PodIdentitySubject getSubject() {
        return subject;
    }

    public void setSubject(PodIdentitySubject subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssumeAgencyForPodIdentityResponse that = (AssumeAgencyForPodIdentityResponse) obj;
        return Objects.equals(this.assumedAgency, that.assumedAgency) && Objects.equals(this.audience, that.audience)
            && Objects.equals(this.credentials, that.credentials)
            && Objects.equals(this.podIdentityAssociationId, that.podIdentityAssociationId)
            && Objects.equals(this.subject, that.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assumedAgency, audience, credentials, podIdentityAssociationId, subject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssumeAgencyForPodIdentityResponse {\n");
        sb.append("    assumedAgency: ").append(toIndentedString(assumedAgency)).append("\n");
        sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
        sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
        sb.append("    podIdentityAssociationId: ").append(toIndentedString(podIdentityAssociationId)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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
