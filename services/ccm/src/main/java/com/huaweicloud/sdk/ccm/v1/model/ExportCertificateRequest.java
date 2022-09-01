package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ExportCertificateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_id")

    @JacksonXmlProperty(localName = "certificate_id")

    private String certificateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private ExportCertificateRequestBody body;

    public ExportCertificateRequest withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /**
     * 所要导出的私有证书ID。
     * @return certificateId
     */
    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public ExportCertificateRequest withBody(ExportCertificateRequestBody body) {
        this.body = body;
        return this;
    }

    public ExportCertificateRequest withBody(Consumer<ExportCertificateRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ExportCertificateRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ExportCertificateRequestBody getBody() {
        return body;
    }

    public void setBody(ExportCertificateRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExportCertificateRequest exportCertificateRequest = (ExportCertificateRequest) o;
        return Objects.equals(this.certificateId, exportCertificateRequest.certificateId)
            && Objects.equals(this.body, exportCertificateRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificateId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportCertificateRequest {\n");
        sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
