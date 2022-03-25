package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ParseCertificateSigningRequestResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_algorithm")

    private String keyAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_algorithm_length")

    private String keyAlgorithmLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_algorithm")

    private String signatureAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_key")

    private String publicKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "distinguished_name")

    private DistinguishedName distinguishedName;

    public ParseCertificateSigningRequestResponse withKeyAlgorithm(String keyAlgorithm) {
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

    public ParseCertificateSigningRequestResponse withKeyAlgorithmLength(String keyAlgorithmLength) {
        this.keyAlgorithmLength = keyAlgorithmLength;
        return this;
    }

    /** 密钥算法长度，单位为bit。
     * 
     * @return keyAlgorithmLength */
    public String getKeyAlgorithmLength() {
        return keyAlgorithmLength;
    }

    public void setKeyAlgorithmLength(String keyAlgorithmLength) {
        this.keyAlgorithmLength = keyAlgorithmLength;
    }

    public ParseCertificateSigningRequestResponse withSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
        return this;
    }

    /** 签名算法，带具体的签名与哈希算法，如\"SHA256withRSA\"。
     * 
     * @return signatureAlgorithm */
    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    public void setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }

    public ParseCertificateSigningRequestResponse withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /** 公钥内容。 > 其中，换行符已被“\\r\\n”替代；
     * 
     * @return publicKey */
    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public ParseCertificateSigningRequestResponse withDistinguishedName(DistinguishedName distinguishedName) {
        this.distinguishedName = distinguishedName;
        return this;
    }

    public ParseCertificateSigningRequestResponse withDistinguishedName(
        Consumer<DistinguishedName> distinguishedNameSetter) {
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
        ParseCertificateSigningRequestResponse parseCertificateSigningRequestResponse =
            (ParseCertificateSigningRequestResponse) o;
        return Objects.equals(this.keyAlgorithm, parseCertificateSigningRequestResponse.keyAlgorithm)
            && Objects.equals(this.keyAlgorithmLength, parseCertificateSigningRequestResponse.keyAlgorithmLength)
            && Objects.equals(this.signatureAlgorithm, parseCertificateSigningRequestResponse.signatureAlgorithm)
            && Objects.equals(this.publicKey, parseCertificateSigningRequestResponse.publicKey)
            && Objects.equals(this.distinguishedName, parseCertificateSigningRequestResponse.distinguishedName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyAlgorithm, keyAlgorithmLength, signatureAlgorithm, publicKey, distinguishedName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParseCertificateSigningRequestResponse {\n");
        sb.append("    keyAlgorithm: ").append(toIndentedString(keyAlgorithm)).append("\n");
        sb.append("    keyAlgorithmLength: ").append(toIndentedString(keyAlgorithmLength)).append("\n");
        sb.append("    signatureAlgorithm: ").append(toIndentedString(signatureAlgorithm)).append("\n");
        sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
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
