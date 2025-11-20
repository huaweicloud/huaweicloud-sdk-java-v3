package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListGlobalConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_tls")

    private List<String> supportTls = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cipher")

    private List<CipherInfo> cipher = null;

    public ListGlobalConfigResponse withSupportTls(List<String> supportTls) {
        this.supportTls = supportTls;
        return this;
    }

    public ListGlobalConfigResponse addSupportTlsItem(String supportTlsItem) {
        if (this.supportTls == null) {
            this.supportTls = new ArrayList<>();
        }
        this.supportTls.add(supportTlsItem);
        return this;
    }

    public ListGlobalConfigResponse withSupportTls(Consumer<List<String>> supportTlsSetter) {
        if (this.supportTls == null) {
            this.supportTls = new ArrayList<>();
        }
        supportTlsSetter.accept(this.supportTls);
        return this;
    }

    /**
     * 支持的tls版本列表
     * @return supportTls
     */
    public List<String> getSupportTls() {
        return supportTls;
    }

    public void setSupportTls(List<String> supportTls) {
        this.supportTls = supportTls;
    }

    public ListGlobalConfigResponse withCipher(List<CipherInfo> cipher) {
        this.cipher = cipher;
        return this;
    }

    public ListGlobalConfigResponse addCipherItem(CipherInfo cipherItem) {
        if (this.cipher == null) {
            this.cipher = new ArrayList<>();
        }
        this.cipher.add(cipherItem);
        return this;
    }

    public ListGlobalConfigResponse withCipher(Consumer<List<CipherInfo>> cipherSetter) {
        if (this.cipher == null) {
            this.cipher = new ArrayList<>();
        }
        cipherSetter.accept(this.cipher);
        return this;
    }

    /**
     * 加密套件列表
     * @return cipher
     */
    public List<CipherInfo> getCipher() {
        return cipher;
    }

    public void setCipher(List<CipherInfo> cipher) {
        this.cipher = cipher;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGlobalConfigResponse that = (ListGlobalConfigResponse) obj;
        return Objects.equals(this.supportTls, that.supportTls) && Objects.equals(this.cipher, that.cipher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supportTls, cipher);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGlobalConfigResponse {\n");
        sb.append("    supportTls: ").append(toIndentedString(supportTls)).append("\n");
        sb.append("    cipher: ").append(toIndentedString(cipher)).append("\n");
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
