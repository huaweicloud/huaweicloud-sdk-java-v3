package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowCertificateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_id")

    private String certificateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuer_id")

    private String issuerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuer_name")

    private String issuerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_algorithm")

    private String keyAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_algorithm")

    private String signatureAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freeze_flag")

    private Integer freezeFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gen_mode")

    private String genMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_number")

    private String serialNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_time")

    private Long deleteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_before")

    private Long notBefore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_after")

    private Long notAfter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "distinguished_name")

    private DistinguishedName distinguishedName;

    public ShowCertificateResponse withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /** 私有证书ID。
     * 
     * @return certificateId */
    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public ShowCertificateResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 证书状态： - **ISSUED** : 已签发； - **EXPIRED** : 已过期； - **REVOKED** : 已吊销。
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowCertificateResponse withIssuerId(String issuerId) {
        this.issuerId = issuerId;
        return this;
    }

    /** 父CA证书ID。
     * 
     * @return issuerId */
    public String getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(String issuerId) {
        this.issuerId = issuerId;
    }

    public ShowCertificateResponse withIssuerName(String issuerName) {
        this.issuerName = issuerName;
        return this;
    }

    /** 父CA证书名称。
     * 
     * @return issuerName */
    public String getIssuerName() {
        return issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    public ShowCertificateResponse withKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
        return this;
    }

    /** 密钥算法。
     * 
     * @return keyAlgorithm */
    public String getKeyAlgorithm() {
        return keyAlgorithm;
    }

    public void setKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
    }

    public ShowCertificateResponse withSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
        return this;
    }

    /** 签名算法。
     * 
     * @return signatureAlgorithm */
    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    public void setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }

    public ShowCertificateResponse withFreezeFlag(Integer freezeFlag) {
        this.freezeFlag = freezeFlag;
        return this;
    }

    /** 冻结标识: - **0** : 非冻结状态； - **其它值** : 冻结状态，当前预留。
     * 
     * @return freezeFlag */
    public Integer getFreezeFlag() {
        return freezeFlag;
    }

    public void setFreezeFlag(Integer freezeFlag) {
        this.freezeFlag = freezeFlag;
    }

    public ShowCertificateResponse withGenMode(String genMode) {
        this.genMode = genMode;
        return this;
    }

    /** 证书生成方式： - **GENERATE** : PCA系统生成； - **IMPORT** : 外部导入； - **CSR** : 外部提供CSR，内部CA进行签发，即私钥不在PCA进行托管。
     * 
     * @return genMode */
    public String getGenMode() {
        return genMode;
    }

    public void setGenMode(String genMode) {
        this.genMode = genMode;
    }

    public ShowCertificateResponse withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /** 序列号。
     * 
     * @return serialNumber */
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public ShowCertificateResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 证书创建时间，格式为时间戳（毫秒级）。
     * 
     * @return createTime */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowCertificateResponse withDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }

    /** 证书删除时间，格式为时间戳（毫秒级）。
     * 
     * @return deleteTime */
    public Long getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime;
    }

    public ShowCertificateResponse withNotBefore(Long notBefore) {
        this.notBefore = notBefore;
        return this;
    }

    /** 证书创建时间，格式为时间戳（毫秒级）。
     * 
     * @return notBefore */
    public Long getNotBefore() {
        return notBefore;
    }

    public void setNotBefore(Long notBefore) {
        this.notBefore = notBefore;
    }

    public ShowCertificateResponse withNotAfter(Long notAfter) {
        this.notAfter = notAfter;
        return this;
    }

    /** 证书到期时间，格式为时间戳（毫秒级）。
     * 
     * @return notAfter */
    public Long getNotAfter() {
        return notAfter;
    }

    public void setNotAfter(Long notAfter) {
        this.notAfter = notAfter;
    }

    public ShowCertificateResponse withDistinguishedName(DistinguishedName distinguishedName) {
        this.distinguishedName = distinguishedName;
        return this;
    }

    public ShowCertificateResponse withDistinguishedName(Consumer<DistinguishedName> distinguishedNameSetter) {
        if (this.distinguishedName == null) {
            this.distinguishedName = new DistinguishedName();
            distinguishedNameSetter.accept(this.distinguishedName);
        }

        return this;
    }

    /** Get distinguishedName
     * 
     * @return distinguishedName */
    public DistinguishedName getDistinguishedName() {
        return distinguishedName;
    }

    public void setDistinguishedName(DistinguishedName distinguishedName) {
        this.distinguishedName = distinguishedName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCertificateResponse showCertificateResponse = (ShowCertificateResponse) o;
        return Objects.equals(this.certificateId, showCertificateResponse.certificateId)
            && Objects.equals(this.status, showCertificateResponse.status)
            && Objects.equals(this.issuerId, showCertificateResponse.issuerId)
            && Objects.equals(this.issuerName, showCertificateResponse.issuerName)
            && Objects.equals(this.keyAlgorithm, showCertificateResponse.keyAlgorithm)
            && Objects.equals(this.signatureAlgorithm, showCertificateResponse.signatureAlgorithm)
            && Objects.equals(this.freezeFlag, showCertificateResponse.freezeFlag)
            && Objects.equals(this.genMode, showCertificateResponse.genMode)
            && Objects.equals(this.serialNumber, showCertificateResponse.serialNumber)
            && Objects.equals(this.createTime, showCertificateResponse.createTime)
            && Objects.equals(this.deleteTime, showCertificateResponse.deleteTime)
            && Objects.equals(this.notBefore, showCertificateResponse.notBefore)
            && Objects.equals(this.notAfter, showCertificateResponse.notAfter)
            && Objects.equals(this.distinguishedName, showCertificateResponse.distinguishedName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificateId,
            status,
            issuerId,
            issuerName,
            keyAlgorithm,
            signatureAlgorithm,
            freezeFlag,
            genMode,
            serialNumber,
            createTime,
            deleteTime,
            notBefore,
            notAfter,
            distinguishedName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCertificateResponse {\n");
        sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
        sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
        sb.append("    keyAlgorithm: ").append(toIndentedString(keyAlgorithm)).append("\n");
        sb.append("    signatureAlgorithm: ").append(toIndentedString(signatureAlgorithm)).append("\n");
        sb.append("    freezeFlag: ").append(toIndentedString(freezeFlag)).append("\n");
        sb.append("    genMode: ").append(toIndentedString(genMode)).append("\n");
        sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    deleteTime: ").append(toIndentedString(deleteTime)).append("\n");
        sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
        sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
        sb.append("    distinguishedName: ").append(toIndentedString(distinguishedName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
