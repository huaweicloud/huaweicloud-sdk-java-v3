package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** RevokeCertificateRequestBody */
public class RevokeCertificateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_id")

    private String certId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    public RevokeCertificateRequestBody withCertId(String certId) {
        this.certId = certId;
        return this;
    }

    /** 证书ID
     * 
     * @return certId */
    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public RevokeCertificateRequestBody withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /** 吊销理由
     * 
     * @return reason */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RevokeCertificateRequestBody revokeCertificateRequestBody = (RevokeCertificateRequestBody) o;
        return Objects.equals(this.certId, revokeCertificateRequestBody.certId)
            && Objects.equals(this.reason, revokeCertificateRequestBody.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certId, reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RevokeCertificateRequestBody {\n");
        sb.append("    certId: ").append(toIndentedString(certId)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
