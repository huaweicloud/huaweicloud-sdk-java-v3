package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateAppAccessKeyRequestBody
 */
public class CreateAppAccessKeyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_name")

    private String keyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_key")

    private String accessKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_key")

    private String secretKey;

    public CreateAppAccessKeyRequestBody withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * 访问密钥名称
     * @return keyName
     */
    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public CreateAppAccessKeyRequestBody withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * 访问密钥ak，默认为空，系统自动生成
     * @return accessKey
     */
    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public CreateAppAccessKeyRequestBody withSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * 访问密钥sk，默认为空，系统自动生成
     * @return secretKey
     */
    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAppAccessKeyRequestBody that = (CreateAppAccessKeyRequestBody) obj;
        return Objects.equals(this.keyName, that.keyName) && Objects.equals(this.accessKey, that.accessKey)
            && Objects.equals(this.secretKey, that.secretKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyName, accessKey, secretKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAppAccessKeyRequestBody {\n");
        sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
        sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
        sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
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
