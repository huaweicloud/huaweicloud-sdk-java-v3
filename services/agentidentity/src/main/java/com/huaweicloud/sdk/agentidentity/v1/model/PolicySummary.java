package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PolicySummary
 */
public class PolicySummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn")

    private String urn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private PolicyStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_reasons")

    private List<String> statusReasons = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_engine_id")

    private String policyEngineId;

    public PolicySummary withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * System-generated unique identifier for the policy.
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public PolicySummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Human-readable display name for the policy
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PolicySummary withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 策略的可读描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PolicySummary withUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * The URN of the policy.
     * @return urn
     */
    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public PolicySummary withStatus(PolicyStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public PolicyStatus getStatus() {
        return status;
    }

    public void setStatus(PolicyStatus status) {
        this.status = status;
    }

    public PolicySummary withStatusReasons(List<String> statusReasons) {
        this.statusReasons = statusReasons;
        return this;
    }

    public PolicySummary addStatusReasonsItem(String statusReasonsItem) {
        if (this.statusReasons == null) {
            this.statusReasons = new ArrayList<>();
        }
        this.statusReasons.add(statusReasonsItem);
        return this;
    }

    public PolicySummary withStatusReasons(Consumer<List<String>> statusReasonsSetter) {
        if (this.statusReasons == null) {
            this.statusReasons = new ArrayList<>();
        }
        statusReasonsSetter.accept(this.statusReasons);
        return this;
    }

    /**
     * 关于策略状态的额外信息，提供关于任何失败或策略创建过程当前状态的详细信息。
     * @return statusReasons
     */
    public List<String> getStatusReasons() {
        return statusReasons;
    }

    public void setStatusReasons(List<String> statusReasons) {
        this.statusReasons = statusReasons;
    }

    public PolicySummary withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Timestamp in RFC 3339 format (UTC)
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public PolicySummary withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Timestamp in RFC 3339 format (UTC)
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public PolicySummary withPolicyEngineId(String policyEngineId) {
        this.policyEngineId = policyEngineId;
        return this;
    }

    /**
     * System-generated unique identifier for the policy engine.
     * @return policyEngineId
     */
    public String getPolicyEngineId() {
        return policyEngineId;
    }

    public void setPolicyEngineId(String policyEngineId) {
        this.policyEngineId = policyEngineId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicySummary that = (PolicySummary) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.urn, that.urn)
            && Objects.equals(this.status, that.status) && Objects.equals(this.statusReasons, that.statusReasons)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.policyEngineId, that.policyEngineId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(policyId, name, description, urn, status, statusReasons, createdAt, updatedAt, policyEngineId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicySummary {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusReasons: ").append(toIndentedString(statusReasons)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    policyEngineId: ").append(toIndentedString(policyEngineId)).append("\n");
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
