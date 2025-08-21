package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteTenantTrustedIpAddressRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_id")

    private Integer ipId;

    public DeleteTenantTrustedIpAddressRequest withIpId(Integer ipId) {
        this.ipId = ipId;
        return this;
    }

    /**
     * **参数解释：** ip白名单id。
     * minimum: 1
     * maximum: 2147483647
     * @return ipId
     */
    public Integer getIpId() {
        return ipId;
    }

    public void setIpId(Integer ipId) {
        this.ipId = ipId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteTenantTrustedIpAddressRequest that = (DeleteTenantTrustedIpAddressRequest) obj;
        return Objects.equals(this.ipId, that.ipId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteTenantTrustedIpAddressRequest {\n");
        sb.append("    ipId: ").append(toIndentedString(ipId)).append("\n");
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
