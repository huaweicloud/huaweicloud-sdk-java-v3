package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * GetResourceStsTokenRequestBody
 */
public class GetResourceStsTokenRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_credential_provider_name")

    private String resourceCredentialProviderName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_access_token")

    private String workloadAccessToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_session_name")

    private String agencySessionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration_seconds")

    private Integer durationSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private String policy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_identity")

    private String sourceIdentity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<StsTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transitive_tag_keys")

    private List<String> transitiveTagKeys = null;

    public GetResourceStsTokenRequestBody withResourceCredentialProviderName(String resourceCredentialProviderName) {
        this.resourceCredentialProviderName = resourceCredentialProviderName;
        return this;
    }

    /**
     * Name of the STS credential provider to retrieve STS credentials from
     * @return resourceCredentialProviderName
     */
    public String getResourceCredentialProviderName() {
        return resourceCredentialProviderName;
    }

    public void setResourceCredentialProviderName(String resourceCredentialProviderName) {
        this.resourceCredentialProviderName = resourceCredentialProviderName;
    }

    public GetResourceStsTokenRequestBody withWorkloadAccessToken(String workloadAccessToken) {
        this.workloadAccessToken = workloadAccessToken;
        return this;
    }

    /**
     * Identity token of the workload requesting the STS token
     * @return workloadAccessToken
     */
    public String getWorkloadAccessToken() {
        return workloadAccessToken;
    }

    public void setWorkloadAccessToken(String workloadAccessToken) {
        this.workloadAccessToken = workloadAccessToken;
    }

    public GetResourceStsTokenRequestBody withAgencySessionName(String agencySessionName) {
        this.agencySessionName = agencySessionName;
        return this;
    }

    /**
     * An identifier for the assumed agency session
     * @return agencySessionName
     */
    public String getAgencySessionName() {
        return agencySessionName;
    }

    public void setAgencySessionName(String agencySessionName) {
        this.agencySessionName = agencySessionName;
    }

    public GetResourceStsTokenRequestBody withDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

    /**
     * The duration, in seconds, of the agency session
     * minimum: 900
     * maximum: 43200
     * @return durationSeconds
     */
    public Integer getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public GetResourceStsTokenRequestBody withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * An IAM policy in JSON format that you want to use as an inline session policy
     * @return policy
     */
    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public GetResourceStsTokenRequestBody withSourceIdentity(String sourceIdentity) {
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

    public GetResourceStsTokenRequestBody withTags(List<StsTag> tags) {
        this.tags = tags;
        return this;
    }

    public GetResourceStsTokenRequestBody addTagsItem(StsTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public GetResourceStsTokenRequestBody withTags(Consumer<List<StsTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * A list of tags
     * @return tags
     */
    public List<StsTag> getTags() {
        return tags;
    }

    public void setTags(List<StsTag> tags) {
        this.tags = tags;
    }

    public GetResourceStsTokenRequestBody withTransitiveTagKeys(List<String> transitiveTagKeys) {
        this.transitiveTagKeys = transitiveTagKeys;
        return this;
    }

    public GetResourceStsTokenRequestBody addTransitiveTagKeysItem(String transitiveTagKeysItem) {
        if (this.transitiveTagKeys == null) {
            this.transitiveTagKeys = new ArrayList<>();
        }
        this.transitiveTagKeys.add(transitiveTagKeysItem);
        return this;
    }

    public GetResourceStsTokenRequestBody withTransitiveTagKeys(Consumer<List<String>> transitiveTagKeysSetter) {
        if (this.transitiveTagKeys == null) {
            this.transitiveTagKeys = new ArrayList<>();
        }
        transitiveTagKeysSetter.accept(this.transitiveTagKeys);
        return this;
    }

    /**
     * A list of keys for session tags that you want to set as transitive
     * @return transitiveTagKeys
     */
    public List<String> getTransitiveTagKeys() {
        return transitiveTagKeys;
    }

    public void setTransitiveTagKeys(List<String> transitiveTagKeys) {
        this.transitiveTagKeys = transitiveTagKeys;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetResourceStsTokenRequestBody that = (GetResourceStsTokenRequestBody) obj;
        return Objects.equals(this.resourceCredentialProviderName, that.resourceCredentialProviderName)
            && Objects.equals(this.workloadAccessToken, that.workloadAccessToken)
            && Objects.equals(this.agencySessionName, that.agencySessionName)
            && Objects.equals(this.durationSeconds, that.durationSeconds) && Objects.equals(this.policy, that.policy)
            && Objects.equals(this.sourceIdentity, that.sourceIdentity) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.transitiveTagKeys, that.transitiveTagKeys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceCredentialProviderName,
            workloadAccessToken,
            agencySessionName,
            durationSeconds,
            policy,
            sourceIdentity,
            tags,
            transitiveTagKeys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetResourceStsTokenRequestBody {\n");
        sb.append("    resourceCredentialProviderName: ")
            .append(toIndentedString(resourceCredentialProviderName))
            .append("\n");
        sb.append("    workloadAccessToken: ").append(toIndentedString(workloadAccessToken)).append("\n");
        sb.append("    agencySessionName: ").append(toIndentedString(agencySessionName)).append("\n");
        sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    sourceIdentity: ").append(toIndentedString(sourceIdentity)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    transitiveTagKeys: ").append(toIndentedString(transitiveTagKeys)).append("\n");
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
