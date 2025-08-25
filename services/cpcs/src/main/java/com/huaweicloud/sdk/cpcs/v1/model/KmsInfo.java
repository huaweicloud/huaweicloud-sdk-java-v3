package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * KmsInfo
 */
public class KmsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aes_256")

    private Integer aes256;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sm4")

    private Integer sm4;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rsa_2048")

    private Integer rsa2048;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rsa_3072")

    private Integer rsa3072;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rsa_4096")

    private Integer rsa4096;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ec_p256")

    private Integer ecP256;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ec_p384")

    private Integer ecP384;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sm2")

    private Integer sm2;

    public KmsInfo withAes256(Integer aes256) {
        this.aes256 = aes256;
        return this;
    }

    /**
     * AES_256算法密钥数量
     * @return aes256
     */
    public Integer getAes256() {
        return aes256;
    }

    public void setAes256(Integer aes256) {
        this.aes256 = aes256;
    }

    public KmsInfo withSm4(Integer sm4) {
        this.sm4 = sm4;
        return this;
    }

    /**
     * SM4算法密钥数量
     * @return sm4
     */
    public Integer getSm4() {
        return sm4;
    }

    public void setSm4(Integer sm4) {
        this.sm4 = sm4;
    }

    public KmsInfo withRsa2048(Integer rsa2048) {
        this.rsa2048 = rsa2048;
        return this;
    }

    /**
     * RSA_2048算法密钥数量
     * @return rsa2048
     */
    public Integer getRsa2048() {
        return rsa2048;
    }

    public void setRsa2048(Integer rsa2048) {
        this.rsa2048 = rsa2048;
    }

    public KmsInfo withRsa3072(Integer rsa3072) {
        this.rsa3072 = rsa3072;
        return this;
    }

    /**
     * RSA_3072算法密钥数量
     * @return rsa3072
     */
    public Integer getRsa3072() {
        return rsa3072;
    }

    public void setRsa3072(Integer rsa3072) {
        this.rsa3072 = rsa3072;
    }

    public KmsInfo withRsa4096(Integer rsa4096) {
        this.rsa4096 = rsa4096;
        return this;
    }

    /**
     * RSA_4096算法密钥数量
     * @return rsa4096
     */
    public Integer getRsa4096() {
        return rsa4096;
    }

    public void setRsa4096(Integer rsa4096) {
        this.rsa4096 = rsa4096;
    }

    public KmsInfo withEcP256(Integer ecP256) {
        this.ecP256 = ecP256;
        return this;
    }

    /**
     * EC_P256算法密钥数量
     * @return ecP256
     */
    public Integer getEcP256() {
        return ecP256;
    }

    public void setEcP256(Integer ecP256) {
        this.ecP256 = ecP256;
    }

    public KmsInfo withEcP384(Integer ecP384) {
        this.ecP384 = ecP384;
        return this;
    }

    /**
     * EC_P384务算法密钥数量
     * @return ecP384
     */
    public Integer getEcP384() {
        return ecP384;
    }

    public void setEcP384(Integer ecP384) {
        this.ecP384 = ecP384;
    }

    public KmsInfo withSm2(Integer sm2) {
        this.sm2 = sm2;
        return this;
    }

    /**
     * SM2算法密钥数量
     * @return sm2
     */
    public Integer getSm2() {
        return sm2;
    }

    public void setSm2(Integer sm2) {
        this.sm2 = sm2;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KmsInfo that = (KmsInfo) obj;
        return Objects.equals(this.aes256, that.aes256) && Objects.equals(this.sm4, that.sm4)
            && Objects.equals(this.rsa2048, that.rsa2048) && Objects.equals(this.rsa3072, that.rsa3072)
            && Objects.equals(this.rsa4096, that.rsa4096) && Objects.equals(this.ecP256, that.ecP256)
            && Objects.equals(this.ecP384, that.ecP384) && Objects.equals(this.sm2, that.sm2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aes256, sm4, rsa2048, rsa3072, rsa4096, ecP256, ecP384, sm2);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KmsInfo {\n");
        sb.append("    aes256: ").append(toIndentedString(aes256)).append("\n");
        sb.append("    sm4: ").append(toIndentedString(sm4)).append("\n");
        sb.append("    rsa2048: ").append(toIndentedString(rsa2048)).append("\n");
        sb.append("    rsa3072: ").append(toIndentedString(rsa3072)).append("\n");
        sb.append("    rsa4096: ").append(toIndentedString(rsa4096)).append("\n");
        sb.append("    ecP256: ").append(toIndentedString(ecP256)).append("\n");
        sb.append("    ecP384: ").append(toIndentedString(ecP384)).append("\n");
        sb.append("    sm2: ").append(toIndentedString(sm2)).append("\n");
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
