package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 授权
 */
public class Authorisation {

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
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_connection_id")

    private String cloudConnectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private String instanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_connection_domain_id")

    private String cloudConnectionDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_loaded_by_cloud_connection")

    private Boolean isLoadedByCloudConnection;

    public Authorisation withId(String id) {
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

    public Authorisation withName(String name) {
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

    public Authorisation withDescription(String description) {
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

    public Authorisation withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 网络实例（VPC，VGW）的ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public Authorisation withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 实例所属项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Authorisation withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * RegionID。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public Authorisation withCreatedAt(OffsetDateTime createdAt) {
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

    public Authorisation withUpdatedAt(OffsetDateTime updatedAt) {
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

    public Authorisation withDomainId(String domainId) {
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

    public Authorisation withCloudConnectionId(String cloudConnectionId) {
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

    public Authorisation withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 授权的状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Authorisation withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * 授权实例的类型。
     * @return instanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public Authorisation withCloudConnectionDomainId(String cloudConnectionDomainId) {
        this.cloudConnectionDomainId = cloudConnectionDomainId;
        return this;
    }

    /**
     * 被授权云连接实例所属的账户ID。
     * @return cloudConnectionDomainId
     */
    public String getCloudConnectionDomainId() {
        return cloudConnectionDomainId;
    }

    public void setCloudConnectionDomainId(String cloudConnectionDomainId) {
        this.cloudConnectionDomainId = cloudConnectionDomainId;
    }

    public Authorisation withIsLoadedByCloudConnection(Boolean isLoadedByCloudConnection) {
        this.isLoadedByCloudConnection = isLoadedByCloudConnection;
        return this;
    }

    /**
     * 是否已经被云连接加载。
     * @return isLoadedByCloudConnection
     */
    public Boolean getIsLoadedByCloudConnection() {
        return isLoadedByCloudConnection;
    }

    public void setIsLoadedByCloudConnection(Boolean isLoadedByCloudConnection) {
        this.isLoadedByCloudConnection = isLoadedByCloudConnection;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Authorisation that = (Authorisation) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.cloudConnectionId, that.cloudConnectionId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.instanceType, that.instanceType)
            && Objects.equals(this.cloudConnectionDomainId, that.cloudConnectionDomainId)
            && Objects.equals(this.isLoadedByCloudConnection, that.isLoadedByCloudConnection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            instanceId,
            projectId,
            regionId,
            createdAt,
            updatedAt,
            domainId,
            cloudConnectionId,
            status,
            instanceType,
            cloudConnectionDomainId,
            isLoadedByCloudConnection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Authorisation {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    cloudConnectionId: ").append(toIndentedString(cloudConnectionId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    cloudConnectionDomainId: ").append(toIndentedString(cloudConnectionDomainId)).append("\n");
        sb.append("    isLoadedByCloudConnection: ").append(toIndentedString(isLoadedByCloudConnection)).append("\n");
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
