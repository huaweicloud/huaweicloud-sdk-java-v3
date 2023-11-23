package com.huaweicloud.sdk.dataartsinsight.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAuthPropertiesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_switch_config")

    private Map<String, Boolean> authSwitchConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_date")

    private Long createDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user_name")

    private String createUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_date")

    private Long updateDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_user")

    private String updateUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_user_name")

    private String updateUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    public ListAuthPropertiesResponse withAuthSwitchConfig(Map<String, Boolean> authSwitchConfig) {
        this.authSwitchConfig = authSwitchConfig;
        return this;
    }

    public ListAuthPropertiesResponse putAuthSwitchConfigItem(String key, Boolean authSwitchConfigItem) {
        if (this.authSwitchConfig == null) {
            this.authSwitchConfig = new HashMap<>();
        }
        this.authSwitchConfig.put(key, authSwitchConfigItem);
        return this;
    }

    public ListAuthPropertiesResponse withAuthSwitchConfig(Consumer<Map<String, Boolean>> authSwitchConfigSetter) {
        if (this.authSwitchConfig == null) {
            this.authSwitchConfig = new HashMap<>();
        }
        authSwitchConfigSetter.accept(this.authSwitchConfig);
        return this;
    }

    /**
     * 权限点开关。取值为true或者false，用于区分对应开关是否打开。 • edit：编辑权限 • export：导出权限 • read：查看权限 • use：使用权限 说明 • 权限之间有依赖关系， 授予edit权限，自动关联授予read和export或者use权限；授予了export权限，自动关联授予read权限。 • 对仪表板和大屏来说， 权限点有三个， edit, export, read， 例如{\"edit\": false, \"read\": true, \"export\": true}， 表示打开了查看和导出的权限。 • 对于数据源、数据集、领域来说，权限点有两个，edit，use， 对应编辑和使用权限。 例如{\"use\": true, \"edit\": false} ，表示仅打开使用权限。
     * @return authSwitchConfig
     */
    public Map<String, Boolean> getAuthSwitchConfig() {
        return authSwitchConfig;
    }

    public void setAuthSwitchConfig(Map<String, Boolean> authSwitchConfig) {
        this.authSwitchConfig = authSwitchConfig;
    }

    public ListAuthPropertiesResponse withCreateDate(Long createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * 资源创建时间。
     * minimum: 0
     * maximum: 9007199254740991
     * @return createDate
     */
    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public ListAuthPropertiesResponse withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 资源创建用户ID。
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public ListAuthPropertiesResponse withCreateUserName(String createUserName) {
        this.createUserName = createUserName;
        return this;
    }

    /**
     * 资源创建人名称。
     * @return createUserName
     */
    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public ListAuthPropertiesResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 资源协同授权属性记录表ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListAuthPropertiesResponse withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 资源所有者ID。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ListAuthPropertiesResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListAuthPropertiesResponse withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ListAuthPropertiesResponse withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型： • datasource：数据源 • dataset：数据集 • dashboard：仪表板 • screen：大屏
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ListAuthPropertiesResponse withUpdateDate(Long updateDate) {
        this.updateDate = updateDate;
        return this;
    }

    /**
     * 修改时间。
     * minimum: 0
     * maximum: 9007199254740991
     * @return updateDate
     */
    public Long getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Long updateDate) {
        this.updateDate = updateDate;
    }

    public ListAuthPropertiesResponse withUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    /**
     * 修改人ID。
     * @return updateUser
     */
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public ListAuthPropertiesResponse withUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
        return this;
    }

    /**
     * 修改人姓名。
     * @return updateUserName
     */
    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    public ListAuthPropertiesResponse withWorkspaceId(String workspaceId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAuthPropertiesResponse that = (ListAuthPropertiesResponse) obj;
        return Objects.equals(this.authSwitchConfig, that.authSwitchConfig)
            && Objects.equals(this.createDate, that.createDate) && Objects.equals(this.createUser, that.createUser)
            && Objects.equals(this.createUserName, that.createUserName) && Objects.equals(this.id, that.id)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.updateDate, that.updateDate) && Objects.equals(this.updateUser, that.updateUser)
            && Objects.equals(this.updateUserName, that.updateUserName)
            && Objects.equals(this.workspaceId, that.workspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authSwitchConfig,
            createDate,
            createUser,
            createUserName,
            id,
            owner,
            projectId,
            resourceId,
            resourceType,
            updateDate,
            updateUser,
            updateUserName,
            workspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuthPropertiesResponse {\n");
        sb.append("    authSwitchConfig: ").append(toIndentedString(authSwitchConfig)).append("\n");
        sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    createUserName: ").append(toIndentedString(createUserName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
        sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
        sb.append("    updateUserName: ").append(toIndentedString(updateUserName)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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
