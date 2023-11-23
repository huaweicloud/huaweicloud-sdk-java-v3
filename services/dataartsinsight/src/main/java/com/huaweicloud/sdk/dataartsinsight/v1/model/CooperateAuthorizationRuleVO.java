package com.huaweicloud.sdk.dataartsinsight.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 协同授权规则返回实体
 */
public class CooperateAuthorizationRuleVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_id")

    private String authId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_level")

    private String authLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_name")

    private String authName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authed")

    private Boolean authed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authority")

    private String authority;

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
    @JsonProperty(value = "is_owner")

    private Boolean isOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private Integer sort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_date")

    private Long updateDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_user")

    private String updateUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_user_name")

    private String updateUserName;

    public CooperateAuthorizationRuleVO withAuthId(String authId) {
        this.authId = authId;
        return this;
    }

    /**
     * 授权主体id
     * @return authId
     */
    public String getAuthId() {
        return authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId;
    }

    public CooperateAuthorizationRuleVO withAuthLevel(String authLevel) {
        this.authLevel = authLevel;
        return this;
    }

    /**
     * 授权主体级别。 user, group
     * @return authLevel
     */
    public String getAuthLevel() {
        return authLevel;
    }

    public void setAuthLevel(String authLevel) {
        this.authLevel = authLevel;
    }

    public CooperateAuthorizationRuleVO withAuthName(String authName) {
        this.authName = authName;
        return this;
    }

    /**
     * 授权主体名称
     * @return authName
     */
    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public CooperateAuthorizationRuleVO withAuthed(Boolean authed) {
        this.authed = authed;
        return this;
    }

    /**
     * 是否已授权
     * @return authed
     */
    public Boolean getAuthed() {
        return authed;
    }

    public void setAuthed(Boolean authed) {
        this.authed = authed;
    }

    public CooperateAuthorizationRuleVO withAuthority(String authority) {
        this.authority = authority;
        return this;
    }

    /**
     * 权限点， edit, export, use, read
     * @return authority
     */
    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public CooperateAuthorizationRuleVO withCreateDate(Long createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * 创建时间
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

    public CooperateAuthorizationRuleVO withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 创建人id
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public CooperateAuthorizationRuleVO withCreateUserName(String createUserName) {
        this.createUserName = createUserName;
        return this;
    }

    /**
     * 创建人姓名
     * @return createUserName
     */
    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public CooperateAuthorizationRuleVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CooperateAuthorizationRuleVO withIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
        return this;
    }

    /**
     * 是否是资源拥有者
     * @return isOwner
     */
    public Boolean getIsOwner() {
        return isOwner;
    }

    public void setIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
    }

    public CooperateAuthorizationRuleVO withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public CooperateAuthorizationRuleVO withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型，目前有datasource, dataset, dashboard, screen
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public CooperateAuthorizationRuleVO withSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    /**
     * 排序字段
     * minimum: 0
     * maximum: 2147483647
     * @return sort
     */
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public CooperateAuthorizationRuleVO withUpdateDate(Long updateDate) {
        this.updateDate = updateDate;
        return this;
    }

    /**
     * 修改时间
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

    public CooperateAuthorizationRuleVO withUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    /**
     * 修改人id
     * @return updateUser
     */
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public CooperateAuthorizationRuleVO withUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
        return this;
    }

    /**
     * 修改人姓名
     * @return updateUserName
     */
    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CooperateAuthorizationRuleVO that = (CooperateAuthorizationRuleVO) obj;
        return Objects.equals(this.authId, that.authId) && Objects.equals(this.authLevel, that.authLevel)
            && Objects.equals(this.authName, that.authName) && Objects.equals(this.authed, that.authed)
            && Objects.equals(this.authority, that.authority) && Objects.equals(this.createDate, that.createDate)
            && Objects.equals(this.createUser, that.createUser)
            && Objects.equals(this.createUserName, that.createUserName) && Objects.equals(this.id, that.id)
            && Objects.equals(this.isOwner, that.isOwner) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.sort, that.sort)
            && Objects.equals(this.updateDate, that.updateDate) && Objects.equals(this.updateUser, that.updateUser)
            && Objects.equals(this.updateUserName, that.updateUserName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authId,
            authLevel,
            authName,
            authed,
            authority,
            createDate,
            createUser,
            createUserName,
            id,
            isOwner,
            resourceId,
            resourceType,
            sort,
            updateDate,
            updateUser,
            updateUserName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CooperateAuthorizationRuleVO {\n");
        sb.append("    authId: ").append(toIndentedString(authId)).append("\n");
        sb.append("    authLevel: ").append(toIndentedString(authLevel)).append("\n");
        sb.append("    authName: ").append(toIndentedString(authName)).append("\n");
        sb.append("    authed: ").append(toIndentedString(authed)).append("\n");
        sb.append("    authority: ").append(toIndentedString(authority)).append("\n");
        sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    createUserName: ").append(toIndentedString(createUserName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isOwner: ").append(toIndentedString(isOwner)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
        sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
        sb.append("    updateUserName: ").append(toIndentedString(updateUserName)).append("\n");
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
