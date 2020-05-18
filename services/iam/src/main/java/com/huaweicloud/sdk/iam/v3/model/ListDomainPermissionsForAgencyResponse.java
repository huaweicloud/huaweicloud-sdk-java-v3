package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.RoleResult;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListDomainPermissionsForAgencyResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="roles")
    
    private List<RoleResult> roles = null;
    
    public ListDomainPermissionsForAgencyResponse withRoles(List<RoleResult> roles) {
        this.roles = roles;
        return this;
    }

    
    public ListDomainPermissionsForAgencyResponse addRolesItem(RoleResult rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    public ListDomainPermissionsForAgencyResponse withRoles(Consumer<List<RoleResult>> rolesSetter) {
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
        ListDomainPermissionsForAgencyResponse listDomainPermissionsForAgencyResponse = (ListDomainPermissionsForAgencyResponse) o;
        return Objects.equals(this.roles, listDomainPermissionsForAgencyResponse.roles);
    }
    @Override
    public int hashCode() {
        return Objects.hash(roles);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDomainPermissionsForAgencyResponse {\n");
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

