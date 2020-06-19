package com.huaweicloud.sdk.iam.v3.model;


import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.Links;
import com.huaweicloud.sdk.iam.v3.model.PolicyRoleResult;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListCustomPoliciesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private Links links = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="roles")
    
    private List<PolicyRoleResult> roles = null;
    
    public ListCustomPoliciesResponse withLinks(Links links) {
        this.links = links;
        return this;
    }

    public ListCustomPoliciesResponse withLinks(Consumer<Links> linksSetter) {
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

    public ListCustomPoliciesResponse withRoles(List<PolicyRoleResult> roles) {
        this.roles = roles;
        return this;
    }

    
    public ListCustomPoliciesResponse addRolesItem(PolicyRoleResult rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    public ListCustomPoliciesResponse withRoles(Consumer<List<PolicyRoleResult>> rolesSetter) {
        if(this.roles == null ){
            this.roles = new ArrayList<>();
        }
        rolesSetter.accept(this.roles);
        return this;
    }

    /**
     * 自定义策略信息列表。
     * @return roles
     */
    public List<PolicyRoleResult> getRoles() {
        return roles;
    }

    public void setRoles(List<PolicyRoleResult> roles) {
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
        ListCustomPoliciesResponse listCustomPoliciesResponse = (ListCustomPoliciesResponse) o;
        return Objects.equals(this.links, listCustomPoliciesResponse.links) &&
            Objects.equals(this.roles, listCustomPoliciesResponse.roles);
    }
    @Override
    public int hashCode() {
        return Objects.hash(links, roles);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomPoliciesResponse {\n");
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

