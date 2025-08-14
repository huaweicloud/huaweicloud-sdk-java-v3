package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * BearerToken
 */
public class BearerToken {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_time")

    private BigDecimal creationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration_time")

    private BigDecimal expirationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token_id")

    private String tokenId;

    public BearerToken withCreationTime(BigDecimal creationTime) {
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

    public BearerToken withExpirationTime(BigDecimal expirationTime) {
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

    public BearerToken withTokenId(String tokenId) {
        this.tokenId = tokenId;
        return this;
    }

    /**
     * 访问令牌全局唯一标识（ID）
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
        BearerToken that = (BearerToken) obj;
        return Objects.equals(this.creationTime, that.creationTime)
            && Objects.equals(this.expirationTime, that.expirationTime) && Objects.equals(this.tokenId, that.tokenId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creationTime, expirationTime, tokenId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BearerToken {\n");
        sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
        sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
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
