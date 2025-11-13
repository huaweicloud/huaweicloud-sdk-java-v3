package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Response Object
 */
public class CollectPublicationMonitorResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "worst_latency")

    private Integer worstLatency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "best_latency")

    private Integer bestLatency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average_latency")

    private Integer averageLatency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_dist_sync")

    private String lastDistSync;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replicated_transactions")

    private Integer replicatedTransactions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_rate_trans")

    private BigDecimal replicationRateTrans;

    public CollectPublicationMonitorResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 发布关联的快照代理的运行状态。取值如下:  started:已启动。 succeeded:成功。 in_progress:正在运行。 idle:空闲。 retrying:重试中。 failed:失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CollectPublicationMonitorResponse withWorstLatency(Integer worstLatency) {
        this.worstLatency = worstLatency;
        return this;
    }

    /**
     * 数据更改的最长延迟时间（以秒为单位）。
     * @return worstLatency
     */
    public Integer getWorstLatency() {
        return worstLatency;
    }

    public void setWorstLatency(Integer worstLatency) {
        this.worstLatency = worstLatency;
    }

    public CollectPublicationMonitorResponse withBestLatency(Integer bestLatency) {
        this.bestLatency = bestLatency;
        return this;
    }

    /**
     * 数据更改的最短延迟时间（以秒为单位）。
     * @return bestLatency
     */
    public Integer getBestLatency() {
        return bestLatency;
    }

    public void setBestLatency(Integer bestLatency) {
        this.bestLatency = bestLatency;
    }

    public CollectPublicationMonitorResponse withAverageLatency(Integer averageLatency) {
        this.averageLatency = averageLatency;
        return this;
    }

    /**
     * 数据更改的平均延迟时间（以秒为单位）。
     * @return averageLatency
     */
    public Integer getAverageLatency() {
        return averageLatency;
    }

    public void setAverageLatency(Integer averageLatency) {
        this.averageLatency = averageLatency;
    }

    public CollectPublicationMonitorResponse withLastDistSync(String lastDistSync) {
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

    public CollectPublicationMonitorResponse withReplicatedTransactions(Integer replicatedTransactions) {
        this.replicatedTransactions = replicatedTransactions;
        return this;
    }

    /**
     * 等待传送到分发数据库的事务数。
     * @return replicatedTransactions
     */
    public Integer getReplicatedTransactions() {
        return replicatedTransactions;
    }

    public void setReplicatedTransactions(Integer replicatedTransactions) {
        this.replicatedTransactions = replicatedTransactions;
    }

    public CollectPublicationMonitorResponse withReplicationRateTrans(BigDecimal replicationRateTrans) {
        this.replicationRateTrans = replicationRateTrans;
        return this;
    }

    /**
     * 平均每秒传送到分发数据库的事务数。
     * @return replicationRateTrans
     */
    public BigDecimal getReplicationRateTrans() {
        return replicationRateTrans;
    }

    public void setReplicationRateTrans(BigDecimal replicationRateTrans) {
        this.replicationRateTrans = replicationRateTrans;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CollectPublicationMonitorResponse that = (CollectPublicationMonitorResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.worstLatency, that.worstLatency)
            && Objects.equals(this.bestLatency, that.bestLatency)
            && Objects.equals(this.averageLatency, that.averageLatency)
            && Objects.equals(this.lastDistSync, that.lastDistSync)
            && Objects.equals(this.replicatedTransactions, that.replicatedTransactions)
            && Objects.equals(this.replicationRateTrans, that.replicationRateTrans);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status,
            worstLatency,
            bestLatency,
            averageLatency,
            lastDistSync,
            replicatedTransactions,
            replicationRateTrans);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollectPublicationMonitorResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    worstLatency: ").append(toIndentedString(worstLatency)).append("\n");
        sb.append("    bestLatency: ").append(toIndentedString(bestLatency)).append("\n");
        sb.append("    averageLatency: ").append(toIndentedString(averageLatency)).append("\n");
        sb.append("    lastDistSync: ").append(toIndentedString(lastDistSync)).append("\n");
        sb.append("    replicatedTransactions: ").append(toIndentedString(replicatedTransactions)).append("\n");
        sb.append("    replicationRateTrans: ").append(toIndentedString(replicationRateTrans)).append("\n");
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
