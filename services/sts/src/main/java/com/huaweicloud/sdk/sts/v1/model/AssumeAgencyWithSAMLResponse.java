package com.huaweicloud.sdk.sts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class AssumeAgencyWithSAMLResponse extends SdkResponse {

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
    @JsonProperty(value = "issuer")

    private String issuer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_qualifier")

    private String nameQualifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject_type")

    private String subjectType;

    public AssumeAgencyWithSAMLResponse withSourceIdentity(String sourceIdentity) {
        this.sourceIdentity = sourceIdentity;
        return this;
    }

    /**
     * **参数解释**： SAML断言中SourceIdentity属性值所申明的身份。  **约束限制**： 不涉及。 
     * @return sourceIdentity
     */
    public String getSourceIdentity() {
        return sourceIdentity;
    }

    public void setSourceIdentity(String sourceIdentity) {
        this.sourceIdentity = sourceIdentity;
    }

    public AssumeAgencyWithSAMLResponse withAssumedAgency(AssumedAgencyWithFederationDto assumedAgency) {
        this.assumedAgency = assumedAgency;
        return this;
    }

    public AssumeAgencyWithSAMLResponse withAssumedAgency(
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

    public AssumeAgencyWithSAMLResponse withCredentials(CredentialsDto credentials) {
        this.credentials = credentials;
        return this;
    }

    public AssumeAgencyWithSAMLResponse withCredentials(Consumer<CredentialsDto> credentialsSetter) {
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

    public AssumeAgencyWithSAMLResponse withAudience(String audience) {
        this.audience = audience;
        return this;
    }

    /**
     * **参数解释**：  SAML断言中SubjectConfirmationData元素的Recipient属性值。  **约束限制**： 不涉及。 
     * @return audience
     */
    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public AssumeAgencyWithSAMLResponse withIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * **参数解释**： SAML断言中Issuer元素的值。  **约束限制**： 不涉及。 
     * @return issuer
     */
    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public AssumeAgencyWithSAMLResponse withNameQualifier(String nameQualifier) {
        this.nameQualifier = nameQualifier;
        return this;
    }

    /**
     * **参数解释**： 以下三部分的哈希值：issuer、华为云账号的Account ID以及IAM中SAML提供商的名称（URN的最后一部分）。name_qualifier和subject的组合可用于唯一标识用户。下面的伪代码展示了哈希值的计算方式：BASE64 ( SHA1 ( \"https://example.com/saml\" + \"8c1eef3a241945f69c3d3axxxxxxxxxx\" + \"/MySAMLIdPName\" ) )  **约束限制**： 不涉及。 
     * @return nameQualifier
     */
    public String getNameQualifier() {
        return nameQualifier;
    }

    public void setNameQualifier(String nameQualifier) {
        this.nameQualifier = nameQualifier;
    }

    public AssumeAgencyWithSAMLResponse withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * **参数解释**：  SAML断言中Subject元素的NameID元素的值。  **约束限制**： 不涉及。 
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public AssumeAgencyWithSAMLResponse withSubjectType(String subjectType) {
        this.subjectType = subjectType;
        return this;
    }

    /**
     * **参数解释**：  NameID的格式，由SAML断言中NameID元素的Format属性定义。格式的典型示例是transient（临时）或persistent（持久）。 如果该格式包含前缀urn:oasis:names:tc:SAML:2.0:nameid-format，该前缀将被移除。例如，urn:oasis:names:tc:SAML:2.0:nameid-format:transient将作为transient返回。如果格式包含任何其他前缀，则直接返回该格式而不作任何修改。  **约束限制**： 不涉及。 
     * @return subjectType
     */
    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssumeAgencyWithSAMLResponse that = (AssumeAgencyWithSAMLResponse) obj;
        return Objects.equals(this.sourceIdentity, that.sourceIdentity)
            && Objects.equals(this.assumedAgency, that.assumedAgency)
            && Objects.equals(this.credentials, that.credentials) && Objects.equals(this.audience, that.audience)
            && Objects.equals(this.issuer, that.issuer) && Objects.equals(this.nameQualifier, that.nameQualifier)
            && Objects.equals(this.subject, that.subject) && Objects.equals(this.subjectType, that.subjectType);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(sourceIdentity, assumedAgency, credentials, audience, issuer, nameQualifier, subject, subjectType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssumeAgencyWithSAMLResponse {\n");
        sb.append("    sourceIdentity: ").append(toIndentedString(sourceIdentity)).append("\n");
        sb.append("    assumedAgency: ").append(toIndentedString(assumedAgency)).append("\n");
        sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
        sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
        sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
        sb.append("    nameQualifier: ").append(toIndentedString(nameQualifier)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    subjectType: ").append(toIndentedString(subjectType)).append("\n");
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
