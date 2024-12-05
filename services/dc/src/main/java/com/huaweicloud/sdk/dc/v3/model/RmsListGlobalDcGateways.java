package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RmsListGlobalDcGateways
 */
public class RmsListGlobalDcGateways {

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
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_center_network_id")

    private String globalCenterNetworkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_network_id")

    private String siteNetworkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_connection_id")

    private String cloudConnectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bgp_asn")

    private Long bgpAsn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location_name")

    private String locationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locales")

    private Locale locales;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_peer_link_count")

    private Integer currentPeerLinkCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_peer_link_count")

    private Integer availablePeerLinkCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private OffsetDateTime createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private OffsetDateTime updatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private Map<String, String> tags = null;

    public RmsListGlobalDcGateways withId(String id) {
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

    public RmsListGlobalDcGateways withTenantId(String tenantId) {
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

    public RmsListGlobalDcGateways withName(String name) {
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

    public RmsListGlobalDcGateways withDescription(String description) {
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

    public RmsListGlobalDcGateways withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public RmsListGlobalDcGateways withGlobalCenterNetworkId(String globalCenterNetworkId) {
        this.globalCenterNetworkId = globalCenterNetworkId;
        return this;
    }

    /**
     * 全球中心网路ID
     * @return globalCenterNetworkId
     */
    public String getGlobalCenterNetworkId() {
        return globalCenterNetworkId;
    }

    public void setGlobalCenterNetworkId(String globalCenterNetworkId) {
        this.globalCenterNetworkId = globalCenterNetworkId;
    }

    public RmsListGlobalDcGateways withSiteNetworkId(String siteNetworkId) {
        this.siteNetworkId = siteNetworkId;
        return this;
    }

    /**
     * 站点网络ID
     * @return siteNetworkId
     */
    public String getSiteNetworkId() {
        return siteNetworkId;
    }

    public void setSiteNetworkId(String siteNetworkId) {
        this.siteNetworkId = siteNetworkId;
    }

    public RmsListGlobalDcGateways withCloudConnectionId(String cloudConnectionId) {
        this.cloudConnectionId = cloudConnectionId;
        return this;
    }

    /**
     * 云连接ID
     * @return cloudConnectionId
     */
    public String getCloudConnectionId() {
        return cloudConnectionId;
    }

    public void setCloudConnectionId(String cloudConnectionId) {
        this.cloudConnectionId = cloudConnectionId;
    }

    public RmsListGlobalDcGateways withBgpAsn(Long bgpAsn) {
        this.bgpAsn = bgpAsn;
        return this;
    }

    /**
     * BGP模式AS号
     * @return bgpAsn
     */
    public Long getBgpAsn() {
        return bgpAsn;
    }

    public void setBgpAsn(Long bgpAsn) {
        this.bgpAsn = bgpAsn;
    }

    public RmsListGlobalDcGateways withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 局点ID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public RmsListGlobalDcGateways withLocationName(String locationName) {
        this.locationName = locationName;
        return this;
    }

    /**
     * 位置名称
     * @return locationName
     */
    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public RmsListGlobalDcGateways withLocales(Locale locales) {
        this.locales = locales;
        return this;
    }

    public RmsListGlobalDcGateways withLocales(Consumer<Locale> localesSetter) {
        if (this.locales == null) {
            this.locales = new Locale();
            localesSetter.accept(this.locales);
        }

        return this;
    }

    /**
     * Get locales
     * @return locales
     */
    public Locale getLocales() {
        return locales;
    }

    public void setLocales(Locale locales) {
        this.locales = locales;
    }

    public RmsListGlobalDcGateways withCurrentPeerLinkCount(Integer currentPeerLinkCount) {
        this.currentPeerLinkCount = currentPeerLinkCount;
        return this;
    }

    /**
     * 当前对等体数量
     * @return currentPeerLinkCount
     */
    public Integer getCurrentPeerLinkCount() {
        return currentPeerLinkCount;
    }

    public void setCurrentPeerLinkCount(Integer currentPeerLinkCount) {
        this.currentPeerLinkCount = currentPeerLinkCount;
    }

    public RmsListGlobalDcGateways withAvailablePeerLinkCount(Integer availablePeerLinkCount) {
        this.availablePeerLinkCount = availablePeerLinkCount;
        return this;
    }

    /**
     * 有效对等体数量
     * @return availablePeerLinkCount
     */
    public Integer getAvailablePeerLinkCount() {
        return availablePeerLinkCount;
    }

    public void setAvailablePeerLinkCount(Integer availablePeerLinkCount) {
        this.availablePeerLinkCount = availablePeerLinkCount;
    }

    public RmsListGlobalDcGateways withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 是否冻结：true-是，false-否
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public RmsListGlobalDcGateways withStatus(String status) {
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

    public RmsListGlobalDcGateways withCreatedTime(OffsetDateTime createdTime) {
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

    public RmsListGlobalDcGateways withUpdatedTime(OffsetDateTime updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * 更新时间
     * @return updatedTime
     */
    public OffsetDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(OffsetDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    public RmsListGlobalDcGateways withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    public RmsListGlobalDcGateways putTagsItem(String key, String tagsItem) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        this.tags.put(key, tagsItem);
        return this;
    }

    public RmsListGlobalDcGateways withTags(Consumer<Map<String, String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 返回给RMS的资源标签
     * @return tags
     */
    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RmsListGlobalDcGateways that = (RmsListGlobalDcGateways) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.globalCenterNetworkId, that.globalCenterNetworkId)
            && Objects.equals(this.siteNetworkId, that.siteNetworkId)
            && Objects.equals(this.cloudConnectionId, that.cloudConnectionId)
            && Objects.equals(this.bgpAsn, that.bgpAsn) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.locationName, that.locationName) && Objects.equals(this.locales, that.locales)
            && Objects.equals(this.currentPeerLinkCount, that.currentPeerLinkCount)
            && Objects.equals(this.availablePeerLinkCount, that.availablePeerLinkCount)
            && Objects.equals(this.adminStateUp, that.adminStateUp) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createdTime, that.createdTime) && Objects.equals(this.updatedTime, that.updatedTime)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            tenantId,
            name,
            description,
            enterpriseProjectId,
            globalCenterNetworkId,
            siteNetworkId,
            cloudConnectionId,
            bgpAsn,
            regionId,
            locationName,
            locales,
            currentPeerLinkCount,
            availablePeerLinkCount,
            adminStateUp,
            status,
            createdTime,
            updatedTime,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RmsListGlobalDcGateways {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    globalCenterNetworkId: ").append(toIndentedString(globalCenterNetworkId)).append("\n");
        sb.append("    siteNetworkId: ").append(toIndentedString(siteNetworkId)).append("\n");
        sb.append("    cloudConnectionId: ").append(toIndentedString(cloudConnectionId)).append("\n");
        sb.append("    bgpAsn: ").append(toIndentedString(bgpAsn)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
        sb.append("    locales: ").append(toIndentedString(locales)).append("\n");
        sb.append("    currentPeerLinkCount: ").append(toIndentedString(currentPeerLinkCount)).append("\n");
        sb.append("    availablePeerLinkCount: ").append(toIndentedString(availablePeerLinkCount)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
