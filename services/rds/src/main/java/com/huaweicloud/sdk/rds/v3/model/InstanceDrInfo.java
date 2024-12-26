package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * InstanceDrInfo
 */
public class InstanceDrInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_message")

    private String failedMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replica_state")

    private String replicaState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wal_write_receive_delay_in_mb")

    private String walWriteReceiveDelayInMb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wal_write_replay_delay_in_mb")

    private String walWriteReplayDelayInMb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wal_receive_replay_delay_in_ms")

    private String walReceiveReplayDelayInMs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_instance_id")

    private String masterInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_region")

    private String masterRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_instance_id")

    private String slaveInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_region")

    private String slaveRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Long time;

    public InstanceDrInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 容灾关系id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public InstanceDrInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 容灾搭建状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public InstanceDrInfo withFailedMessage(String failedMessage) {
        this.failedMessage = failedMessage;
        return this;
    }

    /**
     * 失败消息
     * @return failedMessage
     */
    public String getFailedMessage() {
        return failedMessage;
    }

    public void setFailedMessage(String failedMessage) {
        this.failedMessage = failedMessage;
    }

    public InstanceDrInfo withReplicaState(String replicaState) {
        this.replicaState = replicaState;
        return this;
    }

    /**
     * 同步状态，取值范围是0或-1，0表示正常，-1表示异常。
     * @return replicaState
     */
    public String getReplicaState() {
        return replicaState;
    }

    public void setReplicaState(String replicaState) {
        this.replicaState = replicaState;
    }

    public InstanceDrInfo withWalWriteReceiveDelayInMb(String walWriteReceiveDelayInMb) {
        this.walWriteReceiveDelayInMb = walWriteReceiveDelayInMb;
        return this;
    }

    /**
     * 发送延迟大小（MB），即主实例当前wal日志写入位点与灾备实例当前接收wal日志位点的差值。
     * @return walWriteReceiveDelayInMb
     */
    public String getWalWriteReceiveDelayInMb() {
        return walWriteReceiveDelayInMb;
    }

    public void setWalWriteReceiveDelayInMb(String walWriteReceiveDelayInMb) {
        this.walWriteReceiveDelayInMb = walWriteReceiveDelayInMb;
    }

    public InstanceDrInfo withWalWriteReplayDelayInMb(String walWriteReplayDelayInMb) {
        this.walWriteReplayDelayInMb = walWriteReplayDelayInMb;
        return this;
    }

    /**
     * 端到端延迟大小（MB），即主实例当前wal日志写入位点与灾备实例当前回放wal日志位点的差值。
     * @return walWriteReplayDelayInMb
     */
    public String getWalWriteReplayDelayInMb() {
        return walWriteReplayDelayInMb;
    }

    public void setWalWriteReplayDelayInMb(String walWriteReplayDelayInMb) {
        this.walWriteReplayDelayInMb = walWriteReplayDelayInMb;
    }

    public InstanceDrInfo withWalReceiveReplayDelayInMs(String walReceiveReplayDelayInMs) {
        this.walReceiveReplayDelayInMs = walReceiveReplayDelayInMs;
        return this;
    }

    /**
     * 回放延迟时间（ms），即数据在灾备上回放的延迟时间。
     * @return walReceiveReplayDelayInMs
     */
    public String getWalReceiveReplayDelayInMs() {
        return walReceiveReplayDelayInMs;
    }

    public void setWalReceiveReplayDelayInMs(String walReceiveReplayDelayInMs) {
        this.walReceiveReplayDelayInMs = walReceiveReplayDelayInMs;
    }

    public InstanceDrInfo withMasterInstanceId(String masterInstanceId) {
        this.masterInstanceId = masterInstanceId;
        return this;
    }

    /**
     * 主实例ID
     * @return masterInstanceId
     */
    public String getMasterInstanceId() {
        return masterInstanceId;
    }

    public void setMasterInstanceId(String masterInstanceId) {
        this.masterInstanceId = masterInstanceId;
    }

    public InstanceDrInfo withMasterRegion(String masterRegion) {
        this.masterRegion = masterRegion;
        return this;
    }

    /**
     * 主实例所在region
     * @return masterRegion
     */
    public String getMasterRegion() {
        return masterRegion;
    }

    public void setMasterRegion(String masterRegion) {
        this.masterRegion = masterRegion;
    }

    public InstanceDrInfo withSlaveInstanceId(String slaveInstanceId) {
        this.slaveInstanceId = slaveInstanceId;
        return this;
    }

    /**
     * 灾备实例ID
     * @return slaveInstanceId
     */
    public String getSlaveInstanceId() {
        return slaveInstanceId;
    }

    public void setSlaveInstanceId(String slaveInstanceId) {
        this.slaveInstanceId = slaveInstanceId;
    }

    public InstanceDrInfo withSlaveRegion(String slaveRegion) {
        this.slaveRegion = slaveRegion;
        return this;
    }

    /**
     * 灾备实例所在region
     * @return slaveRegion
     */
    public String getSlaveRegion() {
        return slaveRegion;
    }

    public void setSlaveRegion(String slaveRegion) {
        this.slaveRegion = slaveRegion;
    }

    public InstanceDrInfo withTime(Long time) {
        this.time = time;
        return this;
    }

    /**
     * 灾备搭建时间
     * @return time
     */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceDrInfo that = (InstanceDrInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.failedMessage, that.failedMessage)
            && Objects.equals(this.replicaState, that.replicaState)
            && Objects.equals(this.walWriteReceiveDelayInMb, that.walWriteReceiveDelayInMb)
            && Objects.equals(this.walWriteReplayDelayInMb, that.walWriteReplayDelayInMb)
            && Objects.equals(this.walReceiveReplayDelayInMs, that.walReceiveReplayDelayInMs)
            && Objects.equals(this.masterInstanceId, that.masterInstanceId)
            && Objects.equals(this.masterRegion, that.masterRegion)
            && Objects.equals(this.slaveInstanceId, that.slaveInstanceId)
            && Objects.equals(this.slaveRegion, that.slaveRegion) && Objects.equals(this.time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            status,
            failedMessage,
            replicaState,
            walWriteReceiveDelayInMb,
            walWriteReplayDelayInMb,
            walReceiveReplayDelayInMs,
            masterInstanceId,
            masterRegion,
            slaveInstanceId,
            slaveRegion,
            time);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceDrInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    failedMessage: ").append(toIndentedString(failedMessage)).append("\n");
        sb.append("    replicaState: ").append(toIndentedString(replicaState)).append("\n");
        sb.append("    walWriteReceiveDelayInMb: ").append(toIndentedString(walWriteReceiveDelayInMb)).append("\n");
        sb.append("    walWriteReplayDelayInMb: ").append(toIndentedString(walWriteReplayDelayInMb)).append("\n");
        sb.append("    walReceiveReplayDelayInMs: ").append(toIndentedString(walReceiveReplayDelayInMs)).append("\n");
        sb.append("    masterInstanceId: ").append(toIndentedString(masterInstanceId)).append("\n");
        sb.append("    masterRegion: ").append(toIndentedString(masterRegion)).append("\n");
        sb.append("    slaveInstanceId: ").append(toIndentedString(slaveInstanceId)).append("\n");
        sb.append("    slaveRegion: ").append(toIndentedString(slaveRegion)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
