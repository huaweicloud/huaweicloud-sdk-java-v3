package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IdpSAMLConfig
 */
public class IdpSAMLConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity_id")

    private String entityId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_url")

    private String loginUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "want_request_signed")

    private Boolean wantRequestSigned;

    public IdpSAMLConfig withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * 身份提供商发布者标识
     * @return entityId
     */
    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public IdpSAMLConfig withLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
        return this;
    }

    /**
     * 身份提供商登录链接
     * @return loginUrl
     */
    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public IdpSAMLConfig withWantRequestSigned(Boolean wantRequestSigned) {
        this.wantRequestSigned = wantRequestSigned;
        return this;
    }

    /**
     * 是否要求SAML请求签名验证
     * @return wantRequestSigned
     */
    public Boolean getWantRequestSigned() {
        return wantRequestSigned;
    }

    public void setWantRequestSigned(Boolean wantRequestSigned) {
        this.wantRequestSigned = wantRequestSigned;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IdpSAMLConfig that = (IdpSAMLConfig) obj;
        return Objects.equals(this.entityId, that.entityId) && Objects.equals(this.loginUrl, that.loginUrl)
            && Objects.equals(this.wantRequestSigned, that.wantRequestSigned);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entityId, loginUrl, wantRequestSigned);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdpSAMLConfig {\n");
        sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
        sb.append("    loginUrl: ").append(toIndentedString(loginUrl)).append("\n");
        sb.append("    wantRequestSigned: ").append(toIndentedString(wantRequestSigned)).append("\n");
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
