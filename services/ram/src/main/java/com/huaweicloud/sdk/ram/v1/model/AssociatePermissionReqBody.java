package com.huaweicloud.sdk.ram.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * The request body of the AssociateResourceSharePermission operation.
 */
public class AssociatePermissionReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_id")

    private String permissionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replace")

    private Boolean replace;

    public AssociatePermissionReqBody withPermissionId(String permissionId) {
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

    public AssociatePermissionReqBody withReplace(Boolean replace) {
        this.replace = replace;
        return this;
    }

    /**
     * 指定特定的权限替换或绑定到与资源共享实例关联的现有资源类型。设置为\"true\"可将相同的资源类型的权限替换为当前权限。设置为\"false\"将权限绑定到当前资源类型。默认值为\"false\"。资源共享实例中的每个资源类型只能绑定一个权限。如果资源共享实例中已具有指定资源类型的权限，并且将\"replace\"设置为\"false\"，则操作返回错误。这有助于防止意外覆盖权限。
     * @return replace
     */
    public Boolean getReplace() {
        return replace;
    }

    public void setReplace(Boolean replace) {
        this.replace = replace;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssociatePermissionReqBody associatePermissionReqBody = (AssociatePermissionReqBody) o;
        return Objects.equals(this.permissionId, associatePermissionReqBody.permissionId)
            && Objects.equals(this.replace, associatePermissionReqBody.replace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissionId, replace);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociatePermissionReqBody {\n");
        sb.append("    permissionId: ").append(toIndentedString(permissionId)).append("\n");
        sb.append("    replace: ").append(toIndentedString(replace)).append("\n");
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
