package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 评审单最后修改人
 */
public class ProcessInstanceResponseResultModifiedBy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "watcher")

    private String watcher;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_num_id")

    private String userNumId;

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
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    private String roleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_name")

    private String roleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opinion")

    private String opinion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ccbId")

    private String ccbId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_removed")

    private String hasRemoved;

    public ProcessInstanceResponseResultModifiedBy withWatcher(String watcher) {
        this.watcher = watcher;
        return this;
    }

    /**
     * 观察者
     * @return watcher
     */
    public String getWatcher() {
        return watcher;
    }

    public void setWatcher(String watcher) {
        this.watcher = watcher;
    }

    public ProcessInstanceResponseResultModifiedBy withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户ID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ProcessInstanceResponseResultModifiedBy withUserNumId(String userNumId) {
        this.userNumId = userNumId;
        return this;
    }

    /**
     * 用户数字id
     * @return userNumId
     */
    public String getUserNumId() {
        return userNumId;
    }

    public void setUserNumId(String userNumId) {
        this.userNumId = userNumId;
    }

    public ProcessInstanceResponseResultModifiedBy withUserName(String userName) {
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

    public ProcessInstanceResponseResultModifiedBy withDomainId(String domainId) {
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

    public ProcessInstanceResponseResultModifiedBy withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 租户名称
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ProcessInstanceResponseResultModifiedBy withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * 用户昵称
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public ProcessInstanceResponseResultModifiedBy withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * 角色id
     * @return roleId
     */
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public ProcessInstanceResponseResultModifiedBy withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * 角色名
     * @return roleName
     */
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public ProcessInstanceResponseResultModifiedBy withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 用户头像
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ProcessInstanceResponseResultModifiedBy withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ProcessInstanceResponseResultModifiedBy withOpinion(String opinion) {
        this.opinion = opinion;
        return this;
    }

    /**
     * 意见
     * @return opinion
     */
    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public ProcessInstanceResponseResultModifiedBy withDescription(String description) {
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

    public ProcessInstanceResponseResultModifiedBy withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 责任人
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ProcessInstanceResponseResultModifiedBy withCcbId(String ccbId) {
        this.ccbId = ccbId;
        return this;
    }

    /**
     * 评审id
     * @return ccbId
     */
    public String getCcbId() {
        return ccbId;
    }

    public void setCcbId(String ccbId) {
        this.ccbId = ccbId;
    }

    public ProcessInstanceResponseResultModifiedBy withHasRemoved(String hasRemoved) {
        this.hasRemoved = hasRemoved;
        return this;
    }

    /**
     * 是否已移出项目
     * @return hasRemoved
     */
    public String getHasRemoved() {
        return hasRemoved;
    }

    public void setHasRemoved(String hasRemoved) {
        this.hasRemoved = hasRemoved;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProcessInstanceResponseResultModifiedBy that = (ProcessInstanceResponseResultModifiedBy) obj;
        return Objects.equals(this.watcher, that.watcher) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.userNumId, that.userNumId) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.nickName, that.nickName) && Objects.equals(this.roleId, that.roleId)
            && Objects.equals(this.roleName, that.roleName) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.region, that.region) && Objects.equals(this.opinion, that.opinion)
            && Objects.equals(this.description, that.description) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.ccbId, that.ccbId) && Objects.equals(this.hasRemoved, that.hasRemoved);
    }

    @Override
    public int hashCode() {
        return Objects.hash(watcher,
            userId,
            userNumId,
            userName,
            domainId,
            domainName,
            nickName,
            roleId,
            roleName,
            imageId,
            region,
            opinion,
            description,
            owner,
            ccbId,
            hasRemoved);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessInstanceResponseResultModifiedBy {\n");
        sb.append("    watcher: ").append(toIndentedString(watcher)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userNumId: ").append(toIndentedString(userNumId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    opinion: ").append(toIndentedString(opinion)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    ccbId: ").append(toIndentedString(ccbId)).append("\n");
        sb.append("    hasRemoved: ").append(toIndentedString(hasRemoved)).append("\n");
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
