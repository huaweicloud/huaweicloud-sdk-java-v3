package com.huaweicloud.sdk.sts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 接口/v5/agencies/assume的Http请求体。
 */
public class AssumeAgencyReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration_seconds")

    private Integer durationSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_id")

    private String externalId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private String policy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_ids")

    private List<String> policyIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_urn")

    private String agencyUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_session_name")

    private String agencySessionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_number")

    private String serialNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token_code")

    private String tokenCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_identity")

    private String sourceIdentity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagDto> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transitive_tag_keys")

    private List<String> transitiveTagKeys = null;

    public AssumeAgencyReqBody withDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

    /**
     * 获得的临时安全凭证的有效时间（单位秒）。请注意，该时间需要小于委托本身设置的最大会话持续时间，同时在携带X-Security-Token的Header头时该时间不能超过3600秒。
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

    public AssumeAgencyReqBody withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * 外部ID，防止混淆代理人问题。
     * @return externalId
     */
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public AssumeAgencyReqBody withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * 自定义策略，限制本次会话获得的临时安全凭证的权限范围不会超过该自定义策略指定的权限。
     * @return policy
     */
    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public AssumeAgencyReqBody withPolicyIds(List<String> policyIds) {
        this.policyIds = policyIds;
        return this;
    }

    public AssumeAgencyReqBody addPolicyIdsItem(String policyIdsItem) {
        if (this.policyIds == null) {
            this.policyIds = new ArrayList<>();
        }
        this.policyIds.add(policyIdsItem);
        return this;
    }

    public AssumeAgencyReqBody withPolicyIds(Consumer<List<String>> policyIdsSetter) {
        if (this.policyIds == null) {
            this.policyIds = new ArrayList<>();
        }
        policyIdsSetter.accept(this.policyIds);
        return this;
    }

    /**
     * 预置策略列表，限制本次会话获得的临时安全凭证的权限范围不会超过该预置策略指定的权限。
     * @return policyIds
     */
    public List<String> getPolicyIds() {
        return policyIds;
    }

    public void setPolicyIds(List<String> policyIds) {
        this.policyIds = policyIds;
    }

    public AssumeAgencyReqBody withAgencyUrn(String agencyUrn) {
        this.agencyUrn = agencyUrn;
        return this;
    }

    /**
     * 目标委托的URN。
     * @return agencyUrn
     */
    public String getAgencyUrn() {
        return agencyUrn;
    }

    public void setAgencyUrn(String agencyUrn) {
        this.agencyUrn = agencyUrn;
    }

    public AssumeAgencyReqBody withAgencySessionName(String agencySessionName) {
        this.agencySessionName = agencySessionName;
        return this;
    }

    /**
     * 委托会话的会话名。
     * @return agencySessionName
     */
    public String getAgencySessionName() {
        return agencySessionName;
    }

    public void setAgencySessionName(String agencySessionName) {
        this.agencySessionName = agencySessionName;
    }

    public AssumeAgencyReqBody withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * 调用者绑定的MFA设备的序列号。
     * @return serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public AssumeAgencyReqBody withTokenCode(String tokenCode) {
        this.tokenCode = tokenCode;
        return this;
    }

    /**
     * 调用者绑定的MFA设备上的6位数字码。
     * @return tokenCode
     */
    public String getTokenCode() {
        return tokenCode;
    }

    public void setTokenCode(String tokenCode) {
        this.tokenCode = tokenCode;
    }

    public AssumeAgencyReqBody withSourceIdentity(String sourceIdentity) {
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

    public AssumeAgencyReqBody withTags(List<TagDto> tags) {
        this.tags = tags;
        return this;
    }

    public AssumeAgencyReqBody addTagsItem(TagDto tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public AssumeAgencyReqBody withTags(Consumer<List<TagDto>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 自定义标签列表。
     * @return tags
     */
    public List<TagDto> getTags() {
        return tags;
    }

    public void setTags(List<TagDto> tags) {
        this.tags = tags;
    }

    public AssumeAgencyReqBody withTransitiveTagKeys(List<String> transitiveTagKeys) {
        this.transitiveTagKeys = transitiveTagKeys;
        return this;
    }

    public AssumeAgencyReqBody addTransitiveTagKeysItem(String transitiveTagKeysItem) {
        if (this.transitiveTagKeys == null) {
            this.transitiveTagKeys = new ArrayList<>();
        }
        this.transitiveTagKeys.add(transitiveTagKeysItem);
        return this;
    }

    public AssumeAgencyReqBody withTransitiveTagKeys(Consumer<List<String>> transitiveTagKeysSetter) {
        if (this.transitiveTagKeys == null) {
            this.transitiveTagKeys = new ArrayList<>();
        }
        transitiveTagKeysSetter.accept(this.transitiveTagKeys);
        return this;
    }

    /**
     * 随着临时安全凭证调用链持续透传的标签键列表。
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
        AssumeAgencyReqBody that = (AssumeAgencyReqBody) obj;
        return Objects.equals(this.durationSeconds, that.durationSeconds)
            && Objects.equals(this.externalId, that.externalId) && Objects.equals(this.policy, that.policy)
            && Objects.equals(this.policyIds, that.policyIds) && Objects.equals(this.agencyUrn, that.agencyUrn)
            && Objects.equals(this.agencySessionName, that.agencySessionName)
            && Objects.equals(this.serialNumber, that.serialNumber) && Objects.equals(this.tokenCode, that.tokenCode)
            && Objects.equals(this.sourceIdentity, that.sourceIdentity) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.transitiveTagKeys, that.transitiveTagKeys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(durationSeconds,
            externalId,
            policy,
            policyIds,
            agencyUrn,
            agencySessionName,
            serialNumber,
            tokenCode,
            sourceIdentity,
            tags,
            transitiveTagKeys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssumeAgencyReqBody {\n");
        sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
        sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    policyIds: ").append(toIndentedString(policyIds)).append("\n");
        sb.append("    agencyUrn: ").append(toIndentedString(agencyUrn)).append("\n");
        sb.append("    agencySessionName: ").append(toIndentedString(agencySessionName)).append("\n");
        sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
        sb.append("    tokenCode: ").append(toIndentedString(tokenCode)).append("\n");
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
