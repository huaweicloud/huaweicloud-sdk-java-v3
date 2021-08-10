package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class ShowKeypairResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_key")

    private String publicKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fingerprint")

    private String fingerprint;

    public ShowKeypairResponse withName(String name) {
        this.name = name;
        return this;
    }

    /** 密钥名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowKeypairResponse withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /** 密钥对应publicKey信息。
     * 
     * @return publicKey */
    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public ShowKeypairResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /** 用户ID。
     * 
     * @return userId */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ShowKeypairResponse withFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }

    /** 密钥对应指纹信息。
     * 
     * @return fingerprint */
    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowKeypairResponse showKeypairResponse = (ShowKeypairResponse) o;
        return Objects.equals(this.name, showKeypairResponse.name)
            && Objects.equals(this.publicKey, showKeypairResponse.publicKey)
            && Objects.equals(this.userId, showKeypairResponse.userId)
            && Objects.equals(this.fingerprint, showKeypairResponse.fingerprint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, publicKey, userId, fingerprint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKeypairResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
