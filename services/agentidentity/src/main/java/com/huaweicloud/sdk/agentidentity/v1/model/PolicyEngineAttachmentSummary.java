package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * PolicyEngineAttachmentSummary
 */
public class PolicyEngineAttachmentSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity_type")

    private EntityType entityType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity_id")

    private String entityId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private PolicyEngineMode mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_at")

    private OffsetDateTime attachedAt;

    public PolicyEngineAttachmentSummary withEntityType(EntityType entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * Get entityType
     * @return entityType
     */
    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public PolicyEngineAttachmentSummary withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * The unique identifier of the attached entity.
     * @return entityId
     */
    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public PolicyEngineAttachmentSummary withMode(PolicyEngineMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get mode
     * @return mode
     */
    public PolicyEngineMode getMode() {
        return mode;
    }

    public void setMode(PolicyEngineMode mode) {
        this.mode = mode;
    }

    public PolicyEngineAttachmentSummary withAttachedAt(OffsetDateTime attachedAt) {
        this.attachedAt = attachedAt;
        return this;
    }

    /**
     * Timestamp in RFC 3339 format (UTC)
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
        PolicyEngineAttachmentSummary that = (PolicyEngineAttachmentSummary) obj;
        return Objects.equals(this.entityType, that.entityType) && Objects.equals(this.entityId, that.entityId)
            && Objects.equals(this.mode, that.mode) && Objects.equals(this.attachedAt, that.attachedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entityType, entityId, mode, attachedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyEngineAttachmentSummary {\n");
        sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
        sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
