package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 包含有关帐号是可信服务委托管理员的信息。
 */
public class DelegatedServiceDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_principal")

    private String servicePrincipal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delegation_enabled_at")

    private OffsetDateTime delegationEnabledAt;

    public DelegatedServiceDto withServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
        return this;
    }

    /**
     * 服务主体的名称。
     * @return servicePrincipal
     */
    public String getServicePrincipal() {
        return servicePrincipal;
    }

    public void setServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
    }

    public DelegatedServiceDto withDelegationEnabledAt(OffsetDateTime delegationEnabledAt) {
        this.delegationEnabledAt = delegationEnabledAt;
        return this;
    }

    /**
     * 帐号成为此服务的委托管理员的日期。
     * @return delegationEnabledAt
     */
    public OffsetDateTime getDelegationEnabledAt() {
        return delegationEnabledAt;
    }

    public void setDelegationEnabledAt(OffsetDateTime delegationEnabledAt) {
        this.delegationEnabledAt = delegationEnabledAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DelegatedServiceDto that = (DelegatedServiceDto) obj;
        return Objects.equals(this.servicePrincipal, that.servicePrincipal)
            && Objects.equals(this.delegationEnabledAt, that.delegationEnabledAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(servicePrincipal, delegationEnabledAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DelegatedServiceDto {\n");
        sb.append("    servicePrincipal: ").append(toIndentedString(servicePrincipal)).append("\n");
        sb.append("    delegationEnabledAt: ").append(toIndentedString(delegationEnabledAt)).append("\n");
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
