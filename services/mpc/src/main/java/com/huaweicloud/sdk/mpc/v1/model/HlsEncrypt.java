package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HlsEncrypt
 */
public class HlsEncrypt {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iv")

    private String iv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm")

    private String algorithm;

    public HlsEncrypt withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 内容加密秘钥 
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public HlsEncrypt withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 秘钥获取服务的地址 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public HlsEncrypt withIv(String iv) {
        this.iv = iv;
        return this;
    }

    /**
     * 初始向量，base64binary，随机数 
     * @return iv
     */
    public String getIv() {
        return iv;
    }

    public void setIv(String iv) {
        this.iv = iv;
    }

    public HlsEncrypt withAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * 加密算法。 - AES-128-CTR - AES-128-CBC - SM4CBC  默认值：AES-128-CTR 
     * @return algorithm
     */
    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HlsEncrypt that = (HlsEncrypt) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.url, that.url)
            && Objects.equals(this.iv, that.iv) && Objects.equals(this.algorithm, that.algorithm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, url, iv, algorithm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HlsEncrypt {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    iv: ").append(toIndentedString(iv)).append("\n");
        sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
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
