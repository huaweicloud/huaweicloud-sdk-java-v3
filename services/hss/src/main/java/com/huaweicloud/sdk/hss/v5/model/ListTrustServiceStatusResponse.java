package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListTrustServiceStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trusted_services_enabled")

    private Boolean trustedServicesEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListTrustServiceStatusResponse withTrustedServicesEnabled(Boolean trustedServicesEnabled) {
        this.trustedServicesEnabled = trustedServicesEnabled;
        return this;
    }

    /**
     * xxx
     * @return trustedServicesEnabled
     */
    public Boolean getTrustedServicesEnabled() {
        return trustedServicesEnabled;
    }

    public void setTrustedServicesEnabled(Boolean trustedServicesEnabled) {
        this.trustedServicesEnabled = trustedServicesEnabled;
    }

    public ListTrustServiceStatusResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTrustServiceStatusResponse that = (ListTrustServiceStatusResponse) obj;
        return Objects.equals(this.trustedServicesEnabled, that.trustedServicesEnabled)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trustedServicesEnabled, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTrustServiceStatusResponse {\n");
        sb.append("    trustedServicesEnabled: ").append(toIndentedString(trustedServicesEnabled)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
