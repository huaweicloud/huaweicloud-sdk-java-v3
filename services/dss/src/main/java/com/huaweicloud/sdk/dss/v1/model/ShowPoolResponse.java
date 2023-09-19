package com.huaweicloud.sdk.dss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowPoolResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private Integer capacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_capacity_gb")

    private Integer totalCapacityGb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_capacity_gb")

    private Integer usedCapacityGb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provisioned_capacity_gb")

    private Integer provisionedCapacityGb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_over_subscription_ratio")

    private Float maxOverSubscriptionRatio;

    public ShowPoolResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 专属分布式存储池名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowPoolResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 专属分布式存储池ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowPoolResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 所属的项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowPoolResponse withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * 申请的专属分布式存储池容量，单位GB。
     * @return capacity
     */
    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public ShowPoolResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 专属分布式存储池的存储类型。  SAS：高IO专属分布式存储池。 SSD：超高IO专属分布式存储池。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowPoolResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 专属分布式存储池的状态，详细信息请参考\"[专属分布式存储池状态](https://support.huaweicloud.com/api-dss/dss_02_0023.html)\"。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowPoolResponse withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 专属分布式存储池所在AZ。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ShowPoolResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ShowPoolResponse withTotalCapacityGb(Integer totalCapacityGb) {
        this.totalCapacityGb = totalCapacityGb;
        return this;
    }

    /**
     * 总容量。
     * @return totalCapacityGb
     */
    public Integer getTotalCapacityGb() {
        return totalCapacityGb;
    }

    public void setTotalCapacityGb(Integer totalCapacityGb) {
        this.totalCapacityGb = totalCapacityGb;
    }

    public ShowPoolResponse withUsedCapacityGb(Integer usedCapacityGb) {
        this.usedCapacityGb = usedCapacityGb;
        return this;
    }

    /**
     * 已使用容量。
     * @return usedCapacityGb
     */
    public Integer getUsedCapacityGb() {
        return usedCapacityGb;
    }

    public void setUsedCapacityGb(Integer usedCapacityGb) {
        this.usedCapacityGb = usedCapacityGb;
    }

    public ShowPoolResponse withProvisionedCapacityGb(Integer provisionedCapacityGb) {
        this.provisionedCapacityGb = provisionedCapacityGb;
        return this;
    }

    /**
     * 已分配容量。
     * @return provisionedCapacityGb
     */
    public Integer getProvisionedCapacityGb() {
        return provisionedCapacityGb;
    }

    public void setProvisionedCapacityGb(Integer provisionedCapacityGb) {
        this.provisionedCapacityGb = provisionedCapacityGb;
    }

    public ShowPoolResponse withMaxOverSubscriptionRatio(Float maxOverSubscriptionRatio) {
        this.maxOverSubscriptionRatio = maxOverSubscriptionRatio;
        return this;
    }

    /**
     * 超分比。
     * @return maxOverSubscriptionRatio
     */
    public Float getMaxOverSubscriptionRatio() {
        return maxOverSubscriptionRatio;
    }

    public void setMaxOverSubscriptionRatio(Float maxOverSubscriptionRatio) {
        this.maxOverSubscriptionRatio = maxOverSubscriptionRatio;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPoolResponse that = (ShowPoolResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.id, that.id)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.capacity, that.capacity)
            && Objects.equals(this.type, that.type) && Objects.equals(this.status, that.status)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.totalCapacityGb, that.totalCapacityGb)
            && Objects.equals(this.usedCapacityGb, that.usedCapacityGb)
            && Objects.equals(this.provisionedCapacityGb, that.provisionedCapacityGb)
            && Objects.equals(this.maxOverSubscriptionRatio, that.maxOverSubscriptionRatio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            id,
            projectId,
            capacity,
            type,
            status,
            availabilityZone,
            createdAt,
            totalCapacityGb,
            usedCapacityGb,
            provisionedCapacityGb,
            maxOverSubscriptionRatio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPoolResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    totalCapacityGb: ").append(toIndentedString(totalCapacityGb)).append("\n");
        sb.append("    usedCapacityGb: ").append(toIndentedString(usedCapacityGb)).append("\n");
        sb.append("    provisionedCapacityGb: ").append(toIndentedString(provisionedCapacityGb)).append("\n");
        sb.append("    maxOverSubscriptionRatio: ").append(toIndentedString(maxOverSubscriptionRatio)).append("\n");
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
