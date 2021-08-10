package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ParseCertificateSigningRequestResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificates")

    private List<ShowCertificateReponseBody> certificates = null;

    public ParseCertificateSigningRequestResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /** 证书总数 minimum: 0 maximum: 1000000
     * 
     * @return total */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ParseCertificateSigningRequestResponse withCertificates(List<ShowCertificateReponseBody> certificates) {
        this.certificates = certificates;
        return this;
    }

    public ParseCertificateSigningRequestResponse addCertificatesItem(ShowCertificateReponseBody certificatesItem) {
        if (this.certificates == null) {
            this.certificates = new ArrayList<>();
        }
        this.certificates.add(certificatesItem);
        return this;
    }

    public ParseCertificateSigningRequestResponse withCertificates(
        Consumer<List<ShowCertificateReponseBody>> certificatesSetter) {
        if (this.certificates == null) {
            this.certificates = new ArrayList<>();
        }
        certificatesSetter.accept(this.certificates);
        return this;
    }

    /** 证书列表
     * 
     * @return certificates */
    public List<ShowCertificateReponseBody> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<ShowCertificateReponseBody> certificates) {
        this.certificates = certificates;
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
        return Objects.equals(this.total, parseCertificateSigningRequestResponse.total)
            && Objects.equals(this.certificates, parseCertificateSigningRequestResponse.certificates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, certificates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParseCertificateSigningRequestResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
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
