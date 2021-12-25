package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Key */
public class Key {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_push")

    private Boolean canPush;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_title")

    private String keyTitle;

    public Key withCanPush(Boolean canPush) {
        this.canPush = canPush;
        return this;
    }

    /** 是否允许推送
     * 
     * @return canPush */
    public Boolean getCanPush() {
        return canPush;
    }

    public void setCanPush(Boolean canPush) {
        this.canPush = canPush;
    }

    public Key withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /** 部署密钥新建时间
     * 
     * @return createdAt */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Key withKey(String key) {
        this.key = key;
        return this;
    }

    /** 部署密钥
     * 
     * @return key */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Key withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /** 部署密钥id
     * 
     * @return keyId */
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public Key withKeyTitle(String keyTitle) {
        this.keyTitle = keyTitle;
        return this;
    }

    /** 部署密钥名称
     * 
     * @return keyTitle */
    public String getKeyTitle() {
        return keyTitle;
    }

    public void setKeyTitle(String keyTitle) {
        this.keyTitle = keyTitle;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Key key = (Key) o;
        return Objects.equals(this.canPush, key.canPush) && Objects.equals(this.createdAt, key.createdAt)
            && Objects.equals(this.key, key.key) && Objects.equals(this.keyId, key.keyId)
            && Objects.equals(this.keyTitle, key.keyTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(canPush, createdAt, key, keyId, keyTitle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Key {\n");
        sb.append("    canPush: ").append(toIndentedString(canPush)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    keyTitle: ").append(toIndentedString(keyTitle)).append("\n");
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
