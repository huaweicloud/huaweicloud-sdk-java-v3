package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeregisterOrganizationalUnitRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_organizational_unit_id")

    private String managedOrganizationalUnitId;

    public DeregisterOrganizationalUnitRequest withManagedOrganizationalUnitId(String managedOrganizationalUnitId) {
        this.managedOrganizationalUnitId = managedOrganizationalUnitId;
        return this;
    }

    /**
     * 注册OU ID。
     * @return managedOrganizationalUnitId
     */
    public String getManagedOrganizationalUnitId() {
        return managedOrganizationalUnitId;
    }

    public void setManagedOrganizationalUnitId(String managedOrganizationalUnitId) {
        this.managedOrganizationalUnitId = managedOrganizationalUnitId;
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
        return Objects.equals(this.managedOrganizationalUnitId, that.managedOrganizationalUnitId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(managedOrganizationalUnitId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeregisterOrganizationalUnitRequest {\n");
        sb.append("    managedOrganizationalUnitId: ")
            .append(toIndentedString(managedOrganizationalUnitId))
            .append("\n");
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
