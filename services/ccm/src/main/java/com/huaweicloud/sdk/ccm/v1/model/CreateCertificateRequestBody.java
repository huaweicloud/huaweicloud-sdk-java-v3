package com.huaweicloud.sdk.ccm.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ccm.v1.model.CustomizedExtension;
import com.huaweicloud.sdk.ccm.v1.model.DistinguishedName;
import com.huaweicloud.sdk.ccm.v1.model.SubjectAlternativeName;
import com.huaweicloud.sdk.ccm.v1.model.Validity;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateCertificateRequestBody
 */
public class CreateCertificateRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customized_extension")
    
    private CustomizedExtension customizedExtension;


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
    @JsonProperty(value="key_usages")
    
    private List<String> keyUsages = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="signature_algorithm")
    
    private String signatureAlgorithm;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subject_alternative_names")
    
    private List<SubjectAlternativeName> subjectAlternativeNames = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="validity")
    
    private Validity validity;

    public CreateCertificateRequestBody withCustomizedExtension(CustomizedExtension customizedExtension) {
        this.customizedExtension = customizedExtension;
        return this;
    }

    public CreateCertificateRequestBody withCustomizedExtension(Consumer<CustomizedExtension> customizedExtensionSetter) {
        if(this.customizedExtension == null ){
            this.customizedExtension = new CustomizedExtension();
            customizedExtensionSetter.accept(this.customizedExtension);
        }
        
        return this;
    }


    /**
     * Get customizedExtension
     * @return customizedExtension
     */
    public CustomizedExtension getCustomizedExtension() {
        return customizedExtension;
    }

    public void setCustomizedExtension(CustomizedExtension customizedExtension) {
        this.customizedExtension = customizedExtension;
    }

    

    public CreateCertificateRequestBody withDistinguishedName(DistinguishedName distinguishedName) {
        this.distinguishedName = distinguishedName;
        return this;
    }

    public CreateCertificateRequestBody withDistinguishedName(Consumer<DistinguishedName> distinguishedNameSetter) {
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

    

    public CreateCertificateRequestBody withIssuerId(String issuerId) {
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

    

    public CreateCertificateRequestBody withKeyAlgorithm(String keyAlgorithm) {
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

    

    public CreateCertificateRequestBody withKeyUsages(List<String> keyUsages) {
        this.keyUsages = keyUsages;
        return this;
    }

    
    public CreateCertificateRequestBody addKeyUsagesItem(String keyUsagesItem) {
        if(this.keyUsages == null) {
            this.keyUsages = new ArrayList<>();
        }
        this.keyUsages.add(keyUsagesItem);
        return this;
    }

    public CreateCertificateRequestBody withKeyUsages(Consumer<List<String>> keyUsagesSetter) {
        if(this.keyUsages == null) {
            this.keyUsages = new ArrayList<>();
        }
        keyUsagesSetter.accept(this.keyUsages);
        return this;
    }

    /**
     * 密钥用法
     * @return keyUsages
     */
    public List<String> getKeyUsages() {
        return keyUsages;
    }

    public void setKeyUsages(List<String> keyUsages) {
        this.keyUsages = keyUsages;
    }

    

    public CreateCertificateRequestBody withSignatureAlgorithm(String signatureAlgorithm) {
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

    

    public CreateCertificateRequestBody withSubjectAlternativeNames(List<SubjectAlternativeName> subjectAlternativeNames) {
        this.subjectAlternativeNames = subjectAlternativeNames;
        return this;
    }

    
    public CreateCertificateRequestBody addSubjectAlternativeNamesItem(SubjectAlternativeName subjectAlternativeNamesItem) {
        if(this.subjectAlternativeNames == null) {
            this.subjectAlternativeNames = new ArrayList<>();
        }
        this.subjectAlternativeNames.add(subjectAlternativeNamesItem);
        return this;
    }

    public CreateCertificateRequestBody withSubjectAlternativeNames(Consumer<List<SubjectAlternativeName>> subjectAlternativeNamesSetter) {
        if(this.subjectAlternativeNames == null) {
            this.subjectAlternativeNames = new ArrayList<>();
        }
        subjectAlternativeNamesSetter.accept(this.subjectAlternativeNames);
        return this;
    }

    /**
     * 主题备用名称
     * @return subjectAlternativeNames
     */
    public List<SubjectAlternativeName> getSubjectAlternativeNames() {
        return subjectAlternativeNames;
    }

    public void setSubjectAlternativeNames(List<SubjectAlternativeName> subjectAlternativeNames) {
        this.subjectAlternativeNames = subjectAlternativeNames;
    }

    

    public CreateCertificateRequestBody withValidity(Validity validity) {
        this.validity = validity;
        return this;
    }

    public CreateCertificateRequestBody withValidity(Consumer<Validity> validitySetter) {
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
        CreateCertificateRequestBody createCertificateRequestBody = (CreateCertificateRequestBody) o;
        return Objects.equals(this.customizedExtension, createCertificateRequestBody.customizedExtension) &&
            Objects.equals(this.distinguishedName, createCertificateRequestBody.distinguishedName) &&
            Objects.equals(this.issuerId, createCertificateRequestBody.issuerId) &&
            Objects.equals(this.keyAlgorithm, createCertificateRequestBody.keyAlgorithm) &&
            Objects.equals(this.keyUsages, createCertificateRequestBody.keyUsages) &&
            Objects.equals(this.signatureAlgorithm, createCertificateRequestBody.signatureAlgorithm) &&
            Objects.equals(this.subjectAlternativeNames, createCertificateRequestBody.subjectAlternativeNames) &&
            Objects.equals(this.validity, createCertificateRequestBody.validity);
    }
    @Override
    public int hashCode() {
        return Objects.hash(customizedExtension, distinguishedName, issuerId, keyAlgorithm, keyUsages, signatureAlgorithm, subjectAlternativeNames, validity);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCertificateRequestBody {\n");
        sb.append("    customizedExtension: ").append(toIndentedString(customizedExtension)).append("\n");
        sb.append("    distinguishedName: ").append(toIndentedString(distinguishedName)).append("\n");
        sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
        sb.append("    keyAlgorithm: ").append(toIndentedString(keyAlgorithm)).append("\n");
        sb.append("    keyUsages: ").append(toIndentedString(keyUsages)).append("\n");
        sb.append("    signatureAlgorithm: ").append(toIndentedString(signatureAlgorithm)).append("\n");
        sb.append("    subjectAlternativeNames: ").append(toIndentedString(subjectAlternativeNames)).append("\n");
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

