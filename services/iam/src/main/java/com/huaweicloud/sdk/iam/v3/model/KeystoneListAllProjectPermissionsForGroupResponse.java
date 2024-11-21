package com.huaweicloud.sdk.iam.v3.model;

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
public class KeystoneListAllProjectPermissionsForGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private Links links;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roles")

    private List<InheritedRoleResult> roles = null;

    public KeystoneListAllProjectPermissionsForGroupResponse withLinks(Links links) {
        this.links = links;
        return this;
    }

    public KeystoneListAllProjectPermissionsForGroupResponse withLinks(Consumer<Links> linksSetter) {
        if (this.links == null) {
            this.links = new Links();
            linksSetter.accept(this.links);
        }

        return this;
    }

    /**
     * Get links
     * @return links
     */
    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public KeystoneListAllProjectPermissionsForGroupResponse withRoles(List<InheritedRoleResult> roles) {
        this.roles = roles;
        return this;
    }

    public KeystoneListAllProjectPermissionsForGroupResponse addRolesItem(InheritedRoleResult rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    public KeystoneListAllProjectPermissionsForGroupResponse withRoles(
        Consumer<List<InheritedRoleResult>> rolesSetter) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        rolesSetter.accept(this.roles);
        return this;
    }

    /**
     * 权限信息列表。
     * @return roles
     */
    public List<InheritedRoleResult> getRoles() {
        return roles;
    }

    public void setRoles(List<InheritedRoleResult> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KeystoneListAllProjectPermissionsForGroupResponse that =
            (KeystoneListAllProjectPermissionsForGroupResponse) obj;
        return Objects.equals(this.links, that.links) && Objects.equals(this.roles, that.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(links, roles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneListAllProjectPermissionsForGroupResponse {\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
