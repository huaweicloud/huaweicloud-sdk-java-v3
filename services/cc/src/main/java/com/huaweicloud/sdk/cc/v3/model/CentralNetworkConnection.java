package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 中心网络连接。
 */
public class CentralNetworkConnection {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "central_network_id")

    private String centralNetworkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "central_network_plane_id")

    private String centralNetworkPlaneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_connection_bandwidth_id")

    private String globalConnectionBandwidthId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_type")

    private BandwidthTypeEnum bandwidthType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_size")

    private Long bandwidthSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private CentralNetworkConnectionStateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_frozen")

    private Boolean isFrozen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_type")

    private ConnectionTypeEnum connectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_point_pair")

    private List<ConnectionPoint> connectionPointPair = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public CentralNetworkConnection withId(String id) {
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

    public CentralNetworkConnection withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CentralNetworkConnection withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 实例描述。不支持 <>。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CentralNetworkConnection withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 实例所属账号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public CentralNetworkConnection withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 实例所属企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CentralNetworkConnection withCentralNetworkId(String centralNetworkId) {
        this.centralNetworkId = centralNetworkId;
        return this;
    }

    /**
     * 中心网络ID。
     * @return centralNetworkId
     */
    public String getCentralNetworkId() {
        return centralNetworkId;
    }

    public void setCentralNetworkId(String centralNetworkId) {
        this.centralNetworkId = centralNetworkId;
    }

    public CentralNetworkConnection withCentralNetworkPlaneId(String centralNetworkPlaneId) {
        this.centralNetworkPlaneId = centralNetworkPlaneId;
        return this;
    }

    /**
     * 中心网络平面ID。
     * @return centralNetworkPlaneId
     */
    public String getCentralNetworkPlaneId() {
        return centralNetworkPlaneId;
    }

    public void setCentralNetworkPlaneId(String centralNetworkPlaneId) {
        this.centralNetworkPlaneId = centralNetworkPlaneId;
    }

    public CentralNetworkConnection withGlobalConnectionBandwidthId(String globalConnectionBandwidthId) {
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

    public CentralNetworkConnection withBandwidthType(BandwidthTypeEnum bandwidthType) {
        this.bandwidthType = bandwidthType;
        return this;
    }

    /**
     * Get bandwidthType
     * @return bandwidthType
     */
    public BandwidthTypeEnum getBandwidthType() {
        return bandwidthType;
    }

    public void setBandwidthType(BandwidthTypeEnum bandwidthType) {
        this.bandwidthType = bandwidthType;
    }

    public CentralNetworkConnection withBandwidthSize(Long bandwidthSize) {
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

    public CentralNetworkConnection withState(CentralNetworkConnectionStateEnum state) {
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

    public CentralNetworkConnection withIsFrozen(Boolean isFrozen) {
        this.isFrozen = isFrozen;
        return this;
    }

    /**
     * 是否冻结。
     * @return isFrozen
     */
    public Boolean getIsFrozen() {
        return isFrozen;
    }

    public void setIsFrozen(Boolean isFrozen) {
        this.isFrozen = isFrozen;
    }

    public CentralNetworkConnection withConnectionType(ConnectionTypeEnum connectionType) {
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

    public CentralNetworkConnection withConnectionPointPair(List<ConnectionPoint> connectionPointPair) {
        this.connectionPointPair = connectionPointPair;
        return this;
    }

    public CentralNetworkConnection addConnectionPointPairItem(ConnectionPoint connectionPointPairItem) {
        if (this.connectionPointPair == null) {
            this.connectionPointPair = new ArrayList<>();
        }
        this.connectionPointPair.add(connectionPointPairItem);
        return this;
    }

    public CentralNetworkConnection withConnectionPointPair(Consumer<List<ConnectionPoint>> connectionPointPairSetter) {
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

    public CentralNetworkConnection withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 实例创建时间。UTC时间格式，yyyy-MM-ddTHH:mm:ss。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CentralNetworkConnection withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 实例更新时间。UTC时间格式，yyyy-MM-ddTHH:mm:ss。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CentralNetworkConnection that = (CentralNetworkConnection) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.centralNetworkId, that.centralNetworkId)
            && Objects.equals(this.centralNetworkPlaneId, that.centralNetworkPlaneId)
            && Objects.equals(this.globalConnectionBandwidthId, that.globalConnectionBandwidthId)
            && Objects.equals(this.bandwidthType, that.bandwidthType)
            && Objects.equals(this.bandwidthSize, that.bandwidthSize) && Objects.equals(this.state, that.state)
            && Objects.equals(this.isFrozen, that.isFrozen) && Objects.equals(this.connectionType, that.connectionType)
            && Objects.equals(this.connectionPointPair, that.connectionPointPair)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            domainId,
            enterpriseProjectId,
            centralNetworkId,
            centralNetworkPlaneId,
            globalConnectionBandwidthId,
            bandwidthType,
            bandwidthSize,
            state,
            isFrozen,
            connectionType,
            connectionPointPair,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CentralNetworkConnection {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    centralNetworkId: ").append(toIndentedString(centralNetworkId)).append("\n");
        sb.append("    centralNetworkPlaneId: ").append(toIndentedString(centralNetworkPlaneId)).append("\n");
        sb.append("    globalConnectionBandwidthId: ")
            .append(toIndentedString(globalConnectionBandwidthId))
            .append("\n");
        sb.append("    bandwidthType: ").append(toIndentedString(bandwidthType)).append("\n");
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    isFrozen: ").append(toIndentedString(isFrozen)).append("\n");
        sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
        sb.append("    connectionPointPair: ").append(toIndentedString(connectionPointPair)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
