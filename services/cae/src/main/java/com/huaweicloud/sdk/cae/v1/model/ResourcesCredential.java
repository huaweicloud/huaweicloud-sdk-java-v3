package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResourcesCredential
 */
public class ResourcesCredential {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access")

    private String access;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret")

    private String secret;

    public ResourcesCredential withAccess(String access) {
        this.access = access;
        return this;
    }

    /**
     * 用户access key，当前access key应该包含访问授权云存储的权限。
     * @return access
     */
    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public ResourcesCredential withSecret(String secret) {
        this.secret = secret;
        return this;
    }

    /**
     * 用户secret key，当前secret key应该包含访问授权云存储的权限。
     * @return secret
     */
    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourcesCredential that = (ResourcesCredential) obj;
        return Objects.equals(this.access, that.access) && Objects.equals(this.secret, that.secret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(access, secret);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourcesCredential {\n");
        sb.append("    access: ").append(toIndentedString(access)).append("\n");
        sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
