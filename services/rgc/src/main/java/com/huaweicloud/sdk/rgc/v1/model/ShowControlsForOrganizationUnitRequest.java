package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowControlsForOrganizationUnitRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_organization_unit_id")

    private String managedOrganizationUnitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control_id")

    private String controlId;

    public ShowControlsForOrganizationUnitRequest withManagedOrganizationUnitId(String managedOrganizationUnitId) {
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

    public ShowControlsForOrganizationUnitRequest withControlId(String controlId) {
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
        ShowControlsForOrganizationUnitRequest that = (ShowControlsForOrganizationUnitRequest) obj;
        return Objects.equals(this.managedOrganizationUnitId, that.managedOrganizationUnitId)
            && Objects.equals(this.controlId, that.controlId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(managedOrganizationUnitId, controlId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowControlsForOrganizationUnitRequest {\n");
        sb.append("    managedOrganizationUnitId: ").append(toIndentedString(managedOrganizationUnitId)).append("\n");
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
