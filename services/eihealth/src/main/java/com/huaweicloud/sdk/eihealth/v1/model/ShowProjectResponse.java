package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowProjectResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket_name")

    private String obsBucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "swr_namespace")

    private String swrNamespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roles")

    private List<ProjectRoleRsp> roles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_time")

    private String deleteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_core")

    private Boolean isCore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_quota")

    private Long storageQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_tenant")

    private String storageTenant;

    public ShowProjectResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 项目id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowProjectResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 项目名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowProjectResponse withObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
        return this;
    }

    /**
     * 项目桶名
     * @return obsBucketName
     */
    public String getObsBucketName() {
        return obsBucketName;
    }

    public void setObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
    }

    public ShowProjectResponse withSwrNamespace(String swrNamespace) {
        this.swrNamespace = swrNamespace;
        return this;
    }

    /**
     * 项目组织名
     * @return swrNamespace
     */
    public String getSwrNamespace() {
        return swrNamespace;
    }

    public void setSwrNamespace(String swrNamespace) {
        this.swrNamespace = swrNamespace;
    }

    public ShowProjectResponse withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 项目所有者
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ShowProjectResponse withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * 当前用户在该项目上的角色
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ShowProjectResponse withRoles(List<ProjectRoleRsp> roles) {
        this.roles = roles;
        return this;
    }

    public ShowProjectResponse addRolesItem(ProjectRoleRsp rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    public ShowProjectResponse withRoles(Consumer<List<ProjectRoleRsp>> rolesSetter) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        rolesSetter.accept(this.roles);
        return this;
    }

    /**
     * 项目角色列表
     * @return roles
     */
    public List<ProjectRoleRsp> getRoles() {
        return roles;
    }

    public void setRoles(List<ProjectRoleRsp> roles) {
        this.roles = roles;
    }

    public ShowProjectResponse withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 项目桶存储量
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public ShowProjectResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 项目状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowProjectResponse withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public ShowProjectResponse addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowProjectResponse withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public ShowProjectResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 项目描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowProjectResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 项目创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowProjectResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 项目更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowProjectResponse withDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }

    /**
     * 请求删除时间
     * @return deleteTime
     */
    public String getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
    }

    public ShowProjectResponse withIsCore(Boolean isCore) {
        this.isCore = isCore;
        return this;
    }

    /**
     * 是否为核心项目
     * @return isCore
     */
    public Boolean getIsCore() {
        return isCore;
    }

    public void setIsCore(Boolean isCore) {
        this.isCore = isCore;
    }

    public ShowProjectResponse withStorageQuota(Long storageQuota) {
        this.storageQuota = storageQuota;
        return this;
    }

    /**
     * 项目数据容量配额，-1表示无容量限制
     * @return storageQuota
     */
    public Long getStorageQuota() {
        return storageQuota;
    }

    public void setStorageQuota(Long storageQuota) {
        this.storageQuota = storageQuota;
    }

    public ShowProjectResponse withStorageTenant(String storageTenant) {
        this.storageTenant = storageTenant;
        return this;
    }

    /**
     * **参数解释**： 空间桶来源租户。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return storageTenant
     */
    public String getStorageTenant() {
        return storageTenant;
    }

    public void setStorageTenant(String storageTenant) {
        this.storageTenant = storageTenant;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowProjectResponse that = (ShowProjectResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.obsBucketName, that.obsBucketName)
            && Objects.equals(this.swrNamespace, that.swrNamespace) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.role, that.role) && Objects.equals(this.roles, that.roles)
            && Objects.equals(this.size, that.size) && Objects.equals(this.status, that.status)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.description, that.description)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.deleteTime, that.deleteTime) && Objects.equals(this.isCore, that.isCore)
            && Objects.equals(this.storageQuota, that.storageQuota)
            && Objects.equals(this.storageTenant, that.storageTenant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            obsBucketName,
            swrNamespace,
            creator,
            role,
            roles,
            size,
            status,
            tags,
            description,
            createTime,
            updateTime,
            deleteTime,
            isCore,
            storageQuota,
            storageTenant);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    obsBucketName: ").append(toIndentedString(obsBucketName)).append("\n");
        sb.append("    swrNamespace: ").append(toIndentedString(swrNamespace)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    deleteTime: ").append(toIndentedString(deleteTime)).append("\n");
        sb.append("    isCore: ").append(toIndentedString(isCore)).append("\n");
        sb.append("    storageQuota: ").append(toIndentedString(storageQuota)).append("\n");
        sb.append("    storageTenant: ").append(toIndentedString(storageTenant)).append("\n");
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
