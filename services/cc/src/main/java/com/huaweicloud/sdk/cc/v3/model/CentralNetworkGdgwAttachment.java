package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 中心GDGW附件详情。
 */
public class CentralNetworkGdgwAttachment {

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
    @JsonProperty(value = "state")

    private CentralNetworkConnectionStateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

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
    @JsonProperty(value = "is_frozen")

    private Boolean isFrozen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_router_id")

    private String enterpriseRouterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_router_project_id")

    private String enterpriseRouterProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_router_region_id")

    private String enterpriseRouterRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_router_attachment_id")

    private String enterpriseRouterAttachmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_dc_gateway_peer_link_id")

    private String globalDcGatewayPeerLinkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_dc_gateway_id")

    private String globalDcGatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_dc_gateway_project_id")

    private String globalDcGatewayProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_dc_gateway_region_id")

    private String globalDcGatewayRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_router_site_code")

    private String enterpriseRouterSiteCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_dc_gateway_site_code")

    private String globalDcGatewaySiteCode;

    public CentralNetworkGdgwAttachment withId(String id) {
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

    public CentralNetworkGdgwAttachment withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名字。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CentralNetworkGdgwAttachment withDescription(String description) {
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

    public CentralNetworkGdgwAttachment withDomainId(String domainId) {
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

    public CentralNetworkGdgwAttachment withState(CentralNetworkConnectionStateEnum state) {
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

    public CentralNetworkGdgwAttachment withCreatedAt(OffsetDateTime createdAt) {
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

    public CentralNetworkGdgwAttachment withUpdatedAt(OffsetDateTime updatedAt) {
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

    public CentralNetworkGdgwAttachment withCentralNetworkId(String centralNetworkId) {
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

    public CentralNetworkGdgwAttachment withCentralNetworkPlaneId(String centralNetworkPlaneId) {
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

    public CentralNetworkGdgwAttachment withGlobalConnectionBandwidthId(String globalConnectionBandwidthId) {
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

    public CentralNetworkGdgwAttachment withBandwidthType(BandwidthTypeEnum bandwidthType) {
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

    public CentralNetworkGdgwAttachment withBandwidthSize(Long bandwidthSize) {
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

    public CentralNetworkGdgwAttachment withIsFrozen(Boolean isFrozen) {
        this.isFrozen = isFrozen;
        return this;
    }

    /**
     * 是否冻结
     * @return isFrozen
     */
    public Boolean getIsFrozen() {
        return isFrozen;
    }

    public void setIsFrozen(Boolean isFrozen) {
        this.isFrozen = isFrozen;
    }

    public CentralNetworkGdgwAttachment withEnterpriseRouterId(String enterpriseRouterId) {
        this.enterpriseRouterId = enterpriseRouterId;
        return this;
    }

    /**
     * 企业路由器的ID。
     * @return enterpriseRouterId
     */
    public String getEnterpriseRouterId() {
        return enterpriseRouterId;
    }

    public void setEnterpriseRouterId(String enterpriseRouterId) {
        this.enterpriseRouterId = enterpriseRouterId;
    }

    public CentralNetworkGdgwAttachment withEnterpriseRouterProjectId(String enterpriseRouterProjectId) {
        this.enterpriseRouterProjectId = enterpriseRouterProjectId;
        return this;
    }

    /**
     * 企业路由器的项目ID。
     * @return enterpriseRouterProjectId
     */
    public String getEnterpriseRouterProjectId() {
        return enterpriseRouterProjectId;
    }

    public void setEnterpriseRouterProjectId(String enterpriseRouterProjectId) {
        this.enterpriseRouterProjectId = enterpriseRouterProjectId;
    }

    public CentralNetworkGdgwAttachment withEnterpriseRouterRegionId(String enterpriseRouterRegionId) {
        this.enterpriseRouterRegionId = enterpriseRouterRegionId;
        return this;
    }

    /**
     * ER路由器的regionID。
     * @return enterpriseRouterRegionId
     */
    public String getEnterpriseRouterRegionId() {
        return enterpriseRouterRegionId;
    }

    public void setEnterpriseRouterRegionId(String enterpriseRouterRegionId) {
        this.enterpriseRouterRegionId = enterpriseRouterRegionId;
    }

    public CentralNetworkGdgwAttachment withEnterpriseRouterAttachmentId(String enterpriseRouterAttachmentId) {
        this.enterpriseRouterAttachmentId = enterpriseRouterAttachmentId;
        return this;
    }

    /**
     * 企业路由器的连接ID。
     * @return enterpriseRouterAttachmentId
     */
    public String getEnterpriseRouterAttachmentId() {
        return enterpriseRouterAttachmentId;
    }

    public void setEnterpriseRouterAttachmentId(String enterpriseRouterAttachmentId) {
        this.enterpriseRouterAttachmentId = enterpriseRouterAttachmentId;
    }

    public CentralNetworkGdgwAttachment withGlobalDcGatewayPeerLinkId(String globalDcGatewayPeerLinkId) {
        this.globalDcGatewayPeerLinkId = globalDcGatewayPeerLinkId;
        return this;
    }

    /**
     * GDGW的连接ID。
     * @return globalDcGatewayPeerLinkId
     */
    public String getGlobalDcGatewayPeerLinkId() {
        return globalDcGatewayPeerLinkId;
    }

    public void setGlobalDcGatewayPeerLinkId(String globalDcGatewayPeerLinkId) {
        this.globalDcGatewayPeerLinkId = globalDcGatewayPeerLinkId;
    }

    public CentralNetworkGdgwAttachment withGlobalDcGatewayId(String globalDcGatewayId) {
        this.globalDcGatewayId = globalDcGatewayId;
        return this;
    }

    /**
     * Gdgw的ID。
     * @return globalDcGatewayId
     */
    public String getGlobalDcGatewayId() {
        return globalDcGatewayId;
    }

    public void setGlobalDcGatewayId(String globalDcGatewayId) {
        this.globalDcGatewayId = globalDcGatewayId;
    }

    public CentralNetworkGdgwAttachment withGlobalDcGatewayProjectId(String globalDcGatewayProjectId) {
        this.globalDcGatewayProjectId = globalDcGatewayProjectId;
        return this;
    }

    /**
     * Gdgw的项目ID。
     * @return globalDcGatewayProjectId
     */
    public String getGlobalDcGatewayProjectId() {
        return globalDcGatewayProjectId;
    }

    public void setGlobalDcGatewayProjectId(String globalDcGatewayProjectId) {
        this.globalDcGatewayProjectId = globalDcGatewayProjectId;
    }

    public CentralNetworkGdgwAttachment withGlobalDcGatewayRegionId(String globalDcGatewayRegionId) {
        this.globalDcGatewayRegionId = globalDcGatewayRegionId;
        return this;
    }

    /**
     * Gdgw的RegionID。
     * @return globalDcGatewayRegionId
     */
    public String getGlobalDcGatewayRegionId() {
        return globalDcGatewayRegionId;
    }

    public void setGlobalDcGatewayRegionId(String globalDcGatewayRegionId) {
        this.globalDcGatewayRegionId = globalDcGatewayRegionId;
    }

    public CentralNetworkGdgwAttachment withEnterpriseRouterSiteCode(String enterpriseRouterSiteCode) {
        this.enterpriseRouterSiteCode = enterpriseRouterSiteCode;
        return this;
    }

    /**
     * 中心网络企业路由器的站点编码。
     * @return enterpriseRouterSiteCode
     */
    public String getEnterpriseRouterSiteCode() {
        return enterpriseRouterSiteCode;
    }

    public void setEnterpriseRouterSiteCode(String enterpriseRouterSiteCode) {
        this.enterpriseRouterSiteCode = enterpriseRouterSiteCode;
    }

    public CentralNetworkGdgwAttachment withGlobalDcGatewaySiteCode(String globalDcGatewaySiteCode) {
        this.globalDcGatewaySiteCode = globalDcGatewaySiteCode;
        return this;
    }

    /**
     * 站点编码定义
     * @return globalDcGatewaySiteCode
     */
    public String getGlobalDcGatewaySiteCode() {
        return globalDcGatewaySiteCode;
    }

    public void setGlobalDcGatewaySiteCode(String globalDcGatewaySiteCode) {
        this.globalDcGatewaySiteCode = globalDcGatewaySiteCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CentralNetworkGdgwAttachment that = (CentralNetworkGdgwAttachment) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.state, that.state) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.centralNetworkId, that.centralNetworkId)
            && Objects.equals(this.centralNetworkPlaneId, that.centralNetworkPlaneId)
            && Objects.equals(this.globalConnectionBandwidthId, that.globalConnectionBandwidthId)
            && Objects.equals(this.bandwidthType, that.bandwidthType)
            && Objects.equals(this.bandwidthSize, that.bandwidthSize) && Objects.equals(this.isFrozen, that.isFrozen)
            && Objects.equals(this.enterpriseRouterId, that.enterpriseRouterId)
            && Objects.equals(this.enterpriseRouterProjectId, that.enterpriseRouterProjectId)
            && Objects.equals(this.enterpriseRouterRegionId, that.enterpriseRouterRegionId)
            && Objects.equals(this.enterpriseRouterAttachmentId, that.enterpriseRouterAttachmentId)
            && Objects.equals(this.globalDcGatewayPeerLinkId, that.globalDcGatewayPeerLinkId)
            && Objects.equals(this.globalDcGatewayId, that.globalDcGatewayId)
            && Objects.equals(this.globalDcGatewayProjectId, that.globalDcGatewayProjectId)
            && Objects.equals(this.globalDcGatewayRegionId, that.globalDcGatewayRegionId)
            && Objects.equals(this.enterpriseRouterSiteCode, that.enterpriseRouterSiteCode)
            && Objects.equals(this.globalDcGatewaySiteCode, that.globalDcGatewaySiteCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            domainId,
            state,
            createdAt,
            updatedAt,
            centralNetworkId,
            centralNetworkPlaneId,
            globalConnectionBandwidthId,
            bandwidthType,
            bandwidthSize,
            isFrozen,
            enterpriseRouterId,
            enterpriseRouterProjectId,
            enterpriseRouterRegionId,
            enterpriseRouterAttachmentId,
            globalDcGatewayPeerLinkId,
            globalDcGatewayId,
            globalDcGatewayProjectId,
            globalDcGatewayRegionId,
            enterpriseRouterSiteCode,
            globalDcGatewaySiteCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CentralNetworkGdgwAttachment {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    centralNetworkId: ").append(toIndentedString(centralNetworkId)).append("\n");
        sb.append("    centralNetworkPlaneId: ").append(toIndentedString(centralNetworkPlaneId)).append("\n");
        sb.append("    globalConnectionBandwidthId: ")
            .append(toIndentedString(globalConnectionBandwidthId))
            .append("\n");
        sb.append("    bandwidthType: ").append(toIndentedString(bandwidthType)).append("\n");
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
        sb.append("    isFrozen: ").append(toIndentedString(isFrozen)).append("\n");
        sb.append("    enterpriseRouterId: ").append(toIndentedString(enterpriseRouterId)).append("\n");
        sb.append("    enterpriseRouterProjectId: ").append(toIndentedString(enterpriseRouterProjectId)).append("\n");
        sb.append("    enterpriseRouterRegionId: ").append(toIndentedString(enterpriseRouterRegionId)).append("\n");
        sb.append("    enterpriseRouterAttachmentId: ")
            .append(toIndentedString(enterpriseRouterAttachmentId))
            .append("\n");
        sb.append("    globalDcGatewayPeerLinkId: ").append(toIndentedString(globalDcGatewayPeerLinkId)).append("\n");
        sb.append("    globalDcGatewayId: ").append(toIndentedString(globalDcGatewayId)).append("\n");
        sb.append("    globalDcGatewayProjectId: ").append(toIndentedString(globalDcGatewayProjectId)).append("\n");
        sb.append("    globalDcGatewayRegionId: ").append(toIndentedString(globalDcGatewayRegionId)).append("\n");
        sb.append("    enterpriseRouterSiteCode: ").append(toIndentedString(enterpriseRouterSiteCode)).append("\n");
        sb.append("    globalDcGatewaySiteCode: ").append(toIndentedString(globalDcGatewaySiteCode)).append("\n");
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
