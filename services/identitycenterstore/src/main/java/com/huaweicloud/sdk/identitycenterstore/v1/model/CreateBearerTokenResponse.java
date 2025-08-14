package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateBearerTokenResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_time")

    private BigDecimal creationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration_time")

    private BigDecimal expirationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    private String token;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token_id")

    private String tokenId;

    public CreateBearerTokenResponse withCreationTime(BigDecimal creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * 创建时间
     * @return creationTime
     */
    public BigDecimal getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(BigDecimal creationTime) {
        this.creationTime = creationTime;
    }

    public CreateBearerTokenResponse withExpirationTime(BigDecimal expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * 过期时间
     * @return expirationTime
     */
    public BigDecimal getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(BigDecimal expirationTime) {
        this.expirationTime = expirationTime;
    }

    public CreateBearerTokenResponse withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * 访问令牌
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public CreateBearerTokenResponse withTokenId(String tokenId) {
        this.tokenId = tokenId;
        return this;
    }

    /**
     * 访问令牌的全局唯一标识符（ID）
     * @return tokenId
     */
    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateBearerTokenResponse that = (CreateBearerTokenResponse) obj;
        return Objects.equals(this.creationTime, that.creationTime)
            && Objects.equals(this.expirationTime, that.expirationTime) && Objects.equals(this.token, that.token)
            && Objects.equals(this.tokenId, that.tokenId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creationTime, expirationTime, token, tokenId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBearerTokenResponse {\n");
        sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
        sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
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
