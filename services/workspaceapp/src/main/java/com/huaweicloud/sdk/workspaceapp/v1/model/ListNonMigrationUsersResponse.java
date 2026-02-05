package com.huaweicloud.sdk.workspaceapp.v1.model;

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
public class ListNonMigrationUsersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "non_migrate_users")

    private List<UserInfo> nonMigrateUsers = null;

    public ListNonMigrationUsersResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 热点时不迁移用户id总数量。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListNonMigrationUsersResponse withNonMigrateUsers(List<UserInfo> nonMigrateUsers) {
        this.nonMigrateUsers = nonMigrateUsers;
        return this;
    }

    public ListNonMigrationUsersResponse addNonMigrateUsersItem(UserInfo nonMigrateUsersItem) {
        if (this.nonMigrateUsers == null) {
            this.nonMigrateUsers = new ArrayList<>();
        }
        this.nonMigrateUsers.add(nonMigrateUsersItem);
        return this;
    }

    public ListNonMigrationUsersResponse withNonMigrateUsers(Consumer<List<UserInfo>> nonMigrateUsersSetter) {
        if (this.nonMigrateUsers == null) {
            this.nonMigrateUsers = new ArrayList<>();
        }
        nonMigrateUsersSetter.accept(this.nonMigrateUsers);
        return this;
    }

    /**
     * 热点时不迁移用户id列表。
     * @return nonMigrateUsers
     */
    public List<UserInfo> getNonMigrateUsers() {
        return nonMigrateUsers;
    }

    public void setNonMigrateUsers(List<UserInfo> nonMigrateUsers) {
        this.nonMigrateUsers = nonMigrateUsers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNonMigrationUsersResponse that = (ListNonMigrationUsersResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.nonMigrateUsers, that.nonMigrateUsers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, nonMigrateUsers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNonMigrationUsersResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    nonMigrateUsers: ").append(toIndentedString(nonMigrateUsers)).append("\n");
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
