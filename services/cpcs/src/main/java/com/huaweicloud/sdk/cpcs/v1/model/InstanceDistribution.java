package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * InstanceDistribution
 */
public class InstanceDistribution {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrypt_decrypt")

    private Integer encryptDecrypt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_verify")

    private Integer signVerify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms")

    private Integer kms;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Integer timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "colla_sign")

    private Integer collaSign;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "otp")

    private Integer otp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_encrypt")

    private Integer dbEncrypt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_encrypt")

    private Integer fileEncrypt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "digit_seal")

    private Integer digitSeal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_vpn")

    private Integer sslVpn;

    public InstanceDistribution withEncryptDecrypt(Integer encryptDecrypt) {
        this.encryptDecrypt = encryptDecrypt;
        return this;
    }

    /**
     * 加解密服务实例数量
     * @return encryptDecrypt
     */
    public Integer getEncryptDecrypt() {
        return encryptDecrypt;
    }

    public void setEncryptDecrypt(Integer encryptDecrypt) {
        this.encryptDecrypt = encryptDecrypt;
    }

    public InstanceDistribution withSignVerify(Integer signVerify) {
        this.signVerify = signVerify;
        return this;
    }

    /**
     * 签名验签服务实例数量
     * @return signVerify
     */
    public Integer getSignVerify() {
        return signVerify;
    }

    public void setSignVerify(Integer signVerify) {
        this.signVerify = signVerify;
    }

    public InstanceDistribution withKms(Integer kms) {
        this.kms = kms;
        return this;
    }

    /**
     * 密钥管理服务实例数量
     * @return kms
     */
    public Integer getKms() {
        return kms;
    }

    public void setKms(Integer kms) {
        this.kms = kms;
    }

    public InstanceDistribution withTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 时间戳服务实例数量
     * @return timestamp
     */
    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public InstanceDistribution withCollaSign(Integer collaSign) {
        this.collaSign = collaSign;
        return this;
    }

    /**
     * 协同签名服务实例数量
     * @return collaSign
     */
    public Integer getCollaSign() {
        return collaSign;
    }

    public void setCollaSign(Integer collaSign) {
        this.collaSign = collaSign;
    }

    public InstanceDistribution withOtp(Integer otp) {
        this.otp = otp;
        return this;
    }

    /**
     * 动态口令服务实例数量
     * @return otp
     */
    public Integer getOtp() {
        return otp;
    }

    public void setOtp(Integer otp) {
        this.otp = otp;
    }

    public InstanceDistribution withDbEncrypt(Integer dbEncrypt) {
        this.dbEncrypt = dbEncrypt;
        return this;
    }

    /**
     * 数据库加密服务实例数量
     * @return dbEncrypt
     */
    public Integer getDbEncrypt() {
        return dbEncrypt;
    }

    public void setDbEncrypt(Integer dbEncrypt) {
        this.dbEncrypt = dbEncrypt;
    }

    public InstanceDistribution withFileEncrypt(Integer fileEncrypt) {
        this.fileEncrypt = fileEncrypt;
        return this;
    }

    /**
     * 文件加密服务实例数量
     * @return fileEncrypt
     */
    public Integer getFileEncrypt() {
        return fileEncrypt;
    }

    public void setFileEncrypt(Integer fileEncrypt) {
        this.fileEncrypt = fileEncrypt;
    }

    public InstanceDistribution withDigitSeal(Integer digitSeal) {
        this.digitSeal = digitSeal;
        return this;
    }

    /**
     * 电子签章服务实例数量
     * @return digitSeal
     */
    public Integer getDigitSeal() {
        return digitSeal;
    }

    public void setDigitSeal(Integer digitSeal) {
        this.digitSeal = digitSeal;
    }

    public InstanceDistribution withSslVpn(Integer sslVpn) {
        this.sslVpn = sslVpn;
        return this;
    }

    /**
     * ssl vpn服务实例数量
     * @return sslVpn
     */
    public Integer getSslVpn() {
        return sslVpn;
    }

    public void setSslVpn(Integer sslVpn) {
        this.sslVpn = sslVpn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceDistribution that = (InstanceDistribution) obj;
        return Objects.equals(this.encryptDecrypt, that.encryptDecrypt)
            && Objects.equals(this.signVerify, that.signVerify) && Objects.equals(this.kms, that.kms)
            && Objects.equals(this.timestamp, that.timestamp) && Objects.equals(this.collaSign, that.collaSign)
            && Objects.equals(this.otp, that.otp) && Objects.equals(this.dbEncrypt, that.dbEncrypt)
            && Objects.equals(this.fileEncrypt, that.fileEncrypt) && Objects.equals(this.digitSeal, that.digitSeal)
            && Objects.equals(this.sslVpn, that.sslVpn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encryptDecrypt,
            signVerify,
            kms,
            timestamp,
            collaSign,
            otp,
            dbEncrypt,
            fileEncrypt,
            digitSeal,
            sslVpn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceDistribution {\n");
        sb.append("    encryptDecrypt: ").append(toIndentedString(encryptDecrypt)).append("\n");
        sb.append("    signVerify: ").append(toIndentedString(signVerify)).append("\n");
        sb.append("    kms: ").append(toIndentedString(kms)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    collaSign: ").append(toIndentedString(collaSign)).append("\n");
        sb.append("    otp: ").append(toIndentedString(otp)).append("\n");
        sb.append("    dbEncrypt: ").append(toIndentedString(dbEncrypt)).append("\n");
        sb.append("    fileEncrypt: ").append(toIndentedString(fileEncrypt)).append("\n");
        sb.append("    digitSeal: ").append(toIndentedString(digitSeal)).append("\n");
        sb.append("    sslVpn: ").append(toIndentedString(sslVpn)).append("\n");
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
