package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateCertificateRequestBody
 */
public class CreateCertificateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuer_id")

    private String issuerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_algorithm")

    private String keyAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_algorithm")

    private String signatureAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "distinguished_name")

    private CertDistinguishedName distinguishedName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validity")

    private Validity validity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_usages")

    private List<String> keyUsages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject_alternative_names")

    private List<SubjectAlternativeName> subjectAlternativeNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customized_extension")

    private CustomizedExtension customizedExtension;

    public CreateCertificateRequestBody withIssuerId(String issuerId) {
        this.issuerId = issuerId;
        return this;
    }

    /**
     * 父CA证书ID。
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
     * 密钥算法，可选值如下：   - **RSA2048** : RSA算法，密钥长度2048位；   - **RSA4096** : RSA算法，密钥长度4096位；   - **EC256** : 椭圆曲线算法（Elliptic Curve Digital Signature Algorithm (ECDSA)），密钥长度256位；   - **EC384** : 椭圆曲线算法（Elliptic Curve Digital Signature Algorithm (ECDSA)），密钥长度384位。
     * @return keyAlgorithm
     */
    public String getKeyAlgorithm() {
        return keyAlgorithm;
    }

    public void setKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
    }

    public CreateCertificateRequestBody withSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
        return this;
    }

    /**
     * 签名哈希算法，可选值如下：   - **SHA256**   - **SHA384**   - **SHA512**
     * @return signatureAlgorithm
     */
    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    public void setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }

    public CreateCertificateRequestBody withDistinguishedName(CertDistinguishedName distinguishedName) {
        this.distinguishedName = distinguishedName;
        return this;
    }

    public CreateCertificateRequestBody withDistinguishedName(Consumer<CertDistinguishedName> distinguishedNameSetter) {
        if (this.distinguishedName == null) {
            this.distinguishedName = new CertDistinguishedName();
            distinguishedNameSetter.accept(this.distinguishedName);
        }

        return this;
    }

    /**
     * Get distinguishedName
     * @return distinguishedName
     */
    public CertDistinguishedName getDistinguishedName() {
        return distinguishedName;
    }

    public void setDistinguishedName(CertDistinguishedName distinguishedName) {
        this.distinguishedName = distinguishedName;
    }

    public CreateCertificateRequestBody withValidity(Validity validity) {
        this.validity = validity;
        return this;
    }

    public CreateCertificateRequestBody withValidity(Consumer<Validity> validitySetter) {
        if (this.validity == null) {
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

    public CreateCertificateRequestBody withKeyUsages(List<String> keyUsages) {
        this.keyUsages = keyUsages;
        return this;
    }

    public CreateCertificateRequestBody addKeyUsagesItem(String keyUsagesItem) {
        if (this.keyUsages == null) {
            this.keyUsages = new ArrayList<>();
        }
        this.keyUsages.add(keyUsagesItem);
        return this;
    }

    public CreateCertificateRequestBody withKeyUsages(Consumer<List<String>> keyUsagesSetter) {
        if (this.keyUsages == null) {
            this.keyUsages = new ArrayList<>();
        }
        keyUsagesSetter.accept(this.keyUsages);
        return this;
    }

    /**
     * 密钥用法，具体标准参见RFC 5280中:[4.2.1.3节](https://datatracker.ietf.org/doc/html/rfc5280#section-4.2.1.3)。   - **digitalSignature** : 数字签名；   - **nonRepudiation** : 不可抵赖；   - **keyEncipherment** : 密钥用于加密密钥数据；   - **dataEncipherment** : 用于加密数据；   - **keyAgreement** : 密钥协商；   - **keyCertSign** : 签发证书；   - **cRLSign** : 签发吊销列表；   - **encipherOnly** : 仅用于加密；   - **decipherOnly** : 仅用于解密。
     * @return keyUsages
     */
    public List<String> getKeyUsages() {
        return keyUsages;
    }

    public void setKeyUsages(List<String> keyUsages) {
        this.keyUsages = keyUsages;
    }

    public CreateCertificateRequestBody withSubjectAlternativeNames(
        List<SubjectAlternativeName> subjectAlternativeNames) {
        this.subjectAlternativeNames = subjectAlternativeNames;
        return this;
    }

    public CreateCertificateRequestBody addSubjectAlternativeNamesItem(
        SubjectAlternativeName subjectAlternativeNamesItem) {
        if (this.subjectAlternativeNames == null) {
            this.subjectAlternativeNames = new ArrayList<>();
        }
        this.subjectAlternativeNames.add(subjectAlternativeNamesItem);
        return this;
    }

    public CreateCertificateRequestBody withSubjectAlternativeNames(
        Consumer<List<SubjectAlternativeName>> subjectAlternativeNamesSetter) {
        if (this.subjectAlternativeNames == null) {
            this.subjectAlternativeNames = new ArrayList<>();
        }
        subjectAlternativeNamesSetter.accept(this.subjectAlternativeNames);
        return this;
    }

    /**
     * 主体备用名称，详情请参见**SubjectAlternativeName**字段数据结构说明。   - array大小：[0,20]。
     * @return subjectAlternativeNames
     */
    public List<SubjectAlternativeName> getSubjectAlternativeNames() {
        return subjectAlternativeNames;
    }

    public void setSubjectAlternativeNames(List<SubjectAlternativeName> subjectAlternativeNames) {
        this.subjectAlternativeNames = subjectAlternativeNames;
    }

    public CreateCertificateRequestBody withCustomizedExtension(CustomizedExtension customizedExtension) {
        this.customizedExtension = customizedExtension;
        return this;
    }

    public CreateCertificateRequestBody withCustomizedExtension(
        Consumer<CustomizedExtension> customizedExtensionSetter) {
        if (this.customizedExtension == null) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCertificateRequestBody createCertificateRequestBody = (CreateCertificateRequestBody) o;
        return Objects.equals(this.issuerId, createCertificateRequestBody.issuerId)
            && Objects.equals(this.keyAlgorithm, createCertificateRequestBody.keyAlgorithm)
            && Objects.equals(this.signatureAlgorithm, createCertificateRequestBody.signatureAlgorithm)
            && Objects.equals(this.distinguishedName, createCertificateRequestBody.distinguishedName)
            && Objects.equals(this.validity, createCertificateRequestBody.validity)
            && Objects.equals(this.keyUsages, createCertificateRequestBody.keyUsages)
            && Objects.equals(this.subjectAlternativeNames, createCertificateRequestBody.subjectAlternativeNames)
            && Objects.equals(this.customizedExtension, createCertificateRequestBody.customizedExtension);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issuerId,
            keyAlgorithm,
            signatureAlgorithm,
            distinguishedName,
            validity,
            keyUsages,
            subjectAlternativeNames,
            customizedExtension);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCertificateRequestBody {\n");
        sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
        sb.append("    keyAlgorithm: ").append(toIndentedString(keyAlgorithm)).append("\n");
        sb.append("    signatureAlgorithm: ").append(toIndentedString(signatureAlgorithm)).append("\n");
        sb.append("    distinguishedName: ").append(toIndentedString(distinguishedName)).append("\n");
        sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
        sb.append("    keyUsages: ").append(toIndentedString(keyUsages)).append("\n");
        sb.append("    subjectAlternativeNames: ").append(toIndentedString(subjectAlternativeNames)).append("\n");
        sb.append("    customizedExtension: ").append(toIndentedString(customizedExtension)).append("\n");
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
