package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ImportCertificateAuthorityCertificateRequestBody */
public class ImportCertificateAuthorityCertificateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    private String certificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_chain")

    private String certificateChain;

    public ImportCertificateAuthorityCertificateRequestBody withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /** 证书内容
     * 
     * @return certificate */
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public ImportCertificateAuthorityCertificateRequestBody withCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
        return this;
    }

    /** 证书链内容
     * 
     * @return certificateChain */
    public String getCertificateChain() {
        return certificateChain;
    }

    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImportCertificateAuthorityCertificateRequestBody importCertificateAuthorityCertificateRequestBody =
            (ImportCertificateAuthorityCertificateRequestBody) o;
        return Objects.equals(this.certificate, importCertificateAuthorityCertificateRequestBody.certificate)
            && Objects.equals(this.certificateChain, importCertificateAuthorityCertificateRequestBody.certificateChain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificate, certificateChain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportCertificateAuthorityCertificateRequestBody {\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    certificateChain: ").append(toIndentedString(certificateChain)).append("\n");
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
