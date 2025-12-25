package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DevcloudUserDOV5
 */
public class DevcloudUserDOV5 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_time")

    private String modifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_user_id")

    private String createdUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_user_name")

    private String createdUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_user_id")

    private String modifiedUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_user_name")

    private String modifiedUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_type")

    private String userType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private String enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_user_name")

    private String repoUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_number")

    private Integer repoNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inner_repo_user_name")

    private String innerRepoUserName;

    public DevcloudUserDOV5 withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: 仓库状态。 **取值范围**: active：正常。 delete：删除。 disabled：无效。 view：私有库浏览者。 trash：废弃。 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DevcloudUserDOV5 withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释**: 租户id。 **取值范围**: 不涉及。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public DevcloudUserDOV5 withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释**: 区域。 **取值范围**: 不涉及。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public DevcloudUserDOV5 withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * **参数解释**: 创建时间，时间格式：yyyy-MM-dd HH:mm:ss。 **取值范围**: 不涉及。
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public DevcloudUserDOV5 withModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    /**
     * **参数解释**: 修改时间，时间格式：yyyy-MM-dd HH:mm:ss。 **取值范围**: 不涉及。
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public DevcloudUserDOV5 withCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
        return this;
    }

    /**
     * **参数解释**: 创建人id。 **取值范围**: 不涉及。
     * @return createdUserId
     */
    public String getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    public DevcloudUserDOV5 withCreatedUserName(String createdUserName) {
        this.createdUserName = createdUserName;
        return this;
    }

    /**
     * **参数解释**: 创建人。 **取值范围**: 不涉及。
     * @return createdUserName
     */
    public String getCreatedUserName() {
        return createdUserName;
    }

    public void setCreatedUserName(String createdUserName) {
        this.createdUserName = createdUserName;
    }

    public DevcloudUserDOV5 withModifiedUserId(String modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
        return this;
    }

    /**
     * **参数解释**: 修改人id。 **取值范围**: 不涉及。
     * @return modifiedUserId
     */
    public String getModifiedUserId() {
        return modifiedUserId;
    }

    public void setModifiedUserId(String modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    public DevcloudUserDOV5 withModifiedUserName(String modifiedUserName) {
        this.modifiedUserName = modifiedUserName;
        return this;
    }

    /**
     * **参数解释**: 修改人。 **取值范围**: 不涉及。
     * @return modifiedUserName
     */
    public String getModifiedUserName() {
        return modifiedUserName;
    }

    public void setModifiedUserName(String modifiedUserName) {
        this.modifiedUserName = modifiedUserName;
    }

    public DevcloudUserDOV5 withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * **参数解释**: 用户id。 **取值范围**: 不涉及。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public DevcloudUserDOV5 withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**: 用户名。 **取值范围**: 不涉及。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public DevcloudUserDOV5 withUserType(String userType) {
        this.userType = userType;
        return this;
    }

    /**
     * **参数解释**: 用户类型。 **取值范围**: 不涉及。
     * @return userType
     */
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public DevcloudUserDOV5 withEnabled(String enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释**: enabled。 **取值范围**: 不涉及。
     * @return enabled
     */
    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public DevcloudUserDOV5 withRepoUserName(String repoUserName) {
        this.repoUserName = repoUserName;
        return this;
    }

    /**
     * **参数解释**: 仓库用户名。 **取值范围**: 不涉及。
     * @return repoUserName
     */
    public String getRepoUserName() {
        return repoUserName;
    }

    public void setRepoUserName(String repoUserName) {
        this.repoUserName = repoUserName;
    }

    public DevcloudUserDOV5 withRepoNumber(Integer repoNumber) {
        this.repoNumber = repoNumber;
        return this;
    }

    /**
     * **参数解释**: repo_number。 **取值范围**: 不涉及。
     * @return repoNumber
     */
    public Integer getRepoNumber() {
        return repoNumber;
    }

    public void setRepoNumber(Integer repoNumber) {
        this.repoNumber = repoNumber;
    }

    public DevcloudUserDOV5 withInnerRepoUserName(String innerRepoUserName) {
        this.innerRepoUserName = innerRepoUserName;
        return this;
    }

    /**
     * **参数解释**: 内部仓库用户名。 **取值范围**: 不涉及。
     * @return innerRepoUserName
     */
    public String getInnerRepoUserName() {
        return innerRepoUserName;
    }

    public void setInnerRepoUserName(String innerRepoUserName) {
        this.innerRepoUserName = innerRepoUserName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DevcloudUserDOV5 that = (DevcloudUserDOV5) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.region, that.region) && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.modifiedTime, that.modifiedTime)
            && Objects.equals(this.createdUserId, that.createdUserId)
            && Objects.equals(this.createdUserName, that.createdUserName)
            && Objects.equals(this.modifiedUserId, that.modifiedUserId)
            && Objects.equals(this.modifiedUserName, that.modifiedUserName) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.userType, that.userType)
            && Objects.equals(this.enabled, that.enabled) && Objects.equals(this.repoUserName, that.repoUserName)
            && Objects.equals(this.repoNumber, that.repoNumber)
            && Objects.equals(this.innerRepoUserName, that.innerRepoUserName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status,
            domainId,
            region,
            createdTime,
            modifiedTime,
            createdUserId,
            createdUserName,
            modifiedUserId,
            modifiedUserName,
            userId,
            userName,
            userType,
            enabled,
            repoUserName,
            repoNumber,
            innerRepoUserName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DevcloudUserDOV5 {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
        sb.append("    createdUserId: ").append(toIndentedString(createdUserId)).append("\n");
        sb.append("    createdUserName: ").append(toIndentedString(createdUserName)).append("\n");
        sb.append("    modifiedUserId: ").append(toIndentedString(modifiedUserId)).append("\n");
        sb.append("    modifiedUserName: ").append(toIndentedString(modifiedUserName)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    repoUserName: ").append(toIndentedString(repoUserName)).append("\n");
        sb.append("    repoNumber: ").append(toIndentedString(repoNumber)).append("\n");
        sb.append("    innerRepoUserName: ").append(toIndentedString(innerRepoUserName)).append("\n");
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
