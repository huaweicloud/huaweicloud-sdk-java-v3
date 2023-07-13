package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RoleAssignmentBody
 */
public class RoleAssignmentBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private RoleUserAssignmentId user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private RoleAssignmentId role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private RoleGroupAssignmentId group;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency")

    private RoleAgencyAssignmentId agency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private RoleAssignmentScope scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_inherited")

    private Boolean isInherited;

    public RoleAssignmentBody withUser(RoleUserAssignmentId user) {
        this.user = user;
        return this;
    }

    public RoleAssignmentBody withUser(Consumer<RoleUserAssignmentId> userSetter) {
        if (this.user == null) {
            this.user = new RoleUserAssignmentId();
            userSetter.accept(this.user);
        }

        return this;
    }

    /**
     * Get user
     * @return user
     */
    public RoleUserAssignmentId getUser() {
        return user;
    }

    public void setUser(RoleUserAssignmentId user) {
        this.user = user;
    }

    public RoleAssignmentBody withRole(RoleAssignmentId role) {
        this.role = role;
        return this;
    }

    public RoleAssignmentBody withRole(Consumer<RoleAssignmentId> roleSetter) {
        if (this.role == null) {
            this.role = new RoleAssignmentId();
            roleSetter.accept(this.role);
        }

        return this;
    }

    /**
     * Get role
     * @return role
     */
    public RoleAssignmentId getRole() {
        return role;
    }

    public void setRole(RoleAssignmentId role) {
        this.role = role;
    }

    public RoleAssignmentBody withGroup(RoleGroupAssignmentId group) {
        this.group = group;
        return this;
    }

    public RoleAssignmentBody withGroup(Consumer<RoleGroupAssignmentId> groupSetter) {
        if (this.group == null) {
            this.group = new RoleGroupAssignmentId();
            groupSetter.accept(this.group);
        }

        return this;
    }

    /**
     * Get group
     * @return group
     */
    public RoleGroupAssignmentId getGroup() {
        return group;
    }

    public void setGroup(RoleGroupAssignmentId group) {
        this.group = group;
    }

    public RoleAssignmentBody withAgency(RoleAgencyAssignmentId agency) {
        this.agency = agency;
        return this;
    }

    public RoleAssignmentBody withAgency(Consumer<RoleAgencyAssignmentId> agencySetter) {
        if (this.agency == null) {
            this.agency = new RoleAgencyAssignmentId();
            agencySetter.accept(this.agency);
        }

        return this;
    }

    /**
     * Get agency
     * @return agency
     */
    public RoleAgencyAssignmentId getAgency() {
        return agency;
    }

    public void setAgency(RoleAgencyAssignmentId agency) {
        this.agency = agency;
    }

    public RoleAssignmentBody withScope(RoleAssignmentScope scope) {
        this.scope = scope;
        return this;
    }

    public RoleAssignmentBody withScope(Consumer<RoleAssignmentScope> scopeSetter) {
        if (this.scope == null) {
            this.scope = new RoleAssignmentScope();
            scopeSetter.accept(this.scope);
        }

        return this;
    }

    /**
     * Get scope
     * @return scope
     */
    public RoleAssignmentScope getScope() {
        return scope;
    }

    public void setScope(RoleAssignmentScope scope) {
        this.scope = scope;
    }

    public RoleAssignmentBody withIsInherited(Boolean isInherited) {
        this.isInherited = isInherited;
        return this;
    }

    /**
     * 是否基于所有项目授权。
     * @return isInherited
     */
    public Boolean getIsInherited() {
        return isInherited;
    }

    public void setIsInherited(Boolean isInherited) {
        this.isInherited = isInherited;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoleAssignmentBody that = (RoleAssignmentBody) obj;
        return Objects.equals(this.user, that.user) && Objects.equals(this.role, that.role)
            && Objects.equals(this.group, that.group) && Objects.equals(this.agency, that.agency)
            && Objects.equals(this.scope, that.scope) && Objects.equals(this.isInherited, that.isInherited);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, role, group, agency, scope, isInherited);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RoleAssignmentBody {\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    isInherited: ").append(toIndentedString(isInherited)).append("\n");
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
