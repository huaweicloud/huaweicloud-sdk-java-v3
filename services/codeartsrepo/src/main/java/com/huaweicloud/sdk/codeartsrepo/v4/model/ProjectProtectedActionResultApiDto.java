package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ProjectProtectedActionResultApiDto
 */
public class ProjectProtectedActionResultApiDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private List<UserBasicDto> users = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_teams")

    private List<UserTeamBasicDto> userTeams = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roles")

    private List<RoleBasicDto> roles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addition_switchers")

    private List<ForceActionEnableDto> additionSwitchers = null;

    public ProjectProtectedActionResultApiDto withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释：** 事件名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ProjectProtectedActionResultApiDto withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * **参数解释：** 是否启用。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public ProjectProtectedActionResultApiDto withUsers(List<UserBasicDto> users) {
        this.users = users;
        return this;
    }

    public ProjectProtectedActionResultApiDto addUsersItem(UserBasicDto usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public ProjectProtectedActionResultApiDto withUsers(Consumer<List<UserBasicDto>> usersSetter) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * **参数解释：** 用户列表。
     * @return users
     */
    public List<UserBasicDto> getUsers() {
        return users;
    }

    public void setUsers(List<UserBasicDto> users) {
        this.users = users;
    }

    public ProjectProtectedActionResultApiDto withUserTeams(List<UserTeamBasicDto> userTeams) {
        this.userTeams = userTeams;
        return this;
    }

    public ProjectProtectedActionResultApiDto addUserTeamsItem(UserTeamBasicDto userTeamsItem) {
        if (this.userTeams == null) {
            this.userTeams = new ArrayList<>();
        }
        this.userTeams.add(userTeamsItem);
        return this;
    }

    public ProjectProtectedActionResultApiDto withUserTeams(Consumer<List<UserTeamBasicDto>> userTeamsSetter) {
        if (this.userTeams == null) {
            this.userTeams = new ArrayList<>();
        }
        userTeamsSetter.accept(this.userTeams);
        return this;
    }

    /**
     * **参数解释：** 成员组列表。
     * @return userTeams
     */
    public List<UserTeamBasicDto> getUserTeams() {
        return userTeams;
    }

    public void setUserTeams(List<UserTeamBasicDto> userTeams) {
        this.userTeams = userTeams;
    }

    public ProjectProtectedActionResultApiDto withRoles(List<RoleBasicDto> roles) {
        this.roles = roles;
        return this;
    }

    public ProjectProtectedActionResultApiDto addRolesItem(RoleBasicDto rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    public ProjectProtectedActionResultApiDto withRoles(Consumer<List<RoleBasicDto>> rolesSetter) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        rolesSetter.accept(this.roles);
        return this;
    }

    /**
     * **参数解释：** 角色列表。
     * @return roles
     */
    public List<RoleBasicDto> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleBasicDto> roles) {
        this.roles = roles;
    }

    public ProjectProtectedActionResultApiDto withAdditionSwitchers(List<ForceActionEnableDto> additionSwitchers) {
        this.additionSwitchers = additionSwitchers;
        return this;
    }

    public ProjectProtectedActionResultApiDto addAdditionSwitchersItem(ForceActionEnableDto additionSwitchersItem) {
        if (this.additionSwitchers == null) {
            this.additionSwitchers = new ArrayList<>();
        }
        this.additionSwitchers.add(additionSwitchersItem);
        return this;
    }

    public ProjectProtectedActionResultApiDto withAdditionSwitchers(
        Consumer<List<ForceActionEnableDto>> additionSwitchersSetter) {
        if (this.additionSwitchers == null) {
            this.additionSwitchers = new ArrayList<>();
        }
        additionSwitchersSetter.accept(this.additionSwitchers);
        return this;
    }

    /**
     * **参数解释：** 操作选择列表。
     * @return additionSwitchers
     */
    public List<ForceActionEnableDto> getAdditionSwitchers() {
        return additionSwitchers;
    }

    public void setAdditionSwitchers(List<ForceActionEnableDto> additionSwitchers) {
        this.additionSwitchers = additionSwitchers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProjectProtectedActionResultApiDto that = (ProjectProtectedActionResultApiDto) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.users, that.users) && Objects.equals(this.userTeams, that.userTeams)
            && Objects.equals(this.roles, that.roles) && Objects.equals(this.additionSwitchers, that.additionSwitchers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, enable, users, userTeams, roles, additionSwitchers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectProtectedActionResultApiDto {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    userTeams: ").append(toIndentedString(userTeams)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("    additionSwitchers: ").append(toIndentedString(additionSwitchers)).append("\n");
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
