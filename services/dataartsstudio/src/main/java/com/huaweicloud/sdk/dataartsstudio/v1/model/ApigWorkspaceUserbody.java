package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作空间用户列表
 */
public class ApigWorkspaceUserbody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_user_name")

    private String displayUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_owner")

    private Boolean domainOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roles")

    private List<ApigRoleVo> roles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private BigDecimal createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private BigDecimal updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_user")

    private String updateUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    public ApigWorkspaceUserbody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 记录id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ApigWorkspaceUserbody withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户id
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ApigWorkspaceUserbody withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ApigWorkspaceUserbody withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ApigWorkspaceUserbody withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 租户名
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ApigWorkspaceUserbody withDisplayUserName(String displayUserName) {
        this.displayUserName = displayUserName;
        return this;
    }

    /**
     * 租户名
     * @return displayUserName
     */
    public String getDisplayUserName() {
        return displayUserName;
    }

    public void setDisplayUserName(String displayUserName) {
        this.displayUserName = displayUserName;
    }

    public ApigWorkspaceUserbody withDomainOwner(Boolean domainOwner) {
        this.domainOwner = domainOwner;
        return this;
    }

    /**
     * 是否是空间所有者
     * @return domainOwner
     */
    public Boolean getDomainOwner() {
        return domainOwner;
    }

    public void setDomainOwner(Boolean domainOwner) {
        this.domainOwner = domainOwner;
    }

    public ApigWorkspaceUserbody withDescription(String description) {
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

    public ApigWorkspaceUserbody withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间id
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ApigWorkspaceUserbody withRoles(List<ApigRoleVo> roles) {
        this.roles = roles;
        return this;
    }

    public ApigWorkspaceUserbody addRolesItem(ApigRoleVo rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    public ApigWorkspaceUserbody withRoles(Consumer<List<ApigRoleVo>> rolesSetter) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        rolesSetter.accept(this.roles);
        return this;
    }

    /**
     * 角色列表
     * @return roles
     */
    public List<ApigRoleVo> getRoles() {
        return roles;
    }

    public void setRoles(List<ApigRoleVo> roles) {
        this.roles = roles;
    }

    public ApigWorkspaceUserbody withCreateTime(BigDecimal createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createTime
     */
    public BigDecimal getCreateTime() {
        return createTime;
    }

    public void setCreateTime(BigDecimal createTime) {
        this.createTime = createTime;
    }

    public ApigWorkspaceUserbody withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 创建人员
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public ApigWorkspaceUserbody withUpdateTime(BigDecimal updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return updateTime
     */
    public BigDecimal getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(BigDecimal updateTime) {
        this.updateTime = updateTime;
    }

    public ApigWorkspaceUserbody withUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    /**
     * 更新人员
     * @return updateUser
     */
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public ApigWorkspaceUserbody withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 用户类型，0用户，1用户组
     * minimum: 0
     * maximum: 1
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApigWorkspaceUserbody apigWorkspaceUserbody = (ApigWorkspaceUserbody) o;
        return Objects.equals(this.id, apigWorkspaceUserbody.id)
            && Objects.equals(this.userId, apigWorkspaceUserbody.userId)
            && Objects.equals(this.userName, apigWorkspaceUserbody.userName)
            && Objects.equals(this.domainId, apigWorkspaceUserbody.domainId)
            && Objects.equals(this.domainName, apigWorkspaceUserbody.domainName)
            && Objects.equals(this.displayUserName, apigWorkspaceUserbody.displayUserName)
            && Objects.equals(this.domainOwner, apigWorkspaceUserbody.domainOwner)
            && Objects.equals(this.description, apigWorkspaceUserbody.description)
            && Objects.equals(this.workspaceId, apigWorkspaceUserbody.workspaceId)
            && Objects.equals(this.roles, apigWorkspaceUserbody.roles)
            && Objects.equals(this.createTime, apigWorkspaceUserbody.createTime)
            && Objects.equals(this.createUser, apigWorkspaceUserbody.createUser)
            && Objects.equals(this.updateTime, apigWorkspaceUserbody.updateTime)
            && Objects.equals(this.updateUser, apigWorkspaceUserbody.updateUser)
            && Objects.equals(this.type, apigWorkspaceUserbody.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            userId,
            userName,
            domainId,
            domainName,
            displayUserName,
            domainOwner,
            description,
            workspaceId,
            roles,
            createTime,
            createUser,
            updateTime,
            updateUser,
            type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApigWorkspaceUserbody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    displayUserName: ").append(toIndentedString(displayUserName)).append("\n");
        sb.append("    domainOwner: ").append(toIndentedString(domainOwner)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
