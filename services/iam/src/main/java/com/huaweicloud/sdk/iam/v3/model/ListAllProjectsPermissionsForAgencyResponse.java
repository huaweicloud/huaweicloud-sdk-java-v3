package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAllProjectsPermissionsForAgencyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roles")

    @JacksonXmlProperty(localName = "roles")

    private List<AgencyAllProjectRole> roles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    @JacksonXmlProperty(localName = "links")

    private LinksSelf links;

    public ListAllProjectsPermissionsForAgencyResponse withRoles(List<AgencyAllProjectRole> roles) {
        this.roles = roles;
        return this;
    }

    public ListAllProjectsPermissionsForAgencyResponse addRolesItem(AgencyAllProjectRole rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    public ListAllProjectsPermissionsForAgencyResponse withRoles(Consumer<List<AgencyAllProjectRole>> rolesSetter) {
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
    public List<AgencyAllProjectRole> getRoles() {
        return roles;
    }

    public void setRoles(List<AgencyAllProjectRole> roles) {
        this.roles = roles;
    }

    public ListAllProjectsPermissionsForAgencyResponse withLinks(LinksSelf links) {
        this.links = links;
        return this;
    }

    public ListAllProjectsPermissionsForAgencyResponse withLinks(Consumer<LinksSelf> linksSetter) {
        if (this.links == null) {
            this.links = new LinksSelf();
            linksSetter.accept(this.links);
        }

        return this;
    }

    /**
     * Get links
     * @return links
     */
    public LinksSelf getLinks() {
        return links;
    }

    public void setLinks(LinksSelf links) {
        this.links = links;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAllProjectsPermissionsForAgencyResponse listAllProjectsPermissionsForAgencyResponse =
            (ListAllProjectsPermissionsForAgencyResponse) o;
        return Objects.equals(this.roles, listAllProjectsPermissionsForAgencyResponse.roles)
            && Objects.equals(this.links, listAllProjectsPermissionsForAgencyResponse.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roles, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAllProjectsPermissionsForAgencyResponse {\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
