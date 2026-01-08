package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListCertsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_list")

    private List<CertItem> certList = null;

    public ListCertsResponse withCertList(List<CertItem> certList) {
        this.certList = certList;
        return this;
    }

    public ListCertsResponse addCertListItem(CertItem certListItem) {
        if (this.certList == null) {
            this.certList = new ArrayList<>();
        }
        this.certList.add(certListItem);
        return this;
    }

    public ListCertsResponse withCertList(Consumer<List<CertItem>> certListSetter) {
        if (this.certList == null) {
            this.certList = new ArrayList<>();
        }
        certListSetter.accept(this.certList);
        return this;
    }

    /**
     * 证书列表。
     * @return certList
     */
    public List<CertItem> getCertList() {
        return certList;
    }

    public void setCertList(List<CertItem> certList) {
        this.certList = certList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCertsResponse that = (ListCertsResponse) obj;
        return Objects.equals(this.certList, that.certList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCertsResponse {\n");
        sb.append("    certList: ").append(toIndentedString(certList)).append("\n");
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
