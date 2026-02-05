package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新不进行热点会话迁移用户请求体。
 */
public class UpdateNonMigrationUsersReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_type")

    private UpdateUserEnum updateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "non_migrate_users")

    private List<UserInfo> nonMigrateUsers = null;

    public UpdateNonMigrationUsersReq withUpdateType(UpdateUserEnum updateType) {
        this.updateType = updateType;
        return this;
    }

    /**
     * Get updateType
     * @return updateType
     */
    public UpdateUserEnum getUpdateType() {
        return updateType;
    }

    public void setUpdateType(UpdateUserEnum updateType) {
        this.updateType = updateType;
    }

    public UpdateNonMigrationUsersReq withNonMigrateUsers(List<UserInfo> nonMigrateUsers) {
        this.nonMigrateUsers = nonMigrateUsers;
        return this;
    }

    public UpdateNonMigrationUsersReq addNonMigrateUsersItem(UserInfo nonMigrateUsersItem) {
        if (this.nonMigrateUsers == null) {
            this.nonMigrateUsers = new ArrayList<>();
        }
        this.nonMigrateUsers.add(nonMigrateUsersItem);
        return this;
    }

    public UpdateNonMigrationUsersReq withNonMigrateUsers(Consumer<List<UserInfo>> nonMigrateUsersSetter) {
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
        UpdateNonMigrationUsersReq that = (UpdateNonMigrationUsersReq) obj;
        return Objects.equals(this.updateType, that.updateType)
            && Objects.equals(this.nonMigrateUsers, that.nonMigrateUsers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updateType, nonMigrateUsers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNonMigrationUsersReq {\n");
        sb.append("    updateType: ").append(toIndentedString(updateType)).append("\n");
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
