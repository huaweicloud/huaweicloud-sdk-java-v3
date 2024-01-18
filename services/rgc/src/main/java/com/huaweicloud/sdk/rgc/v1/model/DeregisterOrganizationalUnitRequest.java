package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeregisterOrganizationalUnitRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_organization_unit_id")

    private String managedOrganizationUnitId;

    public DeregisterOrganizationalUnitRequest withManagedOrganizationUnitId(String managedOrganizationUnitId) {
        this.managedOrganizationUnitId = managedOrganizationUnitId;
        return this;
    }

    /**
     * 注册OU ID。
     * @return managedOrganizationUnitId
     */
    public String getManagedOrganizationUnitId() {
        return managedOrganizationUnitId;
    }

    public void setManagedOrganizationUnitId(String managedOrganizationUnitId) {
        this.managedOrganizationUnitId = managedOrganizationUnitId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeregisterOrganizationalUnitRequest that = (DeregisterOrganizationalUnitRequest) obj;
        return Objects.equals(this.managedOrganizationUnitId, that.managedOrganizationUnitId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(managedOrganizationUnitId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeregisterOrganizationalUnitRequest {\n");
        sb.append("    managedOrganizationUnitId: ").append(toIndentedString(managedOrganizationUnitId)).append("\n");
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
