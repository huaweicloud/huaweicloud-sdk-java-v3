package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTokenVerificationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expires_time")

    private OffsetDateTime expiresTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")

    private ProjectDto project;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roles")

    private List<RoleDto> roles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private UserDto user;

    public ShowTokenVerificationResponse withExpiresTime(OffsetDateTime expiresTime) {
        this.expiresTime = expiresTime;
        return this;
    }

    /**
     * 过期时间
     * @return expiresTime
     */
    public OffsetDateTime getExpiresTime() {
        return expiresTime;
    }

    public void setExpiresTime(OffsetDateTime expiresTime) {
        this.expiresTime = expiresTime;
    }

    public ShowTokenVerificationResponse withProject(ProjectDto project) {
        this.project = project;
        return this;
    }

    public ShowTokenVerificationResponse withProject(Consumer<ProjectDto> projectSetter) {
        if (this.project == null) {
            this.project = new ProjectDto();
            projectSetter.accept(this.project);
        }

        return this;
    }

    /**
     * Get project
     * @return project
     */
    public ProjectDto getProject() {
        return project;
    }

    public void setProject(ProjectDto project) {
        this.project = project;
    }

    public ShowTokenVerificationResponse withRoles(List<RoleDto> roles) {
        this.roles = roles;
        return this;
    }

    public ShowTokenVerificationResponse addRolesItem(RoleDto rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    public ShowTokenVerificationResponse withRoles(Consumer<List<RoleDto>> rolesSetter) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        rolesSetter.accept(this.roles);
        return this;
    }

    /**
     * 角色
     * @return roles
     */
    public List<RoleDto> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleDto> roles) {
        this.roles = roles;
    }

    public ShowTokenVerificationResponse withUser(UserDto user) {
        this.user = user;
        return this;
    }

    public ShowTokenVerificationResponse withUser(Consumer<UserDto> userSetter) {
        if (this.user == null) {
            this.user = new UserDto();
            userSetter.accept(this.user);
        }

        return this;
    }

    /**
     * Get user
     * @return user
     */
    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTokenVerificationResponse showTokenVerificationResponse = (ShowTokenVerificationResponse) o;
        return Objects.equals(this.expiresTime, showTokenVerificationResponse.expiresTime)
            && Objects.equals(this.project, showTokenVerificationResponse.project)
            && Objects.equals(this.roles, showTokenVerificationResponse.roles)
            && Objects.equals(this.user, showTokenVerificationResponse.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expiresTime, project, roles, user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTokenVerificationResponse {\n");
        sb.append("    expiresTime: ").append(toIndentedString(expiresTime)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
