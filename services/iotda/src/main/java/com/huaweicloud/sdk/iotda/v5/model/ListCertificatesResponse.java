package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListCertificatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificates")

    private List<CertificatesRspDTO> certificates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Page page;

    public ListCertificatesResponse withCertificates(List<CertificatesRspDTO> certificates) {
        this.certificates = certificates;
        return this;
    }

    public ListCertificatesResponse addCertificatesItem(CertificatesRspDTO certificatesItem) {
        if (this.certificates == null) {
            this.certificates = new ArrayList<>();
        }
        this.certificates.add(certificatesItem);
        return this;
    }

    public ListCertificatesResponse withCertificates(Consumer<List<CertificatesRspDTO>> certificatesSetter) {
        if (this.certificates == null) {
            this.certificates = new ArrayList<>();
        }
        certificatesSetter.accept(this.certificates);
        return this;
    }

    /** 证书列表。
     * 
     * @return certificates */
    public List<CertificatesRspDTO> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<CertificatesRspDTO> certificates) {
        this.certificates = certificates;
    }

    public ListCertificatesResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ListCertificatesResponse withPage(Consumer<Page> pageSetter) {
        if (this.page == null) {
            this.page = new Page();
            pageSetter.accept(this.page);
        }

        return this;
    }

    /** Get page
     * 
     * @return page */
    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCertificatesResponse listCertificatesResponse = (ListCertificatesResponse) o;
        return Objects.equals(this.certificates, listCertificatesResponse.certificates)
            && Objects.equals(this.page, listCertificatesResponse.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificates, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCertificatesResponse {\n");
        sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
