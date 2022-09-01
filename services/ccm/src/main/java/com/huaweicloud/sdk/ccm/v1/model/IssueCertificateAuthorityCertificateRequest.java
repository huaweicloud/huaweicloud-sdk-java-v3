package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class IssueCertificateAuthorityCertificateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ca_id")

    @JacksonXmlProperty(localName = "ca_id")

    private String caId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private IssueCertificateAuthorityCertificateRequestBody body;

    public IssueCertificateAuthorityCertificateRequest withCaId(String caId) {
        this.caId = caId;
        return this;
    }

    /**
     * 所要激活的从属CA证书ID。
     * @return caId
     */
    public String getCaId() {
        return caId;
    }

    public void setCaId(String caId) {
        this.caId = caId;
    }

    public IssueCertificateAuthorityCertificateRequest withBody(IssueCertificateAuthorityCertificateRequestBody body) {
        this.body = body;
        return this;
    }

    public IssueCertificateAuthorityCertificateRequest withBody(
        Consumer<IssueCertificateAuthorityCertificateRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new IssueCertificateAuthorityCertificateRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public IssueCertificateAuthorityCertificateRequestBody getBody() {
        return body;
    }

    public void setBody(IssueCertificateAuthorityCertificateRequestBody body) {
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
        IssueCertificateAuthorityCertificateRequest issueCertificateAuthorityCertificateRequest =
            (IssueCertificateAuthorityCertificateRequest) o;
        return Objects.equals(this.caId, issueCertificateAuthorityCertificateRequest.caId)
            && Objects.equals(this.body, issueCertificateAuthorityCertificateRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueCertificateAuthorityCertificateRequest {\n");
        sb.append("    caId: ").append(toIndentedString(caId)).append("\n");
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
