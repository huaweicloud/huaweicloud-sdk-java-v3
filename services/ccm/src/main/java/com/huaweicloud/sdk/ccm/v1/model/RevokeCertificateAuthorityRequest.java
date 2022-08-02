package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class RevokeCertificateAuthorityRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ca_id")

    private String caId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private RevokeCertificateRequestBody body;

    public RevokeCertificateAuthorityRequest withCaId(String caId) {
        this.caId = caId;
        return this;
    }

    /**
     * 所要吊销的子CA ID。
     * @return caId
     */
    public String getCaId() {
        return caId;
    }

    public void setCaId(String caId) {
        this.caId = caId;
    }

    public RevokeCertificateAuthorityRequest withBody(RevokeCertificateRequestBody body) {
        this.body = body;
        return this;
    }

    public RevokeCertificateAuthorityRequest withBody(Consumer<RevokeCertificateRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new RevokeCertificateRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public RevokeCertificateRequestBody getBody() {
        return body;
    }

    public void setBody(RevokeCertificateRequestBody body) {
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
        RevokeCertificateAuthorityRequest revokeCertificateAuthorityRequest = (RevokeCertificateAuthorityRequest) o;
        return Objects.equals(this.caId, revokeCertificateAuthorityRequest.caId)
            && Objects.equals(this.body, revokeCertificateAuthorityRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RevokeCertificateAuthorityRequest {\n");
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
