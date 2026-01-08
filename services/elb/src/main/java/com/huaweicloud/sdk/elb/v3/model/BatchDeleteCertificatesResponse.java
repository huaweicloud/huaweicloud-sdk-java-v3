package com.huaweicloud.sdk.elb.v3.model;

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
public class BatchDeleteCertificatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificates")

    private List<BatchDeleteCertificatesResp> certificates = null;

    public BatchDeleteCertificatesResponse withCertificates(List<BatchDeleteCertificatesResp> certificates) {
        this.certificates = certificates;
        return this;
    }

    public BatchDeleteCertificatesResponse addCertificatesItem(BatchDeleteCertificatesResp certificatesItem) {
        if (this.certificates == null) {
            this.certificates = new ArrayList<>();
        }
        this.certificates.add(certificatesItem);
        return this;
    }

    public BatchDeleteCertificatesResponse withCertificates(
        Consumer<List<BatchDeleteCertificatesResp>> certificatesSetter) {
        if (this.certificates == null) {
            this.certificates = new ArrayList<>();
        }
        certificatesSetter.accept(this.certificates);
        return this;
    }

    /**
     * 证书批量删除后的响应结果。
     * @return certificates
     */
    public List<BatchDeleteCertificatesResp> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<BatchDeleteCertificatesResp> certificates) {
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
        BatchDeleteCertificatesResponse that = (BatchDeleteCertificatesResponse) obj;
        return Objects.equals(this.certificates, that.certificates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteCertificatesResponse {\n");
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
