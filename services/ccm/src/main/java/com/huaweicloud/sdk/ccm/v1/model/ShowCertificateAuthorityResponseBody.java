package com.huaweicloud.sdk.ccm.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ccm.v1.model.CrlConfiguration;
import com.huaweicloud.sdk.ccm.v1.model.DistinguishedName;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ShowCertificateAuthorityResponseBody
 */
public class ShowCertificateAuthorityResponseBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ca_id")
    
    private String caId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path_length")
    
    private Integer pathLength;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="freeze_flag")
    
    private Integer freezeFlag;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="gen_mode")
    
    private String genMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="serial_number")
    
    private String serialNumber;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="delete_time")
    
    private String deleteTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="not_before")
    
    private String notBefore;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="not_after")
    
    private String notAfter;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="distinguished_name")
    
    private DistinguishedName distinguishedName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="crl_configuration")
    
    private CrlConfiguration crlConfiguration;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="issuer_id")
    
    private String issuerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="issuer_name")
    
    private String issuerName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_algorithm")
    
    private String keyAlgorithm;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="signature_algorithm")
    
    private String signatureAlgorithm;

    public ShowCertificateAuthorityResponseBody withCaId(String caId) {
        this.caId = caId;
        return this;
    }

    


    /**
     * CA ID
     * @return caId
     */
    public String getCaId() {
        return caId;
    }

    public void setCaId(String caId) {
        this.caId = caId;
    }

    

    public ShowCertificateAuthorityResponseBody withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * CA类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public ShowCertificateAuthorityResponseBody withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 证书状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public ShowCertificateAuthorityResponseBody withPathLength(Integer pathLength) {
        this.pathLength = pathLength;
        return this;
    }

    


    /**
     * 路径长度
     * minimum: 0
     * maximum: 4
     * @return pathLength
     */
    public Integer getPathLength() {
        return pathLength;
    }

    public void setPathLength(Integer pathLength) {
        this.pathLength = pathLength;
    }

    

    public ShowCertificateAuthorityResponseBody withFreezeFlag(Integer freezeFlag) {
        this.freezeFlag = freezeFlag;
        return this;
    }

    


    /**
     * 冻结标识
     * minimum: 0
     * maximum: 256
     * @return freezeFlag
     */
    public Integer getFreezeFlag() {
        return freezeFlag;
    }

    public void setFreezeFlag(Integer freezeFlag) {
        this.freezeFlag = freezeFlag;
    }

    

    public ShowCertificateAuthorityResponseBody withGenMode(String genMode) {
        this.genMode = genMode;
        return this;
    }

    


    /**
     * 证书生成方式
     * @return genMode
     */
    public String getGenMode() {
        return genMode;
    }

    public void setGenMode(String genMode) {
        this.genMode = genMode;
    }

    

    public ShowCertificateAuthorityResponseBody withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    


    /**
     * 序列号
     * @return serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    

    public ShowCertificateAuthorityResponseBody withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    

    public ShowCertificateAuthorityResponseBody withDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }

    


    /**
     * 删除时间
     * @return deleteTime
     */
    public String getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
    }

    

    public ShowCertificateAuthorityResponseBody withNotBefore(String notBefore) {
        this.notBefore = notBefore;
        return this;
    }

    


    /**
     * 生效时间
     * @return notBefore
     */
    public String getNotBefore() {
        return notBefore;
    }

    public void setNotBefore(String notBefore) {
        this.notBefore = notBefore;
    }

    

    public ShowCertificateAuthorityResponseBody withNotAfter(String notAfter) {
        this.notAfter = notAfter;
        return this;
    }

    


    /**
     * 失效时间
     * @return notAfter
     */
    public String getNotAfter() {
        return notAfter;
    }

    public void setNotAfter(String notAfter) {
        this.notAfter = notAfter;
    }

    

    public ShowCertificateAuthorityResponseBody withDistinguishedName(DistinguishedName distinguishedName) {
        this.distinguishedName = distinguishedName;
        return this;
    }

    public ShowCertificateAuthorityResponseBody withDistinguishedName(Consumer<DistinguishedName> distinguishedNameSetter) {
        if(this.distinguishedName == null ){
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

    

    public ShowCertificateAuthorityResponseBody withCrlConfiguration(CrlConfiguration crlConfiguration) {
        this.crlConfiguration = crlConfiguration;
        return this;
    }

    public ShowCertificateAuthorityResponseBody withCrlConfiguration(Consumer<CrlConfiguration> crlConfigurationSetter) {
        if(this.crlConfiguration == null ){
            this.crlConfiguration = new CrlConfiguration();
            crlConfigurationSetter.accept(this.crlConfiguration);
        }
        
        return this;
    }


    /**
     * Get crlConfiguration
     * @return crlConfiguration
     */
    public CrlConfiguration getCrlConfiguration() {
        return crlConfiguration;
    }

    public void setCrlConfiguration(CrlConfiguration crlConfiguration) {
        this.crlConfiguration = crlConfiguration;
    }

    

    public ShowCertificateAuthorityResponseBody withIssuerId(String issuerId) {
        this.issuerId = issuerId;
        return this;
    }

    


    /**
     * 签发CA ID
     * @return issuerId
     */
    public String getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(String issuerId) {
        this.issuerId = issuerId;
    }

    

    public ShowCertificateAuthorityResponseBody withIssuerName(String issuerName) {
        this.issuerName = issuerName;
        return this;
    }

    


    /**
     * 签发CA名称
     * @return issuerName
     */
    public String getIssuerName() {
        return issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    

    public ShowCertificateAuthorityResponseBody withKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
        return this;
    }

    


    /**
     * 密钥算法
     * @return keyAlgorithm
     */
    public String getKeyAlgorithm() {
        return keyAlgorithm;
    }

    public void setKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
    }

    

    public ShowCertificateAuthorityResponseBody withSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
        return this;
    }

    


    /**
     * 签名算法
     * @return signatureAlgorithm
     */
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
        ShowCertificateAuthorityResponseBody showCertificateAuthorityResponseBody = (ShowCertificateAuthorityResponseBody) o;
        return Objects.equals(this.caId, showCertificateAuthorityResponseBody.caId) &&
            Objects.equals(this.type, showCertificateAuthorityResponseBody.type) &&
            Objects.equals(this.status, showCertificateAuthorityResponseBody.status) &&
            Objects.equals(this.pathLength, showCertificateAuthorityResponseBody.pathLength) &&
            Objects.equals(this.freezeFlag, showCertificateAuthorityResponseBody.freezeFlag) &&
            Objects.equals(this.genMode, showCertificateAuthorityResponseBody.genMode) &&
            Objects.equals(this.serialNumber, showCertificateAuthorityResponseBody.serialNumber) &&
            Objects.equals(this.createTime, showCertificateAuthorityResponseBody.createTime) &&
            Objects.equals(this.deleteTime, showCertificateAuthorityResponseBody.deleteTime) &&
            Objects.equals(this.notBefore, showCertificateAuthorityResponseBody.notBefore) &&
            Objects.equals(this.notAfter, showCertificateAuthorityResponseBody.notAfter) &&
            Objects.equals(this.distinguishedName, showCertificateAuthorityResponseBody.distinguishedName) &&
            Objects.equals(this.crlConfiguration, showCertificateAuthorityResponseBody.crlConfiguration) &&
            Objects.equals(this.issuerId, showCertificateAuthorityResponseBody.issuerId) &&
            Objects.equals(this.issuerName, showCertificateAuthorityResponseBody.issuerName) &&
            Objects.equals(this.keyAlgorithm, showCertificateAuthorityResponseBody.keyAlgorithm) &&
            Objects.equals(this.signatureAlgorithm, showCertificateAuthorityResponseBody.signatureAlgorithm);
    }
    @Override
    public int hashCode() {
        return Objects.hash(caId, type, status, pathLength, freezeFlag, genMode, serialNumber, createTime, deleteTime, notBefore, notAfter, distinguishedName, crlConfiguration, issuerId, issuerName, keyAlgorithm, signatureAlgorithm);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCertificateAuthorityResponseBody {\n");
        sb.append("    caId: ").append(toIndentedString(caId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    pathLength: ").append(toIndentedString(pathLength)).append("\n");
        sb.append("    freezeFlag: ").append(toIndentedString(freezeFlag)).append("\n");
        sb.append("    genMode: ").append(toIndentedString(genMode)).append("\n");
        sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    deleteTime: ").append(toIndentedString(deleteTime)).append("\n");
        sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
        sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
        sb.append("    distinguishedName: ").append(toIndentedString(distinguishedName)).append("\n");
        sb.append("    crlConfiguration: ").append(toIndentedString(crlConfiguration)).append("\n");
        sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
        sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
        sb.append("    keyAlgorithm: ").append(toIndentedString(keyAlgorithm)).append("\n");
        sb.append("    signatureAlgorithm: ").append(toIndentedString(signatureAlgorithm)).append("\n");
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

