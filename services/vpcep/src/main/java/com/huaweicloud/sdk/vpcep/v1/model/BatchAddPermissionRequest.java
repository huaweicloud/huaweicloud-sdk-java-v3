package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量添加终端节点服务白名单列表。
 */
public class BatchAddPermissionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permissions")

    private List<EpsAddPermissionRequest> permissions = null;

    public BatchAddPermissionRequest withPermissions(List<EpsAddPermissionRequest> permissions) {
        this.permissions = permissions;
        return this;
    }

    public BatchAddPermissionRequest addPermissionsItem(EpsAddPermissionRequest permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    public BatchAddPermissionRequest withPermissions(Consumer<List<EpsAddPermissionRequest>> permissionsSetter) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        permissionsSetter.accept(this.permissions);
        return this;
    }

    /**
     * 终端节点服务白名单列表
     * @return permissions
     */
    public List<EpsAddPermissionRequest> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<EpsAddPermissionRequest> permissions) {
        this.permissions = permissions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchAddPermissionRequest batchAddPermissionRequest = (BatchAddPermissionRequest) o;
        return Objects.equals(this.permissions, batchAddPermissionRequest.permissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAddPermissionRequest {\n");
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
