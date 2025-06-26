package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateInstanceTempCredentialResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_token")

    private String authToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_date")

    private String expireDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token_id")

    private String tokenId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    public CreateInstanceTempCredentialResponse withAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }

    /**
     * 临时访问凭证密码
     * @return authToken
     */
    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public CreateInstanceTempCredentialResponse withCreatedAt(String createdAt) {
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

    public CreateInstanceTempCredentialResponse withExpireDate(String expireDate) {
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

    public CreateInstanceTempCredentialResponse withTokenId(String tokenId) {
        this.tokenId = tokenId;
        return this;
    }

    /**
     * 临时访问凭证ID
     * @return tokenId
     */
    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public CreateInstanceTempCredentialResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 临时访问凭证的用户ID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateInstanceTempCredentialResponse that = (CreateInstanceTempCredentialResponse) obj;
        return Objects.equals(this.authToken, that.authToken) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.expireDate, that.expireDate) && Objects.equals(this.tokenId, that.tokenId)
            && Objects.equals(this.userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authToken, createdAt, expireDate, tokenId, userId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceTempCredentialResponse {\n");
        sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
        sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
