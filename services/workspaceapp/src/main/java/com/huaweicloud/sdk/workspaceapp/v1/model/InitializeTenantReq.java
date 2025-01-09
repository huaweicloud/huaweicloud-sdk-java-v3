package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 租户信息配置。
 */
public class InitializeTenantReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_status")

    private String serviceStatus;

    public InitializeTenantReq withServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }

    /**
     * 服务状态 * `active` - 激活 * `inactive` - 未激活
     * @return serviceStatus
     */
    public String getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InitializeTenantReq that = (InitializeTenantReq) obj;
        return Objects.equals(this.serviceStatus, that.serviceStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InitializeTenantReq {\n");
        sb.append("    serviceStatus: ").append(toIndentedString(serviceStatus)).append("\n");
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
