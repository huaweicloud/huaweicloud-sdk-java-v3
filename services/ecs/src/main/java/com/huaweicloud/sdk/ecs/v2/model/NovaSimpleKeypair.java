package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 *  
 */
public class NovaSimpleKeypair {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fingerprint")

    private String fingerprint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_key")

    private String publicKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public NovaSimpleKeypair withFingerprint(String fingerprint) {
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

    public NovaSimpleKeypair withName(String name) {
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

    public NovaSimpleKeypair withPublicKey(String publicKey) {
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

    public NovaSimpleKeypair withType(String type) {
        this.type = type;
        return this;
    }

    /** 密钥类型，默认“ssh” 微版本2.2以上支持
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaSimpleKeypair novaSimpleKeypair = (NovaSimpleKeypair) o;
        return Objects.equals(this.fingerprint, novaSimpleKeypair.fingerprint)
            && Objects.equals(this.name, novaSimpleKeypair.name)
            && Objects.equals(this.publicKey, novaSimpleKeypair.publicKey)
            && Objects.equals(this.type, novaSimpleKeypair.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fingerprint, name, publicKey, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaSimpleKeypair {\n");
        sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
