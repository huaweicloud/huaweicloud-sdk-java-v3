package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RecordInfoResponseResult
 */
public class RecordInfoResponseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity_id")

    private String entityId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity_type")

    private String entityType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extended_info")

    private Object extendedInfo;

    public RecordInfoResponseResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**: 主键id。 **取值范围**: 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RecordInfoResponseResult withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释**: 动作。 **取值范围**: 不涉及。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public RecordInfoResponseResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: 操作状态。 **取值范围**: 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RecordInfoResponseResult withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释**: 信息。 **取值范围**: 不涉及。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public RecordInfoResponseResult withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * **参数解释**: 实体id。 **取值范围**: 不涉及。
     * @return entityId
     */
    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public RecordInfoResponseResult withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * **参数解释**: 实体类型。 **取值范围**: 不涉及。
     * @return entityType
     */
    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public RecordInfoResponseResult withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**: 工作流id。 **取值范围**: 不涉及。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public RecordInfoResponseResult withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**: 实例id。 **取值范围**: 不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public RecordInfoResponseResult withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释**: 创建时间。 **取值范围**: 不涉及。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public RecordInfoResponseResult withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释**: 更新时间。 **取值范围**: 不涉及。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public RecordInfoResponseResult withExtendedInfo(Object extendedInfo) {
        this.extendedInfo = extendedInfo;
        return this;
    }

    /**
     * **参数解释**: 扩展信息。 **取值范围**: 不涉及。
     * @return extendedInfo
     */
    public Object getExtendedInfo() {
        return extendedInfo;
    }

    public void setExtendedInfo(Object extendedInfo) {
        this.extendedInfo = extendedInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecordInfoResponseResult that = (RecordInfoResponseResult) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.action, that.action)
            && Objects.equals(this.status, that.status) && Objects.equals(this.message, that.message)
            && Objects.equals(this.entityId, that.entityId) && Objects.equals(this.entityType, that.entityType)
            && Objects.equals(this.jobId, that.jobId) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.extendedInfo, that.extendedInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            action,
            status,
            message,
            entityId,
            entityType,
            jobId,
            instanceId,
            createdAt,
            updatedAt,
            extendedInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecordInfoResponseResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
        sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    extendedInfo: ").append(toIndentedString(extendedInfo)).append("\n");
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
