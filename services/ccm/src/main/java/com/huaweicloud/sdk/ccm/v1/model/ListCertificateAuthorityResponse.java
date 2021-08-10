package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListCertificateAuthorityResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_authorities")

    private List<ShowCertificateAuthorityResponseBody> certificateAuthorities = null;

    public ListCertificateAuthorityResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /** CA总数 minimum: 0 maximum: 1000000
     * 
     * @return total */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListCertificateAuthorityResponse withCertificateAuthorities(
        List<ShowCertificateAuthorityResponseBody> certificateAuthorities) {
        this.certificateAuthorities = certificateAuthorities;
        return this;
    }

    public ListCertificateAuthorityResponse addCertificateAuthoritiesItem(
        ShowCertificateAuthorityResponseBody certificateAuthoritiesItem) {
        if (this.certificateAuthorities == null) {
            this.certificateAuthorities = new ArrayList<>();
        }
        this.certificateAuthorities.add(certificateAuthoritiesItem);
        return this;
    }

    public ListCertificateAuthorityResponse withCertificateAuthorities(
        Consumer<List<ShowCertificateAuthorityResponseBody>> certificateAuthoritiesSetter) {
        if (this.certificateAuthorities == null) {
            this.certificateAuthorities = new ArrayList<>();
        }
        certificateAuthoritiesSetter.accept(this.certificateAuthorities);
        return this;
    }

    /** CA列表
     * 
     * @return certificateAuthorities */
    public List<ShowCertificateAuthorityResponseBody> getCertificateAuthorities() {
        return certificateAuthorities;
    }

    public void setCertificateAuthorities(List<ShowCertificateAuthorityResponseBody> certificateAuthorities) {
        this.certificateAuthorities = certificateAuthorities;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCertificateAuthorityResponse listCertificateAuthorityResponse = (ListCertificateAuthorityResponse) o;
        return Objects.equals(this.total, listCertificateAuthorityResponse.total)
            && Objects.equals(this.certificateAuthorities, listCertificateAuthorityResponse.certificateAuthorities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, certificateAuthorities);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCertificateAuthorityResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    certificateAuthorities: ").append(toIndentedString(certificateAuthorities)).append("\n");
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
