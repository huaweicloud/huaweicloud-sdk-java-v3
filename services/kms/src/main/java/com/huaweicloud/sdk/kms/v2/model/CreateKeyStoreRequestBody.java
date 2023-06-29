package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建专属密钥库请求体
 */
public class CreateKeyStoreRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keystore_alias")

    private String keystoreAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hsm_cluster_id")

    private String hsmClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hsm_ca_cert")

    private String hsmCaCert;

    public CreateKeyStoreRequestBody withKeystoreAlias(String keystoreAlias) {
        this.keystoreAlias = keystoreAlias;
        return this;
    }

    /**
     * 专属密钥库别名，取值范围为1到255个字符，满足正则匹配“^[a-zA-Z0-9:/_-]{1,255}$”，且不与已有的专属密钥库别名重名。
     * @return keystoreAlias
     */
    public String getKeystoreAlias() {
        return keystoreAlias;
    }

    public void setKeystoreAlias(String keystoreAlias) {
        this.keystoreAlias = keystoreAlias;
    }

    public CreateKeyStoreRequestBody withHsmClusterId(String hsmClusterId) {
        this.hsmClusterId = hsmClusterId;
        return this;
    }

    /**
     * DHSM集群Id，要求集群当前未创建专属密钥库。
     * @return hsmClusterId
     */
    public String getHsmClusterId() {
        return hsmClusterId;
    }

    public void setHsmClusterId(String hsmClusterId) {
        this.hsmClusterId = hsmClusterId;
    }

    public CreateKeyStoreRequestBody withHsmCaCert(String hsmCaCert) {
        this.hsmCaCert = hsmCaCert;
        return this;
    }

    /**
     * DHSM集群的CA证书
     * @return hsmCaCert
     */
    public String getHsmCaCert() {
        return hsmCaCert;
    }

    public void setHsmCaCert(String hsmCaCert) {
        this.hsmCaCert = hsmCaCert;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateKeyStoreRequestBody that = (CreateKeyStoreRequestBody) obj;
        return Objects.equals(this.keystoreAlias, that.keystoreAlias)
            && Objects.equals(this.hsmClusterId, that.hsmClusterId) && Objects.equals(this.hsmCaCert, that.hsmCaCert);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keystoreAlias, hsmClusterId, hsmCaCert);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateKeyStoreRequestBody {\n");
        sb.append("    keystoreAlias: ").append(toIndentedString(keystoreAlias)).append("\n");
        sb.append("    hsmClusterId: ").append(toIndentedString(hsmClusterId)).append("\n");
        sb.append("    hsmCaCert: ").append(toIndentedString(hsmCaCert)).append("\n");
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
