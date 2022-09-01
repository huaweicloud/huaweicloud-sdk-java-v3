package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DisableCertificateAuthorityRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ca_id")

    @JacksonXmlProperty(localName = "ca_id")

    private String caId;

    public DisableCertificateAuthorityRequest withCaId(String caId) {
        this.caId = caId;
        return this;
    }

    /**
     * 所要禁用CA证书ID。
     * @return caId
     */
    public String getCaId() {
        return caId;
    }

    public void setCaId(String caId) {
        this.caId = caId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DisableCertificateAuthorityRequest disableCertificateAuthorityRequest = (DisableCertificateAuthorityRequest) o;
        return Objects.equals(this.caId, disableCertificateAuthorityRequest.caId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisableCertificateAuthorityRequest {\n");
        sb.append("    caId: ").append(toIndentedString(caId)).append("\n");
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
