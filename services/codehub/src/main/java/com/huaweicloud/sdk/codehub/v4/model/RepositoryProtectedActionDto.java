package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RepositoryProtectedActionDto
 */
public class RepositoryProtectedActionDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private List<RepositoryUserDto> users = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_teams")

    private List<UserTeamBasicDto> userTeams = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roles")

    private List<BasicRoleDto> roles = null;

    public RepositoryProtectedActionDto withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释：** 事件名称。 **取值范围：** 不涉及。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public RepositoryProtectedActionDto withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * **参数解释：** 是否启用。 **取值范围：** - true，开启规则限制。 - false，未开启规则限制。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public RepositoryProtectedActionDto withUsers(List<RepositoryUserDto> users) {
        this.users = users;
        return this;
    }

    public RepositoryProtectedActionDto addUsersItem(RepositoryUserDto usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public RepositoryProtectedActionDto withUsers(Consumer<List<RepositoryUserDto>> usersSetter) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * **参数解释：** 白名单用户列表。 **取值范围：** 不涉及。
     * @return users
     */
    public List<RepositoryUserDto> getUsers() {
        return users;
    }

    public void setUsers(List<RepositoryUserDto> users) {
        this.users = users;
    }

    public RepositoryProtectedActionDto withUserTeams(List<UserTeamBasicDto> userTeams) {
        this.userTeams = userTeams;
        return this;
    }

    public RepositoryProtectedActionDto addUserTeamsItem(UserTeamBasicDto userTeamsItem) {
        if (this.userTeams == null) {
            this.userTeams = new ArrayList<>();
        }
        this.userTeams.add(userTeamsItem);
        return this;
    }

    public RepositoryProtectedActionDto withUserTeams(Consumer<List<UserTeamBasicDto>> userTeamsSetter) {
        if (this.userTeams == null) {
            this.userTeams = new ArrayList<>();
        }
        userTeamsSetter.accept(this.userTeams);
        return this;
    }

    /**
     * **参数解释：** 白名单用户组列表。 **取值范围：** 不涉及。
     * @return userTeams
     */
    public List<UserTeamBasicDto> getUserTeams() {
        return userTeams;
    }

    public void setUserTeams(List<UserTeamBasicDto> userTeams) {
        this.userTeams = userTeams;
    }

    public RepositoryProtectedActionDto withRoles(List<BasicRoleDto> roles) {
        this.roles = roles;
        return this;
    }

    public RepositoryProtectedActionDto addRolesItem(BasicRoleDto rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    public RepositoryProtectedActionDto withRoles(Consumer<List<BasicRoleDto>> rolesSetter) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        rolesSetter.accept(this.roles);
        return this;
    }

    /**
     * **参数解释：** 白名单角色列表。 **取值范围：** 不涉及。
     * @return roles
     */
    public List<BasicRoleDto> getRoles() {
        return roles;
    }

    public void setRoles(List<BasicRoleDto> roles) {
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
        RepositoryProtectedActionDto that = (RepositoryProtectedActionDto) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.users, that.users) && Objects.equals(this.userTeams, that.userTeams)
            && Objects.equals(this.roles, that.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, enable, users, userTeams, roles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryProtectedActionDto {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    userTeams: ").append(toIndentedString(userTeams)).append("\n");
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
