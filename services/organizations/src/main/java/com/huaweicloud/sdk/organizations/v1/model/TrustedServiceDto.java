package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 包含可信服务详细信息的结构，可信服务表示已启用与组织集成的服务。
 */
public class TrustedServiceDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_principal")

    private String servicePrincipal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled_at")

    private OffsetDateTime enabledAt;

    public TrustedServiceDto withServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
        return this;
    }

    /**
     * 可信服务的名称。
     * @return servicePrincipal
     */
    public String getServicePrincipal() {
        return servicePrincipal;
    }

    public void setServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
    }

    public TrustedServiceDto withEnabledAt(OffsetDateTime enabledAt) {
        this.enabledAt = enabledAt;
        return this;
    }

    /**
     * 可信服务与组织集成的日期。
     * @return enabledAt
     */
    public OffsetDateTime getEnabledAt() {
        return enabledAt;
    }

    public void setEnabledAt(OffsetDateTime enabledAt) {
        this.enabledAt = enabledAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrustedServiceDto that = (TrustedServiceDto) obj;
        return Objects.equals(this.servicePrincipal, that.servicePrincipal)
            && Objects.equals(this.enabledAt, that.enabledAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(servicePrincipal, enabledAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrustedServiceDto {\n");
        sb.append("    servicePrincipal: ").append(toIndentedString(servicePrincipal)).append("\n");
        sb.append("    enabledAt: ").append(toIndentedString(enabledAt)).append("\n");
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
