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
public class ListUserGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_groups")

    private List<UserGroupInfo> userGroups = null;

    public ListUserGroupsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 满足条件的用户组总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListUserGroupsResponse withUserGroups(List<UserGroupInfo> userGroups) {
        this.userGroups = userGroups;
        return this;
    }

    public ListUserGroupsResponse addUserGroupsItem(UserGroupInfo userGroupsItem) {
        if (this.userGroups == null) {
            this.userGroups = new ArrayList<>();
        }
        this.userGroups.add(userGroupsItem);
        return this;
    }

    public ListUserGroupsResponse withUserGroups(Consumer<List<UserGroupInfo>> userGroupsSetter) {
        if (this.userGroups == null) {
            this.userGroups = new ArrayList<>();
        }
        userGroupsSetter.accept(this.userGroups);
        return this;
    }

    /**
     * 用户组列表。
     * @return userGroups
     */
    public List<UserGroupInfo> getUserGroups() {
        return userGroups;
    }

    public void setUserGroups(List<UserGroupInfo> userGroups) {
        this.userGroups = userGroups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListUserGroupsResponse that = (ListUserGroupsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.userGroups, that.userGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, userGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUserGroupsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    userGroups: ").append(toIndentedString(userGroups)).append("\n");
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
