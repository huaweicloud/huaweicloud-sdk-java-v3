package com.huaweicloud.sdk.ram.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 有关RAM权限的信息。
 */
public class Permission {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_resource_type_default")

    private Boolean isResourceTypeDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_urn")

    private String permissionUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_type")

    private String permissionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_version")

    private Boolean defaultVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private Integer version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public Permission withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 权限ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Permission withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 权限名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Permission withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public Permission withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 权限的影响和行为。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Permission withIsResourceTypeDefault(Boolean isResourceTypeDefault) {
        this.isResourceTypeDefault = isResourceTypeDefault;
        return this;
    }

    /**
     * 该权限是否是此资源类型的默认权限。
     * @return isResourceTypeDefault
     */
    public Boolean getIsResourceTypeDefault() {
        return isResourceTypeDefault;
    }

    public void setIsResourceTypeDefault(Boolean isResourceTypeDefault) {
        this.isResourceTypeDefault = isResourceTypeDefault;
    }

    public Permission withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 权限的创建时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Permission withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 最后一次更新权限的时间。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Permission withPermissionUrn(String permissionUrn) {
        this.permissionUrn = permissionUrn;
        return this;
    }

    /**
     * 权限URN。
     * @return permissionUrn
     */
    public String getPermissionUrn() {
        return permissionUrn;
    }

    public void setPermissionUrn(String permissionUrn) {
        this.permissionUrn = permissionUrn;
    }

    public Permission withPermissionType(String permissionType) {
        this.permissionType = permissionType;
        return this;
    }

    /**
     * 权限类型。
     * @return permissionType
     */
    public String getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }

    public Permission withDefaultVersion(Boolean defaultVersion) {
        this.defaultVersion = defaultVersion;
        return this;
    }

    /**
     * 此权限是否为默认版本。
     * @return defaultVersion
     */
    public Boolean getDefaultVersion() {
        return defaultVersion;
    }

    public void setDefaultVersion(Boolean defaultVersion) {
        this.defaultVersion = defaultVersion;
    }

    public Permission withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * 权限版本。
     * minimum: 0
     * maximum: 1000000
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Permission withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 权限的状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Permission that = (Permission) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.content, that.content)
            && Objects.equals(this.isResourceTypeDefault, that.isResourceTypeDefault)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.permissionUrn, that.permissionUrn)
            && Objects.equals(this.permissionType, that.permissionType)
            && Objects.equals(this.defaultVersion, that.defaultVersion) && Objects.equals(this.version, that.version)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            resourceType,
            content,
            isResourceTypeDefault,
            createdAt,
            updatedAt,
            permissionUrn,
            permissionType,
            defaultVersion,
            version,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Permission {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    isResourceTypeDefault: ").append(toIndentedString(isResourceTypeDefault)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    permissionUrn: ").append(toIndentedString(permissionUrn)).append("\n");
        sb.append("    permissionType: ").append(toIndentedString(permissionType)).append("\n");
        sb.append("    defaultVersion: ").append(toIndentedString(defaultVersion)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
