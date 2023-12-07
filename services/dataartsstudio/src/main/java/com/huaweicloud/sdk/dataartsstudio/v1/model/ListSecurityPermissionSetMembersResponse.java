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
public class ListSecurityPermissionSetMembersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_set_members")

    private List<PermissionSetMember> permissionSetMembers = null;

    public ListSecurityPermissionSetMembersResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总条数
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListSecurityPermissionSetMembersResponse withPermissionSetMembers(
        List<PermissionSetMember> permissionSetMembers) {
        this.permissionSetMembers = permissionSetMembers;
        return this;
    }

    public ListSecurityPermissionSetMembersResponse addPermissionSetMembersItem(
        PermissionSetMember permissionSetMembersItem) {
        if (this.permissionSetMembers == null) {
            this.permissionSetMembers = new ArrayList<>();
        }
        this.permissionSetMembers.add(permissionSetMembersItem);
        return this;
    }

    public ListSecurityPermissionSetMembersResponse withPermissionSetMembers(
        Consumer<List<PermissionSetMember>> permissionSetMembersSetter) {
        if (this.permissionSetMembers == null) {
            this.permissionSetMembers = new ArrayList<>();
        }
        permissionSetMembersSetter.accept(this.permissionSetMembers);
        return this;
    }

    /**
     * 成员列表
     * @return permissionSetMembers
     */
    public List<PermissionSetMember> getPermissionSetMembers() {
        return permissionSetMembers;
    }

    public void setPermissionSetMembers(List<PermissionSetMember> permissionSetMembers) {
        this.permissionSetMembers = permissionSetMembers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSecurityPermissionSetMembersResponse that = (ListSecurityPermissionSetMembersResponse) obj;
        return Objects.equals(this.total, that.total)
            && Objects.equals(this.permissionSetMembers, that.permissionSetMembers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, permissionSetMembers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityPermissionSetMembersResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    permissionSetMembers: ").append(toIndentedString(permissionSetMembers)).append("\n");
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
