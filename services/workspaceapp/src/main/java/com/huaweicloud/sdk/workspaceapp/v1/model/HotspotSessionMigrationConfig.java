package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HotspotSessionMigrationConfig
 */
public class HotspotSessionMigrationConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hotspot_session_migration_enable")

    private Boolean hotspotSessionMigrationEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hotspot_exit_session_num")

    private Integer hotspotExitSessionNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "non_migrate_users")

    private List<UserInfo> nonMigrateUsers = null;

    public HotspotSessionMigrationConfig withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HotspotSessionMigrationConfig withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public HotspotSessionMigrationConfig withHotspotSessionMigrationEnable(Boolean hotspotSessionMigrationEnable) {
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

    public HotspotSessionMigrationConfig withHotspotExitSessionNum(Integer hotspotExitSessionNum) {
        this.hotspotExitSessionNum = hotspotExitSessionNum;
        return this;
    }

    /**
     * 热点时退出会话个数。
     * @return hotspotExitSessionNum
     */
    public Integer getHotspotExitSessionNum() {
        return hotspotExitSessionNum;
    }

    public void setHotspotExitSessionNum(Integer hotspotExitSessionNum) {
        this.hotspotExitSessionNum = hotspotExitSessionNum;
    }

    public HotspotSessionMigrationConfig withNonMigrateUsers(List<UserInfo> nonMigrateUsers) {
        this.nonMigrateUsers = nonMigrateUsers;
        return this;
    }

    public HotspotSessionMigrationConfig addNonMigrateUsersItem(UserInfo nonMigrateUsersItem) {
        if (this.nonMigrateUsers == null) {
            this.nonMigrateUsers = new ArrayList<>();
        }
        this.nonMigrateUsers.add(nonMigrateUsersItem);
        return this;
    }

    public HotspotSessionMigrationConfig withNonMigrateUsers(Consumer<List<UserInfo>> nonMigrateUsersSetter) {
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
        HotspotSessionMigrationConfig that = (HotspotSessionMigrationConfig) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.hotspotSessionMigrationEnable, that.hotspotSessionMigrationEnable)
            && Objects.equals(this.hotspotExitSessionNum, that.hotspotExitSessionNum)
            && Objects.equals(this.nonMigrateUsers, that.nonMigrateUsers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, projectId, hotspotSessionMigrationEnable, hotspotExitSessionNum, nonMigrateUsers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HotspotSessionMigrationConfig {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
