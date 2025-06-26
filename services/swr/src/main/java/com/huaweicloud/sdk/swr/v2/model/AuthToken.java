package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AuthToken
 */
public class AuthToken {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_date")

    private String expireDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token_id")

    private String tokenId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_profile")

    private String userProfile;

    public AuthToken withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public AuthToken withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否启用
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public AuthToken withExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }

    /**
     * 过期时间
     * @return expireDate
     */
    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public AuthToken withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public AuthToken withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 访问凭证名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AuthToken withTokenId(String tokenId) {
        this.tokenId = tokenId;
        return this;
    }

    /**
     * 访问凭证ID
     * @return tokenId
     */
    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public AuthToken withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 访问凭证用户名
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public AuthToken withUserProfile(String userProfile) {
        this.userProfile = userProfile;
        return this;
    }

    /**
     * 用户访问凭据信息
     * @return userProfile
     */
    public String getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(String userProfile) {
        this.userProfile = userProfile;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthToken that = (AuthToken) obj;
        return Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.expireDate, that.expireDate) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.tokenId, that.tokenId)
            && Objects.equals(this.userId, that.userId) && Objects.equals(this.userProfile, that.userProfile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, enable, expireDate, instanceId, name, tokenId, userId, userProfile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthToken {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userProfile: ").append(toIndentedString(userProfile)).append("\n");
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
