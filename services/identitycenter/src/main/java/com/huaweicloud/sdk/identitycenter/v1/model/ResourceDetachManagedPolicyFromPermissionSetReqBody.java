package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DetachManagedPolicyFromPermissionSetReqBody请求体
 */
public class ResourceDetachManagedPolicyFromPermissionSetReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_role_id")

    private String managedRoleId;

    public ResourceDetachManagedPolicyFromPermissionSetReqBody withManagedRoleId(String managedRoleId) {
        this.managedRoleId = managedRoleId;
        return this;
    }

    /**
     * IAM系统策略唯一标识
     * @return managedRoleId
     */
    public String getManagedRoleId() {
        return managedRoleId;
    }

    public void setManagedRoleId(String managedRoleId) {
        this.managedRoleId = managedRoleId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceDetachManagedPolicyFromPermissionSetReqBody that =
            (ResourceDetachManagedPolicyFromPermissionSetReqBody) obj;
        return Objects.equals(this.managedRoleId, that.managedRoleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(managedRoleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceDetachManagedPolicyFromPermissionSetReqBody {\n");
        sb.append("    managedRoleId: ").append(toIndentedString(managedRoleId)).append("\n");
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
