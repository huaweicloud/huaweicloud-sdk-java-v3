package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 边缘小站信息。
 */
public class WksEdgeSiteDetail {

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
    @JsonProperty(value = "availability_zone_id")

    private String availabilityZoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_usage_rate")

    private Double cpuUsageRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_usage_rate")

    private Double memoryUsageRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity_usage_rate")

    private Double capacityUsageRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_info")

    private SimpleSiteInfo siteInfo;

    public WksEdgeSiteDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 边缘小站id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WksEdgeSiteDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 边缘小站名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WksEdgeSiteDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 边缘小站描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WksEdgeSiteDetail withAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
        return this;
    }

    /**
     * 边缘小站的可用区ID。
     * @return availabilityZoneId
     */
    public String getAvailabilityZoneId() {
        return availabilityZoneId;
    }

    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    public WksEdgeSiteDetail withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 部署位置。
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public WksEdgeSiteDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 边缘小站的部署状态。 - initial：待部署。 - deploying：部署中。 - available：可用。 - unavailable：不可用。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public WksEdgeSiteDetail withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 边缘小站创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public WksEdgeSiteDetail withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 边缘小站更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public WksEdgeSiteDetail withCpuUsageRate(Double cpuUsageRate) {
        this.cpuUsageRate = cpuUsageRate;
        return this;
    }

    /**
     * cpu使用率。
     * @return cpuUsageRate
     */
    public Double getCpuUsageRate() {
        return cpuUsageRate;
    }

    public void setCpuUsageRate(Double cpuUsageRate) {
        this.cpuUsageRate = cpuUsageRate;
    }

    public WksEdgeSiteDetail withMemoryUsageRate(Double memoryUsageRate) {
        this.memoryUsageRate = memoryUsageRate;
        return this;
    }

    /**
     * 内存使用率。
     * @return memoryUsageRate
     */
    public Double getMemoryUsageRate() {
        return memoryUsageRate;
    }

    public void setMemoryUsageRate(Double memoryUsageRate) {
        this.memoryUsageRate = memoryUsageRate;
    }

    public WksEdgeSiteDetail withCapacityUsageRate(Double capacityUsageRate) {
        this.capacityUsageRate = capacityUsageRate;
        return this;
    }

    /**
     * 存储使用率。
     * @return capacityUsageRate
     */
    public Double getCapacityUsageRate() {
        return capacityUsageRate;
    }

    public void setCapacityUsageRate(Double capacityUsageRate) {
        this.capacityUsageRate = capacityUsageRate;
    }

    public WksEdgeSiteDetail withSiteInfo(SimpleSiteInfo siteInfo) {
        this.siteInfo = siteInfo;
        return this;
    }

    public WksEdgeSiteDetail withSiteInfo(Consumer<SimpleSiteInfo> siteInfoSetter) {
        if (this.siteInfo == null) {
            this.siteInfo = new SimpleSiteInfo();
            siteInfoSetter.accept(this.siteInfo);
        }

        return this;
    }

    /**
     * Get siteInfo
     * @return siteInfo
     */
    public SimpleSiteInfo getSiteInfo() {
        return siteInfo;
    }

    public void setSiteInfo(SimpleSiteInfo siteInfo) {
        this.siteInfo = siteInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WksEdgeSiteDetail that = (WksEdgeSiteDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.availabilityZoneId, that.availabilityZoneId)
            && Objects.equals(this.address, that.address) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.cpuUsageRate, that.cpuUsageRate)
            && Objects.equals(this.memoryUsageRate, that.memoryUsageRate)
            && Objects.equals(this.capacityUsageRate, that.capacityUsageRate)
            && Objects.equals(this.siteInfo, that.siteInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            availabilityZoneId,
            address,
            status,
            createdAt,
            updatedAt,
            cpuUsageRate,
            memoryUsageRate,
            capacityUsageRate,
            siteInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WksEdgeSiteDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    availabilityZoneId: ").append(toIndentedString(availabilityZoneId)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    cpuUsageRate: ").append(toIndentedString(cpuUsageRate)).append("\n");
        sb.append("    memoryUsageRate: ").append(toIndentedString(memoryUsageRate)).append("\n");
        sb.append("    capacityUsageRate: ").append(toIndentedString(capacityUsageRate)).append("\n");
        sb.append("    siteInfo: ").append(toIndentedString(siteInfo)).append("\n");
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
