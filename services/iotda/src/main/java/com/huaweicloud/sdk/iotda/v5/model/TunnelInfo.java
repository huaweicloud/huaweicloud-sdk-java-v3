package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 隧道信息
 */
public class TunnelInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tunnel_id")

    private String tunnelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private String deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "closed_time")

    private String closedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_connect_state")

    private ConnectState sourceConnectState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_connect_state")

    private ConnectState deviceConnectState;

    public TunnelInfo withTunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
        return this;
    }

    /**
     * 隧道ID
     * @return tunnelId
     */
    public String getTunnelId() {
        return tunnelId;
    }

    public void setTunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
    }

    public TunnelInfo withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * 设备ID
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public TunnelInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 隧道创建时间。格式：yyyyMMdd'T'HHmmss'Z'，如20151212T121212Z。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public TunnelInfo withClosedTime(String closedTime) {
        this.closedTime = closedTime;
        return this;
    }

    /**
     * 隧道更新时间。格式：yyyyMMdd'T'HHmmss'Z'，如20151212T121212Z。
     * @return closedTime
     */
    public String getClosedTime() {
        return closedTime;
    }

    public void setClosedTime(String closedTime) {
        this.closedTime = closedTime;
    }

    public TunnelInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 隧道状态 CLOSED | OPEN
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TunnelInfo withSourceConnectState(ConnectState sourceConnectState) {
        this.sourceConnectState = sourceConnectState;
        return this;
    }

    public TunnelInfo withSourceConnectState(Consumer<ConnectState> sourceConnectStateSetter) {
        if (this.sourceConnectState == null) {
            this.sourceConnectState = new ConnectState();
            sourceConnectStateSetter.accept(this.sourceConnectState);
        }

        return this;
    }

    /**
     * Get sourceConnectState
     * @return sourceConnectState
     */
    public ConnectState getSourceConnectState() {
        return sourceConnectState;
    }

    public void setSourceConnectState(ConnectState sourceConnectState) {
        this.sourceConnectState = sourceConnectState;
    }

    public TunnelInfo withDeviceConnectState(ConnectState deviceConnectState) {
        this.deviceConnectState = deviceConnectState;
        return this;
    }

    public TunnelInfo withDeviceConnectState(Consumer<ConnectState> deviceConnectStateSetter) {
        if (this.deviceConnectState == null) {
            this.deviceConnectState = new ConnectState();
            deviceConnectStateSetter.accept(this.deviceConnectState);
        }

        return this;
    }

    /**
     * Get deviceConnectState
     * @return deviceConnectState
     */
    public ConnectState getDeviceConnectState() {
        return deviceConnectState;
    }

    public void setDeviceConnectState(ConnectState deviceConnectState) {
        this.deviceConnectState = deviceConnectState;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TunnelInfo that = (TunnelInfo) obj;
        return Objects.equals(this.tunnelId, that.tunnelId) && Objects.equals(this.deviceId, that.deviceId)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.closedTime, that.closedTime)
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.sourceConnectState, that.sourceConnectState)
            && Objects.equals(this.deviceConnectState, that.deviceConnectState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tunnelId, deviceId, createTime, closedTime, status, sourceConnectState, deviceConnectState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TunnelInfo {\n");
        sb.append("    tunnelId: ").append(toIndentedString(tunnelId)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    closedTime: ").append(toIndentedString(closedTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    sourceConnectState: ").append(toIndentedString(sourceConnectState)).append("\n");
        sb.append("    deviceConnectState: ").append(toIndentedString(deviceConnectState)).append("\n");
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
