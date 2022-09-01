package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class CreateAgencyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roles")

    @JacksonXmlProperty(localName = "roles")

    private List<String> roles = null;

    public CreateAgencyRequest withRoles(List<String> roles) {
        this.roles = roles;
        return this;
    }

    public CreateAgencyRequest addRolesItem(String rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    public CreateAgencyRequest withRoles(Consumer<List<String>> rolesSetter) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        rolesSetter.accept(this.roles);
        return this;
    }

    /**
     * 角色目前只支持，obs_adm、dis_adm、ctable_adm、vpc_netadm、smn_adm、te_admin
     * @return roles
     */
    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
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
        CreateAgencyRequest createAgencyRequest = (CreateAgencyRequest) o;
        return Objects.equals(this.roles, createAgencyRequest.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAgencyRequest {\n");
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
