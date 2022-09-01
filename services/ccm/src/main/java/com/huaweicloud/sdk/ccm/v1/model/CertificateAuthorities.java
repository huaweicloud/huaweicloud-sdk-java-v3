package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CertificateAuthorities
 */
public class CertificateAuthorities {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ca_id")

    @JacksonXmlProperty(localName = "ca_id")

    private String caId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path_length")

    @JacksonXmlProperty(localName = "path_length")

    private Integer pathLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuer_id")

    @JacksonXmlProperty(localName = "issuer_id")

    private String issuerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuer_name")

    @JacksonXmlProperty(localName = "issuer_name")

    private String issuerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_algorithm")

    @JacksonXmlProperty(localName = "key_algorithm")

    private String keyAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_algorithm")

    @JacksonXmlProperty(localName = "signature_algorithm")

    private String signatureAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freeze_flag")

    @JacksonXmlProperty(localName = "freeze_flag")

    private Integer freezeFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gen_mode")

    @JacksonXmlProperty(localName = "gen_mode")

    private String genMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_number")

    @JacksonXmlProperty(localName = "serial_number")

    private String serialNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    @JacksonXmlProperty(localName = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_time")

    @JacksonXmlProperty(localName = "delete_time")

    private Long deleteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_before")

    @JacksonXmlProperty(localName = "not_before")

    private Long notBefore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_after")

    @JacksonXmlProperty(localName = "not_after")

    private Long notAfter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "distinguished_name")

    @JacksonXmlProperty(localName = "distinguished_name")

    private DistinguishedName distinguishedName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "crl_configuration")

    @JacksonXmlProperty(localName = "crl_configuration")

    private ListCrlConfiguration crlConfiguration;

    public CertificateAuthorities withCaId(String caId) {
        this.caId = caId;
        return this;
    }

    /**
     * CA证书ID。
     * @return caId
     */
    public String getCaId() {
        return caId;
    }

    public void setCaId(String caId) {
        this.caId = caId;
    }

    public CertificateAuthorities withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * CA类型:   - **ROOT**: 根CA   - **SUBORDINATE**: 从属CA
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CertificateAuthorities withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * CA证书状态：   - **PENDING** : 待激活，此状态下，不可用于签发证书；   - **ACTIVED** : 已激活，此状态下，可用于签发证书；   - **DISABLED** : 已禁用，此状态下，不可用于签发证书；   - **DELETED** : 计划删除，此状态下，不可用于签发证书；   - **EXPIRED** : 已过期，此状态下，不可用于签发证书。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CertificateAuthorities withPathLength(Integer pathLength) {
        this.pathLength = pathLength;
        return this;
    }

    /**
     * CA路径长度。 > 注：生成的根CA证书，其路径长度不做限制，但本字段在数据库中统一置为7。从属CA的路径长度在创建时由用户指定，缺省值为0。
     * minimum: 0
     * maximum: 6
     * @return pathLength
     */
    public Integer getPathLength() {
        return pathLength;
    }

    public void setPathLength(Integer pathLength) {
        this.pathLength = pathLength;
    }

    public CertificateAuthorities withIssuerId(String issuerId) {
        this.issuerId = issuerId;
        return this;
    }

    /**
     * 父CA证书ID，即签发此证书的CA证书ID。根CA中，此参数为**null**。
     * @return issuerId
     */
    public String getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(String issuerId) {
        this.issuerId = issuerId;
    }

    public CertificateAuthorities withIssuerName(String issuerName) {
        this.issuerName = issuerName;
        return this;
    }

    /**
     * 父CA证书名称。根CA中，此参数为**null**。
     * @return issuerName
     */
    public String getIssuerName() {
        return issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    public CertificateAuthorities withKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
        return this;
    }

    /**
     * 密钥算法。
     * @return keyAlgorithm
     */
    public String getKeyAlgorithm() {
        return keyAlgorithm;
    }

    public void setKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
    }

    public CertificateAuthorities withSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
        return this;
    }

    /**
     * 签名哈希算法。
     * @return signatureAlgorithm
     */
    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    public void setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }

    public CertificateAuthorities withFreezeFlag(Integer freezeFlag) {
        this.freezeFlag = freezeFlag;
        return this;
    }

    /**
     * 冻结标识:   - **0** : 非冻结状态；   - **其它值** : 冻结状态，当前预留。
     * @return freezeFlag
     */
    public Integer getFreezeFlag() {
        return freezeFlag;
    }

    public void setFreezeFlag(Integer freezeFlag) {
        this.freezeFlag = freezeFlag;
    }

    public CertificateAuthorities withGenMode(String genMode) {
        this.genMode = genMode;
        return this;
    }

    /**
     * 证书生成方式：  - **GENERATE** : PCA系统生成；  - **IMPORT** : 外部导入；  - **CSR** : 外部提供CSR，内部CA进行签发，即私钥不在PCA进行托管。
     * @return genMode
     */
    public String getGenMode() {
        return genMode;
    }

    public void setGenMode(String genMode) {
        this.genMode = genMode;
    }

    public CertificateAuthorities withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * 证书序列号。
     * @return serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public CertificateAuthorities withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 证书创建时间，格式为时间戳（毫秒级）。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public CertificateAuthorities withDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }

    /**
     * 证书删除时间，格式为时间戳（毫秒级）。
     * @return deleteTime
     */
    public Long getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime;
    }

    public CertificateAuthorities withNotBefore(Long notBefore) {
        this.notBefore = notBefore;
        return this;
    }

    /**
     * 证书创建时间，格式为时间戳（毫秒级）。
     * @return notBefore
     */
    public Long getNotBefore() {
        return notBefore;
    }

    public void setNotBefore(Long notBefore) {
        this.notBefore = notBefore;
    }

    public CertificateAuthorities withNotAfter(Long notAfter) {
        this.notAfter = notAfter;
        return this;
    }

    /**
     * 证书到期时间，格式为时间戳（毫秒级）。
     * @return notAfter
     */
    public Long getNotAfter() {
        return notAfter;
    }

    public void setNotAfter(Long notAfter) {
        this.notAfter = notAfter;
    }

    public CertificateAuthorities withDistinguishedName(DistinguishedName distinguishedName) {
        this.distinguishedName = distinguishedName;
        return this;
    }

    public CertificateAuthorities withDistinguishedName(Consumer<DistinguishedName> distinguishedNameSetter) {
        if (this.distinguishedName == null) {
            this.distinguishedName = new DistinguishedName();
            distinguishedNameSetter.accept(this.distinguishedName);
        }

        return this;
    }

    /**
     * Get distinguishedName
     * @return distinguishedName
     */
    public DistinguishedName getDistinguishedName() {
        return distinguishedName;
    }

    public void setDistinguishedName(DistinguishedName distinguishedName) {
        this.distinguishedName = distinguishedName;
    }

    public CertificateAuthorities withCrlConfiguration(ListCrlConfiguration crlConfiguration) {
        this.crlConfiguration = crlConfiguration;
        return this;
    }

    public CertificateAuthorities withCrlConfiguration(Consumer<ListCrlConfiguration> crlConfigurationSetter) {
        if (this.crlConfiguration == null) {
            this.crlConfiguration = new ListCrlConfiguration();
            crlConfigurationSetter.accept(this.crlConfiguration);
        }

        return this;
    }

    /**
     * Get crlConfiguration
     * @return crlConfiguration
     */
    public ListCrlConfiguration getCrlConfiguration() {
        return crlConfiguration;
    }

    public void setCrlConfiguration(ListCrlConfiguration crlConfiguration) {
        this.crlConfiguration = crlConfiguration;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CertificateAuthorities certificateAuthorities = (CertificateAuthorities) o;
        return Objects.equals(this.caId, certificateAuthorities.caId)
            && Objects.equals(this.type, certificateAuthorities.type)
            && Objects.equals(this.status, certificateAuthorities.status)
            && Objects.equals(this.pathLength, certificateAuthorities.pathLength)
            && Objects.equals(this.issuerId, certificateAuthorities.issuerId)
            && Objects.equals(this.issuerName, certificateAuthorities.issuerName)
            && Objects.equals(this.keyAlgorithm, certificateAuthorities.keyAlgorithm)
            && Objects.equals(this.signatureAlgorithm, certificateAuthorities.signatureAlgorithm)
            && Objects.equals(this.freezeFlag, certificateAuthorities.freezeFlag)
            && Objects.equals(this.genMode, certificateAuthorities.genMode)
            && Objects.equals(this.serialNumber, certificateAuthorities.serialNumber)
            && Objects.equals(this.createTime, certificateAuthorities.createTime)
            && Objects.equals(this.deleteTime, certificateAuthorities.deleteTime)
            && Objects.equals(this.notBefore, certificateAuthorities.notBefore)
            && Objects.equals(this.notAfter, certificateAuthorities.notAfter)
            && Objects.equals(this.distinguishedName, certificateAuthorities.distinguishedName)
            && Objects.equals(this.crlConfiguration, certificateAuthorities.crlConfiguration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caId,
            type,
            status,
            pathLength,
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
            distinguishedName,
            crlConfiguration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CertificateAuthorities {\n");
        sb.append("    caId: ").append(toIndentedString(caId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    pathLength: ").append(toIndentedString(pathLength)).append("\n");
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
        sb.append("    crlConfiguration: ").append(toIndentedString(crlConfiguration)).append("\n");
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
