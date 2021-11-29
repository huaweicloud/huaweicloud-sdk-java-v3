package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class ShowDrReplicaStatusResponse extends SdkResponse {

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

    public ShowDrReplicaStatusResponse withReplicaState(String replicaState) {
        this.replicaState = replicaState;
        return this;
    }

    /** 同步状态，取值范围是0或-1，0表示正常，-1表示异常。
     * 
     * @return replicaState */
    public String getReplicaState() {
        return replicaState;
    }

    public void setReplicaState(String replicaState) {
        this.replicaState = replicaState;
    }

    public ShowDrReplicaStatusResponse withWalWriteReceiveDelayInMb(String walWriteReceiveDelayInMb) {
        this.walWriteReceiveDelayInMb = walWriteReceiveDelayInMb;
        return this;
    }

    /** 发送延迟大小（MB），即主实例当前wal日志写入位点与灾备实例当前接收wal日志位点的差值。
     * 
     * @return walWriteReceiveDelayInMb */
    public String getWalWriteReceiveDelayInMb() {
        return walWriteReceiveDelayInMb;
    }

    public void setWalWriteReceiveDelayInMb(String walWriteReceiveDelayInMb) {
        this.walWriteReceiveDelayInMb = walWriteReceiveDelayInMb;
    }

    public ShowDrReplicaStatusResponse withWalWriteReplayDelayInMb(String walWriteReplayDelayInMb) {
        this.walWriteReplayDelayInMb = walWriteReplayDelayInMb;
        return this;
    }

    /** 端到端延迟大小（MB），即主实例当前wal日志写入位点与灾备实例当前回放wal日志位点的差值。
     * 
     * @return walWriteReplayDelayInMb */
    public String getWalWriteReplayDelayInMb() {
        return walWriteReplayDelayInMb;
    }

    public void setWalWriteReplayDelayInMb(String walWriteReplayDelayInMb) {
        this.walWriteReplayDelayInMb = walWriteReplayDelayInMb;
    }

    public ShowDrReplicaStatusResponse withWalReceiveReplayDelayInMs(String walReceiveReplayDelayInMs) {
        this.walReceiveReplayDelayInMs = walReceiveReplayDelayInMs;
        return this;
    }

    /** 回放延迟时间（ms），即数据在灾备上回放的延迟时间。
     * 
     * @return walReceiveReplayDelayInMs */
    public String getWalReceiveReplayDelayInMs() {
        return walReceiveReplayDelayInMs;
    }

    public void setWalReceiveReplayDelayInMs(String walReceiveReplayDelayInMs) {
        this.walReceiveReplayDelayInMs = walReceiveReplayDelayInMs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDrReplicaStatusResponse showDrReplicaStatusResponse = (ShowDrReplicaStatusResponse) o;
        return Objects.equals(this.replicaState, showDrReplicaStatusResponse.replicaState)
            && Objects.equals(this.walWriteReceiveDelayInMb, showDrReplicaStatusResponse.walWriteReceiveDelayInMb)
            && Objects.equals(this.walWriteReplayDelayInMb, showDrReplicaStatusResponse.walWriteReplayDelayInMb)
            && Objects.equals(this.walReceiveReplayDelayInMs, showDrReplicaStatusResponse.walReceiveReplayDelayInMs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(replicaState, walWriteReceiveDelayInMb, walWriteReplayDelayInMb, walReceiveReplayDelayInMs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDrReplicaStatusResponse {\n");
        sb.append("    replicaState: ").append(toIndentedString(replicaState)).append("\n");
        sb.append("    walWriteReceiveDelayInMb: ").append(toIndentedString(walWriteReceiveDelayInMb)).append("\n");
        sb.append("    walWriteReplayDelayInMb: ").append(toIndentedString(walWriteReplayDelayInMb)).append("\n");
        sb.append("    walReceiveReplayDelayInMs: ").append(toIndentedString(walReceiveReplayDelayInMs)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
