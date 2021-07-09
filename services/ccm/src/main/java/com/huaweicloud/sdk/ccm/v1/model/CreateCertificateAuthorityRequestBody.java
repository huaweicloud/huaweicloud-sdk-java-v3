package com.huaweicloud.sdk.ccm.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ccm.v1.model.CrlConfiguration;
import com.huaweicloud.sdk.ccm.v1.model.DistinguishedName;
import com.huaweicloud.sdk.ccm.v1.model.Validity;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateCertificateAuthorityRequestBody
 */
public class CreateCertificateAuthorityRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="crl_configuration")
    
    private CrlConfiguration crlConfiguration;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="distinguished_name")
    
    private DistinguishedName distinguishedName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="issuer_id")
    
    private String issuerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_algorithm")
    
    private String keyAlgorithm;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="path_length")
    
    private Integer pathLength;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="signature_algorithm")
    
    private String signatureAlgorithm;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="validity")
    
    private Validity validity;

    public CreateCertificateAuthorityRequestBody withCrlConfiguration(CrlConfiguration crlConfiguration) {
        this.crlConfiguration = crlConfiguration;
        return this;
    }

    public CreateCertificateAuthorityRequestBody withCrlConfiguration(Consumer<CrlConfiguration> crlConfigurationSetter) {
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

    

    public CreateCertificateAuthorityRequestBody withDistinguishedName(DistinguishedName distinguishedName) {
        this.distinguishedName = distinguishedName;
        return this;
    }

    public CreateCertificateAuthorityRequestBody withDistinguishedName(Consumer<DistinguishedName> distinguishedNameSetter) {
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

    

    public CreateCertificateAuthorityRequestBody withIssuerId(String issuerId) {
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

    

    public CreateCertificateAuthorityRequestBody withKeyAlgorithm(String keyAlgorithm) {
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

    

    public CreateCertificateAuthorityRequestBody withPathLength(Integer pathLength) {
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

    

    public CreateCertificateAuthorityRequestBody withSignatureAlgorithm(String signatureAlgorithm) {
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

    

    public CreateCertificateAuthorityRequestBody withType(String type) {
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

    

    public CreateCertificateAuthorityRequestBody withValidity(Validity validity) {
        this.validity = validity;
        return this;
    }

    public CreateCertificateAuthorityRequestBody withValidity(Consumer<Validity> validitySetter) {
        if(this.validity == null ){
            this.validity = new Validity();
            validitySetter.accept(this.validity);
        }
        
        return this;
    }


    /**
     * Get validity
     * @return validity
     */
    public Validity getValidity() {
        return validity;
    }

    public void setValidity(Validity validity) {
        this.validity = validity;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCertificateAuthorityRequestBody createCertificateAuthorityRequestBody = (CreateCertificateAuthorityRequestBody) o;
        return Objects.equals(this.crlConfiguration, createCertificateAuthorityRequestBody.crlConfiguration) &&
            Objects.equals(this.distinguishedName, createCertificateAuthorityRequestBody.distinguishedName) &&
            Objects.equals(this.issuerId, createCertificateAuthorityRequestBody.issuerId) &&
            Objects.equals(this.keyAlgorithm, createCertificateAuthorityRequestBody.keyAlgorithm) &&
            Objects.equals(this.pathLength, createCertificateAuthorityRequestBody.pathLength) &&
            Objects.equals(this.signatureAlgorithm, createCertificateAuthorityRequestBody.signatureAlgorithm) &&
            Objects.equals(this.type, createCertificateAuthorityRequestBody.type) &&
            Objects.equals(this.validity, createCertificateAuthorityRequestBody.validity);
    }
    @Override
    public int hashCode() {
        return Objects.hash(crlConfiguration, distinguishedName, issuerId, keyAlgorithm, pathLength, signatureAlgorithm, type, validity);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCertificateAuthorityRequestBody {\n");
        sb.append("    crlConfiguration: ").append(toIndentedString(crlConfiguration)).append("\n");
        sb.append("    distinguishedName: ").append(toIndentedString(distinguishedName)).append("\n");
        sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
        sb.append("    keyAlgorithm: ").append(toIndentedString(keyAlgorithm)).append("\n");
        sb.append("    pathLength: ").append(toIndentedString(pathLength)).append("\n");
        sb.append("    signatureAlgorithm: ").append(toIndentedString(signatureAlgorithm)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
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

