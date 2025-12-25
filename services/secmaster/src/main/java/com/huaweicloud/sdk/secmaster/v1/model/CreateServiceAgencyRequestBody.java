package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateServiceAgencyRequestBody
 */
public class CreateServiceAgencyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organizations")

    private List<Organization> organizations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_descriptions")

    private List<Role> roleDescriptions = null;

    public CreateServiceAgencyRequestBody withOrganizations(List<Organization> organizations) {
        this.organizations = organizations;
        return this;
    }

    public CreateServiceAgencyRequestBody addOrganizationsItem(Organization organizationsItem) {
        if (this.organizations == null) {
            this.organizations = new ArrayList<>();
        }
        this.organizations.add(organizationsItem);
        return this;
    }

    public CreateServiceAgencyRequestBody withOrganizations(Consumer<List<Organization>> organizationsSetter) {
        if (this.organizations == null) {
            this.organizations = new ArrayList<>();
        }
        organizationsSetter.accept(this.organizations);
        return this;
    }

    /**
     * OU列表
     * @return organizations
     */
    public List<Organization> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(List<Organization> organizations) {
        this.organizations = organizations;
    }

    public CreateServiceAgencyRequestBody withRoleDescriptions(List<Role> roleDescriptions) {
        this.roleDescriptions = roleDescriptions;
        return this;
    }

    public CreateServiceAgencyRequestBody addRoleDescriptionsItem(Role roleDescriptionsItem) {
        if (this.roleDescriptions == null) {
            this.roleDescriptions = new ArrayList<>();
        }
        this.roleDescriptions.add(roleDescriptionsItem);
        return this;
    }

    public CreateServiceAgencyRequestBody withRoleDescriptions(Consumer<List<Role>> roleDescriptionsSetter) {
        if (this.roleDescriptions == null) {
            this.roleDescriptions = new ArrayList<>();
        }
        roleDescriptionsSetter.accept(this.roleDescriptions);
        return this;
    }

    /**
     * 角色列表
     * @return roleDescriptions
     */
    public List<Role> getRoleDescriptions() {
        return roleDescriptions;
    }

    public void setRoleDescriptions(List<Role> roleDescriptions) {
        this.roleDescriptions = roleDescriptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateServiceAgencyRequestBody that = (CreateServiceAgencyRequestBody) obj;
        return Objects.equals(this.organizations, that.organizations)
            && Objects.equals(this.roleDescriptions, that.roleDescriptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizations, roleDescriptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateServiceAgencyRequestBody {\n");
        sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
        sb.append("    roleDescriptions: ").append(toIndentedString(roleDescriptions)).append("\n");
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
