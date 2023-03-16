package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 可信服务相关操作的请求体。
 */
public class TrustedServiceReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_principal")

    private String servicePrincipal;

    public TrustedServiceReqBody withServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
        return this;
    }

    /**
     * 服务主体名称。
     * @return servicePrincipal
     */
    public String getServicePrincipal() {
        return servicePrincipal;
    }

    public void setServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TrustedServiceReqBody trustedServiceReqBody = (TrustedServiceReqBody) o;
        return Objects.equals(this.servicePrincipal, trustedServiceReqBody.servicePrincipal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(servicePrincipal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrustedServiceReqBody {\n");
        sb.append("    servicePrincipal: ").append(toIndentedString(servicePrincipal)).append("\n");
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
