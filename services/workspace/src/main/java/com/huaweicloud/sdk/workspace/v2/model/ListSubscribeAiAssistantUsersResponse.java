package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSubscribeAiAssistantUsersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private List<SubscribeUserBasicInfo> users = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usergroups")

    private List<SubscribeUserGroupInfo> usergroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")

    private SubscribeAiAssistantListResponseProject project;

    public ListSubscribeAiAssistantUsersResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 订阅用户总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListSubscribeAiAssistantUsersResponse withUsers(List<SubscribeUserBasicInfo> users) {
        this.users = users;
        return this;
    }

    public ListSubscribeAiAssistantUsersResponse addUsersItem(SubscribeUserBasicInfo usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public ListSubscribeAiAssistantUsersResponse withUsers(Consumer<List<SubscribeUserBasicInfo>> usersSetter) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * 订阅用户列表。
     * @return users
     */
    public List<SubscribeUserBasicInfo> getUsers() {
        return users;
    }

    public void setUsers(List<SubscribeUserBasicInfo> users) {
        this.users = users;
    }

    public ListSubscribeAiAssistantUsersResponse withUsergroups(List<SubscribeUserGroupInfo> usergroups) {
        this.usergroups = usergroups;
        return this;
    }

    public ListSubscribeAiAssistantUsersResponse addUsergroupsItem(SubscribeUserGroupInfo usergroupsItem) {
        if (this.usergroups == null) {
            this.usergroups = new ArrayList<>();
        }
        this.usergroups.add(usergroupsItem);
        return this;
    }

    public ListSubscribeAiAssistantUsersResponse withUsergroups(
        Consumer<List<SubscribeUserGroupInfo>> usergroupsSetter) {
        if (this.usergroups == null) {
            this.usergroups = new ArrayList<>();
        }
        usergroupsSetter.accept(this.usergroups);
        return this;
    }

    /**
     * 订阅用户组列表。
     * @return usergroups
     */
    public List<SubscribeUserGroupInfo> getUsergroups() {
        return usergroups;
    }

    public void setUsergroups(List<SubscribeUserGroupInfo> usergroups) {
        this.usergroups = usergroups;
    }

    public ListSubscribeAiAssistantUsersResponse withProject(SubscribeAiAssistantListResponseProject project) {
        this.project = project;
        return this;
    }

    public ListSubscribeAiAssistantUsersResponse withProject(
        Consumer<SubscribeAiAssistantListResponseProject> projectSetter) {
        if (this.project == null) {
            this.project = new SubscribeAiAssistantListResponseProject();
            projectSetter.accept(this.project);
        }

        return this;
    }

    /**
     * Get project
     * @return project
     */
    public SubscribeAiAssistantListResponseProject getProject() {
        return project;
    }

    public void setProject(SubscribeAiAssistantListResponseProject project) {
        this.project = project;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSubscribeAiAssistantUsersResponse that = (ListSubscribeAiAssistantUsersResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.users, that.users)
            && Objects.equals(this.usergroups, that.usergroups) && Objects.equals(this.project, that.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, users, usergroups, project);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubscribeAiAssistantUsersResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    usergroups: ").append(toIndentedString(usergroups)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
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
