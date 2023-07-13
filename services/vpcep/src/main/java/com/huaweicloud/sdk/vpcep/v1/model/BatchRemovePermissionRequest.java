package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量删除终端节点服务白名单列表。
 */
public class BatchRemovePermissionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permissions")

    private List<EpsRemovePermissionRequest> permissions = null;

    public BatchRemovePermissionRequest withPermissions(List<EpsRemovePermissionRequest> permissions) {
        this.permissions = permissions;
        return this;
    }

    public BatchRemovePermissionRequest addPermissionsItem(EpsRemovePermissionRequest permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    public BatchRemovePermissionRequest withPermissions(Consumer<List<EpsRemovePermissionRequest>> permissionsSetter) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        permissionsSetter.accept(this.permissions);
        return this;
    }

    /**
     * Get permissions
     * @return permissions
     */
    public List<EpsRemovePermissionRequest> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<EpsRemovePermissionRequest> permissions) {
        this.permissions = permissions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchRemovePermissionRequest that = (BatchRemovePermissionRequest) obj;
        return Objects.equals(this.permissions, that.permissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRemovePermissionRequest {\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
