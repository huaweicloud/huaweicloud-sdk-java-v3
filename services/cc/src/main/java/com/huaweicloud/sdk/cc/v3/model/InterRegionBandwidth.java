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
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_connection_id")

    private String cloudConnectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_package_id")

    private String bandwidthPackageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inter_regions")

    private List<InterRegion> interRegions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private Long bandwidth;

    public InterRegionBandwidth withId(String id) {
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

    public InterRegionBandwidth withName(String name) {
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

    public InterRegionBandwidth withDescription(String description) {
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

    public InterRegionBandwidth withDomainId(String domainId) {
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

    public InterRegionBandwidth withCreatedAt(OffsetDateTime createdAt) {
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

    public InterRegionBandwidth withUpdatedAt(OffsetDateTime updatedAt) {
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

    public InterRegionBandwidth withCloudConnectionId(String cloudConnectionId) {
        this.cloudConnectionId = cloudConnectionId;
        return this;
    }

    /**
     * 云连接实例ID。
     * @return cloudConnectionId
     */
    public String getCloudConnectionId() {
        return cloudConnectionId;
    }

    public void setCloudConnectionId(String cloudConnectionId) {
        this.cloudConnectionId = cloudConnectionId;
    }

    public InterRegionBandwidth withBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }

    /**
     * 带宽包实例ID。
     * @return bandwidthPackageId
     */
    public String getBandwidthPackageId() {
        return bandwidthPackageId;
    }

    public void setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
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

    public InterRegionBandwidth withBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * 带宽值，单位Mbps。
     * minimum: 1
     * maximum: 999999
     * @return bandwidth
     */
    public Long getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InterRegionBandwidth that = (InterRegionBandwidth) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.cloudConnectionId, that.cloudConnectionId)
            && Objects.equals(this.bandwidthPackageId, that.bandwidthPackageId)
            && Objects.equals(this.interRegions, that.interRegions) && Objects.equals(this.bandwidth, that.bandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            domainId,
            createdAt,
            updatedAt,
            cloudConnectionId,
            bandwidthPackageId,
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
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    cloudConnectionId: ").append(toIndentedString(cloudConnectionId)).append("\n");
        sb.append("    bandwidthPackageId: ").append(toIndentedString(bandwidthPackageId)).append("\n");
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
