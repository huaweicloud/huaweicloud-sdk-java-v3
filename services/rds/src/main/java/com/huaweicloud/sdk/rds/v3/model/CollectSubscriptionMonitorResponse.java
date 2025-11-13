package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CollectSubscriptionMonitorResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latency")

    private Integer latency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_dist_sync")

    private String lastDistSync;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_not_running")

    private Integer agentNotRunning;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pending_cmd_count")

    private Integer pendingCmdCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estimated_process_time")

    private Integer estimatedProcessTime;

    public CollectSubscriptionMonitorResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 订阅关联的快照代理的运行状态。取值如下:  started:已启动。 succeeded:成功。 in_progress:正在运行。 idle:空闲。 retrying:重试中。 failed:失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CollectSubscriptionMonitorResponse withLatency(Integer latency) {
        this.latency = latency;
        return this;
    }

    /**
     * 数据更改的最长延迟时间（以秒为单位）。
     * @return latency
     */
    public Integer getLatency() {
        return latency;
    }

    public void setLatency(Integer latency) {
        this.latency = latency;
    }

    public CollectSubscriptionMonitorResponse withLastDistSync(String lastDistSync) {
        this.lastDistSync = lastDistSync;
        return this;
    }

    /**
     * 上一次分发代理运行时间。格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return lastDistSync
     */
    public String getLastDistSync() {
        return lastDistSync;
    }

    public void setLastDistSync(String lastDistSync) {
        this.lastDistSync = lastDistSync;
    }

    public CollectSubscriptionMonitorResponse withAgentNotRunning(Integer agentNotRunning) {
        this.agentNotRunning = agentNotRunning;
        return this;
    }

    /**
     * 代理未运行的时长（以小时为单位）。
     * @return agentNotRunning
     */
    public Integer getAgentNotRunning() {
        return agentNotRunning;
    }

    public void setAgentNotRunning(Integer agentNotRunning) {
        this.agentNotRunning = agentNotRunning;
    }

    public CollectSubscriptionMonitorResponse withPendingCmdCount(Integer pendingCmdCount) {
        this.pendingCmdCount = pendingCmdCount;
        return this;
    }

    /**
     * 订阅未执行的命令数。
     * @return pendingCmdCount
     */
    public Integer getPendingCmdCount() {
        return pendingCmdCount;
    }

    public void setPendingCmdCount(Integer pendingCmdCount) {
        this.pendingCmdCount = pendingCmdCount;
    }

    public CollectSubscriptionMonitorResponse withEstimatedProcessTime(Integer estimatedProcessTime) {
        this.estimatedProcessTime = estimatedProcessTime;
        return this;
    }

    /**
     * 预计执行完未执行的命令数所需时间（以秒为单位）。
     * @return estimatedProcessTime
     */
    public Integer getEstimatedProcessTime() {
        return estimatedProcessTime;
    }

    public void setEstimatedProcessTime(Integer estimatedProcessTime) {
        this.estimatedProcessTime = estimatedProcessTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CollectSubscriptionMonitorResponse that = (CollectSubscriptionMonitorResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.latency, that.latency)
            && Objects.equals(this.lastDistSync, that.lastDistSync)
            && Objects.equals(this.agentNotRunning, that.agentNotRunning)
            && Objects.equals(this.pendingCmdCount, that.pendingCmdCount)
            && Objects.equals(this.estimatedProcessTime, that.estimatedProcessTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, latency, lastDistSync, agentNotRunning, pendingCmdCount, estimatedProcessTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollectSubscriptionMonitorResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    latency: ").append(toIndentedString(latency)).append("\n");
        sb.append("    lastDistSync: ").append(toIndentedString(lastDistSync)).append("\n");
        sb.append("    agentNotRunning: ").append(toIndentedString(agentNotRunning)).append("\n");
        sb.append("    pendingCmdCount: ").append(toIndentedString(pendingCmdCount)).append("\n");
        sb.append("    estimatedProcessTime: ").append(toIndentedString(estimatedProcessTime)).append("\n");
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
