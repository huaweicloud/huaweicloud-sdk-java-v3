package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Job详情信息
 */
public class JobInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility")

    private String visibility;

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
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private JobType type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_version")

    private JobVersionInfo currentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_endpoint_id")

    private String currentEndpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private User createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_user")

    private User updateUser;

    public JobInfo withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * 可见性：  - PRIVATE：私有  - PUBLIC：公共  默认为PRIVATE
     * @return visibility
     */
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public JobInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 作业Id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public JobInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Job名称,只能包含中文、字母、数字、下划线、中划线、点、空格
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public JobInfo withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public JobInfo withType(JobType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public JobType getType() {
        return type;
    }

    public void setType(JobType type) {
        this.type = type;
    }

    public JobInfo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public JobInfo withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public JobInfo withCurrentVersion(JobVersionInfo currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    public JobInfo withCurrentVersion(Consumer<JobVersionInfo> currentVersionSetter) {
        if (this.currentVersion == null) {
            this.currentVersion = new JobVersionInfo();
            currentVersionSetter.accept(this.currentVersion);
        }

        return this;
    }

    /**
     * Get currentVersion
     * @return currentVersion
     */
    public JobVersionInfo getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(JobVersionInfo currentVersion) {
        this.currentVersion = currentVersion;
    }

    public JobInfo withCurrentEndpointId(String currentEndpointId) {
        this.currentEndpointId = currentEndpointId;
        return this;
    }

    /**
     * Endpoint Id，32~36位的英文、数字、短横组合。
     * @return currentEndpointId
     */
    public String getCurrentEndpointId() {
        return currentEndpointId;
    }

    public void setCurrentEndpointId(String currentEndpointId) {
        this.currentEndpointId = currentEndpointId;
    }

    public JobInfo withCreateUser(User createUser) {
        this.createUser = createUser;
        return this;
    }

    public JobInfo withCreateUser(Consumer<User> createUserSetter) {
        if (this.createUser == null) {
            this.createUser = new User();
            createUserSetter.accept(this.createUser);
        }

        return this;
    }

    /**
     * Get createUser
     * @return createUser
     */
    public User getCreateUser() {
        return createUser;
    }

    public void setCreateUser(User createUser) {
        this.createUser = createUser;
    }

    public JobInfo withUpdateUser(User updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    public JobInfo withUpdateUser(Consumer<User> updateUserSetter) {
        if (this.updateUser == null) {
            this.updateUser = new User();
            updateUserSetter.accept(this.updateUser);
        }

        return this;
    }

    /**
     * Get updateUser
     * @return updateUser
     */
    public User getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(User updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobInfo that = (JobInfo) obj;
        return Objects.equals(this.visibility, that.visibility) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.currentVersion, that.currentVersion)
            && Objects.equals(this.currentEndpointId, that.currentEndpointId)
            && Objects.equals(this.createUser, that.createUser) && Objects.equals(this.updateUser, that.updateUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(visibility,
            id,
            name,
            description,
            workspaceId,
            type,
            createTime,
            updateTime,
            currentVersion,
            currentEndpointId,
            createUser,
            updateUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobInfo {\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
        sb.append("    currentEndpointId: ").append(toIndentedString(currentEndpointId)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
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
