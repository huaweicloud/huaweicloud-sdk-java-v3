package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ProvisionPermissionSetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_set_provisioning_status")

    private PermissionSetProvisioningStatusDto permissionSetProvisioningStatus;

    public ProvisionPermissionSetResponse withPermissionSetProvisioningStatus(
        PermissionSetProvisioningStatusDto permissionSetProvisioningStatus) {
        this.permissionSetProvisioningStatus = permissionSetProvisioningStatus;
        return this;
    }

    public ProvisionPermissionSetResponse withPermissionSetProvisioningStatus(
        Consumer<PermissionSetProvisioningStatusDto> permissionSetProvisioningStatusSetter) {
        if (this.permissionSetProvisioningStatus == null) {
            this.permissionSetProvisioningStatus = new PermissionSetProvisioningStatusDto();
            permissionSetProvisioningStatusSetter.accept(this.permissionSetProvisioningStatus);
        }

        return this;
    }

    /**
     * Get permissionSetProvisioningStatus
     * @return permissionSetProvisioningStatus
     */
    public PermissionSetProvisioningStatusDto getPermissionSetProvisioningStatus() {
        return permissionSetProvisioningStatus;
    }

    public void setPermissionSetProvisioningStatus(PermissionSetProvisioningStatusDto permissionSetProvisioningStatus) {
        this.permissionSetProvisioningStatus = permissionSetProvisioningStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProvisionPermissionSetResponse that = (ProvisionPermissionSetResponse) obj;
        return Objects.equals(this.permissionSetProvisioningStatus, that.permissionSetProvisioningStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissionSetProvisioningStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProvisionPermissionSetResponse {\n");
        sb.append("    permissionSetProvisioningStatus: ")
            .append(toIndentedString(permissionSetProvisioningStatus))
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
