package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListProvisioningTenantsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provisioning_tenants")

    private List<ProvisioningTenant> provisioningTenants = null;

    public ListProvisioningTenantsResponse withProvisioningTenants(List<ProvisioningTenant> provisioningTenants) {
        this.provisioningTenants = provisioningTenants;
        return this;
    }

    public ListProvisioningTenantsResponse addProvisioningTenantsItem(ProvisioningTenant provisioningTenantsItem) {
        if (this.provisioningTenants == null) {
            this.provisioningTenants = new ArrayList<>();
        }
        this.provisioningTenants.add(provisioningTenantsItem);
        return this;
    }

    public ListProvisioningTenantsResponse withProvisioningTenants(
        Consumer<List<ProvisioningTenant>> provisioningTenantsSetter) {
        if (this.provisioningTenants == null) {
            this.provisioningTenants = new ArrayList<>();
        }
        provisioningTenantsSetter.accept(this.provisioningTenants);
        return this;
    }

    /**
     * SCIM自动预配配置信息
     * @return provisioningTenants
     */
    public List<ProvisioningTenant> getProvisioningTenants() {
        return provisioningTenants;
    }

    public void setProvisioningTenants(List<ProvisioningTenant> provisioningTenants) {
        this.provisioningTenants = provisioningTenants;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListProvisioningTenantsResponse that = (ListProvisioningTenantsResponse) obj;
        return Objects.equals(this.provisioningTenants, that.provisioningTenants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provisioningTenants);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProvisioningTenantsResponse {\n");
        sb.append("    provisioningTenants: ").append(toIndentedString(provisioningTenants)).append("\n");
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
