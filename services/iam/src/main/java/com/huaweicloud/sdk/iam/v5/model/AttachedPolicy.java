package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * AttachedPolicy
 */
public class AttachedPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn")

    private String urn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_at")

    private OffsetDateTime attachedAt;

    public AttachedPolicy withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 身份策略名称，长度为1到128个字符，只包含字母、数字、\"_\"、\"+\"、\"=\"、\".\"、\"@\"和\"-\"的字符串。
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public AttachedPolicy withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 身份策略ID，长度为1到64个字符，只包含字母、数字和\"-\"的字符串。
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public AttachedPolicy withUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * 统一资源名称。
     * @return urn
     */
    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public AttachedPolicy withAttachedAt(OffsetDateTime attachedAt) {
        this.attachedAt = attachedAt;
        return this;
    }

    /**
     * 身份策略的附加时间。
     * @return attachedAt
     */
    public OffsetDateTime getAttachedAt() {
        return attachedAt;
    }

    public void setAttachedAt(OffsetDateTime attachedAt) {
        this.attachedAt = attachedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachedPolicy that = (AttachedPolicy) obj;
        return Objects.equals(this.policyName, that.policyName) && Objects.equals(this.policyId, that.policyId)
            && Objects.equals(this.urn, that.urn) && Objects.equals(this.attachedAt, that.attachedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyName, policyId, urn, attachedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachedPolicy {\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
        sb.append("    attachedAt: ").append(toIndentedString(attachedAt)).append("\n");
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
