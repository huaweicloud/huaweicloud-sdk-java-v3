package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowStatisticInterfaceResponseBodyMetrics
 */
public class ShowStatisticInterfaceResponseBodyMetrics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pkiDigestBusiStatistic")

    private Double pkiDigestBusiStatistic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pkiDecryptBusiStatistic")

    private Double pkiDecryptBusiStatistic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pkiGenerateKeyBusiStatistic")

    private Double pkiGenerateKeyBusiStatistic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pkiVerifyBusiStatistic")

    private Double pkiVerifyBusiStatistic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pkiEncryptBusiStatistic")

    private Double pkiEncryptBusiStatistic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tsaVerifyBusiStatistic")

    private Double tsaVerifyBusiStatistic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tsaParseBusiStatistic")

    private Double tsaParseBusiStatistic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "svsVerifyBusiStatistic")

    private Double svsVerifyBusiStatistic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pkiRandomBusiStatistic")

    private Double pkiRandomBusiStatistic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "svsCertBusiStatistic")

    private Double svsCertBusiStatistic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "svsEncodeBusiStatistic")

    private Double svsEncodeBusiStatistic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tsaApplyBusiStatistic")

    private Double tsaApplyBusiStatistic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "svsSignBusiStatistic")

    private Double svsSignBusiStatistic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "svsDecryptBusiStatistic")

    private Double svsDecryptBusiStatistic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kmsBusiStatistic")

    private Double kmsBusiStatistic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sealVerifyBusiStatistic")

    private Double sealVerifyBusiStatistic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pkiSignBusiStatistic")

    private Double pkiSignBusiStatistic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secauthBusiStatistic")

    private Double secauthBusiStatistic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sealSignBusiStatistic")

    private Double sealSignBusiStatistic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "splitBusiStatistic")

    private Double splitBusiStatistic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "svsRandomBusiStatistic")

    private Double svsRandomBusiStatistic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "svsEncryptBusiStatistic")

    private Double svsEncryptBusiStatistic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smsDecBusiStatistic")

    private Double smsDecBusiStatistic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "svsDigestBusiStatistic")

    private Double svsDigestBusiStatistic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "svsDecodeBusiStatistic")

    private Double svsDecodeBusiStatistic;

    public ShowStatisticInterfaceResponseBodyMetrics withPkiDigestBusiStatistic(Double pkiDigestBusiStatistic) {
        this.pkiDigestBusiStatistic = pkiDigestBusiStatistic;
        return this;
    }

    /**
     * 杂凑
     * @return pkiDigestBusiStatistic
     */
    public Double getPkiDigestBusiStatistic() {
        return pkiDigestBusiStatistic;
    }

    public void setPkiDigestBusiStatistic(Double pkiDigestBusiStatistic) {
        this.pkiDigestBusiStatistic = pkiDigestBusiStatistic;
    }

    public ShowStatisticInterfaceResponseBodyMetrics withPkiDecryptBusiStatistic(Double pkiDecryptBusiStatistic) {
        this.pkiDecryptBusiStatistic = pkiDecryptBusiStatistic;
        return this;
    }

    /**
     * 解密
     * @return pkiDecryptBusiStatistic
     */
    public Double getPkiDecryptBusiStatistic() {
        return pkiDecryptBusiStatistic;
    }

    public void setPkiDecryptBusiStatistic(Double pkiDecryptBusiStatistic) {
        this.pkiDecryptBusiStatistic = pkiDecryptBusiStatistic;
    }

    public ShowStatisticInterfaceResponseBodyMetrics withPkiGenerateKeyBusiStatistic(
        Double pkiGenerateKeyBusiStatistic) {
        this.pkiGenerateKeyBusiStatistic = pkiGenerateKeyBusiStatistic;
        return this;
    }

    /**
     * 生成密钥
     * @return pkiGenerateKeyBusiStatistic
     */
    public Double getPkiGenerateKeyBusiStatistic() {
        return pkiGenerateKeyBusiStatistic;
    }

    public void setPkiGenerateKeyBusiStatistic(Double pkiGenerateKeyBusiStatistic) {
        this.pkiGenerateKeyBusiStatistic = pkiGenerateKeyBusiStatistic;
    }

    public ShowStatisticInterfaceResponseBodyMetrics withPkiVerifyBusiStatistic(Double pkiVerifyBusiStatistic) {
        this.pkiVerifyBusiStatistic = pkiVerifyBusiStatistic;
        return this;
    }

    /**
     * 验章次数
     * @return pkiVerifyBusiStatistic
     */
    public Double getPkiVerifyBusiStatistic() {
        return pkiVerifyBusiStatistic;
    }

    public void setPkiVerifyBusiStatistic(Double pkiVerifyBusiStatistic) {
        this.pkiVerifyBusiStatistic = pkiVerifyBusiStatistic;
    }

    public ShowStatisticInterfaceResponseBodyMetrics withPkiEncryptBusiStatistic(Double pkiEncryptBusiStatistic) {
        this.pkiEncryptBusiStatistic = pkiEncryptBusiStatistic;
        return this;
    }

    /**
     * 加密
     * @return pkiEncryptBusiStatistic
     */
    public Double getPkiEncryptBusiStatistic() {
        return pkiEncryptBusiStatistic;
    }

    public void setPkiEncryptBusiStatistic(Double pkiEncryptBusiStatistic) {
        this.pkiEncryptBusiStatistic = pkiEncryptBusiStatistic;
    }

    public ShowStatisticInterfaceResponseBodyMetrics withTsaVerifyBusiStatistic(Double tsaVerifyBusiStatistic) {
        this.tsaVerifyBusiStatistic = tsaVerifyBusiStatistic;
        return this;
    }

    /**
     * 验证次数
     * @return tsaVerifyBusiStatistic
     */
    public Double getTsaVerifyBusiStatistic() {
        return tsaVerifyBusiStatistic;
    }

    public void setTsaVerifyBusiStatistic(Double tsaVerifyBusiStatistic) {
        this.tsaVerifyBusiStatistic = tsaVerifyBusiStatistic;
    }

    public ShowStatisticInterfaceResponseBodyMetrics withTsaParseBusiStatistic(Double tsaParseBusiStatistic) {
        this.tsaParseBusiStatistic = tsaParseBusiStatistic;
        return this;
    }

    /**
     * 解析次数
     * @return tsaParseBusiStatistic
     */
    public Double getTsaParseBusiStatistic() {
        return tsaParseBusiStatistic;
    }

    public void setTsaParseBusiStatistic(Double tsaParseBusiStatistic) {
        this.tsaParseBusiStatistic = tsaParseBusiStatistic;
    }

    public ShowStatisticInterfaceResponseBodyMetrics withSvsVerifyBusiStatistic(Double svsVerifyBusiStatistic) {
        this.svsVerifyBusiStatistic = svsVerifyBusiStatistic;
        return this;
    }

    /**
     * svs验签
     * @return svsVerifyBusiStatistic
     */
    public Double getSvsVerifyBusiStatistic() {
        return svsVerifyBusiStatistic;
    }

    public void setSvsVerifyBusiStatistic(Double svsVerifyBusiStatistic) {
        this.svsVerifyBusiStatistic = svsVerifyBusiStatistic;
    }

    public ShowStatisticInterfaceResponseBodyMetrics withPkiRandomBusiStatistic(Double pkiRandomBusiStatistic) {
        this.pkiRandomBusiStatistic = pkiRandomBusiStatistic;
        return this;
    }

    /**
     * 生成随机
     * @return pkiRandomBusiStatistic
     */
    public Double getPkiRandomBusiStatistic() {
        return pkiRandomBusiStatistic;
    }

    public void setPkiRandomBusiStatistic(Double pkiRandomBusiStatistic) {
        this.pkiRandomBusiStatistic = pkiRandomBusiStatistic;
    }

    public ShowStatisticInterfaceResponseBodyMetrics withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 统计时间，UNIX时间戳，单位毫秒
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public ShowStatisticInterfaceResponseBodyMetrics withSvsCertBusiStatistic(Double svsCertBusiStatistic) {
        this.svsCertBusiStatistic = svsCertBusiStatistic;
        return this;
    }

    /**
     * svs获取证书等相关证书操作
     * @return svsCertBusiStatistic
     */
    public Double getSvsCertBusiStatistic() {
        return svsCertBusiStatistic;
    }

    public void setSvsCertBusiStatistic(Double svsCertBusiStatistic) {
        this.svsCertBusiStatistic = svsCertBusiStatistic;
    }

    public ShowStatisticInterfaceResponseBodyMetrics withSvsEncodeBusiStatistic(Double svsEncodeBusiStatistic) {
        this.svsEncodeBusiStatistic = svsEncodeBusiStatistic;
        return this;
    }

    /**
     * svs编码
     * @return svsEncodeBusiStatistic
     */
    public Double getSvsEncodeBusiStatistic() {
        return svsEncodeBusiStatistic;
    }

    public void setSvsEncodeBusiStatistic(Double svsEncodeBusiStatistic) {
        this.svsEncodeBusiStatistic = svsEncodeBusiStatistic;
    }

    public ShowStatisticInterfaceResponseBodyMetrics withTsaApplyBusiStatistic(Double tsaApplyBusiStatistic) {
        this.tsaApplyBusiStatistic = tsaApplyBusiStatistic;
        return this;
    }

    /**
     * 申请次数
     * @return tsaApplyBusiStatistic
     */
    public Double getTsaApplyBusiStatistic() {
        return tsaApplyBusiStatistic;
    }

    public void setTsaApplyBusiStatistic(Double tsaApplyBusiStatistic) {
        this.tsaApplyBusiStatistic = tsaApplyBusiStatistic;
    }

    public ShowStatisticInterfaceResponseBodyMetrics withSvsSignBusiStatistic(Double svsSignBusiStatistic) {
        this.svsSignBusiStatistic = svsSignBusiStatistic;
        return this;
    }

    /**
     * svs签名
     * @return svsSignBusiStatistic
     */
    public Double getSvsSignBusiStatistic() {
        return svsSignBusiStatistic;
    }

    public void setSvsSignBusiStatistic(Double svsSignBusiStatistic) {
        this.svsSignBusiStatistic = svsSignBusiStatistic;
    }

    public ShowStatisticInterfaceResponseBodyMetrics withSvsDecryptBusiStatistic(Double svsDecryptBusiStatistic) {
        this.svsDecryptBusiStatistic = svsDecryptBusiStatistic;
        return this;
    }

    /**
     * svs解密
     * @return svsDecryptBusiStatistic
     */
    public Double getSvsDecryptBusiStatistic() {
        return svsDecryptBusiStatistic;
    }

    public void setSvsDecryptBusiStatistic(Double svsDecryptBusiStatistic) {
        this.svsDecryptBusiStatistic = svsDecryptBusiStatistic;
    }

    public ShowStatisticInterfaceResponseBodyMetrics withKmsBusiStatistic(Double kmsBusiStatistic) {
        this.kmsBusiStatistic = kmsBusiStatistic;
        return this;
    }

    /**
     * 调用次数
     * @return kmsBusiStatistic
     */
    public Double getKmsBusiStatistic() {
        return kmsBusiStatistic;
    }

    public void setKmsBusiStatistic(Double kmsBusiStatistic) {
        this.kmsBusiStatistic = kmsBusiStatistic;
    }

    public ShowStatisticInterfaceResponseBodyMetrics withSealVerifyBusiStatistic(Double sealVerifyBusiStatistic) {
        this.sealVerifyBusiStatistic = sealVerifyBusiStatistic;
        return this;
    }

    /**
     * 验章次数
     * @return sealVerifyBusiStatistic
     */
    public Double getSealVerifyBusiStatistic() {
        return sealVerifyBusiStatistic;
    }

    public void setSealVerifyBusiStatistic(Double sealVerifyBusiStatistic) {
        this.sealVerifyBusiStatistic = sealVerifyBusiStatistic;
    }

    public ShowStatisticInterfaceResponseBodyMetrics withPkiSignBusiStatistic(Double pkiSignBusiStatistic) {
        this.pkiSignBusiStatistic = pkiSignBusiStatistic;
        return this;
    }

    /**
     * 签名
     * @return pkiSignBusiStatistic
     */
    public Double getPkiSignBusiStatistic() {
        return pkiSignBusiStatistic;
    }

    public void setPkiSignBusiStatistic(Double pkiSignBusiStatistic) {
        this.pkiSignBusiStatistic = pkiSignBusiStatistic;
    }

    public ShowStatisticInterfaceResponseBodyMetrics withSecauthBusiStatistic(Double secauthBusiStatistic) {
        this.secauthBusiStatistic = secauthBusiStatistic;
        return this;
    }

    /**
     * 口令验证
     * @return secauthBusiStatistic
     */
    public Double getSecauthBusiStatistic() {
        return secauthBusiStatistic;
    }

    public void setSecauthBusiStatistic(Double secauthBusiStatistic) {
        this.secauthBusiStatistic = secauthBusiStatistic;
    }

    public ShowStatisticInterfaceResponseBodyMetrics withSealSignBusiStatistic(Double sealSignBusiStatistic) {
        this.sealSignBusiStatistic = sealSignBusiStatistic;
        return this;
    }

    /**
     * 签章次数
     * @return sealSignBusiStatistic
     */
    public Double getSealSignBusiStatistic() {
        return sealSignBusiStatistic;
    }

    public void setSealSignBusiStatistic(Double sealSignBusiStatistic) {
        this.sealSignBusiStatistic = sealSignBusiStatistic;
    }

    public ShowStatisticInterfaceResponseBodyMetrics withSplitBusiStatistic(Double splitBusiStatistic) {
        this.splitBusiStatistic = splitBusiStatistic;
        return this;
    }

    /**
     * 签名次数
     * @return splitBusiStatistic
     */
    public Double getSplitBusiStatistic() {
        return splitBusiStatistic;
    }

    public void setSplitBusiStatistic(Double splitBusiStatistic) {
        this.splitBusiStatistic = splitBusiStatistic;
    }

    public ShowStatisticInterfaceResponseBodyMetrics withSvsRandomBusiStatistic(Double svsRandomBusiStatistic) {
        this.svsRandomBusiStatistic = svsRandomBusiStatistic;
        return this;
    }

    /**
     * svs生成随机
     * @return svsRandomBusiStatistic
     */
    public Double getSvsRandomBusiStatistic() {
        return svsRandomBusiStatistic;
    }

    public void setSvsRandomBusiStatistic(Double svsRandomBusiStatistic) {
        this.svsRandomBusiStatistic = svsRandomBusiStatistic;
    }

    public ShowStatisticInterfaceResponseBodyMetrics withSvsEncryptBusiStatistic(Double svsEncryptBusiStatistic) {
        this.svsEncryptBusiStatistic = svsEncryptBusiStatistic;
        return this;
    }

    /**
     * svs加密
     * @return svsEncryptBusiStatistic
     */
    public Double getSvsEncryptBusiStatistic() {
        return svsEncryptBusiStatistic;
    }

    public void setSvsEncryptBusiStatistic(Double svsEncryptBusiStatistic) {
        this.svsEncryptBusiStatistic = svsEncryptBusiStatistic;
    }

    public ShowStatisticInterfaceResponseBodyMetrics withSmsDecBusiStatistic(Double smsDecBusiStatistic) {
        this.smsDecBusiStatistic = smsDecBusiStatistic;
        return this;
    }

    /**
     * 解密次数
     * @return smsDecBusiStatistic
     */
    public Double getSmsDecBusiStatistic() {
        return smsDecBusiStatistic;
    }

    public void setSmsDecBusiStatistic(Double smsDecBusiStatistic) {
        this.smsDecBusiStatistic = smsDecBusiStatistic;
    }

    public ShowStatisticInterfaceResponseBodyMetrics withSvsDigestBusiStatistic(Double svsDigestBusiStatistic) {
        this.svsDigestBusiStatistic = svsDigestBusiStatistic;
        return this;
    }

    /**
     * svs杂凑
     * @return svsDigestBusiStatistic
     */
    public Double getSvsDigestBusiStatistic() {
        return svsDigestBusiStatistic;
    }

    public void setSvsDigestBusiStatistic(Double svsDigestBusiStatistic) {
        this.svsDigestBusiStatistic = svsDigestBusiStatistic;
    }

    public ShowStatisticInterfaceResponseBodyMetrics withSvsDecodeBusiStatistic(Double svsDecodeBusiStatistic) {
        this.svsDecodeBusiStatistic = svsDecodeBusiStatistic;
        return this;
    }

    /**
     * svs解码
     * @return svsDecodeBusiStatistic
     */
    public Double getSvsDecodeBusiStatistic() {
        return svsDecodeBusiStatistic;
    }

    public void setSvsDecodeBusiStatistic(Double svsDecodeBusiStatistic) {
        this.svsDecodeBusiStatistic = svsDecodeBusiStatistic;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStatisticInterfaceResponseBodyMetrics that = (ShowStatisticInterfaceResponseBodyMetrics) obj;
        return Objects.equals(this.pkiDigestBusiStatistic, that.pkiDigestBusiStatistic)
            && Objects.equals(this.pkiDecryptBusiStatistic, that.pkiDecryptBusiStatistic)
            && Objects.equals(this.pkiGenerateKeyBusiStatistic, that.pkiGenerateKeyBusiStatistic)
            && Objects.equals(this.pkiVerifyBusiStatistic, that.pkiVerifyBusiStatistic)
            && Objects.equals(this.pkiEncryptBusiStatistic, that.pkiEncryptBusiStatistic)
            && Objects.equals(this.tsaVerifyBusiStatistic, that.tsaVerifyBusiStatistic)
            && Objects.equals(this.tsaParseBusiStatistic, that.tsaParseBusiStatistic)
            && Objects.equals(this.svsVerifyBusiStatistic, that.svsVerifyBusiStatistic)
            && Objects.equals(this.pkiRandomBusiStatistic, that.pkiRandomBusiStatistic)
            && Objects.equals(this.timestamp, that.timestamp)
            && Objects.equals(this.svsCertBusiStatistic, that.svsCertBusiStatistic)
            && Objects.equals(this.svsEncodeBusiStatistic, that.svsEncodeBusiStatistic)
            && Objects.equals(this.tsaApplyBusiStatistic, that.tsaApplyBusiStatistic)
            && Objects.equals(this.svsSignBusiStatistic, that.svsSignBusiStatistic)
            && Objects.equals(this.svsDecryptBusiStatistic, that.svsDecryptBusiStatistic)
            && Objects.equals(this.kmsBusiStatistic, that.kmsBusiStatistic)
            && Objects.equals(this.sealVerifyBusiStatistic, that.sealVerifyBusiStatistic)
            && Objects.equals(this.pkiSignBusiStatistic, that.pkiSignBusiStatistic)
            && Objects.equals(this.secauthBusiStatistic, that.secauthBusiStatistic)
            && Objects.equals(this.sealSignBusiStatistic, that.sealSignBusiStatistic)
            && Objects.equals(this.splitBusiStatistic, that.splitBusiStatistic)
            && Objects.equals(this.svsRandomBusiStatistic, that.svsRandomBusiStatistic)
            && Objects.equals(this.svsEncryptBusiStatistic, that.svsEncryptBusiStatistic)
            && Objects.equals(this.smsDecBusiStatistic, that.smsDecBusiStatistic)
            && Objects.equals(this.svsDigestBusiStatistic, that.svsDigestBusiStatistic)
            && Objects.equals(this.svsDecodeBusiStatistic, that.svsDecodeBusiStatistic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkiDigestBusiStatistic,
            pkiDecryptBusiStatistic,
            pkiGenerateKeyBusiStatistic,
            pkiVerifyBusiStatistic,
            pkiEncryptBusiStatistic,
            tsaVerifyBusiStatistic,
            tsaParseBusiStatistic,
            svsVerifyBusiStatistic,
            pkiRandomBusiStatistic,
            timestamp,
            svsCertBusiStatistic,
            svsEncodeBusiStatistic,
            tsaApplyBusiStatistic,
            svsSignBusiStatistic,
            svsDecryptBusiStatistic,
            kmsBusiStatistic,
            sealVerifyBusiStatistic,
            pkiSignBusiStatistic,
            secauthBusiStatistic,
            sealSignBusiStatistic,
            splitBusiStatistic,
            svsRandomBusiStatistic,
            svsEncryptBusiStatistic,
            smsDecBusiStatistic,
            svsDigestBusiStatistic,
            svsDecodeBusiStatistic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStatisticInterfaceResponseBodyMetrics {\n");
        sb.append("    pkiDigestBusiStatistic: ").append(toIndentedString(pkiDigestBusiStatistic)).append("\n");
        sb.append("    pkiDecryptBusiStatistic: ").append(toIndentedString(pkiDecryptBusiStatistic)).append("\n");
        sb.append("    pkiGenerateKeyBusiStatistic: ")
            .append(toIndentedString(pkiGenerateKeyBusiStatistic))
            .append("\n");
        sb.append("    pkiVerifyBusiStatistic: ").append(toIndentedString(pkiVerifyBusiStatistic)).append("\n");
        sb.append("    pkiEncryptBusiStatistic: ").append(toIndentedString(pkiEncryptBusiStatistic)).append("\n");
        sb.append("    tsaVerifyBusiStatistic: ").append(toIndentedString(tsaVerifyBusiStatistic)).append("\n");
        sb.append("    tsaParseBusiStatistic: ").append(toIndentedString(tsaParseBusiStatistic)).append("\n");
        sb.append("    svsVerifyBusiStatistic: ").append(toIndentedString(svsVerifyBusiStatistic)).append("\n");
        sb.append("    pkiRandomBusiStatistic: ").append(toIndentedString(pkiRandomBusiStatistic)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    svsCertBusiStatistic: ").append(toIndentedString(svsCertBusiStatistic)).append("\n");
        sb.append("    svsEncodeBusiStatistic: ").append(toIndentedString(svsEncodeBusiStatistic)).append("\n");
        sb.append("    tsaApplyBusiStatistic: ").append(toIndentedString(tsaApplyBusiStatistic)).append("\n");
        sb.append("    svsSignBusiStatistic: ").append(toIndentedString(svsSignBusiStatistic)).append("\n");
        sb.append("    svsDecryptBusiStatistic: ").append(toIndentedString(svsDecryptBusiStatistic)).append("\n");
        sb.append("    kmsBusiStatistic: ").append(toIndentedString(kmsBusiStatistic)).append("\n");
        sb.append("    sealVerifyBusiStatistic: ").append(toIndentedString(sealVerifyBusiStatistic)).append("\n");
        sb.append("    pkiSignBusiStatistic: ").append(toIndentedString(pkiSignBusiStatistic)).append("\n");
        sb.append("    secauthBusiStatistic: ").append(toIndentedString(secauthBusiStatistic)).append("\n");
        sb.append("    sealSignBusiStatistic: ").append(toIndentedString(sealSignBusiStatistic)).append("\n");
        sb.append("    splitBusiStatistic: ").append(toIndentedString(splitBusiStatistic)).append("\n");
        sb.append("    svsRandomBusiStatistic: ").append(toIndentedString(svsRandomBusiStatistic)).append("\n");
        sb.append("    svsEncryptBusiStatistic: ").append(toIndentedString(svsEncryptBusiStatistic)).append("\n");
        sb.append("    smsDecBusiStatistic: ").append(toIndentedString(smsDecBusiStatistic)).append("\n");
        sb.append("    svsDigestBusiStatistic: ").append(toIndentedString(svsDigestBusiStatistic)).append("\n");
        sb.append("    svsDecodeBusiStatistic: ").append(toIndentedString(svsDecodeBusiStatistic)).append("\n");
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
