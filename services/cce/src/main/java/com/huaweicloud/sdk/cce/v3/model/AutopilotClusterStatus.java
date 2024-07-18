package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class AutopilotClusterStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private String phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobID")

    private String jobID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoints")

    private List<AutopilotClusterEndpoints> endpoints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isLocked")

    private Boolean isLocked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lockScene")

    private String lockScene;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lockSource")

    private String lockSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lockSourceId")

    private String lockSourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleteOption")

    private Object deleteOption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleteStatus")

    private Object deleteStatus;

    public AutopilotClusterStatus withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * 集群状态，取值如下 - Available：可用，表示集群处于正常状态。 - Unavailable：不可用，表示集群异常，需手动删除。 - Creating：创建中，表示集群正处于创建过程中。 - Deleting：删除中，表示集群正处于删除过程中。 - Upgrading：升级中，表示集群正处于升级过程中。 - RollingBack：回滚中，表示集群正处于回滚过程中。 - RollbackFailed：回滚异常，表示集群回滚异常。 - Error：错误，表示集群资源异常，可尝试手动删除。
     * @return phase
     */
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public AutopilotClusterStatus withJobID(String jobID) {
        this.jobID = jobID;
        return this;
    }

    /**
     * 任务ID,集群当前状态关联的任务ID。当前支持: - 创建集群时返回关联的任务ID，可通过任务ID查询创建集群的附属任务信息； - 删除集群或者删除集群失败时返回关联的任务ID，此字段非空时，可通过任务ID查询删除集群的附属任务信息。 > 任务信息具有一定时效性，仅用于短期跟踪任务进度，请勿用于集群状态判断等额外场景。
     * @return jobID
     */
    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    public AutopilotClusterStatus withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 集群变为当前状态的原因，在集群在非“Available”状态下时，会返回此参数。
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public AutopilotClusterStatus withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 集群变为当前状态的原因的详细信息，在集群在非“Available”状态下时，会返回此参数。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AutopilotClusterStatus withEndpoints(List<AutopilotClusterEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public AutopilotClusterStatus addEndpointsItem(AutopilotClusterEndpoints endpointsItem) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        this.endpoints.add(endpointsItem);
        return this;
    }

    public AutopilotClusterStatus withEndpoints(Consumer<List<AutopilotClusterEndpoints>> endpointsSetter) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        endpointsSetter.accept(this.endpoints);
        return this;
    }

    /**
     * 集群中 kube-apiserver 的访问地址。
     * @return endpoints
     */
    public List<AutopilotClusterEndpoints> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<AutopilotClusterEndpoints> endpoints) {
        this.endpoints = endpoints;
    }

    public AutopilotClusterStatus withIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
        return this;
    }

    /**
     * CBC资源锁定
     * @return isLocked
     */
    public Boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    public AutopilotClusterStatus withLockScene(String lockScene) {
        this.lockScene = lockScene;
        return this;
    }

    /**
     * CBC资源锁定场景
     * @return lockScene
     */
    public String getLockScene() {
        return lockScene;
    }

    public void setLockScene(String lockScene) {
        this.lockScene = lockScene;
    }

    public AutopilotClusterStatus withLockSource(String lockSource) {
        this.lockSource = lockSource;
        return this;
    }

    /**
     * 锁定资源
     * @return lockSource
     */
    public String getLockSource() {
        return lockSource;
    }

    public void setLockSource(String lockSource) {
        this.lockSource = lockSource;
    }

    public AutopilotClusterStatus withLockSourceId(String lockSourceId) {
        this.lockSourceId = lockSourceId;
        return this;
    }

    /**
     * 锁定的资源ID
     * @return lockSourceId
     */
    public String getLockSourceId() {
        return lockSourceId;
    }

    public void setLockSourceId(String lockSourceId) {
        this.lockSourceId = lockSourceId;
    }

    public AutopilotClusterStatus withDeleteOption(Object deleteOption) {
        this.deleteOption = deleteOption;
        return this;
    }

    /**
     * 删除配置状态（仅删除请求响应包含）
     * @return deleteOption
     */
    public Object getDeleteOption() {
        return deleteOption;
    }

    public void setDeleteOption(Object deleteOption) {
        this.deleteOption = deleteOption;
    }

    public AutopilotClusterStatus withDeleteStatus(Object deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }

    /**
     * 删除状态信息（仅删除请求响应包含）
     * @return deleteStatus
     */
    public Object getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Object deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutopilotClusterStatus that = (AutopilotClusterStatus) obj;
        return Objects.equals(this.phase, that.phase) && Objects.equals(this.jobID, that.jobID)
            && Objects.equals(this.reason, that.reason) && Objects.equals(this.message, that.message)
            && Objects.equals(this.endpoints, that.endpoints) && Objects.equals(this.isLocked, that.isLocked)
            && Objects.equals(this.lockScene, that.lockScene) && Objects.equals(this.lockSource, that.lockSource)
            && Objects.equals(this.lockSourceId, that.lockSourceId)
            && Objects.equals(this.deleteOption, that.deleteOption)
            && Objects.equals(this.deleteStatus, that.deleteStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phase,
            jobID,
            reason,
            message,
            endpoints,
            isLocked,
            lockScene,
            lockSource,
            lockSourceId,
            deleteOption,
            deleteStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutopilotClusterStatus {\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    jobID: ").append(toIndentedString(jobID)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
        sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
        sb.append("    lockScene: ").append(toIndentedString(lockScene)).append("\n");
        sb.append("    lockSource: ").append(toIndentedString(lockSource)).append("\n");
        sb.append("    lockSourceId: ").append(toIndentedString(lockSourceId)).append("\n");
        sb.append("    deleteOption: ").append(toIndentedString(deleteOption)).append("\n");
        sb.append("    deleteStatus: ").append(toIndentedString(deleteStatus)).append("\n");
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
