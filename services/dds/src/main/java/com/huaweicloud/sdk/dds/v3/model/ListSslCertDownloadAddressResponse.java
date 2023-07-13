package com.huaweicloud.sdk.dds.v3.model;

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
public class ListSslCertDownloadAddressResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certs")

    private List<CertInfo> certs = null;

    public ListSslCertDownloadAddressResponse withCerts(List<CertInfo> certs) {
        this.certs = certs;
        return this;
    }

    public ListSslCertDownloadAddressResponse addCertsItem(CertInfo certsItem) {
        if (this.certs == null) {
            this.certs = new ArrayList<>();
        }
        this.certs.add(certsItem);
        return this;
    }

    public ListSslCertDownloadAddressResponse withCerts(Consumer<List<CertInfo>> certsSetter) {
        if (this.certs == null) {
            this.certs = new ArrayList<>();
        }
        certsSetter.accept(this.certs);
        return this;
    }

    /**
     * 证书列表
     * @return certs
     */
    public List<CertInfo> getCerts() {
        return certs;
    }

    public void setCerts(List<CertInfo> certs) {
        this.certs = certs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSslCertDownloadAddressResponse that = (ListSslCertDownloadAddressResponse) obj;
        return Objects.equals(this.certs, that.certs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSslCertDownloadAddressResponse {\n");
        sb.append("    certs: ").append(toIndentedString(certs)).append("\n");
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
