package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CloudConnectionCapabilityInfo
 */
public class CloudConnectionCapabilityInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support")

    private Boolean isSupport;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private CloudConnectionDomainBandwidthValue bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_regions")

    private List<String> supportRegions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_sites")

    private List<String> supportSites = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private CloudConnectionCapabilityKeyEnum resourceType;

    public CloudConnectionCapabilityInfo withId(String id) {
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

    public CloudConnectionCapabilityInfo withDomainId(String domainId) {
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

    public CloudConnectionCapabilityInfo withDescription(String description) {
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

    public CloudConnectionCapabilityInfo withCreatedAt(OffsetDateTime createdAt) {
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

    public CloudConnectionCapabilityInfo withUpdatedAt(OffsetDateTime updatedAt) {
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

    public CloudConnectionCapabilityInfo withIsSupport(Boolean isSupport) {
        this.isSupport = isSupport;
        return this;
    }

    /**
     * 是否支持云连接能力。
     * @return isSupport
     */
    public Boolean getIsSupport() {
        return isSupport;
    }

    public void setIsSupport(Boolean isSupport) {
        this.isSupport = isSupport;
    }

    public CloudConnectionCapabilityInfo withBandwidth(CloudConnectionDomainBandwidthValue bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public CloudConnectionCapabilityInfo withBandwidth(Consumer<CloudConnectionDomainBandwidthValue> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new CloudConnectionDomainBandwidthValue();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /**
     * Get bandwidth
     * @return bandwidth
     */
    public CloudConnectionDomainBandwidthValue getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(CloudConnectionDomainBandwidthValue bandwidth) {
        this.bandwidth = bandwidth;
    }

    public CloudConnectionCapabilityInfo withSupportRegions(List<String> supportRegions) {
        this.supportRegions = supportRegions;
        return this;
    }

    public CloudConnectionCapabilityInfo addSupportRegionsItem(String supportRegionsItem) {
        if (this.supportRegions == null) {
            this.supportRegions = new ArrayList<>();
        }
        this.supportRegions.add(supportRegionsItem);
        return this;
    }

    public CloudConnectionCapabilityInfo withSupportRegions(Consumer<List<String>> supportRegionsSetter) {
        if (this.supportRegions == null) {
            this.supportRegions = new ArrayList<>();
        }
        supportRegionsSetter.accept(this.supportRegions);
        return this;
    }

    /**
     * 租户支持的区域列表。
     * @return supportRegions
     */
    public List<String> getSupportRegions() {
        return supportRegions;
    }

    public void setSupportRegions(List<String> supportRegions) {
        this.supportRegions = supportRegions;
    }

    public CloudConnectionCapabilityInfo withSupportSites(List<String> supportSites) {
        this.supportSites = supportSites;
        return this;
    }

    public CloudConnectionCapabilityInfo addSupportSitesItem(String supportSitesItem) {
        if (this.supportSites == null) {
            this.supportSites = new ArrayList<>();
        }
        this.supportSites.add(supportSitesItem);
        return this;
    }

    public CloudConnectionCapabilityInfo withSupportSites(Consumer<List<String>> supportSitesSetter) {
        if (this.supportSites == null) {
            this.supportSites = new ArrayList<>();
        }
        supportSitesSetter.accept(this.supportSites);
        return this;
    }

    /**
     * 租户支持的Site列表。
     * @return supportSites
     */
    public List<String> getSupportSites() {
        return supportSites;
    }

    public void setSupportSites(List<String> supportSites) {
        this.supportSites = supportSites;
    }

    public CloudConnectionCapabilityInfo withResourceType(CloudConnectionCapabilityKeyEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get resourceType
     * @return resourceType
     */
    public CloudConnectionCapabilityKeyEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(CloudConnectionCapabilityKeyEnum resourceType) {
        this.resourceType = resourceType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloudConnectionCapabilityInfo that = (CloudConnectionCapabilityInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.isSupport, that.isSupport)
            && Objects.equals(this.bandwidth, that.bandwidth)
            && Objects.equals(this.supportRegions, that.supportRegions)
            && Objects.equals(this.supportSites, that.supportSites)
            && Objects.equals(this.resourceType, that.resourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            domainId,
            description,
            createdAt,
            updatedAt,
            isSupport,
            bandwidth,
            supportRegions,
            supportSites,
            resourceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudConnectionCapabilityInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    isSupport: ").append(toIndentedString(isSupport)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    supportRegions: ").append(toIndentedString(supportRegions)).append("\n");
        sb.append("    supportSites: ").append(toIndentedString(supportSites)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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
