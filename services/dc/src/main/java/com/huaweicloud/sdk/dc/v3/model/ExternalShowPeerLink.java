package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 对外对等体对象
 */
public class ExternalShowPeerLink {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_dc_gateway_id")

    private String globalDcGatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_owner")

    private String createOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_info")

    private BandwidthInfoExternal bandwidthInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_site")

    private PeerSiteExternal peerSite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private OffsetDateTime createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private OffsetDateTime updatedTime;

    public ExternalShowPeerLink withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ExternalShowPeerLink withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public ExternalShowPeerLink withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExternalShowPeerLink withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ExternalShowPeerLink withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ExternalShowPeerLink withGlobalDcGatewayId(String globalDcGatewayId) {
        this.globalDcGatewayId = globalDcGatewayId;
        return this;
    }

    /**
     * 全球接入网关ID
     * @return globalDcGatewayId
     */
    public String getGlobalDcGatewayId() {
        return globalDcGatewayId;
    }

    public void setGlobalDcGatewayId(String globalDcGatewayId) {
        this.globalDcGatewayId = globalDcGatewayId;
    }

    public ExternalShowPeerLink withCreateOwner(String createOwner) {
        this.createOwner = createOwner;
        return this;
    }

    /**
     * 创建者
     * @return createOwner
     */
    public String getCreateOwner() {
        return createOwner;
    }

    public void setCreateOwner(String createOwner) {
        this.createOwner = createOwner;
    }

    public ExternalShowPeerLink withBandwidthInfo(BandwidthInfoExternal bandwidthInfo) {
        this.bandwidthInfo = bandwidthInfo;
        return this;
    }

    public ExternalShowPeerLink withBandwidthInfo(Consumer<BandwidthInfoExternal> bandwidthInfoSetter) {
        if (this.bandwidthInfo == null) {
            this.bandwidthInfo = new BandwidthInfoExternal();
            bandwidthInfoSetter.accept(this.bandwidthInfo);
        }

        return this;
    }

    /**
     * Get bandwidthInfo
     * @return bandwidthInfo
     */
    public BandwidthInfoExternal getBandwidthInfo() {
        return bandwidthInfo;
    }

    public void setBandwidthInfo(BandwidthInfoExternal bandwidthInfo) {
        this.bandwidthInfo = bandwidthInfo;
    }

    public ExternalShowPeerLink withPeerSite(PeerSiteExternal peerSite) {
        this.peerSite = peerSite;
        return this;
    }

    public ExternalShowPeerLink withPeerSite(Consumer<PeerSiteExternal> peerSiteSetter) {
        if (this.peerSite == null) {
            this.peerSite = new PeerSiteExternal();
            peerSiteSetter.accept(this.peerSite);
        }

        return this;
    }

    /**
     * Get peerSite
     * @return peerSite
     */
    public PeerSiteExternal getPeerSite() {
        return peerSite;
    }

    public void setPeerSite(PeerSiteExternal peerSite) {
        this.peerSite = peerSite;
    }

    public ExternalShowPeerLink withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态：ACTIVE-正常，ERROR-异常
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ExternalShowPeerLink withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 原因
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ExternalShowPeerLink withCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间
     * @return createdTime
     */
    public OffsetDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public ExternalShowPeerLink withUpdatedTime(OffsetDateTime updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * 修改时间
     * @return updatedTime
     */
    public OffsetDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(OffsetDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExternalShowPeerLink that = (ExternalShowPeerLink) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.globalDcGatewayId, that.globalDcGatewayId)
            && Objects.equals(this.createOwner, that.createOwner)
            && Objects.equals(this.bandwidthInfo, that.bandwidthInfo) && Objects.equals(this.peerSite, that.peerSite)
            && Objects.equals(this.status, that.status) && Objects.equals(this.reason, that.reason)
            && Objects.equals(this.createdTime, that.createdTime) && Objects.equals(this.updatedTime, that.updatedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            tenantId,
            name,
            description,
            instanceId,
            globalDcGatewayId,
            createOwner,
            bandwidthInfo,
            peerSite,
            status,
            reason,
            createdTime,
            updatedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternalShowPeerLink {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    globalDcGatewayId: ").append(toIndentedString(globalDcGatewayId)).append("\n");
        sb.append("    createOwner: ").append(toIndentedString(createOwner)).append("\n");
        sb.append("    bandwidthInfo: ").append(toIndentedString(bandwidthInfo)).append("\n");
        sb.append("    peerSite: ").append(toIndentedString(peerSite)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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
