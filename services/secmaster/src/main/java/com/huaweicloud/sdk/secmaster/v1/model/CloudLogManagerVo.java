package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CloudLogManagerVo
 */
public class CloudLogManagerVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_managed_domain_id")

    private String tenantManagedDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform_managed_domain_id")

    private String platformManagedDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_region")

    private String dwRegion;

    public CloudLogManagerVo withTenantManagedDomainId(String tenantManagedDomainId) {
        this.tenantManagedDomainId = tenantManagedDomainId;
        return this;
    }

    /**
     * 租户行管id
     * @return tenantManagedDomainId
     */
    public String getTenantManagedDomainId() {
        return tenantManagedDomainId;
    }

    public void setTenantManagedDomainId(String tenantManagedDomainId) {
        this.tenantManagedDomainId = tenantManagedDomainId;
    }

    public CloudLogManagerVo withPlatformManagedDomainId(String platformManagedDomainId) {
        this.platformManagedDomainId = platformManagedDomainId;
        return this;
    }

    /**
     * 平台行管id
     * @return platformManagedDomainId
     */
    public String getPlatformManagedDomainId() {
        return platformManagedDomainId;
    }

    public void setPlatformManagedDomainId(String platformManagedDomainId) {
        this.platformManagedDomainId = platformManagedDomainId;
    }

    public CloudLogManagerVo withDwRegion(String dwRegion) {
        this.dwRegion = dwRegion;
        return this;
    }

    /**
     * regionId
     * @return dwRegion
     */
    public String getDwRegion() {
        return dwRegion;
    }

    public void setDwRegion(String dwRegion) {
        this.dwRegion = dwRegion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloudLogManagerVo that = (CloudLogManagerVo) obj;
        return Objects.equals(this.tenantManagedDomainId, that.tenantManagedDomainId)
            && Objects.equals(this.platformManagedDomainId, that.platformManagedDomainId)
            && Objects.equals(this.dwRegion, that.dwRegion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenantManagedDomainId, platformManagedDomainId, dwRegion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudLogManagerVo {\n");
        sb.append("    tenantManagedDomainId: ").append(toIndentedString(tenantManagedDomainId)).append("\n");
        sb.append("    platformManagedDomainId: ").append(toIndentedString(platformManagedDomainId)).append("\n");
        sb.append("    dwRegion: ").append(toIndentedString(dwRegion)).append("\n");
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
