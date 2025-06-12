package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListKeystoreSearchResponseBodyResultKeystoreList
 */
public class ListKeystoreSearchResponseBodyResultKeystoreList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission")

    private ListKeystoreSearchResponseBodyResultPermission permission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_stamp")

    private String createTimeStamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time_stamp")

    private String updateTimeStamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keystore_name")

    private String keystoreName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user_id")

    private String createUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user_name")

    private String createUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_user_id")

    private String updateUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_user_name")

    private String updateUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share")

    private BigDecimal share;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ListKeystoreSearchResponseBodyResultKeystoreList withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 文件ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListKeystoreSearchResponseBodyResultKeystoreList withPermission(
        ListKeystoreSearchResponseBodyResultPermission permission) {
        this.permission = permission;
        return this;
    }

    public ListKeystoreSearchResponseBodyResultKeystoreList withPermission(
        Consumer<ListKeystoreSearchResponseBodyResultPermission> permissionSetter) {
        if (this.permission == null) {
            this.permission = new ListKeystoreSearchResponseBodyResultPermission();
            permissionSetter.accept(this.permission);
        }

        return this;
    }

    /**
     * Get permission
     * @return permission
     */
    public ListKeystoreSearchResponseBodyResultPermission getPermission() {
        return permission;
    }

    public void setPermission(ListKeystoreSearchResponseBodyResultPermission permission) {
        this.permission = permission;
    }

    public ListKeystoreSearchResponseBodyResultKeystoreList withCreateTimeStamp(String createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
        return this;
    }

    /**
     * 创建时间戳
     * @return createTimeStamp
     */
    public String getCreateTimeStamp() {
        return createTimeStamp;
    }

    public void setCreateTimeStamp(String createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
    }

    public ListKeystoreSearchResponseBodyResultKeystoreList withUpdateTimeStamp(String updateTimeStamp) {
        this.updateTimeStamp = updateTimeStamp;
        return this;
    }

    /**
     * 修改时间戳
     * @return updateTimeStamp
     */
    public String getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    public void setUpdateTimeStamp(String updateTimeStamp) {
        this.updateTimeStamp = updateTimeStamp;
    }

    public ListKeystoreSearchResponseBodyResultKeystoreList withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ListKeystoreSearchResponseBodyResultKeystoreList withDomainName(String domainName) {
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

    public ListKeystoreSearchResponseBodyResultKeystoreList withKeystoreName(String keystoreName) {
        this.keystoreName = keystoreName;
        return this;
    }

    /**
     * 文件名
     * @return keystoreName
     */
    public String getKeystoreName() {
        return keystoreName;
    }

    public void setKeystoreName(String keystoreName) {
        this.keystoreName = keystoreName;
    }

    public ListKeystoreSearchResponseBodyResultKeystoreList withCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }

    /**
     * 文件创建者用户ID
     * @return createUserId
     */
    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public ListKeystoreSearchResponseBodyResultKeystoreList withCreateUserName(String createUserName) {
        this.createUserName = createUserName;
        return this;
    }

    /**
     * 文件创建者用户名
     * @return createUserName
     */
    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public ListKeystoreSearchResponseBodyResultKeystoreList withUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
        return this;
    }

    /**
     * 文件修改者用户ID
     * @return updateUserId
     */
    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public ListKeystoreSearchResponseBodyResultKeystoreList withUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
        return this;
    }

    /**
     * 文件修改者用户名
     * @return updateUserName
     */
    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    public ListKeystoreSearchResponseBodyResultKeystoreList withShare(BigDecimal share) {
        this.share = share;
        return this;
    }

    /**
     * 是否共享，开启后允许租户内所有成员在编译构建中使用该文件
     * @return share
     */
    public BigDecimal getShare() {
        return share;
    }

    public void setShare(BigDecimal share) {
        this.share = share;
    }

    public ListKeystoreSearchResponseBodyResultKeystoreList withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 更新时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ListKeystoreSearchResponseBodyResultKeystoreList withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ListKeystoreSearchResponseBodyResultKeystoreList withDescription(String description) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListKeystoreSearchResponseBodyResultKeystoreList that = (ListKeystoreSearchResponseBodyResultKeystoreList) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.permission, that.permission)
            && Objects.equals(this.createTimeStamp, that.createTimeStamp)
            && Objects.equals(this.updateTimeStamp, that.updateTimeStamp)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.keystoreName, that.keystoreName)
            && Objects.equals(this.createUserId, that.createUserId)
            && Objects.equals(this.createUserName, that.createUserName)
            && Objects.equals(this.updateUserId, that.updateUserId)
            && Objects.equals(this.updateUserName, that.updateUserName) && Objects.equals(this.share, that.share)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            permission,
            createTimeStamp,
            updateTimeStamp,
            domainId,
            domainName,
            keystoreName,
            createUserId,
            createUserName,
            updateUserId,
            updateUserName,
            share,
            createTime,
            updateTime,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListKeystoreSearchResponseBodyResultKeystoreList {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    createTimeStamp: ").append(toIndentedString(createTimeStamp)).append("\n");
        sb.append("    updateTimeStamp: ").append(toIndentedString(updateTimeStamp)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    keystoreName: ").append(toIndentedString(keystoreName)).append("\n");
        sb.append("    createUserId: ").append(toIndentedString(createUserId)).append("\n");
        sb.append("    createUserName: ").append(toIndentedString(createUserName)).append("\n");
        sb.append("    updateUserId: ").append(toIndentedString(updateUserId)).append("\n");
        sb.append("    updateUserName: ").append(toIndentedString(updateUserName)).append("\n");
        sb.append("    share: ").append(toIndentedString(share)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
