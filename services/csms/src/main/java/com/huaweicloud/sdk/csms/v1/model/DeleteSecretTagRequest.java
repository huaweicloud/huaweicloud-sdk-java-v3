package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteSecretTagRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_id")

    @JacksonXmlProperty(localName = "secret_id")

    private String secretId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    @JacksonXmlProperty(localName = "key")

    private String key;

    public DeleteSecretTagRequest withSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }

    /**
     * 凭据ID
     * @return secretId
     */
    public String getSecretId() {
        return secretId;
    }

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    public DeleteSecretTagRequest withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 标签键的值
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteSecretTagRequest deleteSecretTagRequest = (DeleteSecretTagRequest) o;
        return Objects.equals(this.secretId, deleteSecretTagRequest.secretId)
            && Objects.equals(this.key, deleteSecretTagRequest.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secretId, key);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteSecretTagRequest {\n");
        sb.append("    secretId: ").append(toIndentedString(secretId)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
