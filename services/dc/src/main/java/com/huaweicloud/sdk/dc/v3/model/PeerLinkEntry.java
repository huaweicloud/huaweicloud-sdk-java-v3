package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实例的peer Link的详情
 */
public class PeerLinkEntry {

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
    @JsonProperty(value = "global_dc_gateway_id")

    private String globalDcGatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_info")

    private BandWidthInfo bandwidthInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_site")

    private PeerSite peerSite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private PeerLinkStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private OffsetDateTime createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private OffsetDateTime updatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_owner")

    private OffsetDateTime createOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    public PeerLinkEntry withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * peer link ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PeerLinkEntry withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户项目ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public PeerLinkEntry withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 专线内部连接(peer link)名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PeerLinkEntry withDescription(String description) {
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

    public PeerLinkEntry withGlobalDcGatewayId(String globalDcGatewayId) {
        this.globalDcGatewayId = globalDcGatewayId;
        return this;
    }

    /**
     * 对应的专线全域接入网关ID
     * @return globalDcGatewayId
     */
    public String getGlobalDcGatewayId() {
        return globalDcGatewayId;
    }

    public void setGlobalDcGatewayId(String globalDcGatewayId) {
        this.globalDcGatewayId = globalDcGatewayId;
    }

    public PeerLinkEntry withBandwidthInfo(BandWidthInfo bandwidthInfo) {
        this.bandwidthInfo = bandwidthInfo;
        return this;
    }

    public PeerLinkEntry withBandwidthInfo(Consumer<BandWidthInfo> bandwidthInfoSetter) {
        if (this.bandwidthInfo == null) {
            this.bandwidthInfo = new BandWidthInfo();
            bandwidthInfoSetter.accept(this.bandwidthInfo);
        }

        return this;
    }

    /**
     * Get bandwidthInfo
     * @return bandwidthInfo
     */
    public BandWidthInfo getBandwidthInfo() {
        return bandwidthInfo;
    }

    public void setBandwidthInfo(BandWidthInfo bandwidthInfo) {
        this.bandwidthInfo = bandwidthInfo;
    }

    public PeerLinkEntry withPeerSite(PeerSite peerSite) {
        this.peerSite = peerSite;
        return this;
    }

    public PeerLinkEntry withPeerSite(Consumer<PeerSite> peerSiteSetter) {
        if (this.peerSite == null) {
            this.peerSite = new PeerSite();
            peerSiteSetter.accept(this.peerSite);
        }

        return this;
    }

    /**
     * Get peerSite
     * @return peerSite
     */
    public PeerSite getPeerSite() {
        return peerSite;
    }

    public void setPeerSite(PeerSite peerSite) {
        this.peerSite = peerSite;
    }

    public PeerLinkEntry withStatus(PeerLinkStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public PeerLinkStatus getStatus() {
        return status;
    }

    public void setStatus(PeerLinkStatus status) {
        this.status = status;
    }

    public PeerLinkEntry withCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createdTime
     */
    public OffsetDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public PeerLinkEntry withUpdatedTime(OffsetDateTime updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * 更新时间。
     * @return updatedTime
     */
    public OffsetDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(OffsetDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    public PeerLinkEntry withCreateOwner(OffsetDateTime createOwner) {
        this.createOwner = createOwner;
        return this;
    }

    /**
     * 创建归属服务名 - cc 云连接 - dc 云专线
     * @return createOwner
     */
    public OffsetDateTime getCreateOwner() {
        return createOwner;
    }

    public void setCreateOwner(OffsetDateTime createOwner) {
        this.createOwner = createOwner;
    }

    public PeerLinkEntry withInstanceId(String instanceId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PeerLinkEntry that = (PeerLinkEntry) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.globalDcGatewayId, that.globalDcGatewayId)
            && Objects.equals(this.bandwidthInfo, that.bandwidthInfo) && Objects.equals(this.peerSite, that.peerSite)
            && Objects.equals(this.status, that.status) && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.updatedTime, that.updatedTime) && Objects.equals(this.createOwner, that.createOwner)
            && Objects.equals(this.instanceId, that.instanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            tenantId,
            name,
            description,
            globalDcGatewayId,
            bandwidthInfo,
            peerSite,
            status,
            createdTime,
            updatedTime,
            createOwner,
            instanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PeerLinkEntry {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    globalDcGatewayId: ").append(toIndentedString(globalDcGatewayId)).append("\n");
        sb.append("    bandwidthInfo: ").append(toIndentedString(bandwidthInfo)).append("\n");
        sb.append("    peerSite: ").append(toIndentedString(peerSite)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    createOwner: ").append(toIndentedString(createOwner)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
