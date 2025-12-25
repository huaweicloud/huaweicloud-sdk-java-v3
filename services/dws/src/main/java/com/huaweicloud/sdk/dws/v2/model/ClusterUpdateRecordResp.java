package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 集群升级记录响应体。 **取值范围**： - update-cluster：升级集群。 - commit-cluster：提交集群。 - rollback-cluster：集群回滚。 - update-hotpatch：热补丁升级。 - rollback-hotpatch：热补丁回滚。
 */
public class ClusterUpdateRecordResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_id")

    private String itemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_type")

    private String recordType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_version")

    private String fromVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_version")

    private String toVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reason")

    private String failedReason;

    public ClusterUpdateRecordResp withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * **参数解释**： 升级项目ID。 **取值范围**： 不涉及。
     * @return itemId
     */
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public ClusterUpdateRecordResp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 升级状态。 **取值范围**： - Waiting：待升级。 - Update_Running：升级中。 - Update_Success：升级成功。 - Update_Failure：升级失败。 - Rollback_Running：回滚中。 - Rollback_Failure：回滚失败。 - Commit_Running：提交中。 - Commit_Failure：提交失败。 - Completed：升级完成。 - Disable：不支持升级。 - Install_Running：热补丁安装中。 - Uninstall_Failure：热补丁卸载重。 - Commit_HotPatch_Failure：热补丁提交失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ClusterUpdateRecordResp withRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * **参数解释**： 升级类型。 **取值范围**： 不涉及。
     * @return recordType
     */
    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public ClusterUpdateRecordResp withFromVersion(String fromVersion) {
        this.fromVersion = fromVersion;
        return this;
    }

    /**
     * **参数解释**： 升级前版本。 **取值范围**： 不涉及。
     * @return fromVersion
     */
    public String getFromVersion() {
        return fromVersion;
    }

    public void setFromVersion(String fromVersion) {
        this.fromVersion = fromVersion;
    }

    public ClusterUpdateRecordResp withToVersion(String toVersion) {
        this.toVersion = toVersion;
        return this;
    }

    /**
     * **参数解释**： 目标版本。 **取值范围**： 不涉及。
     * @return toVersion
     */
    public String getToVersion() {
        return toVersion;
    }

    public void setToVersion(String toVersion) {
        this.toVersion = toVersion;
    }

    public ClusterUpdateRecordResp withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 开始时间。 **取值范围**： 不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ClusterUpdateRecordResp withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**： 结束时间。 **取值范围**： 不涉及。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ClusterUpdateRecordResp withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**： 升级任务ID。 **取值范围**： 不涉及。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ClusterUpdateRecordResp withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /**
     * **参数解释**： 失败原因。 **取值范围**： 不涉及。
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterUpdateRecordResp that = (ClusterUpdateRecordResp) obj;
        return Objects.equals(this.itemId, that.itemId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.recordType, that.recordType) && Objects.equals(this.fromVersion, that.fromVersion)
            && Objects.equals(this.toVersion, that.toVersion) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.failedReason, that.failedReason);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(itemId, status, recordType, fromVersion, toVersion, startTime, endTime, jobId, failedReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterUpdateRecordResp {\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
        sb.append("    fromVersion: ").append(toIndentedString(fromVersion)).append("\n");
        sb.append("    toVersion: ").append(toIndentedString(toVersion)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
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
