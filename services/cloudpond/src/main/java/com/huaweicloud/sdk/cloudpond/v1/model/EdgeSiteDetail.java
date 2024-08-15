package com.huaweicloud.sdk.cloudpond.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 边缘小站详情
 */
public class EdgeSiteDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_id")

    private String availabilityZoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private LocationDetail location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public EdgeSiteDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 边缘小站ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EdgeSiteDetail withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 边缘小站所属账号ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public EdgeSiteDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 边缘小站名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EdgeSiteDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 边缘小站描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EdgeSiteDetail withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 边缘小站所属区域ID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public EdgeSiteDetail withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 边缘小站所属项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public EdgeSiteDetail withAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
        return this;
    }

    /**
     * 边缘小站的可用区ID
     * @return availabilityZoneId
     */
    public String getAvailabilityZoneId() {
        return availabilityZoneId;
    }

    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    public EdgeSiteDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 边缘小站的部署状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public EdgeSiteDetail withLocation(LocationDetail location) {
        this.location = location;
        return this;
    }

    public EdgeSiteDetail withLocation(Consumer<LocationDetail> locationSetter) {
        if (this.location == null) {
            this.location = new LocationDetail();
            locationSetter.accept(this.location);
        }

        return this;
    }

    /**
     * Get location
     * @return location
     */
    public LocationDetail getLocation() {
        return location;
    }

    public void setLocation(LocationDetail location) {
        this.location = location;
    }

    public EdgeSiteDetail withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * [边缘小站](tag:hws)[分布式微型专属小站](tag:cmcc)所属企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public EdgeSiteDetail withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 边缘小站创建时间
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public EdgeSiteDetail withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 边缘小站更新时间
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
        EdgeSiteDetail that = (EdgeSiteDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.availabilityZoneId, that.availabilityZoneId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.location, that.location)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            domainId,
            name,
            description,
            regionId,
            projectId,
            availabilityZoneId,
            status,
            location,
            enterpriseProjectId,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EdgeSiteDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    availabilityZoneId: ").append(toIndentedString(availabilityZoneId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
