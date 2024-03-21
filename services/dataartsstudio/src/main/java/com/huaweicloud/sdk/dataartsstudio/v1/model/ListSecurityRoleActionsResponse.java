package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSecurityRoleActionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_actions")

    private List<PermissionActions> permissionActions = null;

    public ListSecurityRoleActionsResponse withPermissionActions(List<PermissionActions> permissionActions) {
        this.permissionActions = permissionActions;
        return this;
    }

    public ListSecurityRoleActionsResponse addPermissionActionsItem(PermissionActions permissionActionsItem) {
        if (this.permissionActions == null) {
            this.permissionActions = new ArrayList<>();
        }
        this.permissionActions.add(permissionActionsItem);
        return this;
    }

    public ListSecurityRoleActionsResponse withPermissionActions(
        Consumer<List<PermissionActions>> permissionActionsSetter) {
        if (this.permissionActions == null) {
            this.permissionActions = new ArrayList<>();
        }
        permissionActionsSetter.accept(this.permissionActions);
        return this;
    }

    /**
     * 权限操作列表
     * @return permissionActions
     */
    public List<PermissionActions> getPermissionActions() {
        return permissionActions;
    }

    public void setPermissionActions(List<PermissionActions> permissionActions) {
        this.permissionActions = permissionActions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSecurityRoleActionsResponse that = (ListSecurityRoleActionsResponse) obj;
        return Objects.equals(this.permissionActions, that.permissionActions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissionActions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityRoleActionsResponse {\n");
        sb.append("    permissionActions: ").append(toIndentedString(permissionActions)).append("\n");
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
