package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * InstanceRepository
 */
public class InstanceRepository {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_name")

    private String namespaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_id")

    private Integer namespaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_count")

    private Integer tagCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pull_count")

    private Integer pullCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact_count")

    private Integer artifactCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_urn")

    private String resourceUrn;

    public InstanceRepository withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 仓库ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public InstanceRepository withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 仓库名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstanceRepository withNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }

    /**
     * 命名空间名称
     * @return namespaceName
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    public InstanceRepository withNamespaceId(Integer namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }

    /**
     * 命名空间ID
     * @return namespaceId
     */
    public Integer getNamespaceId() {
        return namespaceId;
    }

    public void setNamespaceId(Integer namespaceId) {
        this.namespaceId = namespaceId;
    }

    public InstanceRepository withTagCount(Integer tagCount) {
        this.tagCount = tagCount;
        return this;
    }

    /**
     * 仓库内的制品版本数量
     * @return tagCount
     */
    public Integer getTagCount() {
        return tagCount;
    }

    public void setTagCount(Integer tagCount) {
        this.tagCount = tagCount;
    }

    public InstanceRepository withPullCount(Integer pullCount) {
        this.pullCount = pullCount;
        return this;
    }

    /**
     * 被下载总次数
     * @return pullCount
     */
    public Integer getPullCount() {
        return pullCount;
    }

    public void setPullCount(Integer pullCount) {
        this.pullCount = pullCount;
    }

    public InstanceRepository withArtifactCount(Integer artifactCount) {
        this.artifactCount = artifactCount;
        return this;
    }

    /**
     * 制品包总数
     * @return artifactCount
     */
    public Integer getArtifactCount() {
        return artifactCount;
    }

    public void setArtifactCount(Integer artifactCount) {
        this.artifactCount = artifactCount;
    }

    public InstanceRepository withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InstanceRepository withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public InstanceRepository withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public InstanceRepository withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 企业仓库实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public InstanceRepository withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 企业仓库实例名称
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public InstanceRepository withResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
        return this;
    }

    /**
     * 资源URN的值，格式为：swr:<region-id>:<account-id>:repository:<registry-name>/<repository-path>
     * @return resourceUrn
     */
    public String getResourceUrn() {
        return resourceUrn;
    }

    public void setResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceRepository that = (InstanceRepository) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.namespaceName, that.namespaceName)
            && Objects.equals(this.namespaceId, that.namespaceId) && Objects.equals(this.tagCount, that.tagCount)
            && Objects.equals(this.pullCount, that.pullCount) && Objects.equals(this.artifactCount, that.artifactCount)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.resourceUrn, that.resourceUrn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            namespaceName,
            namespaceId,
            tagCount,
            pullCount,
            artifactCount,
            description,
            createdAt,
            updatedAt,
            instanceId,
            instanceName,
            resourceUrn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceRepository {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
        sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
        sb.append("    tagCount: ").append(toIndentedString(tagCount)).append("\n");
        sb.append("    pullCount: ").append(toIndentedString(pullCount)).append("\n");
        sb.append("    artifactCount: ").append(toIndentedString(artifactCount)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    resourceUrn: ").append(toIndentedString(resourceUrn)).append("\n");
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
