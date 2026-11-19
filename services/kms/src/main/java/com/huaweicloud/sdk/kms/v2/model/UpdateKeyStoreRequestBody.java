package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新专属密钥库请求体
 */
public class UpdateKeyStoreRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_access_key_id")

    private String proxyAccessKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_secret_access_key")

    private String proxySecretAccessKey;

    public UpdateKeyStoreRequestBody withProxyAccessKeyId(String proxyAccessKeyId) {
        this.proxyAccessKeyId = proxyAccessKeyId;
        return this;
    }

    /**
     * 访问XKS-Proxy的凭据ID
     * @return proxyAccessKeyId
     */
    public String getProxyAccessKeyId() {
        return proxyAccessKeyId;
    }

    public void setProxyAccessKeyId(String proxyAccessKeyId) {
        this.proxyAccessKeyId = proxyAccessKeyId;
    }

    public UpdateKeyStoreRequestBody withProxySecretAccessKey(String proxySecretAccessKey) {
        this.proxySecretAccessKey = proxySecretAccessKey;
        return this;
    }

    /**
     * 访问XKS-Proxy的凭据Key
     * @return proxySecretAccessKey
     */
    public String getProxySecretAccessKey() {
        return proxySecretAccessKey;
    }

    public void setProxySecretAccessKey(String proxySecretAccessKey) {
        this.proxySecretAccessKey = proxySecretAccessKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateKeyStoreRequestBody that = (UpdateKeyStoreRequestBody) obj;
        return Objects.equals(this.proxyAccessKeyId, that.proxyAccessKeyId)
            && Objects.equals(this.proxySecretAccessKey, that.proxySecretAccessKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proxyAccessKeyId, proxySecretAccessKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateKeyStoreRequestBody {\n");
        sb.append("    proxyAccessKeyId: ").append(toIndentedString(proxyAccessKeyId)).append("\n");
        sb.append("    proxySecretAccessKey: ").append(toIndentedString(proxySecretAccessKey)).append("\n");
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
