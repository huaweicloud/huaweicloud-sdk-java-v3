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
    @JsonProperty(value = "status")

    private String status;

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
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private String instanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_connection_domain_id")

    private String cloudConnectionDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_connection_id")

    private String cloudConnectionId;

    public Authorisation withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 授权的ID。
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
     * 授权的名称。
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
     * 授权的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Authorisation withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建授权的时间。
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
     * 更新授权的时间。
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
     * 授权者的账户ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public Authorisation withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 授权实例的ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
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

    public Authorisation withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 授权实例所属Region。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public Authorisation withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 授权实例所属项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
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

    public Authorisation withCloudConnectionId(String cloudConnectionId) {
        this.cloudConnectionId = cloudConnectionId;
        return this;
    }

    /**
     * 被授权云连接实例ID。
     * @return cloudConnectionId
     */
    public String getCloudConnectionId() {
        return cloudConnectionId;
    }

    public void setCloudConnectionId(String cloudConnectionId) {
        this.cloudConnectionId = cloudConnectionId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Authorisation authorisation = (Authorisation) o;
        return Objects.equals(this.id, authorisation.id) && Objects.equals(this.name, authorisation.name)
            && Objects.equals(this.description, authorisation.description)
            && Objects.equals(this.status, authorisation.status)
            && Objects.equals(this.createdAt, authorisation.createdAt)
            && Objects.equals(this.updatedAt, authorisation.updatedAt)
            && Objects.equals(this.domainId, authorisation.domainId)
            && Objects.equals(this.instanceId, authorisation.instanceId)
            && Objects.equals(this.instanceType, authorisation.instanceType)
            && Objects.equals(this.regionId, authorisation.regionId)
            && Objects.equals(this.projectId, authorisation.projectId)
            && Objects.equals(this.cloudConnectionDomainId, authorisation.cloudConnectionDomainId)
            && Objects.equals(this.cloudConnectionId, authorisation.cloudConnectionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            status,
            createdAt,
            updatedAt,
            domainId,
            instanceId,
            instanceType,
            regionId,
            projectId,
            cloudConnectionDomainId,
            cloudConnectionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Authorisation {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    cloudConnectionDomainId: ").append(toIndentedString(cloudConnectionDomainId)).append("\n");
        sb.append("    cloudConnectionId: ").append(toIndentedString(cloudConnectionId)).append("\n");
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
