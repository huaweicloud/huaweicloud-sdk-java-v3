package com.huaweicloud.sdk.identitycenterstore.v1.model;

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
public class ListExternalIdPCertificatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idp_certificates")

    private List<IdpCertificate> idpCertificates = null;

    public ListExternalIdPCertificatesResponse withIdpCertificates(List<IdpCertificate> idpCertificates) {
        this.idpCertificates = idpCertificates;
        return this;
    }

    public ListExternalIdPCertificatesResponse addIdpCertificatesItem(IdpCertificate idpCertificatesItem) {
        if (this.idpCertificates == null) {
            this.idpCertificates = new ArrayList<>();
        }
        this.idpCertificates.add(idpCertificatesItem);
        return this;
    }

    public ListExternalIdPCertificatesResponse withIdpCertificates(
        Consumer<List<IdpCertificate>> idpCertificatesSetter) {
        if (this.idpCertificates == null) {
            this.idpCertificates = new ArrayList<>();
        }
        idpCertificatesSetter.accept(this.idpCertificates);
        return this;
    }

    /**
     * 外部身份提供商证书列表
     * @return idpCertificates
     */
    public List<IdpCertificate> getIdpCertificates() {
        return idpCertificates;
    }

    public void setIdpCertificates(List<IdpCertificate> idpCertificates) {
        this.idpCertificates = idpCertificates;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListExternalIdPCertificatesResponse that = (ListExternalIdPCertificatesResponse) obj;
        return Objects.equals(this.idpCertificates, that.idpCertificates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idpCertificates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListExternalIdPCertificatesResponse {\n");
        sb.append("    idpCertificates: ").append(toIndentedString(idpCertificates)).append("\n");
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
