package com.huaweicloud.sdk.apig.v2.model;

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
public class ListCertificatesV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certs")

    private List<CertBase> certs = null;

    public ListCertificatesV2Response withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 本次返回的列表长度
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListCertificatesV2Response withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 满足条件的记录数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListCertificatesV2Response withCerts(List<CertBase> certs) {
        this.certs = certs;
        return this;
    }

    public ListCertificatesV2Response addCertsItem(CertBase certsItem) {
        if (this.certs == null) {
            this.certs = new ArrayList<>();
        }
        this.certs.add(certsItem);
        return this;
    }

    public ListCertificatesV2Response withCerts(Consumer<List<CertBase>> certsSetter) {
        if (this.certs == null) {
            this.certs = new ArrayList<>();
        }
        certsSetter.accept(this.certs);
        return this;
    }

    /**
     * 证书基本内容
     * @return certs
     */
    public List<CertBase> getCerts() {
        return certs;
    }

    public void setCerts(List<CertBase> certs) {
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
        ListCertificatesV2Response that = (ListCertificatesV2Response) obj;
        return Objects.equals(this.size, that.size) && Objects.equals(this.total, that.total)
            && Objects.equals(this.certs, that.certs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, total, certs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCertificatesV2Response {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
