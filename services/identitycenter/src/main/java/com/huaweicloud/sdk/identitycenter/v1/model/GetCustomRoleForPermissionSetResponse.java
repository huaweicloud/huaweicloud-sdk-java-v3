package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class GetCustomRoleForPermissionSetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_role")

    private String customRole;

    public GetCustomRoleForPermissionSetResponse withCustomRole(String customRole) {
        this.customRole = customRole;
        return this;
    }

    /**
     * 附加到权限集的自定义策略
     * @return customRole
     */
    public String getCustomRole() {
        return customRole;
    }

    public void setCustomRole(String customRole) {
        this.customRole = customRole;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetCustomRoleForPermissionSetResponse that = (GetCustomRoleForPermissionSetResponse) obj;
        return Objects.equals(this.customRole, that.customRole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customRole);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetCustomRoleForPermissionSetResponse {\n");
        sb.append("    customRole: ").append(toIndentedString(customRole)).append("\n");
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
