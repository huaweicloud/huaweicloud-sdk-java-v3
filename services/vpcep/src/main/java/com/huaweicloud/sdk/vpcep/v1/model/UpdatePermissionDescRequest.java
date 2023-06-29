package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新终端节点服务白名单描述
 */
public class UpdatePermissionDescRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission")

    private EpsUpdatePermissionDesc permission;

    public UpdatePermissionDescRequest withPermission(EpsUpdatePermissionDesc permission) {
        this.permission = permission;
        return this;
    }

    public UpdatePermissionDescRequest withPermission(Consumer<EpsUpdatePermissionDesc> permissionSetter) {
        if (this.permission == null) {
            this.permission = new EpsUpdatePermissionDesc();
            permissionSetter.accept(this.permission);
        }

        return this;
    }

    /**
     * Get permission
     * @return permission
     */
    public EpsUpdatePermissionDesc getPermission() {
        return permission;
    }

    public void setPermission(EpsUpdatePermissionDesc permission) {
        this.permission = permission;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePermissionDescRequest that = (UpdatePermissionDescRequest) obj;
        return Objects.equals(this.permission, that.permission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permission);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePermissionDescRequest {\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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
