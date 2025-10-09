package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListElbCertsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificates")

    private List<CertificatesResource> certificates = null;

    public ListElbCertsResponse withCertificates(List<CertificatesResource> certificates) {
        this.certificates = certificates;
        return this;
    }

    public ListElbCertsResponse addCertificatesItem(CertificatesResource certificatesItem) {
        if (this.certificates == null) {
            this.certificates = new ArrayList<>();
        }
        this.certificates.add(certificatesItem);
        return this;
    }

    public ListElbCertsResponse withCertificates(Consumer<List<CertificatesResource>> certificatesSetter) {
        if (this.certificates == null) {
            this.certificates = new ArrayList<>();
        }
        certificatesSetter.accept(this.certificates);
        return this;
    }

    /**
     * 证书列表信息。
     * @return certificates
     */
    public List<CertificatesResource> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<CertificatesResource> certificates) {
        this.certificates = certificates;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListElbCertsResponse that = (ListElbCertsResponse) obj;
        return Objects.equals(this.certificates, that.certificates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListElbCertsResponse {\n");
        sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
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
