package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchDisassociateDomainsV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_id")

    private String certificateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AttachOrDetachDomainsReqBody body;

    public BatchDisassociateDomainsV2Request withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /**
     * 证书的编号
     * @return certificateId
     */
    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public BatchDisassociateDomainsV2Request withBody(AttachOrDetachDomainsReqBody body) {
        this.body = body;
        return this;
    }

    public BatchDisassociateDomainsV2Request withBody(Consumer<AttachOrDetachDomainsReqBody> bodySetter) {
        if (this.body == null) {
            this.body = new AttachOrDetachDomainsReqBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AttachOrDetachDomainsReqBody getBody() {
        return body;
    }

    public void setBody(AttachOrDetachDomainsReqBody body) {
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
        BatchDisassociateDomainsV2Request batchDisassociateDomainsV2Request = (BatchDisassociateDomainsV2Request) o;
        return Objects.equals(this.certificateId, batchDisassociateDomainsV2Request.certificateId)
            && Objects.equals(this.body, batchDisassociateDomainsV2Request.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificateId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDisassociateDomainsV2Request {\n");
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
