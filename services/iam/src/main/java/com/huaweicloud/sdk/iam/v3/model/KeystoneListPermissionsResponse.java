package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.Links;
import com.huaweicloud.sdk.iam.v3.model.RoleResult;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class KeystoneListPermissionsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private Links links = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="roles")
    
    private List<RoleResult> roles = null;
    
    public KeystoneListPermissionsResponse withLinks(Links links) {
        this.links = links;
        return this;
    }

    public KeystoneListPermissionsResponse withLinks(Consumer<Links> linksSetter) {
        if(this.links == null ){
            this.links = new Links();
        }
        linksSetter.accept(this.links);
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

    public KeystoneListPermissionsResponse withRoles(List<RoleResult> roles) {
        this.roles = roles;
        return this;
    }

    
    public KeystoneListPermissionsResponse addRolesItem(RoleResult rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    public KeystoneListPermissionsResponse withRoles(Consumer<List<RoleResult>> rolesSetter) {
        if(this.roles == null ){
            this.roles = new ArrayList<>();
        }
        rolesSetter.accept(this.roles);
        return this;
    }

    /**
     * 权限信息列表。
     * @return roles
     */
    public List<RoleResult> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleResult> roles) {
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
        KeystoneListPermissionsResponse keystoneListPermissionsResponse = (KeystoneListPermissionsResponse) o;
        return Objects.equals(this.links, keystoneListPermissionsResponse.links) &&
            Objects.equals(this.roles, keystoneListPermissionsResponse.roles);
    }
    @Override
    public int hashCode() {
        return Objects.hash(links, roles);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneListPermissionsResponse {\n");
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

