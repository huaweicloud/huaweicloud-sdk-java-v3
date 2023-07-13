package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 双活实例rsync同步状态指标值
 */
public class NoSQLDrDateSyncIndicators {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rsync_ops")

    private Long rsyncOps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rsync_wal_size")

    private Long rsyncWalSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rsync_push_cost")

    private Long rsyncPushCost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rsync_send_cost")

    private Long rsyncSendCost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rsync_max_push_cost")

    private Long rsyncMaxPushCost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rsync_max_send_cost")

    private Long rsyncMaxSendCost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rsync_status")

    private Integer rsyncStatus;

    public NoSQLDrDateSyncIndicators withRsyncOps(Long rsyncOps) {
        this.rsyncOps = rsyncOps;
        return this;
    }

    /**
     * 节点内同步命令的执行速率,每秒多少条数据；
     * @return rsyncOps
     */
    public Long getRsyncOps() {
        return rsyncOps;
    }

    public void setRsyncOps(Long rsyncOps) {
        this.rsyncOps = rsyncOps;
    }

    public NoSQLDrDateSyncIndicators withRsyncWalSize(Long rsyncWalSize) {
        this.rsyncWalSize = rsyncWalSize;
        return this;
    }

    /**
     * 节点内的同步WAL堆积大小,单位MB；
     * @return rsyncWalSize
     */
    public Long getRsyncWalSize() {
        return rsyncWalSize;
    }

    public void setRsyncWalSize(Long rsyncWalSize) {
        this.rsyncWalSize = rsyncWalSize;
    }

    public NoSQLDrDateSyncIndicators withRsyncPushCost(Long rsyncPushCost) {
        this.rsyncPushCost = rsyncPushCost;
        return this;
    }

    /**
     * 同步消息从放入消息队列，直到收到对端响应的平均耗时，单位us；
     * @return rsyncPushCost
     */
    public Long getRsyncPushCost() {
        return rsyncPushCost;
    }

    public void setRsyncPushCost(Long rsyncPushCost) {
        this.rsyncPushCost = rsyncPushCost;
    }

    public NoSQLDrDateSyncIndicators withRsyncSendCost(Long rsyncSendCost) {
        this.rsyncSendCost = rsyncSendCost;
        return this;
    }

    /**
     * 同步消息从消息队列取出，直到收到对端响应的平均耗时，单位us；
     * @return rsyncSendCost
     */
    public Long getRsyncSendCost() {
        return rsyncSendCost;
    }

    public void setRsyncSendCost(Long rsyncSendCost) {
        this.rsyncSendCost = rsyncSendCost;
    }

    public NoSQLDrDateSyncIndicators withRsyncMaxPushCost(Long rsyncMaxPushCost) {
        this.rsyncMaxPushCost = rsyncMaxPushCost;
        return this;
    }

    /**
     * 采集周期内rsync的同步推送耗时最大值，单位us;
     * @return rsyncMaxPushCost
     */
    public Long getRsyncMaxPushCost() {
        return rsyncMaxPushCost;
    }

    public void setRsyncMaxPushCost(Long rsyncMaxPushCost) {
        this.rsyncMaxPushCost = rsyncMaxPushCost;
    }

    public NoSQLDrDateSyncIndicators withRsyncMaxSendCost(Long rsyncMaxSendCost) {
        this.rsyncMaxSendCost = rsyncMaxSendCost;
        return this;
    }

    /**
     * 采集周期内rsync的同步发送耗时最大值，单位us;
     * @return rsyncMaxSendCost
     */
    public Long getRsyncMaxSendCost() {
        return rsyncMaxSendCost;
    }

    public void setRsyncMaxSendCost(Long rsyncMaxSendCost) {
        this.rsyncMaxSendCost = rsyncMaxSendCost;
    }

    public NoSQLDrDateSyncIndicators withRsyncStatus(Integer rsyncStatus) {
        this.rsyncStatus = rsyncStatus;
        return this;
    }

    /**
     * rsync的同步状态，1表示正在同步，0表示没有同步;
     * @return rsyncStatus
     */
    public Integer getRsyncStatus() {
        return rsyncStatus;
    }

    public void setRsyncStatus(Integer rsyncStatus) {
        this.rsyncStatus = rsyncStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NoSQLDrDateSyncIndicators that = (NoSQLDrDateSyncIndicators) obj;
        return Objects.equals(this.rsyncOps, that.rsyncOps) && Objects.equals(this.rsyncWalSize, that.rsyncWalSize)
            && Objects.equals(this.rsyncPushCost, that.rsyncPushCost)
            && Objects.equals(this.rsyncSendCost, that.rsyncSendCost)
            && Objects.equals(this.rsyncMaxPushCost, that.rsyncMaxPushCost)
            && Objects.equals(this.rsyncMaxSendCost, that.rsyncMaxSendCost)
            && Objects.equals(this.rsyncStatus, that.rsyncStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rsyncOps,
            rsyncWalSize,
            rsyncPushCost,
            rsyncSendCost,
            rsyncMaxPushCost,
            rsyncMaxSendCost,
            rsyncStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NoSQLDrDateSyncIndicators {\n");
        sb.append("    rsyncOps: ").append(toIndentedString(rsyncOps)).append("\n");
        sb.append("    rsyncWalSize: ").append(toIndentedString(rsyncWalSize)).append("\n");
        sb.append("    rsyncPushCost: ").append(toIndentedString(rsyncPushCost)).append("\n");
        sb.append("    rsyncSendCost: ").append(toIndentedString(rsyncSendCost)).append("\n");
        sb.append("    rsyncMaxPushCost: ").append(toIndentedString(rsyncMaxPushCost)).append("\n");
        sb.append("    rsyncMaxSendCost: ").append(toIndentedString(rsyncMaxSendCost)).append("\n");
        sb.append("    rsyncStatus: ").append(toIndentedString(rsyncStatus)).append("\n");
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
