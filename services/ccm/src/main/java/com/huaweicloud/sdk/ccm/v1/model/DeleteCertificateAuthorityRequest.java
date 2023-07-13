package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteCertificateAuthorityRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ca_id")

    private String caId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pending_days")

    private String pendingDays;

    public DeleteCertificateAuthorityRequest withCaId(String caId) {
        this.caId = caId;
        return this;
    }

    /**
     * 所要计划删除的CA证书ID。
     * @return caId
     */
    public String getCaId() {
        return caId;
    }

    public void setCaId(String caId) {
        this.caId = caId;
    }

    public DeleteCertificateAuthorityRequest withPendingDays(String pendingDays) {
        this.pendingDays = pendingDays;
        return this;
    }

    /**
     * 延迟删除时间，单位为”天“。
     * @return pendingDays
     */
    public String getPendingDays() {
        return pendingDays;
    }

    public void setPendingDays(String pendingDays) {
        this.pendingDays = pendingDays;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteCertificateAuthorityRequest that = (DeleteCertificateAuthorityRequest) obj;
        return Objects.equals(this.caId, that.caId) && Objects.equals(this.pendingDays, that.pendingDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caId, pendingDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteCertificateAuthorityRequest {\n");
        sb.append("    caId: ").append(toIndentedString(caId)).append("\n");
        sb.append("    pendingDays: ").append(toIndentedString(pendingDays)).append("\n");
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
