package com.huaweicloud.sdk.ram.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * The request body of the DisassociateResourceSharePermission operation.
 */
public class DisassociatePermissionReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_id")

    private String permissionId;

    public DisassociatePermissionReqBody withPermissionId(String permissionId) {
        this.permissionId = permissionId;
        return this;
    }

    /**
     * 共享资源权限的ID。
     * @return permissionId
     */
    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DisassociatePermissionReqBody disassociatePermissionReqBody = (DisassociatePermissionReqBody) o;
        return Objects.equals(this.permissionId, disassociatePermissionReqBody.permissionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociatePermissionReqBody {\n");
        sb.append("    permissionId: ").append(toIndentedString(permissionId)).append("\n");
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
