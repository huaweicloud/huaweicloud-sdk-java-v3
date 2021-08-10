package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** ShowCertificateReponseBody */
public class ShowCertificateReponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_id")

    private String certificateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

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

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_before")

    private String notBefore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_after")

    private String notAfter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "distinguished_name")

    private DistinguishedName distinguishedName;

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

    public ShowCertificateReponseBody withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /** 证书 ID
     * 
     * @return certificateId */
    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public ShowCertificateReponseBody withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 证书状态
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowCertificateReponseBody withFreezeFlag(Integer freezeFlag) {
        this.freezeFlag = freezeFlag;
        return this;
    }

    /** 冻结标识 minimum: 0 maximum: 256
     * 
     * @return freezeFlag */
    public Integer getFreezeFlag() {
        return freezeFlag;
    }

    public void setFreezeFlag(Integer freezeFlag) {
        this.freezeFlag = freezeFlag;
    }

    public ShowCertificateReponseBody withGenMode(String genMode) {
        this.genMode = genMode;
        return this;
    }

    /** 证书生成方式
     * 
     * @return genMode */
    public String getGenMode() {
        return genMode;
    }

    public void setGenMode(String genMode) {
        this.genMode = genMode;
    }

    public ShowCertificateReponseBody withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /** 序列号
     * 
     * @return serialNumber */
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public ShowCertificateReponseBody withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 创建时间
     * 
     * @return createTime */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowCertificateReponseBody withNotBefore(String notBefore) {
        this.notBefore = notBefore;
        return this;
    }

    /** 生效时间
     * 
     * @return notBefore */
    public String getNotBefore() {
        return notBefore;
    }

    public void setNotBefore(String notBefore) {
        this.notBefore = notBefore;
    }

    public ShowCertificateReponseBody withNotAfter(String notAfter) {
        this.notAfter = notAfter;
        return this;
    }

    /** 失效时间
     * 
     * @return notAfter */
    public String getNotAfter() {
        return notAfter;
    }

    public void setNotAfter(String notAfter) {
        this.notAfter = notAfter;
    }

    public ShowCertificateReponseBody withDistinguishedName(DistinguishedName distinguishedName) {
        this.distinguishedName = distinguishedName;
        return this;
    }

    public ShowCertificateReponseBody withDistinguishedName(Consumer<DistinguishedName> distinguishedNameSetter) {
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

    public ShowCertificateReponseBody withIssuerId(String issuerId) {
        this.issuerId = issuerId;
        return this;
    }

    /** 签发CA ID
     * 
     * @return issuerId */
    public String getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(String issuerId) {
        this.issuerId = issuerId;
    }

    public ShowCertificateReponseBody withIssuerName(String issuerName) {
        this.issuerName = issuerName;
        return this;
    }

    /** 签发CA名称
     * 
     * @return issuerName */
    public String getIssuerName() {
        return issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    public ShowCertificateReponseBody withKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
        return this;
    }

    /** 密钥算法
     * 
     * @return keyAlgorithm */
    public String getKeyAlgorithm() {
        return keyAlgorithm;
    }

    public void setKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
    }

    public ShowCertificateReponseBody withSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
        return this;
    }

    /** 签名算法
     * 
     * @return signatureAlgorithm */
    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    public void setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCertificateReponseBody showCertificateReponseBody = (ShowCertificateReponseBody) o;
        return Objects.equals(this.certificateId, showCertificateReponseBody.certificateId)
            && Objects.equals(this.status, showCertificateReponseBody.status)
            && Objects.equals(this.freezeFlag, showCertificateReponseBody.freezeFlag)
            && Objects.equals(this.genMode, showCertificateReponseBody.genMode)
            && Objects.equals(this.serialNumber, showCertificateReponseBody.serialNumber)
            && Objects.equals(this.createTime, showCertificateReponseBody.createTime)
            && Objects.equals(this.notBefore, showCertificateReponseBody.notBefore)
            && Objects.equals(this.notAfter, showCertificateReponseBody.notAfter)
            && Objects.equals(this.distinguishedName, showCertificateReponseBody.distinguishedName)
            && Objects.equals(this.issuerId, showCertificateReponseBody.issuerId)
            && Objects.equals(this.issuerName, showCertificateReponseBody.issuerName)
            && Objects.equals(this.keyAlgorithm, showCertificateReponseBody.keyAlgorithm)
            && Objects.equals(this.signatureAlgorithm, showCertificateReponseBody.signatureAlgorithm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificateId,
            status,
            freezeFlag,
            genMode,
            serialNumber,
            createTime,
            notBefore,
            notAfter,
            distinguishedName,
            issuerId,
            issuerName,
            keyAlgorithm,
            signatureAlgorithm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCertificateReponseBody {\n");
        sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    freezeFlag: ").append(toIndentedString(freezeFlag)).append("\n");
        sb.append("    genMode: ").append(toIndentedString(genMode)).append("\n");
        sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
        sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
        sb.append("    distinguishedName: ").append(toIndentedString(distinguishedName)).append("\n");
        sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
        sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
        sb.append("    keyAlgorithm: ").append(toIndentedString(keyAlgorithm)).append("\n");
        sb.append("    signatureAlgorithm: ").append(toIndentedString(signatureAlgorithm)).append("\n");
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
