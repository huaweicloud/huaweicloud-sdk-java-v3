package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 同步记录详细信息。 **取值范围**： 不涉及。
 */
public class IdentitySourceSyncRecordVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_source_id")

    private String identitySourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_source_type")

    private String identitySourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_count")

    private Integer addCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_count")

    private Integer updateCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_count")

    private Integer deleteCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_count")

    private Integer failedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    public IdentitySourceSyncRecordVo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 记录ID。 **取值范围**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IdentitySourceSyncRecordVo withIdentitySourceId(String identitySourceId) {
        this.identitySourceId = identitySourceId;
        return this;
    }

    /**
     * **参数解释**： 身份源ID。 **取值范围**： 不涉及。
     * @return identitySourceId
     */
    public String getIdentitySourceId() {
        return identitySourceId;
    }

    public void setIdentitySourceId(String identitySourceId) {
        this.identitySourceId = identitySourceId;
    }

    public IdentitySourceSyncRecordVo withIdentitySourceType(String identitySourceType) {
        this.identitySourceType = identitySourceType;
        return this;
    }

    /**
     * **参数解释**： 身份源类型。 **取值范围**： 不涉及。
     * @return identitySourceType
     */
    public String getIdentitySourceType() {
        return identitySourceType;
    }

    public void setIdentitySourceType(String identitySourceType) {
        this.identitySourceType = identitySourceType;
    }

    public IdentitySourceSyncRecordVo withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 任务开始时间。 **取值范围**： 不涉及。
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public IdentitySourceSyncRecordVo withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**： 任务结束时间。 **取值范围**： 不涉及。
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public IdentitySourceSyncRecordVo withAddCount(Integer addCount) {
        this.addCount = addCount;
        return this;
    }

    /**
     * **参数解释**： 添加记录数。 **取值范围**： 大于等于0。
     * @return addCount
     */
    public Integer getAddCount() {
        return addCount;
    }

    public void setAddCount(Integer addCount) {
        this.addCount = addCount;
    }

    public IdentitySourceSyncRecordVo withUpdateCount(Integer updateCount) {
        this.updateCount = updateCount;
        return this;
    }

    /**
     * **参数解释**： 更新记录数。 **取值范围**： 大于等于0。
     * @return updateCount
     */
    public Integer getUpdateCount() {
        return updateCount;
    }

    public void setUpdateCount(Integer updateCount) {
        this.updateCount = updateCount;
    }

    public IdentitySourceSyncRecordVo withDeleteCount(Integer deleteCount) {
        this.deleteCount = deleteCount;
        return this;
    }

    /**
     * **参数解释**： 删除记录数。 **取值范围**： 大于等于0。
     * @return deleteCount
     */
    public Integer getDeleteCount() {
        return deleteCount;
    }

    public void setDeleteCount(Integer deleteCount) {
        this.deleteCount = deleteCount;
    }

    public IdentitySourceSyncRecordVo withFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }

    /**
     * **参数解释**： 失败记录数。 **取值范围**： 大于等于0。
     * @return failedCount
     */
    public Integer getFailedCount() {
        return failedCount;
    }

    public void setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
    }

    public IdentitySourceSyncRecordVo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 状态。 **取值范围**： 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public IdentitySourceSyncRecordVo withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * **参数解释**： 失败原因。 **取值范围**： 不涉及。
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IdentitySourceSyncRecordVo that = (IdentitySourceSyncRecordVo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.identitySourceId, that.identitySourceId)
            && Objects.equals(this.identitySourceType, that.identitySourceType)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.addCount, that.addCount) && Objects.equals(this.updateCount, that.updateCount)
            && Objects.equals(this.deleteCount, that.deleteCount) && Objects.equals(this.failedCount, that.failedCount)
            && Objects.equals(this.status, that.status) && Objects.equals(this.failReason, that.failReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            identitySourceId,
            identitySourceType,
            startTime,
            endTime,
            addCount,
            updateCount,
            deleteCount,
            failedCount,
            status,
            failReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdentitySourceSyncRecordVo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    identitySourceId: ").append(toIndentedString(identitySourceId)).append("\n");
        sb.append("    identitySourceType: ").append(toIndentedString(identitySourceType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    addCount: ").append(toIndentedString(addCount)).append("\n");
        sb.append("    updateCount: ").append(toIndentedString(updateCount)).append("\n");
        sb.append("    deleteCount: ").append(toIndentedString(deleteCount)).append("\n");
        sb.append("    failedCount: ").append(toIndentedString(failedCount)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
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
