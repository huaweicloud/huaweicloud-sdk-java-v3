package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Credential
 */
public class Credential {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_key")

    private String accessKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_secret")

    private String accessSecret;

    public Credential withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 认证方式，目前只支持basic
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Credential withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * 访问ID
     * @return accessKey
     */
    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public Credential withAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
        return this;
    }

    /**
     * 访问密码
     * @return accessSecret
     */
    public String getAccessSecret() {
        return accessSecret;
    }

    public void setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Credential that = (Credential) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.accessKey, that.accessKey)
            && Objects.equals(this.accessSecret, that.accessSecret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, accessKey, accessSecret);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Credential {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
        sb.append("    accessSecret: ").append(toIndentedString(accessSecret)).append("\n");
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
