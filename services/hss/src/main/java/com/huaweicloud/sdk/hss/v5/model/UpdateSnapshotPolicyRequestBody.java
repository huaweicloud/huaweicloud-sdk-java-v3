package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新快照策略请求体
 */
public class UpdateSnapshotPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_task_status")

    private String scheduledTaskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_task_time")

    private Integer scheduledTaskTime;

    public UpdateSnapshotPolicyRequestBody withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 服务器id
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public UpdateSnapshotPolicyRequestBody withScheduledTaskStatus(String scheduledTaskStatus) {
        this.scheduledTaskStatus = scheduledTaskStatus;
        return this;
    }

    /**
     * 是否开启定时快照 |-closed：关闭， -opened：开启
     * @return scheduledTaskStatus
     */
    public String getScheduledTaskStatus() {
        return scheduledTaskStatus;
    }

    public void setScheduledTaskStatus(String scheduledTaskStatus) {
        this.scheduledTaskStatus = scheduledTaskStatus;
    }

    public UpdateSnapshotPolicyRequestBody withScheduledTaskTime(Integer scheduledTaskTime) {
        this.scheduledTaskTime = scheduledTaskTime;
        return this;
    }

    /**
     * 主机每天定时快照的时间，支持整点，0-23, 默认时间为零点。
     * minimum: 0
     * maximum: 23
     * @return scheduledTaskTime
     */
    public Integer getScheduledTaskTime() {
        return scheduledTaskTime;
    }

    public void setScheduledTaskTime(Integer scheduledTaskTime) {
        this.scheduledTaskTime = scheduledTaskTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSnapshotPolicyRequestBody that = (UpdateSnapshotPolicyRequestBody) obj;
        return Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.scheduledTaskStatus, that.scheduledTaskStatus)
            && Objects.equals(this.scheduledTaskTime, that.scheduledTaskTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId, scheduledTaskStatus, scheduledTaskTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSnapshotPolicyRequestBody {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    scheduledTaskStatus: ").append(toIndentedString(scheduledTaskStatus)).append("\n");
        sb.append("    scheduledTaskTime: ").append(toIndentedString(scheduledTaskTime)).append("\n");
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
