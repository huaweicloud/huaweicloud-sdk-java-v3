package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DownloadHttpSignCertRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_id")

    private String certificateId;

    public DownloadHttpSignCertRequest withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /**
     * 证书文件ID名称，格式为SMN-{RegionID}-{UUID}.pem
     * @return certificateId
     */
    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadHttpSignCertRequest that = (DownloadHttpSignCertRequest) obj;
        return Objects.equals(this.certificateId, that.certificateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificateId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadHttpSignCertRequest {\n");
        sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
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
