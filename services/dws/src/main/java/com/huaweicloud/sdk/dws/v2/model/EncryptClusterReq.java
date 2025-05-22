package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 转加密集群请求信息。 **取值范围**： 不涉及。
 */
public class EncryptClusterReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrypt")

    private EncryptCluster encrypt;

    public EncryptClusterReq withEncrypt(EncryptCluster encrypt) {
        this.encrypt = encrypt;
        return this;
    }

    public EncryptClusterReq withEncrypt(Consumer<EncryptCluster> encryptSetter) {
        if (this.encrypt == null) {
            this.encrypt = new EncryptCluster();
            encryptSetter.accept(this.encrypt);
        }

        return this;
    }

    /**
     * Get encrypt
     * @return encrypt
     */
    public EncryptCluster getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(EncryptCluster encrypt) {
        this.encrypt = encrypt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EncryptClusterReq that = (EncryptClusterReq) obj;
        return Objects.equals(this.encrypt, that.encrypt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encrypt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EncryptClusterReq {\n");
        sb.append("    encrypt: ").append(toIndentedString(encrypt)).append("\n");
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
