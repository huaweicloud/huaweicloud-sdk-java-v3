package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 项目信息
 */
public class ProjectRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

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
    @JsonProperty(value = "top_time")

    private String topTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_time")

    private String deleteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_core")

    private Boolean isCore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_tenant")

    private String storageTenant;

    public ProjectRsp withId(String id) {
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

    public ProjectRsp withName(String name) {
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

    public ProjectRsp withCreator(String creator) {
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

    public ProjectRsp withRole(String role) {
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

    public ProjectRsp withSize(Long size) {
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

    public ProjectRsp withStatus(String status) {
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

    public ProjectRsp withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public ProjectRsp addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ProjectRsp withTags(Consumer<List<String>> tagsSetter) {
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

    public ProjectRsp withDescription(String description) {
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

    public ProjectRsp withCreateTime(String createTime) {
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

    public ProjectRsp withUpdateTime(String updateTime) {
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

    public ProjectRsp withTopTime(String topTime) {
        this.topTime = topTime;
        return this;
    }

    /**
     * **参数解释**： 空间置顶时间。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return topTime
     */
    public String getTopTime() {
        return topTime;
    }

    public void setTopTime(String topTime) {
        this.topTime = topTime;
    }

    public ProjectRsp withDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }

    /**
     * **参数解释**： 请求删除时间。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return deleteTime
     */
    public String getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
    }

    public ProjectRsp withIsCore(Boolean isCore) {
        this.isCore = isCore;
        return this;
    }

    /**
     * **参数解释**： 核心空间标记。 **约束限制**： 不涉及 **取值范围**： true 或 false。 **默认取值**： 不涉及 
     * @return isCore
     */
    public Boolean getIsCore() {
        return isCore;
    }

    public void setIsCore(Boolean isCore) {
        this.isCore = isCore;
    }

    public ProjectRsp withStorageTenant(String storageTenant) {
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
        ProjectRsp that = (ProjectRsp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.role, that.role)
            && Objects.equals(this.size, that.size) && Objects.equals(this.status, that.status)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.description, that.description)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.topTime, that.topTime) && Objects.equals(this.deleteTime, that.deleteTime)
            && Objects.equals(this.isCore, that.isCore) && Objects.equals(this.storageTenant, that.storageTenant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            creator,
            role,
            size,
            status,
            tags,
            description,
            createTime,
            updateTime,
            topTime,
            deleteTime,
            isCore,
            storageTenant);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectRsp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    topTime: ").append(toIndentedString(topTime)).append("\n");
        sb.append("    deleteTime: ").append(toIndentedString(deleteTime)).append("\n");
        sb.append("    isCore: ").append(toIndentedString(isCore)).append("\n");
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
