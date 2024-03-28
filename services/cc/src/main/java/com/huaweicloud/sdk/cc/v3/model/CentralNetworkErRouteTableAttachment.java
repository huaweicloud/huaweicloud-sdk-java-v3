package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 企业路由器的路由表附件详情。
 */
public class CentralNetworkErRouteTableAttachment {

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
    @JsonProperty(value = "is_frozen")

    private Boolean isFrozen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_type")

    private BandwidthTypeEnum bandwidthType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_size")

    private Long bandwidthSize;

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
    @JsonProperty(value = "enterprise_router_table_id")

    private String enterpriseRouterTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_router_site_code")

    private String enterpriseRouterSiteCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_er_table_id")

    private String attachedErTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_er_table_region_id")

    private String attachedErTableRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_er_table_project_id")

    private String attachedErTableProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_er_table_site_code")

    private String attachedErTableSiteCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_er_id")

    private String attachedErId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_er_attachment_id")

    private String attachedErAttachmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approved_state")

    private ApprovedStateEnum approvedState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosted_cloud")

    private HostedCloudEnum hostedCloud;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    public CentralNetworkErRouteTableAttachment withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CentralNetworkErRouteTableAttachment withName(String name) {
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

    public CentralNetworkErRouteTableAttachment withDescription(String description) {
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

    public CentralNetworkErRouteTableAttachment withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 实例所属帐号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public CentralNetworkErRouteTableAttachment withState(CentralNetworkConnectionStateEnum state) {
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

    public CentralNetworkErRouteTableAttachment withCreatedAt(OffsetDateTime createdAt) {
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

    public CentralNetworkErRouteTableAttachment withUpdatedAt(OffsetDateTime updatedAt) {
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

    public CentralNetworkErRouteTableAttachment withCentralNetworkId(String centralNetworkId) {
        this.centralNetworkId = centralNetworkId;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return centralNetworkId
     */
    public String getCentralNetworkId() {
        return centralNetworkId;
    }

    public void setCentralNetworkId(String centralNetworkId) {
        this.centralNetworkId = centralNetworkId;
    }

    public CentralNetworkErRouteTableAttachment withCentralNetworkPlaneId(String centralNetworkPlaneId) {
        this.centralNetworkPlaneId = centralNetworkPlaneId;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return centralNetworkPlaneId
     */
    public String getCentralNetworkPlaneId() {
        return centralNetworkPlaneId;
    }

    public void setCentralNetworkPlaneId(String centralNetworkPlaneId) {
        this.centralNetworkPlaneId = centralNetworkPlaneId;
    }

    public CentralNetworkErRouteTableAttachment withGlobalConnectionBandwidthId(String globalConnectionBandwidthId) {
        this.globalConnectionBandwidthId = globalConnectionBandwidthId;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return globalConnectionBandwidthId
     */
    public String getGlobalConnectionBandwidthId() {
        return globalConnectionBandwidthId;
    }

    public void setGlobalConnectionBandwidthId(String globalConnectionBandwidthId) {
        this.globalConnectionBandwidthId = globalConnectionBandwidthId;
    }

    public CentralNetworkErRouteTableAttachment withIsFrozen(Boolean isFrozen) {
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

    public CentralNetworkErRouteTableAttachment withBandwidthType(BandwidthTypeEnum bandwidthType) {
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

    public CentralNetworkErRouteTableAttachment withBandwidthSize(Long bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
        return this;
    }

    /**
     * 带宽值定义，单位Mbps。
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

    public CentralNetworkErRouteTableAttachment withEnterpriseRouterId(String enterpriseRouterId) {
        this.enterpriseRouterId = enterpriseRouterId;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return enterpriseRouterId
     */
    public String getEnterpriseRouterId() {
        return enterpriseRouterId;
    }

    public void setEnterpriseRouterId(String enterpriseRouterId) {
        this.enterpriseRouterId = enterpriseRouterId;
    }

    public CentralNetworkErRouteTableAttachment withEnterpriseRouterProjectId(String enterpriseRouterProjectId) {
        this.enterpriseRouterProjectId = enterpriseRouterProjectId;
        return this;
    }

    /**
     * 实例所属项目ID。
     * @return enterpriseRouterProjectId
     */
    public String getEnterpriseRouterProjectId() {
        return enterpriseRouterProjectId;
    }

    public void setEnterpriseRouterProjectId(String enterpriseRouterProjectId) {
        this.enterpriseRouterProjectId = enterpriseRouterProjectId;
    }

    public CentralNetworkErRouteTableAttachment withEnterpriseRouterRegionId(String enterpriseRouterRegionId) {
        this.enterpriseRouterRegionId = enterpriseRouterRegionId;
        return this;
    }

    /**
     * RegionID。
     * @return enterpriseRouterRegionId
     */
    public String getEnterpriseRouterRegionId() {
        return enterpriseRouterRegionId;
    }

    public void setEnterpriseRouterRegionId(String enterpriseRouterRegionId) {
        this.enterpriseRouterRegionId = enterpriseRouterRegionId;
    }

    public CentralNetworkErRouteTableAttachment withEnterpriseRouterAttachmentId(String enterpriseRouterAttachmentId) {
        this.enterpriseRouterAttachmentId = enterpriseRouterAttachmentId;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return enterpriseRouterAttachmentId
     */
    public String getEnterpriseRouterAttachmentId() {
        return enterpriseRouterAttachmentId;
    }

    public void setEnterpriseRouterAttachmentId(String enterpriseRouterAttachmentId) {
        this.enterpriseRouterAttachmentId = enterpriseRouterAttachmentId;
    }

    public CentralNetworkErRouteTableAttachment withEnterpriseRouterTableId(String enterpriseRouterTableId) {
        this.enterpriseRouterTableId = enterpriseRouterTableId;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return enterpriseRouterTableId
     */
    public String getEnterpriseRouterTableId() {
        return enterpriseRouterTableId;
    }

    public void setEnterpriseRouterTableId(String enterpriseRouterTableId) {
        this.enterpriseRouterTableId = enterpriseRouterTableId;
    }

    public CentralNetworkErRouteTableAttachment withEnterpriseRouterSiteCode(String enterpriseRouterSiteCode) {
        this.enterpriseRouterSiteCode = enterpriseRouterSiteCode;
        return this;
    }

    /**
     * 站点编码定义
     * @return enterpriseRouterSiteCode
     */
    public String getEnterpriseRouterSiteCode() {
        return enterpriseRouterSiteCode;
    }

    public void setEnterpriseRouterSiteCode(String enterpriseRouterSiteCode) {
        this.enterpriseRouterSiteCode = enterpriseRouterSiteCode;
    }

    public CentralNetworkErRouteTableAttachment withAttachedErTableId(String attachedErTableId) {
        this.attachedErTableId = attachedErTableId;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return attachedErTableId
     */
    public String getAttachedErTableId() {
        return attachedErTableId;
    }

    public void setAttachedErTableId(String attachedErTableId) {
        this.attachedErTableId = attachedErTableId;
    }

    public CentralNetworkErRouteTableAttachment withAttachedErTableRegionId(String attachedErTableRegionId) {
        this.attachedErTableRegionId = attachedErTableRegionId;
        return this;
    }

    /**
     * RegionID。
     * @return attachedErTableRegionId
     */
    public String getAttachedErTableRegionId() {
        return attachedErTableRegionId;
    }

    public void setAttachedErTableRegionId(String attachedErTableRegionId) {
        this.attachedErTableRegionId = attachedErTableRegionId;
    }

    public CentralNetworkErRouteTableAttachment withAttachedErTableProjectId(String attachedErTableProjectId) {
        this.attachedErTableProjectId = attachedErTableProjectId;
        return this;
    }

    /**
     * 实例所属项目ID。
     * @return attachedErTableProjectId
     */
    public String getAttachedErTableProjectId() {
        return attachedErTableProjectId;
    }

    public void setAttachedErTableProjectId(String attachedErTableProjectId) {
        this.attachedErTableProjectId = attachedErTableProjectId;
    }

    public CentralNetworkErRouteTableAttachment withAttachedErTableSiteCode(String attachedErTableSiteCode) {
        this.attachedErTableSiteCode = attachedErTableSiteCode;
        return this;
    }

    /**
     * 站点编码定义
     * @return attachedErTableSiteCode
     */
    public String getAttachedErTableSiteCode() {
        return attachedErTableSiteCode;
    }

    public void setAttachedErTableSiteCode(String attachedErTableSiteCode) {
        this.attachedErTableSiteCode = attachedErTableSiteCode;
    }

    public CentralNetworkErRouteTableAttachment withAttachedErId(String attachedErId) {
        this.attachedErId = attachedErId;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return attachedErId
     */
    public String getAttachedErId() {
        return attachedErId;
    }

    public void setAttachedErId(String attachedErId) {
        this.attachedErId = attachedErId;
    }

    public CentralNetworkErRouteTableAttachment withAttachedErAttachmentId(String attachedErAttachmentId) {
        this.attachedErAttachmentId = attachedErAttachmentId;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return attachedErAttachmentId
     */
    public String getAttachedErAttachmentId() {
        return attachedErAttachmentId;
    }

    public void setAttachedErAttachmentId(String attachedErAttachmentId) {
        this.attachedErAttachmentId = attachedErAttachmentId;
    }

    public CentralNetworkErRouteTableAttachment withApprovedState(ApprovedStateEnum approvedState) {
        this.approvedState = approvedState;
        return this;
    }

    /**
     * Get approvedState
     * @return approvedState
     */
    public ApprovedStateEnum getApprovedState() {
        return approvedState;
    }

    public void setApprovedState(ApprovedStateEnum approvedState) {
        this.approvedState = approvedState;
    }

    public CentralNetworkErRouteTableAttachment withHostedCloud(HostedCloudEnum hostedCloud) {
        this.hostedCloud = hostedCloud;
        return this;
    }

    /**
     * Get hostedCloud
     * @return hostedCloud
     */
    public HostedCloudEnum getHostedCloud() {
        return hostedCloud;
    }

    public void setHostedCloud(HostedCloudEnum hostedCloud) {
        this.hostedCloud = hostedCloud;
    }

    public CentralNetworkErRouteTableAttachment withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 审批拒绝创建企业路由表附件的原因。
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CentralNetworkErRouteTableAttachment that = (CentralNetworkErRouteTableAttachment) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.state, that.state) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.centralNetworkId, that.centralNetworkId)
            && Objects.equals(this.centralNetworkPlaneId, that.centralNetworkPlaneId)
            && Objects.equals(this.globalConnectionBandwidthId, that.globalConnectionBandwidthId)
            && Objects.equals(this.isFrozen, that.isFrozen) && Objects.equals(this.bandwidthType, that.bandwidthType)
            && Objects.equals(this.bandwidthSize, that.bandwidthSize)
            && Objects.equals(this.enterpriseRouterId, that.enterpriseRouterId)
            && Objects.equals(this.enterpriseRouterProjectId, that.enterpriseRouterProjectId)
            && Objects.equals(this.enterpriseRouterRegionId, that.enterpriseRouterRegionId)
            && Objects.equals(this.enterpriseRouterAttachmentId, that.enterpriseRouterAttachmentId)
            && Objects.equals(this.enterpriseRouterTableId, that.enterpriseRouterTableId)
            && Objects.equals(this.enterpriseRouterSiteCode, that.enterpriseRouterSiteCode)
            && Objects.equals(this.attachedErTableId, that.attachedErTableId)
            && Objects.equals(this.attachedErTableRegionId, that.attachedErTableRegionId)
            && Objects.equals(this.attachedErTableProjectId, that.attachedErTableProjectId)
            && Objects.equals(this.attachedErTableSiteCode, that.attachedErTableSiteCode)
            && Objects.equals(this.attachedErId, that.attachedErId)
            && Objects.equals(this.attachedErAttachmentId, that.attachedErAttachmentId)
            && Objects.equals(this.approvedState, that.approvedState)
            && Objects.equals(this.hostedCloud, that.hostedCloud) && Objects.equals(this.reason, that.reason);
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
            isFrozen,
            bandwidthType,
            bandwidthSize,
            enterpriseRouterId,
            enterpriseRouterProjectId,
            enterpriseRouterRegionId,
            enterpriseRouterAttachmentId,
            enterpriseRouterTableId,
            enterpriseRouterSiteCode,
            attachedErTableId,
            attachedErTableRegionId,
            attachedErTableProjectId,
            attachedErTableSiteCode,
            attachedErId,
            attachedErAttachmentId,
            approvedState,
            hostedCloud,
            reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CentralNetworkErRouteTableAttachment {\n");
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
        sb.append("    isFrozen: ").append(toIndentedString(isFrozen)).append("\n");
        sb.append("    bandwidthType: ").append(toIndentedString(bandwidthType)).append("\n");
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
        sb.append("    enterpriseRouterId: ").append(toIndentedString(enterpriseRouterId)).append("\n");
        sb.append("    enterpriseRouterProjectId: ").append(toIndentedString(enterpriseRouterProjectId)).append("\n");
        sb.append("    enterpriseRouterRegionId: ").append(toIndentedString(enterpriseRouterRegionId)).append("\n");
        sb.append("    enterpriseRouterAttachmentId: ")
            .append(toIndentedString(enterpriseRouterAttachmentId))
            .append("\n");
        sb.append("    enterpriseRouterTableId: ").append(toIndentedString(enterpriseRouterTableId)).append("\n");
        sb.append("    enterpriseRouterSiteCode: ").append(toIndentedString(enterpriseRouterSiteCode)).append("\n");
        sb.append("    attachedErTableId: ").append(toIndentedString(attachedErTableId)).append("\n");
        sb.append("    attachedErTableRegionId: ").append(toIndentedString(attachedErTableRegionId)).append("\n");
        sb.append("    attachedErTableProjectId: ").append(toIndentedString(attachedErTableProjectId)).append("\n");
        sb.append("    attachedErTableSiteCode: ").append(toIndentedString(attachedErTableSiteCode)).append("\n");
        sb.append("    attachedErId: ").append(toIndentedString(attachedErId)).append("\n");
        sb.append("    attachedErAttachmentId: ").append(toIndentedString(attachedErAttachmentId)).append("\n");
        sb.append("    approvedState: ").append(toIndentedString(approvedState)).append("\n");
        sb.append("    hostedCloud: ").append(toIndentedString(hostedCloud)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
