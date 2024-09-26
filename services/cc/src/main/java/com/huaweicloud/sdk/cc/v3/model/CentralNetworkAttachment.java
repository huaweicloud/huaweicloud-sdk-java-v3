package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 中心网络附件详情。
 */
public class CentralNetworkAttachment {

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
    @JsonProperty(value = "attachment_instance_type")

    private AttachmentInstanceTypeEnum attachmentInstanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_instance_id")

    private String attachmentInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_id")

    private String attachmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_instance_project_id")

    private String attachmentInstanceProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_instance_region_id")

    private String attachmentInstanceRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_instance_site_code")

    private String attachmentInstanceSiteCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_router_site_code")

    private String enterpriseRouterSiteCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specification_value")

    private CentralNetworkAttachmentSpecificationValueInfo specificationValue;

    public CentralNetworkAttachment withId(String id) {
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

    public CentralNetworkAttachment withName(String name) {
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

    public CentralNetworkAttachment withDescription(String description) {
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

    public CentralNetworkAttachment withDomainId(String domainId) {
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

    public CentralNetworkAttachment withState(CentralNetworkConnectionStateEnum state) {
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

    public CentralNetworkAttachment withCreatedAt(OffsetDateTime createdAt) {
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

    public CentralNetworkAttachment withUpdatedAt(OffsetDateTime updatedAt) {
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

    public CentralNetworkAttachment withCentralNetworkId(String centralNetworkId) {
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

    public CentralNetworkAttachment withCentralNetworkPlaneId(String centralNetworkPlaneId) {
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

    public CentralNetworkAttachment withGlobalConnectionBandwidthId(String globalConnectionBandwidthId) {
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

    public CentralNetworkAttachment withBandwidthType(BandwidthTypeEnum bandwidthType) {
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

    public CentralNetworkAttachment withBandwidthSize(Long bandwidthSize) {
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

    public CentralNetworkAttachment withIsFrozen(Boolean isFrozen) {
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

    public CentralNetworkAttachment withEnterpriseRouterId(String enterpriseRouterId) {
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

    public CentralNetworkAttachment withEnterpriseRouterProjectId(String enterpriseRouterProjectId) {
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

    public CentralNetworkAttachment withEnterpriseRouterRegionId(String enterpriseRouterRegionId) {
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

    public CentralNetworkAttachment withEnterpriseRouterAttachmentId(String enterpriseRouterAttachmentId) {
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

    public CentralNetworkAttachment withAttachmentInstanceType(AttachmentInstanceTypeEnum attachmentInstanceType) {
        this.attachmentInstanceType = attachmentInstanceType;
        return this;
    }

    /**
     * Get attachmentInstanceType
     * @return attachmentInstanceType
     */
    public AttachmentInstanceTypeEnum getAttachmentInstanceType() {
        return attachmentInstanceType;
    }

    public void setAttachmentInstanceType(AttachmentInstanceTypeEnum attachmentInstanceType) {
        this.attachmentInstanceType = attachmentInstanceType;
    }

    public CentralNetworkAttachment withAttachmentInstanceId(String attachmentInstanceId) {
        this.attachmentInstanceId = attachmentInstanceId;
        return this;
    }

    /**
     * 中心网络附件对端实例ID，企业路由器的路由表ID或者GDGW的ID。
     * @return attachmentInstanceId
     */
    public String getAttachmentInstanceId() {
        return attachmentInstanceId;
    }

    public void setAttachmentInstanceId(String attachmentInstanceId) {
        this.attachmentInstanceId = attachmentInstanceId;
    }

    public CentralNetworkAttachment withAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
        return this;
    }

    /**
     * 中心网络附件对端实例的连接ID，企业路由器的连接ID或者GDGW的连接ID。
     * @return attachmentId
     */
    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    public CentralNetworkAttachment withAttachmentInstanceProjectId(String attachmentInstanceProjectId) {
        this.attachmentInstanceProjectId = attachmentInstanceProjectId;
        return this;
    }

    /**
     * 中心网络附件对端实例的项目ID。
     * @return attachmentInstanceProjectId
     */
    public String getAttachmentInstanceProjectId() {
        return attachmentInstanceProjectId;
    }

    public void setAttachmentInstanceProjectId(String attachmentInstanceProjectId) {
        this.attachmentInstanceProjectId = attachmentInstanceProjectId;
    }

    public CentralNetworkAttachment withAttachmentInstanceRegionId(String attachmentInstanceRegionId) {
        this.attachmentInstanceRegionId = attachmentInstanceRegionId;
        return this;
    }

    /**
     * 中心网络附件对端实例的regionID。
     * @return attachmentInstanceRegionId
     */
    public String getAttachmentInstanceRegionId() {
        return attachmentInstanceRegionId;
    }

    public void setAttachmentInstanceRegionId(String attachmentInstanceRegionId) {
        this.attachmentInstanceRegionId = attachmentInstanceRegionId;
    }

    public CentralNetworkAttachment withAttachmentInstanceSiteCode(String attachmentInstanceSiteCode) {
        this.attachmentInstanceSiteCode = attachmentInstanceSiteCode;
        return this;
    }

    /**
     * 中心网络附件对端实例的站点编码。
     * @return attachmentInstanceSiteCode
     */
    public String getAttachmentInstanceSiteCode() {
        return attachmentInstanceSiteCode;
    }

    public void setAttachmentInstanceSiteCode(String attachmentInstanceSiteCode) {
        this.attachmentInstanceSiteCode = attachmentInstanceSiteCode;
    }

    public CentralNetworkAttachment withEnterpriseRouterSiteCode(String enterpriseRouterSiteCode) {
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

    public CentralNetworkAttachment withSpecificationValue(
        CentralNetworkAttachmentSpecificationValueInfo specificationValue) {
        this.specificationValue = specificationValue;
        return this;
    }

    public CentralNetworkAttachment withSpecificationValue(
        Consumer<CentralNetworkAttachmentSpecificationValueInfo> specificationValueSetter) {
        if (this.specificationValue == null) {
            this.specificationValue = new CentralNetworkAttachmentSpecificationValueInfo();
            specificationValueSetter.accept(this.specificationValue);
        }

        return this;
    }

    /**
     * Get specificationValue
     * @return specificationValue
     */
    public CentralNetworkAttachmentSpecificationValueInfo getSpecificationValue() {
        return specificationValue;
    }

    public void setSpecificationValue(CentralNetworkAttachmentSpecificationValueInfo specificationValue) {
        this.specificationValue = specificationValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CentralNetworkAttachment that = (CentralNetworkAttachment) obj;
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
            && Objects.equals(this.attachmentInstanceType, that.attachmentInstanceType)
            && Objects.equals(this.attachmentInstanceId, that.attachmentInstanceId)
            && Objects.equals(this.attachmentId, that.attachmentId)
            && Objects.equals(this.attachmentInstanceProjectId, that.attachmentInstanceProjectId)
            && Objects.equals(this.attachmentInstanceRegionId, that.attachmentInstanceRegionId)
            && Objects.equals(this.attachmentInstanceSiteCode, that.attachmentInstanceSiteCode)
            && Objects.equals(this.enterpriseRouterSiteCode, that.enterpriseRouterSiteCode)
            && Objects.equals(this.specificationValue, that.specificationValue);
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
            attachmentInstanceType,
            attachmentInstanceId,
            attachmentId,
            attachmentInstanceProjectId,
            attachmentInstanceRegionId,
            attachmentInstanceSiteCode,
            enterpriseRouterSiteCode,
            specificationValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CentralNetworkAttachment {\n");
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
        sb.append("    attachmentInstanceType: ").append(toIndentedString(attachmentInstanceType)).append("\n");
        sb.append("    attachmentInstanceId: ").append(toIndentedString(attachmentInstanceId)).append("\n");
        sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
        sb.append("    attachmentInstanceProjectId: ")
            .append(toIndentedString(attachmentInstanceProjectId))
            .append("\n");
        sb.append("    attachmentInstanceRegionId: ").append(toIndentedString(attachmentInstanceRegionId)).append("\n");
        sb.append("    attachmentInstanceSiteCode: ").append(toIndentedString(attachmentInstanceSiteCode)).append("\n");
        sb.append("    enterpriseRouterSiteCode: ").append(toIndentedString(enterpriseRouterSiteCode)).append("\n");
        sb.append("    specificationValue: ").append(toIndentedString(specificationValue)).append("\n");
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
