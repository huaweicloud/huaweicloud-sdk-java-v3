package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowControlsForOrganizationalUnitRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_organizational_unit_id")

    private String managedOrganizationalUnitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control_id")

    private String controlId;

    public ShowControlsForOrganizationalUnitRequest withManagedOrganizationalUnitId(
        String managedOrganizationalUnitId) {
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

    public ShowControlsForOrganizationalUnitRequest withControlId(String controlId) {
        this.controlId = controlId;
        return this;
    }

    /**
     * 控制策略ID。
     * @return controlId
     */
    public String getControlId() {
        return controlId;
    }

    public void setControlId(String controlId) {
        this.controlId = controlId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowControlsForOrganizationalUnitRequest that = (ShowControlsForOrganizationalUnitRequest) obj;
        return Objects.equals(this.managedOrganizationalUnitId, that.managedOrganizationalUnitId)
            && Objects.equals(this.controlId, that.controlId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(managedOrganizationalUnitId, controlId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowControlsForOrganizationalUnitRequest {\n");
        sb.append("    managedOrganizationalUnitId: ")
            .append(toIndentedString(managedOrganizationalUnitId))
            .append("\n");
        sb.append("    controlId: ").append(toIndentedString(controlId)).append("\n");
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
