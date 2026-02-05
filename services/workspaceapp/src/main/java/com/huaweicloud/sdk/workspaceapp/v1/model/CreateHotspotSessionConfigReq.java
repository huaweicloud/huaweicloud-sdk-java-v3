package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建热点会话迁移配置请求。
 */
public class CreateHotspotSessionConfigReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hotspot_session_migration_enable")

    private Boolean hotspotSessionMigrationEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hotspot_exit_session_num")

    private Integer hotspotExitSessionNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "non_migrate_users")

    private List<UserInfo> nonMigrateUsers = null;

    public CreateHotspotSessionConfigReq withHotspotSessionMigrationEnable(Boolean hotspotSessionMigrationEnable) {
        this.hotspotSessionMigrationEnable = hotspotSessionMigrationEnable;
        return this;
    }

    /**
     * 是否开启热点会话迁移。取值为： false：表示关闭。 true：表示开启。
     * @return hotspotSessionMigrationEnable
     */
    public Boolean getHotspotSessionMigrationEnable() {
        return hotspotSessionMigrationEnable;
    }

    public void setHotspotSessionMigrationEnable(Boolean hotspotSessionMigrationEnable) {
        this.hotspotSessionMigrationEnable = hotspotSessionMigrationEnable;
    }

    public CreateHotspotSessionConfigReq withHotspotExitSessionNum(Integer hotspotExitSessionNum) {
        this.hotspotExitSessionNum = hotspotExitSessionNum;
        return this;
    }

    /**
     * 热点时退出会话个数。
     * minimum: 0
     * maximum: 100
     * @return hotspotExitSessionNum
     */
    public Integer getHotspotExitSessionNum() {
        return hotspotExitSessionNum;
    }

    public void setHotspotExitSessionNum(Integer hotspotExitSessionNum) {
        this.hotspotExitSessionNum = hotspotExitSessionNum;
    }

    public CreateHotspotSessionConfigReq withNonMigrateUsers(List<UserInfo> nonMigrateUsers) {
        this.nonMigrateUsers = nonMigrateUsers;
        return this;
    }

    public CreateHotspotSessionConfigReq addNonMigrateUsersItem(UserInfo nonMigrateUsersItem) {
        if (this.nonMigrateUsers == null) {
            this.nonMigrateUsers = new ArrayList<>();
        }
        this.nonMigrateUsers.add(nonMigrateUsersItem);
        return this;
    }

    public CreateHotspotSessionConfigReq withNonMigrateUsers(Consumer<List<UserInfo>> nonMigrateUsersSetter) {
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
        CreateHotspotSessionConfigReq that = (CreateHotspotSessionConfigReq) obj;
        return Objects.equals(this.hotspotSessionMigrationEnable, that.hotspotSessionMigrationEnable)
            && Objects.equals(this.hotspotExitSessionNum, that.hotspotExitSessionNum)
            && Objects.equals(this.nonMigrateUsers, that.nonMigrateUsers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hotspotSessionMigrationEnable, hotspotExitSessionNum, nonMigrateUsers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateHotspotSessionConfigReq {\n");
        sb.append("    hotspotSessionMigrationEnable: ")
            .append(toIndentedString(hotspotSessionMigrationEnable))
            .append("\n");
        sb.append("    hotspotExitSessionNum: ").append(toIndentedString(hotspotExitSessionNum)).append("\n");
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
