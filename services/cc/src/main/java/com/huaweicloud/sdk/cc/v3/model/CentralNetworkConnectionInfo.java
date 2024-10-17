package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CentralNetworkConnectionInfo
 */
public class CentralNetworkConnectionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plane_id")

    private String planeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_connection_bandwidth_id")

    private String globalConnectionBandwidthId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_size")

    private Long bandwidthSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_type")

    private ConnectionTypeEnum connectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_point_pair")

    private List<ConnectionPoint> connectionPointPair = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private CentralNetworkConnectionStateEnum state;

    public CentralNetworkConnectionInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CentralNetworkConnectionInfo withPlaneId(String planeId) {
        this.planeId = planeId;
        return this;
    }

    /**
     * 中心网络平面ID。
     * @return planeId
     */
    public String getPlaneId() {
        return planeId;
    }

    public void setPlaneId(String planeId) {
        this.planeId = planeId;
    }

    public CentralNetworkConnectionInfo withGlobalConnectionBandwidthId(String globalConnectionBandwidthId) {
        this.globalConnectionBandwidthId = globalConnectionBandwidthId;
        return this;
    }

    /**
     * 全域互联带宽ID。
     * @return globalConnectionBandwidthId
     */
    public String getGlobalConnectionBandwidthId() {
        return globalConnectionBandwidthId;
    }

    public void setGlobalConnectionBandwidthId(String globalConnectionBandwidthId) {
        this.globalConnectionBandwidthId = globalConnectionBandwidthId;
    }

    public CentralNetworkConnectionInfo withBandwidthSize(Long bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
        return this;
    }

    /**
     * 带宽值，单位Mbps。
     * minimum: 1
     * maximum: 999999
     * @return bandwidthSize
     */
    public Long getBandwidthSize() {
        return bandwidthSize;
    }

    public void setBandwidthSize(Long bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
    }

    public CentralNetworkConnectionInfo withConnectionType(ConnectionTypeEnum connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * Get connectionType
     * @return connectionType
     */
    public ConnectionTypeEnum getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(ConnectionTypeEnum connectionType) {
        this.connectionType = connectionType;
    }

    public CentralNetworkConnectionInfo withConnectionPointPair(List<ConnectionPoint> connectionPointPair) {
        this.connectionPointPair = connectionPointPair;
        return this;
    }

    public CentralNetworkConnectionInfo addConnectionPointPairItem(ConnectionPoint connectionPointPairItem) {
        if (this.connectionPointPair == null) {
            this.connectionPointPair = new ArrayList<>();
        }
        this.connectionPointPair.add(connectionPointPairItem);
        return this;
    }

    public CentralNetworkConnectionInfo withConnectionPointPair(
        Consumer<List<ConnectionPoint>> connectionPointPairSetter) {
        if (this.connectionPointPair == null) {
            this.connectionPointPair = new ArrayList<>();
        }
        connectionPointPairSetter.accept(this.connectionPointPair);
        return this;
    }

    /**
     * 中心网络连接的两个端点定义，长度固定为2的数组。
     * @return connectionPointPair
     */
    public List<ConnectionPoint> getConnectionPointPair() {
        return connectionPointPair;
    }

    public void setConnectionPointPair(List<ConnectionPoint> connectionPointPair) {
        this.connectionPointPair = connectionPointPair;
    }

    public CentralNetworkConnectionInfo withState(CentralNetworkConnectionStateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    public CentralNetworkConnectionStateEnum getState() {
        return state;
    }

    public void setState(CentralNetworkConnectionStateEnum state) {
        this.state = state;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CentralNetworkConnectionInfo that = (CentralNetworkConnectionInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.planeId, that.planeId)
            && Objects.equals(this.globalConnectionBandwidthId, that.globalConnectionBandwidthId)
            && Objects.equals(this.bandwidthSize, that.bandwidthSize)
            && Objects.equals(this.connectionType, that.connectionType)
            && Objects.equals(this.connectionPointPair, that.connectionPointPair)
            && Objects.equals(this.state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, planeId, globalConnectionBandwidthId, bandwidthSize, connectionType, connectionPointPair, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CentralNetworkConnectionInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    planeId: ").append(toIndentedString(planeId)).append("\n");
        sb.append("    globalConnectionBandwidthId: ")
            .append(toIndentedString(globalConnectionBandwidthId))
            .append("\n");
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
        sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
        sb.append("    connectionPointPair: ").append(toIndentedString(connectionPointPair)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
