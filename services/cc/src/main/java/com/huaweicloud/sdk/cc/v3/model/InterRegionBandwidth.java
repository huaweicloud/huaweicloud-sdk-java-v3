package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 域间带宽实例。
 */
public class InterRegionBandwidth {

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
    @JsonProperty(value = "bandwidth_package_id")

    private String bandwidthPackageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_connection_id")

    private String cloudConnectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inter_regions")

    private List<InterRegion> interRegions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private Integer bandwidth;

    public InterRegionBandwidth withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 域间带宽实例的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public InterRegionBandwidth withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 域间带宽实例的名字。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InterRegionBandwidth withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 域间带宽实例的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InterRegionBandwidth withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 帐号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public InterRegionBandwidth withBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }

    /**
     * 带宽包实例的ID。
     * @return bandwidthPackageId
     */
    public String getBandwidthPackageId() {
        return bandwidthPackageId;
    }

    public void setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
    }

    public InterRegionBandwidth withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 域间带宽实例的创建时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public InterRegionBandwidth withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 域间带宽实例的更新时间。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public InterRegionBandwidth withCloudConnectionId(String cloudConnectionId) {
        this.cloudConnectionId = cloudConnectionId;
        return this;
    }

    /**
     * 云连接实例的ID。
     * @return cloudConnectionId
     */
    public String getCloudConnectionId() {
        return cloudConnectionId;
    }

    public void setCloudConnectionId(String cloudConnectionId) {
        this.cloudConnectionId = cloudConnectionId;
    }

    public InterRegionBandwidth withInterRegions(List<InterRegion> interRegions) {
        this.interRegions = interRegions;
        return this;
    }

    public InterRegionBandwidth addInterRegionsItem(InterRegion interRegionsItem) {
        if (this.interRegions == null) {
            this.interRegions = new ArrayList<>();
        }
        this.interRegions.add(interRegionsItem);
        return this;
    }

    public InterRegionBandwidth withInterRegions(Consumer<List<InterRegion>> interRegionsSetter) {
        if (this.interRegions == null) {
            this.interRegions = new ArrayList<>();
        }
        interRegionsSetter.accept(this.interRegions);
        return this;
    }

    /**
     * 域间实例信息。
     * @return interRegions
     */
    public List<InterRegion> getInterRegions() {
        return interRegions;
    }

    public void setInterRegions(List<InterRegion> interRegions) {
        this.interRegions = interRegions;
    }

    public InterRegionBandwidth withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * 域间带宽的值。
     * minimum: 1
     * maximum: 999999
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InterRegionBandwidth interRegionBandwidth = (InterRegionBandwidth) o;
        return Objects.equals(this.id, interRegionBandwidth.id) && Objects.equals(this.name, interRegionBandwidth.name)
            && Objects.equals(this.description, interRegionBandwidth.description)
            && Objects.equals(this.domainId, interRegionBandwidth.domainId)
            && Objects.equals(this.bandwidthPackageId, interRegionBandwidth.bandwidthPackageId)
            && Objects.equals(this.createdAt, interRegionBandwidth.createdAt)
            && Objects.equals(this.updatedAt, interRegionBandwidth.updatedAt)
            && Objects.equals(this.cloudConnectionId, interRegionBandwidth.cloudConnectionId)
            && Objects.equals(this.interRegions, interRegionBandwidth.interRegions)
            && Objects.equals(this.bandwidth, interRegionBandwidth.bandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            domainId,
            bandwidthPackageId,
            createdAt,
            updatedAt,
            cloudConnectionId,
            interRegions,
            bandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InterRegionBandwidth {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    bandwidthPackageId: ").append(toIndentedString(bandwidthPackageId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    cloudConnectionId: ").append(toIndentedString(cloudConnectionId)).append("\n");
        sb.append("    interRegions: ").append(toIndentedString(interRegions)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
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
