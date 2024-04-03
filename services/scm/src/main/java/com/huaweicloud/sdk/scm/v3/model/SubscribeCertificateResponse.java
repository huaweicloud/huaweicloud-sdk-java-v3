package com.huaweicloud.sdk.scm.v3.model;

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
public class SubscribeCertificateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert")

    private List<CertDetail> cert = null;

    public SubscribeCertificateResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单号。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public SubscribeCertificateResponse withCert(List<CertDetail> cert) {
        this.cert = cert;
        return this;
    }

    public SubscribeCertificateResponse addCertItem(CertDetail certItem) {
        if (this.cert == null) {
            this.cert = new ArrayList<>();
        }
        this.cert.add(certItem);
        return this;
    }

    public SubscribeCertificateResponse withCert(Consumer<List<CertDetail>> certSetter) {
        if (this.cert == null) {
            this.cert = new ArrayList<>();
        }
        certSetter.accept(this.cert);
        return this;
    }

    /**
     * 证书列表，详情请参见CertDetail字段数据结构说明。
     * @return cert
     */
    public List<CertDetail> getCert() {
        return cert;
    }

    public void setCert(List<CertDetail> cert) {
        this.cert = cert;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubscribeCertificateResponse that = (SubscribeCertificateResponse) obj;
        return Objects.equals(this.orderId, that.orderId) && Objects.equals(this.cert, that.cert);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, cert);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscribeCertificateResponse {\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    cert: ").append(toIndentedString(cert)).append("\n");
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
