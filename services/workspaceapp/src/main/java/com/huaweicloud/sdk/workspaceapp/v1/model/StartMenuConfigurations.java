package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * “开始菜单”文件夹重定向配置
 */
public class StartMenuConfigurations {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_menu_status")

    private Integer startMenuStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_menu_redirection_type")

    private Integer startMenuRedirectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_menu_storage_path")

    private String startMenuStoragePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_menu_relative_path")

    private String startMenuRelativePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_menu_exclusive_rights")

    private Integer startMenuExclusiveRights;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_menu_move_contents")

    private Integer startMenuMoveContents;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_menu_move_content_on_policy_removal")

    private Integer startMenuMoveContentOnPolicyRemoval;

    public StartMenuConfigurations withStartMenuStatus(Integer startMenuStatus) {
        this.startMenuStatus = startMenuStatus;
        return this;
    }

    /**
     * 配置文件夹重定向状态： 0: 未选取 1: 已选取
     * minimum: 0
     * maximum: 1
     * @return startMenuStatus
     */
    public Integer getStartMenuStatus() {
        return startMenuStatus;
    }

    public void setStartMenuStatus(Integer startMenuStatus) {
        this.startMenuStatus = startMenuStatus;
    }

    public StartMenuConfigurations withStartMenuRedirectionType(Integer startMenuRedirectionType) {
        this.startMenuRedirectionType = startMenuRedirectionType;
        return this;
    }

    /**
     * 配置文件夹重定向类型： 0: 远程 1: 本地
     * minimum: 0
     * maximum: 1
     * @return startMenuRedirectionType
     */
    public Integer getStartMenuRedirectionType() {
        return startMenuRedirectionType;
    }

    public void setStartMenuRedirectionType(Integer startMenuRedirectionType) {
        this.startMenuRedirectionType = startMenuRedirectionType;
    }

    public StartMenuConfigurations withStartMenuStoragePath(String startMenuStoragePath) {
        this.startMenuStoragePath = startMenuStoragePath;
        return this;
    }

    /**
     * 文件夹重定向(v2)用户存储路径。
     * @return startMenuStoragePath
     */
    public String getStartMenuStoragePath() {
        return startMenuStoragePath;
    }

    public void setStartMenuStoragePath(String startMenuStoragePath) {
        this.startMenuStoragePath = startMenuStoragePath;
    }

    public StartMenuConfigurations withStartMenuRelativePath(String startMenuRelativePath) {
        this.startMenuRelativePath = startMenuRelativePath;
        return this;
    }

    /**
     * 目标文件夹位置。
     * @return startMenuRelativePath
     */
    public String getStartMenuRelativePath() {
        return startMenuRelativePath;
    }

    public void setStartMenuRelativePath(String startMenuRelativePath) {
        this.startMenuRelativePath = startMenuRelativePath;
    }

    public StartMenuConfigurations withStartMenuExclusiveRights(Integer startMenuExclusiveRights) {
        this.startMenuExclusiveRights = startMenuExclusiveRights;
        return this;
    }

    /**
     * 是否开启用户对该文件夹的独占控制权限： 0: 禁用 1: 开启
     * minimum: 0
     * maximum: 1
     * @return startMenuExclusiveRights
     */
    public Integer getStartMenuExclusiveRights() {
        return startMenuExclusiveRights;
    }

    public void setStartMenuExclusiveRights(Integer startMenuExclusiveRights) {
        this.startMenuExclusiveRights = startMenuExclusiveRights;
    }

    public StartMenuConfigurations withStartMenuMoveContents(Integer startMenuMoveContents) {
        this.startMenuMoveContents = startMenuMoveContents;
        return this;
    }

    /**
     * 启用文件夹重定向策略时，是否将现有内容移动到新位置： 0: 否 1: 是
     * minimum: 0
     * maximum: 1
     * @return startMenuMoveContents
     */
    public Integer getStartMenuMoveContents() {
        return startMenuMoveContents;
    }

    public void setStartMenuMoveContents(Integer startMenuMoveContents) {
        this.startMenuMoveContents = startMenuMoveContents;
    }

    public StartMenuConfigurations withStartMenuMoveContentOnPolicyRemoval(
        Integer startMenuMoveContentOnPolicyRemoval) {
        this.startMenuMoveContentOnPolicyRemoval = startMenuMoveContentOnPolicyRemoval;
        return this;
    }

    /**
     * 禁用或删除策略时，是否将内容移回本地用户配置文件位置： 0: 否 1: 是
     * minimum: 0
     * maximum: 1
     * @return startMenuMoveContentOnPolicyRemoval
     */
    public Integer getStartMenuMoveContentOnPolicyRemoval() {
        return startMenuMoveContentOnPolicyRemoval;
    }

    public void setStartMenuMoveContentOnPolicyRemoval(Integer startMenuMoveContentOnPolicyRemoval) {
        this.startMenuMoveContentOnPolicyRemoval = startMenuMoveContentOnPolicyRemoval;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartMenuConfigurations that = (StartMenuConfigurations) obj;
        return Objects.equals(this.startMenuStatus, that.startMenuStatus)
            && Objects.equals(this.startMenuRedirectionType, that.startMenuRedirectionType)
            && Objects.equals(this.startMenuStoragePath, that.startMenuStoragePath)
            && Objects.equals(this.startMenuRelativePath, that.startMenuRelativePath)
            && Objects.equals(this.startMenuExclusiveRights, that.startMenuExclusiveRights)
            && Objects.equals(this.startMenuMoveContents, that.startMenuMoveContents)
            && Objects.equals(this.startMenuMoveContentOnPolicyRemoval, that.startMenuMoveContentOnPolicyRemoval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startMenuStatus,
            startMenuRedirectionType,
            startMenuStoragePath,
            startMenuRelativePath,
            startMenuExclusiveRights,
            startMenuMoveContents,
            startMenuMoveContentOnPolicyRemoval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartMenuConfigurations {\n");
        sb.append("    startMenuStatus: ").append(toIndentedString(startMenuStatus)).append("\n");
        sb.append("    startMenuRedirectionType: ").append(toIndentedString(startMenuRedirectionType)).append("\n");
        sb.append("    startMenuStoragePath: ").append(toIndentedString(startMenuStoragePath)).append("\n");
        sb.append("    startMenuRelativePath: ").append(toIndentedString(startMenuRelativePath)).append("\n");
        sb.append("    startMenuExclusiveRights: ").append(toIndentedString(startMenuExclusiveRights)).append("\n");
        sb.append("    startMenuMoveContents: ").append(toIndentedString(startMenuMoveContents)).append("\n");
        sb.append("    startMenuMoveContentOnPolicyRemoval: ")
            .append(toIndentedString(startMenuMoveContentOnPolicyRemoval))
            .append("\n");
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
