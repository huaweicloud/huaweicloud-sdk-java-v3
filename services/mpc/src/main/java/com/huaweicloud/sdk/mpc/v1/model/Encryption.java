package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Encryption
 */
public class Encryption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hls_encrypt")

    private HlsEncrypt hlsEncrypt;

    public Encryption withHlsEncrypt(HlsEncrypt hlsEncrypt) {
        this.hlsEncrypt = hlsEncrypt;
        return this;
    }

    public Encryption withHlsEncrypt(Consumer<HlsEncrypt> hlsEncryptSetter) {
        if (this.hlsEncrypt == null) {
            this.hlsEncrypt = new HlsEncrypt();
            hlsEncryptSetter.accept(this.hlsEncrypt);
        }

        return this;
    }

    /**
     * Get hlsEncrypt
     * @return hlsEncrypt
     */
    public HlsEncrypt getHlsEncrypt() {
        return hlsEncrypt;
    }

    public void setHlsEncrypt(HlsEncrypt hlsEncrypt) {
        this.hlsEncrypt = hlsEncrypt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Encryption that = (Encryption) obj;
        return Objects.equals(this.hlsEncrypt, that.hlsEncrypt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hlsEncrypt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Encryption {\n");
        sb.append("    hlsEncrypt: ").append(toIndentedString(hlsEncrypt)).append("\n");
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
