package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListRolesForUserOnEnterpriseProjectResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roles")

    private List<RolesItem> roles = null;

    public ListRolesForUserOnEnterpriseProjectResponse withRoles(List<RolesItem> roles) {
        this.roles = roles;
        return this;
    }

    public ListRolesForUserOnEnterpriseProjectResponse addRolesItem(RolesItem rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    public ListRolesForUserOnEnterpriseProjectResponse withRoles(Consumer<List<RolesItem>> rolesSetter) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        rolesSetter.accept(this.roles);
        return this;
    }

    /** 角色列表。
     * 
     * @return roles */
    public List<RolesItem> getRoles() {
        return roles;
    }

    public void setRoles(List<RolesItem> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRolesForUserOnEnterpriseProjectResponse listRolesForUserOnEnterpriseProjectResponse =
            (ListRolesForUserOnEnterpriseProjectResponse) o;
        return Objects.equals(this.roles, listRolesForUserOnEnterpriseProjectResponse.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRolesForUserOnEnterpriseProjectResponse {\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
